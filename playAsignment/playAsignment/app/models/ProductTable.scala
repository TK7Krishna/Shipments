package models
// AUTO-GENERATED Slick data model for table Product
trait ProductTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Product
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param productname Database column productname SqlType(text)
   *  @param status Database column status SqlType(bool) */
  case class ProductRow(id: Long, productname: String, status: Boolean)
  /** GetResult implicit for fetching ProductRow objects using plain SQL queries */
  implicit def GetResultProductRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean]): GR[ProductRow] = GR{
    prs => import prs._
    ProductRow.tupled((<<[Long], <<[String], <<[Boolean]))
  }
  /** Table description of table product. Objects of this class serve as prototypes for rows in queries. */
  class Product(_tableTag: Tag) extends profile.api.Table[ProductRow](_tableTag, Some("ecommerce"), "product") {
    def * = (id, productname, status) <> (ProductRow.tupled, ProductRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(productname), Rep.Some(status))).shaped.<>({r=>import r._; _1.map(_=> ProductRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column productname SqlType(text) */
    val productname: Rep[String] = column[String]("productname")
    /** Database column status SqlType(bool) */
    val status: Rep[Boolean] = column[Boolean]("status")
  }
  /** Collection-like TableQuery object for table Product */
  lazy val Product = new TableQuery(tag => new Product(tag))
}
