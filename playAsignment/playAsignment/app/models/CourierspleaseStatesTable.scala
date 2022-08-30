package models
// AUTO-GENERATED Slick data model for table CourierspleaseStates
trait CourierspleaseStatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseStates
   *  @param code Database column code SqlType(text), PrimaryKey */
  case class CourierspleaseStatesRow(code: String)
  /** GetResult implicit for fetching CourierspleaseStatesRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseStatesRow(implicit e0: GR[String]): GR[CourierspleaseStatesRow] = GR{
    prs => import prs._
    CourierspleaseStatesRow(<<[String])
  }
  /** Table description of table couriersplease_states. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseStates(_tableTag: Tag) extends profile.api.Table[CourierspleaseStatesRow](_tableTag, "couriersplease_states") {
    def * = code <> (CourierspleaseStatesRow, CourierspleaseStatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(code)).shaped.<>(r => r.map(_=> CourierspleaseStatesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column code SqlType(text), PrimaryKey */
    val code: Rep[String] = column[String]("code", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table CourierspleaseStates */
  lazy val CourierspleaseStates = new TableQuery(tag => new CourierspleaseStates(tag))
}
