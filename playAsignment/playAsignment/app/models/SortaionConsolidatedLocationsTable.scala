package models
// AUTO-GENERATED Slick data model for table SortaionConsolidatedLocations
trait SortaionConsolidatedLocationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SortaionConsolidatedLocations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text), Default(None)
   *  @param address Database column address SqlType(text), Default(None)
   *  @param suburb Database column suburb SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param postcode Database column postcode SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(varchar), Length(20,true), Default(None)
   *  @param enabled Database column enabled SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param address2 Database column address2 SqlType(text), Default(None)
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None) */
  case class SortaionConsolidatedLocationsRow(id: Long, name: Option[String] = None, address: Option[String] = None, suburb: Option[String] = None, state: Option[String] = None, country: Option[String] = None, postcode: Option[String] = None, phone: Option[String] = None, enabled: Option[Boolean] = None, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, address2: Option[String] = None, droplocationId: Option[Long] = None)
  /** GetResult implicit for fetching SortaionConsolidatedLocationsRow objects using plain SQL queries */
  implicit def GetResultSortaionConsolidatedLocationsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Long]]): GR[SortaionConsolidatedLocationsRow] = GR{
    prs => import prs._
    SortaionConsolidatedLocationsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[Long]))
  }
  /** Table description of table sortaion_consolidated_locations. Objects of this class serve as prototypes for rows in queries. */
  class SortaionConsolidatedLocations(_tableTag: Tag) extends profile.api.Table[SortaionConsolidatedLocationsRow](_tableTag, Some("ecommerce"), "sortaion_consolidated_locations") {
    def * = (id, name, address, suburb, state, country, postcode, phone, enabled, createdAt, modifiedAt, address2, droplocationId) <> (SortaionConsolidatedLocationsRow.tupled, SortaionConsolidatedLocationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name, address, suburb, state, country, postcode, phone, enabled, Rep.Some(createdAt), modifiedAt, address2, droplocationId)).shaped.<>({r=>import r._; _1.map(_=> SortaionConsolidatedLocationsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10.get, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column address SqlType(text), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Default(None))
    /** Database column suburb SqlType(text), Default(None) */
    val suburb: Rep[Option[String]] = column[Option[String]]("suburb", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column postcode SqlType(text), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Default(None))
    /** Database column phone SqlType(varchar), Length(20,true), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Length(20,varying=true), O.Default(None))
    /** Database column enabled SqlType(bool), Default(None) */
    val enabled: Rep[Option[Boolean]] = column[Option[Boolean]]("enabled", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column address2 SqlType(text), Default(None) */
    val address2: Rep[Option[String]] = column[Option[String]]("address2", O.Default(None))
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))
  }
  /** Collection-like TableQuery object for table SortaionConsolidatedLocations */
  lazy val SortaionConsolidatedLocations = new TableQuery(tag => new SortaionConsolidatedLocations(tag))
}
