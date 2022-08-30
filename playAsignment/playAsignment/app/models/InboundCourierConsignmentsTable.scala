package models
// AUTO-GENERATED Slick data model for table InboundCourierConsignments
trait InboundCourierConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundCourierConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param message Database column message SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param locationCode Database column location_code SqlType(text), Default(None)
   *  @param companyName Database column company_name SqlType(text), Default(None)
   *  @param contactName Database column contact_name SqlType(text), Default(None)
   *  @param mobileNumber Database column mobile_number SqlType(text), Default(None)
   *  @param emailAddress Database column email_address SqlType(text), Default(None)
   *  @param street1 Database column street1 SqlType(text), Default(None)
   *  @param street2 Database column street2 SqlType(text), Default(None)
   *  @param city Database column city SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param postcode Database column postcode SqlType(text), Default(None)
   *  @param dropped Database column dropped SqlType(bool) */
  case class InboundCourierConsignmentsRow(id: Long, message: Long, consignmentNumber: String, locationCode: Option[String] = None, companyName: Option[String] = None, contactName: Option[String] = None, mobileNumber: Option[String] = None, emailAddress: Option[String] = None, street1: Option[String] = None, street2: Option[String] = None, city: Option[String] = None, state: Option[String] = None, postcode: Option[String] = None, dropped: Boolean)
  /** GetResult implicit for fetching InboundCourierConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundCourierConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Boolean]): GR[InboundCourierConsignmentsRow] = GR{
    prs => import prs._
    InboundCourierConsignmentsRow.tupled((<<[Long], <<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Boolean]))
  }
  /** Table description of table inbound_courier_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundCourierConsignments(_tableTag: Tag) extends profile.api.Table[InboundCourierConsignmentsRow](_tableTag, "inbound_courier_consignments") {
    def * = (id, message, consignmentNumber, locationCode, companyName, contactName, mobileNumber, emailAddress, street1, street2, city, state, postcode, dropped) <> (InboundCourierConsignmentsRow.tupled, InboundCourierConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(message), Rep.Some(consignmentNumber), locationCode, companyName, contactName, mobileNumber, emailAddress, street1, street2, city, state, postcode, Rep.Some(dropped))).shaped.<>({r=>import r._; _1.map(_=> InboundCourierConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column message SqlType(int8) */
    val message: Rep[Long] = column[Long]("message")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column location_code SqlType(text), Default(None) */
    val locationCode: Rep[Option[String]] = column[Option[String]]("location_code", O.Default(None))
    /** Database column company_name SqlType(text), Default(None) */
    val companyName: Rep[Option[String]] = column[Option[String]]("company_name", O.Default(None))
    /** Database column contact_name SqlType(text), Default(None) */
    val contactName: Rep[Option[String]] = column[Option[String]]("contact_name", O.Default(None))
    /** Database column mobile_number SqlType(text), Default(None) */
    val mobileNumber: Rep[Option[String]] = column[Option[String]]("mobile_number", O.Default(None))
    /** Database column email_address SqlType(text), Default(None) */
    val emailAddress: Rep[Option[String]] = column[Option[String]]("email_address", O.Default(None))
    /** Database column street1 SqlType(text), Default(None) */
    val street1: Rep[Option[String]] = column[Option[String]]("street1", O.Default(None))
    /** Database column street2 SqlType(text), Default(None) */
    val street2: Rep[Option[String]] = column[Option[String]]("street2", O.Default(None))
    /** Database column city SqlType(text), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column postcode SqlType(text), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Default(None))
    /** Database column dropped SqlType(bool) */
    val dropped: Rep[Boolean] = column[Boolean]("dropped")

    /** Foreign key referencing InboundCourierMessages (database name inbound_courier_consignments_message_fkey) */
    lazy val inboundCourierMessagesFk = foreignKey("inbound_courier_consignments_message_fkey", message, InboundCourierMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundCourierConsignments */
  lazy val InboundCourierConsignments = new TableQuery(tag => new InboundCourierConsignments(tag))
}
