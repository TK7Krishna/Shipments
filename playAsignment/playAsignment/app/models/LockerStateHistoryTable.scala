package models
// AUTO-GENERATED Slick data model for table LockerStateHistory
trait LockerStateHistoryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LockerStateHistory
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param locker Database column locker SqlType(int8)
   *  @param state Database column state SqlType(text)
   *  @param time Database column time SqlType(timestamptz)
   *  @param webhook Database column webhook SqlType(int8), Default(None)
   *  @param adminUser Database column admin_user SqlType(int8), Default(None) */
  case class LockerStateHistoryRow(id: Long, locker: Long, state: String, time: java.sql.Timestamp, webhook: Option[Long] = None, adminUser: Option[Long] = None)
  /** GetResult implicit for fetching LockerStateHistoryRow objects using plain SQL queries */
  implicit def GetResultLockerStateHistoryRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[Long]]): GR[LockerStateHistoryRow] = GR{
    prs => import prs._
    LockerStateHistoryRow.tupled((<<[Long], <<[Long], <<[String], <<[java.sql.Timestamp], <<?[Long], <<?[Long]))
  }
  /** Table description of table locker_state_history. Objects of this class serve as prototypes for rows in queries. */
  class LockerStateHistory(_tableTag: Tag) extends profile.api.Table[LockerStateHistoryRow](_tableTag, Some("locker"), "locker_state_history") {
    def * = (id, locker, state, time, webhook, adminUser) <> (LockerStateHistoryRow.tupled, LockerStateHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(locker), Rep.Some(state), Rep.Some(time), webhook, adminUser)).shaped.<>({r=>import r._; _1.map(_=> LockerStateHistoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column locker SqlType(int8) */
    val locker: Rep[Long] = column[Long]("locker")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column time SqlType(timestamptz) */
    val time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("time")
    /** Database column webhook SqlType(int8), Default(None) */
    val webhook: Rep[Option[Long]] = column[Option[Long]]("webhook", O.Default(None))
    /** Database column admin_user SqlType(int8), Default(None) */
    val adminUser: Rep[Option[Long]] = column[Option[Long]]("admin_user", O.Default(None))

    /** Foreign key referencing AdminUsers (database name locker_state_history_admin_user_fkey) */
    lazy val adminUsersFk = foreignKey("locker_state_history_admin_user_fkey", adminUser, AdminUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LockerStates (database name locker_state_history_state_fkey) */
    lazy val lockerStatesFk = foreignKey("locker_state_history_state_fkey", state, LockerStates)(r => r.state, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Lockers (database name locker_state_history_locker_fkey) */
    lazy val lockersFk = foreignKey("locker_state_history_locker_fkey", locker, Lockers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Webhooks (database name locker_state_history_webhook_fkey) */
    lazy val webhooksFk = foreignKey("locker_state_history_webhook_fkey", webhook, Webhooks)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (locker,time,id) (database name locker_state_history_locker_time_id_idx) */
    val index1 = index("locker_state_history_locker_time_id_idx", (locker, time, id))
    /** Index over (locker,time,id) (database name locker_state_history_locker_time_id_idx1) */
    val index2 = index("locker_state_history_locker_time_id_idx1", (locker, time, id))
    /** Index over (locker,time,id) (database name locker_state_history_locker_time_id_idx2) */
    val index3 = index("locker_state_history_locker_time_id_idx2", (locker, time, id))
    /** Index over (time,id) (database name locker_state_history_time_id_idx) */
    val index4 = index("locker_state_history_time_id_idx", (time, id))
    /** Index over (time,id) (database name locker_state_history_time_id_idx1) */
    val index5 = index("locker_state_history_time_id_idx1", (time, id))
    /** Index over (time,id) (database name locker_state_history_time_id_idx2) */
    val index6 = index("locker_state_history_time_id_idx2", (time, id))
  }
  /** Collection-like TableQuery object for table LockerStateHistory */
  lazy val LockerStateHistory = new TableQuery(tag => new LockerStateHistory(tag))
}
