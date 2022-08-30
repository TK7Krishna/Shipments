package models
// AUTO-GENERATED Slick data model for table ArticleLockerHistory
trait ArticleLockerHistoryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArticleLockerHistory
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param article Database column article SqlType(int8)
   *  @param lockerState Database column locker_state SqlType(int8) */
  case class ArticleLockerHistoryRow(id: Long, article: Long, lockerState: Long)
  /** GetResult implicit for fetching ArticleLockerHistoryRow objects using plain SQL queries */
  implicit def GetResultArticleLockerHistoryRow(implicit e0: GR[Long]): GR[ArticleLockerHistoryRow] = GR{
    prs => import prs._
    ArticleLockerHistoryRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table article_locker_history. Objects of this class serve as prototypes for rows in queries. */
  class ArticleLockerHistory(_tableTag: Tag) extends profile.api.Table[ArticleLockerHistoryRow](_tableTag, "article_locker_history") {
    def * = (id, article, lockerState) <> (ArticleLockerHistoryRow.tupled, ArticleLockerHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(article), Rep.Some(lockerState))).shaped.<>({r=>import r._; _1.map(_=> ArticleLockerHistoryRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article SqlType(int8) */
    val article: Rep[Long] = column[Long]("article")
    /** Database column locker_state SqlType(int8) */
    val lockerState: Rep[Long] = column[Long]("locker_state")

    /** Foreign key referencing Articles (database name article_locker_history_article_fkey) */
    lazy val articlesFk = foreignKey("article_locker_history_article_fkey", article, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LockerStateHistory (database name article_locker_history_locker_state_fkey) */
    lazy val lockerStateHistoryFk = foreignKey("article_locker_history_locker_state_fkey", lockerState, LockerStateHistory)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (article,lockerState) (database name article_locker_history_unique) */
    val index1 = index("article_locker_history_unique", (article, lockerState), unique=true)
  }
  /** Collection-like TableQuery object for table ArticleLockerHistory */
  lazy val ArticleLockerHistory = new TableQuery(tag => new ArticleLockerHistory(tag))
}
