package models
// AUTO-GENERATED Slick data model for table StgPickupRequests
trait StgPickupRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgPickupRequests
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
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(None) */
  case class StgPickupRequestsRow(id: Long, consignment: Long, documentId: String, success: Option[Boolean] = None, responseDocumentId: Option[String] = None, errors: Option[String] = None, confirmationnumber: Option[String] = None, createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp], nextAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = None)
  /** GetResult implicit for fetching StgPickupRequestsRow objects using plain SQL queries */
  implicit def GetResultStgPickupRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Int]]): GR[StgPickupRequestsRow] = GR{
    prs => import prs._
    StgPickupRequestsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int]))
  }
  /** Table description of table stg_pickup_requests. Objects of this class serve as prototypes for rows in queries. */
  class StgPickupRequests(_tableTag: Tag) extends profile.api.Table[StgPickupRequestsRow](_tableTag, Some("seven_eleven"), "stg_pickup_requests") {
    def * = (id, consignment, documentId, success, responseDocumentId, errors, confirmationnumber, createdAt, modifiedAt, nextAttemptAt, attemptCount) <> (StgPickupRequestsRow.tupled, StgPickupRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(documentId), success, responseDocumentId, errors, confirmationnumber, createdAt, modifiedAt, nextAttemptAt, attemptCount)).shaped.<>({r=>import r._; _1.map(_=> StgPickupRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at")
    /** Database column next_attempt_at SqlType(timestamptz), Default(None) */
    val nextAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(None) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(None))

    /** Foreign key referencing StgConsignments (database name stg_pickup_requests_consignment_fkey) */
    lazy val stgConsignmentsFk = foreignKey("stg_pickup_requests_consignment_fkey", consignment, StgConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table StgPickupRequests */
  lazy val StgPickupRequests = new TableQuery(tag => new StgPickupRequests(tag))
}
