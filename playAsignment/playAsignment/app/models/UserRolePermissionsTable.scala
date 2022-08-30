package models
// AUTO-GENERATED Slick data model for table UserRolePermissions
trait UserRolePermissionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UserRolePermissions
   *  @param userRole Database column user_role SqlType(int8)
   *  @param permission Database column permission SqlType(int8) */
  case class UserRolePermissionsRow(userRole: Long, permission: Long)
  /** GetResult implicit for fetching UserRolePermissionsRow objects using plain SQL queries */
  implicit def GetResultUserRolePermissionsRow(implicit e0: GR[Long]): GR[UserRolePermissionsRow] = GR{
    prs => import prs._
    UserRolePermissionsRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table user_role_permissions. Objects of this class serve as prototypes for rows in queries. */
  class UserRolePermissions(_tableTag: Tag) extends profile.api.Table[UserRolePermissionsRow](_tableTag, "user_role_permissions") {
    def * = (userRole, permission) <> (UserRolePermissionsRow.tupled, UserRolePermissionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(userRole), Rep.Some(permission))).shaped.<>({r=>import r._; _1.map(_=> UserRolePermissionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_role SqlType(int8) */
    val userRole: Rep[Long] = column[Long]("user_role")
    /** Database column permission SqlType(int8) */
    val permission: Rep[Long] = column[Long]("permission")

    /** Primary key of UserRolePermissions (database name user_role_permissions_pkey) */
    val pk = primaryKey("user_role_permissions_pkey", (userRole, permission))

    /** Foreign key referencing Permissions (database name user_role_permissions_permission_fkey) */
    lazy val permissionsFk = foreignKey("user_role_permissions_permission_fkey", permission, Permissions)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing UserRoles (database name user_role_permissions_user_role_fkey) */
    lazy val userRolesFk = foreignKey("user_role_permissions_user_role_fkey", userRole, UserRoles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table UserRolePermissions */
  lazy val UserRolePermissions = new TableQuery(tag => new UserRolePermissions(tag))
}
