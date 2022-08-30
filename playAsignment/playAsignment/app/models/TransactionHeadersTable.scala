package models
// AUTO-GENERATED Slick data model for table TransactionHeaders
trait TransactionHeadersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionHeaders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param description Database column description SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param tax Database column tax SqlType(int4), Default(0) */
  case class TransactionHeadersRow(id: Long, description: String, createdAt: java.sql.Timestamp, tax: Int = 0)
  /** GetResult implicit for fetching TransactionHeadersRow objects using plain SQL queries */
  implicit def GetResultTransactionHeadersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Int]): GR[TransactionHeadersRow] = GR{
    prs => import prs._
    TransactionHeadersRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table transaction_headers. Objects of this class serve as prototypes for rows in queries. */
  class TransactionHeaders(_tableTag: Tag) extends profile.api.Table[TransactionHeadersRow](_tableTag, "transaction_headers") {
    def * = (id, description, createdAt, tax) <> (TransactionHeadersRow.tupled, TransactionHeadersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(description), Rep.Some(createdAt), Rep.Some(tax))).shaped.<>({r=>import r._; _1.map(_=> TransactionHeadersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column tax SqlType(int4), Default(0) */
    val tax: Rep[Int] = column[Int]("tax", O.Default(0))

    /** Index over (createdAt) (database name transaction_headers_created_at_idx) */
    val index1 = index("transaction_headers_created_at_idx", createdAt)
  }
  /** Collection-like TableQuery object for table TransactionHeaders */
  lazy val TransactionHeaders = new TableQuery(tag => new TransactionHeaders(tag))
}
