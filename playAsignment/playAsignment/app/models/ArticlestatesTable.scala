package models
// AUTO-GENERATED Slick data model for table Articlestates
trait ArticlestatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Articlestates
   *  @param id Database column id SqlType(int8), PrimaryKey
   *  @param state Database column state SqlType(text) */
  case class ArticlestatesRow(id: Long, state: String)
  /** GetResult implicit for fetching ArticlestatesRow objects using plain SQL queries */
  implicit def GetResultArticlestatesRow(implicit e0: GR[Long], e1: GR[String]): GR[ArticlestatesRow] = GR{
    prs => import prs._
    ArticlestatesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table articlestates. Objects of this class serve as prototypes for rows in queries. */
  class Articlestates(_tableTag: Tag) extends profile.api.Table[ArticlestatesRow](_tableTag, "articlestates") {
    def * = (id, state) <> (ArticlestatesRow.tupled, ArticlestatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(state))).shaped.<>({r=>import r._; _1.map(_=> ArticlestatesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int8), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
  }
  /** Collection-like TableQuery object for table Articlestates */
  lazy val Articlestates = new TableQuery(tag => new Articlestates(tag))
}
