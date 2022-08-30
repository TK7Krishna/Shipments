package models
// AUTO-GENERATED Slick data model for table NamedTransactionAccounts
trait NamedTransactionAccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table NamedTransactionAccounts
   *  @param name Database column name SqlType(text), PrimaryKey
   *  @param inboundAccount Database column inbound_account SqlType(int8)
   *  @param outboundAccount Database column outbound_account SqlType(int8) */
  case class NamedTransactionAccountsRow(name: String, inboundAccount: Long, outboundAccount: Long)
  /** GetResult implicit for fetching NamedTransactionAccountsRow objects using plain SQL queries */
  implicit def GetResultNamedTransactionAccountsRow(implicit e0: GR[String], e1: GR[Long]): GR[NamedTransactionAccountsRow] = GR{
    prs => import prs._
    NamedTransactionAccountsRow.tupled((<<[String], <<[Long], <<[Long]))
  }
  /** Table description of table named_transaction_accounts. Objects of this class serve as prototypes for rows in queries. */
  class NamedTransactionAccounts(_tableTag: Tag) extends profile.api.Table[NamedTransactionAccountsRow](_tableTag, "named_transaction_accounts") {
    def * = (name, inboundAccount, outboundAccount) <> (NamedTransactionAccountsRow.tupled, NamedTransactionAccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(name), Rep.Some(inboundAccount), Rep.Some(outboundAccount))).shaped.<>({r=>import r._; _1.map(_=> NamedTransactionAccountsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(text), PrimaryKey */
    val name: Rep[String] = column[String]("name", O.PrimaryKey)
    /** Database column inbound_account SqlType(int8) */
    val inboundAccount: Rep[Long] = column[Long]("inbound_account")
    /** Database column outbound_account SqlType(int8) */
    val outboundAccount: Rep[Long] = column[Long]("outbound_account")

    /** Foreign key referencing TransactionAccounts (database name named_transaction_accounts_inbound_account_fkey) */
    lazy val transactionAccountsFk1 = foreignKey("named_transaction_accounts_inbound_account_fkey", inboundAccount, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionAccounts (database name named_transaction_accounts_outbound_account_fkey) */
    lazy val transactionAccountsFk2 = foreignKey("named_transaction_accounts_outbound_account_fkey", outboundAccount, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table NamedTransactionAccounts */
  lazy val NamedTransactionAccounts = new TableQuery(tag => new NamedTransactionAccounts(tag))
}
