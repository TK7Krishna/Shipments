package models
// AUTO-GENERATED Slick data model for table ClickandcollectArticles
trait ClickandcollectArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ClickandcollectArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param clickandcollectConsignmentId Database column clickandcollect_consignment_id SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param weight Database column weight SqlType(int4), Default(None)
   *  @param volume Database column volume SqlType(int4), Default(None) */
  case class ClickandcollectArticlesRow(id: Long, clickandcollectConsignmentId: Long, barcode: String, weight: Option[Int] = None, volume: Option[Int] = None)
  /** GetResult implicit for fetching ClickandcollectArticlesRow objects using plain SQL queries */
  implicit def GetResultClickandcollectArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Int]]): GR[ClickandcollectArticlesRow] = GR{
    prs => import prs._
    ClickandcollectArticlesRow.tupled((<<[Long], <<[Long], <<[String], <<?[Int], <<?[Int]))
  }
  /** Table description of table clickandcollect_articles. Objects of this class serve as prototypes for rows in queries. */
  class ClickandcollectArticles(_tableTag: Tag) extends profile.api.Table[ClickandcollectArticlesRow](_tableTag, Some("ecommerce"), "clickandcollect_articles") {
    def * = (id, clickandcollectConsignmentId, barcode, weight, volume) <> (ClickandcollectArticlesRow.tupled, ClickandcollectArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(clickandcollectConsignmentId), Rep.Some(barcode), weight, volume)).shaped.<>({r=>import r._; _1.map(_=> ClickandcollectArticlesRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column clickandcollect_consignment_id SqlType(int8) */
    val clickandcollectConsignmentId: Rep[Long] = column[Long]("clickandcollect_consignment_id")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column weight SqlType(int4), Default(None) */
    val weight: Rep[Option[Int]] = column[Option[Int]]("weight", O.Default(None))
    /** Database column volume SqlType(int4), Default(None) */
    val volume: Rep[Option[Int]] = column[Option[Int]]("volume", O.Default(None))

    /** Foreign key referencing ClickandcollectConsignments (database name clickandcollect_articles_clickandcollect_consignment_fkey) */
    lazy val clickandcollectConsignmentsFk = foreignKey("clickandcollect_articles_clickandcollect_consignment_fkey", clickandcollectConsignmentId, ClickandcollectConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (barcode) (database name ecommerce_article_barcode_trgm) */
    val index1 = index("ecommerce_article_barcode_trgm", barcode)
  }
  /** Collection-like TableQuery object for table ClickandcollectArticles */
  lazy val ClickandcollectArticles = new TableQuery(tag => new ClickandcollectArticles(tag))
}
