package models
// AUTO-GENERATED Slick data model for table Articles
trait ArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Articles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param partOf Database column part_of SqlType(int8)
   *  @param weight Database column weight SqlType(int4), Default(None)
   *  @param volume Database column volume SqlType(int4), Default(None)
   *  @param notes Database column notes SqlType(text), Default(None)
   *  @param barcode Database column barcode SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class ArticlesRow(id: Long, partOf: Long, weight: Option[Int] = None, volume: Option[Int] = None, notes: Option[String] = None, barcode: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ArticlesRow objects using plain SQL queries */
  implicit def GetResultArticlesRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[ArticlesRow] = GR{
    prs => import prs._
    ArticlesRow.tupled((<<[Long], <<[Long], <<?[Int], <<?[Int], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table articles. Objects of this class serve as prototypes for rows in queries. */
  class Articles(_tableTag: Tag) extends profile.api.Table[ArticlesRow](_tableTag, "articles") {
    def * = (id, partOf, weight, volume, notes, barcode, createdAt) <> (ArticlesRow.tupled, ArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(partOf), weight, volume, notes, barcode, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> ArticlesRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column part_of SqlType(int8) */
    val partOf: Rep[Long] = column[Long]("part_of")
    /** Database column weight SqlType(int4), Default(None) */
    val weight: Rep[Option[Int]] = column[Option[Int]]("weight", O.Default(None))
    /** Database column volume SqlType(int4), Default(None) */
    val volume: Rep[Option[Int]] = column[Option[Int]]("volume", O.Default(None))
    /** Database column notes SqlType(text), Default(None) */
    val notes: Rep[Option[String]] = column[Option[String]]("notes", O.Default(None))
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing ArticleGroups (database name articles_part_of_fkey) */
    lazy val articleGroupsFk = foreignKey("articles_part_of_fkey", partOf, ArticleGroups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (barcode) (database name article_barcode_trgm) */
    val index1 = index("article_barcode_trgm", barcode)
    /** Index over (barcode) (database name articles_barcode_idx) */
    val index2 = index("articles_barcode_idx", barcode)
    /** Uniqueness Index over (barcode) (database name articles_barcode_key) */
    val index3 = index("articles_barcode_key", barcode, unique=true)
  }
  /** Collection-like TableQuery object for table Articles */
  lazy val Articles = new TableQuery(tag => new Articles(tag))
}
