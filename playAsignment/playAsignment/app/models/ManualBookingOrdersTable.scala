package models
// AUTO-GENERATED Slick data model for table ManualBookingOrders
trait ManualBookingOrdersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ManualBookingOrders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param offerId Database column offer_id SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param externalConsignment Database column external_consignment SqlType(text), Default(None) */
  case class ManualBookingOrdersRow(id: Long, offerId: Long, consignment: Long, consignmentNumber: String, externalConsignment: Option[String] = None)
  /** GetResult implicit for fetching ManualBookingOrdersRow objects using plain SQL queries */
  implicit def GetResultManualBookingOrdersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[ManualBookingOrdersRow] = GR{
    prs => import prs._
    ManualBookingOrdersRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<?[String]))
  }
  /** Table description of table manual_booking_orders. Objects of this class serve as prototypes for rows in queries. */
  class ManualBookingOrders(_tableTag: Tag) extends profile.api.Table[ManualBookingOrdersRow](_tableTag, "manual_booking_orders") {
    def * = (id, offerId, consignment, consignmentNumber, externalConsignment) <> (ManualBookingOrdersRow.tupled, ManualBookingOrdersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(offerId), Rep.Some(consignment), Rep.Some(consignmentNumber), externalConsignment)).shaped.<>({r=>import r._; _1.map(_=> ManualBookingOrdersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column offer_id SqlType(int8) */
    val offerId: Rep[Long] = column[Long]("offer_id")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column external_consignment SqlType(text), Default(None) */
    val externalConsignment: Rep[Option[String]] = column[Option[String]]("external_consignment", O.Default(None))

    /** Foreign key referencing CourierOffers (database name manual_booking_orders_offer_id_fkey) */
    lazy val courierOffersFk = foreignKey("manual_booking_orders_offer_id_fkey", offerId, CourierOffers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ManualBookingConsignments (database name manual_booking_orders_consignment_fkey) */
    lazy val manualBookingConsignmentsFk = foreignKey("manual_booking_orders_consignment_fkey", consignment, ManualBookingConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ManualBookingOrders */
  lazy val ManualBookingOrders = new TableQuery(tag => new ManualBookingOrders(tag))
}
