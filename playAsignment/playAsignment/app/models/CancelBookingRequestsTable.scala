package models
// AUTO-GENERATED Slick data model for table CancelBookingRequests
trait CancelBookingRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CancelBookingRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param reference Database column reference SqlType(text)
   *  @param isSuccess Database column is_success SqlType(bool), Default(None) */
  case class CancelBookingRequestsRow(id: Long, reference: String, isSuccess: Option[Boolean] = None)
  /** GetResult implicit for fetching CancelBookingRequestsRow objects using plain SQL queries */
  implicit def GetResultCancelBookingRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]]): GR[CancelBookingRequestsRow] = GR{
    prs => import prs._
    CancelBookingRequestsRow.tupled((<<[Long], <<[String], <<?[Boolean]))
  }
  /** Table description of table cancel_booking_requests. Objects of this class serve as prototypes for rows in queries. */
  class CancelBookingRequests(_tableTag: Tag) extends profile.api.Table[CancelBookingRequestsRow](_tableTag, Some("zoom2u"), "cancel_booking_requests") {
    def * = (id, reference, isSuccess) <> (CancelBookingRequestsRow.tupled, CancelBookingRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(reference), isSuccess)).shaped.<>({r=>import r._; _1.map(_=> CancelBookingRequestsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column reference SqlType(text) */
    val reference: Rep[String] = column[String]("reference")
    /** Database column is_success SqlType(bool), Default(None) */
    val isSuccess: Rep[Option[Boolean]] = column[Option[Boolean]]("is_success", O.Default(None))
  }
  /** Collection-like TableQuery object for table CancelBookingRequests */
  lazy val CancelBookingRequests = new TableQuery(tag => new CancelBookingRequests(tag))
}
