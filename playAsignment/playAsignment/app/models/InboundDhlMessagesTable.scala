package models
// AUTO-GENERATED Slick data model for table InboundDhlMessages
trait InboundDhlMessagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundDhlMessages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param body Database column body SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InboundDhlMessagesRow(id: Long, body: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InboundDhlMessagesRow objects using plain SQL queries */
  implicit def GetResultInboundDhlMessagesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[InboundDhlMessagesRow] = GR{
    prs => import prs._
    InboundDhlMessagesRow.tupled((<<[Long], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table inbound_dhl_messages. Objects of this class serve as prototypes for rows in queries. */
  class InboundDhlMessages(_tableTag: Tag) extends profile.api.Table[InboundDhlMessagesRow](_tableTag, "inbound_dhl_messages") {
    def * = (id, body, createdAt) <> (InboundDhlMessagesRow.tupled, InboundDhlMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), body, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InboundDhlMessagesRow.tupled((_1.get, _2, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column body SqlType(text), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table InboundDhlMessages */
  lazy val InboundDhlMessages = new TableQuery(tag => new InboundDhlMessages(tag))
}
