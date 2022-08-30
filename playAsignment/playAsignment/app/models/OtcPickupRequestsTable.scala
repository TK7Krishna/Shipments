package models
// AUTO-GENERATED Slick data model for table OtcPickupRequests
trait OtcPickupRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OtcPickupRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param documentId Database column document_id SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param responseDocumentId Database column response_document_id SqlType(text), Default(None)
   *  @param errors Database column errors SqlType(text), Default(None)
   *  @param confirmationnumber Database column confirmationnumber SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param nextAttemptAt Database column next_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(Some(0)) */
  case class OtcPickupRequestsRow(id: Long, consignment: Long, documentId: String, success: Option[Boolean] = None, responseDocumentId: Option[String] = None, errors: Option[String] = None, confirmationnumber: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, nextAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = Some(0))
  /** GetResult implicit for fetching OtcPickupRequestsRow objects using plain SQL queries */
  implicit def GetResultOtcPickupRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[String]], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[Int]]): GR[OtcPickupRequestsRow] = GR{
    prs => import prs._
    OtcPickupRequestsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int]))
  }
  /** Table description of table otc_pickup_requests. Objects of this class serve as prototypes for rows in queries. */
  class OtcPickupRequests(_tableTag: Tag) extends profile.api.Table[OtcPickupRequestsRow](_tableTag, Some("seven_eleven"), "otc_pickup_requests") {
    def * = (id, consignment, documentId, success, responseDocumentId, errors, confirmationnumber, createdAt, modifiedAt, nextAttemptAt, attemptCount) <> (OtcPickupRequestsRow.tupled, OtcPickupRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(documentId), success, responseDocumentId, errors, confirmationnumber, Rep.Some(createdAt), Rep.Some(modifiedAt), nextAttemptAt, attemptCount)).shaped.<>({r=>import r._; _1.map(_=> OtcPickupRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8.get, _9.get, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column document_id SqlType(text) */
    val documentId: Rep[String] = column[String]("document_id")
    /** Database column success SqlType(bool), Default(None) */
    val success: Rep[Option[Boolean]] = column[Option[Boolean]]("success", O.Default(None))
    /** Database column response_document_id SqlType(text), Default(None) */
    val responseDocumentId: Rep[Option[String]] = column[Option[String]]("response_document_id", O.Default(None))
    /** Database column errors SqlType(text), Default(None) */
    val errors: Rep[Option[String]] = column[Option[String]]("errors", O.Default(None))
    /** Database column confirmationnumber SqlType(text), Default(None) */
    val confirmationnumber: Rep[Option[String]] = column[Option[String]]("confirmationnumber", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column next_attempt_at SqlType(timestamptz), Default(None) */
    val nextAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(Some(0)) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(Some(0)))

    /** Foreign key referencing OtcConsignments (database name otc_pickup_requests_consignment_fkey) */
    lazy val otcConsignmentsFk = foreignKey("otc_pickup_requests_consignment_fkey", consignment, OtcConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OtcPickupRequests */
  lazy val OtcPickupRequests = new TableQuery(tag => new OtcPickupRequests(tag))
}
