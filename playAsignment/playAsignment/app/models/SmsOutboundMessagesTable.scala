package models
// AUTO-GENERATED Slick data model for table SmsOutboundMessages
trait SmsOutboundMessagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SmsOutboundMessages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param fromNumber Database column from_number SqlType(text)
   *  @param toNumber Database column to_number SqlType(text)
   *  @param body Database column body SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class SmsOutboundMessagesRow(id: Long, fromNumber: String, toNumber: String, body: String, createdAt: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching SmsOutboundMessagesRow objects using plain SQL queries */
  implicit def GetResultSmsOutboundMessagesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]]): GR[SmsOutboundMessagesRow] = GR{
    prs => import prs._
    SmsOutboundMessagesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table sms_outbound_messages. Objects of this class serve as prototypes for rows in queries. */
  class SmsOutboundMessages(_tableTag: Tag) extends profile.api.Table[SmsOutboundMessagesRow](_tableTag, "sms_outbound_messages") {
    def * = (id, fromNumber, toNumber, body, createdAt) <> (SmsOutboundMessagesRow.tupled, SmsOutboundMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(fromNumber), Rep.Some(toNumber), Rep.Some(body), createdAt)).shaped.<>({r=>import r._; _1.map(_=> SmsOutboundMessagesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column from_number SqlType(text) */
    val fromNumber: Rep[String] = column[String]("from_number")
    /** Database column to_number SqlType(text) */
    val toNumber: Rep[String] = column[String]("to_number")
    /** Database column body SqlType(text) */
    val body: Rep[String] = column[String]("body")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
  }
  /** Collection-like TableQuery object for table SmsOutboundMessages */
  lazy val SmsOutboundMessages = new TableQuery(tag => new SmsOutboundMessages(tag))
}
