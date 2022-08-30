package models
// AUTO-GENERATED Slick data model for table CourierTransactionAccounts
trait CourierTransactionAccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierTransactionAccounts
   *  @param courier Database column courier SqlType(text), PrimaryKey
   *  @param inboundAccount Database column inbound_account SqlType(int8)
   *  @param outboundAccount Database column outbound_account SqlType(int8) */
  case class CourierTransactionAccountsRow(courier: String, inboundAccount: Long, outboundAccount: Long)
  /** GetResult implicit for fetching CourierTransactionAccountsRow objects using plain SQL queries */
  implicit def GetResultCourierTransactionAccountsRow(implicit e0: GR[String], e1: GR[Long]): GR[CourierTransactionAccountsRow] = GR{
    prs => import prs._
    CourierTransactionAccountsRow.tupled((<<[String], <<[Long], <<[Long]))
  }
  /** Table description of table courier_transaction_accounts. Objects of this class serve as prototypes for rows in queries. */
  class CourierTransactionAccounts(_tableTag: Tag) extends profile.api.Table[CourierTransactionAccountsRow](_tableTag, "courier_transaction_accounts") {
    def * = (courier, inboundAccount, outboundAccount) <> (CourierTransactionAccountsRow.tupled, CourierTransactionAccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(courier), Rep.Some(inboundAccount), Rep.Some(outboundAccount))).shaped.<>({r=>import r._; _1.map(_=> CourierTransactionAccountsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column courier SqlType(text), PrimaryKey */
    val courier: Rep[String] = column[String]("courier", O.PrimaryKey)
    /** Database column inbound_account SqlType(int8) */
    val inboundAccount: Rep[Long] = column[Long]("inbound_account")
    /** Database column outbound_account SqlType(int8) */
    val outboundAccount: Rep[Long] = column[Long]("outbound_account")

    /** Foreign key referencing Couriers (database name courier_transaction_accounts_courier_fkey) */
    lazy val couriersFk = foreignKey("courier_transaction_accounts_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionAccounts (database name courier_transaction_accounts_inbound_account_fkey) */
    lazy val transactionAccountsFk2 = foreignKey("courier_transaction_accounts_inbound_account_fkey", inboundAccount, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionAccounts (database name courier_transaction_accounts_outbound_account_fkey) */
    lazy val transactionAccountsFk3 = foreignKey("courier_transaction_accounts_outbound_account_fkey", outboundAccount, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierTransactionAccounts */
  lazy val CourierTransactionAccounts = new TableQuery(tag => new CourierTransactionAccounts(tag))
}
