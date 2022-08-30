package models
// AUTO-GENERATED Slick data model for table ArticleGroups
trait ArticleGroupsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArticleGroups
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey */
  case class ArticleGroupsRow(id: Long)
  /** GetResult implicit for fetching ArticleGroupsRow objects using plain SQL queries */
  implicit def GetResultArticleGroupsRow(implicit e0: GR[Long]): GR[ArticleGroupsRow] = GR{
    prs => import prs._
    ArticleGroupsRow(<<[Long])
  }
  /** Table description of table article_groups. Objects of this class serve as prototypes for rows in queries. */
  class ArticleGroups(_tableTag: Tag) extends profile.api.Table[ArticleGroupsRow](_tableTag, "article_groups") {
    def * = id <> (ArticleGroupsRow, ArticleGroupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id)).shaped.<>(r => r.map(_=> ArticleGroupsRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table ArticleGroups */
  lazy val ArticleGroups = new TableQuery(tag => new ArticleGroups(tag))
}
