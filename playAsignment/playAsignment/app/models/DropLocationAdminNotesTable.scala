package models
// AUTO-GENERATED Slick data model for table DropLocationAdminNotes
trait DropLocationAdminNotesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DropLocationAdminNotes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param body Database column body SqlType(text)
   *  @param createdBy Database column created_by SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class DropLocationAdminNotesRow(id: Long, location: Long, body: String, createdBy: Option[Long] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching DropLocationAdminNotesRow objects using plain SQL queries */
  implicit def GetResultDropLocationAdminNotesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[java.sql.Timestamp]): GR[DropLocationAdminNotesRow] = GR{
    prs => import prs._
    DropLocationAdminNotesRow.tupled((<<[Long], <<[Long], <<[String], <<?[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table drop_location_admin_notes. Objects of this class serve as prototypes for rows in queries. */
  class DropLocationAdminNotes(_tableTag: Tag) extends profile.api.Table[DropLocationAdminNotesRow](_tableTag, "drop_location_admin_notes") {
    def * = (id, location, body, createdBy, createdAt) <> (DropLocationAdminNotesRow.tupled, DropLocationAdminNotesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(body), createdBy, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> DropLocationAdminNotesRow.tupled((_1.get, _2.get, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column body SqlType(text) */
    val body: Rep[String] = column[String]("body")
    /** Database column created_by SqlType(int8), Default(None) */
    val createdBy: Rep[Option[Long]] = column[Option[Long]]("created_by", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing AdminUsers (database name drop_location_admin_notes_created_by_fkey) */
    lazy val adminUsersFk = foreignKey("drop_location_admin_notes_created_by_fkey", createdBy, AdminUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name drop_location_admin_notes_location_fkey) */
    lazy val droplocationsFk = foreignKey("drop_location_admin_notes_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (location,createdAt) (database name drop_location_admin_notes_location_created_at_idx) */
    val index1 = index("drop_location_admin_notes_location_created_at_idx", (location, createdAt))
    /** Index over (location,createdAt) (database name drop_location_admin_notes_location_created_at_idx1) */
    val index2 = index("drop_location_admin_notes_location_created_at_idx1", (location, createdAt))
  }
  /** Collection-like TableQuery object for table DropLocationAdminNotes */
  lazy val DropLocationAdminNotes = new TableQuery(tag => new DropLocationAdminNotes(tag))
}
