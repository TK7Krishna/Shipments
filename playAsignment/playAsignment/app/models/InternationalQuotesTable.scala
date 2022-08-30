package models
// AUTO-GENERATED Slick data model for table InternationalQuotes
trait InternationalQuotesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalQuotes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param fromSuburb Database column from_suburb SqlType(text)
   *  @param fromPostcode Database column from_postcode SqlType(text)
   *  @param toSuburb Database column to_suburb SqlType(text)
   *  @param toPostcode Database column to_postcode SqlType(text)
   *  @param fromCountryCode Database column from_country_code SqlType(text)
   *  @param toCountryCode Database column to_country_code SqlType(text) */
  case class InternationalQuotesRow(id: Long, fromSuburb: String, fromPostcode: String, toSuburb: String, toPostcode: String, fromCountryCode: String, toCountryCode: String)
  /** GetResult implicit for fetching InternationalQuotesRow objects using plain SQL queries */
  implicit def GetResultInternationalQuotesRow(implicit e0: GR[Long], e1: GR[String]): GR[InternationalQuotesRow] = GR{
    prs => import prs._
    InternationalQuotesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table international_quotes. Objects of this class serve as prototypes for rows in queries. */
  class InternationalQuotes(_tableTag: Tag) extends profile.api.Table[InternationalQuotesRow](_tableTag, Some("cpapi"), "international_quotes") {
    def * = (id, fromSuburb, fromPostcode, toSuburb, toPostcode, fromCountryCode, toCountryCode) <> (InternationalQuotesRow.tupled, InternationalQuotesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(fromSuburb), Rep.Some(fromPostcode), Rep.Some(toSuburb), Rep.Some(toPostcode), Rep.Some(fromCountryCode), Rep.Some(toCountryCode))).shaped.<>({r=>import r._; _1.map(_=> InternationalQuotesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column from_suburb SqlType(text) */
    val fromSuburb: Rep[String] = column[String]("from_suburb")
    /** Database column from_postcode SqlType(text) */
    val fromPostcode: Rep[String] = column[String]("from_postcode")
    /** Database column to_suburb SqlType(text) */
    val toSuburb: Rep[String] = column[String]("to_suburb")
    /** Database column to_postcode SqlType(text) */
    val toPostcode: Rep[String] = column[String]("to_postcode")
    /** Database column from_country_code SqlType(text) */
    val fromCountryCode: Rep[String] = column[String]("from_country_code")
    /** Database column to_country_code SqlType(text) */
    val toCountryCode: Rep[String] = column[String]("to_country_code")
  }
  /** Collection-like TableQuery object for table InternationalQuotes */
  lazy val InternationalQuotes = new TableQuery(tag => new InternationalQuotes(tag))
}
