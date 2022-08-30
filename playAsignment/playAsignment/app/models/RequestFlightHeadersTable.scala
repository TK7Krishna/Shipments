package models
// AUTO-GENERATED Slick data model for table RequestFlightHeaders
trait RequestFlightHeadersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RequestFlightHeaders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param request Database column request SqlType(int8)
   *  @param name Database column name SqlType(text)
   *  @param value Database column value SqlType(text) */
  case class RequestFlightHeadersRow(id: Long, request: Long, name: String, value: String)
  /** GetResult implicit for fetching RequestFlightHeadersRow objects using plain SQL queries */
  implicit def GetResultRequestFlightHeadersRow(implicit e0: GR[Long], e1: GR[String]): GR[RequestFlightHeadersRow] = GR{
    prs => import prs._
    RequestFlightHeadersRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table request_flight_headers. Objects of this class serve as prototypes for rows in queries. */
  class RequestFlightHeaders(_tableTag: Tag) extends profile.api.Table[RequestFlightHeadersRow](_tableTag, Some("http"), "request_flight_headers") {
    def * = (id, request, name, value) <> (RequestFlightHeadersRow.tupled, RequestFlightHeadersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(request), Rep.Some(name), Rep.Some(value))).shaped.<>({r=>import r._; _1.map(_=> RequestFlightHeadersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column value SqlType(text) */
    val value: Rep[String] = column[String]("value")

    /** Foreign key referencing Requests (database name request_flight_headers_request_fkey) */
    lazy val requestsFk = foreignKey("request_flight_headers_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table RequestFlightHeaders */
  lazy val RequestFlightHeaders = new TableQuery(tag => new RequestFlightHeaders(tag))
}
