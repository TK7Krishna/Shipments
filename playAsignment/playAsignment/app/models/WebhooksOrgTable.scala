package models
// AUTO-GENERATED Slick data model for table WebhooksOrg
trait WebhooksOrgTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhooksOrg
   *  @param id Database column id SqlType(int8), Default(None)
   *  @param lockerUnit Database column locker_unit SqlType(int8), Default(None)
   *  @param body Database column body SqlType(jsonb), Length(2147483647,false), Default(None)
   *  @param receivedAt Database column received_at SqlType(timestamptz), Default(None)
   *  @param processingCompletedAt Database column processing_completed_at SqlType(timestamptz), Default(None)
   *  @param lastAttemptAt Database column last_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int8), Default(None) */
  case class WebhooksOrgRow(id: Option[Long] = None, lockerUnit: Option[Long] = None, body: Option[String] = None, receivedAt: Option[java.sql.Timestamp] = None, processingCompletedAt: Option[java.sql.Timestamp] = None, lastAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Long] = None)
  /** GetResult implicit for fetching WebhooksOrgRow objects using plain SQL queries */
  implicit def GetResultWebhooksOrgRow(implicit e0: GR[Option[Long]], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]]): GR[WebhooksOrgRow] = GR{
    prs => import prs._
    WebhooksOrgRow.tupled((<<?[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table webhooks_org. Objects of this class serve as prototypes for rows in queries. */
  class WebhooksOrg(_tableTag: Tag) extends profile.api.Table[WebhooksOrgRow](_tableTag, Some("reports"), "webhooks_org") {
    def * = (id, lockerUnit, body, receivedAt, processingCompletedAt, lastAttemptAt, attemptCount) <> (WebhooksOrgRow.tupled, WebhooksOrgRow.unapply)

    /** Database column id SqlType(int8), Default(None) */
    val id: Rep[Option[Long]] = column[Option[Long]]("id", O.Default(None))
    /** Database column locker_unit SqlType(int8), Default(None) */
    val lockerUnit: Rep[Option[Long]] = column[Option[Long]]("locker_unit", O.Default(None))
    /** Database column body SqlType(jsonb), Length(2147483647,false), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Length(2147483647,varying=false), O.Default(None))
    /** Database column received_at SqlType(timestamptz), Default(None) */
    val receivedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("received_at", O.Default(None))
    /** Database column processing_completed_at SqlType(timestamptz), Default(None) */
    val processingCompletedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("processing_completed_at", O.Default(None))
    /** Database column last_attempt_at SqlType(timestamptz), Default(None) */
    val lastAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int8), Default(None) */
    val attemptCount: Rep[Option[Long]] = column[Option[Long]]("attempt_count", O.Default(None))
  }
  /** Collection-like TableQuery object for table WebhooksOrg */
  lazy val WebhooksOrg = new TableQuery(tag => new WebhooksOrg(tag))
}
