package models
// AUTO-GENERATED Slick data model for table CourierBookings
trait CourierBookingsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierBookings
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param source Database column source SqlType(int8)
   *  @param dest Database column dest SqlType(int8)
   *  @param articles Database column articles SqlType(int8) */
  case class CourierBookingsRow(id: Long, source: Long, dest: Long, articles: Long)
  /** GetResult implicit for fetching CourierBookingsRow objects using plain SQL queries */
  implicit def GetResultCourierBookingsRow(implicit e0: GR[Long]): GR[CourierBookingsRow] = GR{
    prs => import prs._
    CourierBookingsRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table courier_bookings. Objects of this class serve as prototypes for rows in queries. */
  class CourierBookings(_tableTag: Tag) extends profile.api.Table[CourierBookingsRow](_tableTag, "courier_bookings") {
    def * = (id, source, dest, articles) <> (CourierBookingsRow.tupled, CourierBookingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(source), Rep.Some(dest), Rep.Some(articles))).shaped.<>({r=>import r._; _1.map(_=> CourierBookingsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column source SqlType(int8) */
    val source: Rep[Long] = column[Long]("source")
    /** Database column dest SqlType(int8) */
    val dest: Rep[Long] = column[Long]("dest")
    /** Database column articles SqlType(int8) */
    val articles: Rep[Long] = column[Long]("articles")

    /** Foreign key referencing ArticleGroups (database name courier_bookings_articles_fkey) */
    lazy val articleGroupsFk = foreignKey("courier_bookings_articles_fkey", articles, ArticleGroups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Persons (database name courier_bookings_dest_fkey) */
    lazy val personsFk2 = foreignKey("courier_bookings_dest_fkey", dest, Persons)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Persons (database name courier_bookings_source_fkey) */
    lazy val personsFk3 = foreignKey("courier_bookings_source_fkey", source, Persons)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierBookings */
  lazy val CourierBookings = new TableQuery(tag => new CourierBookings(tag))
}
