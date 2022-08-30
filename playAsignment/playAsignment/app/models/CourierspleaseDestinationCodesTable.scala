package models
// AUTO-GENERATED Slick data model for table CourierspleaseDestinationCodes
trait CourierspleaseDestinationCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseDestinationCodes
   *  @param postcode Database column postcode SqlType(text)
   *  @param origin Database column origin SqlType(text)
   *  @param code Database column code SqlType(text) */
  case class CourierspleaseDestinationCodesRow(postcode: String, origin: String, code: String)
  /** GetResult implicit for fetching CourierspleaseDestinationCodesRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseDestinationCodesRow(implicit e0: GR[String]): GR[CourierspleaseDestinationCodesRow] = GR{
    prs => import prs._
    CourierspleaseDestinationCodesRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table couriersplease_destination_codes. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseDestinationCodes(_tableTag: Tag) extends profile.api.Table[CourierspleaseDestinationCodesRow](_tableTag, "couriersplease_destination_codes") {
    def * = (postcode, origin, code) <> (CourierspleaseDestinationCodesRow.tupled, CourierspleaseDestinationCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(postcode), Rep.Some(origin), Rep.Some(code))).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseDestinationCodesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column origin SqlType(text) */
    val origin: Rep[String] = column[String]("origin")
    /** Database column code SqlType(text) */
    val code: Rep[String] = column[String]("code")

    /** Primary key of CourierspleaseDestinationCodes (database name couriersplease_destination_codes_pkey) */
    val pk = primaryKey("couriersplease_destination_codes_pkey", (postcode, origin))

    /** Foreign key referencing CourierspleaseStates (database name couriersplease_destination_codes_origin_fkey) */
    lazy val courierspleaseStatesFk = foreignKey("couriersplease_destination_codes_origin_fkey", origin, CourierspleaseStates)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierspleaseDestinationCodes */
  lazy val CourierspleaseDestinationCodes = new TableQuery(tag => new CourierspleaseDestinationCodes(tag))
}
