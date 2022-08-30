package models
// AUTO-GENERATED Slick data model for table WebhookArticles
trait WebhookArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param webhook Database column webhook SqlType(int8)
   *  @param lockerState Database column locker_state SqlType(int8)
   *  @param eventType Database column event_type SqlType(text)
   *  @param itemBarcode Database column item_barcode SqlType(text)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param driverIdentifier Database column driver_identifier SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param processingCompletedAt Database column processing_completed_at SqlType(timestamptz), Default(None)
   *  @param lastAttemptAt Database column last_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int8), Default(None) */
  case class WebhookArticlesRow(id: Long, webhook: Long, lockerState: Long, eventType: String, itemBarcode: String, courier: Option[String] = None, driverIdentifier: Option[String] = None, createdAt: java.sql.Timestamp, processingCompletedAt: Option[java.sql.Timestamp] = None, lastAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Long] = None)
  /** GetResult implicit for fetching WebhookArticlesRow objects using plain SQL queries */
  implicit def GetResultWebhookArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Long]]): GR[WebhookArticlesRow] = GR{
    prs => import prs._
    WebhookArticlesRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table webhook_articles. Objects of this class serve as prototypes for rows in queries. */
  class WebhookArticles(_tableTag: Tag) extends profile.api.Table[WebhookArticlesRow](_tableTag, Some("locker"), "webhook_articles") {
    def * = (id, webhook, lockerState, eventType, itemBarcode, courier, driverIdentifier, createdAt, processingCompletedAt, lastAttemptAt, attemptCount) <> (WebhookArticlesRow.tupled, WebhookArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(webhook), Rep.Some(lockerState), Rep.Some(eventType), Rep.Some(itemBarcode), courier, driverIdentifier, Rep.Some(createdAt), processingCompletedAt, lastAttemptAt, attemptCount)).shaped.<>({r=>import r._; _1.map(_=> WebhookArticlesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8.get, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column webhook SqlType(int8) */
    val webhook: Rep[Long] = column[Long]("webhook")
    /** Database column locker_state SqlType(int8) */
    val lockerState: Rep[Long] = column[Long]("locker_state")
    /** Database column event_type SqlType(text) */
    val eventType: Rep[String] = column[String]("event_type")
    /** Database column item_barcode SqlType(text) */
    val itemBarcode: Rep[String] = column[String]("item_barcode")
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column driver_identifier SqlType(text), Default(None) */
    val driverIdentifier: Rep[Option[String]] = column[Option[String]]("driver_identifier", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column processing_completed_at SqlType(timestamptz), Default(None) */
    val processingCompletedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("processing_completed_at", O.Default(None))
    /** Database column last_attempt_at SqlType(timestamptz), Default(None) */
    val lastAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int8), Default(None) */
    val attemptCount: Rep[Option[Long]] = column[Option[Long]]("attempt_count", O.Default(None))

    /** Foreign key referencing Couriers (database name webhook_articles_courier_fkey) */
    lazy val couriersFk = foreignKey("webhook_articles_courier_fkey", courier, Couriers)(r => Rep.Some(r.code), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LockerStateHistory (database name webhook_articles_locker_state_fkey) */
    lazy val lockerStateHistoryFk = foreignKey("webhook_articles_locker_state_fkey", lockerState, LockerStateHistory)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Webhooks (database name webhook_articles_webhook_fkey) */
    lazy val webhooksFk = foreignKey("webhook_articles_webhook_fkey", webhook, Webhooks)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table WebhookArticles */
  lazy val WebhookArticles = new TableQuery(tag => new WebhookArticles(tag))
}
