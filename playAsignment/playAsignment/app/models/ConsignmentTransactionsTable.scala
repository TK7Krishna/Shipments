package models
// AUTO-GENERATED Slick data model for table ConsignmentTransactions
trait ConsignmentTransactionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentTransactions
   *  @param trans Database column trans SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8) */
  case class ConsignmentTransactionsRow(trans: Long, consignment: Long)
  /** GetResult implicit for fetching ConsignmentTransactionsRow objects using plain SQL queries */
  implicit def GetResultConsignmentTransactionsRow(implicit e0: GR[Long]): GR[ConsignmentTransactionsRow] = GR{
    prs => import prs._
    ConsignmentTransactionsRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table consignment_transactions. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentTransactions(_tableTag: Tag) extends profile.api.Table[ConsignmentTransactionsRow](_tableTag, "consignment_transactions") {
    def * = (trans, consignment) <> (ConsignmentTransactionsRow.tupled, ConsignmentTransactionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(trans), Rep.Some(consignment))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentTransactionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column trans SqlType(int8) */
    val trans: Rep[Long] = column[Long]("trans")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")

    /** Primary key of ConsignmentTransactions (database name consignment_transactions_pkey) */
    val pk = primaryKey("consignment_transactions_pkey", (trans, consignment))

    /** Foreign key referencing Consignments (database name consignment_transactions_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_transactions_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name consignment_transactions_trans_fkey) */
    lazy val transactionHeadersFk = foreignKey("consignment_transactions_trans_fkey", trans, TransactionHeaders)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentTransactions */
  lazy val ConsignmentTransactions = new TableQuery(tag => new ConsignmentTransactions(tag))
}
