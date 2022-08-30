package models
// AUTO-GENERATED Slick data model for table CourierspleaseNetworkCustomCodes
trait CourierspleaseNetworkCustomCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseNetworkCustomCodes
   *  @param postcode Database column postcode SqlType(text)
   *  @param locality Database column locality SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param code Database column code SqlType(text)
   *  @param subcontractorEmail Database column subcontractor_email SqlType(text), Default(None)
   *  @param hubbedReferenceCode Database column hubbed_reference_code SqlType(text) */
  case class CourierspleaseNetworkCustomCodesRow(postcode: String, locality: String, state: String, code: String, subcontractorEmail: Option[String] = None, hubbedReferenceCode: String)
  /** GetResult implicit for fetching CourierspleaseNetworkCustomCodesRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseNetworkCustomCodesRow(implicit e0: GR[String], e1: GR[Option[String]]): GR[CourierspleaseNetworkCustomCodesRow] = GR{
    prs => import prs._
    CourierspleaseNetworkCustomCodesRow.tupled((<<[String], <<[String], <<[String], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table couriersplease_network_custom_codes. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseNetworkCustomCodes(_tableTag: Tag) extends profile.api.Table[CourierspleaseNetworkCustomCodesRow](_tableTag, "couriersplease_network_custom_codes") {
    def * = (postcode, locality, state, code, subcontractorEmail, hubbedReferenceCode) <> (CourierspleaseNetworkCustomCodesRow.tupled, CourierspleaseNetworkCustomCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(postcode), Rep.Some(locality), Rep.Some(state), Rep.Some(code), subcontractorEmail, Rep.Some(hubbedReferenceCode))).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseNetworkCustomCodesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column locality SqlType(text) */
    val locality: Rep[String] = column[String]("locality")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column code SqlType(text) */
    val code: Rep[String] = column[String]("code")
    /** Database column subcontractor_email SqlType(text), Default(None) */
    val subcontractorEmail: Rep[Option[String]] = column[Option[String]]("subcontractor_email", O.Default(None))
    /** Database column hubbed_reference_code SqlType(text) */
    val hubbedReferenceCode: Rep[String] = column[String]("hubbed_reference_code")
  }
  /** Collection-like TableQuery object for table CourierspleaseNetworkCustomCodes */
  lazy val CourierspleaseNetworkCustomCodes = new TableQuery(tag => new CourierspleaseNetworkCustomCodes(tag))
}
