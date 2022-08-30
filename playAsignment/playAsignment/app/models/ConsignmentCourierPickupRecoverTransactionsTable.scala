package models
// AUTO-GENERATED Slick data model for table ConsignmentCourierPickupRecoverTransactions
trait ConsignmentCourierPickupRecoverTransactionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentCourierPickupRecoverTransactions
   *  @param externalConsignmentId Database column external_consignment_id SqlType(int8)
   *  @param transactionHeader Database column transaction_header SqlType(int8) */
  case class ConsignmentCourierPickupRecoverTransactionsRow(externalConsignmentId: Long, transactionHeader: Long)
  /** GetResult implicit for fetching ConsignmentCourierPickupRecoverTransactionsRow objects using plain SQL queries */
  implicit def GetResultConsignmentCourierPickupRecoverTransactionsRow(implicit e0: GR[Long]): GR[ConsignmentCourierPickupRecoverTransactionsRow] = GR{
    prs => import prs._
    ConsignmentCourierPickupRecoverTransactionsRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table consignment_courier_pickup_recover_transactions. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentCourierPickupRecoverTransactions(_tableTag: Tag) extends profile.api.Table[ConsignmentCourierPickupRecoverTransactionsRow](_tableTag, Some("seven_eleven"), "consignment_courier_pickup_recover_transactions") {
    def * = (externalConsignmentId, transactionHeader) <> (ConsignmentCourierPickupRecoverTransactionsRow.tupled, ConsignmentCourierPickupRecoverTransactionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(externalConsignmentId), Rep.Some(transactionHeader))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentCourierPickupRecoverTransactionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column external_consignment_id SqlType(int8) */
    val externalConsignmentId: Rep[Long] = column[Long]("external_consignment_id")
    /** Database column transaction_header SqlType(int8) */
    val transactionHeader: Rep[Long] = column[Long]("transaction_header")

    /** Foreign key referencing Consignments (database name consignment_courier_pickup_recover_external_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_courier_pickup_recover_external_consignment_id_fkey", externalConsignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name consignment_courier_pickup_recover_tran_transaction_header_fkey) */
    lazy val transactionHeadersFk = foreignKey("consignment_courier_pickup_recover_tran_transaction_header_fkey", transactionHeader, TransactionHeaders)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentCourierPickupRecoverTransactions */
  lazy val ConsignmentCourierPickupRecoverTransactions = new TableQuery(tag => new ConsignmentCourierPickupRecoverTransactions(tag))
}
