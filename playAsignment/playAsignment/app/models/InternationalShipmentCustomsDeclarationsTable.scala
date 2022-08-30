package models
// AUTO-GENERATED Slick data model for table InternationalShipmentCustomsDeclarations
trait InternationalShipmentCustomsDeclarationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalShipmentCustomsDeclarations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param shipment Database column shipment SqlType(int8)
   *  @param itemDescription Database column item_description SqlType(text)
   *  @param numItems Database column num_items SqlType(int4)
   *  @param countryOfOrigin Database column country_of_origin SqlType(text)
   *  @param unitPrice Database column unit_price SqlType(float8)
   *  @param hsCode Database column hs_code SqlType(text), Default(None) */
  case class InternationalShipmentCustomsDeclarationsRow(id: Long, shipment: Long, itemDescription: String, numItems: Int, countryOfOrigin: String, unitPrice: Double, hsCode: Option[String] = None)
  /** GetResult implicit for fetching InternationalShipmentCustomsDeclarationsRow objects using plain SQL queries */
  implicit def GetResultInternationalShipmentCustomsDeclarationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Double], e4: GR[Option[String]]): GR[InternationalShipmentCustomsDeclarationsRow] = GR{
    prs => import prs._
    InternationalShipmentCustomsDeclarationsRow.tupled((<<[Long], <<[Long], <<[String], <<[Int], <<[String], <<[Double], <<?[String]))
  }
  /** Table description of table international_shipment_customs_declarations. Objects of this class serve as prototypes for rows in queries. */
  class InternationalShipmentCustomsDeclarations(_tableTag: Tag) extends profile.api.Table[InternationalShipmentCustomsDeclarationsRow](_tableTag, Some("cpapi"), "international_shipment_customs_declarations") {
    def * = (id, shipment, itemDescription, numItems, countryOfOrigin, unitPrice, hsCode) <> (InternationalShipmentCustomsDeclarationsRow.tupled, InternationalShipmentCustomsDeclarationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(shipment), Rep.Some(itemDescription), Rep.Some(numItems), Rep.Some(countryOfOrigin), Rep.Some(unitPrice), hsCode)).shaped.<>({r=>import r._; _1.map(_=> InternationalShipmentCustomsDeclarationsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column shipment SqlType(int8) */
    val shipment: Rep[Long] = column[Long]("shipment")
    /** Database column item_description SqlType(text) */
    val itemDescription: Rep[String] = column[String]("item_description")
    /** Database column num_items SqlType(int4) */
    val numItems: Rep[Int] = column[Int]("num_items")
    /** Database column country_of_origin SqlType(text) */
    val countryOfOrigin: Rep[String] = column[String]("country_of_origin")
    /** Database column unit_price SqlType(float8) */
    val unitPrice: Rep[Double] = column[Double]("unit_price")
    /** Database column hs_code SqlType(text), Default(None) */
    val hsCode: Rep[Option[String]] = column[Option[String]]("hs_code", O.Default(None))

    /** Foreign key referencing InternationalShipments (database name international_shipment_customs_declarations_shipment_fkey) */
    lazy val internationalShipmentsFk = foreignKey("international_shipment_customs_declarations_shipment_fkey", shipment, InternationalShipments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalShipmentCustomsDeclarations */
  lazy val InternationalShipmentCustomsDeclarations = new TableQuery(tag => new InternationalShipmentCustomsDeclarations(tag))
}
