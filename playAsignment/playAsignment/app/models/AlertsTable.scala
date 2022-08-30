package models
// AUTO-GENERATED Slick data model for table Alerts
trait AlertsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Alerts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param code Database column code SqlType(text)
   *  @param subject Database column subject SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param additionalDetail Database column additional_detail SqlType(text), Default(None)
   *  @param lockerUnit Database column locker_unit SqlType(int8)
   *  @param webhook Database column webhook SqlType(int8), Default(None)
   *  @param acknowledgedAt Database column acknowledged_at SqlType(timestamptz), Default(None)
   *  @param acknowledgedBy Database column acknowledged_by SqlType(int8), Default(None)
   *  @param closedAt Database column closed_at SqlType(timestamptz), Default(None)
   *  @param closedBy Database column closed_by SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class AlertsRow(id: Long, code: String, subject: String, description: String, additionalDetail: Option[String] = None, lockerUnit: Long, webhook: Option[Long] = None, acknowledgedAt: Option[java.sql.Timestamp] = None, acknowledgedBy: Option[Long] = None, closedAt: Option[java.sql.Timestamp] = None, closedBy: Option[Long] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching AlertsRow objects using plain SQL queries */
  implicit def GetResultAlertsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[java.sql.Timestamp]): GR[AlertsRow] = GR{
    prs => import prs._
    AlertsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[String], <<[Long], <<?[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[java.sql.Timestamp], <<?[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table alerts. Objects of this class serve as prototypes for rows in queries. */
  class Alerts(_tableTag: Tag) extends profile.api.Table[AlertsRow](_tableTag, Some("locker"), "alerts") {
    def * = (id, code, subject, description, additionalDetail, lockerUnit, webhook, acknowledgedAt, acknowledgedBy, closedAt, closedBy, createdAt, modifiedAt) <> (AlertsRow.tupled, AlertsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(code), Rep.Some(subject), Rep.Some(description), additionalDetail, Rep.Some(lockerUnit), webhook, acknowledgedAt, acknowledgedBy, closedAt, closedBy, Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> AlertsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7, _8, _9, _10, _11, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(text) */
    val code: Rep[String] = column[String]("code")
    /** Database column subject SqlType(text) */
    val subject: Rep[String] = column[String]("subject")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column additional_detail SqlType(text), Default(None) */
    val additionalDetail: Rep[Option[String]] = column[Option[String]]("additional_detail", O.Default(None))
    /** Database column locker_unit SqlType(int8) */
    val lockerUnit: Rep[Long] = column[Long]("locker_unit")
    /** Database column webhook SqlType(int8), Default(None) */
    val webhook: Rep[Option[Long]] = column[Option[Long]]("webhook", O.Default(None))
    /** Database column acknowledged_at SqlType(timestamptz), Default(None) */
    val acknowledgedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("acknowledged_at", O.Default(None))
    /** Database column acknowledged_by SqlType(int8), Default(None) */
    val acknowledgedBy: Rep[Option[Long]] = column[Option[Long]]("acknowledged_by", O.Default(None))
    /** Database column closed_at SqlType(timestamptz), Default(None) */
    val closedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("closed_at", O.Default(None))
    /** Database column closed_by SqlType(int8), Default(None) */
    val closedBy: Rep[Option[Long]] = column[Option[Long]]("closed_by", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")

    /** Foreign key referencing AdminUsers (database name alerts_acknowledged_by_fkey) */
    lazy val adminUsersFk1 = foreignKey("alerts_acknowledged_by_fkey", acknowledgedBy, AdminUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing AdminUsers (database name alerts_closed_by_fkey) */
    lazy val adminUsersFk2 = foreignKey("alerts_closed_by_fkey", closedBy, AdminUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LockerUnits (database name alerts_locker_unit_fkey) */
    lazy val lockerUnitsFk = foreignKey("alerts_locker_unit_fkey", lockerUnit, LockerUnits)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Webhooks (database name alerts_webhook_fkey) */
    lazy val webhooksFk = foreignKey("alerts_webhook_fkey", webhook, Webhooks)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (code,createdAt) (database name alerts_code_created_at_idx) */
    val index1 = index("alerts_code_created_at_idx", (code, createdAt))
    /** Index over (createdAt,id) (database name alerts_created_at_id_idx) */
    val index2 = index("alerts_created_at_id_idx", (createdAt, id))
    /** Index over (lockerUnit,code) (database name alerts_locker_unit_code_idx) */
    val index3 = index("alerts_locker_unit_code_idx", (lockerUnit, code))
  }
  /** Collection-like TableQuery object for table Alerts */
  lazy val Alerts = new TableQuery(tag => new Alerts(tag))
}
