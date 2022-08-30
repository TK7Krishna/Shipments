package models
// AUTO-GENERATED Slick data model for table LocationCapabilities
trait LocationCapabilitiesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LocationCapabilities
   *  @param location Database column location SqlType(int8)
   *  @param capability Database column capability SqlType(text) */
  case class LocationCapabilitiesRow(location: Long, capability: String)
  /** GetResult implicit for fetching LocationCapabilitiesRow objects using plain SQL queries */
  implicit def GetResultLocationCapabilitiesRow(implicit e0: GR[Long], e1: GR[String]): GR[LocationCapabilitiesRow] = GR{
    prs => import prs._
    LocationCapabilitiesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table location_capabilities. Objects of this class serve as prototypes for rows in queries. */
  class LocationCapabilities(_tableTag: Tag) extends profile.api.Table[LocationCapabilitiesRow](_tableTag, "location_capabilities") {
    def * = (location, capability) <> (LocationCapabilitiesRow.tupled, LocationCapabilitiesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(location), Rep.Some(capability))).shaped.<>({r=>import r._; _1.map(_=> LocationCapabilitiesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column capability SqlType(text) */
    val capability: Rep[String] = column[String]("capability")

    /** Primary key of LocationCapabilities (database name location_capabilities_pkey) */
    val pk = primaryKey("location_capabilities_pkey", (location, capability))

    /** Foreign key referencing Capabilities (database name location_capabilities_capability_fkey) */
    lazy val capabilitiesFk = foreignKey("location_capabilities_capability_fkey", capability, Capabilities)(r => r.name, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name location_capabilities_location_fkey) */
    lazy val droplocationsFk = foreignKey("location_capabilities_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LocationCapabilities */
  lazy val LocationCapabilities = new TableQuery(tag => new LocationCapabilities(tag))
}
