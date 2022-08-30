package models
// AUTO-GENERATED Slick data model for table ConsolidatedPickupRequests
trait ConsolidatedPickupRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsolidatedPickupRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param documentId Database column document_id SqlType(text)
   *  @param requestBody Database column request_body SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param responseDocumentId Database column response_document_id SqlType(text), Default(None)
   *  @param errors Database column errors SqlType(text), Default(None)
   *  @param confirmationNumber Database column confirmation_number SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param nextAttemptAt Database column next_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(None)
   *  @param dropLocation Database column drop_location SqlType(int8), Default(3)
   *  @param requestType Database column request_type SqlType(int4), Default(1)
   *  @param itemQuantity Database column item_quantity SqlType(int4), Default(1)
   *  @param requestId Database column request_id SqlType(int8), Default(None) */
  case class ConsolidatedPickupRequestsRow(id: Long, documentId: String, requestBody: String, success: Option[Boolean] = None, responseDocumentId: Option[String] = None, errors: Option[String] = None, confirmationNumber: Option[String] = None, createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp], nextAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = None, dropLocation: Long = 3L, requestType: Int = 1, itemQuantity: Int = 1, requestId: Option[Long] = None)
  /** GetResult implicit for fetching ConsolidatedPickupRequestsRow objects using plain SQL queries */
  implicit def GetResultConsolidatedPickupRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Int]], e6: GR[Int], e7: GR[Option[Long]]): GR[ConsolidatedPickupRequestsRow] = GR{
    prs => import prs._
    ConsolidatedPickupRequestsRow.tupled((<<[Long], <<[String], <<[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int], <<[Long], <<[Int], <<[Int], <<?[Long]))
  }
  /** Table description of table consolidated_pickup_requests. Objects of this class serve as prototypes for rows in queries. */
  class ConsolidatedPickupRequests(_tableTag: Tag) extends profile.api.Table[ConsolidatedPickupRequestsRow](_tableTag, Some("seven_eleven"), "consolidated_pickup_requests") {
    def * = (id, documentId, requestBody, success, responseDocumentId, errors, confirmationNumber, createdAt, modifiedAt, nextAttemptAt, attemptCount, dropLocation, requestType, itemQuantity, requestId) <> (ConsolidatedPickupRequestsRow.tupled, ConsolidatedPickupRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(documentId), Rep.Some(requestBody), success, responseDocumentId, errors, confirmationNumber, createdAt, modifiedAt, nextAttemptAt, attemptCount, Rep.Some(dropLocation), Rep.Some(requestType), Rep.Some(itemQuantity), requestId)).shaped.<>({r=>import r._; _1.map(_=> ConsolidatedPickupRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12.get, _13.get, _14.get, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column document_id SqlType(text) */
    val documentId: Rep[String] = column[String]("document_id")
    /** Database column request_body SqlType(text) */
    val requestBody: Rep[String] = column[String]("request_body")
    /** Database column success SqlType(bool), Default(None) */
    val success: Rep[Option[Boolean]] = column[Option[Boolean]]("success", O.Default(None))
    /** Database column response_document_id SqlType(text), Default(None) */
    val responseDocumentId: Rep[Option[String]] = column[Option[String]]("response_document_id", O.Default(None))
    /** Database column errors SqlType(text), Default(None) */
    val errors: Rep[Option[String]] = column[Option[String]]("errors", O.Default(None))
    /** Database column confirmation_number SqlType(text), Default(None) */
    val confirmationNumber: Rep[Option[String]] = column[Option[String]]("confirmation_number", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at")
    /** Database column next_attempt_at SqlType(timestamptz), Default(None) */
    val nextAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(None) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(None))
    /** Database column drop_location SqlType(int8), Default(3) */
    val dropLocation: Rep[Long] = column[Long]("drop_location", O.Default(3L))
    /** Database column request_type SqlType(int4), Default(1) */
    val requestType: Rep[Int] = column[Int]("request_type", O.Default(1))
    /** Database column item_quantity SqlType(int4), Default(1) */
    val itemQuantity: Rep[Int] = column[Int]("item_quantity", O.Default(1))
    /** Database column request_id SqlType(int8), Default(None) */
    val requestId: Rep[Option[Long]] = column[Option[Long]]("request_id", O.Default(None))

    /** Foreign key referencing Droplocations (database name consolidated_pickup_requests_drop_location_fkey) */
    lazy val droplocationsFk = foreignKey("consolidated_pickup_requests_drop_location_fkey", dropLocation, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsolidatedPickupRequests */
  lazy val ConsolidatedPickupRequests = new TableQuery(tag => new ConsolidatedPickupRequests(tag))
}
