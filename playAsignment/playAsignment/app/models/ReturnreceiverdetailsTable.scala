package models
// AUTO-GENERATED Slick data model for table Returnreceiverdetails
trait ReturnreceiverdetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Returnreceiverdetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param couriercode Database column couriercode SqlType(text)
   *  @param destinationFirstName Database column destination_first_name SqlType(text)
   *  @param destinationLastName Database column destination_last_name SqlType(text)
   *  @param destinationIsBusiness Database column destination_is_business SqlType(bool)
   *  @param destinationCompanyName Database column destination_company_name SqlType(text), Default(None)
   *  @param destinationEmail Database column destination_email SqlType(text)
   *  @param destinationAddress1 Database column destination_address_1 SqlType(text)
   *  @param destinationAddress2 Database column destination_address_2 SqlType(text), Default(None)
   *  @param destinationSuburb Database column destination_suburb SqlType(text)
   *  @param destinationState Database column destination_state SqlType(text)
   *  @param destinationPostcode Database column destination_postcode SqlType(text)
   *  @param destinationPhone Database column destination_phone SqlType(text)
   *  @param destinationCountry Database column destination_country SqlType(text), Default(None) */
  case class ReturnreceiverdetailsRow(id: Long, couriercode: String, destinationFirstName: String, destinationLastName: String, destinationIsBusiness: Boolean, destinationCompanyName: Option[String] = None, destinationEmail: String, destinationAddress1: String, destinationAddress2: Option[String] = None, destinationSuburb: String, destinationState: String, destinationPostcode: String, destinationPhone: String, destinationCountry: Option[String] = None)
  /** GetResult implicit for fetching ReturnreceiverdetailsRow objects using plain SQL queries */
  implicit def GetResultReturnreceiverdetailsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[Option[String]]): GR[ReturnreceiverdetailsRow] = GR{
    prs => import prs._
    ReturnreceiverdetailsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<?[String]))
  }
  /** Table description of table returnreceiverdetails. Objects of this class serve as prototypes for rows in queries. */
  class Returnreceiverdetails(_tableTag: Tag) extends profile.api.Table[ReturnreceiverdetailsRow](_tableTag, Some("ecommerce"), "returnreceiverdetails") {
    def * = (id, couriercode, destinationFirstName, destinationLastName, destinationIsBusiness, destinationCompanyName, destinationEmail, destinationAddress1, destinationAddress2, destinationSuburb, destinationState, destinationPostcode, destinationPhone, destinationCountry) <> (ReturnreceiverdetailsRow.tupled, ReturnreceiverdetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(couriercode), Rep.Some(destinationFirstName), Rep.Some(destinationLastName), Rep.Some(destinationIsBusiness), destinationCompanyName, Rep.Some(destinationEmail), Rep.Some(destinationAddress1), destinationAddress2, Rep.Some(destinationSuburb), Rep.Some(destinationState), Rep.Some(destinationPostcode), Rep.Some(destinationPhone), destinationCountry)).shaped.<>({r=>import r._; _1.map(_=> ReturnreceiverdetailsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9, _10.get, _11.get, _12.get, _13.get, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column couriercode SqlType(text) */
    val couriercode: Rep[String] = column[String]("couriercode")
    /** Database column destination_first_name SqlType(text) */
    val destinationFirstName: Rep[String] = column[String]("destination_first_name")
    /** Database column destination_last_name SqlType(text) */
    val destinationLastName: Rep[String] = column[String]("destination_last_name")
    /** Database column destination_is_business SqlType(bool) */
    val destinationIsBusiness: Rep[Boolean] = column[Boolean]("destination_is_business")
    /** Database column destination_company_name SqlType(text), Default(None) */
    val destinationCompanyName: Rep[Option[String]] = column[Option[String]]("destination_company_name", O.Default(None))
    /** Database column destination_email SqlType(text) */
    val destinationEmail: Rep[String] = column[String]("destination_email")
    /** Database column destination_address_1 SqlType(text) */
    val destinationAddress1: Rep[String] = column[String]("destination_address_1")
    /** Database column destination_address_2 SqlType(text), Default(None) */
    val destinationAddress2: Rep[Option[String]] = column[Option[String]]("destination_address_2", O.Default(None))
    /** Database column destination_suburb SqlType(text) */
    val destinationSuburb: Rep[String] = column[String]("destination_suburb")
    /** Database column destination_state SqlType(text) */
    val destinationState: Rep[String] = column[String]("destination_state")
    /** Database column destination_postcode SqlType(text) */
    val destinationPostcode: Rep[String] = column[String]("destination_postcode")
    /** Database column destination_phone SqlType(text) */
    val destinationPhone: Rep[String] = column[String]("destination_phone")
    /** Database column destination_country SqlType(text), Default(None) */
    val destinationCountry: Rep[Option[String]] = column[Option[String]]("destination_country", O.Default(None))
  }
  /** Collection-like TableQuery object for table Returnreceiverdetails */
  lazy val Returnreceiverdetails = new TableQuery(tag => new Returnreceiverdetails(tag))
}
