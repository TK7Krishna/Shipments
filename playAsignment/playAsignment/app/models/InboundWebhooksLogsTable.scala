package models
// AUTO-GENERATED Slick data model for table InboundWebhooksLogs
trait InboundWebhooksLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundWebhooksLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param courier Database column courier SqlType(text)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param notificationUrl Database column notification_url SqlType(text)
   *  @param username Database column username SqlType(text), Default(None)
   *  @param password Database column password SqlType(text), Default(None)
   *  @param pin Database column pin SqlType(text), Default(None)
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param timezone Database column timezone SqlType(text)
   *  @param offset Database column offset SqlType(text)
   *  @param signaturePngBase64 Database column signature_png_base64 SqlType(text), Default(None)
   *  @param checkedInAt Database column checked_in_at SqlType(timestamptz), Default(None)
   *  @param checkedOutAt Database column checked_out_at SqlType(timestamptz), Default(None)
   *  @param pickUpRequestedAt Database column pick_up_requested_at SqlType(timestamptz), Default(None)
   *  @param checkedInSent Database column checked_in_sent SqlType(bool), Default(false)
   *  @param checkedOutSent Database column checked_out_sent SqlType(bool), Default(false)
   *  @param expiredSent Database column expired_sent SqlType(bool), Default(false)
   *  @param pickUpRequestedSent Database column pick_up_requested_sent SqlType(bool), Default(false)
   *  @param checkedInAttemptCount Database column checked_in_attempt_count SqlType(int4), Default(0)
   *  @param checkedOutAttemptCount Database column checked_out_attempt_count SqlType(int4), Default(0)
   *  @param expiredAttemptCount Database column expired_attempt_count SqlType(int4), Default(0)
   *  @param pickUpRequestedAttemptCount Database column pick_up_requested_attempt_count SqlType(int4), Default(0)
   *  @param checkInEventEnabled Database column check_in_event_enabled SqlType(bool), Default(false)
   *  @param checkOutEventEnabled Database column check_out_event_enabled SqlType(bool), Default(false)
   *  @param expiredEventEnabled Database column expired_event_enabled SqlType(bool), Default(false)
   *  @param pickUpRequestEventEnabled Database column pick_up_request_event_enabled SqlType(bool), Default(false)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param basicToken Database column basic_token SqlType(text), Default(None) */
  case class InboundWebhooksLogsRow(id: Long, consignmentId: Long, consignmentNumber: String, courier: String, hubbedUserId: Long, notificationUrl: String, username: Option[String] = None, password: Option[String] = None, pin: Option[String] = None, storeDlb: String, timezone: String, offset: String, signaturePngBase64: Option[String] = None, checkedInAt: Option[java.sql.Timestamp] = None, checkedOutAt: Option[java.sql.Timestamp] = None, pickUpRequestedAt: Option[java.sql.Timestamp] = None, checkedInSent: Boolean = false, checkedOutSent: Boolean = false, expiredSent: Boolean = false, pickUpRequestedSent: Boolean = false, checkedInAttemptCount: Int = 0, checkedOutAttemptCount: Int = 0, expiredAttemptCount: Int = 0, pickUpRequestedAttemptCount: Int = 0, checkInEventEnabled: Boolean = false, checkOutEventEnabled: Boolean = false, expiredEventEnabled: Boolean = false, pickUpRequestEventEnabled: Boolean = false, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, basicToken: Option[String] = None)
  /** GetResult implicit for fetching InboundWebhooksLogsRow objects using plain SQL queries */
  implicit def GetResultInboundWebhooksLogsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Boolean], e5: GR[Int], e6: GR[java.sql.Timestamp]): GR[InboundWebhooksLogsRow] = GR{
    prs => import prs._
    InboundWebhooksLogsRow(<<[Long], <<[Long], <<[String], <<[String], <<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<[String], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Boolean], <<[Boolean], <<[Boolean], <<[Boolean], <<[Int], <<[Int], <<[Int], <<[Int], <<[Boolean], <<[Boolean], <<[Boolean], <<[Boolean], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String])
  }
  /** Table description of table inbound_webhooks_logs. Objects of this class serve as prototypes for rows in queries. */
  class InboundWebhooksLogs(_tableTag: Tag) extends profile.api.Table[InboundWebhooksLogsRow](_tableTag, Some("ecommerce"), "inbound_webhooks_logs") {
    def * = (id :: consignmentId :: consignmentNumber :: courier :: hubbedUserId :: notificationUrl :: username :: password :: pin :: storeDlb :: timezone :: offset :: signaturePngBase64 :: checkedInAt :: checkedOutAt :: pickUpRequestedAt :: checkedInSent :: checkedOutSent :: expiredSent :: pickUpRequestedSent :: checkedInAttemptCount :: checkedOutAttemptCount :: expiredAttemptCount :: pickUpRequestedAttemptCount :: checkInEventEnabled :: checkOutEventEnabled :: expiredEventEnabled :: pickUpRequestEventEnabled :: createdAt :: modifiedAt :: basicToken :: HNil).mapTo[InboundWebhooksLogsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(consignmentId) :: Rep.Some(consignmentNumber) :: Rep.Some(courier) :: Rep.Some(hubbedUserId) :: Rep.Some(notificationUrl) :: username :: password :: pin :: Rep.Some(storeDlb) :: Rep.Some(timezone) :: Rep.Some(offset) :: signaturePngBase64 :: checkedInAt :: checkedOutAt :: pickUpRequestedAt :: Rep.Some(checkedInSent) :: Rep.Some(checkedOutSent) :: Rep.Some(expiredSent) :: Rep.Some(pickUpRequestedSent) :: Rep.Some(checkedInAttemptCount) :: Rep.Some(checkedOutAttemptCount) :: Rep.Some(expiredAttemptCount) :: Rep.Some(pickUpRequestedAttemptCount) :: Rep.Some(checkInEventEnabled) :: Rep.Some(checkOutEventEnabled) :: Rep.Some(expiredEventEnabled) :: Rep.Some(pickUpRequestEventEnabled) :: Rep.Some(createdAt) :: modifiedAt :: basicToken :: HNil).shaped.<>(r => InboundWebhooksLogsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Long]].get, r(2).asInstanceOf[Option[String]].get, r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[Long]].get, r(5).asInstanceOf[Option[String]].get, r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[String]], r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]].get, r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[java.sql.Timestamp]], r(14).asInstanceOf[Option[java.sql.Timestamp]], r(15).asInstanceOf[Option[java.sql.Timestamp]], r(16).asInstanceOf[Option[Boolean]].get, r(17).asInstanceOf[Option[Boolean]].get, r(18).asInstanceOf[Option[Boolean]].get, r(19).asInstanceOf[Option[Boolean]].get, r(20).asInstanceOf[Option[Int]].get, r(21).asInstanceOf[Option[Int]].get, r(22).asInstanceOf[Option[Int]].get, r(23).asInstanceOf[Option[Int]].get, r(24).asInstanceOf[Option[Boolean]].get, r(25).asInstanceOf[Option[Boolean]].get, r(26).asInstanceOf[Option[Boolean]].get, r(27).asInstanceOf[Option[Boolean]].get, r(28).asInstanceOf[Option[java.sql.Timestamp]].get, r(29).asInstanceOf[Option[java.sql.Timestamp]], r(30).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column notification_url SqlType(text) */
    val notificationUrl: Rep[String] = column[String]("notification_url")
    /** Database column username SqlType(text), Default(None) */
    val username: Rep[Option[String]] = column[Option[String]]("username", O.Default(None))
    /** Database column password SqlType(text), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Default(None))
    /** Database column pin SqlType(text), Default(None) */
    val pin: Rep[Option[String]] = column[Option[String]]("pin", O.Default(None))
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column timezone SqlType(text) */
    val timezone: Rep[String] = column[String]("timezone")
    /** Database column offset SqlType(text) */
    val offset: Rep[String] = column[String]("offset")
    /** Database column signature_png_base64 SqlType(text), Default(None) */
    val signaturePngBase64: Rep[Option[String]] = column[Option[String]]("signature_png_base64", O.Default(None))
    /** Database column checked_in_at SqlType(timestamptz), Default(None) */
    val checkedInAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("checked_in_at", O.Default(None))
    /** Database column checked_out_at SqlType(timestamptz), Default(None) */
    val checkedOutAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("checked_out_at", O.Default(None))
    /** Database column pick_up_requested_at SqlType(timestamptz), Default(None) */
    val pickUpRequestedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("pick_up_requested_at", O.Default(None))
    /** Database column checked_in_sent SqlType(bool), Default(false) */
    val checkedInSent: Rep[Boolean] = column[Boolean]("checked_in_sent", O.Default(false))
    /** Database column checked_out_sent SqlType(bool), Default(false) */
    val checkedOutSent: Rep[Boolean] = column[Boolean]("checked_out_sent", O.Default(false))
    /** Database column expired_sent SqlType(bool), Default(false) */
    val expiredSent: Rep[Boolean] = column[Boolean]("expired_sent", O.Default(false))
    /** Database column pick_up_requested_sent SqlType(bool), Default(false) */
    val pickUpRequestedSent: Rep[Boolean] = column[Boolean]("pick_up_requested_sent", O.Default(false))
    /** Database column checked_in_attempt_count SqlType(int4), Default(0) */
    val checkedInAttemptCount: Rep[Int] = column[Int]("checked_in_attempt_count", O.Default(0))
    /** Database column checked_out_attempt_count SqlType(int4), Default(0) */
    val checkedOutAttemptCount: Rep[Int] = column[Int]("checked_out_attempt_count", O.Default(0))
    /** Database column expired_attempt_count SqlType(int4), Default(0) */
    val expiredAttemptCount: Rep[Int] = column[Int]("expired_attempt_count", O.Default(0))
    /** Database column pick_up_requested_attempt_count SqlType(int4), Default(0) */
    val pickUpRequestedAttemptCount: Rep[Int] = column[Int]("pick_up_requested_attempt_count", O.Default(0))
    /** Database column check_in_event_enabled SqlType(bool), Default(false) */
    val checkInEventEnabled: Rep[Boolean] = column[Boolean]("check_in_event_enabled", O.Default(false))
    /** Database column check_out_event_enabled SqlType(bool), Default(false) */
    val checkOutEventEnabled: Rep[Boolean] = column[Boolean]("check_out_event_enabled", O.Default(false))
    /** Database column expired_event_enabled SqlType(bool), Default(false) */
    val expiredEventEnabled: Rep[Boolean] = column[Boolean]("expired_event_enabled", O.Default(false))
    /** Database column pick_up_request_event_enabled SqlType(bool), Default(false) */
    val pickUpRequestEventEnabled: Rep[Boolean] = column[Boolean]("pick_up_request_event_enabled", O.Default(false))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column basic_token SqlType(text), Default(None) */
    val basicToken: Rep[Option[String]] = column[Option[String]]("basic_token", O.Default(None))

    /** Foreign key referencing Consignments (database name fk_consignment_id) */
    lazy val consignmentsFk = foreignKey("fk_consignment_id", consignmentId :: HNil, Consignments)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (hubbedUserId) (database name inbound_webhooks_logs_hubbed_user_id_idx) */
    val index1 = index("inbound_webhooks_logs_hubbed_user_id_idx", hubbedUserId :: HNil)
    /** Index over (hubbedUserId) (database name inbound_webhooks_logs_hubbed_user_id_idx1) */
    val index2 = index("inbound_webhooks_logs_hubbed_user_id_idx1", hubbedUserId :: HNil)
  }
  /** Collection-like TableQuery object for table InboundWebhooksLogs */
  lazy val InboundWebhooksLogs = new TableQuery(tag => new InboundWebhooksLogs(tag))
}
