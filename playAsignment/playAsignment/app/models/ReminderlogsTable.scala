package models
// AUTO-GENERATED Slick data model for table Reminderlogs
trait ReminderlogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Reminderlogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param consignmentnumber Database column consignmentnumber SqlType(text), Default(None)
   *  @param eventid Database column eventid SqlType(int8), Default(None)
   *  @param isScannedEventSent Database column is_scanned_event_sent SqlType(bool), Default(Some(false))
   *  @param uploadedAt Database column uploaded_at SqlType(timestamptz), Default(None)
   *  @param lastAttemptAt Database column last_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(Some(0))
   *  @param isProcessed Database column is_processed SqlType(bool), Default(Some(false))
   *  @param isProcessedSeventhDay Database column is_processed_seventh_day SqlType(bool), Default(Some(false)) */
  case class ReminderlogsRow(id: Long, createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp] = None, consignmentnumber: Option[String] = None, eventid: Option[Long] = None, isScannedEventSent: Option[Boolean] = Some(false), uploadedAt: Option[java.sql.Timestamp] = None, lastAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = Some(0), isProcessed: Option[Boolean] = Some(false), isProcessedSeventhDay: Option[Boolean] = Some(false))
  /** GetResult implicit for fetching ReminderlogsRow objects using plain SQL queries */
  implicit def GetResultReminderlogsRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[Boolean]], e5: GR[Option[Int]]): GR[ReminderlogsRow] = GR{
    prs => import prs._
    ReminderlogsRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[Long], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int], <<?[Boolean], <<?[Boolean]))
  }
  /** Table description of table reminderlogs. Objects of this class serve as prototypes for rows in queries. */
  class Reminderlogs(_tableTag: Tag) extends profile.api.Table[ReminderlogsRow](_tableTag, Some("ecommerce"), "reminderlogs") {
    def * = (id, createdAt, modifiedAt, consignmentnumber, eventid, isScannedEventSent, uploadedAt, lastAttemptAt, attemptCount, isProcessed, isProcessedSeventhDay) <> (ReminderlogsRow.tupled, ReminderlogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), createdAt, modifiedAt, consignmentnumber, eventid, isScannedEventSent, uploadedAt, lastAttemptAt, attemptCount, isProcessed, isProcessedSeventhDay)).shaped.<>({r=>import r._; _1.map(_=> ReminderlogsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column consignmentnumber SqlType(text), Default(None) */
    val consignmentnumber: Rep[Option[String]] = column[Option[String]]("consignmentnumber", O.Default(None))
    /** Database column eventid SqlType(int8), Default(None) */
    val eventid: Rep[Option[Long]] = column[Option[Long]]("eventid", O.Default(None))
    /** Database column is_scanned_event_sent SqlType(bool), Default(Some(false)) */
    val isScannedEventSent: Rep[Option[Boolean]] = column[Option[Boolean]]("is_scanned_event_sent", O.Default(Some(false)))
    /** Database column uploaded_at SqlType(timestamptz), Default(None) */
    val uploadedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("uploaded_at", O.Default(None))
    /** Database column last_attempt_at SqlType(timestamptz), Default(None) */
    val lastAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(Some(0)) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(Some(0)))
    /** Database column is_processed SqlType(bool), Default(Some(false)) */
    val isProcessed: Rep[Option[Boolean]] = column[Option[Boolean]]("is_processed", O.Default(Some(false)))
    /** Database column is_processed_seventh_day SqlType(bool), Default(Some(false)) */
    val isProcessedSeventhDay: Rep[Option[Boolean]] = column[Option[Boolean]]("is_processed_seventh_day", O.Default(Some(false)))

    /** Foreign key referencing WebhookEvents (database name reminderlogs_webhookevent_fkey) */
    lazy val webhookEventsFk = foreignKey("reminderlogs_webhookevent_fkey", eventid, WebhookEvents)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Reminderlogs */
  lazy val Reminderlogs = new TableQuery(tag => new Reminderlogs(tag))
}
