package models
// AUTO-GENERATED Slick data model for table ApWebhookLogs
trait ApWebhookLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ApWebhookLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param clickandcollectConsignmentId Database column clickandcollect_consignment_id SqlType(int8)
   *  @param articlestatesId Database column articlestates_id SqlType(int8)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param status Database column status SqlType(bool), Default(false)
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param articleBarcode Database column article_barcode SqlType(text)
   *  @param eventType Database column event_type SqlType(int4)
   *  @param eventName Database column event_name SqlType(text)
   *  @param timezone Database column timezone SqlType(text)
   *  @param timezoneOffset Database column timezone_offset SqlType(text)
   *  @param signatureBase64 Database column signature_base64 SqlType(text), Default(None)
   *  @param pin Database column pin SqlType(text), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param driverIdentifier Database column driver_identifier SqlType(text), Default(None) */
  case class ApWebhookLogsRow(id: Long, clickandcollectConsignmentId: Long, articlestatesId: Long, hubbedUserId: Long, status: Boolean = false, storeDlb: String, consignmentNumber: String, articleBarcode: String, eventType: Int, eventName: String, timezone: String, timezoneOffset: String, signatureBase64: Option[String] = None, pin: Option[String] = None, attemptCount: Long, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, driverIdentifier: Option[String] = None)
  /** GetResult implicit for fetching ApWebhookLogsRow objects using plain SQL queries */
  implicit def GetResultApWebhookLogsRow(implicit e0: GR[Long], e1: GR[Boolean], e2: GR[String], e3: GR[Int], e4: GR[Option[String]], e5: GR[java.sql.Timestamp], e6: GR[Option[java.sql.Timestamp]]): GR[ApWebhookLogsRow] = GR{
    prs => import prs._
    ApWebhookLogsRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[Boolean], <<[String], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table ap_webhook_logs. Objects of this class serve as prototypes for rows in queries. */
  class ApWebhookLogs(_tableTag: Tag) extends profile.api.Table[ApWebhookLogsRow](_tableTag, Some("ecommerce"), "ap_webhook_logs") {
    def * = (id, clickandcollectConsignmentId, articlestatesId, hubbedUserId, status, storeDlb, consignmentNumber, articleBarcode, eventType, eventName, timezone, timezoneOffset, signatureBase64, pin, attemptCount, createdAt, modifiedAt, driverIdentifier) <> (ApWebhookLogsRow.tupled, ApWebhookLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(clickandcollectConsignmentId), Rep.Some(articlestatesId), Rep.Some(hubbedUserId), Rep.Some(status), Rep.Some(storeDlb), Rep.Some(consignmentNumber), Rep.Some(articleBarcode), Rep.Some(eventType), Rep.Some(eventName), Rep.Some(timezone), Rep.Some(timezoneOffset), signatureBase64, pin, Rep.Some(attemptCount), Rep.Some(createdAt), modifiedAt, driverIdentifier)).shaped.<>({r=>import r._; _1.map(_=> ApWebhookLogsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14, _15.get, _16.get, _17, _18)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column clickandcollect_consignment_id SqlType(int8) */
    val clickandcollectConsignmentId: Rep[Long] = column[Long]("clickandcollect_consignment_id")
    /** Database column articlestates_id SqlType(int8) */
    val articlestatesId: Rep[Long] = column[Long]("articlestates_id")
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column status SqlType(bool), Default(false) */
    val status: Rep[Boolean] = column[Boolean]("status", O.Default(false))
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column article_barcode SqlType(text) */
    val articleBarcode: Rep[String] = column[String]("article_barcode")
    /** Database column event_type SqlType(int4) */
    val eventType: Rep[Int] = column[Int]("event_type")
    /** Database column event_name SqlType(text) */
    val eventName: Rep[String] = column[String]("event_name")
    /** Database column timezone SqlType(text) */
    val timezone: Rep[String] = column[String]("timezone")
    /** Database column timezone_offset SqlType(text) */
    val timezoneOffset: Rep[String] = column[String]("timezone_offset")
    /** Database column signature_base64 SqlType(text), Default(None) */
    val signatureBase64: Rep[Option[String]] = column[Option[String]]("signature_base64", O.Default(None))
    /** Database column pin SqlType(text), Default(None) */
    val pin: Rep[Option[String]] = column[Option[String]]("pin", O.Default(None))
    /** Database column attempt_count SqlType(int8) */
    val attemptCount: Rep[Long] = column[Long]("attempt_count")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column driver_identifier SqlType(text), Default(None) */
    val driverIdentifier: Rep[Option[String]] = column[Option[String]]("driver_identifier", O.Default(None))
  }
  /** Collection-like TableQuery object for table ApWebhookLogs */
  lazy val ApWebhookLogs = new TableQuery(tag => new ApWebhookLogs(tag))
}
