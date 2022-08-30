package models
// AUTO-GENERATED Slick data model for table SendTos
trait SendTosTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SendTos
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param send Database column send SqlType(int8)
   *  @param toEmail Database column to_email SqlType(text)
   *  @param toName Database column to_name SqlType(text), Default(None) */
  case class SendTosRow(id: Long, send: Long, toEmail: String, toName: Option[String] = None)
  /** GetResult implicit for fetching SendTosRow objects using plain SQL queries */
  implicit def GetResultSendTosRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[SendTosRow] = GR{
    prs => import prs._
    SendTosRow.tupled((<<[Long], <<[Long], <<[String], <<?[String]))
  }
  /** Table description of table send_tos. Objects of this class serve as prototypes for rows in queries. */
  class SendTos(_tableTag: Tag) extends profile.api.Table[SendTosRow](_tableTag, Some("email"), "send_tos") {
    def * = (id, send, toEmail, toName) <> (SendTosRow.tupled, SendTosRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(send), Rep.Some(toEmail), toName)).shaped.<>({r=>import r._; _1.map(_=> SendTosRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column send SqlType(int8) */
    val send: Rep[Long] = column[Long]("send")
    /** Database column to_email SqlType(text) */
    val toEmail: Rep[String] = column[String]("to_email")
    /** Database column to_name SqlType(text), Default(None) */
    val toName: Rep[Option[String]] = column[Option[String]]("to_name", O.Default(None))

    /** Foreign key referencing Sends (database name send_tos_send_fkey) */
    lazy val sendsFk = foreignKey("send_tos_send_fkey", send, Sends)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SendTos */
  lazy val SendTos = new TableQuery(tag => new SendTos(tag))
}
