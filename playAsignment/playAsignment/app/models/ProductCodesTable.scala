package models
// AUTO-GENERATED Slick data model for table ProductCodes
trait ProductCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ProductCodes
   *  @param productCode Database column product_code SqlType(text), PrimaryKey
   *  @param productSize Database column product_size SqlType(text)
   *  @param productType Database column product_type SqlType(text)
   *  @param length Database column length SqlType(int4), Default(None)
   *  @param height Database column height SqlType(int4), Default(None)
   *  @param width Database column width SqlType(int4), Default(None) */
  case class ProductCodesRow(productCode: String, productSize: String, productType: String, length: Option[Int] = None, height: Option[Int] = None, width: Option[Int] = None)
  /** GetResult implicit for fetching ProductCodesRow objects using plain SQL queries */
  implicit def GetResultProductCodesRow(implicit e0: GR[String], e1: GR[Option[Int]]): GR[ProductCodesRow] = GR{
    prs => import prs._
    ProductCodesRow.tupled((<<[String], <<[String], <<[String], <<?[Int], <<?[Int], <<?[Int]))
  }
  /** Table description of table product_codes. Objects of this class serve as prototypes for rows in queries. */
  class ProductCodes(_tableTag: Tag) extends profile.api.Table[ProductCodesRow](_tableTag, Some("sevenelevenkiosk_outbound"), "product_codes") {
    def * = (productCode, productSize, productType, length, height, width) <> (ProductCodesRow.tupled, ProductCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(productCode), Rep.Some(productSize), Rep.Some(productType), length, height, width)).shaped.<>({r=>import r._; _1.map(_=> ProductCodesRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column product_code SqlType(text), PrimaryKey */
    val productCode: Rep[String] = column[String]("product_code", O.PrimaryKey)
    /** Database column product_size SqlType(text) */
    val productSize: Rep[String] = column[String]("product_size")
    /** Database column product_type SqlType(text) */
    val productType: Rep[String] = column[String]("product_type")
    /** Database column length SqlType(int4), Default(None) */
    val length: Rep[Option[Int]] = column[Option[Int]]("length", O.Default(None))
    /** Database column height SqlType(int4), Default(None) */
    val height: Rep[Option[Int]] = column[Option[Int]]("height", O.Default(None))
    /** Database column width SqlType(int4), Default(None) */
    val width: Rep[Option[Int]] = column[Option[Int]]("width", O.Default(None))
  }
  /** Collection-like TableQuery object for table ProductCodes */
  lazy val ProductCodes = new TableQuery(tag => new ProductCodes(tag))
}
