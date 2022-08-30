package models
// AUTO-GENERATED Slick data model for table EbayInvoiceLogs
trait EbayInvoiceLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EbayInvoiceLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param fileName Database column file_name SqlType(text), Default(None)
   *  @param version Database column version SqlType(text), Default(None)
   *  @param uploadedAt Database column uploaded_at SqlType(timestamptz) */
  case class EbayInvoiceLogsRow(id: Long, fileName: Option[String] = None, version: Option[String] = None, uploadedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching EbayInvoiceLogsRow objects using plain SQL queries */
  implicit def GetResultEbayInvoiceLogsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[EbayInvoiceLogsRow] = GR{
    prs => import prs._
    EbayInvoiceLogsRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table ebay_invoice_logs. Objects of this class serve as prototypes for rows in queries. */
  class EbayInvoiceLogs(_tableTag: Tag) extends profile.api.Table[EbayInvoiceLogsRow](_tableTag, Some("ebay"), "ebay_invoice_logs") {
    def * = (id, fileName, version, uploadedAt) <> (EbayInvoiceLogsRow.tupled, EbayInvoiceLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), fileName, version, Rep.Some(uploadedAt))).shaped.<>({r=>import r._; _1.map(_=> EbayInvoiceLogsRow.tupled((_1.get, _2, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column file_name SqlType(text), Default(None) */
    val fileName: Rep[Option[String]] = column[Option[String]]("file_name", O.Default(None))
    /** Database column version SqlType(text), Default(None) */
    val version: Rep[Option[String]] = column[Option[String]]("version", O.Default(None))
    /** Database column uploaded_at SqlType(timestamptz) */
    val uploadedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("uploaded_at")
  }
  /** Collection-like TableQuery object for table EbayInvoiceLogs */
  lazy val EbayInvoiceLogs = new TableQuery(tag => new EbayInvoiceLogs(tag))
}
