package models
// AUTO-GENERATED Slick data model for table Droplocations
trait DroplocationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Droplocations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param capacity Database column capacity SqlType(float8), Default(-1.0)
   *  @param street1 Database column street1 SqlType(text)
   *  @param street2 Database column street2 SqlType(text), Default(None)
   *  @param city Database column city SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param postcode Database column postcode SqlType(text)
   *  @param country Database column country SqlType(text)
   *  @param lat Database column lat SqlType(float8)
   *  @param lon Database column lon SqlType(float8)
   *  @param enabled Database column enabled SqlType(bool), Default(false)
   *  @param createdat Database column createdat SqlType(timestamptz)
   *  @param modifiedat Database column modifiedat SqlType(timestamptz)
   *  @param courierspleaseaccount Database column courierspleaseaccount SqlType(text), Default(None)
   *  @param transactionAccount Database column transaction_account SqlType(int8)
   *  @param availableDelivery Database column available_delivery SqlType(bool), Default(true)
   *  @param availableDropoff Database column available_dropoff SqlType(bool), Default(false)
   *  @param operatingHours Database column operating_hours SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(text), Default(None)
   *  @param storeType Database column store_type SqlType(text)
   *  @param locationGeometry Database column location_geometry SqlType(geometry), Length(2147483647,false)
   *  @param consumerReferralCode Database column consumer_referral_code SqlType(text), Default(None)
   *  @param timezone Database column timezone SqlType(text), Default(None) */
  case class DroplocationsRow(id: Long, name: String, capacity: Double = -1.0, street1: String, street2: Option[String] = None, city: String, state: String, postcode: String, country: String, lat: Double, lon: Double, enabled: Boolean = false, createdat: java.sql.Timestamp, modifiedat: java.sql.Timestamp, courierspleaseaccount: Option[String] = None, transactionAccount: Long, availableDelivery: Boolean = true, availableDropoff: Boolean = false, operatingHours: Option[String] = None, phone: Option[String] = None, storeType: String, locationGeometry: String, consumerReferralCode: Option[String] = None, timezone: Option[String] = None)
  /** GetResult implicit for fetching DroplocationsRow objects using plain SQL queries */
  implicit def GetResultDroplocationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double], e3: GR[Option[String]], e4: GR[Boolean], e5: GR[java.sql.Timestamp]): GR[DroplocationsRow] = GR{
    prs => import prs._
    DroplocationsRow(<<[Long], <<[String], <<[Double], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[Double], <<[Double], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String], <<[Long], <<[Boolean], <<[Boolean], <<?[String], <<?[String], <<[String], <<[String], <<?[String], <<?[String])
  }
  /** Table description of table droplocations. Objects of this class serve as prototypes for rows in queries. */
  class Droplocations(_tableTag: Tag) extends profile.api.Table[DroplocationsRow](_tableTag, "droplocations") {
    def * = (id :: name :: capacity :: street1 :: street2 :: city :: state :: postcode :: country :: lat :: lon :: enabled :: createdat :: modifiedat :: courierspleaseaccount :: transactionAccount :: availableDelivery :: availableDropoff :: operatingHours :: phone :: storeType :: locationGeometry :: consumerReferralCode :: timezone :: HNil).mapTo[DroplocationsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(name) :: Rep.Some(capacity) :: Rep.Some(street1) :: street2 :: Rep.Some(city) :: Rep.Some(state) :: Rep.Some(postcode) :: Rep.Some(country) :: Rep.Some(lat) :: Rep.Some(lon) :: Rep.Some(enabled) :: Rep.Some(createdat) :: Rep.Some(modifiedat) :: courierspleaseaccount :: Rep.Some(transactionAccount) :: Rep.Some(availableDelivery) :: Rep.Some(availableDropoff) :: operatingHours :: phone :: Rep.Some(storeType) :: Rep.Some(locationGeometry) :: consumerReferralCode :: timezone :: HNil).shaped.<>(r => DroplocationsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[Double]].get, r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]].get, r(6).asInstanceOf[Option[String]].get, r(7).asInstanceOf[Option[String]].get, r(8).asInstanceOf[Option[String]].get, r(9).asInstanceOf[Option[Double]].get, r(10).asInstanceOf[Option[Double]].get, r(11).asInstanceOf[Option[Boolean]].get, r(12).asInstanceOf[Option[java.sql.Timestamp]].get, r(13).asInstanceOf[Option[java.sql.Timestamp]].get, r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[Long]].get, r(16).asInstanceOf[Option[Boolean]].get, r(17).asInstanceOf[Option[Boolean]].get, r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]].get, r(21).asInstanceOf[Option[String]].get, r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column capacity SqlType(float8), Default(-1.0) */
    val capacity: Rep[Double] = column[Double]("capacity", O.Default(-1.0))
    /** Database column street1 SqlType(text) */
    val street1: Rep[String] = column[String]("street1")
    /** Database column street2 SqlType(text), Default(None) */
    val street2: Rep[Option[String]] = column[Option[String]]("street2", O.Default(None))
    /** Database column city SqlType(text) */
    val city: Rep[String] = column[String]("city")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column country SqlType(text) */
    val country: Rep[String] = column[String]("country")
    /** Database column lat SqlType(float8) */
    val lat: Rep[Double] = column[Double]("lat")
    /** Database column lon SqlType(float8) */
    val lon: Rep[Double] = column[Double]("lon")
    /** Database column enabled SqlType(bool), Default(false) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(false))
    /** Database column createdat SqlType(timestamptz) */
    val createdat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("createdat")
    /** Database column modifiedat SqlType(timestamptz) */
    val modifiedat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modifiedat")
    /** Database column courierspleaseaccount SqlType(text), Default(None) */
    val courierspleaseaccount: Rep[Option[String]] = column[Option[String]]("courierspleaseaccount", O.Default(None))
    /** Database column transaction_account SqlType(int8) */
    val transactionAccount: Rep[Long] = column[Long]("transaction_account")
    /** Database column available_delivery SqlType(bool), Default(true) */
    val availableDelivery: Rep[Boolean] = column[Boolean]("available_delivery", O.Default(true))
    /** Database column available_dropoff SqlType(bool), Default(false) */
    val availableDropoff: Rep[Boolean] = column[Boolean]("available_dropoff", O.Default(false))
    /** Database column operating_hours SqlType(text), Default(None) */
    val operatingHours: Rep[Option[String]] = column[Option[String]]("operating_hours", O.Default(None))
    /** Database column phone SqlType(text), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Default(None))
    /** Database column store_type SqlType(text) */
    val storeType: Rep[String] = column[String]("store_type")
    /** Database column location_geometry SqlType(geometry), Length(2147483647,false) */
    val locationGeometry: Rep[String] = column[String]("location_geometry", O.Length(2147483647,varying=false))
    /** Database column consumer_referral_code SqlType(text), Default(None) */
    val consumerReferralCode: Rep[Option[String]] = column[Option[String]]("consumer_referral_code", O.Default(None))
    /** Database column timezone SqlType(text), Default(None) */
    val timezone: Rep[Option[String]] = column[Option[String]]("timezone", O.Default(None))

    /** Foreign key referencing AvailableTimezones (database name droplocations_timezone_fkey) */
    lazy val availableTimezonesFk = foreignKey("droplocations_timezone_fkey", timezone :: HNil, AvailableTimezones)(r => Rep.Some(r.ianaIdentifier) :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing StoreTypes (database name droplocations_store_type_fkey) */
    lazy val storeTypesFk = foreignKey("droplocations_store_type_fkey", storeType :: HNil, StoreTypes)(r => r.name :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionAccounts (database name droplocations_transaction_account_fkey) */
    lazy val transactionAccountsFk = foreignKey("droplocations_transaction_account_fkey", transactionAccount :: HNil, TransactionAccounts)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (locationGeometry) (database name droplocation_gix) */
    val index1 = index("droplocation_gix", locationGeometry :: HNil)
    /** Uniqueness Index over (consumerReferralCode) (database name droplocations_consumer_referral_code_key) */
    val index2 = index("droplocations_consumer_referral_code_key", consumerReferralCode :: HNil, unique=true)
    /** Index over (state,id) (database name droplocations_state_id_idx) */
    val index3 = index("droplocations_state_id_idx", state :: id :: HNil)
  }
  /** Collection-like TableQuery object for table Droplocations */
  lazy val Droplocations = new TableQuery(tag => new Droplocations(tag))
}
