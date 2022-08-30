package models
// AUTO-GENERATED Slick data model for table RoadrunnersRates
trait RoadrunnersRatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RoadrunnersRates
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param product Database column product SqlType(text)
   *  @param originCode Database column origin_code SqlType(text)
   *  @param destCode Database column dest_code SqlType(text)
   *  @param buyPrice Database column buy_price SqlType(int4)
   *  @param sellPrice Database column sell_price SqlType(int4)
   *  @param agentCommission Database column agent_commission SqlType(int4)
   *  @param tax Database column tax SqlType(int4)
   *  @param active Database column active SqlType(bool)
   *  @param packageCode Database column package_code SqlType(text) */
  case class RoadrunnersRatesRow(id: Long, product: String, originCode: String, destCode: String, buyPrice: Int, sellPrice: Int, agentCommission: Int, tax: Int, active: Boolean, packageCode: String)
  /** GetResult implicit for fetching RoadrunnersRatesRow objects using plain SQL queries */
  implicit def GetResultRoadrunnersRatesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Boolean]): GR[RoadrunnersRatesRow] = GR{
    prs => import prs._
    RoadrunnersRatesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[Int], <<[Boolean], <<[String]))
  }
  /** Table description of table roadrunners_rates. Objects of this class serve as prototypes for rows in queries. */
  class RoadrunnersRates(_tableTag: Tag) extends profile.api.Table[RoadrunnersRatesRow](_tableTag, "roadrunners_rates") {
    def * = (id, product, originCode, destCode, buyPrice, sellPrice, agentCommission, tax, active, packageCode) <> (RoadrunnersRatesRow.tupled, RoadrunnersRatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(product), Rep.Some(originCode), Rep.Some(destCode), Rep.Some(buyPrice), Rep.Some(sellPrice), Rep.Some(agentCommission), Rep.Some(tax), Rep.Some(active), Rep.Some(packageCode))).shaped.<>({r=>import r._; _1.map(_=> RoadrunnersRatesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column product SqlType(text) */
    val product: Rep[String] = column[String]("product")
    /** Database column origin_code SqlType(text) */
    val originCode: Rep[String] = column[String]("origin_code")
    /** Database column dest_code SqlType(text) */
    val destCode: Rep[String] = column[String]("dest_code")
    /** Database column buy_price SqlType(int4) */
    val buyPrice: Rep[Int] = column[Int]("buy_price")
    /** Database column sell_price SqlType(int4) */
    val sellPrice: Rep[Int] = column[Int]("sell_price")
    /** Database column agent_commission SqlType(int4) */
    val agentCommission: Rep[Int] = column[Int]("agent_commission")
    /** Database column tax SqlType(int4) */
    val tax: Rep[Int] = column[Int]("tax")
    /** Database column active SqlType(bool) */
    val active: Rep[Boolean] = column[Boolean]("active")
    /** Database column package_code SqlType(text) */
    val packageCode: Rep[String] = column[String]("package_code")

    /** Foreign key referencing CourierspleasePackageCodes (database name roadrunners_rates_package_code_fkey) */
    lazy val courierspleasePackageCodesFk = foreignKey("roadrunners_rates_package_code_fkey", packageCode, CourierspleasePackageCodes)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table RoadrunnersRates */
  lazy val RoadrunnersRates = new TableQuery(tag => new RoadrunnersRates(tag))
}
