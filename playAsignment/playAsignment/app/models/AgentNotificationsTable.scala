package models
// AUTO-GENERATED Slick data model for table AgentNotifications
trait AgentNotificationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgentNotifications
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param notificationName Database column notification_name SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param enabled Database column enabled SqlType(bool), Default(true)
   *  @param base64Image Database column base64_image SqlType(text)
   *  @param deleted Database column deleted SqlType(bool), Default(false)
   *  @param expiry Database column expiry SqlType(timestamptz) */
  case class AgentNotificationsRow(id: Long, notificationName: String, description: String, enabled: Boolean = true, base64Image: String, deleted: Boolean = false, expiry: java.sql.Timestamp)
  /** GetResult implicit for fetching AgentNotificationsRow objects using plain SQL queries */
  implicit def GetResultAgentNotificationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[java.sql.Timestamp]): GR[AgentNotificationsRow] = GR{
    prs => import prs._
    AgentNotificationsRow.tupled((<<[Long], <<[String], <<[String], <<[Boolean], <<[String], <<[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table agent_notifications. Objects of this class serve as prototypes for rows in queries. */
  class AgentNotifications(_tableTag: Tag) extends profile.api.Table[AgentNotificationsRow](_tableTag, "agent_notifications") {
    def * = (id, notificationName, description, enabled, base64Image, deleted, expiry) <> (AgentNotificationsRow.tupled, AgentNotificationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(notificationName), Rep.Some(description), Rep.Some(enabled), Rep.Some(base64Image), Rep.Some(deleted), Rep.Some(expiry))).shaped.<>({r=>import r._; _1.map(_=> AgentNotificationsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column notification_name SqlType(text) */
    val notificationName: Rep[String] = column[String]("notification_name")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column enabled SqlType(bool), Default(true) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(true))
    /** Database column base64_image SqlType(text) */
    val base64Image: Rep[String] = column[String]("base64_image")
    /** Database column deleted SqlType(bool), Default(false) */
    val deleted: Rep[Boolean] = column[Boolean]("deleted", O.Default(false))
    /** Database column expiry SqlType(timestamptz) */
    val expiry: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("expiry")
  }
  /** Collection-like TableQuery object for table AgentNotifications */
  lazy val AgentNotifications = new TableQuery(tag => new AgentNotifications(tag))
}
