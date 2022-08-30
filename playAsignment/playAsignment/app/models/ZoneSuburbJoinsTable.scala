package models
// AUTO-GENERATED Slick data model for table ZoneSuburbJoins
trait ZoneSuburbJoinsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ZoneSuburbJoins
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param zone Database column zone SqlType(int8)
   *  @param suburb Database column suburb SqlType(int8) */
  case class ZoneSuburbJoinsRow(id: Long, zone: Long, suburb: Long)
  /** GetResult implicit for fetching ZoneSuburbJoinsRow objects using plain SQL queries */
  implicit def GetResultZoneSuburbJoinsRow(implicit e0: GR[Long]): GR[ZoneSuburbJoinsRow] = GR{
    prs => import prs._
    ZoneSuburbJoinsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table zone_suburb_joins. Objects of this class serve as prototypes for rows in queries. */
  class ZoneSuburbJoins(_tableTag: Tag) extends profile.api.Table[ZoneSuburbJoinsRow](_tableTag, Some("rate_card"), "zone_suburb_joins") {
    def * = (id, zone, suburb) <> (ZoneSuburbJoinsRow.tupled, ZoneSuburbJoinsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(zone), Rep.Some(suburb))).shaped.<>({r=>import r._; _1.map(_=> ZoneSuburbJoinsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column zone SqlType(int8) */
    val zone: Rep[Long] = column[Long]("zone")
    /** Database column suburb SqlType(int8) */
    val suburb: Rep[Long] = column[Long]("suburb")

    /** Foreign key referencing Suburbs (database name zone_suburb_joins_suburb_fkey) */
    lazy val suburbsFk = foreignKey("zone_suburb_joins_suburb_fkey", suburb, Suburbs)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Zones (database name zone_suburb_joins_zone_fkey) */
    lazy val zonesFk = foreignKey("zone_suburb_joins_zone_fkey", zone, Zones)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ZoneSuburbJoins */
  lazy val ZoneSuburbJoins = new TableQuery(tag => new ZoneSuburbJoins(tag))
}
