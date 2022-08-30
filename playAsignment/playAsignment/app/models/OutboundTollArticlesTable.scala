package models
// AUTO-GENERATED Slick data model for table OutboundTollArticles
trait OutboundTollArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundTollArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param t1250line Database column t1250line SqlType(text) */
  case class OutboundTollArticlesRow(id: Long, consignmentId: Long, barcode: String, t1250line: String)
  /** GetResult implicit for fetching OutboundTollArticlesRow objects using plain SQL queries */
  implicit def GetResultOutboundTollArticlesRow(implicit e0: GR[Long], e1: GR[String]): GR[OutboundTollArticlesRow] = GR{
    prs => import prs._
    OutboundTollArticlesRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table outbound_toll_articles. Objects of this class serve as prototypes for rows in queries. */
  class OutboundTollArticles(_tableTag: Tag) extends profile.api.Table[OutboundTollArticlesRow](_tableTag, "outbound_toll_articles") {
    def * = (id, consignmentId, barcode, t1250line) <> (OutboundTollArticlesRow.tupled, OutboundTollArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(barcode), Rep.Some(t1250line))).shaped.<>({r=>import r._; _1.map(_=> OutboundTollArticlesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column t1250line SqlType(text) */
    val t1250line: Rep[String] = column[String]("t1250line")

    /** Foreign key referencing OutboundTollConsignments (database name outbound_toll_articles_consignment_id_fkey) */
    lazy val outboundTollConsignmentsFk = foreignKey("outbound_toll_articles_consignment_id_fkey", consignmentId, OutboundTollConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OutboundTollArticles */
  lazy val OutboundTollArticles = new TableQuery(tag => new OutboundTollArticles(tag))
}
