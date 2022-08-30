package models
// AUTO-GENERATED Slick data model for table LockerUnits
trait LockerUnitsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LockerUnits
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param extRef Database column ext_ref SqlType(text), Default(None)
   *  @param provider Database column provider SqlType(int8)
   *  @param location Database column location SqlType(int8)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param deletedAt Database column deleted_at SqlType(timestamptz), Default(None)
   *  @param disabledAt Database column disabled_at SqlType(timestamptz)
   *  @param creationSelfRegistered Database column creation_self_registered SqlType(bool), Default(false) */
  case class LockerUnitsRow(id: Long, extRef: Option[String] = None, provider: Long, location: Long, description: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, deletedAt: Option[java.sql.Timestamp] = None, disabledAt: Option[java.sql.Timestamp], creationSelfRegistered: Boolean = false)
  /** GetResult implicit for fetching LockerUnitsRow objects using plain SQL queries */
  implicit def GetResultLockerUnitsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]], e4: GR[Boolean]): GR[LockerUnitsRow] = GR{
    prs => import prs._
    LockerUnitsRow.tupled((<<[Long], <<?[String], <<[Long], <<[Long], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Boolean]))
  }
  /** Table description of table locker_units. Objects of this class serve as prototypes for rows in queries. */
  class LockerUnits(_tableTag: Tag) extends profile.api.Table[LockerUnitsRow](_tableTag, Some("locker"), "locker_units") {
    def * = (id, extRef, provider, location, description, createdAt, modifiedAt, deletedAt, disabledAt, creationSelfRegistered) <> (LockerUnitsRow.tupled, LockerUnitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), extRef, Rep.Some(provider), Rep.Some(location), description, Rep.Some(createdAt), Rep.Some(modifiedAt), deletedAt, disabledAt, Rep.Some(creationSelfRegistered))).shaped.<>({r=>import r._; _1.map(_=> LockerUnitsRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6.get, _7.get, _8, _9, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column ext_ref SqlType(text), Default(None) */
    val extRef: Rep[Option[String]] = column[Option[String]]("ext_ref", O.Default(None))
    /** Database column provider SqlType(int8) */
    val provider: Rep[Long] = column[Long]("provider")
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column deleted_at SqlType(timestamptz), Default(None) */
    val deletedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("deleted_at", O.Default(None))
    /** Database column disabled_at SqlType(timestamptz) */
    val disabledAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("disabled_at")
    /** Database column creation_self_registered SqlType(bool), Default(false) */
    val creationSelfRegistered: Rep[Boolean] = column[Boolean]("creation_self_registered", O.Default(false))

    /** Foreign key referencing Droplocations (database name locker_units_location_fkey) */
    lazy val droplocationsFk = foreignKey("locker_units_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Providers (database name locker_units_provider_fkey) */
    lazy val providersFk = foreignKey("locker_units_provider_fkey", provider, Providers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (provider,extRef) (database name locker_units_provider_ext_ref_key) */
    val index1 = index("locker_units_provider_ext_ref_key", (provider, extRef), unique=true)
  }
  /** Collection-like TableQuery object for table LockerUnits */
  lazy val LockerUnits = new TableQuery(tag => new LockerUnits(tag))
}
