package models
// AUTO-GENERATED Slick data model for table DomesticShipmentItems
trait DomesticShipmentItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DomesticShipmentItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param shipment Database column shipment SqlType(int8)
   *  @param quantity Database column quantity SqlType(int4)
   *  @param length Database column length SqlType(int4)
   *  @param height Database column height SqlType(int4)
   *  @param width Database column width SqlType(int4)
   *  @param physicalWeight Database column physical_weight SqlType(float8)
   *  @param volumetricweight Database column volumetricweight SqlType(float8)
   *  @param itemcode Database column itemcode SqlType(text), Default(None) */
  case class DomesticShipmentItemsRow(id: Long, shipment: Long, quantity: Int, length: Int, height: Int, width: Int, physicalWeight: Double, volumetricweight: Double, itemcode: Option[String] = None)
  /** GetResult implicit for fetching DomesticShipmentItemsRow objects using plain SQL queries */
  implicit def GetResultDomesticShipmentItemsRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[Double], e3: GR[Option[String]]): GR[DomesticShipmentItemsRow] = GR{
    prs => import prs._
    DomesticShipmentItemsRow.tupled((<<[Long], <<[Long], <<[Int], <<[Int], <<[Int], <<[Int], <<[Double], <<[Double], <<?[String]))
  }
  /** Table description of table domestic_shipment_items. Objects of this class serve as prototypes for rows in queries. */
  class DomesticShipmentItems(_tableTag: Tag) extends profile.api.Table[DomesticShipmentItemsRow](_tableTag, Some("standard_apis"), "domestic_shipment_items") {
    def * = (id, shipment, quantity, length, height, width, physicalWeight, volumetricweight, itemcode) <> (DomesticShipmentItemsRow.tupled, DomesticShipmentItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(shipment), Rep.Some(quantity), Rep.Some(length), Rep.Some(height), Rep.Some(width), Rep.Some(physicalWeight), Rep.Some(volumetricweight), itemcode)).shaped.<>({r=>import r._; _1.map(_=> DomesticShipmentItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column shipment SqlType(int8) */
    val shipment: Rep[Long] = column[Long]("shipment")
    /** Database column quantity SqlType(int4) */
    val quantity: Rep[Int] = column[Int]("quantity")
    /** Database column length SqlType(int4) */
    val length: Rep[Int] = column[Int]("length")
    /** Database column height SqlType(int4) */
    val height: Rep[Int] = column[Int]("height")
    /** Database column width SqlType(int4) */
    val width: Rep[Int] = column[Int]("width")
    /** Database column physical_weight SqlType(float8) */
    val physicalWeight: Rep[Double] = column[Double]("physical_weight")
    /** Database column volumetricweight SqlType(float8) */
    val volumetricweight: Rep[Double] = column[Double]("volumetricweight")
    /** Database column itemcode SqlType(text), Default(None) */
    val itemcode: Rep[Option[String]] = column[Option[String]]("itemcode", O.Default(None))

    /** Foreign key referencing DomesticShipments (database name domestic_shipment_items_shipment_fkey) */
    lazy val domesticShipmentsFk = foreignKey("domestic_shipment_items_shipment_fkey", shipment, DomesticShipments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DomesticShipmentItems */
  lazy val DomesticShipmentItems = new TableQuery(tag => new DomesticShipmentItems(tag))
}
