package models
// AUTO-GENERATED Slick data model for table LocationOrderLogs
trait LocationOrderLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LocationOrderLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationId Database column droplocation_id SqlType(int8)
   *  @param isProcessed Database column is_processed SqlType(bool), Default(Some(false))
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(Some(0))
   *  @param responseAsJson Database column response_as_json SqlType(text), Default(None)
   *  @param isDataMigrated Database column is_data_migrated SqlType(bool), Default(Some(false))
   *  @param isManualCheckin Database column is_manual_checkin SqlType(bool), Default(Some(false))
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class LocationOrderLogsRow(id: Long, droplocationId: Long, isProcessed: Option[Boolean] = Some(false), attemptCount: Option[Int] = Some(0), responseAsJson: Option[String] = None, isDataMigrated: Option[Boolean] = Some(false), isManualCheckin: Option[Boolean] = Some(false), createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching LocationOrderLogsRow objects using plain SQL queries */
  implicit def GetResultLocationOrderLogsRow(implicit e0: GR[Long], e1: GR[Option[Boolean]], e2: GR[Option[Int]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[LocationOrderLogsRow] = GR{
    prs => import prs._
    LocationOrderLogsRow.tupled((<<[Long], <<[Long], <<?[Boolean], <<?[Int], <<?[String], <<?[Boolean], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table location_order_logs. Objects of this class serve as prototypes for rows in queries. */
  class LocationOrderLogs(_tableTag: Tag) extends profile.api.Table[LocationOrderLogsRow](_tableTag, Some("ebay"), "location_order_logs") {
    def * = (id, droplocationId, isProcessed, attemptCount, responseAsJson, isDataMigrated, isManualCheckin, createdAt, modifiedAt) <> (LocationOrderLogsRow.tupled, LocationOrderLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(droplocationId), isProcessed, attemptCount, responseAsJson, isDataMigrated, isManualCheckin, createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> LocationOrderLogsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocation_id SqlType(int8) */
    val droplocationId: Rep[Long] = column[Long]("droplocation_id")
    /** Database column is_processed SqlType(bool), Default(Some(false)) */
    val isProcessed: Rep[Option[Boolean]] = column[Option[Boolean]]("is_processed", O.Default(Some(false)))
    /** Database column attempt_count SqlType(int4), Default(Some(0)) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(Some(0)))
    /** Database column response_as_json SqlType(text), Default(None) */
    val responseAsJson: Rep[Option[String]] = column[Option[String]]("response_as_json", O.Default(None))
    /** Database column is_data_migrated SqlType(bool), Default(Some(false)) */
    val isDataMigrated: Rep[Option[Boolean]] = column[Option[Boolean]]("is_data_migrated", O.Default(Some(false)))
    /** Database column is_manual_checkin SqlType(bool), Default(Some(false)) */
    val isManualCheckin: Rep[Option[Boolean]] = column[Option[Boolean]]("is_manual_checkin", O.Default(Some(false)))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))

    /** Foreign key referencing Droplocations (database name droplocation_id_fkey) */
    lazy val droplocationsFk = foreignKey("droplocation_id_fkey", droplocationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LocationOrderLogs */
  lazy val LocationOrderLogs = new TableQuery(tag => new LocationOrderLogs(tag))
}
