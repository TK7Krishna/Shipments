package models
// AUTO-GENERATED Slick data model for table WebhookEventsMapping
trait WebhookEventsMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookEventsMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param eventId Database column event_id SqlType(int8)
   *  @param active Database column active SqlType(bool), Default(false)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None) */
  case class WebhookEventsMappingRow(id: Long, eventId: Long, active: Boolean = false, hubbedUserId: Option[Long] = None)
  /** GetResult implicit for fetching WebhookEventsMappingRow objects using plain SQL queries */
  implicit def GetResultWebhookEventsMappingRow(implicit e0: GR[Long], e1: GR[Boolean], e2: GR[Option[Long]]): GR[WebhookEventsMappingRow] = GR{
    prs => import prs._
    WebhookEventsMappingRow.tupled((<<[Long], <<[Long], <<[Boolean], <<?[Long]))
  }
  /** Table description of table webhook_events_mapping. Objects of this class serve as prototypes for rows in queries. */
  class WebhookEventsMapping(_tableTag: Tag) extends profile.api.Table[WebhookEventsMappingRow](_tableTag, Some("standard_apis"), "webhook_events_mapping") {
    def * = (id, eventId, active, hubbedUserId) <> (WebhookEventsMappingRow.tupled, WebhookEventsMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(eventId), Rep.Some(active), hubbedUserId)).shaped.<>({r=>import r._; _1.map(_=> WebhookEventsMappingRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column event_id SqlType(int8) */
    val eventId: Rep[Long] = column[Long]("event_id")
    /** Database column active SqlType(bool), Default(false) */
    val active: Rep[Boolean] = column[Boolean]("active", O.Default(false))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name webhook_events_mapping_hubbed_users_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("webhook_events_mapping_hubbed_users_id_fkey", hubbedUserId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table WebhookEventsMapping */
  lazy val WebhookEventsMapping = new TableQuery(tag => new WebhookEventsMapping(tag))
}
