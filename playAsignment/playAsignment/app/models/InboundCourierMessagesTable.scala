package models
// AUTO-GENERATED Slick data model for table InboundCourierMessages
trait InboundCourierMessagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundCourierMessages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courier Database column courier SqlType(text)
   *  @param body Database column body SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InboundCourierMessagesRow(id: Long, courier: String, body: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InboundCourierMessagesRow objects using plain SQL queries */
  implicit def GetResultInboundCourierMessagesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[InboundCourierMessagesRow] = GR{
    prs => import prs._
    InboundCourierMessagesRow.tupled((<<[Long], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table inbound_courier_messages. Objects of this class serve as prototypes for rows in queries. */
  class InboundCourierMessages(_tableTag: Tag) extends profile.api.Table[InboundCourierMessagesRow](_tableTag, "inbound_courier_messages") {
    def * = (id, courier, body, createdAt) <> (InboundCourierMessagesRow.tupled, InboundCourierMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courier), Rep.Some(body), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InboundCourierMessagesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column body SqlType(text) */
    val body: Rep[String] = column[String]("body")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Couriers (database name inbound_courier_messages_courier_fkey) */
    lazy val couriersFk = foreignKey("inbound_courier_messages_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundCourierMessages */
  lazy val InboundCourierMessages = new TableQuery(tag => new InboundCourierMessages(tag))
}
