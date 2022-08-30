package models
// AUTO-GENERATED Slick data model for table CourierReportEmails
trait CourierReportEmailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierReportEmails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param reportType Database column report_type SqlType(int4)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int4)
   *  @param email Database column email SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamp), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamp), Default(None) */
  case class CourierReportEmailsRow(id: Long, reportType: Int, hubbedUserId: Int, email: String, createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching CourierReportEmailsRow objects using plain SQL queries */
  implicit def GetResultCourierReportEmailsRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[String], e3: GR[Option[java.sql.Timestamp]]): GR[CourierReportEmailsRow] = GR{
    prs => import prs._
    CourierReportEmailsRow.tupled((<<[Long], <<[Int], <<[Int], <<[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table courier_report_emails. Objects of this class serve as prototypes for rows in queries. */
  class CourierReportEmails(_tableTag: Tag) extends profile.api.Table[CourierReportEmailsRow](_tableTag, Some("reports"), "courier_report_emails") {
    def * = (id, reportType, hubbedUserId, email, createdAt, modifiedAt) <> (CourierReportEmailsRow.tupled, CourierReportEmailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(reportType), Rep.Some(hubbedUserId), Rep.Some(email), createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> CourierReportEmailsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column report_type SqlType(int4) */
    val reportType: Rep[Int] = column[Int]("report_type")
    /** Database column hubbed_user_id SqlType(int4) */
    val hubbedUserId: Rep[Int] = column[Int]("hubbed_user_id")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column created_at SqlType(timestamp), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column modified_at SqlType(timestamp), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name courier_report_emails_fk_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("courier_report_emails_fk_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ReportTypes (database name report_type_fkey) */
    lazy val reportTypesFk = foreignKey("report_type_fkey", reportType, ReportTypes)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierReportEmails */
  lazy val CourierReportEmails = new TableQuery(tag => new CourierReportEmails(tag))
}
