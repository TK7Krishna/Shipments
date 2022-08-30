package models
// AUTO-GENERATED Slick data model for table PaymentDisbursementMaccounts
trait PaymentDisbursementMaccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentDisbursementMaccounts
   *  @param disbursement Database column disbursement SqlType(int8), PrimaryKey
   *  @param amount Database column amount SqlType(float8)
   *  @param maccount Database column maccount SqlType(text) */
  case class PaymentDisbursementMaccountsRow(disbursement: Long, amount: Double, maccount: String)
  /** GetResult implicit for fetching PaymentDisbursementMaccountsRow objects using plain SQL queries */
  implicit def GetResultPaymentDisbursementMaccountsRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[String]): GR[PaymentDisbursementMaccountsRow] = GR{
    prs => import prs._
    PaymentDisbursementMaccountsRow.tupled((<<[Long], <<[Double], <<[String]))
  }
  /** Table description of table payment_disbursement_maccounts. Objects of this class serve as prototypes for rows in queries. */
  class PaymentDisbursementMaccounts(_tableTag: Tag) extends profile.api.Table[PaymentDisbursementMaccountsRow](_tableTag, Some("moneytech"), "payment_disbursement_maccounts") {
    def * = (disbursement, amount, maccount) <> (PaymentDisbursementMaccountsRow.tupled, PaymentDisbursementMaccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(disbursement), Rep.Some(amount), Rep.Some(maccount))).shaped.<>({r=>import r._; _1.map(_=> PaymentDisbursementMaccountsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column disbursement SqlType(int8), PrimaryKey */
    val disbursement: Rep[Long] = column[Long]("disbursement", O.PrimaryKey)
    /** Database column amount SqlType(float8) */
    val amount: Rep[Double] = column[Double]("amount")
    /** Database column maccount SqlType(text) */
    val maccount: Rep[String] = column[String]("maccount")

    /** Foreign key referencing PaymentDisbursements (database name payment_disbursement_maccounts_disbursement_fkey) */
    lazy val paymentDisbursementsFk = foreignKey("payment_disbursement_maccounts_disbursement_fkey", disbursement, PaymentDisbursements)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentDisbursementMaccounts */
  lazy val PaymentDisbursementMaccounts = new TableQuery(tag => new PaymentDisbursementMaccounts(tag))
}
