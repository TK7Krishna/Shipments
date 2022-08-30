package models
// AUTO-GENERATED Slick data model for table InboundCpMessages
trait InboundCpMessagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundCpMessages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param body Database column body SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param article Database column article SqlType(int8), Default(None) */
  case class InboundCpMessagesRow(id: Long, body: Option[String] = None, createdAt: java.sql.Timestamp, article: Option[Long] = None)
  /** GetResult implicit for fetching InboundCpMessagesRow objects using plain SQL queries */
  implicit def GetResultInboundCpMessagesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Option[Long]]): GR[InboundCpMessagesRow] = GR{
    prs => import prs._
    InboundCpMessagesRow.tupled((<<[Long], <<?[String], <<[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table inbound_cp_messages. Objects of this class serve as prototypes for rows in queries. */
  class InboundCpMessages(_tableTag: Tag) extends profile.api.Table[InboundCpMessagesRow](_tableTag, "inbound_cp_messages") {
    def * = (id, body, createdAt, article) <> (InboundCpMessagesRow.tupled, InboundCpMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), body, Rep.Some(createdAt), article)).shaped.<>({r=>import r._; _1.map(_=> InboundCpMessagesRow.tupled((_1.get, _2, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column body SqlType(text), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column article SqlType(int8), Default(None) */
    val article: Rep[Option[Long]] = column[Option[Long]]("article", O.Default(None))

    /** Foreign key referencing InboundCpArticles (database name inbound_cp_messages_article_fkey) */
    lazy val inboundCpArticlesFk = foreignKey("inbound_cp_messages_article_fkey", article, InboundCpArticles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundCpMessages */
  lazy val InboundCpMessages = new TableQuery(tag => new InboundCpMessages(tag))
}
