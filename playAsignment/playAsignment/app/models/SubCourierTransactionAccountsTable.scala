package models
// AUTO-GENERATED Slick data model for table SubCourierTransactionAccounts
trait SubCourierTransactionAccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SubCourierTransactionAccounts
   *  @param subCourier Database column sub_courier SqlType(int8), PrimaryKey
   *  @param inboundAccount Database column inbound_account SqlType(int8)
   *  @param outboundAccount Database column outbound_account SqlType(int8) */
  case class SubCourierTransactionAccountsRow(subCourier: Long, inboundAccount: Long, outboundAccount: Long)
  /** GetResult implicit for fetching SubCourierTransactionAccountsRow objects using plain SQL queries */
  implicit def GetResultSubCourierTransactionAccountsRow(implicit e0: GR[Long]): GR[SubCourierTransactionAccountsRow] = GR{
    prs => import prs._
    SubCourierTransactionAccountsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table sub_courier_transaction_accounts. Objects of this class serve as prototypes for rows in queries. */
  class SubCourierTransactionAccounts(_tableTag: Tag) extends profile.api.Table[SubCourierTransactionAccountsRow](_tableTag, "sub_courier_transaction_accounts") {
    def * = (subCourier, inboundAccount, outboundAccount) <> (SubCourierTransactionAccountsRow.tupled, SubCourierTransactionAccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(subCourier), Rep.Some(inboundAccount), Rep.Some(outboundAccount))).shaped.<>({r=>import r._; _1.map(_=> SubCourierTransactionAccountsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column sub_courier SqlType(int8), PrimaryKey */
    val subCourier: Rep[Long] = column[Long]("sub_courier", O.PrimaryKey)
    /** Database column inbound_account SqlType(int8) */
    val inboundAccount: Rep[Long] = column[Long]("inbound_account")
    /** Database column outbound_account SqlType(int8) */
    val outboundAccount: Rep[Long] = column[Long]("outbound_account")

    /** Foreign key referencing SubCouriers (database name sub_courier_transaction_accounts_sub_courier_fkey) */
    lazy val subCouriersFk = foreignKey("sub_courier_transaction_accounts_sub_courier_fkey", subCourier, SubCouriers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionAccounts (database name sub_courier_transaction_accounts_inbound_account_fkey) */
    lazy val transactionAccountsFk2 = foreignKey("sub_courier_transaction_accounts_inbound_account_fkey", inboundAccount, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionAccounts (database name sub_courier_transaction_accounts_outbound_account_fkey) */
    lazy val transactionAccountsFk3 = foreignKey("sub_courier_transaction_accounts_outbound_account_fkey", outboundAccount, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SubCourierTransactionAccounts */
  lazy val SubCourierTransactionAccounts = new TableQuery(tag => new SubCourierTransactionAccounts(tag))
}
