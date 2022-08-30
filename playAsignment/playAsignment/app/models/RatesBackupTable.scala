package models
// AUTO-GENERATED Slick data model for table RatesBackup
trait RatesBackupTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RatesBackup
   *  @param id Database column id SqlType(int8), Default(None)
   *  @param product Database column product SqlType(int8), Default(None)
   *  @param category Database column category SqlType(int8), Default(None)
   *  @param fromZone Database column from_zone SqlType(int8), Default(None)
   *  @param toZone Database column to_zone SqlType(int8), Default(None)
   *  @param chargeIncludingGst Database column charge_including_gst SqlType(int4), Default(None)
   *  @param dropoffSurcharge Database column dropoff_surcharge SqlType(int4), Default(None)
   *  @param agentDropoffBonus Database column agent_dropoff_bonus SqlType(int4), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None)
   *  @param invalidatedAt Database column invalidated_at SqlType(timestamptz), Default(None)
   *  @param additionalChargeKg Database column additional_charge_kg SqlType(int4), Default(None)
   *  @param actionCode Database column action_code SqlType(text), Default(None) */
  case class RatesBackupRow(id: Option[Long] = None, product: Option[Long] = None, category: Option[Long] = None, fromZone: Option[Long] = None, toZone: Option[Long] = None, chargeIncludingGst: Option[Int] = None, dropoffSurcharge: Option[Int] = None, agentDropoffBonus: Option[Int] = None, createdAt: Option[java.sql.Timestamp] = None, invalidatedAt: Option[java.sql.Timestamp] = None, additionalChargeKg: Option[Int] = None, actionCode: Option[String] = None)
  /** GetResult implicit for fetching RatesBackupRow objects using plain SQL queries */
  implicit def GetResultRatesBackupRow(implicit e0: GR[Option[Long]], e1: GR[Option[Int]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]]): GR[RatesBackupRow] = GR{
    prs => import prs._
    RatesBackupRow.tupled((<<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Int], <<?[Int], <<?[Int], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int], <<?[String]))
  }
  /** Table description of table rates_backup. Objects of this class serve as prototypes for rows in queries. */
  class RatesBackup(_tableTag: Tag) extends profile.api.Table[RatesBackupRow](_tableTag, Some("rate_card"), "rates_backup") {
    def * = (id, product, category, fromZone, toZone, chargeIncludingGst, dropoffSurcharge, agentDropoffBonus, createdAt, invalidatedAt, additionalChargeKg, actionCode) <> (RatesBackupRow.tupled, RatesBackupRow.unapply)

    /** Database column id SqlType(int8), Default(None) */
    val id: Rep[Option[Long]] = column[Option[Long]]("id", O.Default(None))
    /** Database column product SqlType(int8), Default(None) */
    val product: Rep[Option[Long]] = column[Option[Long]]("product", O.Default(None))
    /** Database column category SqlType(int8), Default(None) */
    val category: Rep[Option[Long]] = column[Option[Long]]("category", O.Default(None))
    /** Database column from_zone SqlType(int8), Default(None) */
    val fromZone: Rep[Option[Long]] = column[Option[Long]]("from_zone", O.Default(None))
    /** Database column to_zone SqlType(int8), Default(None) */
    val toZone: Rep[Option[Long]] = column[Option[Long]]("to_zone", O.Default(None))
    /** Database column charge_including_gst SqlType(int4), Default(None) */
    val chargeIncludingGst: Rep[Option[Int]] = column[Option[Int]]("charge_including_gst", O.Default(None))
    /** Database column dropoff_surcharge SqlType(int4), Default(None) */
    val dropoffSurcharge: Rep[Option[Int]] = column[Option[Int]]("dropoff_surcharge", O.Default(None))
    /** Database column agent_dropoff_bonus SqlType(int4), Default(None) */
    val agentDropoffBonus: Rep[Option[Int]] = column[Option[Int]]("agent_dropoff_bonus", O.Default(None))
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column invalidated_at SqlType(timestamptz), Default(None) */
    val invalidatedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("invalidated_at", O.Default(None))
    /** Database column additional_charge_kg SqlType(int4), Default(None) */
    val additionalChargeKg: Rep[Option[Int]] = column[Option[Int]]("additional_charge_kg", O.Default(None))
    /** Database column action_code SqlType(text), Default(None) */
    val actionCode: Rep[Option[String]] = column[Option[String]]("action_code", O.Default(None))
  }
  /** Collection-like TableQuery object for table RatesBackup */
  lazy val RatesBackup = new TableQuery(tag => new RatesBackup(tag))
}
