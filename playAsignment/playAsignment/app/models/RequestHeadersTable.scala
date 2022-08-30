package models
// AUTO-GENERATED Slick data model for table RequestHeaders
trait RequestHeadersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RequestHeaders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param request Database column request SqlType(int8)
   *  @param name Database column name SqlType(text)
   *  @param value Database column value SqlType(text) */
  case class RequestHeadersRow(id: Long, request: Long, name: String, value: String)
  /** GetResult implicit for fetching RequestHeadersRow objects using plain SQL queries */
  implicit def GetResultRequestHeadersRow(implicit e0: GR[Long], e1: GR[String]): GR[RequestHeadersRow] = GR{
    prs => import prs._
    RequestHeadersRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table request_headers. Objects of this class serve as prototypes for rows in queries. */
  class RequestHeaders(_tableTag: Tag) extends profile.api.Table[RequestHeadersRow](_tableTag, Some("http"), "request_headers") {
    def * = (id, request, name, value) <> (RequestHeadersRow.tupled, RequestHeadersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(request), Rep.Some(name), Rep.Some(value))).shaped.<>({r=>import r._; _1.map(_=> RequestHeadersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column value SqlType(text) */
    val value: Rep[String] = column[String]("value")

    /** Foreign key referencing Requests (database name request_headers_request_fkey) */
    lazy val requestsFk = foreignKey("request_headers_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table RequestHeaders */
  lazy val RequestHeaders = new TableQuery(tag => new RequestHeaders(tag))
}
