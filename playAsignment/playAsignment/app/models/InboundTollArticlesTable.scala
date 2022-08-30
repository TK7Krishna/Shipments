package models
// AUTO-GENERATED Slick data model for table InboundTollArticles
trait InboundTollArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundTollArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param weight Database column weight SqlType(int4), Default(None)
   *  @param volume Database column volume SqlType(int4), Default(None) */
  case class InboundTollArticlesRow(id: Long, consignment: Long, barcode: String, weight: Option[Int] = None, volume: Option[Int] = None)
  /** GetResult implicit for fetching InboundTollArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundTollArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Int]]): GR[InboundTollArticlesRow] = GR{
    prs => import prs._
    InboundTollArticlesRow.tupled((<<[Long], <<[Long], <<[String], <<?[Int], <<?[Int]))
  }
  /** Table description of table inbound_toll_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundTollArticles(_tableTag: Tag) extends profile.api.Table[InboundTollArticlesRow](_tableTag, "inbound_toll_articles") {
    def * = (id, consignment, barcode, weight, volume) <> (InboundTollArticlesRow.tupled, InboundTollArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(barcode), weight, volume)).shaped.<>({r=>import r._; _1.map(_=> InboundTollArticlesRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column weight SqlType(int4), Default(None) */
    val weight: Rep[Option[Int]] = column[Option[Int]]("weight", O.Default(None))
    /** Database column volume SqlType(int4), Default(None) */
    val volume: Rep[Option[Int]] = column[Option[Int]]("volume", O.Default(None))

    /** Foreign key referencing InboundTollConsignments (database name inbound_toll_articles_consignment_fkey) */
    lazy val inboundTollConsignmentsFk = foreignKey("inbound_toll_articles_consignment_fkey", consignment, InboundTollConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundTollArticles */
  lazy val InboundTollArticles = new TableQuery(tag => new InboundTollArticles(tag))
}
