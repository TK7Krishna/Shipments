package models
// AUTO-GENERATED Slick data model for table EcommerceProductMapping
trait EcommerceProductMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceProductMapping
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param productId Database column product_id SqlType(int8)
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param enabled Database column enabled SqlType(bool), Default(true)
   *  @param selfEnabled Database column self_enabled SqlType(bool), Default(true) */
  case class EcommerceProductMappingRow(hubbedUserId: Long, productId: Long, id: Long, enabled: Boolean = true, selfEnabled: Boolean = true)
  /** GetResult implicit for fetching EcommerceProductMappingRow objects using plain SQL queries */
  implicit def GetResultEcommerceProductMappingRow(implicit e0: GR[Long], e1: GR[Boolean]): GR[EcommerceProductMappingRow] = GR{
    prs => import prs._
    EcommerceProductMappingRow.tupled((<<[Long], <<[Long], <<[Long], <<[Boolean], <<[Boolean]))
  }
  /** Table description of table ecommerce_product_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceProductMapping(_tableTag: Tag) extends profile.api.Table[EcommerceProductMappingRow](_tableTag, Some("ecommerce"), "ecommerce_product_mapping") {
    def * = (hubbedUserId, productId, id, enabled, selfEnabled) <> (EcommerceProductMappingRow.tupled, EcommerceProductMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(hubbedUserId), Rep.Some(productId), Rep.Some(id), Rep.Some(enabled), Rep.Some(selfEnabled))).shaped.<>({r=>import r._; _1.map(_=> EcommerceProductMappingRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column product_id SqlType(int8) */
    val productId: Rep[Long] = column[Long]("product_id")
    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column enabled SqlType(bool), Default(true) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(true))
    /** Database column self_enabled SqlType(bool), Default(true) */
    val selfEnabled: Rep[Boolean] = column[Boolean]("self_enabled", O.Default(true))

    /** Foreign key referencing HubbedUsers (database name fk_ecommerce_product_mapping_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("fk_ecommerce_product_mapping_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Product (database name fk_ecommerce_product_mapping_product_id) */
    lazy val productFk = foreignKey("fk_ecommerce_product_mapping_product_id", productId, Product)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceProductMapping */
  lazy val EcommerceProductMapping = new TableQuery(tag => new EcommerceProductMapping(tag))
}
