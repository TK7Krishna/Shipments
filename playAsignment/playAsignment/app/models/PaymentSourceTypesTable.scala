package models
// AUTO-GENERATED Slick data model for table PaymentSourceTypes
trait PaymentSourceTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentSourceTypes
   *  @param name Database column name SqlType(text), PrimaryKey */
  case class PaymentSourceTypesRow(name: String)
  /** GetResult implicit for fetching PaymentSourceTypesRow objects using plain SQL queries */
  implicit def GetResultPaymentSourceTypesRow(implicit e0: GR[String]): GR[PaymentSourceTypesRow] = GR{
    prs => import prs._
    PaymentSourceTypesRow(<<[String])
  }
  /** Table description of table payment_source_types. Objects of this class serve as prototypes for rows in queries. */
  class PaymentSourceTypes(_tableTag: Tag) extends profile.api.Table[PaymentSourceTypesRow](_tableTag, Some("moneytech"), "payment_source_types") {
    def * = name <> (PaymentSourceTypesRow, PaymentSourceTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(name)).shaped.<>(r => r.map(_=> PaymentSourceTypesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(text), PrimaryKey */
    val name: Rep[String] = column[String]("name", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table PaymentSourceTypes */
  lazy val PaymentSourceTypes = new TableQuery(tag => new PaymentSourceTypes(tag))
}
