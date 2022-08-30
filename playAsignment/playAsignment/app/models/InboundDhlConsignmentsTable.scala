package models
// AUTO-GENERATED Slick data model for table InboundDhlConsignments
trait InboundDhlConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundDhlConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param missedDeliveryCardNumber Database column missed_delivery_card_number SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param contactName Database column contact_name SqlType(text)
   *  @param mobileNumber Database column mobile_number SqlType(text)
   *  @param emailAddress Database column email_address SqlType(text) */
  case class InboundDhlConsignmentsRow(id: Long, storeDlb: String, missedDeliveryCardNumber: String, consignmentNumber: String, contactName: String, mobileNumber: String, emailAddress: String)
  /** GetResult implicit for fetching InboundDhlConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundDhlConsignmentsRow(implicit e0: GR[Long], e1: GR[String]): GR[InboundDhlConsignmentsRow] = GR{
    prs => import prs._
    InboundDhlConsignmentsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table inbound_dhl_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundDhlConsignments(_tableTag: Tag) extends profile.api.Table[InboundDhlConsignmentsRow](_tableTag, "inbound_dhl_consignments") {
    def * = (id, storeDlb, missedDeliveryCardNumber, consignmentNumber, contactName, mobileNumber, emailAddress) <> (InboundDhlConsignmentsRow.tupled, InboundDhlConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(storeDlb), Rep.Some(missedDeliveryCardNumber), Rep.Some(consignmentNumber), Rep.Some(contactName), Rep.Some(mobileNumber), Rep.Some(emailAddress))).shaped.<>({r=>import r._; _1.map(_=> InboundDhlConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column missed_delivery_card_number SqlType(text) */
    val missedDeliveryCardNumber: Rep[String] = column[String]("missed_delivery_card_number")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column mobile_number SqlType(text) */
    val mobileNumber: Rep[String] = column[String]("mobile_number")
    /** Database column email_address SqlType(text) */
    val emailAddress: Rep[String] = column[String]("email_address")

    /** Uniqueness Index over (consignmentNumber) (database name inbound_dhl_consignments_consignment_number_key) */
    val index1 = index("inbound_dhl_consignments_consignment_number_key", consignmentNumber, unique=true)
  }
  /** Collection-like TableQuery object for table InboundDhlConsignments */
  lazy val InboundDhlConsignments = new TableQuery(tag => new InboundDhlConsignments(tag))
}
