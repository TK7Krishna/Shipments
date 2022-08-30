package models
// AUTO-GENERATED Slick data model for table ExternalPickupRequests
trait ExternalPickupRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ExternalPickupRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param documentId Database column document_id SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param responseDocumentId Database column response_document_id SqlType(text), Default(None)
   *  @param errors Database column errors SqlType(text), Default(None)
   *  @param confirmationnumber Database column confirmationnumber SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param manifestId Database column manifest_id SqlType(int8), Default(None)
   *  @param httpRequestId Database column http_request_id SqlType(int8), Default(None) */
  case class ExternalPickupRequestsRow(id: Long, consignment: Long, documentId: String, success: Option[Boolean] = None, responseDocumentId: Option[String] = None, errors: Option[String] = None, confirmationnumber: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, manifestId: Option[Long] = None, httpRequestId: Option[Long] = None)
  /** GetResult implicit for fetching ExternalPickupRequestsRow objects using plain SQL queries */
  implicit def GetResultExternalPickupRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[String]], e4: GR[java.sql.Timestamp], e5: GR[Option[Long]]): GR[ExternalPickupRequestsRow] = GR{
    prs => import prs._
    ExternalPickupRequestsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[Long], <<?[Long]))
  }
  /** Table description of table external_pickup_requests. Objects of this class serve as prototypes for rows in queries. */
  class ExternalPickupRequests(_tableTag: Tag) extends profile.api.Table[ExternalPickupRequestsRow](_tableTag, Some("toll"), "external_pickup_requests") {
    def * = (id, consignment, documentId, success, responseDocumentId, errors, confirmationnumber, createdAt, modifiedAt, manifestId, httpRequestId) <> (ExternalPickupRequestsRow.tupled, ExternalPickupRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(documentId), success, responseDocumentId, errors, confirmationnumber, Rep.Some(createdAt), Rep.Some(modifiedAt), manifestId, httpRequestId)).shaped.<>({r=>import r._; _1.map(_=> ExternalPickupRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8.get, _9.get, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column manifest_id SqlType(int8), Default(None) */
    val manifestId: Rep[Option[Long]] = column[Option[Long]]("manifest_id", O.Default(None))
    /** Database column http_request_id SqlType(int8), Default(None) */
    val httpRequestId: Rep[Option[Long]] = column[Option[Long]]("http_request_id", O.Default(None))

    /** Foreign key referencing Consignments (database name external_pickup_requests_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("external_pickup_requests_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ManifestLogs (database name external_pickup_requests_manifest_id_fkey) */
    lazy val manifestLogsFk = foreignKey("external_pickup_requests_manifest_id_fkey", manifestId, ManifestLogs)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ExternalPickupRequests */
  lazy val ExternalPickupRequests = new TableQuery(tag => new ExternalPickupRequests(tag))
}
