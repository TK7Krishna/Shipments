package models
// AUTO-GENERATED Slick data model for table MaccountNumbers
trait MaccountNumbersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table MaccountNumbers
   *  @param token Database column token SqlType(text), PrimaryKey */
  case class MaccountNumbersRow(token: String)
  /** GetResult implicit for fetching MaccountNumbersRow objects using plain SQL queries */
  implicit def GetResultMaccountNumbersRow(implicit e0: GR[String]): GR[MaccountNumbersRow] = GR{
    prs => import prs._
    MaccountNumbersRow(<<[String])
  }
  /** Table description of table maccount_numbers. Objects of this class serve as prototypes for rows in queries. */
  class MaccountNumbers(_tableTag: Tag) extends profile.api.Table[MaccountNumbersRow](_tableTag, Some("moneytech"), "maccount_numbers") {
    def * = token <> (MaccountNumbersRow, MaccountNumbersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(token)).shaped.<>(r => r.map(_=> MaccountNumbersRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column token SqlType(text), PrimaryKey */
    val token: Rep[String] = column[String]("token", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table MaccountNumbers */
  lazy val MaccountNumbers = new TableQuery(tag => new MaccountNumbers(tag))
}
