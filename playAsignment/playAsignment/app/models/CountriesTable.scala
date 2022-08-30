package models
// AUTO-GENERATED Slick data model for table Countries
trait CountriesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Countries
   *  @param countryCode Database column country_code SqlType(text), PrimaryKey
   *  @param name Database column name SqlType(text) */
  case class CountriesRow(countryCode: String, name: String)
  /** GetResult implicit for fetching CountriesRow objects using plain SQL queries */
  implicit def GetResultCountriesRow(implicit e0: GR[String]): GR[CountriesRow] = GR{
    prs => import prs._
    CountriesRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table countries. Objects of this class serve as prototypes for rows in queries. */
  class Countries(_tableTag: Tag) extends profile.api.Table[CountriesRow](_tableTag, Some("rate_card"), "countries") {
    def * = (countryCode, name) <> (CountriesRow.tupled, CountriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(countryCode), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> CountriesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column country_code SqlType(text), PrimaryKey */
    val countryCode: Rep[String] = column[String]("country_code", O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table Countries */
  lazy val Countries = new TableQuery(tag => new Countries(tag))
}
