package models
// AUTO-GENERATED Slick data model for table DropboxEvents
trait DropboxEventsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DropboxEvents
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param lockerUnit Database column locker_unit SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param dropinId Database column dropin_id SqlType(int8), Default(None)
   *  @param dropoutId Database column dropout_id SqlType(int8), Default(None)
   *  @param dropinTime Database column dropin_time SqlType(timestamptz), Default(None)
   *  @param dropoutTime Database column dropout_time SqlType(timestamptz), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class DropboxEventsRow(id: Long, lockerUnit: Long, consignmentNumber: String, dropinId: Option[Long] = None, dropoutId: Option[Long] = None, dropinTime: Option[java.sql.Timestamp] = None, dropoutTime: Option[java.sql.Timestamp] = None, modifiedAt: java.sql.Timestamp, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching DropboxEventsRow objects using plain SQL queries */
  implicit def GetResultDropboxEventsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp]): GR[DropboxEventsRow] = GR{
    prs => import prs._
    DropboxEventsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Long], <<?[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table dropbox_events. Objects of this class serve as prototypes for rows in queries. */
  class DropboxEvents(_tableTag: Tag) extends profile.api.Table[DropboxEventsRow](_tableTag, Some("locker"), "dropbox_events") {
    def * = (id, lockerUnit, consignmentNumber, dropinId, dropoutId, dropinTime, dropoutTime, modifiedAt, createdAt) <> (DropboxEventsRow.tupled, DropboxEventsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(lockerUnit), Rep.Some(consignmentNumber), dropinId, dropoutId, dropinTime, dropoutTime, Rep.Some(modifiedAt), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> DropboxEventsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column locker_unit SqlType(int8) */
    val lockerUnit: Rep[Long] = column[Long]("locker_unit")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column dropin_id SqlType(int8), Default(None) */
    val dropinId: Rep[Option[Long]] = column[Option[Long]]("dropin_id", O.Default(None))
    /** Database column dropout_id SqlType(int8), Default(None) */
    val dropoutId: Rep[Option[Long]] = column[Option[Long]]("dropout_id", O.Default(None))
    /** Database column dropin_time SqlType(timestamptz), Default(None) */
    val dropinTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("dropin_time", O.Default(None))
    /** Database column dropout_time SqlType(timestamptz), Default(None) */
    val dropoutTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("dropout_time", O.Default(None))
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table DropboxEvents */
  lazy val DropboxEvents = new TableQuery(tag => new DropboxEvents(tag))
}
