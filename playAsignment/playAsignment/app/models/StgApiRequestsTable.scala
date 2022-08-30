package models
// AUTO-GENERATED Slick data model for table StgApiRequests
trait StgApiRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgApiRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param method Database column method SqlType(text)
   *  @param url Database column url SqlType(text)
   *  @param headers Database column headers SqlType(json), Length(2147483647,false)
   *  @param sourceIp Database column source_ip SqlType(text), Default(None)
   *  @param queryStringRaw Database column query_string_raw SqlType(text)
   *  @param bodyRaw Database column body_raw SqlType(text) */
  case class StgApiRequestsRow(id: Long, location: Option[String] = None, createdAt: java.sql.Timestamp, method: String, url: String, headers: String, sourceIp: Option[String] = None, queryStringRaw: String, bodyRaw: String)
  /** GetResult implicit for fetching StgApiRequestsRow objects using plain SQL queries */
  implicit def GetResultStgApiRequestsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[StgApiRequestsRow] = GR{
    prs => import prs._
    StgApiRequestsRow.tupled((<<[Long], <<?[String], <<[java.sql.Timestamp], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[String]))
  }
  /** Table description of table stg_api_requests. Objects of this class serve as prototypes for rows in queries. */
  class StgApiRequests(_tableTag: Tag) extends profile.api.Table[StgApiRequestsRow](_tableTag, Some("seven_eleven"), "stg_api_requests") {
    def * = (id, location, createdAt, method, url, headers, sourceIp, queryStringRaw, bodyRaw) <> (StgApiRequestsRow.tupled, StgApiRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), location, Rep.Some(createdAt), Rep.Some(method), Rep.Some(url), Rep.Some(headers), sourceIp, Rep.Some(queryStringRaw), Rep.Some(bodyRaw))).shaped.<>({r=>import r._; _1.map(_=> StgApiRequestsRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(text), Default(None) */
    val location: Rep[Option[String]] = column[Option[String]]("location", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column method SqlType(text) */
    val method: Rep[String] = column[String]("method")
    /** Database column url SqlType(text) */
    val url: Rep[String] = column[String]("url")
    /** Database column headers SqlType(json), Length(2147483647,false) */
    val headers: Rep[String] = column[String]("headers", O.Length(2147483647,varying=false))
    /** Database column source_ip SqlType(text), Default(None) */
    val sourceIp: Rep[Option[String]] = column[Option[String]]("source_ip", O.Default(None))
    /** Database column query_string_raw SqlType(text) */
    val queryStringRaw: Rep[String] = column[String]("query_string_raw")
    /** Database column body_raw SqlType(text) */
    val bodyRaw: Rep[String] = column[String]("body_raw")
  }
  /** Collection-like TableQuery object for table StgApiRequests */
  lazy val StgApiRequests = new TableQuery(tag => new StgApiRequests(tag))
}
