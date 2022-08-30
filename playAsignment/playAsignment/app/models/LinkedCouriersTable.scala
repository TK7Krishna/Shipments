package models
// AUTO-GENERATED Slick data model for table LinkedCouriers
trait LinkedCouriersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LinkedCouriers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courier Database column courier SqlType(text)
   *  @param linkedCourier Database column linked_courier SqlType(text)
   *  @param barcodePrefix Database column barcode_prefix SqlType(text)
   *  @param active Database column active SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamp) */
  case class LinkedCouriersRow(id: Long, courier: String, linkedCourier: String, barcodePrefix: String, active: Option[Boolean] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching LinkedCouriersRow objects using plain SQL queries */
  implicit def GetResultLinkedCouriersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp]): GR[LinkedCouriersRow] = GR{
    prs => import prs._
    LinkedCouriersRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table linked_couriers. Objects of this class serve as prototypes for rows in queries. */
  class LinkedCouriers(_tableTag: Tag) extends profile.api.Table[LinkedCouriersRow](_tableTag, Some("external_online"), "linked_couriers") {
    def * = (id, courier, linkedCourier, barcodePrefix, active, createdAt) <> (LinkedCouriersRow.tupled, LinkedCouriersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courier), Rep.Some(linkedCourier), Rep.Some(barcodePrefix), active, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> LinkedCouriersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column linked_courier SqlType(text) */
    val linkedCourier: Rep[String] = column[String]("linked_courier")
    /** Database column barcode_prefix SqlType(text) */
    val barcodePrefix: Rep[String] = column[String]("barcode_prefix")
    /** Database column active SqlType(bool), Default(None) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(None))
    /** Database column created_at SqlType(timestamp) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Couriers (database name linked_couriers_courier_fkey) */
    lazy val couriersFk1 = foreignKey("linked_couriers_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name linked_couriers_linked_courier_fkey) */
    lazy val couriersFk2 = foreignKey("linked_couriers_linked_courier_fkey", linkedCourier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LinkedCouriers */
  lazy val LinkedCouriers = new TableQuery(tag => new LinkedCouriers(tag))
}
