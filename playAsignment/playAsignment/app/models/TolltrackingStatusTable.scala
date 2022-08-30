package models
// AUTO-GENERATED Slick data model for table TolltrackingStatus
trait TolltrackingStatusTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TolltrackingStatus
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(text), Default(None)
   *  @param status Database column status SqlType(text), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param eventDate Database column event_date SqlType(timestamptz), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamp), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(Some(0))
   *  @param isProcessed Database column is_processed SqlType(bool), Default(false) */
  case class TolltrackingStatusRow(id: Long, location: Option[String] = None, status: Option[String] = None, consignmentNumber: Option[String] = None, eventDate: Option[java.sql.Timestamp] = None, createdAt: java.sql.Timestamp, consignmentId: Option[Long] = None, modifiedAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = Some(0), isProcessed: Boolean = false)
  /** GetResult implicit for fetching TolltrackingStatusRow objects using plain SQL queries */
  implicit def GetResultTolltrackingStatusRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp], e4: GR[Option[Long]], e5: GR[Option[Int]], e6: GR[Boolean]): GR[TolltrackingStatusRow] = GR{
    prs => import prs._
    TolltrackingStatusRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[Long], <<?[java.sql.Timestamp], <<?[Int], <<[Boolean]))
  }
  /** Table description of table tolltracking_status. Objects of this class serve as prototypes for rows in queries. */
  class TolltrackingStatus(_tableTag: Tag) extends profile.api.Table[TolltrackingStatusRow](_tableTag, Some("ecommerce"), "tolltracking_status") {
    def * = (id, location, status, consignmentNumber, eventDate, createdAt, consignmentId, modifiedAt, attemptCount, isProcessed) <> (TolltrackingStatusRow.tupled, TolltrackingStatusRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), location, status, consignmentNumber, eventDate, Rep.Some(createdAt), consignmentId, modifiedAt, attemptCount, Rep.Some(isProcessed))).shaped.<>({r=>import r._; _1.map(_=> TolltrackingStatusRow.tupled((_1.get, _2, _3, _4, _5, _6.get, _7, _8, _9, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(text), Default(None) */
    val location: Rep[Option[String]] = column[Option[String]]("location", O.Default(None))
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column event_date SqlType(timestamptz), Default(None) */
    val eventDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("event_date", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column modified_at SqlType(timestamp), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(Some(0)) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(Some(0)))
    /** Database column is_processed SqlType(bool), Default(false) */
    val isProcessed: Rep[Boolean] = column[Boolean]("is_processed", O.Default(false))
  }
  /** Collection-like TableQuery object for table TolltrackingStatus */
  lazy val TolltrackingStatus = new TableQuery(tag => new TolltrackingStatus(tag))
}
