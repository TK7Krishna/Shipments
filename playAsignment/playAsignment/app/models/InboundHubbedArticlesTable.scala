package models
// AUTO-GENERATED Slick data model for table InboundHubbedArticles
trait InboundHubbedArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundHubbedArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param barcode Database column barcode SqlType(text) */
  case class InboundHubbedArticlesRow(id: Long, consignmentId: Long, barcode: String)
  /** GetResult implicit for fetching InboundHubbedArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundHubbedArticlesRow(implicit e0: GR[Long], e1: GR[String]): GR[InboundHubbedArticlesRow] = GR{
    prs => import prs._
    InboundHubbedArticlesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table inbound_hubbed_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundHubbedArticles(_tableTag: Tag) extends profile.api.Table[InboundHubbedArticlesRow](_tableTag, Some("standard_apis"), "inbound_hubbed_articles") {
    def * = (id, consignmentId, barcode) <> (InboundHubbedArticlesRow.tupled, InboundHubbedArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(barcode))).shaped.<>({r=>import r._; _1.map(_=> InboundHubbedArticlesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")

    /** Foreign key referencing InboundHubbedConsignments (database name inbound_hubbed_articles_consignment_fkey) */
    lazy val inboundHubbedConsignmentsFk = foreignKey("inbound_hubbed_articles_consignment_fkey", consignmentId, InboundHubbedConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundHubbedArticles */
  lazy val InboundHubbedArticles = new TableQuery(tag => new InboundHubbedArticles(tag))
}
