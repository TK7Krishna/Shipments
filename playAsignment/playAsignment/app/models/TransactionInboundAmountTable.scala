package models
// AUTO-GENERATED Slick data model for table TransactionInboundAmount
trait TransactionInboundAmountTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionInboundAmount
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text)
   *  @param startRange Database column start_range SqlType(int4)
   *  @param endRange Database column end_range SqlType(int4)
   *  @param credit Database column credit SqlType(int4)
   *  @param debit Database column debit SqlType(int4), Default(110)
   *  @param status Database column status SqlType(bool), Default(true)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param customerName Database column customer_name SqlType(text), Default(None) */
  case class TransactionInboundAmountRow(id: Long, courierCode: String, startRange: Int, endRange: Int, credit: Int, debit: Int = 110, status: Boolean = true, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, customerName: Option[String] = None)
  /** GetResult implicit for fetching TransactionInboundAmountRow objects using plain SQL queries */
  implicit def GetResultTransactionInboundAmountRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Boolean], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[String]]): GR[TransactionInboundAmountRow] = GR{
    prs => import prs._
    TransactionInboundAmountRow.tupled((<<[Long], <<[String], <<[Int], <<[Int], <<[Int], <<[Int], <<[Boolean], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table transaction_inbound_amount. Objects of this class serve as prototypes for rows in queries. */
  class TransactionInboundAmount(_tableTag: Tag) extends profile.api.Table[TransactionInboundAmountRow](_tableTag, "transaction_inbound_amount") {
    def * = (id, courierCode, startRange, endRange, credit, debit, status, createdAt, modifiedAt, customerName) <> (TransactionInboundAmountRow.tupled, TransactionInboundAmountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courierCode), Rep.Some(startRange), Rep.Some(endRange), Rep.Some(credit), Rep.Some(debit), Rep.Some(status), Rep.Some(createdAt), modifiedAt, customerName)).shaped.<>({r=>import r._; _1.map(_=> TransactionInboundAmountRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")
    /** Database column start_range SqlType(int4) */
    val startRange: Rep[Int] = column[Int]("start_range")
    /** Database column end_range SqlType(int4) */
    val endRange: Rep[Int] = column[Int]("end_range")
    /** Database column credit SqlType(int4) */
    val credit: Rep[Int] = column[Int]("credit")
    /** Database column debit SqlType(int4), Default(110) */
    val debit: Rep[Int] = column[Int]("debit", O.Default(110))
    /** Database column status SqlType(bool), Default(true) */
    val status: Rep[Boolean] = column[Boolean]("status", O.Default(true))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column customer_name SqlType(text), Default(None) */
    val customerName: Rep[Option[String]] = column[Option[String]]("customer_name", O.Default(None))

    /** Foreign key referencing Couriers (database name inbound_courier_fkey) */
    lazy val couriersFk = foreignKey("inbound_courier_fkey", courierCode, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TransactionInboundAmount */
  lazy val TransactionInboundAmount = new TableQuery(tag => new TransactionInboundAmount(tag))
}
