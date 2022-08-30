package models
// AUTO-GENERATED Slick data model for table ConsignmentPickups
trait ConsignmentPickupsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentPickups
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param documentNo Database column document_no SqlType(text), Default(None)
   *  @param mobile Database column mobile SqlType(text), Default(None)
   *  @param activeVoucherCode Database column active_voucher_code SqlType(text), Default(None)
   *  @param voucherCode Database column voucher_code SqlType(text), Default(None)
   *  @param transactionId Database column transaction_id SqlType(int8), Default(None) */
  case class ConsignmentPickupsRow(id: Long, consignment: Long, documentNo: Option[String] = None, mobile: Option[String] = None, activeVoucherCode: Option[String] = None, voucherCode: Option[String] = None, transactionId: Option[Long] = None)
  /** GetResult implicit for fetching ConsignmentPickupsRow objects using plain SQL queries */
  implicit def GetResultConsignmentPickupsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]]): GR[ConsignmentPickupsRow] = GR{
    prs => import prs._
    ConsignmentPickupsRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long]))
  }
  /** Table description of table consignment_pickups. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentPickups(_tableTag: Tag) extends profile.api.Table[ConsignmentPickupsRow](_tableTag, Some("seven_eleven"), "consignment_pickups") {
    def * = (id, consignment, documentNo, mobile, activeVoucherCode, voucherCode, transactionId) <> (ConsignmentPickupsRow.tupled, ConsignmentPickupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), documentNo, mobile, activeVoucherCode, voucherCode, transactionId)).shaped.<>({r=>import r._; _1.map(_=> ConsignmentPickupsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column document_no SqlType(text), Default(None) */
    val documentNo: Rep[Option[String]] = column[Option[String]]("document_no", O.Default(None))
    /** Database column mobile SqlType(text), Default(None) */
    val mobile: Rep[Option[String]] = column[Option[String]]("mobile", O.Default(None))
    /** Database column active_voucher_code SqlType(text), Default(None) */
    val activeVoucherCode: Rep[Option[String]] = column[Option[String]]("active_voucher_code", O.Default(None))
    /** Database column voucher_code SqlType(text), Default(None) */
    val voucherCode: Rep[Option[String]] = column[Option[String]]("voucher_code", O.Default(None))
    /** Database column transaction_id SqlType(int8), Default(None) */
    val transactionId: Rep[Option[Long]] = column[Option[Long]]("transaction_id", O.Default(None))

    /** Foreign key referencing Consignments (database name consignment_pickups_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_pickups_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name consignment_pickups_transaction_id_fkey) */
    lazy val transactionHeadersFk = foreignKey("consignment_pickups_transaction_id_fkey", transactionId, TransactionHeaders)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (activeVoucherCode) (database name consignment_pickups_active_voucher_code_key) */
    val index1 = index("consignment_pickups_active_voucher_code_key", activeVoucherCode, unique=true)
  }
  /** Collection-like TableQuery object for table ConsignmentPickups */
  lazy val ConsignmentPickups = new TableQuery(tag => new ConsignmentPickups(tag))
}
