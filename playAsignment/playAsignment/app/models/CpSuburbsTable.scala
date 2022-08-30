package models
// AUTO-GENERATED Slick data model for table CpSuburbs
trait CpSuburbsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CpSuburbs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param suburb Database column suburb SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param postcode Database column postcode SqlType(text) */
  case class CpSuburbsRow(id: Long, suburb: String, state: String, postcode: String)
  /** GetResult implicit for fetching CpSuburbsRow objects using plain SQL queries */
  implicit def GetResultCpSuburbsRow(implicit e0: GR[Long], e1: GR[String]): GR[CpSuburbsRow] = GR{
    prs => import prs._
    CpSuburbsRow.tupled((<<[Long], <<[String], <<[String], <<[String]))
  }
  /** Table description of table cp_suburbs. Objects of this class serve as prototypes for rows in queries. */
  class CpSuburbs(_tableTag: Tag) extends profile.api.Table[CpSuburbsRow](_tableTag, "cp_suburbs") {
    def * = (id, suburb, state, postcode) <> (CpSuburbsRow.tupled, CpSuburbsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(suburb), Rep.Some(state), Rep.Some(postcode))).shaped.<>({r=>import r._; _1.map(_=> CpSuburbsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column suburb SqlType(text) */
    val suburb: Rep[String] = column[String]("suburb")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")

    /** Index over (suburb) (database name suburb) */
    val index1 = index("suburb", suburb)
  }
  /** Collection-like TableQuery object for table CpSuburbs */
  lazy val CpSuburbs = new TableQuery(tag => new CpSuburbs(tag))
}
