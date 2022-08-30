package models
// AUTO-GENERATED Slick data model for table Articlestatehistory
trait ArticlestatehistoryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Articlestatehistory
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param article Database column article SqlType(int8)
   *  @param state Database column state SqlType(int8)
   *  @param time Database column time SqlType(timestamptz)
   *  @param location Database column location SqlType(int8), Default(None)
   *  @param postProcessingComplete Database column post_processing_complete SqlType(timestamptz), Default(None)
   *  @param nextAttemptAt Database column next_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(None)
   *  @param lastResult Database column last_result SqlType(text), Default(None) */
  case class ArticlestatehistoryRow(id: Long, article: Long, state: Long, time: java.sql.Timestamp, location: Option[Long] = None, postProcessingComplete: Option[java.sql.Timestamp] = None, nextAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = None, lastResult: Option[String] = None)
  /** GetResult implicit for fetching ArticlestatehistoryRow objects using plain SQL queries */
  implicit def GetResultArticlestatehistoryRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Int]], e5: GR[Option[String]]): GR[ArticlestatehistoryRow] = GR{
    prs => import prs._
    ArticlestatehistoryRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<?[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int], <<?[String]))
  }
  /** Table description of table articlestatehistory. Objects of this class serve as prototypes for rows in queries. */
  class Articlestatehistory(_tableTag: Tag) extends profile.api.Table[ArticlestatehistoryRow](_tableTag, "articlestatehistory") {
    def * = (id, article, state, time, location, postProcessingComplete, nextAttemptAt, attemptCount, lastResult) <> (ArticlestatehistoryRow.tupled, ArticlestatehistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(article), Rep.Some(state), Rep.Some(time), location, postProcessingComplete, nextAttemptAt, attemptCount, lastResult)).shaped.<>({r=>import r._; _1.map(_=> ArticlestatehistoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article SqlType(int8) */
    val article: Rep[Long] = column[Long]("article")
    /** Database column state SqlType(int8) */
    val state: Rep[Long] = column[Long]("state")
    /** Database column time SqlType(timestamptz) */
    val time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("time")
    /** Database column location SqlType(int8), Default(None) */
    val location: Rep[Option[Long]] = column[Option[Long]]("location", O.Default(None))
    /** Database column post_processing_complete SqlType(timestamptz), Default(None) */
    val postProcessingComplete: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("post_processing_complete", O.Default(None))
    /** Database column next_attempt_at SqlType(timestamptz), Default(None) */
    val nextAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(None) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(None))
    /** Database column last_result SqlType(text), Default(None) */
    val lastResult: Rep[Option[String]] = column[Option[String]]("last_result", O.Default(None))

    /** Foreign key referencing Articles (database name articlestatehistory_article_fkey) */
    lazy val articlesFk = foreignKey("articlestatehistory_article_fkey", article, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Articlestates (database name articlestatehistory_state_fkey) */
    lazy val articlestatesFk = foreignKey("articlestatehistory_state_fkey", state, Articlestates)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name articlestatehistory_location_fkey) */
    lazy val droplocationsFk = foreignKey("articlestatehistory_location_fkey", location, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (id,article,state,time) (database name articlestatehistory_article_idx_article_state_time) */
    val index1 = index("articlestatehistory_article_idx_article_state_time", (id, article, state, time))
    /** Index over (article,time,id) (database name articlestatehistory_article_time_id_idx) */
    val index2 = index("articlestatehistory_article_time_id_idx", (article, time, id))
    /** Index over (article,time) (database name articlestatehistory_article_time_idx) */
    val index3 = index("articlestatehistory_article_time_idx", (article, time))
    /** Index over (location,article,time) (database name articlestatehistory_location_article_time_idx) */
    val index4 = index("articlestatehistory_location_article_time_idx", (location, article, time))
    /** Index over (nextAttemptAt) (database name articlestatehistory_next_attempt_at_idx) */
    val index5 = index("articlestatehistory_next_attempt_at_idx", nextAttemptAt)
    /** Index over (state,article) (database name articlestatehistory_state_article_idx) */
    val index6 = index("articlestatehistory_state_article_idx", (state, article))
    /** Index over (state,location) (database name articlestatehistory_state_location_idx) */
    val index7 = index("articlestatehistory_state_location_idx", (state, location))
    /** Index over (state,time) (database name articlestatehistory_state_time_idx) */
    val index8 = index("articlestatehistory_state_time_idx", (state, time))
    /** Index over (time) (database name articlestatehistory_time_idx) */
    val index9 = index("articlestatehistory_time_idx", time)
  }
  /** Collection-like TableQuery object for table Articlestatehistory */
  lazy val Articlestatehistory = new TableQuery(tag => new Articlestatehistory(tag))
}
