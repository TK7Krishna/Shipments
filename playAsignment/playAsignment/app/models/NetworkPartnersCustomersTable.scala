package models
// AUTO-GENERATED Slick data model for table NetworkPartnersCustomers
trait NetworkPartnersCustomersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table NetworkPartnersCustomers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param partnerId Database column partner_id SqlType(int8)
   *  @param customerId Database column customer_id SqlType(int8), Default(None)
   *  @param droplocationId Database column droplocation_id SqlType(int8)
   *  @param enabled Database column enabled SqlType(bool), Default(Some(true))
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param productId Database column product_id SqlType(int8), Default(None) */
  case class NetworkPartnersCustomersRow(id: Long, partnerId: Long, customerId: Option[Long] = None, droplocationId: Long, enabled: Option[Boolean] = Some(true), createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None, productId: Option[Long] = None)
  /** GetResult implicit for fetching NetworkPartnersCustomersRow objects using plain SQL queries */
  implicit def GetResultNetworkPartnersCustomersRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[Boolean]], e3: GR[Option[java.sql.Timestamp]]): GR[NetworkPartnersCustomersRow] = GR{
    prs => import prs._
    NetworkPartnersCustomersRow.tupled((<<[Long], <<[Long], <<?[Long], <<[Long], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table network_partners_customers. Objects of this class serve as prototypes for rows in queries. */
  class NetworkPartnersCustomers(_tableTag: Tag) extends profile.api.Table[NetworkPartnersCustomersRow](_tableTag, "network_partners_customers") {
    def * = (id, partnerId, customerId, droplocationId, enabled, createdAt, modifiedAt, productId) <> (NetworkPartnersCustomersRow.tupled, NetworkPartnersCustomersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(partnerId), customerId, Rep.Some(droplocationId), enabled, createdAt, modifiedAt, productId)).shaped.<>({r=>import r._; _1.map(_=> NetworkPartnersCustomersRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column partner_id SqlType(int8) */
    val partnerId: Rep[Long] = column[Long]("partner_id")
    /** Database column customer_id SqlType(int8), Default(None) */
    val customerId: Rep[Option[Long]] = column[Option[Long]]("customer_id", O.Default(None))
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

    /** Foreign key referencing Droplocations (database name drop_location_id_fk) */
    lazy val droplocationsFk = foreignKey("drop_location_id_fk", droplocationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name customer_hubbed_user_id_fk) */
    lazy val hubbedUsersFk2 = foreignKey("customer_hubbed_user_id_fk", customerId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name partner_hubbed_user_id_fk) */
    lazy val hubbedUsersFk3 = foreignKey("partner_hubbed_user_id_fk", partnerId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Product (database name network_partners_customers_product_id_fk) */
    lazy val productFk = foreignKey("network_partners_customers_product_id_fk", productId, Product)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (partnerId,customerId) (database name partner_customer_idx) */
    val index1 = index("partner_customer_idx", (partnerId, customerId))
  }
  /** Collection-like TableQuery object for table NetworkPartnersCustomers */
  lazy val NetworkPartnersCustomers = new TableQuery(tag => new NetworkPartnersCustomers(tag))
}
