package models
// AUTO-GENERATED Slick data model for table HubbedBpayReceiptEmails
trait HubbedBpayReceiptEmailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HubbedBpayReceiptEmails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payment Database column payment SqlType(int8)
   *  @param email Database column email SqlType(int8) */
  case class HubbedBpayReceiptEmailsRow(id: Long, payment: Long, email: Long)
  /** GetResult implicit for fetching HubbedBpayReceiptEmailsRow objects using plain SQL queries */
  implicit def GetResultHubbedBpayReceiptEmailsRow(implicit e0: GR[Long]): GR[HubbedBpayReceiptEmailsRow] = GR{
    prs => import prs._
    HubbedBpayReceiptEmailsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table hubbed_bpay_receipt_emails. Objects of this class serve as prototypes for rows in queries. */
  class HubbedBpayReceiptEmails(_tableTag: Tag) extends profile.api.Table[HubbedBpayReceiptEmailsRow](_tableTag, "hubbed_bpay_receipt_emails") {
    def * = (id, payment, email) <> (HubbedBpayReceiptEmailsRow.tupled, HubbedBpayReceiptEmailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payment), Rep.Some(email))).shaped.<>({r=>import r._; _1.map(_=> HubbedBpayReceiptEmailsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column email SqlType(int8) */
    val email: Rep[Long] = column[Long]("email")

    /** Foreign key referencing HubbedBpayPayments (database name hubbed_bpay_receipt_emails_payment_fkey) */
    lazy val hubbedBpayPaymentsFk = foreignKey("hubbed_bpay_receipt_emails_payment_fkey", payment, HubbedBpayPayments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Sends (database name hubbed_bpay_receipt_emails_email_fkey) */
    lazy val sendsFk = foreignKey("hubbed_bpay_receipt_emails_email_fkey", email, Sends)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table HubbedBpayReceiptEmails */
  lazy val HubbedBpayReceiptEmails = new TableQuery(tag => new HubbedBpayReceiptEmails(tag))
}
