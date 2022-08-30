package models
// AUTO-GENERATED Slick data model for table AvailableTimezones
trait AvailableTimezonesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AvailableTimezones
   *  @param ianaIdentifier Database column iana_identifier SqlType(text), PrimaryKey
   *  @param state Database column state SqlType(text), Default(None) */
  case class AvailableTimezonesRow(ianaIdentifier: String, state: Option[String] = None)
  /** GetResult implicit for fetching AvailableTimezonesRow objects using plain SQL queries */
  implicit def GetResultAvailableTimezonesRow(implicit e0: GR[String], e1: GR[Option[String]]): GR[AvailableTimezonesRow] = GR{
    prs => import prs._
    AvailableTimezonesRow.tupled((<<[String], <<?[String]))
  }
  /** Table description of table available_timezones. Objects of this class serve as prototypes for rows in queries. */
  class AvailableTimezones(_tableTag: Tag) extends profile.api.Table[AvailableTimezonesRow](_tableTag, "available_timezones") {
    def * = (ianaIdentifier, state) <> (AvailableTimezonesRow.tupled, AvailableTimezonesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(ianaIdentifier), state)).shaped.<>({r=>import r._; _1.map(_=> AvailableTimezonesRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column iana_identifier SqlType(text), PrimaryKey */
    val ianaIdentifier: Rep[String] = column[String]("iana_identifier", O.PrimaryKey)
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))

    /** Uniqueness Index over (state) (database name available_timezones_state_key) */
    val index1 = index("available_timezones_state_key", state, unique=true)
  }
  /** Collection-like TableQuery object for table AvailableTimezones */
  lazy val AvailableTimezones = new TableQuery(tag => new AvailableTimezones(tag))
}
