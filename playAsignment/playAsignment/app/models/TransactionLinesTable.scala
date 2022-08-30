package models
// AUTO-GENERATED Slick data model for table TransactionLines
trait TransactionLinesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionLines
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param header Database column header SqlType(int8)
   *  @param amount Database column amount SqlType(int4)
   *  @param account Database column account SqlType(int8)
   *  @param `type` Database column type SqlType(text)
   *  @param export Database column export SqlType(int8), Default(None) */
  case class TransactionLinesRow(id: Long, header: Long, amount: Int, account: Long, `type`: String, export: Option[Long] = None)
  /** GetResult implicit for fetching TransactionLinesRow objects using plain SQL queries */
  implicit def GetResultTransactionLinesRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[String], e3: GR[Option[Long]]): GR[TransactionLinesRow] = GR{
    prs => import prs._
    TransactionLinesRow.tupled((<<[Long], <<[Long], <<[Int], <<[Long], <<[String], <<?[Long]))
  }
  /** Table description of table transaction_lines. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class TransactionLines(_tableTag: Tag) extends profile.api.Table[TransactionLinesRow](_tableTag, "transaction_lines") {
    def * = (id, header, amount, account, `type`, export) <> (TransactionLinesRow.tupled, TransactionLinesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(header), Rep.Some(amount), Rep.Some(account), Rep.Some(`type`), export)).shaped.<>({r=>import r._; _1.map(_=> TransactionLinesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column header SqlType(int8) */
    val header: Rep[Long] = column[Long]("header")
    /** Database column amount SqlType(int4) */
    val amount: Rep[Int] = column[Int]("amount")
    /** Database column account SqlType(int8) */
    val account: Rep[Long] = column[Long]("account")
    /** Database column type SqlType(text)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type")
    /** Database column export SqlType(int8), Default(None) */
    val export: Rep[Option[Long]] = column[Option[Long]]("export", O.Default(None))

    /** Foreign key referencing TransactionAccounts (database name transaction_lines_account_fkey) */
    lazy val transactionAccountsFk = foreignKey("transaction_lines_account_fkey", account, TransactionAccounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionExports (database name transaction_lines_export_fkey) */
    lazy val transactionExportsFk = foreignKey("transaction_lines_export_fkey", export, TransactionExports)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name transaction_lines_header_fkey) */
    lazy val transactionHeadersFk = foreignKey("transaction_lines_header_fkey", header, TransactionHeaders)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TransactionLines */
  lazy val TransactionLines = new TableQuery(tag => new TransactionLines(tag))
}
