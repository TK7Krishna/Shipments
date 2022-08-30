package models
// AUTO-GENERATED Slick data model for table BgLogs
trait BgLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BgLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param jobName Database column job_name SqlType(text), Default(None)
   *  @param logText Database column log_text SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None) */
  case class BgLogsRow(id: Long, jobName: Option[String] = None, logText: Option[String] = None, createdAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching BgLogsRow objects using plain SQL queries */
  implicit def GetResultBgLogsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]]): GR[BgLogsRow] = GR{
    prs => import prs._
    BgLogsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table bg_logs. Objects of this class serve as prototypes for rows in queries. */
  class BgLogs(_tableTag: Tag) extends profile.api.Table[BgLogsRow](_tableTag, Some("standard_apis"), "bg_logs") {
    def * = (id, jobName, logText, createdAt) <> (BgLogsRow.tupled, BgLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), jobName, logText, createdAt)).shaped.<>({r=>import r._; _1.map(_=> BgLogsRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column job_name SqlType(text), Default(None) */
    val jobName: Rep[Option[String]] = column[Option[String]]("job_name", O.Default(None))
    /** Database column log_text SqlType(text), Default(None) */
    val logText: Rep[Option[String]] = column[Option[String]]("log_text", O.Default(None))
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table BgLogs */
  lazy val BgLogs = new TableQuery(tag => new BgLogs(tag))
}
