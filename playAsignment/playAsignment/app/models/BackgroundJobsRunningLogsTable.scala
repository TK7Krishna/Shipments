package models
// AUTO-GENERATED Slick data model for table BackgroundJobsRunningLogs
trait BackgroundJobsRunningLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BackgroundJobsRunningLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param jobName Database column job_name SqlType(text)
   *  @param jobStartedAt Database column job_started_at SqlType(timestamptz)
   *  @param jobLastRanAt Database column job_last_ran_at SqlType(timestamptz) */
  case class BackgroundJobsRunningLogsRow(id: Long, jobName: String, jobStartedAt: java.sql.Timestamp, jobLastRanAt: java.sql.Timestamp)
  /** GetResult implicit for fetching BackgroundJobsRunningLogsRow objects using plain SQL queries */
  implicit def GetResultBackgroundJobsRunningLogsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[BackgroundJobsRunningLogsRow] = GR{
    prs => import prs._
    BackgroundJobsRunningLogsRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table background_jobs_running_logs. Objects of this class serve as prototypes for rows in queries. */
  class BackgroundJobsRunningLogs(_tableTag: Tag) extends profile.api.Table[BackgroundJobsRunningLogsRow](_tableTag, Some("pakpobox"), "background_jobs_running_logs") {
    def * = (id, jobName, jobStartedAt, jobLastRanAt) <> (BackgroundJobsRunningLogsRow.tupled, BackgroundJobsRunningLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(jobName), Rep.Some(jobStartedAt), Rep.Some(jobLastRanAt))).shaped.<>({r=>import r._; _1.map(_=> BackgroundJobsRunningLogsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column job_name SqlType(text) */
    val jobName: Rep[String] = column[String]("job_name")
    /** Database column job_started_at SqlType(timestamptz) */
    val jobStartedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("job_started_at")
    /** Database column job_last_ran_at SqlType(timestamptz) */
    val jobLastRanAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("job_last_ran_at")
  }
  /** Collection-like TableQuery object for table BackgroundJobsRunningLogs */
  lazy val BackgroundJobsRunningLogs = new TableQuery(tag => new BackgroundJobsRunningLogs(tag))
}
