package models
// AUTO-GENERATED Slick data model for table SendCcs
trait SendCcsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SendCcs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param send Database column send SqlType(int8)
   *  @param ccEmail Database column cc_email SqlType(text)
   *  @param ccName Database column cc_name SqlType(text), Default(None) */
  case class SendCcsRow(id: Long, send: Long, ccEmail: String, ccName: Option[String] = None)
  /** GetResult implicit for fetching SendCcsRow objects using plain SQL queries */
  implicit def GetResultSendCcsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[SendCcsRow] = GR{
    prs => import prs._
    SendCcsRow.tupled((<<[Long], <<[Long], <<[String], <<?[String]))
  }
  /** Table description of table send_ccs. Objects of this class serve as prototypes for rows in queries. */
  class SendCcs(_tableTag: Tag) extends profile.api.Table[SendCcsRow](_tableTag, Some("email"), "send_ccs") {
    def * = (id, send, ccEmail, ccName) <> (SendCcsRow.tupled, SendCcsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(send), Rep.Some(ccEmail), ccName)).shaped.<>({r=>import r._; _1.map(_=> SendCcsRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column send SqlType(int8) */
    val send: Rep[Long] = column[Long]("send")
    /** Database column cc_email SqlType(text) */
    val ccEmail: Rep[String] = column[String]("cc_email")
    /** Database column cc_name SqlType(text), Default(None) */
    val ccName: Rep[Option[String]] = column[Option[String]]("cc_name", O.Default(None))

    /** Foreign key referencing Sends (database name send_ccs_send_fkey) */
    lazy val sendsFk = foreignKey("send_ccs_send_fkey", send, Sends)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SendCcs */
  lazy val SendCcs = new TableQuery(tag => new SendCcs(tag))
}
