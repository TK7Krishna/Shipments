package models
// AUTO-GENERATED Slick data model for table CsvUploads
trait CsvUploadsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CsvUploads
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param csvString Database column csv_string SqlType(text)
   *  @param uploadedAt Database column uploaded_at SqlType(timestamptz) */
  case class CsvUploadsRow(id: Long, csvString: String, uploadedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CsvUploadsRow objects using plain SQL queries */
  implicit def GetResultCsvUploadsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[CsvUploadsRow] = GR{
    prs => import prs._
    CsvUploadsRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table csv_uploads. Objects of this class serve as prototypes for rows in queries. */
  class CsvUploads(_tableTag: Tag) extends profile.api.Table[CsvUploadsRow](_tableTag, Some("consumer"), "csv_uploads") {
    def * = (id, csvString, uploadedAt) <> (CsvUploadsRow.tupled, CsvUploadsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(csvString), Rep.Some(uploadedAt))).shaped.<>({r=>import r._; _1.map(_=> CsvUploadsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column csv_string SqlType(text) */
    val csvString: Rep[String] = column[String]("csv_string")
    /** Database column uploaded_at SqlType(timestamptz) */
    val uploadedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("uploaded_at")
  }
  /** Collection-like TableQuery object for table CsvUploads */
  lazy val CsvUploads = new TableQuery(tag => new CsvUploads(tag))
}
