package models
// AUTO-GENERATED Slick data model for table ManualBookingConsignments
trait ManualBookingConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ManualBookingConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param specialInstructions Database column special_instructions SqlType(text), Default(None)
   *  @param referenceNumber Database column reference_number SqlType(text), Default(None)
   *  @param bookingEmail Database column booking_email SqlType(text)
   *  @param bookingEmailSent Database column booking_email_sent SqlType(timestamptz), Default(None) */
  case class ManualBookingConsignmentsRow(id: Long, specialInstructions: Option[String] = None, referenceNumber: Option[String] = None, bookingEmail: String, bookingEmailSent: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching ManualBookingConsignmentsRow objects using plain SQL queries */
  implicit def GetResultManualBookingConsignmentsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]]): GR[ManualBookingConsignmentsRow] = GR{
    prs => import prs._
    ManualBookingConsignmentsRow.tupled((<<[Long], <<?[String], <<?[String], <<[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table manual_booking_consignments. Objects of this class serve as prototypes for rows in queries. */
  class ManualBookingConsignments(_tableTag: Tag) extends profile.api.Table[ManualBookingConsignmentsRow](_tableTag, "manual_booking_consignments") {
    def * = (id, specialInstructions, referenceNumber, bookingEmail, bookingEmailSent) <> (ManualBookingConsignmentsRow.tupled, ManualBookingConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), specialInstructions, referenceNumber, Rep.Some(bookingEmail), bookingEmailSent)).shaped.<>({r=>import r._; _1.map(_=> ManualBookingConsignmentsRow.tupled((_1.get, _2, _3, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column special_instructions SqlType(text), Default(None) */
    val specialInstructions: Rep[Option[String]] = column[Option[String]]("special_instructions", O.Default(None))
    /** Database column reference_number SqlType(text), Default(None) */
    val referenceNumber: Rep[Option[String]] = column[Option[String]]("reference_number", O.Default(None))
    /** Database column booking_email SqlType(text) */
    val bookingEmail: Rep[String] = column[String]("booking_email")
    /** Database column booking_email_sent SqlType(timestamptz), Default(None) */
    val bookingEmailSent: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("booking_email_sent", O.Default(None))
  }
  /** Collection-like TableQuery object for table ManualBookingConsignments */
  lazy val ManualBookingConsignments = new TableQuery(tag => new ManualBookingConsignments(tag))
}
