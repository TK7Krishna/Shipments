package models
// AUTO-GENERATED Slick data model for table InboundDhlArticleMessages
trait InboundDhlArticleMessagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundDhlArticleMessages
   *  @param article Database column article SqlType(int8)
   *  @param decode Database column decode SqlType(int8) */
  case class InboundDhlArticleMessagesRow(article: Long, decode: Long)
  /** GetResult implicit for fetching InboundDhlArticleMessagesRow objects using plain SQL queries */
  implicit def GetResultInboundDhlArticleMessagesRow(implicit e0: GR[Long]): GR[InboundDhlArticleMessagesRow] = GR{
    prs => import prs._
    InboundDhlArticleMessagesRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table inbound_dhl_article_messages. Objects of this class serve as prototypes for rows in queries. */
  class InboundDhlArticleMessages(_tableTag: Tag) extends profile.api.Table[InboundDhlArticleMessagesRow](_tableTag, "inbound_dhl_article_messages") {
    def * = (article, decode) <> (InboundDhlArticleMessagesRow.tupled, InboundDhlArticleMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(article), Rep.Some(decode))).shaped.<>({r=>import r._; _1.map(_=> InboundDhlArticleMessagesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column article SqlType(int8) */
    val article: Rep[Long] = column[Long]("article")
    /** Database column decode SqlType(int8) */
    val decode: Rep[Long] = column[Long]("decode")

    /** Primary key of InboundDhlArticleMessages (database name inbound_dhl_article_messages_pkey) */
    val pk = primaryKey("inbound_dhl_article_messages_pkey", (article, decode))

    /** Foreign key referencing InboundDhlArticles (database name inbound_dhl_article_messages_article_fkey) */
    lazy val inboundDhlArticlesFk = foreignKey("inbound_dhl_article_messages_article_fkey", article, InboundDhlArticles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing InboundDhlMessages (database name inbound_dhl_article_messages_decode_fkey) */
    lazy val inboundDhlMessagesFk = foreignKey("inbound_dhl_article_messages_decode_fkey", decode, InboundDhlMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundDhlArticleMessages */
  lazy val InboundDhlArticleMessages = new TableQuery(tag => new InboundDhlArticleMessages(tag))
}
