package models
// AUTO-GENERATED Slick data model for table NetworkCarriers
trait NetworkCarriersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table NetworkCarriers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courier Database column courier SqlType(text)
   *  @param droplocationId Database column droplocation_id SqlType(int8)
   *  @param enabled Database column enabled SqlType(bool), Default(Some(true))
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param productId Database column product_id SqlType(int8), Default(None) */
  case class NetworkCarriersRow(id: Long, courier: String, droplocationId: Long, enabled: Option[Boolean] = Some(true), createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None, productId: Option[Long] = None)
  /** GetResult implicit for fetching NetworkCarriersRow objects using plain SQL queries */
  implicit def GetResultNetworkCarriersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Long]]): GR[NetworkCarriersRow] = GR{
    prs => import prs._
    NetworkCarriersRow.tupled((<<[Long], <<[String], <<[Long], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table network_carriers. Objects of this class serve as prototypes for rows in queries. */
  class NetworkCarriers(_tableTag: Tag) extends profile.api.Table[NetworkCarriersRow](_tableTag, "network_carriers") {
    def * = (id, courier, droplocationId, enabled, createdAt, modifiedAt, productId) <> (NetworkCarriersRow.tupled, NetworkCarriersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courier), Rep.Some(droplocationId), enabled, createdAt, modifiedAt, productId)).shaped.<>({r=>import r._; _1.map(_=> NetworkCarriersRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column droplocation_id SqlType(int8) */
    val droplocationId: Rep[Long] = column[Long]("droplocation_id")
    /** Database column enabled SqlType(bool), Default(Some(true)) */
    val enabled: Rep[Option[Boolean]] = column[Option[Boolean]]("enabled", O.Default(Some(true)))
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column product_id SqlType(int8), Default(None) */
    val productId: Rep[Option[Long]] = column[Option[Long]]("product_id", O.Default(None))

    /** Foreign key referencing Couriers (database name courier_code_fk) */
    lazy val couriersFk = foreignKey("courier_code_fk", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name drop_location_id_fk) */
    lazy val droplocationsFk = foreignKey("drop_location_id_fk", droplocationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Product (database name network_carriers_product_id_fk) */
    lazy val productFk = foreignKey("network_carriers_product_id_fk", productId, Product)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table NetworkCarriers */
  lazy val NetworkCarriers = new TableQuery(tag => new NetworkCarriers(tag))
}
