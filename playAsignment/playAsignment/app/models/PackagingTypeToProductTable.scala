package models
// AUTO-GENERATED Slick data model for table PackagingTypeToProduct
trait PackagingTypeToProductTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PackagingTypeToProduct
   *  @param packagingType Database column packaging_type SqlType(text)
   *  @param product Database column product SqlType(int8) */
  case class PackagingTypeToProductRow(packagingType: String, product: Long)
  /** GetResult implicit for fetching PackagingTypeToProductRow objects using plain SQL queries */
  implicit def GetResultPackagingTypeToProductRow(implicit e0: GR[String], e1: GR[Long]): GR[PackagingTypeToProductRow] = GR{
    prs => import prs._
    PackagingTypeToProductRow.tupled((<<[String], <<[Long]))
  }
  /** Table description of table packaging_type_to_product. Objects of this class serve as prototypes for rows in queries. */
  class PackagingTypeToProduct(_tableTag: Tag) extends profile.api.Table[PackagingTypeToProductRow](_tableTag, Some("rate_card"), "packaging_type_to_product") {
    def * = (packagingType, product) <> (PackagingTypeToProductRow.tupled, PackagingTypeToProductRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(packagingType), Rep.Some(product))).shaped.<>({r=>import r._; _1.map(_=> PackagingTypeToProductRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column packaging_type SqlType(text) */
    val packagingType: Rep[String] = column[String]("packaging_type")
    /** Database column product SqlType(int8) */
    val product: Rep[Long] = column[Long]("product")

    /** Primary key of PackagingTypeToProduct (database name packaging_type_to_product_pkey) */
    val pk = primaryKey("packaging_type_to_product_pkey", (packagingType, product))

    /** Foreign key referencing PackagingTypes (database name packaging_type_to_product_packaging_type_fkey) */
    lazy val packagingTypesFk = foreignKey("packaging_type_to_product_packaging_type_fkey", packagingType, PackagingTypes)(r => r.name, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Products (database name packaging_type_to_product_product_fkey) */
    lazy val productsFk = foreignKey("packaging_type_to_product_product_fkey", product, Products)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PackagingTypeToProduct */
  lazy val PackagingTypeToProduct = new TableQuery(tag => new PackagingTypeToProduct(tag))
}
