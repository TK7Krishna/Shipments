package models
// AUTO-GENERATED Slick data model for table CreditAccountHistory
trait CreditAccountHistoryTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreditAccountHistory
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param account Database column account SqlType(int8)
   *  @param creditLimit Database column credit_limit SqlType(int8)
   *  @param onHold Database column on_hold SqlType(bool), Default(false)
   *  @param changedAt Database column changed_at SqlType(timestamptz) */
  case class CreditAccountHistoryRow(id: Long, account: Long, creditLimit: Long, onHold: Boolean = false, changedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CreditAccountHistoryRow objects using plain SQL queries */
  implicit def GetResultCreditAccountHistoryRow(implicit e0: GR[Long], e1: GR[Boolean], e2: GR[java.sql.Timestamp]): GR[CreditAccountHistoryRow] = GR{
    prs => import prs._
    CreditAccountHistoryRow.tupled((<<[Long], <<[Long], <<[Long], <<[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table credit_account_history. Objects of this class serve as prototypes for rows in queries. */
  class CreditAccountHistory(_tableTag: Tag) extends profile.api.Table[CreditAccountHistoryRow](_tableTag, Some("consumer"), "credit_account_history") {
    def * = (id, account, creditLimit, onHold, changedAt) <> (CreditAccountHistoryRow.tupled, CreditAccountHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(account), Rep.Some(creditLimit), Rep.Some(onHold), Rep.Some(changedAt))).shaped.<>({r=>import r._; _1.map(_=> CreditAccountHistoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column account SqlType(int8) */
    val account: Rep[Long] = column[Long]("account")
    /** Database column credit_limit SqlType(int8) */
    val creditLimit: Rep[Long] = column[Long]("credit_limit")
    /** Database column on_hold SqlType(bool), Default(false) */
    val onHold: Rep[Boolean] = column[Boolean]("on_hold", O.Default(false))
    /** Database column changed_at SqlType(timestamptz) */
    val changedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("changed_at")

    /** Foreign key referencing CreditAccounts (database name credit_account_history_account_fkey) */
    lazy val creditAccountsFk = foreignKey("credit_account_history_account_fkey", account, CreditAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (account,changedAt) (database name credit_account_history_account_changed_at_idx) */
    val index1 = index("credit_account_history_account_changed_at_idx", (account, changedAt), unique=true)
  }
  /** Collection-like TableQuery object for table CreditAccountHistory */
  lazy val CreditAccountHistory = new TableQuery(tag => new CreditAccountHistory(tag))
}
