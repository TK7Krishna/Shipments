package models
// AUTO-GENERATED Slick data model for table CourierspleaseOrders
trait CourierspleaseOrdersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseOrders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param offerId Database column offer_id SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text) */
  case class CourierspleaseOrdersRow(id: Long, offerId: Long, consignment: Long, consignmentNumber: String)
  /** GetResult implicit for fetching CourierspleaseOrdersRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseOrdersRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierspleaseOrdersRow] = GR{
    prs => import prs._
    CourierspleaseOrdersRow.tupled((<<[Long], <<[Long], <<[Long], <<[String]))
  }
  /** Table description of table couriersplease_orders. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseOrders(_tableTag: Tag) extends profile.api.Table[CourierspleaseOrdersRow](_tableTag, "couriersplease_orders") {
    def * = (id, offerId, consignment, consignmentNumber) <> (CourierspleaseOrdersRow.tupled, CourierspleaseOrdersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(offerId), Rep.Some(consignment), Rep.Some(consignmentNumber))).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseOrdersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column offer_id SqlType(int8) */
    val offerId: Rep[Long] = column[Long]("offer_id")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")

    /** Foreign key referencing CourierOffers (database name couriersplease_orders_offer_id_fkey) */
    lazy val courierOffersFk = foreignKey("couriersplease_orders_offer_id_fkey", offerId, CourierOffers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CourierspleaseConsignments (database name couriersplease_orders_consignment_fkey) */
    lazy val courierspleaseConsignmentsFk = foreignKey("couriersplease_orders_consignment_fkey", consignment, CourierspleaseConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (consignmentNumber) (database name unique_connote) */
    val index1 = index("unique_connote", consignmentNumber, unique=true)
  }
  /** Collection-like TableQuery object for table CourierspleaseOrders */
  lazy val CourierspleaseOrders = new TableQuery(tag => new CourierspleaseOrders(tag))
}
