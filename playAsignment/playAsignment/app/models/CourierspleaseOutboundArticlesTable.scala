package models
// AUTO-GENERATED Slick data model for table CourierspleaseOutboundArticles
trait CourierspleaseOutboundArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseOutboundArticles
   *  @param article Database column article SqlType(int8), PrimaryKey
   *  @param packageCode Database column package_code SqlType(text) */
  case class CourierspleaseOutboundArticlesRow(article: Long, packageCode: String)
  /** GetResult implicit for fetching CourierspleaseOutboundArticlesRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseOutboundArticlesRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierspleaseOutboundArticlesRow] = GR{
    prs => import prs._
    CourierspleaseOutboundArticlesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table couriersplease_outbound_articles. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseOutboundArticles(_tableTag: Tag) extends profile.api.Table[CourierspleaseOutboundArticlesRow](_tableTag, "couriersplease_outbound_articles") {
    def * = (article, packageCode) <> (CourierspleaseOutboundArticlesRow.tupled, CourierspleaseOutboundArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(article), Rep.Some(packageCode))).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseOutboundArticlesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column article SqlType(int8), PrimaryKey */
    val article: Rep[Long] = column[Long]("article", O.PrimaryKey)
    /** Database column package_code SqlType(text) */
    val packageCode: Rep[String] = column[String]("package_code")

    /** Foreign key referencing Articles (database name couriersplease_outbound_articles_article_fkey) */
    lazy val articlesFk = foreignKey("couriersplease_outbound_articles_article_fkey", article, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CourierspleasePackageCodes (database name couriersplease_outbound_articles_package_code_fkey) */
    lazy val courierspleasePackageCodesFk = foreignKey("couriersplease_outbound_articles_package_code_fkey", packageCode, CourierspleasePackageCodes)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierspleaseOutboundArticles */
  lazy val CourierspleaseOutboundArticles = new TableQuery(tag => new CourierspleaseOutboundArticles(tag))
}
