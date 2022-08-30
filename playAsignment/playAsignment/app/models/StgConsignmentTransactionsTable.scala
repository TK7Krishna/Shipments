package models
// AUTO-GENERATED Slick data model for table StgConsignmentTransactions
trait StgConsignmentTransactionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgConsignmentTransactions
   *  @param stgConsignmentId Database column stg_consignment_id SqlType(int8)
   *  @param transactionHeader Database column transaction_header SqlType(int8) */
  case class StgConsignmentTransactionsRow(stgConsignmentId: Long, transactionHeader: Long)
  /** GetResult implicit for fetching StgConsignmentTransactionsRow objects using plain SQL queries */
  implicit def GetResultStgConsignmentTransactionsRow(implicit e0: GR[Long]): GR[StgConsignmentTransactionsRow] = GR{
    prs => import prs._
    StgConsignmentTransactionsRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table stg_consignment_transactions. Objects of this class serve as prototypes for rows in queries. */
  class StgConsignmentTransactions(_tableTag: Tag) extends profile.api.Table[StgConsignmentTransactionsRow](_tableTag, Some("seven_eleven"), "stg_consignment_transactions") {
    def * = (stgConsignmentId, transactionHeader) <> (StgConsignmentTransactionsRow.tupled, StgConsignmentTransactionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(stgConsignmentId), Rep.Some(transactionHeader))).shaped.<>({r=>import r._; _1.map(_=> StgConsignmentTransactionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column stg_consignment_id SqlType(int8) */
    val stgConsignmentId: Rep[Long] = column[Long]("stg_consignment_id")
    /** Database column transaction_header SqlType(int8) */
    val transactionHeader: Rep[Long] = column[Long]("transaction_header")

    /** Foreign key referencing StgConsignments (database name stg_consignment_transactions_stg_consignment_id_fkey) */
    lazy val stgConsignmentsFk = foreignKey("stg_consignment_transactions_stg_consignment_id_fkey", stgConsignmentId, StgConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name stg_consignment_transactions_transaction_header_fkey) */
    lazy val transactionHeadersFk = foreignKey("stg_consignment_transactions_transaction_header_fkey", transactionHeader, TransactionHeaders)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table StgConsignmentTransactions */
  lazy val StgConsignmentTransactions = new TableQuery(tag => new StgConsignmentTransactions(tag))
}
