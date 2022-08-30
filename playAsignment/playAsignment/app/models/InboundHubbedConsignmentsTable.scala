package models
// AUTO-GENERATED Slick data model for table InboundHubbedConsignments
trait InboundHubbedConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundHubbedConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param missedDeliveryCardNumber Database column missed_delivery_card_number SqlType(text), Default(Some())
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param contactName Database column contact_name SqlType(text)
   *  @param mobileNumber Database column mobile_number SqlType(text), Default(None)
   *  @param emailAddress Database column email_address SqlType(text)
   *  @param publicConsignmentId Database column public_consignment_id SqlType(int8), Default(None)
   *  @param consignmenttype Database column consignmenttype SqlType(int8), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None) */
  case class InboundHubbedConsignmentsRow(id: Long, storeDlb: String, missedDeliveryCardNumber: Option[String] = Some(""), consignmentNumber: String, contactName: String, mobileNumber: Option[String] = None, emailAddress: String, publicConsignmentId: Option[Long] = None, consignmenttype: Option[Long] = None, hubbedUserId: Option[Long] = None)
  /** GetResult implicit for fetching InboundHubbedConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundHubbedConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]]): GR[InboundHubbedConsignmentsRow] = GR{
    prs => import prs._
    InboundHubbedConsignmentsRow.tupled((<<[Long], <<[String], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<?[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table inbound_hubbed_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundHubbedConsignments(_tableTag: Tag) extends profile.api.Table[InboundHubbedConsignmentsRow](_tableTag, Some("standard_apis"), "inbound_hubbed_consignments") {
    def * = (id, storeDlb, missedDeliveryCardNumber, consignmentNumber, contactName, mobileNumber, emailAddress, publicConsignmentId, consignmenttype, hubbedUserId) <> (InboundHubbedConsignmentsRow.tupled, InboundHubbedConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(storeDlb), missedDeliveryCardNumber, Rep.Some(consignmentNumber), Rep.Some(contactName), mobileNumber, Rep.Some(emailAddress), publicConsignmentId, consignmenttype, hubbedUserId)).shaped.<>({r=>import r._; _1.map(_=> InboundHubbedConsignmentsRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7.get, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column missed_delivery_card_number SqlType(text), Default(Some()) */
    val missedDeliveryCardNumber: Rep[Option[String]] = column[Option[String]]("missed_delivery_card_number", O.Default(Some("")))
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column mobile_number SqlType(text), Default(None) */
    val mobileNumber: Rep[Option[String]] = column[Option[String]]("mobile_number", O.Default(None))
    /** Database column email_address SqlType(text) */
    val emailAddress: Rep[String] = column[String]("email_address")
    /** Database column public_consignment_id SqlType(int8), Default(None) */
    val publicConsignmentId: Rep[Option[Long]] = column[Option[Long]]("public_consignment_id", O.Default(None))
    /** Database column consignmenttype SqlType(int8), Default(None) */
    val consignmenttype: Rep[Option[Long]] = column[Option[Long]]("consignmenttype", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fk) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fk", hubbedUserId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (publicConsignmentId) (database name inbound_hubbed_consignments_public_consignment_id_idx) */
    val index1 = index("inbound_hubbed_consignments_public_consignment_id_idx", publicConsignmentId)
  }
  /** Collection-like TableQuery object for table InboundHubbedConsignments */
  lazy val InboundHubbedConsignments = new TableQuery(tag => new InboundHubbedConsignments(tag))
}
