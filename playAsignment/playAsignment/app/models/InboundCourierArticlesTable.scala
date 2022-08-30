package models
// AUTO-GENERATED Slick data model for table InboundCourierArticles
trait InboundCourierArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundCourierArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param weight Database column weight SqlType(int4), Default(None)
   *  @param volume Database column volume SqlType(int4), Default(None) */
  case class InboundCourierArticlesRow(id: Long, consignment: Long, barcode: String, weight: Option[Int] = None, volume: Option[Int] = None)
  /** GetResult implicit for fetching InboundCourierArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundCourierArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Int]]): GR[InboundCourierArticlesRow] = GR{
    prs => import prs._
    InboundCourierArticlesRow.tupled((<<[Long], <<[Long], <<[String], <<?[Int], <<?[Int]))
  }
  /** Table description of table inbound_courier_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundCourierArticles(_tableTag: Tag) extends profile.api.Table[InboundCourierArticlesRow](_tableTag, "inbound_courier_articles") {
    def * = (id, consignment, barcode, weight, volume) <> (InboundCourierArticlesRow.tupled, InboundCourierArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(barcode), weight, volume)).shaped.<>({r=>import r._; _1.map(_=> InboundCourierArticlesRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing InboundCourierConsignments (database name inbound_courier_articles_consignment_fkey) */
    lazy val inboundCourierConsignmentsFk = foreignKey("inbound_courier_articles_consignment_fkey", consignment, InboundCourierConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundCourierArticles */
  lazy val InboundCourierArticles = new TableQuery(tag => new InboundCourierArticles(tag))
}
