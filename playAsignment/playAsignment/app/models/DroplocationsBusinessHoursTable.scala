package models
// AUTO-GENERATED Slick data model for table DroplocationsBusinessHours
trait DroplocationsBusinessHoursTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DroplocationsBusinessHours
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param locationId Database column location_id SqlType(int8)
   *  @param day Database column day SqlType(int4)
   *  @param openTime Database column open_time SqlType(time), Default(None)
   *  @param closeTime Database column close_time SqlType(time), Default(None) */
  case class DroplocationsBusinessHoursRow(id: Long, locationId: Long, day: Int, openTime: Option[java.sql.Time] = None, closeTime: Option[java.sql.Time] = None)
  /** GetResult implicit for fetching DroplocationsBusinessHoursRow objects using plain SQL queries */
  implicit def GetResultDroplocationsBusinessHoursRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[Option[java.sql.Time]]): GR[DroplocationsBusinessHoursRow] = GR{
    prs => import prs._
    DroplocationsBusinessHoursRow.tupled((<<[Long], <<[Long], <<[Int], <<?[java.sql.Time], <<?[java.sql.Time]))
  }
  /** Table description of table droplocations_business_hours. Objects of this class serve as prototypes for rows in queries. */
  class DroplocationsBusinessHours(_tableTag: Tag) extends profile.api.Table[DroplocationsBusinessHoursRow](_tableTag, "droplocations_business_hours") {
    def * = (id, locationId, day, openTime, closeTime) <> (DroplocationsBusinessHoursRow.tupled, DroplocationsBusinessHoursRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(locationId), Rep.Some(day), openTime, closeTime)).shaped.<>({r=>import r._; _1.map(_=> DroplocationsBusinessHoursRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location_id SqlType(int8) */
    val locationId: Rep[Long] = column[Long]("location_id")
    /** Database column day SqlType(int4) */
    val day: Rep[Int] = column[Int]("day")
    /** Database column open_time SqlType(time), Default(None) */
    val openTime: Rep[Option[java.sql.Time]] = column[Option[java.sql.Time]]("open_time", O.Default(None))
    /** Database column close_time SqlType(time), Default(None) */
    val closeTime: Rep[Option[java.sql.Time]] = column[Option[java.sql.Time]]("close_time", O.Default(None))

    /** Foreign key referencing Droplocations (database name droplocations_business_hours_location_id_fkey) */
    lazy val droplocationsFk = foreignKey("droplocations_business_hours_location_id_fkey", locationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DroplocationsBusinessHours */
  lazy val DroplocationsBusinessHours = new TableQuery(tag => new DroplocationsBusinessHours(tag))
}
