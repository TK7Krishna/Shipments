package models
// AUTO-GENERATED Slick data model for table InboundTollMessages
trait InboundTollMessagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundTollMessages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param body Database column body SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InboundTollMessagesRow(id: Long, body: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InboundTollMessagesRow objects using plain SQL queries */
  implicit def GetResultInboundTollMessagesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[InboundTollMessagesRow] = GR{
    prs => import prs._
    InboundTollMessagesRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table inbound_toll_messages. Objects of this class serve as prototypes for rows in queries. */
  class InboundTollMessages(_tableTag: Tag) extends profile.api.Table[InboundTollMessagesRow](_tableTag, "inbound_toll_messages") {
    def * = (id, body, createdAt) <> (InboundTollMessagesRow.tupled, InboundTollMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(body), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InboundTollMessagesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column body SqlType(text) */
    val body: Rep[String] = column[String]("body")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table InboundTollMessages */
  lazy val InboundTollMessages = new TableQuery(tag => new InboundTollMessages(tag))
}
