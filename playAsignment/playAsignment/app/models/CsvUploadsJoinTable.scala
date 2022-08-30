package models
// AUTO-GENERATED Slick data model for table CsvUploadsJoin
trait CsvUploadsJoinTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CsvUploadsJoin
   *  @param upload Database column upload SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8) */
  case class CsvUploadsJoinRow(upload: Long, consignment: Long)
  /** GetResult implicit for fetching CsvUploadsJoinRow objects using plain SQL queries */
  implicit def GetResultCsvUploadsJoinRow(implicit e0: GR[Long]): GR[CsvUploadsJoinRow] = GR{
    prs => import prs._
    CsvUploadsJoinRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table csv_uploads_join. Objects of this class serve as prototypes for rows in queries. */
  class CsvUploadsJoin(_tableTag: Tag) extends profile.api.Table[CsvUploadsJoinRow](_tableTag, Some("consumer"), "csv_uploads_join") {
    def * = (upload, consignment) <> (CsvUploadsJoinRow.tupled, CsvUploadsJoinRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(upload), Rep.Some(consignment))).shaped.<>({r=>import r._; _1.map(_=> CsvUploadsJoinRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column upload SqlType(int8) */
    val upload: Rep[Long] = column[Long]("upload")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")

    /** Primary key of CsvUploadsJoin (database name csv_uploads_join_pkey) */
    val pk = primaryKey("csv_uploads_join_pkey", (upload, consignment))

    /** Foreign key referencing Consignments (database name csv_uploads_join_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("csv_uploads_join_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CsvUploads (database name csv_uploads_join_upload_fkey) */
    lazy val csvUploadsFk = foreignKey("csv_uploads_join_upload_fkey", upload, CsvUploads)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CsvUploadsJoin */
  lazy val CsvUploadsJoin = new TableQuery(tag => new CsvUploadsJoin(tag))
}
