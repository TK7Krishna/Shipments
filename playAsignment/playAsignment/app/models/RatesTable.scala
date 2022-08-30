package models
// AUTO-GENERATED Slick data model for table Rates
trait RatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Rates
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param product Database column product SqlType(int8)
   *  @param category Database column category SqlType(int8)
   *  @param fromZone Database column from_zone SqlType(int8)
   *  @param toZone Database column to_zone SqlType(int8)
   *  @param chargeIncludingGst Database column charge_including_gst SqlType(int4)
   *  @param dropoffSurcharge Database column dropoff_surcharge SqlType(int4)
   *  @param agentDropoffBonus Database column agent_dropoff_bonus SqlType(int4)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param invalidatedAt Database column invalidated_at SqlType(timestamptz), Default(None)
   *  @param additionalChargeKg Database column additional_charge_kg SqlType(int4)
   *  @param actionCode Database column action_code SqlType(text), Default(None) */
  case class RatesRow(id: Long, product: Long, category: Long, fromZone: Long, toZone: Long, chargeIncludingGst: Int, dropoffSurcharge: Int, agentDropoffBonus: Int, createdAt: java.sql.Timestamp, invalidatedAt: Option[java.sql.Timestamp] = None, additionalChargeKg: Int, actionCode: Option[String] = None)
  /** GetResult implicit for fetching RatesRow objects using plain SQL queries */
  implicit def GetResultRatesRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[String]]): GR[RatesRow] = GR{
    prs => import prs._
    RatesRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Int], <<?[String]))
  }
  /** Table description of table rates. Objects of this class serve as prototypes for rows in queries. */
  class Rates(_tableTag: Tag) extends profile.api.Table[RatesRow](_tableTag, Some("rate_card"), "rates") {
    def * = (id, product, category, fromZone, toZone, chargeIncludingGst, dropoffSurcharge, agentDropoffBonus, createdAt, invalidatedAt, additionalChargeKg, actionCode) <> (RatesRow.tupled, RatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(product), Rep.Some(category), Rep.Some(fromZone), Rep.Some(toZone), Rep.Some(chargeIncludingGst), Rep.Some(dropoffSurcharge), Rep.Some(agentDropoffBonus), Rep.Some(createdAt), invalidatedAt, Rep.Some(additionalChargeKg), actionCode)).shaped.<>({r=>import r._; _1.map(_=> RatesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10, _11.get, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column product SqlType(int8) */
    val product: Rep[Long] = column[Long]("product")
    /** Database column category SqlType(int8) */
    val category: Rep[Long] = column[Long]("category")
    /** Database column from_zone SqlType(int8) */
    val fromZone: Rep[Long] = column[Long]("from_zone")
    /** Database column to_zone SqlType(int8) */
    val toZone: Rep[Long] = column[Long]("to_zone")
    /** Database column charge_including_gst SqlType(int4) */
    val chargeIncludingGst: Rep[Int] = column[Int]("charge_including_gst")
    /** Database column dropoff_surcharge SqlType(int4) */
    val dropoffSurcharge: Rep[Int] = column[Int]("dropoff_surcharge")
    /** Database column agent_dropoff_bonus SqlType(int4) */
    val agentDropoffBonus: Rep[Int] = column[Int]("agent_dropoff_bonus")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column invalidated_at SqlType(timestamptz), Default(None) */
    val invalidatedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("invalidated_at", O.Default(None))
    /** Database column additional_charge_kg SqlType(int4) */
    val additionalChargeKg: Rep[Int] = column[Int]("additional_charge_kg")
    /** Database column action_code SqlType(text), Default(None) */
    val actionCode: Rep[Option[String]] = column[Option[String]]("action_code", O.Default(None))

    /** Foreign key referencing Categories (database name rates_category_fkey) */
    lazy val categoriesFk = foreignKey("rates_category_fkey", category, Categories)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Products (database name rates_product_fkey) */
    lazy val productsFk = foreignKey("rates_product_fkey", product, Products)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Zones (database name rates_from_zone_fkey) */
    lazy val zonesFk3 = foreignKey("rates_from_zone_fkey", fromZone, Zones)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Zones (database name rates_to_zone_fkey) */
    lazy val zonesFk4 = foreignKey("rates_to_zone_fkey", toZone, Zones)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (product,category,fromZone,toZone) (database name unique_active_rate_params) */
    val index1 = index("unique_active_rate_params", (product, category, fromZone, toZone), unique=true)
  }
  /** Collection-like TableQuery object for table Rates */
  lazy val Rates = new TableQuery(tag => new Rates(tag))
}
