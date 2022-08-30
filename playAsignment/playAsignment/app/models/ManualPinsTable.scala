package models
// AUTO-GENERATED Slick data model for table ManualPins
trait ManualPinsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ManualPins
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param phoneNumber Database column phone_number SqlType(text)
   *  @param pin Database column pin SqlType(text)
   *  @param location Database column location SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param sms Database column sms SqlType(int8), Default(None)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param consignment Database column consignment SqlType(int8), Default(None)
   *  @param validated Database column validated SqlType(bool), Default(false) */
  case class ManualPinsRow(id: Long, phoneNumber: String, pin: String, location: Long, createdAt: java.sql.Timestamp, sms: Option[Long] = None, courier: Option[String] = None, consignment: Option[Long] = None, validated: Boolean = false)
  /** GetResult implicit for fetching ManualPinsRow objects using plain SQL queries */
  implicit def GetResultManualPinsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[Long]], e4: GR[Option[String]], e5: GR[Boolean]): GR[ManualPinsRow] = GR{
    prs => import prs._
    ManualPinsRow.tupled((<<[Long], <<[String], <<[String], <<[Long], <<[java.sql.Timestamp], <<?[Long], <<?[String], <<?[Long], <<[Boolean]))
  }
  /** Table description of table manual_pins. Objects of this class serve as prototypes for rows in queries. */
  class ManualPins(_tableTag: Tag) extends profile.api.Table[ManualPinsRow](_tableTag, "manual_pins") {
    def * = (id, phoneNumber, pin, location, createdAt, sms, courier, consignment, validated) <> (ManualPinsRow.tupled, ManualPinsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(phoneNumber), Rep.Some(pin), Rep.Some(location), Rep.Some(createdAt), sms, courier, consignment, Rep.Some(validated))).shaped.<>({r=>import r._; _1.map(_=> ManualPinsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column phone_number SqlType(text) */
    val phoneNumber: Rep[String] = column[String]("phone_number")
    /** Database column pin SqlType(text) */
    val pin: Rep[String] = column[String]("pin")
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column sms SqlType(int8), Default(None) */
    val sms: Rep[Option[Long]] = column[Option[Long]]("sms", O.Default(None))
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column consignment SqlType(int8), Default(None) */
    val consignment: Rep[Option[Long]] = column[Option[Long]]("consignment", O.Default(None))
    /** Database column validated SqlType(bool), Default(false) */
    val validated: Rep[Boolean] = column[Boolean]("validated", O.Default(false))

    /** Foreign key referencing Consignments (database name manual_pins_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("manual_pins_consignment_fkey", consignment, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name manual_pins_courier_fkey) */
    lazy val couriersFk = foreignKey("manual_pins_courier_fkey", courier, Couriers)(r => Rep.Some(r.code), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name manual_pins_location_fkey) */
    lazy val droplocationsFk = foreignKey("manual_pins_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SmsOutboundMessages (database name manual_pins_sms_fkey) */
    lazy val smsOutboundMessagesFk = foreignKey("manual_pins_sms_fkey", sms, SmsOutboundMessages)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ManualPins */
  lazy val ManualPins = new TableQuery(tag => new ManualPins(tag))
}
