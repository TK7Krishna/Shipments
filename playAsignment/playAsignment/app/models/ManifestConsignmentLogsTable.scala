package models
// AUTO-GENERATED Slick data model for table ManifestConsignmentLogs
trait ManifestConsignmentLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ManifestConsignmentLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param manifestLogsId Database column manifest_logs_id SqlType(int8), Default(None)
   *  @param storedlb Database column storedlb SqlType(text), Default(None) */
  case class ManifestConsignmentLogsRow(id: Long, consignmentNumber: Option[String] = None, manifestLogsId: Option[Long] = None, storedlb: Option[String] = None)
  /** GetResult implicit for fetching ManifestConsignmentLogsRow objects using plain SQL queries */
  implicit def GetResultManifestConsignmentLogsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]]): GR[ManifestConsignmentLogsRow] = GR{
    prs => import prs._
    ManifestConsignmentLogsRow.tupled((<<[Long], <<?[String], <<?[Long], <<?[String]))
  }
  /** Table description of table manifest_consignment_logs. Objects of this class serve as prototypes for rows in queries. */
  class ManifestConsignmentLogs(_tableTag: Tag) extends profile.api.Table[ManifestConsignmentLogsRow](_tableTag, "manifest_consignment_logs") {
    def * = (id, consignmentNumber, manifestLogsId, storedlb) <> (ManifestConsignmentLogsRow.tupled, ManifestConsignmentLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), consignmentNumber, manifestLogsId, storedlb)).shaped.<>({r=>import r._; _1.map(_=> ManifestConsignmentLogsRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column manifest_logs_id SqlType(int8), Default(None) */
    val manifestLogsId: Rep[Option[Long]] = column[Option[Long]]("manifest_logs_id", O.Default(None))
    /** Database column storedlb SqlType(text), Default(None) */
    val storedlb: Rep[Option[String]] = column[Option[String]]("storedlb", O.Default(None))

    /** Foreign key referencing ManifestLogs (database name manifest_consignment_logs_manifest_logs_fkey) */
    lazy val manifestLogsFk = foreignKey("manifest_consignment_logs_manifest_logs_fkey", manifestLogsId, ManifestLogs)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ManifestConsignmentLogs */
  lazy val ManifestConsignmentLogs = new TableQuery(tag => new ManifestConsignmentLogs(tag))
}
