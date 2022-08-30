package models
// AUTO-GENERATED Slick data model for table ChangeLogs
trait ChangeLogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ChangeLogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param adminUser Database column admin_user SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8)
   *  @param action Database column action SqlType(text), Default(None) */
  case class ChangeLogsRow(id: Long, adminUser: Long, consignment: Long, action: Option[String] = None)
  /** GetResult implicit for fetching ChangeLogsRow objects using plain SQL queries */
  implicit def GetResultChangeLogsRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[ChangeLogsRow] = GR{
    prs => import prs._
    ChangeLogsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String]))
  }
  /** Table description of table change_logs. Objects of this class serve as prototypes for rows in queries. */
  class ChangeLogs(_tableTag: Tag) extends profile.api.Table[ChangeLogsRow](_tableTag, Some("consumer"), "change_logs") {
    def * = (id, adminUser, consignment, action) <> (ChangeLogsRow.tupled, ChangeLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(adminUser), Rep.Some(consignment), action)).shaped.<>({r=>import r._; _1.map(_=> ChangeLogsRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column admin_user SqlType(int8) */
    val adminUser: Rep[Long] = column[Long]("admin_user")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column action SqlType(text), Default(None) */
    val action: Rep[Option[String]] = column[Option[String]]("action", O.Default(None))

    /** Foreign key referencing AdminUsers (database name change_logs_admin_user_fkey) */
    lazy val adminUsersFk = foreignKey("change_logs_admin_user_fkey", adminUser, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name change_logs_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("change_logs_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ChangeLogs */
  lazy val ChangeLogs = new TableQuery(tag => new ChangeLogs(tag))
}
