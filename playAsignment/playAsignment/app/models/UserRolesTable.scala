package models
// AUTO-GENERATED Slick data model for table UserRoles
trait UserRolesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UserRoles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param description Database column description SqlType(text) */
  case class UserRolesRow(id: Long, name: String, description: String)
  /** GetResult implicit for fetching UserRolesRow objects using plain SQL queries */
  implicit def GetResultUserRolesRow(implicit e0: GR[Long], e1: GR[String]): GR[UserRolesRow] = GR{
    prs => import prs._
    UserRolesRow.tupled((<<[Long], <<[String], <<[String]))
  }
  /** Table description of table user_roles. Objects of this class serve as prototypes for rows in queries. */
  class UserRoles(_tableTag: Tag) extends profile.api.Table[UserRolesRow](_tableTag, "user_roles") {
    def * = (id, name, description) <> (UserRolesRow.tupled, UserRolesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(description))).shaped.<>({r=>import r._; _1.map(_=> UserRolesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
  }
  /** Collection-like TableQuery object for table UserRoles */
  lazy val UserRoles = new TableQuery(tag => new UserRoles(tag))
}
