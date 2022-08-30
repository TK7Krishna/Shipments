package models
// AUTO-GENERATED Slick data model for table LocationData
trait LocationDataTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LocationData
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param agentCode Database column agent_code SqlType(text)
   *  @param storeId Database column store_id SqlType(text)
   *  @param storeSuffix Database column store_suffix SqlType(text)
   *  @param validFrom Database column valid_from SqlType(timestamptz), Default(None)
   *  @param validTo Database column valid_to SqlType(timestamptz), Default(None) */
  case class LocationDataRow(id: Long, location: Long, agentCode: String, storeId: String, storeSuffix: String, validFrom: Option[java.sql.Timestamp] = None, validTo: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching LocationDataRow objects using plain SQL queries */
  implicit def GetResultLocationDataRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]]): GR[LocationDataRow] = GR{
    prs => import prs._
    LocationDataRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table location_data. Objects of this class serve as prototypes for rows in queries. */
  class LocationData(_tableTag: Tag) extends profile.api.Table[LocationDataRow](_tableTag, Some("seven_eleven"), "location_data") {
    def * = (id, location, agentCode, storeId, storeSuffix, validFrom, validTo) <> (LocationDataRow.tupled, LocationDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(agentCode), Rep.Some(storeId), Rep.Some(storeSuffix), validFrom, validTo)).shaped.<>({r=>import r._; _1.map(_=> LocationDataRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column agent_code SqlType(text) */
    val agentCode: Rep[String] = column[String]("agent_code")
    /** Database column store_id SqlType(text) */
    val storeId: Rep[String] = column[String]("store_id")
    /** Database column store_suffix SqlType(text) */
    val storeSuffix: Rep[String] = column[String]("store_suffix")
    /** Database column valid_from SqlType(timestamptz), Default(None) */
    val validFrom: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("valid_from", O.Default(None))
    /** Database column valid_to SqlType(timestamptz), Default(None) */
    val validTo: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("valid_to", O.Default(None))

    /** Foreign key referencing Droplocations (database name location_data_location_fkey) */
    lazy val droplocationsFk = foreignKey("location_data_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LocationData */
  lazy val LocationData = new TableQuery(tag => new LocationData(tag))
}
