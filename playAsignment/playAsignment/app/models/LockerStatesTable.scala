package models
// AUTO-GENERATED Slick data model for table LockerStates
trait LockerStatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LockerStates
   *  @param state Database column state SqlType(text), PrimaryKey */
  case class LockerStatesRow(state: String)
  /** GetResult implicit for fetching LockerStatesRow objects using plain SQL queries */
  implicit def GetResultLockerStatesRow(implicit e0: GR[String]): GR[LockerStatesRow] = GR{
    prs => import prs._
    LockerStatesRow(<<[String])
  }
  /** Table description of table locker_states. Objects of this class serve as prototypes for rows in queries. */
  class LockerStates(_tableTag: Tag) extends profile.api.Table[LockerStatesRow](_tableTag, Some("locker"), "locker_states") {
    def * = state <> (LockerStatesRow, LockerStatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(state)).shaped.<>(r => r.map(_=> LockerStatesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column state SqlType(text), PrimaryKey */
    val state: Rep[String] = column[String]("state", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table LockerStates */
  lazy val LockerStates = new TableQuery(tag => new LockerStates(tag))
}
