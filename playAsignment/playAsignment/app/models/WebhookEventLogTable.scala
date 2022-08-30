package models
// AUTO-GENERATED Slick data model for table WebhookEventLog
trait WebhookEventLogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookEventLog
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param barcode Database column barcode SqlType(text)
   *  @param reason Database column reason SqlType(text)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param locationId Database column location_id SqlType(int8)
   *  @param lockerId Database column locker_id SqlType(int8), Default(None)
   *  @param driverIdentifier Database column driver_identifier SqlType(text), Default(None)
   *  @param eventType Database column event_type SqlType(text), Default(None)
   *  @param createdOn Database column created_on SqlType(timestamptz) */
  case class WebhookEventLogRow(id: Long, barcode: String, reason: String, courier: Option[String] = None, locationId: Long, lockerId: Option[Long] = None, driverIdentifier: Option[String] = None, eventType: Option[String] = None, createdOn: java.sql.Timestamp)
  /** GetResult implicit for fetching WebhookEventLogRow objects using plain SQL queries */
  implicit def GetResultWebhookEventLogRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[java.sql.Timestamp]): GR[WebhookEventLogRow] = GR{
    prs => import prs._
    WebhookEventLogRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<[Long], <<?[Long], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table webhook_event_log. Objects of this class serve as prototypes for rows in queries. */
  class WebhookEventLog(_tableTag: Tag) extends profile.api.Table[WebhookEventLogRow](_tableTag, Some("locker"), "webhook_event_log") {
    def * = (id, barcode, reason, courier, locationId, lockerId, driverIdentifier, eventType, createdOn) <> (WebhookEventLogRow.tupled, WebhookEventLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(barcode), Rep.Some(reason), courier, Rep.Some(locationId), lockerId, driverIdentifier, eventType, Rep.Some(createdOn))).shaped.<>({r=>import r._; _1.map(_=> WebhookEventLogRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column reason SqlType(text) */
    val reason: Rep[String] = column[String]("reason")
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column location_id SqlType(int8) */
    val locationId: Rep[Long] = column[Long]("location_id")
    /** Database column locker_id SqlType(int8), Default(None) */
    val lockerId: Rep[Option[Long]] = column[Option[Long]]("locker_id", O.Default(None))
    /** Database column driver_identifier SqlType(text), Default(None) */
    val driverIdentifier: Rep[Option[String]] = column[Option[String]]("driver_identifier", O.Default(None))
    /** Database column event_type SqlType(text), Default(None) */
    val eventType: Rep[Option[String]] = column[Option[String]]("event_type", O.Default(None))
    /** Database column created_on SqlType(timestamptz) */
    val createdOn: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_on")

    /** Foreign key referencing Couriers (database name webhook_event_log_courier_fkey) */
    lazy val couriersFk = foreignKey("webhook_event_log_courier_fkey", courier, Couriers)(r => Rep.Some(r.code), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name webhook_event_log_location_id_fkey) */
    lazy val droplocationsFk = foreignKey("webhook_event_log_location_id_fkey", locationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Lockers (database name webhook_event_log_locker_id_fkey) */
    lazy val lockersFk = foreignKey("webhook_event_log_locker_id_fkey", lockerId, Lockers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table WebhookEventLog */
  lazy val WebhookEventLog = new TableQuery(tag => new WebhookEventLog(tag))
}
