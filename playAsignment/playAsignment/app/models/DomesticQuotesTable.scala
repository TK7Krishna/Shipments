package models
// AUTO-GENERATED Slick data model for table DomesticQuotes
trait DomesticQuotesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DomesticQuotes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param calculatedFreightCharge Database column calculated_freight_charge SqlType(int4)
   *  @param calculatedFuelCharge Database column calculated_fuel_charge SqlType(int4)
   *  @param totalPrice Database column total_price SqlType(int4)
   *  @param eta Database column eta SqlType(text)
   *  @param pickupCutOffTime Database column pickup_cut_off_time SqlType(text)
   *  @param rateCardCode Database column rate_card_code SqlType(text)
   *  @param rateCardDescription Database column rate_card_description SqlType(text)
   *  @param weight Database column weight SqlType(text) */
  case class DomesticQuotesRow(id: Long, calculatedFreightCharge: Int, calculatedFuelCharge: Int, totalPrice: Int, eta: String, pickupCutOffTime: String, rateCardCode: String, rateCardDescription: String, weight: String)
  /** GetResult implicit for fetching DomesticQuotesRow objects using plain SQL queries */
  implicit def GetResultDomesticQuotesRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[String]): GR[DomesticQuotesRow] = GR{
    prs => import prs._
    DomesticQuotesRow.tupled((<<[Long], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table domestic_quotes. Objects of this class serve as prototypes for rows in queries. */
  class DomesticQuotes(_tableTag: Tag) extends profile.api.Table[DomesticQuotesRow](_tableTag, Some("cpapi"), "domestic_quotes") {
    def * = (id, calculatedFreightCharge, calculatedFuelCharge, totalPrice, eta, pickupCutOffTime, rateCardCode, rateCardDescription, weight) <> (DomesticQuotesRow.tupled, DomesticQuotesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(calculatedFreightCharge), Rep.Some(calculatedFuelCharge), Rep.Some(totalPrice), Rep.Some(eta), Rep.Some(pickupCutOffTime), Rep.Some(rateCardCode), Rep.Some(rateCardDescription), Rep.Some(weight))).shaped.<>({r=>import r._; _1.map(_=> DomesticQuotesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column calculated_freight_charge SqlType(int4) */
    val calculatedFreightCharge: Rep[Int] = column[Int]("calculated_freight_charge")
    /** Database column calculated_fuel_charge SqlType(int4) */
    val calculatedFuelCharge: Rep[Int] = column[Int]("calculated_fuel_charge")
    /** Database column total_price SqlType(int4) */
    val totalPrice: Rep[Int] = column[Int]("total_price")
    /** Database column eta SqlType(text) */
    val eta: Rep[String] = column[String]("eta")
    /** Database column pickup_cut_off_time SqlType(text) */
    val pickupCutOffTime: Rep[String] = column[String]("pickup_cut_off_time")
    /** Database column rate_card_code SqlType(text) */
    val rateCardCode: Rep[String] = column[String]("rate_card_code")
    /** Database column rate_card_description SqlType(text) */
    val rateCardDescription: Rep[String] = column[String]("rate_card_description")
    /** Database column weight SqlType(text) */
    val weight: Rep[String] = column[String]("weight")
  }
  /** Collection-like TableQuery object for table DomesticQuotes */
  lazy val DomesticQuotes = new TableQuery(tag => new DomesticQuotes(tag))
}
