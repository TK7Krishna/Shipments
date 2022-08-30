package models
// AUTO-GENERATED Slick data model for table TwilioSmsReports
trait TwilioSmsReportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TwilioSmsReports
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param yearMonth Database column year_month SqlType(text)
   *  @param estimatedNumLogEntries Database column estimated_num_log_entries SqlType(int8)
   *  @param rowCreatedAt Database column row_created_at SqlType(timestamptz)
   *  @param finishedDownloadingAt Database column finished_downloading_at SqlType(timestamptz), Default(None)
   *  @param finishedLinkingAt Database column finished_linking_at SqlType(timestamptz), Default(None)
   *  @param sentAt Database column sent_at SqlType(timestamptz), Default(None) */
  case class TwilioSmsReportsRow(id: Long, yearMonth: String, estimatedNumLogEntries: Long, rowCreatedAt: java.sql.Timestamp, finishedDownloadingAt: Option[java.sql.Timestamp] = None, finishedLinkingAt: Option[java.sql.Timestamp] = None, sentAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching TwilioSmsReportsRow objects using plain SQL queries */
  implicit def GetResultTwilioSmsReportsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[TwilioSmsReportsRow] = GR{
    prs => import prs._
    TwilioSmsReportsRow.tupled((<<[Long], <<[String], <<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table twilio_sms_reports. Objects of this class serve as prototypes for rows in queries. */
  class TwilioSmsReports(_tableTag: Tag) extends profile.api.Table[TwilioSmsReportsRow](_tableTag, "twilio_sms_reports") {
    def * = (id, yearMonth, estimatedNumLogEntries, rowCreatedAt, finishedDownloadingAt, finishedLinkingAt, sentAt) <> (TwilioSmsReportsRow.tupled, TwilioSmsReportsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(yearMonth), Rep.Some(estimatedNumLogEntries), Rep.Some(rowCreatedAt), finishedDownloadingAt, finishedLinkingAt, sentAt)).shaped.<>({r=>import r._; _1.map(_=> TwilioSmsReportsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column year_month SqlType(text) */
    val yearMonth: Rep[String] = column[String]("year_month")
    /** Database column estimated_num_log_entries SqlType(int8) */
    val estimatedNumLogEntries: Rep[Long] = column[Long]("estimated_num_log_entries")
    /** Database column row_created_at SqlType(timestamptz) */
    val rowCreatedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("row_created_at")
    /** Database column finished_downloading_at SqlType(timestamptz), Default(None) */
    val finishedDownloadingAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("finished_downloading_at", O.Default(None))
    /** Database column finished_linking_at SqlType(timestamptz), Default(None) */
    val finishedLinkingAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("finished_linking_at", O.Default(None))
    /** Database column sent_at SqlType(timestamptz), Default(None) */
    val sentAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("sent_at", O.Default(None))

    /** Uniqueness Index over (yearMonth) (database name twilio_sms_reports_year_month_key) */
    val index1 = index("twilio_sms_reports_year_month_key", yearMonth, unique=true)
  }
  /** Collection-like TableQuery object for table TwilioSmsReports */
  lazy val TwilioSmsReports = new TableQuery(tag => new TwilioSmsReports(tag))
}
