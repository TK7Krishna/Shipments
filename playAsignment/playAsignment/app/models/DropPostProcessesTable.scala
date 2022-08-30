package models
// AUTO-GENERATED Slick data model for table DropPostProcesses
trait DropPostProcessesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DropPostProcesses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param processType Database column process_type SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param postProcessingComplete Database column post_processing_complete SqlType(timestamptz), Default(None)
   *  @param error Database column error SqlType(text), Default(None)
   *  @param nextAttemptAt Database column next_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int8), Default(0) */
  case class DropPostProcessesRow(id: Long, consignmentId: Long, processType: Long, createdAt: java.sql.Timestamp, postProcessingComplete: Option[java.sql.Timestamp] = None, error: Option[String] = None, nextAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Long = 0L)
  /** GetResult implicit for fetching DropPostProcessesRow objects using plain SQL queries */
  implicit def GetResultDropPostProcessesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]]): GR[DropPostProcessesRow] = GR{
    prs => import prs._
    DropPostProcessesRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<[Long]))
  }
  /** Table description of table drop_post_processes. Objects of this class serve as prototypes for rows in queries. */
  class DropPostProcesses(_tableTag: Tag) extends profile.api.Table[DropPostProcessesRow](_tableTag, Some("external_online"), "drop_post_processes") {
    def * = (id, consignmentId, processType, createdAt, postProcessingComplete, error, nextAttemptAt, attemptCount) <> (DropPostProcessesRow.tupled, DropPostProcessesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(processType), Rep.Some(createdAt), postProcessingComplete, error, nextAttemptAt, Rep.Some(attemptCount))).shaped.<>({r=>import r._; _1.map(_=> DropPostProcessesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column process_type SqlType(int8) */
    val processType: Rep[Long] = column[Long]("process_type")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column post_processing_complete SqlType(timestamptz), Default(None) */
    val postProcessingComplete: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("post_processing_complete", O.Default(None))
    /** Database column error SqlType(text), Default(None) */
    val error: Rep[Option[String]] = column[Option[String]]("error", O.Default(None))
    /** Database column next_attempt_at SqlType(timestamptz), Default(None) */
    val nextAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int8), Default(0) */
    val attemptCount: Rep[Long] = column[Long]("attempt_count", O.Default(0L))

    /** Foreign key referencing Consignments (database name drop_post_processes_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("drop_post_processes_consignment_id_fkey", consignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing DropPostProcessType (database name drop_post_processes_process_type_fkey) */
    lazy val dropPostProcessTypeFk = foreignKey("drop_post_processes_process_type_fkey", processType, DropPostProcessType)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DropPostProcesses */
  lazy val DropPostProcesses = new TableQuery(tag => new DropPostProcesses(tag))
}
