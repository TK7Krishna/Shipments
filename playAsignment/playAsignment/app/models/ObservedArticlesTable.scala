package models
// AUTO-GENERATED Slick data model for table ObservedArticles
trait ObservedArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ObservedArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param authenticArticle Database column authentic_article SqlType(int8), Default(None)
   *  @param spuriousArticle Database column spurious_article SqlType(int8), Default(None)
   *  @param discarded Database column discarded SqlType(timestamptz), Default(None) */
  case class ObservedArticlesRow(id: Long, location: Long, createdAt: java.sql.Timestamp, authenticArticle: Option[Long] = None, spuriousArticle: Option[Long] = None, discarded: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching ObservedArticlesRow objects using plain SQL queries */
  implicit def GetResultObservedArticlesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]]): GR[ObservedArticlesRow] = GR{
    prs => import prs._
    ObservedArticlesRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp], <<?[Long], <<?[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table observed_articles. Objects of this class serve as prototypes for rows in queries. */
  class ObservedArticles(_tableTag: Tag) extends profile.api.Table[ObservedArticlesRow](_tableTag, "observed_articles") {
    def * = (id, location, createdAt, authenticArticle, spuriousArticle, discarded) <> (ObservedArticlesRow.tupled, ObservedArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(createdAt), authenticArticle, spuriousArticle, discarded)).shaped.<>({r=>import r._; _1.map(_=> ObservedArticlesRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column authentic_article SqlType(int8), Default(None) */
    val authenticArticle: Rep[Option[Long]] = column[Option[Long]]("authentic_article", O.Default(None))
    /** Database column spurious_article SqlType(int8), Default(None) */
    val spuriousArticle: Rep[Option[Long]] = column[Option[Long]]("spurious_article", O.Default(None))
    /** Database column discarded SqlType(timestamptz), Default(None) */
    val discarded: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("discarded", O.Default(None))

    /** Foreign key referencing Articles (database name observed_articles_authentic_article_fkey) */
    lazy val articlesFk1 = foreignKey("observed_articles_authentic_article_fkey", authenticArticle, Articles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Articles (database name observed_articles_spurious_article_fkey) */
    lazy val articlesFk2 = foreignKey("observed_articles_spurious_article_fkey", spuriousArticle, Articles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name observed_articles_location_fkey) */
    lazy val droplocationsFk = foreignKey("observed_articles_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ObservedArticles */
  lazy val ObservedArticles = new TableQuery(tag => new ObservedArticles(tag))
}
