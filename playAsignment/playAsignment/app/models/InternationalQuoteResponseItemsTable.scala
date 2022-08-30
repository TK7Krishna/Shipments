package models
// AUTO-GENERATED Slick data model for table InternationalQuoteResponseItems
trait InternationalQuoteResponseItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalQuoteResponseItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param response Database column response SqlType(int8)
   *  @param calculatedFreightChargeRaw Database column calculated_freight_charge_raw SqlType(text)
   *  @param calculatedFreightChargeDecoded Database column calculated_freight_charge_decoded SqlType(int4)
   *  @param calculatedFuelChargeRaw Database column calculated_fuel_charge_raw SqlType(text)
   *  @param calculatedFuelChargeDecoded Database column calculated_fuel_charge_decoded SqlType(int4)
   *  @param eta Database column eta SqlType(text)
   *  @param serviceCode Database column service_code SqlType(text)
   *  @param serviceDescription Database column service_description SqlType(text)
   *  @param weight Database column weight SqlType(text) */
  case class InternationalQuoteResponseItemsRow(id: Long, response: Long, calculatedFreightChargeRaw: String, calculatedFreightChargeDecoded: Int, calculatedFuelChargeRaw: String, calculatedFuelChargeDecoded: Int, eta: String, serviceCode: String, serviceDescription: String, weight: String)
  /** GetResult implicit for fetching InternationalQuoteResponseItemsRow objects using plain SQL queries */
  implicit def GetResultInternationalQuoteResponseItemsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int]): GR[InternationalQuoteResponseItemsRow] = GR{
    prs => import prs._
    InternationalQuoteResponseItemsRow.tupled((<<[Long], <<[Long], <<[String], <<[Int], <<[String], <<[Int], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table international_quote_response_items. Objects of this class serve as prototypes for rows in queries. */
  class InternationalQuoteResponseItems(_tableTag: Tag) extends profile.api.Table[InternationalQuoteResponseItemsRow](_tableTag, Some("cpapi"), "international_quote_response_items") {
    def * = (id, response, calculatedFreightChargeRaw, calculatedFreightChargeDecoded, calculatedFuelChargeRaw, calculatedFuelChargeDecoded, eta, serviceCode, serviceDescription, weight) <> (InternationalQuoteResponseItemsRow.tupled, InternationalQuoteResponseItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(response), Rep.Some(calculatedFreightChargeRaw), Rep.Some(calculatedFreightChargeDecoded), Rep.Some(calculatedFuelChargeRaw), Rep.Some(calculatedFuelChargeDecoded), Rep.Some(eta), Rep.Some(serviceCode), Rep.Some(serviceDescription), Rep.Some(weight))).shaped.<>({r=>import r._; _1.map(_=> InternationalQuoteResponseItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column response SqlType(int8) */
    val response: Rep[Long] = column[Long]("response")
    /** Database column calculated_freight_charge_raw SqlType(text) */
    val calculatedFreightChargeRaw: Rep[String] = column[String]("calculated_freight_charge_raw")
    /** Database column calculated_freight_charge_decoded SqlType(int4) */
    val calculatedFreightChargeDecoded: Rep[Int] = column[Int]("calculated_freight_charge_decoded")
    /** Database column calculated_fuel_charge_raw SqlType(text) */
    val calculatedFuelChargeRaw: Rep[String] = column[String]("calculated_fuel_charge_raw")
    /** Database column calculated_fuel_charge_decoded SqlType(int4) */
    val calculatedFuelChargeDecoded: Rep[Int] = column[Int]("calculated_fuel_charge_decoded")
    /** Database column eta SqlType(text) */
    val eta: Rep[String] = column[String]("eta")
    /** Database column service_code SqlType(text) */
    val serviceCode: Rep[String] = column[String]("service_code")
    /** Database column service_description SqlType(text) */
    val serviceDescription: Rep[String] = column[String]("service_description")
    /** Database column weight SqlType(text) */
    val weight: Rep[String] = column[String]("weight")

    /** Foreign key referencing InternationalQuoteResponses (database name international_quote_response_items_response_fkey) */
    lazy val internationalQuoteResponsesFk = foreignKey("international_quote_response_items_response_fkey", response, InternationalQuoteResponses)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalQuoteResponseItems */
  lazy val InternationalQuoteResponseItems = new TableQuery(tag => new InternationalQuoteResponseItems(tag))
}
