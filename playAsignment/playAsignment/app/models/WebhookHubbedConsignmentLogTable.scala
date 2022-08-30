package models
// AUTO-GENERATED Slick data model for table WebhookHubbedConsignmentLog
trait WebhookHubbedConsignmentLogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookHubbedConsignmentLog
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param webhookEventMappingId Database column webhook_event_mapping_id SqlType(int8)
   *  @param hubbedConsignmentid Database column hubbed_consignmentid SqlType(int8), Default(None)
   *  @param status Database column status SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param externalConsignmentid Database column external_consignmentid SqlType(int8), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None)
   *  @param attemptcount Database column attemptcount SqlType(int4), Default(Some(0))
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param storeDlb Database column store_dlb SqlType(text), Default(None)
   *  @param dropLocationState Database column drop_location_state SqlType(text), Default(None)
   *  @param dropLocationCountry Database column drop_location_country SqlType(text), Default(None)
   *  @param dropTime Database column drop_time SqlType(timestamptz), Default(None)
   *  @param notificationUrl Database column notification_url SqlType(text), Default(None)
   *  @param username Database column username SqlType(text), Default(None)
   *  @param password Database column password SqlType(text), Default(None)
   *  @param returnHubbedId Database column return_hubbed_id SqlType(int8), Default(None) */
  case class WebhookHubbedConsignmentLogRow(id: Long, webhookEventMappingId: Long, hubbedConsignmentid: Option[Long] = None, status: Option[Long] = None, createdAt: Option[java.sql.Timestamp], externalConsignmentid: Option[Long] = None, hubbedUserId: Option[Long] = None, attemptcount: Option[Int] = Some(0), consignmentNumber: Option[String] = None, storeDlb: Option[String] = None, dropLocationState: Option[String] = None, dropLocationCountry: Option[String] = None, dropTime: Option[java.sql.Timestamp] = None, notificationUrl: Option[String] = None, username: Option[String] = None, password: Option[String] = None, returnHubbedId: Option[Long] = None)
  /** GetResult implicit for fetching WebhookHubbedConsignmentLogRow objects using plain SQL queries */
  implicit def GetResultWebhookHubbedConsignmentLogRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Int]], e4: GR[Option[String]]): GR[WebhookHubbedConsignmentLogRow] = GR{
    prs => import prs._
    WebhookHubbedConsignmentLogRow.tupled((<<[Long], <<[Long], <<?[Long], <<?[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[Long], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[Long]))
  }
  /** Table description of table webhook_hubbed_consignment_log. Objects of this class serve as prototypes for rows in queries. */
  class WebhookHubbedConsignmentLog(_tableTag: Tag) extends profile.api.Table[WebhookHubbedConsignmentLogRow](_tableTag, Some("standard_apis"), "webhook_hubbed_consignment_log") {
    def * = (id, webhookEventMappingId, hubbedConsignmentid, status, createdAt, externalConsignmentid, hubbedUserId, attemptcount, consignmentNumber, storeDlb, dropLocationState, dropLocationCountry, dropTime, notificationUrl, username, password, returnHubbedId) <> (WebhookHubbedConsignmentLogRow.tupled, WebhookHubbedConsignmentLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(webhookEventMappingId), hubbedConsignmentid, status, createdAt, externalConsignmentid, hubbedUserId, attemptcount, consignmentNumber, storeDlb, dropLocationState, dropLocationCountry, dropTime, notificationUrl, username, password, returnHubbedId)).shaped.<>({r=>import r._; _1.map(_=> WebhookHubbedConsignmentLogRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column webhook_event_mapping_id SqlType(int8) */
    val webhookEventMappingId: Rep[Long] = column[Long]("webhook_event_mapping_id")
    /** Database column hubbed_consignmentid SqlType(int8), Default(None) */
    val hubbedConsignmentid: Rep[Option[Long]] = column[Option[Long]]("hubbed_consignmentid", O.Default(None))
    /** Database column status SqlType(int8), Default(None) */
    val status: Rep[Option[Long]] = column[Option[Long]]("status", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column external_consignmentid SqlType(int8), Default(None) */
    val externalConsignmentid: Rep[Option[Long]] = column[Option[Long]]("external_consignmentid", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
    /** Database column attemptcount SqlType(int4), Default(Some(0)) */
    val attemptcount: Rep[Option[Int]] = column[Option[Int]]("attemptcount", O.Default(Some(0)))
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column store_dlb SqlType(text), Default(None) */
    val storeDlb: Rep[Option[String]] = column[Option[String]]("store_dlb", O.Default(None))
    /** Database column drop_location_state SqlType(text), Default(None) */
    val dropLocationState: Rep[Option[String]] = column[Option[String]]("drop_location_state", O.Default(None))
    /** Database column drop_location_country SqlType(text), Default(None) */
    val dropLocationCountry: Rep[Option[String]] = column[Option[String]]("drop_location_country", O.Default(None))
    /** Database column drop_time SqlType(timestamptz), Default(None) */
    val dropTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("drop_time", O.Default(None))
    /** Database column notification_url SqlType(text), Default(None) */
    val notificationUrl: Rep[Option[String]] = column[Option[String]]("notification_url", O.Default(None))
    /** Database column username SqlType(text), Default(None) */
    val username: Rep[Option[String]] = column[Option[String]]("username", O.Default(None))
    /** Database column password SqlType(text), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Default(None))
    /** Database column return_hubbed_id SqlType(int8), Default(None) */
    val returnHubbedId: Rep[Option[Long]] = column[Option[Long]]("return_hubbed_id", O.Default(None))

    /** Foreign key referencing Consignments (database name webhook_hubbed_consignment_log_external_consignmentid_fkey) */
    lazy val consignmentsFk = foreignKey("webhook_hubbed_consignment_log_external_consignmentid_fkey", externalConsignmentid, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fk) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fk", hubbedUserId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table WebhookHubbedConsignmentLog */
  lazy val WebhookHubbedConsignmentLog = new TableQuery(tag => new WebhookHubbedConsignmentLog(tag))
}
