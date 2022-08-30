package models
// AUTO-GENERATED Slick data model for table AdminUsers
trait AdminUsersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AdminUsers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param password Database column password SqlType(text)
   *  @param userRole Database column user_role SqlType(int8) */
  case class AdminUsersRow(id: Long, name: String, email: String, password: String, userRole: Long)
  /** GetResult implicit for fetching AdminUsersRow objects using plain SQL queries */
  implicit def GetResultAdminUsersRow(implicit e0: GR[Long], e1: GR[String]): GR[AdminUsersRow] = GR{
    prs => import prs._
    AdminUsersRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table admin_users. Objects of this class serve as prototypes for rows in queries. */
  class AdminUsers(_tableTag: Tag) extends profile.api.Table[AdminUsersRow](_tableTag, "admin_users") {
    def * = (id, name, email, password, userRole) <> (AdminUsersRow.tupled, AdminUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(email), Rep.Some(password), Rep.Some(userRole))).shaped.<>({r=>import r._; _1.map(_=> AdminUsersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column password SqlType(text) */
    val password: Rep[String] = column[String]("password")
    /** Database column user_role SqlType(int8) */
    val userRole: Rep[Long] = column[Long]("user_role")

    /** Foreign key referencing UserRoles (database name admin_users_user_role_fkey) */
    lazy val userRolesFk = foreignKey("admin_users_user_role_fkey", userRole, UserRoles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AdminUsers */
  lazy val AdminUsers = new TableQuery(tag => new AdminUsers(tag))
}
