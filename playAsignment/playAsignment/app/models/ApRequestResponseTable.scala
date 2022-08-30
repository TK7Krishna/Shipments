package models
// AUTO-GENERATED Slick data model for table ApRequestResponse
trait ApRequestResponseTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ApRequestResponse
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param method Database column method SqlType(text), Default(None)
   *  @param uriPath Database column uri_path SqlType(text), Default(None)
   *  @param httpVersion Database column http_version SqlType(text), Default(None)
   *  @param query Database column query SqlType(text), Default(None)
   *  @param requestBody Database column request_body SqlType(text), Default(None)
   *  @param responseBody Database column response_body SqlType(text), Default(None)
   *  @param apWebhookLogsId Database column ap_webhook_logs_id SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class ApRequestResponseRow(id: Long, method: Option[String] = None, uriPath: Option[String] = None, httpVersion: Option[String] = None, query: Option[String] = None, requestBody: Option[String] = None, responseBody: Option[String] = None, apWebhookLogsId: Option[Long] = None, createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching ApRequestResponseRow objects using plain SQL queries */
  implicit def GetResultApRequestResponseRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]]): GR[ApRequestResponseRow] = GR{
    prs => import prs._
    ApRequestResponseRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table ap_request_response. Objects of this class serve as prototypes for rows in queries. */
  class ApRequestResponse(_tableTag: Tag) extends profile.api.Table[ApRequestResponseRow](_tableTag, Some("ecommerce"), "ap_request_response") {
    def * = (id, method, uriPath, httpVersion, query, requestBody, responseBody, apWebhookLogsId, createdAt, modifiedAt) <> (ApRequestResponseRow.tupled, ApRequestResponseRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), method, uriPath, httpVersion, query, requestBody, responseBody, apWebhookLogsId, createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> ApRequestResponseRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column method SqlType(text), Default(None) */
    val method: Rep[Option[String]] = column[Option[String]]("method", O.Default(None))
    /** Database column uri_path SqlType(text), Default(None) */
    val uriPath: Rep[Option[String]] = column[Option[String]]("uri_path", O.Default(None))
    /** Database column http_version SqlType(text), Default(None) */
    val httpVersion: Rep[Option[String]] = column[Option[String]]("http_version", O.Default(None))
    /** Database column query SqlType(text), Default(None) */
    val query: Rep[Option[String]] = column[Option[String]]("query", O.Default(None))
    /** Database column request_body SqlType(text), Default(None) */
    val requestBody: Rep[Option[String]] = column[Option[String]]("request_body", O.Default(None))
    /** Database column response_body SqlType(text), Default(None) */
    val responseBody: Rep[Option[String]] = column[Option[String]]("response_body", O.Default(None))
    /** Database column ap_webhook_logs_id SqlType(int8), Default(None) */
    val apWebhookLogsId: Rep[Option[Long]] = column[Option[Long]]("ap_webhook_logs_id", O.Default(None))
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table ApRequestResponse */
  lazy val ApRequestResponse = new TableQuery(tag => new ApRequestResponse(tag))
}
