package models
// AUTO-GENERATED Slick data model for table Products
trait ProductsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Products
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param productCode Database column product_code SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param weightLimit Database column weight_limit SqlType(int8)
   *  @param volumeLimit Database column volume_limit SqlType(int8), Default(None)
   *  @param packagingType Database column packaging_type SqlType(text)
   *  @param rateCardCode Database column rate_card_code SqlType(text)
   *  @param dimensionLimit Database column dimension_limit SqlType(int8), Default(None)
   *  @param dimensionSumLimit Database column dimension_sum_limit SqlType(int8), Default(None)
   *  @param productClass Database column product_class SqlType(int8) */
  case class ProductsRow(id: Long, productCode: String, description: String, weightLimit: Long, volumeLimit: Option[Long] = None, packagingType: String, rateCardCode: String, dimensionLimit: Option[Long] = None, dimensionSumLimit: Option[Long] = None, productClass: Long)
  /** GetResult implicit for fetching ProductsRow objects using plain SQL queries */
  implicit def GetResultProductsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]]): GR[ProductsRow] = GR{
    prs => import prs._
    ProductsRow.tupled((<<[Long], <<[String], <<[String], <<[Long], <<?[Long], <<[String], <<[String], <<?[Long], <<?[Long], <<[Long]))
  }
  /** Table description of table products. Objects of this class serve as prototypes for rows in queries. */
  class Products(_tableTag: Tag) extends profile.api.Table[ProductsRow](_tableTag, Some("rate_card"), "products") {
    def * = (id, productCode, description, weightLimit, volumeLimit, packagingType, rateCardCode, dimensionLimit, dimensionSumLimit, productClass) <> (ProductsRow.tupled, ProductsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(productCode), Rep.Some(description), Rep.Some(weightLimit), volumeLimit, Rep.Some(packagingType), Rep.Some(rateCardCode), dimensionLimit, dimensionSumLimit, Rep.Some(productClass))).shaped.<>({r=>import r._; _1.map(_=> ProductsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8, _9, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column product_code SqlType(text) */
    val productCode: Rep[String] = column[String]("product_code")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column weight_limit SqlType(int8) */
    val weightLimit: Rep[Long] = column[Long]("weight_limit")
    /** Database column volume_limit SqlType(int8), Default(None) */
    val volumeLimit: Rep[Option[Long]] = column[Option[Long]]("volume_limit", O.Default(None))
    /** Database column packaging_type SqlType(text) */
    val packagingType: Rep[String] = column[String]("packaging_type")
    /** Database column rate_card_code SqlType(text) */
    val rateCardCode: Rep[String] = column[String]("rate_card_code")
    /** Database column dimension_limit SqlType(int8), Default(None) */
    val dimensionLimit: Rep[Option[Long]] = column[Option[Long]]("dimension_limit", O.Default(None))
    /** Database column dimension_sum_limit SqlType(int8), Default(None) */
    val dimensionSumLimit: Rep[Option[Long]] = column[Option[Long]]("dimension_sum_limit", O.Default(None))
    /** Database column product_class SqlType(int8) */
    val productClass: Rep[Long] = column[Long]("product_class")

    /** Foreign key referencing PackagingTypes (database name products_packaging_type_fkey) */
    lazy val packagingTypesFk = foreignKey("products_packaging_type_fkey", packagingType, PackagingTypes)(r => r.name, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ProductClass (database name products_product_class_fkey) */
    lazy val productClassFk = foreignKey("products_product_class_fkey", productClass, ProductClass)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Products */
  lazy val Products = new TableQuery(tag => new Products(tag))
}
