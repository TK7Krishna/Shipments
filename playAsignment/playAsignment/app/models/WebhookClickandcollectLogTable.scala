package models
// AUTO-GENERATED Slick data model for table WebhookClickandcollectLog
trait WebhookClickandcollectLogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookClickandcollectLog
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param webhookEventMappingId Database column webhook_event_mapping_id SqlType(int8)
   *  @param publicConsignmentId Database column public_consignment_id SqlType(int8), Default(None)
   *  @param status Database column status SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None)
   *  @param attemptcount Database column attemptcount SqlType(int4), Default(Some(0)) */
  case class WebhookClickandcollectLogRow(id: Long, webhookEventMappingId: Long, publicConsignmentId: Option[Long] = None, status: Option[Long] = None, createdAt: Option[java.sql.Timestamp], hubbedUserId: Option[Long] = None, attemptcount: Option[Int] = Some(0))
  /** GetResult implicit for fetching WebhookClickandcollectLogRow objects using plain SQL queries */
  implicit def GetResultWebhookClickandcollectLogRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Int]]): GR[WebhookClickandcollectLogRow] = GR{
    prs => import prs._
    WebhookClickandcollectLogRow.tupled((<<[Long], <<[Long], <<?[Long], <<?[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[Int]))
  }
  /** Table description of table webhook_clickandcollect_log. Objects of this class serve as prototypes for rows in queries. */
  class WebhookClickandcollectLog(_tableTag: Tag) extends profile.api.Table[WebhookClickandcollectLogRow](_tableTag, Some("standard_apis"), "webhook_clickandcollect_log") {
    def * = (id, webhookEventMappingId, publicConsignmentId, status, createdAt, hubbedUserId, attemptcount) <> (WebhookClickandcollectLogRow.tupled, WebhookClickandcollectLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(webhookEventMappingId), publicConsignmentId, status, createdAt, hubbedUserId, attemptcount)).shaped.<>({r=>import r._; _1.map(_=> WebhookClickandcollectLogRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column webhook_event_mapping_id SqlType(int8) */
    val webhookEventMappingId: Rep[Long] = column[Long]("webhook_event_mapping_id")
    /** Database column public_consignment_id SqlType(int8), Default(None) */
    val publicConsignmentId: Rep[Option[Long]] = column[Option[Long]]("public_consignment_id", O.Default(None))
    /** Database column status SqlType(int8), Default(None) */
    val status: Rep[Option[Long]] = column[Option[Long]]("status", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
    /** Database column attemptcount SqlType(int4), Default(Some(0)) */
    val attemptcount: Rep[Option[Int]] = column[Option[Int]]("attemptcount", O.Default(Some(0)))

    /** Foreign key referencing Consignments (database name fk_webhook_clickandcollect_log_public_consignment_id) */
    lazy val consignmentsFk = foreignKey("fk_webhook_clickandcollect_log_public_consignment_id", publicConsignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name fk_webhook_clickandcollect_log_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("fk_webhook_clickandcollect_log_hubbed_user_id", hubbedUserId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing WebhookEventsMapping (database name fk_webhook_clickandcollect_log_webhook_event_mapping_id) */
    lazy val webhookEventsMappingFk = foreignKey("fk_webhook_clickandcollect_log_webhook_event_mapping_id", webhookEventMappingId, WebhookEventsMapping)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table WebhookClickandcollectLog */
  lazy val WebhookClickandcollectLog = new TableQuery(tag => new WebhookClickandcollectLog(tag))
}
