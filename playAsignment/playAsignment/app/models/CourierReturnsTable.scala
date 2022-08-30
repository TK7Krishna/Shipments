package models
// AUTO-GENERATED Slick data model for table CourierReturns
trait CourierReturnsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierReturns
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param source Database column source SqlType(int8)
   *  @param courier Database column courier SqlType(text)
   *  @param articles Database column articles SqlType(int8) */
  case class CourierReturnsRow(id: Long, source: Long, courier: String, articles: Long)
  /** GetResult implicit for fetching CourierReturnsRow objects using plain SQL queries */
  implicit def GetResultCourierReturnsRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierReturnsRow] = GR{
    prs => import prs._
    CourierReturnsRow.tupled((<<[Long], <<[Long], <<[String], <<[Long]))
  }
  /** Table description of table courier_returns. Objects of this class serve as prototypes for rows in queries. */
  class CourierReturns(_tableTag: Tag) extends profile.api.Table[CourierReturnsRow](_tableTag, "courier_returns") {
    def * = (id, source, courier, articles) <> (CourierReturnsRow.tupled, CourierReturnsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(source), Rep.Some(courier), Rep.Some(articles))).shaped.<>({r=>import r._; _1.map(_=> CourierReturnsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column source SqlType(int8) */
    val source: Rep[Long] = column[Long]("source")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column articles SqlType(int8) */
    val articles: Rep[Long] = column[Long]("articles")

    /** Foreign key referencing ArticleGroups (database name courier_returns_articles_fkey) */
    lazy val articleGroupsFk = foreignKey("courier_returns_articles_fkey", articles, ArticleGroups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name courier_returns_courier_fkey) */
    lazy val couriersFk = foreignKey("courier_returns_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Persons (database name courier_returns_source_fkey) */
    lazy val personsFk = foreignKey("courier_returns_source_fkey", source, Persons)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierReturns */
  lazy val CourierReturns = new TableQuery(tag => new CourierReturns(tag))
}
