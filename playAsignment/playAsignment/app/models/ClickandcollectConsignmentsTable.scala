package models
// AUTO-GENERATED Slick data model for table ClickandcollectConsignments
trait ClickandcollectConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ClickandcollectConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param missedDeliveryCardNumber Database column missed_delivery_card_number SqlType(text), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param contactName Database column contact_name SqlType(text)
   *  @param mobileNumber Database column mobile_number SqlType(text), Default(None)
   *  @param emailAddress Database column email_address SqlType(text)
   *  @param consignmenttype Database column consignmenttype SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param isCancelled Database column is_cancelled SqlType(bool), Default(false)
   *  @param hubbedId Database column hubbed_id SqlType(text), Default(None)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param expiredAt Database column expired_at SqlType(timestamptz), Default(None)
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None) */
  case class ClickandcollectConsignmentsRow(id: Long, storeDlb: String, missedDeliveryCardNumber: Option[String] = None, consignmentNumber: String, contactName: String, mobileNumber: Option[String] = None, emailAddress: String, consignmenttype: Option[Long] = None, createdAt: java.sql.Timestamp, hubbedUserId: Long, modifiedAt: Option[java.sql.Timestamp] = None, isCancelled: Boolean = false, hubbedId: Option[String] = None, consignmentId: Option[Long] = None, expiredAt: Option[java.sql.Timestamp] = None, droplocationId: Option[Long] = None)
  /** GetResult implicit for fetching ClickandcollectConsignmentsRow objects using plain SQL queries */
  implicit def GetResultClickandcollectConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Boolean]): GR[ClickandcollectConsignmentsRow] = GR{
    prs => import prs._
    ClickandcollectConsignmentsRow.tupled((<<[Long], <<[String], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<?[Long], <<[java.sql.Timestamp], <<[Long], <<?[java.sql.Timestamp], <<[Boolean], <<?[String], <<?[Long], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table clickandcollect_consignments. Objects of this class serve as prototypes for rows in queries. */
  class ClickandcollectConsignments(_tableTag: Tag) extends profile.api.Table[ClickandcollectConsignmentsRow](_tableTag, Some("ecommerce"), "clickandcollect_consignments") {
    def * = (id, storeDlb, missedDeliveryCardNumber, consignmentNumber, contactName, mobileNumber, emailAddress, consignmenttype, createdAt, hubbedUserId, modifiedAt, isCancelled, hubbedId, consignmentId, expiredAt, droplocationId) <> (ClickandcollectConsignmentsRow.tupled, ClickandcollectConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(storeDlb), missedDeliveryCardNumber, Rep.Some(consignmentNumber), Rep.Some(contactName), mobileNumber, Rep.Some(emailAddress), consignmenttype, Rep.Some(createdAt), Rep.Some(hubbedUserId), modifiedAt, Rep.Some(isCancelled), hubbedId, consignmentId, expiredAt, droplocationId)).shaped.<>({r=>import r._; _1.map(_=> ClickandcollectConsignmentsRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7.get, _8, _9.get, _10.get, _11, _12.get, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column missed_delivery_card_number SqlType(text), Default(None) */
    val missedDeliveryCardNumber: Rep[Option[String]] = column[Option[String]]("missed_delivery_card_number", O.Default(None))
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column mobile_number SqlType(text), Default(None) */
    val mobileNumber: Rep[Option[String]] = column[Option[String]]("mobile_number", O.Default(None))
    /** Database column email_address SqlType(text) */
    val emailAddress: Rep[String] = column[String]("email_address")
    /** Database column consignmenttype SqlType(int8), Default(None) */
    val consignmenttype: Rep[Option[Long]] = column[Option[Long]]("consignmenttype", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column is_cancelled SqlType(bool), Default(false) */
    val isCancelled: Rep[Boolean] = column[Boolean]("is_cancelled", O.Default(false))
    /** Database column hubbed_id SqlType(text), Default(None) */
    val hubbedId: Rep[Option[String]] = column[Option[String]]("hubbed_id", O.Default(None))
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column expired_at SqlType(timestamptz), Default(None) */
    val expiredAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("expired_at", O.Default(None))
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))

    /** Foreign key referencing Consignments (database name clickandcollect_consignments_fk) */
    lazy val consignmentsFk = foreignKey("clickandcollect_consignments_fk", consignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name clickandcollect_consignments_droplocation_id_fkey) */
    lazy val droplocationsFk = foreignKey("clickandcollect_consignments_droplocation_id_fkey", droplocationId, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fk) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fk", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (consignmentNumber) (database name ecommerce_consignment_number_trgm) */
    val index1 = index("ecommerce_consignment_number_trgm", consignmentNumber)
    /** Index over (hubbedId) (database name fki_hubbed_id_fk) */
    val index2 = index("fki_hubbed_id_fk", hubbedId)
    /** Index over (hubbedId) (database name hubbed_id_idx) */
    val index3 = index("hubbed_id_idx", hubbedId)
  }
  /** Collection-like TableQuery object for table ClickandcollectConsignments */
  lazy val ClickandcollectConsignments = new TableQuery(tag => new ClickandcollectConsignments(tag))
}
