package models
// AUTO-GENERATED Slick data model for table Permissions
trait PermissionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Permissions
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param description Database column description SqlType(text) */
  case class PermissionsRow(id: Long, name: String, description: String)
  /** GetResult implicit for fetching PermissionsRow objects using plain SQL queries */
  implicit def GetResultPermissionsRow(implicit e0: GR[Long], e1: GR[String]): GR[PermissionsRow] = GR{
    prs => import prs._
    PermissionsRow.tupled((<<[Long], <<[String], <<[String]))
  }
  /** Table description of table permissions. Objects of this class serve as prototypes for rows in queries. */
  class Permissions(_tableTag: Tag) extends profile.api.Table[PermissionsRow](_tableTag, "permissions") {
    def * = (id, name, description) <> (PermissionsRow.tupled, PermissionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(description))).shaped.<>({r=>import r._; _1.map(_=> PermissionsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
  }
  /** Collection-like TableQuery object for table Permissions */
  lazy val Permissions = new TableQuery(tag => new Permissions(tag))
}
