package models
// AUTO-GENERATED Slick data model for table TntLocationData
trait TntLocationDataTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TntLocationData
   *  @param siteId Database column site_id SqlType(text), PrimaryKey
   *  @param locationId Database column location_id SqlType(text)
   *  @param dropLocationId Database column drop_location_id SqlType(int8)
   *  @param error Database column error SqlType(text), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param enabled Database column enabled SqlType(bool), Default(true) */
  case class TntLocationDataRow(siteId: String, locationId: String, dropLocationId: Long, error: Option[String] = None, modifiedAt: java.sql.Timestamp, enabled: Boolean = true)
  /** GetResult implicit for fetching TntLocationDataRow objects using plain SQL queries */
  implicit def GetResultTntLocationDataRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[Boolean]): GR[TntLocationDataRow] = GR{
    prs => import prs._
    TntLocationDataRow.tupled((<<[String], <<[String], <<[Long], <<?[String], <<[java.sql.Timestamp], <<[Boolean]))
  }
  /** Table description of table tnt_location_data. Objects of this class serve as prototypes for rows in queries. */
  class TntLocationData(_tableTag: Tag) extends profile.api.Table[TntLocationDataRow](_tableTag, "tnt_location_data") {
    def * = (siteId, locationId, dropLocationId, error, modifiedAt, enabled) <> (TntLocationDataRow.tupled, TntLocationDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(siteId), Rep.Some(locationId), Rep.Some(dropLocationId), error, Rep.Some(modifiedAt), Rep.Some(enabled))).shaped.<>({r=>import r._; _1.map(_=> TntLocationDataRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column site_id SqlType(text), PrimaryKey */
    val siteId: Rep[String] = column[String]("site_id", O.PrimaryKey)
    /** Database column location_id SqlType(text) */
    val locationId: Rep[String] = column[String]("location_id")
    /** Database column drop_location_id SqlType(int8) */
    val dropLocationId: Rep[Long] = column[Long]("drop_location_id")
    /** Database column error SqlType(text), Default(None) */
    val error: Rep[Option[String]] = column[Option[String]]("error", O.Default(None))
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column enabled SqlType(bool), Default(true) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(true))

    /** Foreign key referencing Droplocations (database name tnt_location_data_drop_location_id_fkey) */
    lazy val droplocationsFk = foreignKey("tnt_location_data_drop_location_id_fkey", dropLocationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TntLocationData */
  lazy val TntLocationData = new TableQuery(tag => new TntLocationData(tag))
}
