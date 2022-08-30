package models
// AUTO-GENERATED Slick data model for table Requests
trait RequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Requests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param method Database column method SqlType(text), Default(None)
   *  @param uriPath Database column uri_path SqlType(text), Default(None)
   *  @param query Database column query SqlType(text), Default(None)
   *  @param body Database column body SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class RequestsRow(id: Long, method: Option[String] = None, uriPath: Option[String] = None, query: Option[String] = None, body: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching RequestsRow objects using plain SQL queries */
  implicit def GetResultRequestsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[RequestsRow] = GR{
    prs => import prs._
    RequestsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table requests. Objects of this class serve as prototypes for rows in queries. */
  class Requests(_tableTag: Tag) extends profile.api.Table[RequestsRow](_tableTag, Some("pakpobox"), "requests") {
    def * = (id, method, uriPath, query, body, createdAt) <> (RequestsRow.tupled, RequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), method, uriPath, query, body, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> RequestsRow.tupled((_1.get, _2, _3, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column method SqlType(text), Default(None) */
    val method: Rep[Option[String]] = column[Option[String]]("method", O.Default(None))
    /** Database column uri_path SqlType(text), Default(None) */
    val uriPath: Rep[Option[String]] = column[Option[String]]("uri_path", O.Default(None))
    /** Database column query SqlType(text), Default(None) */
    val query: Rep[Option[String]] = column[Option[String]]("query", O.Default(None))
    /** Database column body SqlType(text), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table Requests */
  lazy val Requests = new TableQuery(tag => new Requests(tag))
}
