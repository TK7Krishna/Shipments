package models
// AUTO-GENERATED Slick data model for table CourierspleaseLocations
trait CourierspleaseLocationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseLocations
   *  @param postcode Database column postcode SqlType(text)
   *  @param locality Database column locality SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param code Database column code SqlType(text) */
  case class CourierspleaseLocationsRow(postcode: String, locality: String, state: String, code: String)
  /** GetResult implicit for fetching CourierspleaseLocationsRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseLocationsRow(implicit e0: GR[String]): GR[CourierspleaseLocationsRow] = GR{
    prs => import prs._
    CourierspleaseLocationsRow.tupled((<<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table couriersplease_locations. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseLocations(_tableTag: Tag) extends profile.api.Table[CourierspleaseLocationsRow](_tableTag, "couriersplease_locations") {
    def * = (postcode, locality, state, code) <> (CourierspleaseLocationsRow.tupled, CourierspleaseLocationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(postcode), Rep.Some(locality), Rep.Some(state), Rep.Some(code))).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseLocationsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column locality SqlType(text) */
    val locality: Rep[String] = column[String]("locality")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column code SqlType(text) */
    val code: Rep[String] = column[String]("code")

    /** Foreign key referencing CourierspleaseStates (database name couriersplease_locations_state_fkey) */
    lazy val courierspleaseStatesFk = foreignKey("couriersplease_locations_state_fkey", state, CourierspleaseStates)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierspleaseLocations */
  lazy val CourierspleaseLocations = new TableQuery(tag => new CourierspleaseLocations(tag))
}
