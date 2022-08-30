package models
// AUTO-GENERATED Slick data model for table ArticleStages
trait ArticleStagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArticleStages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param articleId Database column article_id SqlType(int8), Default(None)
   *  @param publicConsignmentId Database column public_consignment_id SqlType(int8), Default(None)
   *  @param status Database column status SqlType(text), Default(None)
   *  @param label Database column label SqlType(int8), Default(None)
   *  @param createdOn Database column created_on SqlType(timestamptz) */
  case class ArticleStagesRow(id: Long, consignmentId: Option[Long] = None, articleId: Option[Long] = None, publicConsignmentId: Option[Long] = None, status: Option[String] = None, label: Option[Long] = None, createdOn: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching ArticleStagesRow objects using plain SQL queries */
  implicit def GetResultArticleStagesRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[ArticleStagesRow] = GR{
    prs => import prs._
    ArticleStagesRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<?[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table article_stages. Objects of this class serve as prototypes for rows in queries. */
  class ArticleStages(_tableTag: Tag) extends profile.api.Table[ArticleStagesRow](_tableTag, Some("consumer"), "article_stages") {
    def * = (id, consignmentId, articleId, publicConsignmentId, status, label, createdOn) <> (ArticleStagesRow.tupled, ArticleStagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), consignmentId, articleId, publicConsignmentId, status, label, createdOn)).shaped.<>({r=>import r._; _1.map(_=> ArticleStagesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column article_id SqlType(int8), Default(None) */
    val articleId: Rep[Option[Long]] = column[Option[Long]]("article_id", O.Default(None))
    /** Database column public_consignment_id SqlType(int8), Default(None) */
    val publicConsignmentId: Rep[Option[Long]] = column[Option[Long]]("public_consignment_id", O.Default(None))
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column label SqlType(int8), Default(None) */
    val label: Rep[Option[Long]] = column[Option[Long]]("label", O.Default(None))
    /** Database column created_on SqlType(timestamptz) */
    val createdOn: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_on")
  }
  /** Collection-like TableQuery object for table ArticleStages */
  lazy val ArticleStages = new TableQuery(tag => new ArticleStages(tag))
}
