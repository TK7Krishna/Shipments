package models
// AUTO-GENERATED Slick data model for table BookingRequests
trait BookingRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BookingRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param pickup Database column pickup SqlType(int8)
   *  @param dropoff Database column dropoff SqlType(int8)
   *  @param isSuccess Database column is_success SqlType(bool), Default(None)
   *  @param bookingCompletion Database column booking_completion SqlType(int8), Default(None)
   *  @param packageDescription Database column package_description SqlType(text), Default(None)
   *  @param readyDateTime Database column ready_date_time SqlType(timestamptz), Default(None)
   *  @param deliverySpeed Database column delivery_speed SqlType(text), Default(None)
   *  @param vehicleType Database column vehicle_type SqlType(text), Default(None)
   *  @param packageType Database column package_type SqlType(text), Default(None) */
  case class BookingRequestsRow(id: Long, pickup: Long, dropoff: Long, isSuccess: Option[Boolean] = None, bookingCompletion: Option[Long] = None, packageDescription: Option[String] = None, readyDateTime: Option[java.sql.Timestamp] = None, deliverySpeed: Option[String] = None, vehicleType: Option[String] = None, packageType: Option[String] = None)
  /** GetResult implicit for fetching BookingRequestsRow objects using plain SQL queries */
  implicit def GetResultBookingRequestsRow(implicit e0: GR[Long], e1: GR[Option[Boolean]], e2: GR[Option[Long]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[BookingRequestsRow] = GR{
    prs => import prs._
    BookingRequestsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[Boolean], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table booking_requests. Objects of this class serve as prototypes for rows in queries. */
  class BookingRequests(_tableTag: Tag) extends profile.api.Table[BookingRequestsRow](_tableTag, Some("zoom2u"), "booking_requests") {
    def * = (id, pickup, dropoff, isSuccess, bookingCompletion, packageDescription, readyDateTime, deliverySpeed, vehicleType, packageType) <> (BookingRequestsRow.tupled, BookingRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(pickup), Rep.Some(dropoff), isSuccess, bookingCompletion, packageDescription, readyDateTime, deliverySpeed, vehicleType, packageType)).shaped.<>({r=>import r._; _1.map(_=> BookingRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column pickup SqlType(int8) */
    val pickup: Rep[Long] = column[Long]("pickup")
    /** Database column dropoff SqlType(int8) */
    val dropoff: Rep[Long] = column[Long]("dropoff")
    /** Database column is_success SqlType(bool), Default(None) */
    val isSuccess: Rep[Option[Boolean]] = column[Option[Boolean]]("is_success", O.Default(None))
    /** Database column booking_completion SqlType(int8), Default(None) */
    val bookingCompletion: Rep[Option[Long]] = column[Option[Long]]("booking_completion", O.Default(None))
    /** Database column package_description SqlType(text), Default(None) */
    val packageDescription: Rep[Option[String]] = column[Option[String]]("package_description", O.Default(None))
    /** Database column ready_date_time SqlType(timestamptz), Default(None) */
    val readyDateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ready_date_time", O.Default(None))
    /** Database column delivery_speed SqlType(text), Default(None) */
    val deliverySpeed: Rep[Option[String]] = column[Option[String]]("delivery_speed", O.Default(None))
    /** Database column vehicle_type SqlType(text), Default(None) */
    val vehicleType: Rep[Option[String]] = column[Option[String]]("vehicle_type", O.Default(None))
    /** Database column package_type SqlType(text), Default(None) */
    val packageType: Rep[Option[String]] = column[Option[String]]("package_type", O.Default(None))

    /** Foreign key referencing BookingCompletions (database name booking_requests_booking_completion_fkey) */
    lazy val bookingCompletionsFk = foreignKey("booking_requests_booking_completion_fkey", bookingCompletion, BookingCompletions)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Dropoffs (database name booking_requests_dropoff_fkey) */
    lazy val dropoffsFk = foreignKey("booking_requests_dropoff_fkey", dropoff, Dropoffs)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Pickups (database name booking_requests_pickup_fkey) */
    lazy val pickupsFk = foreignKey("booking_requests_pickup_fkey", pickup, Pickups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table BookingRequests */
  lazy val BookingRequests = new TableQuery(tag => new BookingRequests(tag))
}
