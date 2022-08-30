package models
// AUTO-GENERATED Slick data model for table WebhookAuditLogs
trait WebhookAuditLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookAuditLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param eventName Database column event_name SqlType(text)
   *  @param jobStartedAt Database column job_started_at SqlType(timestamptz)
   *  @param lastRunAt Database column last_run_at SqlType(timestamptz) */
  case class WebhookAuditLogsRow(id: Long, eventName: String, jobStartedAt: java.sql.Timestamp, lastRunAt: java.sql.Timestamp)
  /** GetResult implicit for fetching WebhookAuditLogsRow objects using plain SQL queries */
  implicit def GetResultWebhookAuditLogsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[WebhookAuditLogsRow] = GR{
    prs => import prs._
    WebhookAuditLogsRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table webhook_audit_logs. Objects of this class serve as prototypes for rows in queries. */
  class WebhookAuditLogs(_tableTag: Tag) extends profile.api.Table[WebhookAuditLogsRow](_tableTag, Some("standard_apis"), "webhook_audit_logs") {
    def * = (id, eventName, jobStartedAt, lastRunAt) <> (WebhookAuditLogsRow.tupled, WebhookAuditLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(eventName), Rep.Some(jobStartedAt), Rep.Some(lastRunAt))).shaped.<>({r=>import r._; _1.map(_=> WebhookAuditLogsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column event_name SqlType(text) */
    val eventName: Rep[String] = column[String]("event_name")
    /** Database column job_started_at SqlType(timestamptz) */
    val jobStartedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("job_started_at")
    /** Database column last_run_at SqlType(timestamptz) */
    val lastRunAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_run_at")
  }
  /** Collection-like TableQuery object for table WebhookAuditLogs */
  lazy val WebhookAuditLogs = new TableQuery(tag => new WebhookAuditLogs(tag))
}
