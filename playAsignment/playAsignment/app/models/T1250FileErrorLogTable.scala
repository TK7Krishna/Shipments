package models
// AUTO-GENERATED Slick data model for table T1250FileErrorLog
trait T1250FileErrorLogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table T1250FileErrorLog
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param fileName Database column file_name SqlType(text)
   *  @param barcode Database column barcode SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class T1250FileErrorLogRow(id: Long, consignmentNumber: String, fileName: String, barcode: String, description: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching T1250FileErrorLogRow objects using plain SQL queries */
  implicit def GetResultT1250FileErrorLogRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[T1250FileErrorLogRow] = GR{
    prs => import prs._
    T1250FileErrorLogRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t1250_file_error_log. Objects of this class serve as prototypes for rows in queries. */
  class T1250FileErrorLog(_tableTag: Tag) extends profile.api.Table[T1250FileErrorLogRow](_tableTag, Some("toll"), "t1250_file_error_log") {
    def * = (id, consignmentNumber, fileName, barcode, description, createdAt) <> (T1250FileErrorLogRow.tupled, T1250FileErrorLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentNumber), Rep.Some(fileName), Rep.Some(barcode), Rep.Some(description), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> T1250FileErrorLogRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column file_name SqlType(text) */
    val fileName: Rep[String] = column[String]("file_name")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table T1250FileErrorLog */
  lazy val T1250FileErrorLog = new TableQuery(tag => new T1250FileErrorLog(tag))
}
