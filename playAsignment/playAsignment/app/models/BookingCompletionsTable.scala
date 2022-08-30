package models
// AUTO-GENERATED Slick data model for table BookingCompletions
trait BookingCompletionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BookingCompletions
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param reference Database column reference SqlType(text)
   *  @param price Database column price SqlType(int8)
   *  @param trackingLink Database column tracking_link SqlType(text) */
  case class BookingCompletionsRow(id: Long, reference: String, price: Long, trackingLink: String)
  /** GetResult implicit for fetching BookingCompletionsRow objects using plain SQL queries */
  implicit def GetResultBookingCompletionsRow(implicit e0: GR[Long], e1: GR[String]): GR[BookingCompletionsRow] = GR{
    prs => import prs._
    BookingCompletionsRow.tupled((<<[Long], <<[String], <<[Long], <<[String]))
  }
  /** Table description of table booking_completions. Objects of this class serve as prototypes for rows in queries. */
  class BookingCompletions(_tableTag: Tag) extends profile.api.Table[BookingCompletionsRow](_tableTag, Some("zoom2u"), "booking_completions") {
    def * = (id, reference, price, trackingLink) <> (BookingCompletionsRow.tupled, BookingCompletionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(reference), Rep.Some(price), Rep.Some(trackingLink))).shaped.<>({r=>import r._; _1.map(_=> BookingCompletionsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column reference SqlType(text) */
    val reference: Rep[String] = column[String]("reference")
    /** Database column price SqlType(int8) */
    val price: Rep[Long] = column[Long]("price")
    /** Database column tracking_link SqlType(text) */
    val trackingLink: Rep[String] = column[String]("tracking_link")
  }
  /** Collection-like TableQuery object for table BookingCompletions */
  lazy val BookingCompletions = new TableQuery(tag => new BookingCompletions(tag))
}
