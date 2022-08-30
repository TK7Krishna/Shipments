package models
// AUTO-GENERATED Slick data model for table TransactionExports
trait TransactionExportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionExports
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param name Database column name SqlType(text), Default(None) */
  case class TransactionExportsRow(id: Long, createdAt: java.sql.Timestamp, name: Option[String] = None)
  /** GetResult implicit for fetching TransactionExportsRow objects using plain SQL queries */
  implicit def GetResultTransactionExportsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]]): GR[TransactionExportsRow] = GR{
    prs => import prs._
    TransactionExportsRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table transaction_exports. Objects of this class serve as prototypes for rows in queries. */
  class TransactionExports(_tableTag: Tag) extends profile.api.Table[TransactionExportsRow](_tableTag, "transaction_exports") {
    def * = (id, createdAt, name) <> (TransactionExportsRow.tupled, TransactionExportsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(createdAt), name)).shaped.<>({r=>import r._; _1.map(_=> TransactionExportsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
  }
  /** Collection-like TableQuery object for table TransactionExports */
  lazy val TransactionExports = new TableQuery(tag => new TransactionExports(tag))
}
