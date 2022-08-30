package models
// AUTO-GENERATED Slick data model for table ProductClass
trait ProductClassTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ProductClass
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param courier Database column courier SqlType(text)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param payorAccount Database column payor_account SqlType(text), Default(None)
   *  @param serviceName Database column service_name SqlType(text), Default(None)
   *  @param serviceType Database column service_type SqlType(text), Default(None) */
  case class ProductClassRow(id: Long, name: String, courier: String, description: Option[String] = None, payorAccount: Option[String] = None, serviceName: Option[String] = None, serviceType: Option[String] = None)
  /** GetResult implicit for fetching ProductClassRow objects using plain SQL queries */
  implicit def GetResultProductClassRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[ProductClassRow] = GR{
    prs => import prs._
    ProductClassRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table product_class. Objects of this class serve as prototypes for rows in queries. */
  class ProductClass(_tableTag: Tag) extends profile.api.Table[ProductClassRow](_tableTag, Some("rate_card"), "product_class") {
    def * = (id, name, courier, description, payorAccount, serviceName, serviceType) <> (ProductClassRow.tupled, ProductClassRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(courier), description, payorAccount, serviceName, serviceType)).shaped.<>({r=>import r._; _1.map(_=> ProductClassRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column payor_account SqlType(text), Default(None) */
    val payorAccount: Rep[Option[String]] = column[Option[String]]("payor_account", O.Default(None))
    /** Database column service_name SqlType(text), Default(None) */
    val serviceName: Rep[Option[String]] = column[Option[String]]("service_name", O.Default(None))
    /** Database column service_type SqlType(text), Default(None) */
    val serviceType: Rep[Option[String]] = column[Option[String]]("service_type", O.Default(None))

    /** Foreign key referencing Couriers (database name product_class_courier_fkey) */
    lazy val couriersFk = foreignKey("product_class_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (name,courier) (database name product_class_name_courier_idx) */
    val index1 = index("product_class_name_courier_idx", (name, courier), unique=true)
  }
  /** Collection-like TableQuery object for table ProductClass */
  lazy val ProductClass = new TableQuery(tag => new ProductClass(tag))
}
