package models
// AUTO-GENERATED Slick data model for table InternationalQuoteResponses
trait InternationalQuoteResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalQuoteResponses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param request Database column request SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param responseCode Database column response_code SqlType(text)
   *  @param msg Database column msg SqlType(text) */
  case class InternationalQuoteResponsesRow(id: Long, request: Long, createdAt: java.sql.Timestamp, responseCode: String, msg: String)
  /** GetResult implicit for fetching InternationalQuoteResponsesRow objects using plain SQL queries */
  implicit def GetResultInternationalQuoteResponsesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[InternationalQuoteResponsesRow] = GR{
    prs => import prs._
    InternationalQuoteResponsesRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table international_quote_responses. Objects of this class serve as prototypes for rows in queries. */
  class InternationalQuoteResponses(_tableTag: Tag) extends profile.api.Table[InternationalQuoteResponsesRow](_tableTag, Some("cpapi"), "international_quote_responses") {
    def * = (id, request, createdAt, responseCode, msg) <> (InternationalQuoteResponsesRow.tupled, InternationalQuoteResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(request), Rep.Some(createdAt), Rep.Some(responseCode), Rep.Some(msg))).shaped.<>({r=>import r._; _1.map(_=> InternationalQuoteResponsesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column response_code SqlType(text) */
    val responseCode: Rep[String] = column[String]("response_code")
    /** Database column msg SqlType(text) */
    val msg: Rep[String] = column[String]("msg")

    /** Foreign key referencing InternationalQuoteRequests (database name international_quote_responses_request_fkey) */
    lazy val internationalQuoteRequestsFk = foreignKey("international_quote_responses_request_fkey", request, InternationalQuoteRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalQuoteResponses */
  lazy val InternationalQuoteResponses = new TableQuery(tag => new InternationalQuoteResponses(tag))
}
