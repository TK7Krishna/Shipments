package models
// AUTO-GENERATED Slick data model for table InboundTollConsignments
trait InboundTollConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundTollConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param message Database column message SqlType(int8)
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param contactName Database column contact_name SqlType(text), Default(None)
   *  @param mobileNumber Database column mobile_number SqlType(text), Default(None)
   *  @param emailAddress Database column email_address SqlType(text), Default(None)
   *  @param street1 Database column street1 SqlType(text), Default(None)
   *  @param street2 Database column street2 SqlType(text), Default(None)
   *  @param city Database column city SqlType(text), Default(None)
   *  @param postcode Database column postcode SqlType(text), Default(None)
   *  @param subCourier Database column sub_courier SqlType(int8), Default(None)
   *  @param primaryElect Database column primary_elect SqlType(bool) */
  case class InboundTollConsignmentsRow(id: Long, message: Long, storeDlb: String, consignmentNumber: String, contactName: Option[String] = None, mobileNumber: Option[String] = None, emailAddress: Option[String] = None, street1: Option[String] = None, street2: Option[String] = None, city: Option[String] = None, postcode: Option[String] = None, subCourier: Option[Long] = None, primaryElect: Boolean)
  /** GetResult implicit for fetching InboundTollConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundTollConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Boolean]): GR[InboundTollConsignmentsRow] = GR{
    prs => import prs._
    InboundTollConsignmentsRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<[Boolean]))
  }
  /** Table description of table inbound_toll_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundTollConsignments(_tableTag: Tag) extends profile.api.Table[InboundTollConsignmentsRow](_tableTag, "inbound_toll_consignments") {
    def * = (id, message, storeDlb, consignmentNumber, contactName, mobileNumber, emailAddress, street1, street2, city, postcode, subCourier, primaryElect) <> (InboundTollConsignmentsRow.tupled, InboundTollConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(message), Rep.Some(storeDlb), Rep.Some(consignmentNumber), contactName, mobileNumber, emailAddress, street1, street2, city, postcode, subCourier, Rep.Some(primaryElect))).shaped.<>({r=>import r._; _1.map(_=> InboundTollConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8, _9, _10, _11, _12, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column message SqlType(int8) */
    val message: Rep[Long] = column[Long]("message")
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
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
    /** Database column postcode SqlType(text), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Default(None))
    /** Database column sub_courier SqlType(int8), Default(None) */
    val subCourier: Rep[Option[Long]] = column[Option[Long]]("sub_courier", O.Default(None))
    /** Database column primary_elect SqlType(bool) */
    val primaryElect: Rep[Boolean] = column[Boolean]("primary_elect")

    /** Foreign key referencing InboundTollMessages (database name inbound_toll_consignments_message_fkey) */
    lazy val inboundTollMessagesFk = foreignKey("inbound_toll_consignments_message_fkey", message, InboundTollMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SubCouriers (database name inbound_toll_consignments_sub_courier_fkey) */
    lazy val subCouriersFk = foreignKey("inbound_toll_consignments_sub_courier_fkey", subCourier, SubCouriers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (consignmentNumber) (database name inbound_toll_consignments_consignment_number_idx) */
    val index1 = index("inbound_toll_consignments_consignment_number_idx", consignmentNumber)
  }
  /** Collection-like TableQuery object for table InboundTollConsignments */
  lazy val InboundTollConsignments = new TableQuery(tag => new InboundTollConsignments(tag))
}
