package models
// AUTO-GENERATED Slick data model for table ResponseHeaders
trait ResponseHeadersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ResponseHeaders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param response Database column response SqlType(int8)
   *  @param name Database column name SqlType(text)
   *  @param value Database column value SqlType(text) */
  case class ResponseHeadersRow(id: Long, response: Long, name: String, value: String)
  /** GetResult implicit for fetching ResponseHeadersRow objects using plain SQL queries */
  implicit def GetResultResponseHeadersRow(implicit e0: GR[Long], e1: GR[String]): GR[ResponseHeadersRow] = GR{
    prs => import prs._
    ResponseHeadersRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table response_headers. Objects of this class serve as prototypes for rows in queries. */
  class ResponseHeaders(_tableTag: Tag) extends profile.api.Table[ResponseHeadersRow](_tableTag, Some("http"), "response_headers") {
    def * = (id, response, name, value) <> (ResponseHeadersRow.tupled, ResponseHeadersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(response), Rep.Some(name), Rep.Some(value))).shaped.<>({r=>import r._; _1.map(_=> ResponseHeadersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column response SqlType(int8) */
    val response: Rep[Long] = column[Long]("response")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column value SqlType(text) */
    val value: Rep[String] = column[String]("value")

    /** Foreign key referencing Responses (database name response_headers_response_fkey) */
    lazy val responsesFk = foreignKey("response_headers_response_fkey", response, Responses)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ResponseHeaders */
  lazy val ResponseHeaders = new TableQuery(tag => new ResponseHeaders(tag))
}
