package models
// AUTO-GENERATED Slick data model for table KioskWebhooks
trait KioskWebhooksTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table KioskWebhooks
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payload Database column payload SqlType(text)
   *  @param retryCount Database column retry_count SqlType(int4)
   *  @param status Database column status SqlType(text), Default(None)
   *  @param responseBody Database column response_body SqlType(text), Default(None)
   *  @param processing Database column processing SqlType(bool), Default(false)
   *  @param processedAt Database column processed_at SqlType(timestamptz)
   *  @param lastRetry Database column last_retry SqlType(timestamptz)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param headers Database column headers SqlType(text), Default(None) */
  case class KioskWebhooksRow(id: Long, payload: String, retryCount: Int, status: Option[String] = None, responseBody: Option[String] = None, processing: Boolean = false, processedAt: Option[java.sql.Timestamp], lastRetry: java.sql.Timestamp, createdAt: java.sql.Timestamp, headers: Option[String] = None)
  /** GetResult implicit for fetching KioskWebhooksRow objects using plain SQL queries */
  implicit def GetResultKioskWebhooksRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Option[String]], e4: GR[Boolean], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[KioskWebhooksRow] = GR{
    prs => import prs._
    KioskWebhooksRow.tupled((<<[Long], <<[String], <<[Int], <<?[String], <<?[String], <<[Boolean], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table kiosk_webhooks. Objects of this class serve as prototypes for rows in queries. */
  class KioskWebhooks(_tableTag: Tag) extends profile.api.Table[KioskWebhooksRow](_tableTag, Some("sevenelevenkiosk_outbound"), "kiosk_webhooks") {
    def * = (id, payload, retryCount, status, responseBody, processing, processedAt, lastRetry, createdAt, headers) <> (KioskWebhooksRow.tupled, KioskWebhooksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payload), Rep.Some(retryCount), status, responseBody, Rep.Some(processing), processedAt, Rep.Some(lastRetry), Rep.Some(createdAt), headers)).shaped.<>({r=>import r._; _1.map(_=> KioskWebhooksRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7, _8.get, _9.get, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payload SqlType(text) */
    val payload: Rep[String] = column[String]("payload")
    /** Database column retry_count SqlType(int4) */
    val retryCount: Rep[Int] = column[Int]("retry_count")
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column response_body SqlType(text), Default(None) */
    val responseBody: Rep[Option[String]] = column[Option[String]]("response_body", O.Default(None))
    /** Database column processing SqlType(bool), Default(false) */
    val processing: Rep[Boolean] = column[Boolean]("processing", O.Default(false))
    /** Database column processed_at SqlType(timestamptz) */
    val processedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("processed_at")
    /** Database column last_retry SqlType(timestamptz) */
    val lastRetry: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_retry")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column headers SqlType(text), Default(None) */
    val headers: Rep[Option[String]] = column[Option[String]]("headers", O.Default(None))
  }
  /** Collection-like TableQuery object for table KioskWebhooks */
  lazy val KioskWebhooks = new TableQuery(tag => new KioskWebhooks(tag))
}
