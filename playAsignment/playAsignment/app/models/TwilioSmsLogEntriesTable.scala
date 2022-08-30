package models
// AUTO-GENERATED Slick data model for table TwilioSmsLogEntries
trait TwilioSmsLogEntriesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TwilioSmsLogEntries
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param report Database column report SqlType(int8)
   *  @param sid Database column sid SqlType(text)
   *  @param status Database column status SqlType(text)
   *  @param price Database column price SqlType(numeric)
   *  @param priceUnit Database column price_unit SqlType(text)
   *  @param sentTimestamp Database column sent_timestamp SqlType(timestamptz)
   *  @param sendAttempt Database column send_attempt SqlType(int8), Default(None)
   *  @param cannotReconcile Database column cannot_reconcile SqlType(bool), Default(None)
   *  @param rowCreatedAt Database column row_created_at SqlType(timestamptz) */
  case class TwilioSmsLogEntriesRow(id: Long, report: Long, sid: String, status: String, price: scala.math.BigDecimal, priceUnit: String, sentTimestamp: java.sql.Timestamp, sendAttempt: Option[Long] = None, cannotReconcile: Option[Boolean] = None, rowCreatedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching TwilioSmsLogEntriesRow objects using plain SQL queries */
  implicit def GetResultTwilioSmsLogEntriesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp], e4: GR[Option[Long]], e5: GR[Option[Boolean]]): GR[TwilioSmsLogEntriesRow] = GR{
    prs => import prs._
    TwilioSmsLogEntriesRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[scala.math.BigDecimal], <<[String], <<[java.sql.Timestamp], <<?[Long], <<?[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table twilio_sms_log_entries. Objects of this class serve as prototypes for rows in queries. */
  class TwilioSmsLogEntries(_tableTag: Tag) extends profile.api.Table[TwilioSmsLogEntriesRow](_tableTag, "twilio_sms_log_entries") {
    def * = (id, report, sid, status, price, priceUnit, sentTimestamp, sendAttempt, cannotReconcile, rowCreatedAt) <> (TwilioSmsLogEntriesRow.tupled, TwilioSmsLogEntriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(report), Rep.Some(sid), Rep.Some(status), Rep.Some(price), Rep.Some(priceUnit), Rep.Some(sentTimestamp), sendAttempt, cannotReconcile, Rep.Some(rowCreatedAt))).shaped.<>({r=>import r._; _1.map(_=> TwilioSmsLogEntriesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8, _9, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column report SqlType(int8) */
    val report: Rep[Long] = column[Long]("report")
    /** Database column sid SqlType(text) */
    val sid: Rep[String] = column[String]("sid")
    /** Database column status SqlType(text) */
    val status: Rep[String] = column[String]("status")
    /** Database column price SqlType(numeric) */
    val price: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("price")
    /** Database column price_unit SqlType(text) */
    val priceUnit: Rep[String] = column[String]("price_unit")
    /** Database column sent_timestamp SqlType(timestamptz) */
    val sentTimestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("sent_timestamp")
    /** Database column send_attempt SqlType(int8), Default(None) */
    val sendAttempt: Rep[Option[Long]] = column[Option[Long]]("send_attempt", O.Default(None))
    /** Database column cannot_reconcile SqlType(bool), Default(None) */
    val cannotReconcile: Rep[Option[Boolean]] = column[Option[Boolean]]("cannot_reconcile", O.Default(None))
    /** Database column row_created_at SqlType(timestamptz) */
    val rowCreatedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("row_created_at")

    /** Foreign key referencing SmsSendAttempts (database name twilio_sms_log_entries_send_attempt_fkey) */
    lazy val smsSendAttemptsFk = foreignKey("twilio_sms_log_entries_send_attempt_fkey", sendAttempt, SmsSendAttempts)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TwilioSmsReports (database name twilio_sms_log_entries_report_fkey) */
    lazy val twilioSmsReportsFk = foreignKey("twilio_sms_log_entries_report_fkey", report, TwilioSmsReports)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (sid) (database name twilio_sid_unique) */
    val index1 = index("twilio_sid_unique", sid, unique=true)
    /** Index over (report,sentTimestamp) (database name twilio_sms_log_entries_report_sent_timestamp_idx) */
    val index2 = index("twilio_sms_log_entries_report_sent_timestamp_idx", (report, sentTimestamp))
    /** Index over (report,sentTimestamp) (database name twilio_sms_log_entries_report_sent_timestamp_idx1) */
    val index3 = index("twilio_sms_log_entries_report_sent_timestamp_idx1", (report, sentTimestamp))
    /** Index over (report,sid) (database name twilio_sms_log_entries_report_sid_idx) */
    val index4 = index("twilio_sms_log_entries_report_sid_idx", (report, sid))
    /** Index over (report,sid) (database name twilio_sms_log_entries_report_sid_idx1) */
    val index5 = index("twilio_sms_log_entries_report_sid_idx1", (report, sid))
  }
  /** Collection-like TableQuery object for table TwilioSmsLogEntries */
  lazy val TwilioSmsLogEntries = new TableQuery(tag => new TwilioSmsLogEntries(tag))
}
