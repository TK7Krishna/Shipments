package models
// AUTO-GENERATED Slick data model for table CreditInvoices
trait CreditInvoicesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreditInvoices
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param creditAccount Database column credit_account SqlType(int8)
   *  @param amount Database column amount SqlType(int8)
   *  @param issuedAt Database column issued_at SqlType(timestamptz)
   *  @param paidAt Database column paid_at SqlType(timestamptz), Default(None) */
  case class CreditInvoicesRow(id: Long, creditAccount: Long, amount: Long, issuedAt: java.sql.Timestamp, paidAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching CreditInvoicesRow objects using plain SQL queries */
  implicit def GetResultCreditInvoicesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]]): GR[CreditInvoicesRow] = GR{
    prs => import prs._
    CreditInvoicesRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table credit_invoices. Objects of this class serve as prototypes for rows in queries. */
  class CreditInvoices(_tableTag: Tag) extends profile.api.Table[CreditInvoicesRow](_tableTag, Some("consumer"), "credit_invoices") {
    def * = (id, creditAccount, amount, issuedAt, paidAt) <> (CreditInvoicesRow.tupled, CreditInvoicesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(creditAccount), Rep.Some(amount), Rep.Some(issuedAt), paidAt)).shaped.<>({r=>import r._; _1.map(_=> CreditInvoicesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column credit_account SqlType(int8) */
    val creditAccount: Rep[Long] = column[Long]("credit_account")
    /** Database column amount SqlType(int8) */
    val amount: Rep[Long] = column[Long]("amount")
    /** Database column issued_at SqlType(timestamptz) */
    val issuedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("issued_at")
    /** Database column paid_at SqlType(timestamptz), Default(None) */
    val paidAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("paid_at", O.Default(None))

    /** Foreign key referencing CreditAccounts (database name credit_invoices_credit_account_fkey) */
    lazy val creditAccountsFk = foreignKey("credit_invoices_credit_account_fkey", creditAccount, CreditAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CreditInvoices */
  lazy val CreditInvoices = new TableQuery(tag => new CreditInvoices(tag))
}
