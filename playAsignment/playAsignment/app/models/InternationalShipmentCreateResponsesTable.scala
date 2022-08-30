package models
// AUTO-GENERATED Slick data model for table InternationalShipmentCreateResponses
trait InternationalShipmentCreateResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalShipmentCreateResponses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param request Database column request SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param responseCode Database column response_code SqlType(text), Default(None)
   *  @param msg Database column msg SqlType(text), Default(None)
   *  @param consignmentCode Database column consignment_code SqlType(text) */
  case class InternationalShipmentCreateResponsesRow(id: Long, request: Long, createdAt: java.sql.Timestamp, responseCode: Option[String] = None, msg: Option[String] = None, consignmentCode: String)
  /** GetResult implicit for fetching InternationalShipmentCreateResponsesRow objects using plain SQL queries */
  implicit def GetResultInternationalShipmentCreateResponsesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]], e3: GR[String]): GR[InternationalShipmentCreateResponsesRow] = GR{
    prs => import prs._
    InternationalShipmentCreateResponsesRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp], <<?[String], <<?[String], <<[String]))
  }
  /** Table description of table international_shipment_create_responses. Objects of this class serve as prototypes for rows in queries. */
  class InternationalShipmentCreateResponses(_tableTag: Tag) extends profile.api.Table[InternationalShipmentCreateResponsesRow](_tableTag, Some("cpapi"), "international_shipment_create_responses") {
    def * = (id, request, createdAt, responseCode, msg, consignmentCode) <> (InternationalShipmentCreateResponsesRow.tupled, InternationalShipmentCreateResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(request), Rep.Some(createdAt), responseCode, msg, Rep.Some(consignmentCode))).shaped.<>({r=>import r._; _1.map(_=> InternationalShipmentCreateResponsesRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column response_code SqlType(text), Default(None) */
    val responseCode: Rep[Option[String]] = column[Option[String]]("response_code", O.Default(None))
    /** Database column msg SqlType(text), Default(None) */
    val msg: Rep[Option[String]] = column[Option[String]]("msg", O.Default(None))
    /** Database column consignment_code SqlType(text) */
    val consignmentCode: Rep[String] = column[String]("consignment_code")

    /** Foreign key referencing InternationalShipmentCreateRequests (database name international_shipment_create_responses_request_fkey) */
    lazy val internationalShipmentCreateRequestsFk = foreignKey("international_shipment_create_responses_request_fkey", request, InternationalShipmentCreateRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalShipmentCreateResponses */
  lazy val InternationalShipmentCreateResponses = new TableQuery(tag => new InternationalShipmentCreateResponses(tag))
}
