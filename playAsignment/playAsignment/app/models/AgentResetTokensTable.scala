package models
// AUTO-GENERATED Slick data model for table AgentResetTokens
trait AgentResetTokensTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgentResetTokens
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(int8)
   *  @param token Database column token SqlType(text)
   *  @param issuedAt Database column issued_at SqlType(timestamptz)
   *  @param used Database column used SqlType(bool), Default(false) */
  case class AgentResetTokensRow(id: Long, userId: Long, token: String, issuedAt: java.sql.Timestamp, used: Boolean = false)
  /** GetResult implicit for fetching AgentResetTokensRow objects using plain SQL queries */
  implicit def GetResultAgentResetTokensRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Boolean]): GR[AgentResetTokensRow] = GR{
    prs => import prs._
    AgentResetTokensRow.tupled((<<[Long], <<[Long], <<[String], <<[java.sql.Timestamp], <<[Boolean]))
  }
  /** Table description of table agent_reset_tokens. Objects of this class serve as prototypes for rows in queries. */
  class AgentResetTokens(_tableTag: Tag) extends profile.api.Table[AgentResetTokensRow](_tableTag, "agent_reset_tokens") {
    def * = (id, userId, token, issuedAt, used) <> (AgentResetTokensRow.tupled, AgentResetTokensRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(userId), Rep.Some(token), Rep.Some(issuedAt), Rep.Some(used))).shaped.<>({r=>import r._; _1.map(_=> AgentResetTokensRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(int8) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column token SqlType(text) */
    val token: Rep[String] = column[String]("token")
    /** Database column issued_at SqlType(timestamptz) */
    val issuedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("issued_at")
    /** Database column used SqlType(bool), Default(false) */
    val used: Rep[Boolean] = column[Boolean]("used", O.Default(false))

    /** Foreign key referencing Users (database name agent_reset_tokens_user_id_fkey) */
    lazy val usersFk = foreignKey("agent_reset_tokens_user_id_fkey", userId, Users)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AgentResetTokens */
  lazy val AgentResetTokens = new TableQuery(tag => new AgentResetTokens(tag))
}
