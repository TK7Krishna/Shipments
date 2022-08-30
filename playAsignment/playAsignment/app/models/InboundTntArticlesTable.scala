package models
// AUTO-GENERATED Slick data model for table InboundTntArticles
trait InboundTntArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundTntArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param parcelId Database column parcel_id SqlType(text) */
  case class InboundTntArticlesRow(id: Long, consignment: Long, parcelId: String)
  /** GetResult implicit for fetching InboundTntArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundTntArticlesRow(implicit e0: GR[Long], e1: GR[String]): GR[InboundTntArticlesRow] = GR{
    prs => import prs._
    InboundTntArticlesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table inbound_tnt_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundTntArticles(_tableTag: Tag) extends profile.api.Table[InboundTntArticlesRow](_tableTag, "inbound_tnt_articles") {
    def * = (id, consignment, parcelId) <> (InboundTntArticlesRow.tupled, InboundTntArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(parcelId))).shaped.<>({r=>import r._; _1.map(_=> InboundTntArticlesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column parcel_id SqlType(text) */
    val parcelId: Rep[String] = column[String]("parcel_id")

    /** Foreign key referencing InboundTntConsignments (database name inbound_tnt_articles_consignment_fkey) */
    lazy val inboundTntConsignmentsFk = foreignKey("inbound_tnt_articles_consignment_fkey", consignment, InboundTntConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundTntArticles */
  lazy val InboundTntArticles = new TableQuery(tag => new InboundTntArticles(tag))
}
