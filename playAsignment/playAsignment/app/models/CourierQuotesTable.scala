package models
// AUTO-GENERATED Slick data model for table CourierQuotes
trait CourierQuotesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierQuotes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param booking Database column booking SqlType(int8) */
  case class CourierQuotesRow(id: Long, booking: Long)
  /** GetResult implicit for fetching CourierQuotesRow objects using plain SQL queries */
  implicit def GetResultCourierQuotesRow(implicit e0: GR[Long]): GR[CourierQuotesRow] = GR{
    prs => import prs._
    CourierQuotesRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table courier_quotes. Objects of this class serve as prototypes for rows in queries. */
  class CourierQuotes(_tableTag: Tag) extends profile.api.Table[CourierQuotesRow](_tableTag, "courier_quotes") {
    def * = (id, booking) <> (CourierQuotesRow.tupled, CourierQuotesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(booking))).shaped.<>({r=>import r._; _1.map(_=> CourierQuotesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column booking SqlType(int8) */
    val booking: Rep[Long] = column[Long]("booking")

    /** Foreign key referencing CourierBookings (database name courier_quotes_booking_fkey) */
    lazy val courierBookingsFk = foreignKey("courier_quotes_booking_fkey", booking, CourierBookings)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierQuotes */
  lazy val CourierQuotes = new TableQuery(tag => new CourierQuotes(tag))
}
