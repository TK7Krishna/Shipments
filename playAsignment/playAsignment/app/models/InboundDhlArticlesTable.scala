package models
// AUTO-GENERATED Slick data model for table InboundDhlArticles
trait InboundDhlArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundDhlArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param labelNumber Database column label_number SqlType(text) */
  case class InboundDhlArticlesRow(id: Long, consignment: Long, labelNumber: String)
  /** GetResult implicit for fetching InboundDhlArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundDhlArticlesRow(implicit e0: GR[Long], e1: GR[String]): GR[InboundDhlArticlesRow] = GR{
    prs => import prs._
    InboundDhlArticlesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table inbound_dhl_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundDhlArticles(_tableTag: Tag) extends profile.api.Table[InboundDhlArticlesRow](_tableTag, "inbound_dhl_articles") {
    def * = (id, consignment, labelNumber) <> (InboundDhlArticlesRow.tupled, InboundDhlArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(labelNumber))).shaped.<>({r=>import r._; _1.map(_=> InboundDhlArticlesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column label_number SqlType(text) */
    val labelNumber: Rep[String] = column[String]("label_number")

    /** Foreign key referencing InboundDhlConsignments (database name inbound_dhl_articles_consignment_fkey) */
    lazy val inboundDhlConsignmentsFk = foreignKey("inbound_dhl_articles_consignment_fkey", consignment, InboundDhlConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundDhlArticles */
  lazy val InboundDhlArticles = new TableQuery(tag => new InboundDhlArticles(tag))
}
