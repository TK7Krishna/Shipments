package models
// AUTO-GENERATED Slick data model for table CourierAllocations
trait CourierAllocationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierAllocations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param locker Database column locker SqlType(int8)
   *  @param courier Database column courier SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param disabledAt Database column disabled_at SqlType(timestamptz), Default(None) */
  case class CourierAllocationsRow(id: Long, locker: Long, courier: String, createdAt: java.sql.Timestamp, disabledAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching CourierAllocationsRow objects using plain SQL queries */
  implicit def GetResultCourierAllocationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[CourierAllocationsRow] = GR{
    prs => import prs._
    CourierAllocationsRow.tupled((<<[Long], <<[Long], <<[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table courier_allocations. Objects of this class serve as prototypes for rows in queries. */
  class CourierAllocations(_tableTag: Tag) extends profile.api.Table[CourierAllocationsRow](_tableTag, Some("locker"), "courier_allocations") {
    def * = (id, locker, courier, createdAt, disabledAt) <> (CourierAllocationsRow.tupled, CourierAllocationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(locker), Rep.Some(courier), Rep.Some(createdAt), disabledAt)).shaped.<>({r=>import r._; _1.map(_=> CourierAllocationsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column locker SqlType(int8) */
    val locker: Rep[Long] = column[Long]("locker")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column disabled_at SqlType(timestamptz), Default(None) */
    val disabledAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("disabled_at", O.Default(None))

    /** Foreign key referencing Couriers (database name courier_allocations_courier_fkey) */
    lazy val couriersFk = foreignKey("courier_allocations_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Lockers (database name courier_allocations_locker_fkey) */
    lazy val lockersFk = foreignKey("courier_allocations_locker_fkey", locker, Lockers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierAllocations */
  lazy val CourierAllocations = new TableQuery(tag => new CourierAllocations(tag))
}
