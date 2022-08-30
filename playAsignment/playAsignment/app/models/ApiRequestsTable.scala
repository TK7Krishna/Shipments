package models
// AUTO-GENERATED Slick data model for table ApiRequests
trait ApiRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ApiRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text), Default(None)
   *  @param httpVersion Database column http_version SqlType(text), Default(None)
   *  @param uriPath Database column uri_path SqlType(text), Default(None)
   *  @param query Database column query SqlType(text), Default(None)
   *  @param responseBody Database column response_body SqlType(text), Default(None)
   *  @param requestBody Database column request_body SqlType(text), Default(None)
   *  @param externalPath Database column external_path SqlType(text), Default(None)
   *  @param internalPath Database column internal_path SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param eventtype Database column eventtype SqlType(text), Default(None)
   *  @param consignmentnumber Database column consignmentnumber SqlType(text), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(Some(0))
   *  @param browser Database column browser SqlType(text), Default(None) */
  case class ApiRequestsRow(id: Long, courierCode: Option[String] = None, httpVersion: Option[String] = None, uriPath: Option[String] = None, query: Option[String] = None, responseBody: Option[String] = None, requestBody: Option[String] = None, externalPath: Option[String] = None, internalPath: Option[String] = None, createdAt: java.sql.Timestamp, eventtype: Option[String] = None, consignmentnumber: Option[String] = None, hubbedUserId: Option[Long] = Some(0L), browser: Option[String] = None)
  /** GetResult implicit for fetching ApiRequestsRow objects using plain SQL queries */
  implicit def GetResultApiRequestsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Option[Long]]): GR[ApiRequestsRow] = GR{
    prs => import prs._
    ApiRequestsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[Long], <<?[String]))
  }
  /** Table description of table api_requests. Objects of this class serve as prototypes for rows in queries. */
  class ApiRequests(_tableTag: Tag) extends profile.api.Table[ApiRequestsRow](_tableTag, Some("standard_apis"), "api_requests") {
    def * = (id, courierCode, httpVersion, uriPath, query, responseBody, requestBody, externalPath, internalPath, createdAt, eventtype, consignmentnumber, hubbedUserId, browser) <> (ApiRequestsRow.tupled, ApiRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), courierCode, httpVersion, uriPath, query, responseBody, requestBody, externalPath, internalPath, Rep.Some(createdAt), eventtype, consignmentnumber, hubbedUserId, browser)).shaped.<>({r=>import r._; _1.map(_=> ApiRequestsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10.get, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text), Default(None) */
    val courierCode: Rep[Option[String]] = column[Option[String]]("courier_code", O.Default(None))
    /** Database column http_version SqlType(text), Default(None) */
    val httpVersion: Rep[Option[String]] = column[Option[String]]("http_version", O.Default(None))
    /** Database column uri_path SqlType(text), Default(None) */
    val uriPath: Rep[Option[String]] = column[Option[String]]("uri_path", O.Default(None))
    /** Database column query SqlType(text), Default(None) */
    val query: Rep[Option[String]] = column[Option[String]]("query", O.Default(None))
    /** Database column response_body SqlType(text), Default(None) */
    val responseBody: Rep[Option[String]] = column[Option[String]]("response_body", O.Default(None))
    /** Database column request_body SqlType(text), Default(None) */
    val requestBody: Rep[Option[String]] = column[Option[String]]("request_body", O.Default(None))
    /** Database column external_path SqlType(text), Default(None) */
    val externalPath: Rep[Option[String]] = column[Option[String]]("external_path", O.Default(None))
    /** Database column internal_path SqlType(text), Default(None) */
    val internalPath: Rep[Option[String]] = column[Option[String]]("internal_path", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column eventtype SqlType(text), Default(None) */
    val eventtype: Rep[Option[String]] = column[Option[String]]("eventtype", O.Default(None))
    /** Database column consignmentnumber SqlType(text), Default(None) */
    val consignmentnumber: Rep[Option[String]] = column[Option[String]]("consignmentnumber", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(Some(0)) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(Some(0L)))
    /** Database column browser SqlType(text), Default(None) */
    val browser: Rep[Option[String]] = column[Option[String]]("browser", O.Default(None))
  }
  /** Collection-like TableQuery object for table ApiRequests */
  lazy val ApiRequests = new TableQuery(tag => new ApiRequests(tag))
}
