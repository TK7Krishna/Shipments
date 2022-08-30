package models
// AUTO-GENERATED Slick data model for table LocationLogs
trait LocationLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LocationLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationId Database column droplocation_id SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param lastSyncedAt Database column last_synced_at SqlType(timestamptz), Default(None) */
  case class LocationLogsRow(id: Long, droplocationId: Long, createdAt: Option[java.sql.Timestamp], lastSyncedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching LocationLogsRow objects using plain SQL queries */
  implicit def GetResultLocationLogsRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]]): GR[LocationLogsRow] = GR{
    prs => import prs._
    LocationLogsRow.tupled((<<[Long], <<[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table location_logs. Objects of this class serve as prototypes for rows in queries. */
  class LocationLogs(_tableTag: Tag) extends profile.api.Table[LocationLogsRow](_tableTag, Some("ebay"), "location_logs") {
    def * = (id, droplocationId, createdAt, lastSyncedAt) <> (LocationLogsRow.tupled, LocationLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(droplocationId), createdAt, lastSyncedAt)).shaped.<>({r=>import r._; _1.map(_=> LocationLogsRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocation_id SqlType(int8) */
    val droplocationId: Rep[Long] = column[Long]("droplocation_id")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column last_synced_at SqlType(timestamptz), Default(None) */
    val lastSyncedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_synced_at", O.Default(None))

    /** Foreign key referencing Droplocations (database name droplocation_id_fkey) */
    lazy val droplocationsFk = foreignKey("droplocation_id_fkey", droplocationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LocationLogs */
  lazy val LocationLogs = new TableQuery(tag => new LocationLogs(tag))
}
