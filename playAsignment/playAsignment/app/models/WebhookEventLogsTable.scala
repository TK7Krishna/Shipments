package models
// AUTO-GENERATED Slick data model for table WebhookEventLogs
trait WebhookEventLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookEventLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param eventId Database column event_id SqlType(int8)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param ecpCode Database column ecp_code SqlType(text), Default(None)
   *  @param packageKey Database column package_key SqlType(text), Default(None)
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param pin Database column pin SqlType(text), Default(None)
   *  @param notificationType Database column notification_type SqlType(text), Default(None)
   *  @param notificationText Database column notification_text SqlType(text), Default(None)
   *  @param isProcessed Database column is_processed SqlType(bool), Default(Some(false))
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(Some(0))
   *  @param postProcessingComplete Database column post_processing_complete SqlType(timestamptz), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class WebhookEventLogsRow(id: Long, eventId: Long, consignmentId: Option[Long] = None, ecpCode: Option[String] = None, packageKey: Option[String] = None, storeDlb: String, pin: Option[String] = None, notificationType: Option[String] = None, notificationText: Option[String] = None, isProcessed: Option[Boolean] = Some(false), attemptCount: Option[Int] = Some(0), postProcessingComplete: Option[java.sql.Timestamp] = None, createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching WebhookEventLogsRow objects using plain SQL queries */
  implicit def GetResultWebhookEventLogsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[String], e4: GR[Option[Boolean]], e5: GR[Option[Int]], e6: GR[Option[java.sql.Timestamp]]): GR[WebhookEventLogsRow] = GR{
    prs => import prs._
    WebhookEventLogsRow.tupled((<<[Long], <<[Long], <<?[Long], <<?[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[Int], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table webhook_event_logs. Objects of this class serve as prototypes for rows in queries. */
  class WebhookEventLogs(_tableTag: Tag) extends profile.api.Table[WebhookEventLogsRow](_tableTag, Some("ebay"), "webhook_event_logs") {
    def * = (id, eventId, consignmentId, ecpCode, packageKey, storeDlb, pin, notificationType, notificationText, isProcessed, attemptCount, postProcessingComplete, createdAt, modifiedAt) <> (WebhookEventLogsRow.tupled, WebhookEventLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(eventId), consignmentId, ecpCode, packageKey, Rep.Some(storeDlb), pin, notificationType, notificationText, isProcessed, attemptCount, postProcessingComplete, createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> WebhookEventLogsRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7, _8, _9, _10, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column event_id SqlType(int8) */
    val eventId: Rep[Long] = column[Long]("event_id")
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column ecp_code SqlType(text), Default(None) */
    val ecpCode: Rep[Option[String]] = column[Option[String]]("ecp_code", O.Default(None))
    /** Database column package_key SqlType(text), Default(None) */
    val packageKey: Rep[Option[String]] = column[Option[String]]("package_key", O.Default(None))
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column pin SqlType(text), Default(None) */
    val pin: Rep[Option[String]] = column[Option[String]]("pin", O.Default(None))
    /** Database column notification_type SqlType(text), Default(None) */
    val notificationType: Rep[Option[String]] = column[Option[String]]("notification_type", O.Default(None))
    /** Database column notification_text SqlType(text), Default(None) */
    val notificationText: Rep[Option[String]] = column[Option[String]]("notification_text", O.Default(None))
    /** Database column is_processed SqlType(bool), Default(Some(false)) */
    val isProcessed: Rep[Option[Boolean]] = column[Option[Boolean]]("is_processed", O.Default(Some(false)))
    /** Database column attempt_count SqlType(int4), Default(Some(0)) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(Some(0)))
    /** Database column post_processing_complete SqlType(timestamptz), Default(None) */
    val postProcessingComplete: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("post_processing_complete", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))

    /** Foreign key referencing Consignments (database name consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_id_fkey", consignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing WebhookEvents (database name event_id_fkey) */
    lazy val webhookEventsFk = foreignKey("event_id_fkey", eventId, WebhookEvents)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table WebhookEventLogs */
  lazy val WebhookEventLogs = new TableQuery(tag => new WebhookEventLogs(tag))
}
