package models
// AUTO-GENERATED Slick data model for table InternationalShipmentCreateRequests
trait InternationalShipmentCreateRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalShipmentCreateRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param shipment Database column shipment SqlType(int8)
   *  @param request Database column request SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InternationalShipmentCreateRequestsRow(id: Long, shipment: Long, request: Long, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InternationalShipmentCreateRequestsRow objects using plain SQL queries */
  implicit def GetResultInternationalShipmentCreateRequestsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp]): GR[InternationalShipmentCreateRequestsRow] = GR{
    prs => import prs._
    InternationalShipmentCreateRequestsRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table international_shipment_create_requests. Objects of this class serve as prototypes for rows in queries. */
  class InternationalShipmentCreateRequests(_tableTag: Tag) extends profile.api.Table[InternationalShipmentCreateRequestsRow](_tableTag, Some("cpapi"), "international_shipment_create_requests") {
    def * = (id, shipment, request, createdAt) <> (InternationalShipmentCreateRequestsRow.tupled, InternationalShipmentCreateRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(shipment), Rep.Some(request), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InternationalShipmentCreateRequestsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column shipment SqlType(int8) */
    val shipment: Rep[Long] = column[Long]("shipment")
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing InternationalShipments (database name international_shipment_create_requests_shipment_fkey) */
    lazy val internationalShipmentsFk = foreignKey("international_shipment_create_requests_shipment_fkey", shipment, InternationalShipments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Requests (database name international_shipment_create_requests_request_fkey) */
    lazy val requestsFk = foreignKey("international_shipment_create_requests_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalShipmentCreateRequests */
  lazy val InternationalShipmentCreateRequests = new TableQuery(tag => new InternationalShipmentCreateRequests(tag))
}
