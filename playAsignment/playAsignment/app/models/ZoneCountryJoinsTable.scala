package models
// AUTO-GENERATED Slick data model for table ZoneCountryJoins
trait ZoneCountryJoinsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ZoneCountryJoins
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param zone Database column zone SqlType(int8)
   *  @param country Database column country SqlType(text) */
  case class ZoneCountryJoinsRow(id: Long, zone: Long, country: String)
  /** GetResult implicit for fetching ZoneCountryJoinsRow objects using plain SQL queries */
  implicit def GetResultZoneCountryJoinsRow(implicit e0: GR[Long], e1: GR[String]): GR[ZoneCountryJoinsRow] = GR{
    prs => import prs._
    ZoneCountryJoinsRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table zone_country_joins. Objects of this class serve as prototypes for rows in queries. */
  class ZoneCountryJoins(_tableTag: Tag) extends profile.api.Table[ZoneCountryJoinsRow](_tableTag, Some("rate_card"), "zone_country_joins") {
    def * = (id, zone, country) <> (ZoneCountryJoinsRow.tupled, ZoneCountryJoinsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(zone), Rep.Some(country))).shaped.<>({r=>import r._; _1.map(_=> ZoneCountryJoinsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column zone SqlType(int8) */
    val zone: Rep[Long] = column[Long]("zone")
    /** Database column country SqlType(text) */
    val country: Rep[String] = column[String]("country")

    /** Foreign key referencing Countries (database name zone_country_joins_country_fkey) */
    lazy val countriesFk = foreignKey("zone_country_joins_country_fkey", country, Countries)(r => r.countryCode, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Zones (database name zone_country_joins_zone_fkey) */
    lazy val zonesFk = foreignKey("zone_country_joins_zone_fkey", zone, Zones)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ZoneCountryJoins */
  lazy val ZoneCountryJoins = new TableQuery(tag => new ZoneCountryJoins(tag))
}
