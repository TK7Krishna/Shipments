package models
// AUTO-GENERATED Slick data model for table CreditedPayments
trait CreditedPaymentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreditedPayments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payment Database column payment SqlType(int8)
   *  @param creditAccount Database column credit_account SqlType(int8)
   *  @param xeroInvoice Database column xero_invoice SqlType(int8), Default(None)
   *  @param processedAt Database column processed_at SqlType(timestamptz) */
  case class CreditedPaymentsRow(id: Long, payment: Long, creditAccount: Long, xeroInvoice: Option[Long] = None, processedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CreditedPaymentsRow objects using plain SQL queries */
  implicit def GetResultCreditedPaymentsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[java.sql.Timestamp]): GR[CreditedPaymentsRow] = GR{
    prs => import prs._
    CreditedPaymentsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table credited_payments. Objects of this class serve as prototypes for rows in queries. */
  class CreditedPayments(_tableTag: Tag) extends profile.api.Table[CreditedPaymentsRow](_tableTag, Some("consumer"), "credited_payments") {
    def * = (id, payment, creditAccount, xeroInvoice, processedAt) <> (CreditedPaymentsRow.tupled, CreditedPaymentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payment), Rep.Some(creditAccount), xeroInvoice, Rep.Some(processedAt))).shaped.<>({r=>import r._; _1.map(_=> CreditedPaymentsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column credit_account SqlType(int8) */
    val creditAccount: Rep[Long] = column[Long]("credit_account")
    /** Database column xero_invoice SqlType(int8), Default(None) */
    val xeroInvoice: Rep[Option[Long]] = column[Option[Long]]("xero_invoice", O.Default(None))
    /** Database column processed_at SqlType(timestamptz) */
    val processedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("processed_at")

    /** Foreign key referencing CreditAccounts (database name credited_payments_credit_account_fkey) */
    lazy val creditAccountsFk = foreignKey("credited_payments_credit_account_fkey", creditAccount, CreditAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Invoices (database name credited_payments_xero_invoice_fkey) */
    lazy val invoicesFk = foreignKey("credited_payments_xero_invoice_fkey", xeroInvoice, Invoices)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Payments (database name credited_payments_payment_fkey) */
    lazy val paymentsFk = foreignKey("credited_payments_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CreditedPayments */
  lazy val CreditedPayments = new TableQuery(tag => new CreditedPayments(tag))
}
