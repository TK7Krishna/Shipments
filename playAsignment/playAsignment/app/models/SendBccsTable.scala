package models
// AUTO-GENERATED Slick data model for table SendBccs
trait SendBccsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SendBccs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param send Database column send SqlType(int8)
   *  @param bccEmail Database column bcc_email SqlType(text)
   *  @param bccName Database column bcc_name SqlType(text), Default(None) */
  case class SendBccsRow(id: Long, send: Long, bccEmail: String, bccName: Option[String] = None)
  /** GetResult implicit for fetching SendBccsRow objects using plain SQL queries */
  implicit def GetResultSendBccsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[SendBccsRow] = GR{
    prs => import prs._
    SendBccsRow.tupled((<<[Long], <<[Long], <<[String], <<?[String]))
  }
  /** Table description of table send_bccs. Objects of this class serve as prototypes for rows in queries. */
  class SendBccs(_tableTag: Tag) extends profile.api.Table[SendBccsRow](_tableTag, Some("email"), "send_bccs") {
    def * = (id, send, bccEmail, bccName) <> (SendBccsRow.tupled, SendBccsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(send), Rep.Some(bccEmail), bccName)).shaped.<>({r=>import r._; _1.map(_=> SendBccsRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column send SqlType(int8) */
    val send: Rep[Long] = column[Long]("send")
    /** Database column bcc_email SqlType(text) */
    val bccEmail: Rep[String] = column[String]("bcc_email")
    /** Database column bcc_name SqlType(text), Default(None) */
    val bccName: Rep[Option[String]] = column[Option[String]]("bcc_name", O.Default(None))

    /** Foreign key referencing Sends (database name send_bccs_send_fkey) */
    lazy val sendsFk = foreignKey("send_bccs_send_fkey", send, Sends)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SendBccs */
  lazy val SendBccs = new TableQuery(tag => new SendBccs(tag))
}
