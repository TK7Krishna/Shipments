package models
// AUTO-GENERATED Slick data model for table RoadrunnersOrders
trait RoadrunnersOrdersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RoadrunnersOrders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param offerId Database column offer_id SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text) */
  case class RoadrunnersOrdersRow(id: Long, offerId: Long, consignment: Long, consignmentNumber: String)
  /** GetResult implicit for fetching RoadrunnersOrdersRow objects using plain SQL queries */
  implicit def GetResultRoadrunnersOrdersRow(implicit e0: GR[Long], e1: GR[String]): GR[RoadrunnersOrdersRow] = GR{
    prs => import prs._
    RoadrunnersOrdersRow.tupled((<<[Long], <<[Long], <<[Long], <<[String]))
  }
  /** Table description of table roadrunners_orders. Objects of this class serve as prototypes for rows in queries. */
  class RoadrunnersOrders(_tableTag: Tag) extends profile.api.Table[RoadrunnersOrdersRow](_tableTag, "roadrunners_orders") {
    def * = (id, offerId, consignment, consignmentNumber) <> (RoadrunnersOrdersRow.tupled, RoadrunnersOrdersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(offerId), Rep.Some(consignment), Rep.Some(consignmentNumber))).shaped.<>({r=>import r._; _1.map(_=> RoadrunnersOrdersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column offer_id SqlType(int8) */
    val offerId: Rep[Long] = column[Long]("offer_id")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")

    /** Foreign key referencing CourierOffers (database name roadrunners_orders_offer_id_fkey) */
    lazy val courierOffersFk = foreignKey("roadrunners_orders_offer_id_fkey", offerId, CourierOffers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing RoadrunnersConsignments (database name roadrunners_orders_consignment_fkey) */
    lazy val roadrunnersConsignmentsFk = foreignKey("roadrunners_orders_consignment_fkey", consignment, RoadrunnersConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table RoadrunnersOrders */
  lazy val RoadrunnersOrders = new TableQuery(tag => new RoadrunnersOrders(tag))
}
