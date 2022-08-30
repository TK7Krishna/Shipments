package models
// AUTO-GENERATED Slick data model for table CreateShippingLabelItems
trait CreateShippingLabelItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreateShippingLabelItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createShippingLabel Database column create_shipping_label SqlType(int8)
   *  @param consigneeAddress Database column consignee_address SqlType(text)
   *  @param shipmentId Database column shipment_id SqlType(text)
   *  @param packageDesc Database column package_desc SqlType(text)
   *  @param totalWeight Database column total_weight SqlType(int8)
   *  @param totalWeightUnit Database column total_weight_unit SqlType(text)
   *  @param dimensionUnit Database column dimension_unit SqlType(text)
   *  @param height Database column height SqlType(numeric)
   *  @param length Database column length SqlType(numeric)
   *  @param width Database column width SqlType(numeric)
   *  @param productCode Database column product_code SqlType(text)
   *  @param incoterm Database column incoterm SqlType(text), Default(None)
   *  @param contentIndicator Database column content_indicator SqlType(text), Default(None)
   *  @param totalValue Database column total_value SqlType(int8)
   *  @param currency Database column currency SqlType(text)
   *  @param remarks Database column remarks SqlType(text), Default(None)
   *  @param shipmentContents Database column shipment_contents SqlType(text) */
  case class CreateShippingLabelItemsRow(id: Long, createShippingLabel: Long, consigneeAddress: String, shipmentId: String, packageDesc: String, totalWeight: Long, totalWeightUnit: String, dimensionUnit: String, height: scala.math.BigDecimal, length: scala.math.BigDecimal, width: scala.math.BigDecimal, productCode: String, incoterm: Option[String] = None, contentIndicator: Option[String] = None, totalValue: Long, currency: String, remarks: Option[String] = None, shipmentContents: String)
  /** GetResult implicit for fetching CreateShippingLabelItemsRow objects using plain SQL queries */
  implicit def GetResultCreateShippingLabelItemsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[Option[String]]): GR[CreateShippingLabelItemsRow] = GR{
    prs => import prs._
    CreateShippingLabelItemsRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<[Long], <<[String], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<?[String], <<?[String], <<[Long], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table create_shipping_label_items. Objects of this class serve as prototypes for rows in queries. */
  class CreateShippingLabelItems(_tableTag: Tag) extends profile.api.Table[CreateShippingLabelItemsRow](_tableTag, Some("dhl_ecom"), "create_shipping_label_items") {
    def * = (id, createShippingLabel, consigneeAddress, shipmentId, packageDesc, totalWeight, totalWeightUnit, dimensionUnit, height, length, width, productCode, incoterm, contentIndicator, totalValue, currency, remarks, shipmentContents) <> (CreateShippingLabelItemsRow.tupled, CreateShippingLabelItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(createShippingLabel), Rep.Some(consigneeAddress), Rep.Some(shipmentId), Rep.Some(packageDesc), Rep.Some(totalWeight), Rep.Some(totalWeightUnit), Rep.Some(dimensionUnit), Rep.Some(height), Rep.Some(length), Rep.Some(width), Rep.Some(productCode), incoterm, contentIndicator, Rep.Some(totalValue), Rep.Some(currency), remarks, Rep.Some(shipmentContents))).shaped.<>({r=>import r._; _1.map(_=> CreateShippingLabelItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14, _15.get, _16.get, _17, _18.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_shipping_label SqlType(int8) */
    val createShippingLabel: Rep[Long] = column[Long]("create_shipping_label")
    /** Database column consignee_address SqlType(text) */
    val consigneeAddress: Rep[String] = column[String]("consignee_address")
    /** Database column shipment_id SqlType(text) */
    val shipmentId: Rep[String] = column[String]("shipment_id")
    /** Database column package_desc SqlType(text) */
    val packageDesc: Rep[String] = column[String]("package_desc")
    /** Database column total_weight SqlType(int8) */
    val totalWeight: Rep[Long] = column[Long]("total_weight")
    /** Database column total_weight_unit SqlType(text) */
    val totalWeightUnit: Rep[String] = column[String]("total_weight_unit")
    /** Database column dimension_unit SqlType(text) */
    val dimensionUnit: Rep[String] = column[String]("dimension_unit")
    /** Database column height SqlType(numeric) */
    val height: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("height")
    /** Database column length SqlType(numeric) */
    val length: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("length")
    /** Database column width SqlType(numeric) */
    val width: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("width")
    /** Database column product_code SqlType(text) */
    val productCode: Rep[String] = column[String]("product_code")
    /** Database column incoterm SqlType(text), Default(None) */
    val incoterm: Rep[Option[String]] = column[Option[String]]("incoterm", O.Default(None))
    /** Database column content_indicator SqlType(text), Default(None) */
    val contentIndicator: Rep[Option[String]] = column[Option[String]]("content_indicator", O.Default(None))
    /** Database column total_value SqlType(int8) */
    val totalValue: Rep[Long] = column[Long]("total_value")
    /** Database column currency SqlType(text) */
    val currency: Rep[String] = column[String]("currency")
    /** Database column remarks SqlType(text), Default(None) */
    val remarks: Rep[Option[String]] = column[Option[String]]("remarks", O.Default(None))
    /** Database column shipment_contents SqlType(text) */
    val shipmentContents: Rep[String] = column[String]("shipment_contents")

    /** Foreign key referencing CreateShippingLabels (database name create_shipping_label_items_create_shipping_label_fkey) */
    lazy val createShippingLabelsFk = foreignKey("create_shipping_label_items_create_shipping_label_fkey", createShippingLabel, CreateShippingLabels)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CreateShippingLabelItems */
  lazy val CreateShippingLabelItems = new TableQuery(tag => new CreateShippingLabelItems(tag))
}
