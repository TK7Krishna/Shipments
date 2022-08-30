package models
// AUTO-GENERATED Slick data model for table PaymentDisbursementBpays
trait PaymentDisbursementBpaysTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentDisbursementBpays
   *  @param disbursement Database column disbursement SqlType(int8), PrimaryKey
   *  @param amount Database column amount SqlType(float8)
   *  @param billerCode Database column biller_code SqlType(int8)
   *  @param referenceNumber Database column reference_number SqlType(text)
   *  @param mwalletToken Database column mwallet_token SqlType(text)
   *  @param mwalletPin Database column mwallet_pin SqlType(text) */
  case class PaymentDisbursementBpaysRow(disbursement: Long, amount: Double, billerCode: Long, referenceNumber: String, mwalletToken: String, mwalletPin: String)
  /** GetResult implicit for fetching PaymentDisbursementBpaysRow objects using plain SQL queries */
  implicit def GetResultPaymentDisbursementBpaysRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[String]): GR[PaymentDisbursementBpaysRow] = GR{
    prs => import prs._
    PaymentDisbursementBpaysRow.tupled((<<[Long], <<[Double], <<[Long], <<[String], <<[String], <<[String]))
  }
  /** Table description of table payment_disbursement_bpays. Objects of this class serve as prototypes for rows in queries. */
  class PaymentDisbursementBpays(_tableTag: Tag) extends profile.api.Table[PaymentDisbursementBpaysRow](_tableTag, Some("moneytech"), "payment_disbursement_bpays") {
    def * = (disbursement, amount, billerCode, referenceNumber, mwalletToken, mwalletPin) <> (PaymentDisbursementBpaysRow.tupled, PaymentDisbursementBpaysRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(disbursement), Rep.Some(amount), Rep.Some(billerCode), Rep.Some(referenceNumber), Rep.Some(mwalletToken), Rep.Some(mwalletPin))).shaped.<>({r=>import r._; _1.map(_=> PaymentDisbursementBpaysRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column disbursement SqlType(int8), PrimaryKey */
    val disbursement: Rep[Long] = column[Long]("disbursement", O.PrimaryKey)
    /** Database column amount SqlType(float8) */
    val amount: Rep[Double] = column[Double]("amount")
    /** Database column biller_code SqlType(int8) */
    val billerCode: Rep[Long] = column[Long]("biller_code")
    /** Database column reference_number SqlType(text) */
    val referenceNumber: Rep[String] = column[String]("reference_number")
    /** Database column mwallet_token SqlType(text) */
    val mwalletToken: Rep[String] = column[String]("mwallet_token")
    /** Database column mwallet_pin SqlType(text) */
    val mwalletPin: Rep[String] = column[String]("mwallet_pin")

    /** Foreign key referencing PaymentDisbursements (database name payment_disbursement_bpays_disbursement_fkey) */
    lazy val paymentDisbursementsFk = foreignKey("payment_disbursement_bpays_disbursement_fkey", disbursement, PaymentDisbursements)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentDisbursementBpays */
  lazy val PaymentDisbursementBpays = new TableQuery(tag => new PaymentDisbursementBpays(tag))
}
