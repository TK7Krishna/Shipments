package models
// AUTO-GENERATED Slick data model for table PickupRequests
trait PickupRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PickupRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param documentId Database column document_id SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param responseDocumentId Database column response_document_id SqlType(text), Default(None)
   *  @param errors Database column errors SqlType(text), Default(None)
   *  @param confirmationnumber Database column confirmationnumber SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class PickupRequestsRow(id: Long, consignment: Long, documentId: String, success: Option[Boolean] = None, responseDocumentId: Option[String] = None, errors: Option[String] = None, confirmationnumber: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching PickupRequestsRow objects using plain SQL queries */
  implicit def GetResultPickupRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[String]], e4: GR[java.sql.Timestamp]): GR[PickupRequestsRow] = GR{
    prs => import prs._
    PickupRequestsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table pickup_requests. Objects of this class serve as prototypes for rows in queries. */
  class PickupRequests(_tableTag: Tag) extends profile.api.Table[PickupRequestsRow](_tableTag, Some("toll"), "pickup_requests") {
    def * = (id, consignment, documentId, success, responseDocumentId, errors, confirmationnumber, createdAt, modifiedAt) <> (PickupRequestsRow.tupled, PickupRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(documentId), success, responseDocumentId, errors, confirmationnumber, Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> PickupRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing Consignments (database name pickup_requests_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("pickup_requests_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PickupRequests */
  lazy val PickupRequests = new TableQuery(tag => new PickupRequests(tag))
}
