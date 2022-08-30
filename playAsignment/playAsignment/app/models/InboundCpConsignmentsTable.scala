package models
// AUTO-GENERATED Slick data model for table InboundCpConsignments
trait InboundCpConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundCpConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courier Database column courier SqlType(text)
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param missedDeliveryCardNumber Database column missed_delivery_card_number SqlType(text), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param contactName Database column contact_name SqlType(text)
   *  @param mobileNumber Database column mobile_number SqlType(text)
   *  @param emailAddress Database column email_address SqlType(text) */
  case class InboundCpConsignmentsRow(id: Long, courier: String, storeDlb: String, missedDeliveryCardNumber: Option[String] = None, consignmentNumber: String, contactName: String, mobileNumber: String, emailAddress: String)
  /** GetResult implicit for fetching InboundCpConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundCpConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[InboundCpConsignmentsRow] = GR{
    prs => import prs._
    InboundCpConsignmentsRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table inbound_cp_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundCpConsignments(_tableTag: Tag) extends profile.api.Table[InboundCpConsignmentsRow](_tableTag, "inbound_cp_consignments") {
    def * = (id, courier, storeDlb, missedDeliveryCardNumber, consignmentNumber, contactName, mobileNumber, emailAddress) <> (InboundCpConsignmentsRow.tupled, InboundCpConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courier), Rep.Some(storeDlb), missedDeliveryCardNumber, Rep.Some(consignmentNumber), Rep.Some(contactName), Rep.Some(mobileNumber), Rep.Some(emailAddress))).shaped.<>({r=>import r._; _1.map(_=> InboundCpConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column missed_delivery_card_number SqlType(text), Default(None) */
    val missedDeliveryCardNumber: Rep[Option[String]] = column[Option[String]]("missed_delivery_card_number", O.Default(None))
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column mobile_number SqlType(text) */
    val mobileNumber: Rep[String] = column[String]("mobile_number")
    /** Database column email_address SqlType(text) */
    val emailAddress: Rep[String] = column[String]("email_address")

    /** Uniqueness Index over (consignmentNumber) (database name inbound_cp_consignments_consignment_number_key) */
    val index1 = index("inbound_cp_consignments_consignment_number_key", consignmentNumber, unique=true)
  }
  /** Collection-like TableQuery object for table InboundCpConsignments */
  lazy val InboundCpConsignments = new TableQuery(tag => new InboundCpConsignments(tag))
}
