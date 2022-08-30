package models
// AUTO-GENERATED Slick data model for table OutboundConsignments
trait OutboundConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param locationId Database column location_id SqlType(int8)
   *  @param offerId Database column offer_id SqlType(int8) */
  case class OutboundConsignmentsRow(id: Long, consignmentId: Long, locationId: Long, offerId: Long)
  /** GetResult implicit for fetching OutboundConsignmentsRow objects using plain SQL queries */
  implicit def GetResultOutboundConsignmentsRow(implicit e0: GR[Long]): GR[OutboundConsignmentsRow] = GR{
    prs => import prs._
    OutboundConsignmentsRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table outbound_consignments. Objects of this class serve as prototypes for rows in queries. */
  class OutboundConsignments(_tableTag: Tag) extends profile.api.Table[OutboundConsignmentsRow](_tableTag, "outbound_consignments") {
    def * = (id, consignmentId, locationId, offerId) <> (OutboundConsignmentsRow.tupled, OutboundConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(locationId), Rep.Some(offerId))).shaped.<>({r=>import r._; _1.map(_=> OutboundConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column location_id SqlType(int8) */
    val locationId: Rep[Long] = column[Long]("location_id")
    /** Database column offer_id SqlType(int8) */
    val offerId: Rep[Long] = column[Long]("offer_id")

    /** Foreign key referencing Consignments (database name outbound_consignments_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("outbound_consignments_consignment_id_fkey", consignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CourierOffers (database name outbound_consignments_offer_id_fkey) */
    lazy val courierOffersFk = foreignKey("outbound_consignments_offer_id_fkey", offerId, CourierOffers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name outbound_consignments_location_id_fkey) */
    lazy val droplocationsFk = foreignKey("outbound_consignments_location_id_fkey", locationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OutboundConsignments */
  lazy val OutboundConsignments = new TableQuery(tag => new OutboundConsignments(tag))
}
