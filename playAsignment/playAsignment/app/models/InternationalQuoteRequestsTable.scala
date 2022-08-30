package models
// AUTO-GENERATED Slick data model for table InternationalQuoteRequests
trait InternationalQuoteRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalQuoteRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param quote Database column quote SqlType(int8)
   *  @param request Database column request SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InternationalQuoteRequestsRow(id: Long, quote: Long, request: Long, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InternationalQuoteRequestsRow objects using plain SQL queries */
  implicit def GetResultInternationalQuoteRequestsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp]): GR[InternationalQuoteRequestsRow] = GR{
    prs => import prs._
    InternationalQuoteRequestsRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table international_quote_requests. Objects of this class serve as prototypes for rows in queries. */
  class InternationalQuoteRequests(_tableTag: Tag) extends profile.api.Table[InternationalQuoteRequestsRow](_tableTag, Some("cpapi"), "international_quote_requests") {
    def * = (id, quote, request, createdAt) <> (InternationalQuoteRequestsRow.tupled, InternationalQuoteRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(quote), Rep.Some(request), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InternationalQuoteRequestsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column quote SqlType(int8) */
    val quote: Rep[Long] = column[Long]("quote")
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing InternationalQuotes (database name international_quote_requests_quote_fkey) */
    lazy val internationalQuotesFk = foreignKey("international_quote_requests_quote_fkey", quote, InternationalQuotes)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Requests (database name international_quote_requests_request_fkey) */
    lazy val requestsFk = foreignKey("international_quote_requests_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalQuoteRequests */
  lazy val InternationalQuoteRequests = new TableQuery(tag => new InternationalQuoteRequests(tag))
}
