package models
// AUTO-GENERATED Slick data model for table Lockers
trait LockersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Lockers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param extRef Database column ext_ref SqlType(text), Default(None)
   *  @param lockerUnit Database column locker_unit SqlType(int8)
   *  @param sizeClass Database column size_class SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param deletedAt Database column deleted_at SqlType(timestamptz), Default(None) */
  case class LockersRow(id: Long, extRef: Option[String] = None, lockerUnit: Long, sizeClass: Long, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, deletedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching LockersRow objects using plain SQL queries */
  implicit def GetResultLockersRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[LockersRow] = GR{
    prs => import prs._
    LockersRow.tupled((<<[Long], <<?[String], <<[Long], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table lockers. Objects of this class serve as prototypes for rows in queries. */
  class Lockers(_tableTag: Tag) extends profile.api.Table[LockersRow](_tableTag, Some("locker"), "lockers") {
    def * = (id, extRef, lockerUnit, sizeClass, createdAt, modifiedAt, deletedAt) <> (LockersRow.tupled, LockersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), extRef, Rep.Some(lockerUnit), Rep.Some(sizeClass), Rep.Some(createdAt), Rep.Some(modifiedAt), deletedAt)).shaped.<>({r=>import r._; _1.map(_=> LockersRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column ext_ref SqlType(text), Default(None) */
    val extRef: Rep[Option[String]] = column[Option[String]]("ext_ref", O.Default(None))
    /** Database column locker_unit SqlType(int8) */
    val lockerUnit: Rep[Long] = column[Long]("locker_unit")
    /** Database column size_class SqlType(int8) */
    val sizeClass: Rep[Long] = column[Long]("size_class")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column deleted_at SqlType(timestamptz), Default(None) */
    val deletedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("deleted_at", O.Default(None))

    /** Foreign key referencing LockerSizeClasses (database name lockers_size_class_fkey) */
    lazy val lockerSizeClassesFk = foreignKey("lockers_size_class_fkey", sizeClass, LockerSizeClasses)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LockerUnits (database name lockers_locker_unit_fkey) */
    lazy val lockerUnitsFk = foreignKey("lockers_locker_unit_fkey", lockerUnit, LockerUnits)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (lockerUnit,extRef) (database name lockers_locker_unit_ext_ref_key) */
    val index1 = index("lockers_locker_unit_ext_ref_key", (lockerUnit, extRef), unique=true)
  }
  /** Collection-like TableQuery object for table Lockers */
  lazy val Lockers = new TableQuery(tag => new Lockers(tag))
}
