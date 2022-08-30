package models
// AUTO-GENERATED Slick data model for table BpayPaymentReceipts
trait BpayPaymentReceiptsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BpayPaymentReceipts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param response Database column response SqlType(int8)
   *  @param receiptNumber Database column receipt_number SqlType(int8)
   *  @param billerCode Database column biller_code SqlType(int8)
   *  @param referenceNumber Database column reference_number SqlType(text)
   *  @param amount Database column amount SqlType(float8) */
  case class BpayPaymentReceiptsRow(id: Long, response: Long, receiptNumber: Long, billerCode: Long, referenceNumber: String, amount: Double)
  /** GetResult implicit for fetching BpayPaymentReceiptsRow objects using plain SQL queries */
  implicit def GetResultBpayPaymentReceiptsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double]): GR[BpayPaymentReceiptsRow] = GR{
    prs => import prs._
    BpayPaymentReceiptsRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[String], <<[Double]))
  }
  /** Table description of table bpay_payment_receipts. Objects of this class serve as prototypes for rows in queries. */
  class BpayPaymentReceipts(_tableTag: Tag) extends profile.api.Table[BpayPaymentReceiptsRow](_tableTag, Some("moneytech"), "bpay_payment_receipts") {
    def * = (id, response, receiptNumber, billerCode, referenceNumber, amount) <> (BpayPaymentReceiptsRow.tupled, BpayPaymentReceiptsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(response), Rep.Some(receiptNumber), Rep.Some(billerCode), Rep.Some(referenceNumber), Rep.Some(amount))).shaped.<>({r=>import r._; _1.map(_=> BpayPaymentReceiptsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column response SqlType(int8) */
    val response: Rep[Long] = column[Long]("response")
    /** Database column receipt_number SqlType(int8) */
    val receiptNumber: Rep[Long] = column[Long]("receipt_number")
    /** Database column biller_code SqlType(int8) */
    val billerCode: Rep[Long] = column[Long]("biller_code")
    /** Database column reference_number SqlType(text) */
    val referenceNumber: Rep[String] = column[String]("reference_number")
    /** Database column amount SqlType(float8) */
    val amount: Rep[Double] = column[Double]("amount")

    /** Foreign key referencing PaymentExecuteResponses (database name bpay_payment_receipts_response_fkey) */
    lazy val paymentExecuteResponsesFk = foreignKey("bpay_payment_receipts_response_fkey", response, PaymentExecuteResponses)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table BpayPaymentReceipts */
  lazy val BpayPaymentReceipts = new TableQuery(tag => new BpayPaymentReceipts(tag))
}
