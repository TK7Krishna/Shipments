package models
// AUTO-GENERATED Slick data model for table SendAttempts
trait SendAttemptsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SendAttempts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param send Database column send SqlType(int8)
   *  @param createdAt Database column created_at SqlType(int8)
   *  @param provider Database column provider SqlType(text) */
  case class SendAttemptsRow(id: Long, send: Long, createdAt: Long, provider: String)
  /** GetResult implicit for fetching SendAttemptsRow objects using plain SQL queries */
  implicit def GetResultSendAttemptsRow(implicit e0: GR[Long], e1: GR[String]): GR[SendAttemptsRow] = GR{
    prs => import prs._
    SendAttemptsRow.tupled((<<[Long], <<[Long], <<[Long], <<[String]))
  }
  /** Table description of table send_attempts. Objects of this class serve as prototypes for rows in queries. */
  class SendAttempts(_tableTag: Tag) extends profile.api.Table[SendAttemptsRow](_tableTag, Some("email"), "send_attempts") {
    def * = (id, send, createdAt, provider) <> (SendAttemptsRow.tupled, SendAttemptsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(send), Rep.Some(createdAt), Rep.Some(provider))).shaped.<>({r=>import r._; _1.map(_=> SendAttemptsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column send SqlType(int8) */
    val send: Rep[Long] = column[Long]("send")
    /** Database column created_at SqlType(int8) */
    val createdAt: Rep[Long] = column[Long]("created_at")
    /** Database column provider SqlType(text) */
    val provider: Rep[String] = column[String]("provider")

    /** Foreign key referencing Providers (database name send_attempts_provider_fkey) */
    lazy val providersFk = foreignKey("send_attempts_provider_fkey", provider, Providers)(r => r.canonicalName, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Sends (database name send_attempts_send_fkey) */
    lazy val sendsFk = foreignKey("send_attempts_send_fkey", send, Sends)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SendAttempts */
  lazy val SendAttempts = new TableQuery(tag => new SendAttempts(tag))
}
