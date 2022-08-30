package models
// AUTO-GENERATED Slick data model for table UnitPresetLockers
trait UnitPresetLockersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UnitPresetLockers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param unit Database column unit SqlType(int8)
   *  @param extRef Database column ext_ref SqlType(text), Default(None)
   *  @param sizeClass Database column size_class SqlType(int8) */
  case class UnitPresetLockersRow(id: Long, unit: Long, extRef: Option[String] = None, sizeClass: Long)
  /** GetResult implicit for fetching UnitPresetLockersRow objects using plain SQL queries */
  implicit def GetResultUnitPresetLockersRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[UnitPresetLockersRow] = GR{
    prs => import prs._
    UnitPresetLockersRow.tupled((<<[Long], <<[Long], <<?[String], <<[Long]))
  }
  /** Table description of table unit_preset_lockers. Objects of this class serve as prototypes for rows in queries. */
  class UnitPresetLockers(_tableTag: Tag) extends profile.api.Table[UnitPresetLockersRow](_tableTag, Some("locker"), "unit_preset_lockers") {
    def * = (id, unit, extRef, sizeClass) <> (UnitPresetLockersRow.tupled, UnitPresetLockersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(unit), extRef, Rep.Some(sizeClass))).shaped.<>({r=>import r._; _1.map(_=> UnitPresetLockersRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column unit SqlType(int8) */
    val unit: Rep[Long] = column[Long]("unit")
    /** Database column ext_ref SqlType(text), Default(None) */
    val extRef: Rep[Option[String]] = column[Option[String]]("ext_ref", O.Default(None))
    /** Database column size_class SqlType(int8) */
    val sizeClass: Rep[Long] = column[Long]("size_class")

    /** Foreign key referencing LockerSizeClasses (database name unit_preset_lockers_size_class_fkey) */
    lazy val lockerSizeClassesFk = foreignKey("unit_preset_lockers_size_class_fkey", sizeClass, LockerSizeClasses)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing UnitPresets (database name unit_preset_lockers_unit_fkey) */
    lazy val unitPresetsFk = foreignKey("unit_preset_lockers_unit_fkey", unit, UnitPresets)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (unit,extRef) (database name unit_preset_lockers_unit_ext_ref_key) */
    val index1 = index("unit_preset_lockers_unit_ext_ref_key", (unit, extRef), unique=true)
  }
  /** Collection-like TableQuery object for table UnitPresetLockers */
  lazy val UnitPresetLockers = new TableQuery(tag => new UnitPresetLockers(tag))
}
