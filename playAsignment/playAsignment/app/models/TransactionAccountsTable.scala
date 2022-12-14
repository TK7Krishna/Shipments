package models
// AUTO-GENERATED Slick data model for table TransactionAccounts
trait TransactionAccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionAccounts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text) */
  case class TransactionAccountsRow(id: Long, name: String)
  /** GetResult implicit for fetching TransactionAccountsRow objects using plain SQL queries */
  implicit def GetResultTransactionAccountsRow(implicit e0: GR[Long], e1: GR[String]): GR[TransactionAccountsRow] = GR{
    prs => import prs._
    TransactionAccountsRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table transaction_accounts. Objects of this class serve as prototypes for rows in queries. */
  class TransactionAccounts(_tableTag: Tag) extends profile.api.Table[TransactionAccountsRow](_tableTag, "transaction_accounts") {
    def * = (id, name) <> (TransactionAccountsRow.tupled, TransactionAccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> TransactionAccountsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table TransactionAccounts */
  lazy val TransactionAccounts = new TableQuery(tag => new TransactionAccounts(tag))
}
