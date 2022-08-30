package models
// AUTO-GENERATED Slick data model for table CreditAccountRequests
trait CreditAccountRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreditAccountRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(int8)
   *  @param taxNumber Database column tax_number SqlType(text), Default(None) */
  case class CreditAccountRequestsRow(id: Long, userId: Long, taxNumber: Option[String] = None)
  /** GetResult implicit for fetching CreditAccountRequestsRow objects using plain SQL queries */
  implicit def GetResultCreditAccountRequestsRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[CreditAccountRequestsRow] = GR{
    prs => import prs._
    CreditAccountRequestsRow.tupled((<<[Long], <<[Long], <<?[String]))
  }
  /** Table description of table credit_account_requests. Objects of this class serve as prototypes for rows in queries. */
  class CreditAccountRequests(_tableTag: Tag) extends profile.api.Table[CreditAccountRequestsRow](_tableTag, Some("consumer"), "credit_account_requests") {
    def * = (id, userId, taxNumber) <> (CreditAccountRequestsRow.tupled, CreditAccountRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(userId), taxNumber)).shaped.<>({r=>import r._; _1.map(_=> CreditAccountRequestsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(int8) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column tax_number SqlType(text), Default(None) */
    val taxNumber: Rep[Option[String]] = column[Option[String]]("tax_number", O.Default(None))

    /** Foreign key referencing Users (database name credit_account_requests_user_id_fkey) */
    lazy val usersFk = foreignKey("credit_account_requests_user_id_fkey", userId, Users)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (userId) (database name credit_account_requests_user_id_key) */
    val index1 = index("credit_account_requests_user_id_key", userId, unique=true)
  }
  /** Collection-like TableQuery object for table CreditAccountRequests */
  lazy val CreditAccountRequests = new TableQuery(tag => new CreditAccountRequests(tag))
}
