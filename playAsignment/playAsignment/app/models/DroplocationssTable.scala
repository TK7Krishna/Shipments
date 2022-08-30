package models
// AUTO-GENERATED Slick data model for table Droplocationss
trait DroplocationssTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Droplocationss
   *  @param id Database column id SqlType(int8), Default(None)
   *  @param name Database column name SqlType(text), Default(None)
   *  @param capacity Database column capacity SqlType(float8), Default(None)
   *  @param street1 Database column street1 SqlType(text), Default(None)
   *  @param street2 Database column street2 SqlType(text), Default(None)
   *  @param city Database column city SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param postcode Database column postcode SqlType(text), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param lat Database column lat SqlType(float8), Default(None)
   *  @param lon Database column lon SqlType(float8), Default(None)
   *  @param enabled Database column enabled SqlType(bool), Default(None)
   *  @param createdat Database column createdat SqlType(timestamptz), Default(None)
   *  @param modifiedat Database column modifiedat SqlType(timestamptz), Default(None)
   *  @param courierspleaseaccount Database column courierspleaseaccount SqlType(text), Default(None)
   *  @param transactionAccount Database column transaction_account SqlType(int8), Default(None)
   *  @param availableDelivery Database column available_delivery SqlType(bool), Default(None)
   *  @param availableDropoff Database column available_dropoff SqlType(bool), Default(None)
   *  @param operatingHours Database column operating_hours SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(text), Default(None)
   *  @param storeType Database column store_type SqlType(text), Default(None)
   *  @param locationGeometry Database column location_geometry SqlType(geometry), Length(2147483647,false), Default(None)
   *  @param consumerReferralCode Database column consumer_referral_code SqlType(text), Default(None)
   *  @param timezone Database column timezone SqlType(text), Default(None) */
  case class DroplocationssRow(id: Option[Long] = None, name: Option[String] = None, capacity: Option[Double] = None, street1: Option[String] = None, street2: Option[String] = None, city: Option[String] = None, state: Option[String] = None, postcode: Option[String] = None, country: Option[String] = None, lat: Option[Double] = None, lon: Option[Double] = None, enabled: Option[Boolean] = None, createdat: Option[java.sql.Timestamp] = None, modifiedat: Option[java.sql.Timestamp] = None, courierspleaseaccount: Option[String] = None, transactionAccount: Option[Long] = None, availableDelivery: Option[Boolean] = None, availableDropoff: Option[Boolean] = None, operatingHours: Option[String] = None, phone: Option[String] = None, storeType: Option[String] = None, locationGeometry: Option[String] = None, consumerReferralCode: Option[String] = None, timezone: Option[String] = None)
  /** GetResult implicit for fetching DroplocationssRow objects using plain SQL queries */
  implicit def GetResultDroplocationssRow(implicit e0: GR[Option[Long]], e1: GR[Option[String]], e2: GR[Option[Double]], e3: GR[Option[Boolean]], e4: GR[Option[java.sql.Timestamp]]): GR[DroplocationssRow] = GR{
    prs => import prs._
    DroplocationssRow(<<?[Long], <<?[String], <<?[Double], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Double], <<?[Double], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[Long], <<?[Boolean], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String])
  }
  /** Table description of table droplocationss. Objects of this class serve as prototypes for rows in queries. */
  class Droplocationss(_tableTag: Tag) extends profile.api.Table[DroplocationssRow](_tableTag, "droplocationss") {
    def * = (id :: name :: capacity :: street1 :: street2 :: city :: state :: postcode :: country :: lat :: lon :: enabled :: createdat :: modifiedat :: courierspleaseaccount :: transactionAccount :: availableDelivery :: availableDropoff :: operatingHours :: phone :: storeType :: locationGeometry :: consumerReferralCode :: timezone :: HNil).mapTo[DroplocationssRow]

    /** Database column id SqlType(int8), Default(None) */
    val id: Rep[Option[Long]] = column[Option[Long]]("id", O.Default(None))
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column capacity SqlType(float8), Default(None) */
    val capacity: Rep[Option[Double]] = column[Option[Double]]("capacity", O.Default(None))
    /** Database column street1 SqlType(text), Default(None) */
    val street1: Rep[Option[String]] = column[Option[String]]("street1", O.Default(None))
    /** Database column street2 SqlType(text), Default(None) */
    val street2: Rep[Option[String]] = column[Option[String]]("street2", O.Default(None))
    /** Database column city SqlType(text), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column postcode SqlType(text), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column lat SqlType(float8), Default(None) */
    val lat: Rep[Option[Double]] = column[Option[Double]]("lat", O.Default(None))
    /** Database column lon SqlType(float8), Default(None) */
    val lon: Rep[Option[Double]] = column[Option[Double]]("lon", O.Default(None))
    /** Database column enabled SqlType(bool), Default(None) */
    val enabled: Rep[Option[Boolean]] = column[Option[Boolean]]("enabled", O.Default(None))
    /** Database column createdat SqlType(timestamptz), Default(None) */
    val createdat: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdat", O.Default(None))
    /** Database column modifiedat SqlType(timestamptz), Default(None) */
    val modifiedat: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modifiedat", O.Default(None))
    /** Database column courierspleaseaccount SqlType(text), Default(None) */
    val courierspleaseaccount: Rep[Option[String]] = column[Option[String]]("courierspleaseaccount", O.Default(None))
    /** Database column transaction_account SqlType(int8), Default(None) */
    val transactionAccount: Rep[Option[Long]] = column[Option[Long]]("transaction_account", O.Default(None))
    /** Database column available_delivery SqlType(bool), Default(None) */
    val availableDelivery: Rep[Option[Boolean]] = column[Option[Boolean]]("available_delivery", O.Default(None))
    /** Database column available_dropoff SqlType(bool), Default(None) */
    val availableDropoff: Rep[Option[Boolean]] = column[Option[Boolean]]("available_dropoff", O.Default(None))
    /** Database column operating_hours SqlType(text), Default(None) */
    val operatingHours: Rep[Option[String]] = column[Option[String]]("operating_hours", O.Default(None))
    /** Database column phone SqlType(text), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Default(None))
    /** Database column store_type SqlType(text), Default(None) */
    val storeType: Rep[Option[String]] = column[Option[String]]("store_type", O.Default(None))
    /** Database column location_geometry SqlType(geometry), Length(2147483647,false), Default(None) */
    val locationGeometry: Rep[Option[String]] = column[Option[String]]("location_geometry", O.Length(2147483647,varying=false), O.Default(None))
    /** Database column consumer_referral_code SqlType(text), Default(None) */
    val consumerReferralCode: Rep[Option[String]] = column[Option[String]]("consumer_referral_code", O.Default(None))
    /** Database column timezone SqlType(text), Default(None) */
    val timezone: Rep[Option[String]] = column[Option[String]]("timezone", O.Default(None))
  }
  /** Collection-like TableQuery object for table Droplocationss */
  lazy val Droplocationss = new TableQuery(tag => new Droplocationss(tag))
}
