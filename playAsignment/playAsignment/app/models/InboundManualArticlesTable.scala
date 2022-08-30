package models
// AUTO-GENERATED Slick data model for table InboundManualArticles
trait InboundManualArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundManualArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8) */
  case class InboundManualArticlesRow(id: Long, consignment: Long)
  /** GetResult implicit for fetching InboundManualArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundManualArticlesRow(implicit e0: GR[Long]): GR[InboundManualArticlesRow] = GR{
    prs => import prs._
    InboundManualArticlesRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table inbound_manual_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundManualArticles(_tableTag: Tag) extends profile.api.Table[InboundManualArticlesRow](_tableTag, "inbound_manual_articles") {
    def * = (id, consignment) <> (InboundManualArticlesRow.tupled, InboundManualArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment))).shaped.<>({r=>import r._; _1.map(_=> InboundManualArticlesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")

    /** Foreign key referencing InboundManualConsignments (database name inbound_manual_articles_consignment_fkey) */
    lazy val inboundManualConsignmentsFk = foreignKey("inbound_manual_articles_consignment_fkey", consignment, InboundManualConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundManualArticles */
  lazy val InboundManualArticles = new TableQuery(tag => new InboundManualArticles(tag))
}
