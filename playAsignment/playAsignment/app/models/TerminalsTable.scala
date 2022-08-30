package models
// AUTO-GENERATED Slick data model for table Terminals
trait TerminalsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Terminals
   *  @param id Database column id SqlType(int8), PrimaryKey
   *  @param username Database column username SqlType(text)
   *  @param password Database column password SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class TerminalsRow(id: Long, username: String, password: String, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching TerminalsRow objects using plain SQL queries */
  implicit def GetResultTerminalsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TerminalsRow] = GR{
    prs => import prs._
    TerminalsRow.tupled((<<[Long], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table terminals. Objects of this class serve as prototypes for rows in queries. */
  class Terminals(_tableTag: Tag) extends profile.api.Table[TerminalsRow](_tableTag, Some("sevenelevenkiosk_outbound"), "terminals") {
    def * = (id, username, password, createdAt, modifiedAt) <> (TerminalsRow.tupled, TerminalsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(username), Rep.Some(password), Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> TerminalsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int8), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column username SqlType(text) */
    val username: Rep[String] = column[String]("username")
    /** Database column password SqlType(text) */
    val password: Rep[String] = column[String]("password")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")

    /** Uniqueness Index over (username) (database name terminal_username_unique) */
    val index1 = index("terminal_username_unique", username, unique=true)
  }
  /** Collection-like TableQuery object for table Terminals */
  lazy val Terminals = new TableQuery(tag => new Terminals(tag))
}
