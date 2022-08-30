package models
// AUTO-GENERATED Slick data model for table OtcConsignmentLogs
trait OtcConsignmentLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OtcConsignmentLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param pin Database column pin SqlType(text)
   *  @param reason Database column reason SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class OtcConsignmentLogsRow(id: Long, consignmentNumber: String, pin: String, reason: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching OtcConsignmentLogsRow objects using plain SQL queries */
  implicit def GetResultOtcConsignmentLogsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[OtcConsignmentLogsRow] = GR{
    prs => import prs._
    OtcConsignmentLogsRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table otc_consignment_logs. Objects of this class serve as prototypes for rows in queries. */
  class OtcConsignmentLogs(_tableTag: Tag) extends profile.api.Table[OtcConsignmentLogsRow](_tableTag, Some("seven_eleven"), "otc_consignment_logs") {
    def * = (id, consignmentNumber, pin, reason, createdAt) <> (OtcConsignmentLogsRow.tupled, OtcConsignmentLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentNumber), Rep.Some(pin), reason, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> OtcConsignmentLogsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column pin SqlType(text) */
    val pin: Rep[String] = column[String]("pin")
    /** Database column reason SqlType(text), Default(None) */
    val reason: Rep[Option[String]] = column[Option[String]]("reason", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table OtcConsignmentLogs */
  lazy val OtcConsignmentLogs = new TableQuery(tag => new OtcConsignmentLogs(tag))
}
