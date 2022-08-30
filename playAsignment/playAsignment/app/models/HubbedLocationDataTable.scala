package models
// AUTO-GENERATED Slick data model for table HubbedLocationData
trait HubbedLocationDataTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HubbedLocationData
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param locationCode Database column location_code SqlType(text)
   *  @param routeCode Database column route_code SqlType(text), Default(None)
   *  @param cycleCode Database column cycle_code SqlType(text), Default(None)
   *  @param serviceAreaCode Database column service_area_code SqlType(text), Default(None)
   *  @param facilityCode Database column facility_code SqlType(text), Default(None) */
  case class HubbedLocationDataRow(id: Long, location: Long, locationCode: String, routeCode: Option[String] = None, cycleCode: Option[String] = None, serviceAreaCode: Option[String] = None, facilityCode: Option[String] = None)
  /** GetResult implicit for fetching HubbedLocationDataRow objects using plain SQL queries */
  implicit def GetResultHubbedLocationDataRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[HubbedLocationDataRow] = GR{
    prs => import prs._
    HubbedLocationDataRow.tupled((<<[Long], <<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table hubbed_location_data. Objects of this class serve as prototypes for rows in queries. */
  class HubbedLocationData(_tableTag: Tag) extends profile.api.Table[HubbedLocationDataRow](_tableTag, Some("standard_apis"), "hubbed_location_data") {
    def * = (id, location, locationCode, routeCode, cycleCode, serviceAreaCode, facilityCode) <> (HubbedLocationDataRow.tupled, HubbedLocationDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(locationCode), routeCode, cycleCode, serviceAreaCode, facilityCode)).shaped.<>({r=>import r._; _1.map(_=> HubbedLocationDataRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column location_code SqlType(text) */
    val locationCode: Rep[String] = column[String]("location_code")
    /** Database column route_code SqlType(text), Default(None) */
    val routeCode: Rep[Option[String]] = column[Option[String]]("route_code", O.Default(None))
    /** Database column cycle_code SqlType(text), Default(None) */
    val cycleCode: Rep[Option[String]] = column[Option[String]]("cycle_code", O.Default(None))
    /** Database column service_area_code SqlType(text), Default(None) */
    val serviceAreaCode: Rep[Option[String]] = column[Option[String]]("service_area_code", O.Default(None))
    /** Database column facility_code SqlType(text), Default(None) */
    val facilityCode: Rep[Option[String]] = column[Option[String]]("facility_code", O.Default(None))

    /** Foreign key referencing Droplocations (database name hubbed_location_data_location_fkey) */
    lazy val droplocationsFk = foreignKey("hubbed_location_data_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (locationCode) (database name hubbed_location_data_location_code_key) */
    val index1 = index("hubbed_location_data_location_code_key", locationCode, unique=true)
    /** Uniqueness Index over (location) (database name hubbed_location_data_location_key) */
    val index2 = index("hubbed_location_data_location_key", location, unique=true)
  }
  /** Collection-like TableQuery object for table HubbedLocationData */
  lazy val HubbedLocationData = new TableQuery(tag => new HubbedLocationData(tag))
}
