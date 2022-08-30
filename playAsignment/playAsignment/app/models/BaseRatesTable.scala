package models
// AUTO-GENERATED Slick data model for table BaseRates
trait BaseRatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BaseRates
   *  @param product Database column product SqlType(int8), PrimaryKey
   *  @param baseCharge Database column base_charge SqlType(int4)
   *  @param dropoffSurcharge Database column dropoff_surcharge SqlType(int4)
   *  @param agentDropoffBonus Database column agent_dropoff_bonus SqlType(int4)
   *  @param additionalChargeKg Database column additional_charge_kg SqlType(int4) */
  case class BaseRatesRow(product: Long, baseCharge: Int, dropoffSurcharge: Int, agentDropoffBonus: Int, additionalChargeKg: Int)
  /** GetResult implicit for fetching BaseRatesRow objects using plain SQL queries */
  implicit def GetResultBaseRatesRow(implicit e0: GR[Long], e1: GR[Int]): GR[BaseRatesRow] = GR{
    prs => import prs._
    BaseRatesRow.tupled((<<[Long], <<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table base_rates. Objects of this class serve as prototypes for rows in queries. */
  class BaseRates(_tableTag: Tag) extends profile.api.Table[BaseRatesRow](_tableTag, Some("rate_admin"), "base_rates") {
    def * = (product, baseCharge, dropoffSurcharge, agentDropoffBonus, additionalChargeKg) <> (BaseRatesRow.tupled, BaseRatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(product), Rep.Some(baseCharge), Rep.Some(dropoffSurcharge), Rep.Some(agentDropoffBonus), Rep.Some(additionalChargeKg))).shaped.<>({r=>import r._; _1.map(_=> BaseRatesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column product SqlType(int8), PrimaryKey */
    val product: Rep[Long] = column[Long]("product", O.PrimaryKey)
    /** Database column base_charge SqlType(int4) */
    val baseCharge: Rep[Int] = column[Int]("base_charge")
    /** Database column dropoff_surcharge SqlType(int4) */
    val dropoffSurcharge: Rep[Int] = column[Int]("dropoff_surcharge")
    /** Database column agent_dropoff_bonus SqlType(int4) */
    val agentDropoffBonus: Rep[Int] = column[Int]("agent_dropoff_bonus")
    /** Database column additional_charge_kg SqlType(int4) */
    val additionalChargeKg: Rep[Int] = column[Int]("additional_charge_kg")

    /** Foreign key referencing Products (database name base_rates_product_fkey) */
    lazy val productsFk = foreignKey("base_rates_product_fkey", product, Products)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table BaseRates */
  lazy val BaseRates = new TableQuery(tag => new BaseRates(tag))
}
