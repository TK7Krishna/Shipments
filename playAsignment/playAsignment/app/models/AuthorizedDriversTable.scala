package models
// AUTO-GENERATED Slick data model for table AuthorizedDrivers
trait AuthorizedDriversTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AuthorizedDrivers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param identifier Database column identifier SqlType(text)
   *  @param barcodeToken Database column barcode_token SqlType(text)
   *  @param courier Database column courier SqlType(text)
   *  @param name Database column name SqlType(text), Default(None)
   *  @param email Database column email SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(text), Default(None)
   *  @param enabled Database column enabled SqlType(bool), Default(false)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param lastLogin Database column last_login SqlType(timestamptz)
   *  @param lastPinRefresh Database column last_pin_refresh SqlType(timestamptz)
   *  @param emailReceivers Database column email_receivers SqlType(jsonb), Length(2147483647,false), Default(None) */
  case class AuthorizedDriversRow(id: Long, identifier: String, barcodeToken: String, courier: String, name: Option[String] = None, email: Option[String] = None, phone: Option[String] = None, enabled: Boolean = false, createdAt: java.sql.Timestamp, lastLogin: Option[java.sql.Timestamp], lastPinRefresh: java.sql.Timestamp, emailReceivers: Option[String] = None)
  /** GetResult implicit for fetching AuthorizedDriversRow objects using plain SQL queries */
  implicit def GetResultAuthorizedDriversRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Boolean], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]]): GR[AuthorizedDriversRow] = GR{
    prs => import prs._
    AuthorizedDriversRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<[Boolean], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table authorized_drivers. Objects of this class serve as prototypes for rows in queries. */
  class AuthorizedDrivers(_tableTag: Tag) extends profile.api.Table[AuthorizedDriversRow](_tableTag, Some("locker"), "authorized_drivers") {
    def * = (id, identifier, barcodeToken, courier, name, email, phone, enabled, createdAt, lastLogin, lastPinRefresh, emailReceivers) <> (AuthorizedDriversRow.tupled, AuthorizedDriversRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(identifier), Rep.Some(barcodeToken), Rep.Some(courier), name, email, phone, Rep.Some(enabled), Rep.Some(createdAt), lastLogin, Rep.Some(lastPinRefresh), emailReceivers)).shaped.<>({r=>import r._; _1.map(_=> AuthorizedDriversRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8.get, _9.get, _10, _11.get, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column identifier SqlType(text) */
    val identifier: Rep[String] = column[String]("identifier")
    /** Database column barcode_token SqlType(text) */
    val barcodeToken: Rep[String] = column[String]("barcode_token")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))
    /** Database column phone SqlType(text), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Default(None))
    /** Database column enabled SqlType(bool), Default(false) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(false))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column last_login SqlType(timestamptz) */
    val lastLogin: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_login")
    /** Database column last_pin_refresh SqlType(timestamptz) */
    val lastPinRefresh: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_pin_refresh")
    /** Database column email_receivers SqlType(jsonb), Length(2147483647,false), Default(None) */
    val emailReceivers: Rep[Option[String]] = column[Option[String]]("email_receivers", O.Length(2147483647,varying=false), O.Default(None))

    /** Foreign key referencing Couriers (database name authorized_drivers_courier_fkey) */
    lazy val couriersFk = foreignKey("authorized_drivers_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (barcodeToken) (database name authorized_drivers_barcode_token_key) */
    val index1 = index("authorized_drivers_barcode_token_key", barcodeToken, unique=true)
    /** Index over (email) (database name authorized_drivers_email_key) */
    val index2 = index("authorized_drivers_email_key", email)
    /** Uniqueness Index over (identifier) (database name authorized_drivers_identifier_key) */
    val index3 = index("authorized_drivers_identifier_key", identifier, unique=true)
    /** Uniqueness Index over (email) (database name email_unique) */
    val index4 = index("email_unique", email, unique=true)
  }
  /** Collection-like TableQuery object for table AuthorizedDrivers */
  lazy val AuthorizedDrivers = new TableQuery(tag => new AuthorizedDrivers(tag))
}
