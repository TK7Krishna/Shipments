package models
// AUTO-GENERATED Slick data model for table DhlLocationData
trait DhlLocationDataTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DhlLocationData
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param locationCode Database column location_code SqlType(text)
   *  @param routeCode Database column route_code SqlType(text)
   *  @param cycleCode Database column cycle_code SqlType(text)
   *  @param serviceAreaCode Database column service_area_code SqlType(text)
   *  @param facilityCode Database column facility_code SqlType(text) */
  case class DhlLocationDataRow(id: Long, location: Long, locationCode: String, routeCode: String, cycleCode: String, serviceAreaCode: String, facilityCode: String)
  /** GetResult implicit for fetching DhlLocationDataRow objects using plain SQL queries */
  implicit def GetResultDhlLocationDataRow(implicit e0: GR[Long], e1: GR[String]): GR[DhlLocationDataRow] = GR{
    prs => import prs._
    DhlLocationDataRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table dhl_location_data. Objects of this class serve as prototypes for rows in queries. */
  class DhlLocationData(_tableTag: Tag) extends profile.api.Table[DhlLocationDataRow](_tableTag, "dhl_location_data") {
    def * = (id, location, locationCode, routeCode, cycleCode, serviceAreaCode, facilityCode) <> (DhlLocationDataRow.tupled, DhlLocationDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(locationCode), Rep.Some(routeCode), Rep.Some(cycleCode), Rep.Some(serviceAreaCode), Rep.Some(facilityCode))).shaped.<>({r=>import r._; _1.map(_=> DhlLocationDataRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column location_code SqlType(text) */
    val locationCode: Rep[String] = column[String]("location_code")
    /** Database column route_code SqlType(text) */
    val routeCode: Rep[String] = column[String]("route_code")
    /** Database column cycle_code SqlType(text) */
    val cycleCode: Rep[String] = column[String]("cycle_code")
    /** Database column service_area_code SqlType(text) */
    val serviceAreaCode: Rep[String] = column[String]("service_area_code")
    /** Database column facility_code SqlType(text) */
    val facilityCode: Rep[String] = column[String]("facility_code")

    /** Foreign key referencing Droplocations (database name dhl_location_data_location_fkey) */
    lazy val droplocationsFk = foreignKey("dhl_location_data_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (locationCode) (database name dhl_location_data_location_code_key) */
    val index1 = index("dhl_location_data_location_code_key", locationCode, unique=true)
    /** Uniqueness Index over (location) (database name dhl_location_data_location_key) */
    val index2 = index("dhl_location_data_location_key", location, unique=true)
  }
  /** Collection-like TableQuery object for table DhlLocationData */
  lazy val DhlLocationData = new TableQuery(tag => new DhlLocationData(tag))
}
