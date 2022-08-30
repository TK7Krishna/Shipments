package models
// AUTO-GENERATED Slick data model for table StoreLocationCodes
trait StoreLocationCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StoreLocationCodes
   *  @param locationCode Database column location_code SqlType(text), PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param courier Database column courier SqlType(text)
   *  @param updatedAt Database column updated_at SqlType(timestamptz) */
  case class StoreLocationCodesRow(locationCode: String, location: Long, courier: String, updatedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching StoreLocationCodesRow objects using plain SQL queries */
  implicit def GetResultStoreLocationCodesRow(implicit e0: GR[String], e1: GR[Long], e2: GR[java.sql.Timestamp]): GR[StoreLocationCodesRow] = GR{
    prs => import prs._
    StoreLocationCodesRow.tupled((<<[String], <<[Long], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table store_location_codes. Objects of this class serve as prototypes for rows in queries. */
  class StoreLocationCodes(_tableTag: Tag) extends profile.api.Table[StoreLocationCodesRow](_tableTag, "store_location_codes") {
    def * = (locationCode, location, courier, updatedAt) <> (StoreLocationCodesRow.tupled, StoreLocationCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(locationCode), Rep.Some(location), Rep.Some(courier), Rep.Some(updatedAt))).shaped.<>({r=>import r._; _1.map(_=> StoreLocationCodesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column location_code SqlType(text), PrimaryKey */
    val locationCode: Rep[String] = column[String]("location_code", O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column updated_at SqlType(timestamptz) */
    val updatedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("updated_at")

    /** Foreign key referencing Couriers (database name store_location_codes_courier_fkey) */
    lazy val couriersFk = foreignKey("store_location_codes_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name store_location_codes_location_fkey) */
    lazy val droplocationsFk = foreignKey("store_location_codes_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (location) (database name store_location_codes_location_key) */
    val index1 = index("store_location_codes_location_key", location, unique=true)
  }
  /** Collection-like TableQuery object for table StoreLocationCodes */
  lazy val StoreLocationCodes = new TableQuery(tag => new StoreLocationCodes(tag))
}
