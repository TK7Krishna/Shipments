package models
// AUTO-GENERATED Slick data model for table TimeZones
trait TimeZonesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TimeZones
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param timezone Database column timezone SqlType(text)
   *  @param displayName Database column display_name SqlType(text)
   *  @param standardOffset Database column standard_offset SqlType(text), Default(None)
   *  @param daylightsavingOffset Database column daylightsaving_offset SqlType(text), Default(None) */
  case class TimeZonesRow(id: Long, timezone: String, displayName: String, standardOffset: Option[String] = None, daylightsavingOffset: Option[String] = None)
  /** GetResult implicit for fetching TimeZonesRow objects using plain SQL queries */
  implicit def GetResultTimeZonesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[TimeZonesRow] = GR{
    prs => import prs._
    TimeZonesRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String]))
  }
  /** Table description of table time_zones. Objects of this class serve as prototypes for rows in queries. */
  class TimeZones(_tableTag: Tag) extends profile.api.Table[TimeZonesRow](_tableTag, "time_zones") {
    def * = (id, timezone, displayName, standardOffset, daylightsavingOffset) <> (TimeZonesRow.tupled, TimeZonesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(timezone), Rep.Some(displayName), standardOffset, daylightsavingOffset)).shaped.<>({r=>import r._; _1.map(_=> TimeZonesRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column timezone SqlType(text) */
    val timezone: Rep[String] = column[String]("timezone")
    /** Database column display_name SqlType(text) */
    val displayName: Rep[String] = column[String]("display_name")
    /** Database column standard_offset SqlType(text), Default(None) */
    val standardOffset: Rep[Option[String]] = column[Option[String]]("standard_offset", O.Default(None))
    /** Database column daylightsaving_offset SqlType(text), Default(None) */
    val daylightsavingOffset: Rep[Option[String]] = column[Option[String]]("daylightsaving_offset", O.Default(None))
  }
  /** Collection-like TableQuery object for table TimeZones */
  lazy val TimeZones = new TableQuery(tag => new TimeZones(tag))
}
