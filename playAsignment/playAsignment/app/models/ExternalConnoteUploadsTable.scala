package models
// AUTO-GENERATED Slick data model for table ExternalConnoteUploads
trait ExternalConnoteUploadsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ExternalConnoteUploads
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param renderedConnote Database column rendered_connote SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param manifestId Database column manifest_id SqlType(int8), Default(None)
   *  @param fileName Database column file_name SqlType(text), Default(None) */
  case class ExternalConnoteUploadsRow(id: Long, consignment: Long, renderedConnote: String, success: Option[Boolean] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, manifestId: Option[Long] = None, fileName: Option[String] = None)
  /** GetResult implicit for fetching ExternalConnoteUploadsRow objects using plain SQL queries */
  implicit def GetResultExternalConnoteUploadsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp], e4: GR[Option[Long]], e5: GR[Option[String]]): GR[ExternalConnoteUploadsRow] = GR{
    prs => import prs._
    ExternalConnoteUploadsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[Long], <<?[String]))
  }
  /** Table description of table external_connote_uploads. Objects of this class serve as prototypes for rows in queries. */
  class ExternalConnoteUploads(_tableTag: Tag) extends profile.api.Table[ExternalConnoteUploadsRow](_tableTag, Some("toll"), "external_connote_uploads") {
    def * = (id, consignment, renderedConnote, success, createdAt, modifiedAt, manifestId, fileName) <> (ExternalConnoteUploadsRow.tupled, ExternalConnoteUploadsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(renderedConnote), success, Rep.Some(createdAt), Rep.Some(modifiedAt), manifestId, fileName)).shaped.<>({r=>import r._; _1.map(_=> ExternalConnoteUploadsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column rendered_connote SqlType(text) */
    val renderedConnote: Rep[String] = column[String]("rendered_connote")
    /** Database column success SqlType(bool), Default(None) */
    val success: Rep[Option[Boolean]] = column[Option[Boolean]]("success", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column manifest_id SqlType(int8), Default(None) */
    val manifestId: Rep[Option[Long]] = column[Option[Long]]("manifest_id", O.Default(None))
    /** Database column file_name SqlType(text), Default(None) */
    val fileName: Rep[Option[String]] = column[Option[String]]("file_name", O.Default(None))

    /** Foreign key referencing Consignments (database name external_connote_uploads_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("external_connote_uploads_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ManifestLogs (database name external_connote_uploads_manifest_id_fkey) */
    lazy val manifestLogsFk = foreignKey("external_connote_uploads_manifest_id_fkey", manifestId, ManifestLogs)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ExternalConnoteUploads */
  lazy val ExternalConnoteUploads = new TableQuery(tag => new ExternalConnoteUploads(tag))
}
