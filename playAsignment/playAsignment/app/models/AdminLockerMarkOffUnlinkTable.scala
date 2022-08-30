package models
// AUTO-GENERATED Slick data model for table AdminLockerMarkOffUnlink
trait AdminLockerMarkOffUnlinkTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AdminLockerMarkOffUnlink
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param webhookArticleId Database column webhook_article_id SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param adminId Database column admin_id SqlType(int8)
   *  @param reason Database column reason SqlType(text), Default(None)
   *  @param isd Database column isd SqlType(text), Default(None)
   *  @param notifyCourier Database column notify_courier SqlType(bool), Default(Some(false))
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class AdminLockerMarkOffUnlinkRow(id: Long, webhookArticleId: Long, barcode: String, adminId: Long, reason: Option[String] = None, isd: Option[String] = None, notifyCourier: Option[Boolean] = Some(false), createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching AdminLockerMarkOffUnlinkRow objects using plain SQL queries */
  implicit def GetResultAdminLockerMarkOffUnlinkRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[java.sql.Timestamp]): GR[AdminLockerMarkOffUnlinkRow] = GR{
    prs => import prs._
    AdminLockerMarkOffUnlinkRow.tupled((<<[Long], <<[Long], <<[String], <<[Long], <<?[String], <<?[String], <<?[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table admin_locker_mark_off_unlink. Objects of this class serve as prototypes for rows in queries. */
  class AdminLockerMarkOffUnlink(_tableTag: Tag) extends profile.api.Table[AdminLockerMarkOffUnlinkRow](_tableTag, "admin_locker_mark_off_unlink") {
    def * = (id, webhookArticleId, barcode, adminId, reason, isd, notifyCourier, createdAt) <> (AdminLockerMarkOffUnlinkRow.tupled, AdminLockerMarkOffUnlinkRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(webhookArticleId), Rep.Some(barcode), Rep.Some(adminId), reason, isd, notifyCourier, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> AdminLockerMarkOffUnlinkRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column webhook_article_id SqlType(int8) */
    val webhookArticleId: Rep[Long] = column[Long]("webhook_article_id")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
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

    /** Foreign key referencing AdminUsers (database name admin_locker_mark_off_unlink_admin_id_fkey) */
    lazy val adminUsersFk = foreignKey("admin_locker_mark_off_unlink_admin_id_fkey", adminId, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing WebhookArticles (database name admin_locker_mark_off_unlink_webhook_article_id_fkey) */
    lazy val webhookArticlesFk = foreignKey("admin_locker_mark_off_unlink_webhook_article_id_fkey", webhookArticleId, WebhookArticles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AdminLockerMarkOffUnlink */
  lazy val AdminLockerMarkOffUnlink = new TableQuery(tag => new AdminLockerMarkOffUnlink(tag))
}
