package models
// AUTO-GENERATED Slick data model for table DomesticShipmentCreateRequests
trait DomesticShipmentCreateRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DomesticShipmentCreateRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param shipment Database column shipment SqlType(int8)
   *  @param request Database column request SqlType(int8)
   *  @param duplicate Database column duplicate SqlType(bool), Default(None)
   *  @param handled Database column handled SqlType(bool), Default(None) */
  case class DomesticShipmentCreateRequestsRow(id: Long, shipment: Long, request: Long, duplicate: Option[Boolean] = None, handled: Option[Boolean] = None)
  /** GetResult implicit for fetching DomesticShipmentCreateRequestsRow objects using plain SQL queries */
  implicit def GetResultDomesticShipmentCreateRequestsRow(implicit e0: GR[Long], e1: GR[Option[Boolean]]): GR[DomesticShipmentCreateRequestsRow] = GR{
    prs => import prs._
    DomesticShipmentCreateRequestsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[Boolean], <<?[Boolean]))
  }
  /** Table description of table domestic_shipment_create_requests. Objects of this class serve as prototypes for rows in queries. */
  class DomesticShipmentCreateRequests(_tableTag: Tag) extends profile.api.Table[DomesticShipmentCreateRequestsRow](_tableTag, Some("cpapi"), "domestic_shipment_create_requests") {
    def * = (id, shipment, request, duplicate, handled) <> (DomesticShipmentCreateRequestsRow.tupled, DomesticShipmentCreateRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(shipment), Rep.Some(request), duplicate, handled)).shaped.<>({r=>import r._; _1.map(_=> DomesticShipmentCreateRequestsRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column shipment SqlType(int8) */
    val shipment: Rep[Long] = column[Long]("shipment")
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column duplicate SqlType(bool), Default(None) */
    val duplicate: Rep[Option[Boolean]] = column[Option[Boolean]]("duplicate", O.Default(None))
    /** Database column handled SqlType(bool), Default(None) */
    val handled: Rep[Option[Boolean]] = column[Option[Boolean]]("handled", O.Default(None))

    /** Foreign key referencing DomesticShipments (database name domestic_shipment_create_requests_shipment_fkey) */
    lazy val domesticShipmentsFk = foreignKey("domestic_shipment_create_requests_shipment_fkey", shipment, DomesticShipments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Requests (database name domestic_shipment_create_requests_request_fkey) */
    lazy val requestsFk = foreignKey("domestic_shipment_create_requests_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DomesticShipmentCreateRequests */
  lazy val DomesticShipmentCreateRequests = new TableQuery(tag => new DomesticShipmentCreateRequests(tag))
}
