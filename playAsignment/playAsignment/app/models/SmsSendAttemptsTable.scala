package models
// AUTO-GENERATED Slick data model for table SmsSendAttempts
trait SmsSendAttemptsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SmsSendAttempts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param message Database column message SqlType(int8)
   *  @param httpStatus Database column http_status SqlType(int4), Default(None)
   *  @param response Database column response SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param smsExtId Database column sms_ext_id SqlType(text), Default(None) */
  case class SmsSendAttemptsRow(id: Long, message: Long, httpStatus: Option[Int] = None, response: Option[String] = None, createdAt: Option[java.sql.Timestamp], smsExtId: Option[String] = None)
  /** GetResult implicit for fetching SmsSendAttemptsRow objects using plain SQL queries */
  implicit def GetResultSmsSendAttemptsRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[SmsSendAttemptsRow] = GR{
    prs => import prs._
    SmsSendAttemptsRow.tupled((<<[Long], <<[Long], <<?[Int], <<?[String], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table sms_send_attempts. Objects of this class serve as prototypes for rows in queries. */
  class SmsSendAttempts(_tableTag: Tag) extends profile.api.Table[SmsSendAttemptsRow](_tableTag, "sms_send_attempts") {
    def * = (id, message, httpStatus, response, createdAt, smsExtId) <> (SmsSendAttemptsRow.tupled, SmsSendAttemptsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(message), httpStatus, response, createdAt, smsExtId)).shaped.<>({r=>import r._; _1.map(_=> SmsSendAttemptsRow.tupled((_1.get, _2.get, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column message SqlType(int8) */
    val message: Rep[Long] = column[Long]("message")
    /** Database column http_status SqlType(int4), Default(None) */
    val httpStatus: Rep[Option[Int]] = column[Option[Int]]("http_status", O.Default(None))
    /** Database column response SqlType(text), Default(None) */
    val response: Rep[Option[String]] = column[Option[String]]("response", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column sms_ext_id SqlType(text), Default(None) */
    val smsExtId: Rep[Option[String]] = column[Option[String]]("sms_ext_id", O.Default(None))

    /** Foreign key referencing SmsOutboundMessages (database name sms_send_attempts_message_fkey) */
    lazy val smsOutboundMessagesFk = foreignKey("sms_send_attempts_message_fkey", message, SmsOutboundMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (smsExtId) (database name sms_send_attempts_sms_ext_id_idx) */
    val index1 = index("sms_send_attempts_sms_ext_id_idx", smsExtId)
  }
  /** Collection-like TableQuery object for table SmsSendAttempts */
  lazy val SmsSendAttempts = new TableQuery(tag => new SmsSendAttempts(tag))
}
