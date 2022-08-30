package models
// AUTO-GENERATED Slick data model for table LocationBpayActivationRequests
trait LocationBpayActivationRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LocationBpayActivationRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param email Database column email SqlType(int8)
   *  @param requestedAt Database column requested_at SqlType(timestamptz) */
  case class LocationBpayActivationRequestsRow(id: Long, location: Long, email: Long, requestedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching LocationBpayActivationRequestsRow objects using plain SQL queries */
  implicit def GetResultLocationBpayActivationRequestsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp]): GR[LocationBpayActivationRequestsRow] = GR{
    prs => import prs._
    LocationBpayActivationRequestsRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table location_bpay_activation_requests. Objects of this class serve as prototypes for rows in queries. */
  class LocationBpayActivationRequests(_tableTag: Tag) extends profile.api.Table[LocationBpayActivationRequestsRow](_tableTag, "location_bpay_activation_requests") {
    def * = (id, location, email, requestedAt) <> (LocationBpayActivationRequestsRow.tupled, LocationBpayActivationRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(email), Rep.Some(requestedAt))).shaped.<>({r=>import r._; _1.map(_=> LocationBpayActivationRequestsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column email SqlType(int8) */
    val email: Rep[Long] = column[Long]("email")
    /** Database column requested_at SqlType(timestamptz) */
    val requestedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("requested_at")

    /** Foreign key referencing Droplocations (database name location_bpay_activation_requests_location_fkey) */
    lazy val droplocationsFk = foreignKey("location_bpay_activation_requests_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Sends (database name location_bpay_activation_requests_email_fkey) */
    lazy val sendsFk = foreignKey("location_bpay_activation_requests_email_fkey", email, Sends)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LocationBpayActivationRequests */
  lazy val LocationBpayActivationRequests = new TableQuery(tag => new LocationBpayActivationRequests(tag))
}
