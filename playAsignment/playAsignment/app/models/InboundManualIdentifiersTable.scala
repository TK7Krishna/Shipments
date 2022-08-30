package models
// AUTO-GENERATED Slick data model for table InboundManualIdentifiers
trait InboundManualIdentifiersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundManualIdentifiers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param article Database column article SqlType(int8)
   *  @param value Database column value SqlType(text) */
  case class InboundManualIdentifiersRow(id: Long, article: Long, value: String)
  /** GetResult implicit for fetching InboundManualIdentifiersRow objects using plain SQL queries */
  implicit def GetResultInboundManualIdentifiersRow(implicit e0: GR[Long], e1: GR[String]): GR[InboundManualIdentifiersRow] = GR{
    prs => import prs._
    InboundManualIdentifiersRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table inbound_manual_identifiers. Objects of this class serve as prototypes for rows in queries. */
  class InboundManualIdentifiers(_tableTag: Tag) extends profile.api.Table[InboundManualIdentifiersRow](_tableTag, "inbound_manual_identifiers") {
    def * = (id, article, value) <> (InboundManualIdentifiersRow.tupled, InboundManualIdentifiersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(article), Rep.Some(value))).shaped.<>({r=>import r._; _1.map(_=> InboundManualIdentifiersRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article SqlType(int8) */
    val article: Rep[Long] = column[Long]("article")
    /** Database column value SqlType(text) */
    val value: Rep[String] = column[String]("value")

    /** Foreign key referencing InboundManualArticles (database name inbound_manual_identifiers_article_fkey) */
    lazy val inboundManualArticlesFk = foreignKey("inbound_manual_identifiers_article_fkey", article, InboundManualArticles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundManualIdentifiers */
  lazy val InboundManualIdentifiers = new TableQuery(tag => new InboundManualIdentifiers(tag))
}
