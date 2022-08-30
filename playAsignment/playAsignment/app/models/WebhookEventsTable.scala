package models
// AUTO-GENERATED Slick data model for table WebhookEvents
trait WebhookEventsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookEvents
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param eventName Database column event_name SqlType(text)
   *  @param active Database column active SqlType(bool), Default(None)
   *  @param displayName Database column display_name SqlType(text), Default(None) */
  case class WebhookEventsRow(id: Long, eventName: String, active: Option[Boolean] = None, displayName: Option[String] = None)
  /** GetResult implicit for fetching WebhookEventsRow objects using plain SQL queries */
  implicit def GetResultWebhookEventsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[String]]): GR[WebhookEventsRow] = GR{
    prs => import prs._
    WebhookEventsRow.tupled((<<[Long], <<[String], <<?[Boolean], <<?[String]))
  }
  /** Table description of table webhook_events. Objects of this class serve as prototypes for rows in queries. */
  class WebhookEvents(_tableTag: Tag) extends profile.api.Table[WebhookEventsRow](_tableTag, Some("standard_apis"), "webhook_events") {
    def * = (id, eventName, active, displayName) <> (WebhookEventsRow.tupled, WebhookEventsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(eventName), active, displayName)).shaped.<>({r=>import r._; _1.map(_=> WebhookEventsRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column event_name SqlType(text) */
    val eventName: Rep[String] = column[String]("event_name")
    /** Database column active SqlType(bool), Default(None) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(None))
    /** Database column display_name SqlType(text), Default(None) */
    val displayName: Rep[Option[String]] = column[Option[String]]("display_name", O.Default(None))
  }
  /** Collection-like TableQuery object for table WebhookEvents */
  lazy val WebhookEvents = new TableQuery(tag => new WebhookEvents(tag))
}
