package models
// AUTO-GENERATED Slick data model for table DroplocationProductMapping
trait DroplocationProductMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DroplocationProductMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None)
   *  @param productId Database column product_id SqlType(int8), Default(None) */
  case class DroplocationProductMappingRow(id: Long, droplocationId: Option[Long] = None, productId: Option[Long] = None)
  /** GetResult implicit for fetching DroplocationProductMappingRow objects using plain SQL queries */
  implicit def GetResultDroplocationProductMappingRow(implicit e0: GR[Long], e1: GR[Option[Long]]): GR[DroplocationProductMappingRow] = GR{
    prs => import prs._
    DroplocationProductMappingRow.tupled((<<[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table droplocation_product_mapping. Objects of this class serve as prototypes for rows in queries. */
  class DroplocationProductMapping(_tableTag: Tag) extends profile.api.Table[DroplocationProductMappingRow](_tableTag, Some("ecommerce"), "droplocation_product_mapping") {
    def * = (id, droplocationId, productId) <> (DroplocationProductMappingRow.tupled, DroplocationProductMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), droplocationId, productId)).shaped.<>({r=>import r._; _1.map(_=> DroplocationProductMappingRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))
    /** Database column product_id SqlType(int8), Default(None) */
    val productId: Rep[Option[Long]] = column[Option[Long]]("product_id", O.Default(None))

    /** Foreign key referencing Droplocations (database name fk_droplocation_id) */
    lazy val droplocationsFk = foreignKey("fk_droplocation_id", droplocationId, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Product (database name fk_product_id) */
    lazy val productFk = foreignKey("fk_product_id", productId, Product)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DroplocationProductMapping */
  lazy val DroplocationProductMapping = new TableQuery(tag => new DroplocationProductMapping(tag))
}
