package models
// AUTO-GENERATED Slick data model for table HeartbeatHistory
trait HeartbeatHistoryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HeartbeatHistory
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param lockerUnit Database column locker_unit SqlType(int8)
   *  @param receivedAt Database column received_at SqlType(timestamptz) */
  case class HeartbeatHistoryRow(id: Long, lockerUnit: Long, receivedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching HeartbeatHistoryRow objects using plain SQL queries */
  implicit def GetResultHeartbeatHistoryRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp]): GR[HeartbeatHistoryRow] = GR{
    prs => import prs._
    HeartbeatHistoryRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table heartbeat_history. Objects of this class serve as prototypes for rows in queries. */
  class HeartbeatHistory(_tableTag: Tag) extends profile.api.Table[HeartbeatHistoryRow](_tableTag, Some("locker"), "heartbeat_history") {
    def * = (id, lockerUnit, receivedAt) <> (HeartbeatHistoryRow.tupled, HeartbeatHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(lockerUnit), Rep.Some(receivedAt))).shaped.<>({r=>import r._; _1.map(_=> HeartbeatHistoryRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column locker_unit SqlType(int8) */
    val lockerUnit: Rep[Long] = column[Long]("locker_unit")
    /** Database column received_at SqlType(timestamptz) */
    val receivedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("received_at")

    /** Foreign key referencing LockerUnits (database name heartbeat_history_locker_unit_fkey) */
    lazy val lockerUnitsFk = foreignKey("heartbeat_history_locker_unit_fkey", lockerUnit, LockerUnits)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (receivedAt) (database name heartbeat_history_received_at_idx) */
    val index1 = index("heartbeat_history_received_at_idx", receivedAt)
  }
  /** Collection-like TableQuery object for table HeartbeatHistory */
  lazy val HeartbeatHistory = new TableQuery(tag => new HeartbeatHistory(tag))
}
