package models
// AUTO-GENERATED Slick data model for table Webhooks
trait WebhooksTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Webhooks
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param lockerUnit Database column locker_unit SqlType(int8)
   *  @param body Database column body SqlType(jsonb), Length(2147483647,false), Default(None)
   *  @param receivedAt Database column received_at SqlType(timestamptz)
   *  @param processingCompletedAt Database column processing_completed_at SqlType(timestamptz), Default(None)
   *  @param lastAttemptAt Database column last_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int8), Default(None) */
  case class WebhooksRow(id: Long, lockerUnit: Long, body: Option[String] = None, receivedAt: java.sql.Timestamp, processingCompletedAt: Option[java.sql.Timestamp] = None, lastAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Long] = None)
  /** GetResult implicit for fetching WebhooksRow objects using plain SQL queries */
  implicit def GetResultWebhooksRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Long]]): GR[WebhooksRow] = GR{
    prs => import prs._
    WebhooksRow.tupled((<<[Long], <<[Long], <<?[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table webhooks. Objects of this class serve as prototypes for rows in queries. */
  class Webhooks(_tableTag: Tag) extends profile.api.Table[WebhooksRow](_tableTag, Some("locker"), "webhooks") {
    def * = (id, lockerUnit, body, receivedAt, processingCompletedAt, lastAttemptAt, attemptCount) <> (WebhooksRow.tupled, WebhooksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(lockerUnit), body, Rep.Some(receivedAt), processingCompletedAt, lastAttemptAt, attemptCount)).shaped.<>({r=>import r._; _1.map(_=> WebhooksRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column locker_unit SqlType(int8) */
    val lockerUnit: Rep[Long] = column[Long]("locker_unit")
    /** Database column body SqlType(jsonb), Length(2147483647,false), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Length(2147483647,varying=false), O.Default(None))
    /** Database column received_at SqlType(timestamptz) */
    val receivedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("received_at")
    /** Database column processing_completed_at SqlType(timestamptz), Default(None) */
    val processingCompletedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("processing_completed_at", O.Default(None))
    /** Database column last_attempt_at SqlType(timestamptz), Default(None) */
    val lastAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int8), Default(None) */
    val attemptCount: Rep[Option[Long]] = column[Option[Long]]("attempt_count", O.Default(None))

    /** Foreign key referencing LockerUnits (database name webhooks_locker_unit_fkey) */
    lazy val lockerUnitsFk = foreignKey("webhooks_locker_unit_fkey", lockerUnit, LockerUnits)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (body) (database name idx_gin_body) */
    val index1 = index("idx_gin_body", body)
    /** Index over (lastAttemptAt) (database name webhooks_last_attempt_at_idx) */
    val index2 = index("webhooks_last_attempt_at_idx", lastAttemptAt)
    /** Index over (receivedAt,id) (database name webhooks_received_at_id_idx) */
    val index3 = index("webhooks_received_at_id_idx", (receivedAt, id))
  }
  /** Collection-like TableQuery object for table Webhooks */
  lazy val Webhooks = new TableQuery(tag => new Webhooks(tag))
}
