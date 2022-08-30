package models
// AUTO-GENERATED Slick data model for table PaymentDisbursementTypes
trait PaymentDisbursementTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentDisbursementTypes
   *  @param name Database column name SqlType(text), PrimaryKey */
  case class PaymentDisbursementTypesRow(name: String)
  /** GetResult implicit for fetching PaymentDisbursementTypesRow objects using plain SQL queries */
  implicit def GetResultPaymentDisbursementTypesRow(implicit e0: GR[String]): GR[PaymentDisbursementTypesRow] = GR{
    prs => import prs._
    PaymentDisbursementTypesRow(<<[String])
  }
  /** Table description of table payment_disbursement_types. Objects of this class serve as prototypes for rows in queries. */
  class PaymentDisbursementTypes(_tableTag: Tag) extends profile.api.Table[PaymentDisbursementTypesRow](_tableTag, Some("moneytech"), "payment_disbursement_types") {
    def * = name <> (PaymentDisbursementTypesRow, PaymentDisbursementTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(name)).shaped.<>(r => r.map(_=> PaymentDisbursementTypesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(text), PrimaryKey */
    val name: Rep[String] = column[String]("name", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table PaymentDisbursementTypes */
  lazy val PaymentDisbursementTypes = new TableQuery(tag => new PaymentDisbursementTypes(tag))
}
