package models
// AUTO-GENERATED Slick data model for table AdminLockerMarkOff
trait AdminLockerMarkOffTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AdminLockerMarkOff
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param webhookArticleId Database column webhook_article_id SqlType(int8)
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param articleId Database column article_id SqlType(int8)
   *  @param adminId Database column admin_id SqlType(int8)
   *  @param reason Database column reason SqlType(text), Default(None)
   *  @param isd Database column isd SqlType(text), Default(None)
   *  @param notifyCourier Database column notify_courier SqlType(bool), Default(Some(false))
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class AdminLockerMarkOffRow(id: Long, webhookArticleId: Long, consignmentId: Long, articleId: Long, adminId: Long, reason: Option[String] = None, isd: Option[String] = None, notifyCourier: Option[Boolean] = Some(false), createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching AdminLockerMarkOffRow objects using plain SQL queries */
  implicit def GetResultAdminLockerMarkOffRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp]): GR[AdminLockerMarkOffRow] = GR{
    prs => import prs._
    AdminLockerMarkOffRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<?[String], <<?[String], <<?[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table admin_locker_mark_off. Objects of this class serve as prototypes for rows in queries. */
  class AdminLockerMarkOff(_tableTag: Tag) extends profile.api.Table[AdminLockerMarkOffRow](_tableTag, Some("seven_eleven"), "admin_locker_mark_off") {
    def * = (id, webhookArticleId, consignmentId, articleId, adminId, reason, isd, notifyCourier, createdAt) <> (AdminLockerMarkOffRow.tupled, AdminLockerMarkOffRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(webhookArticleId), Rep.Some(consignmentId), Rep.Some(articleId), Rep.Some(adminId), reason, isd, notifyCourier, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> AdminLockerMarkOffRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column webhook_article_id SqlType(int8) */
    val webhookArticleId: Rep[Long] = column[Long]("webhook_article_id")
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column article_id SqlType(int8) */
    val articleId: Rep[Long] = column[Long]("article_id")
    /** Database column admin_id SqlType(int8) */
    val adminId: Rep[Long] = column[Long]("admin_id")
    /** Database column reason SqlType(text), Default(None) */
    val reason: Rep[Option[String]] = column[Option[String]]("reason", O.Default(None))
    /** Database column isd SqlType(text), Default(None) */
    val isd: Rep[Option[String]] = column[Option[String]]("isd", O.Default(None))
    /** Database column notify_courier SqlType(bool), Default(Some(false)) */
    val notifyCourier: Rep[Option[Boolean]] = column[Option[Boolean]]("notify_courier", O.Default(Some(false)))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing AdminUsers (database name admin_locker_mark_off_admin_id_fkey) */
    lazy val adminUsersFk = foreignKey("admin_locker_mark_off_admin_id_fkey", adminId, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing StgArticles (database name admin_locker_mark_off_article_id_fkey) */
    lazy val stgArticlesFk = foreignKey("admin_locker_mark_off_article_id_fkey", articleId, StgArticles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing StgConsignments (database name admin_locker_mark_off_consignment_id_fkey) */
    lazy val stgConsignmentsFk = foreignKey("admin_locker_mark_off_consignment_id_fkey", consignmentId, StgConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing WebhookArticles (database name admin_locker_mark_off_webhook_article_id_fkey) */
    lazy val webhookArticlesFk = foreignKey("admin_locker_mark_off_webhook_article_id_fkey", webhookArticleId, WebhookArticles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AdminLockerMarkOff */
  lazy val AdminLockerMarkOff = new TableQuery(tag => new AdminLockerMarkOff(tag))
}
