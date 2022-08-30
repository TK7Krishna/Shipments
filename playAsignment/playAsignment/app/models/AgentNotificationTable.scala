package models
// AUTO-GENERATED Slick data model for table AgentNotification
trait AgentNotificationTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgentNotification
   *  @param agent Database column agent SqlType(int8)
   *  @param notification Database column notification SqlType(int8)
   *  @param readTime Database column read_time SqlType(timestamptz), Default(None) */
  case class AgentNotificationRow(agent: Long, notification: Long, readTime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching AgentNotificationRow objects using plain SQL queries */
  implicit def GetResultAgentNotificationRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]]): GR[AgentNotificationRow] = GR{
    prs => import prs._
    AgentNotificationRow.tupled((<<[Long], <<[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table agent_notification. Objects of this class serve as prototypes for rows in queries. */
  class AgentNotification(_tableTag: Tag) extends profile.api.Table[AgentNotificationRow](_tableTag, "agent_notification") {
    def * = (agent, notification, readTime) <> (AgentNotificationRow.tupled, AgentNotificationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(agent), Rep.Some(notification), readTime)).shaped.<>({r=>import r._; _1.map(_=> AgentNotificationRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column agent SqlType(int8) */
    val agent: Rep[Long] = column[Long]("agent")
    /** Database column notification SqlType(int8) */
    val notification: Rep[Long] = column[Long]("notification")
    /** Database column read_time SqlType(timestamptz), Default(None) */
    val readTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("read_time", O.Default(None))

    /** Foreign key referencing AgentNotifications (database name agent_notification_notification_fkey) */
    lazy val agentNotificationsFk = foreignKey("agent_notification_notification_fkey", notification, AgentNotifications)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Users (database name agent_notification_agent_fkey) */
    lazy val usersFk = foreignKey("agent_notification_agent_fkey", agent, Users)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AgentNotification */
  lazy val AgentNotification = new TableQuery(tag => new AgentNotification(tag))
}
