package models
// AUTO-GENERATED Slick data model for table ManifestLogs
trait ManifestLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ManifestLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param manifestDay Database column manifest_day SqlType(text), Default(None)
   *  @param manifestTime Database column manifest_time SqlType(text), Default(None)
   *  @param manifestNumber Database column manifest_number SqlType(int4), Default(None)
   *  @param consignmentCount Database column consignment_count SqlType(int4), Default(None)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param requestPayload Database column request_payload SqlType(text), Default(None)
   *  @param response Database column response SqlType(text), Default(None)
   *  @param documentId Database column document_id SqlType(text), Default(None)
   *  @param isSuccess Database column is_success SqlType(bool), Default(Some(false))
   *  @param confirmationNumber Database column confirmation_number SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class ManifestLogsRow(id: Long, manifestDay: Option[String] = None, manifestTime: Option[String] = None, manifestNumber: Option[Int] = None, consignmentCount: Option[Int] = None, courier: Option[String] = None, requestPayload: Option[String] = None, response: Option[String] = None, documentId: Option[String] = None, isSuccess: Option[Boolean] = Some(false), confirmationNumber: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching ManifestLogsRow objects using plain SQL queries */
  implicit def GetResultManifestLogsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[Option[Boolean]], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]]): GR[ManifestLogsRow] = GR{
    prs => import prs._
    ManifestLogsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table manifest_logs. Objects of this class serve as prototypes for rows in queries. */
  class ManifestLogs(_tableTag: Tag) extends profile.api.Table[ManifestLogsRow](_tableTag, "manifest_logs") {
    def * = (id, manifestDay, manifestTime, manifestNumber, consignmentCount, courier, requestPayload, response, documentId, isSuccess, confirmationNumber, createdAt, modifiedAt) <> (ManifestLogsRow.tupled, ManifestLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), manifestDay, manifestTime, manifestNumber, consignmentCount, courier, requestPayload, response, documentId, isSuccess, confirmationNumber, Rep.Some(createdAt), modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> ManifestLogsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12.get, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column manifest_day SqlType(text), Default(None) */
    val manifestDay: Rep[Option[String]] = column[Option[String]]("manifest_day", O.Default(None))
    /** Database column manifest_time SqlType(text), Default(None) */
    val manifestTime: Rep[Option[String]] = column[Option[String]]("manifest_time", O.Default(None))
    /** Database column manifest_number SqlType(int4), Default(None) */
    val manifestNumber: Rep[Option[Int]] = column[Option[Int]]("manifest_number", O.Default(None))
    /** Database column consignment_count SqlType(int4), Default(None) */
    val consignmentCount: Rep[Option[Int]] = column[Option[Int]]("consignment_count", O.Default(None))
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column request_payload SqlType(text), Default(None) */
    val requestPayload: Rep[Option[String]] = column[Option[String]]("request_payload", O.Default(None))
    /** Database column response SqlType(text), Default(None) */
    val response: Rep[Option[String]] = column[Option[String]]("response", O.Default(None))
    /** Database column document_id SqlType(text), Default(None) */
    val documentId: Rep[Option[String]] = column[Option[String]]("document_id", O.Default(None))
    /** Database column is_success SqlType(bool), Default(Some(false)) */
    val isSuccess: Rep[Option[Boolean]] = column[Option[Boolean]]("is_success", O.Default(Some(false)))
    /** Database column confirmation_number SqlType(text), Default(None) */
    val confirmationNumber: Rep[Option[String]] = column[Option[String]]("confirmation_number", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table ManifestLogs */
  lazy val ManifestLogs = new TableQuery(tag => new ManifestLogs(tag))
}
