package models
// AUTO-GENERATED Slick data model for table StateTimezones
trait StateTimezonesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StateTimezones
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param countryAbbr Database column country_abbr SqlType(text)
   *  @param country Database column country SqlType(text)
   *  @param stateAbbr Database column state_abbr SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param timezone Database column timezone SqlType(text)
   *  @param offset Database column offset SqlType(text)
   *  @param active Database column active SqlType(bool)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class StateTimezonesRow(id: Long, countryAbbr: String, country: String, stateAbbr: String, state: String, timezone: String, offset: String, active: Boolean, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching StateTimezonesRow objects using plain SQL queries */
  implicit def GetResultStateTimezonesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[java.sql.Timestamp]): GR[StateTimezonesRow] = GR{
    prs => import prs._
    StateTimezonesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table state_timezones. Objects of this class serve as prototypes for rows in queries. */
  class StateTimezones(_tableTag: Tag) extends profile.api.Table[StateTimezonesRow](_tableTag, Some("standard_apis"), "state_timezones") {
    def * = (id, countryAbbr, country, stateAbbr, state, timezone, offset, active, createdAt, modifiedAt) <> (StateTimezonesRow.tupled, StateTimezonesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(countryAbbr), Rep.Some(country), Rep.Some(stateAbbr), Rep.Some(state), Rep.Some(timezone), Rep.Some(offset), Rep.Some(active), Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> StateTimezonesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column country_abbr SqlType(text) */
    val countryAbbr: Rep[String] = column[String]("country_abbr")
    /** Database column country SqlType(text) */
    val country: Rep[String] = column[String]("country")
    /** Database column state_abbr SqlType(text) */
    val stateAbbr: Rep[String] = column[String]("state_abbr")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column timezone SqlType(text) */
    val timezone: Rep[String] = column[String]("timezone")
    /** Database column offset SqlType(text) */
    val offset: Rep[String] = column[String]("offset")
    /** Database column active SqlType(bool) */
    val active: Rep[Boolean] = column[Boolean]("active")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table StateTimezones */
  lazy val StateTimezones = new TableQuery(tag => new StateTimezones(tag))
}
