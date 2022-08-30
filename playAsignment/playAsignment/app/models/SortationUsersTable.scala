package models
// AUTO-GENERATED Slick data model for table SortationUsers
trait SortationUsersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SortationUsers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param password Database column password SqlType(text)
   *  @param enabled Database column enabled SqlType(bool), Default(false)
   *  @param location Database column location SqlType(int8)
   *  @param apikey Database column apikey SqlType(text), Default(None) */
  case class SortationUsersRow(id: Long, name: String, email: String, password: String, enabled: Boolean = false, location: Long, apikey: Option[String] = None)
  /** GetResult implicit for fetching SortationUsersRow objects using plain SQL queries */
  implicit def GetResultSortationUsersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[Option[String]]): GR[SortationUsersRow] = GR{
    prs => import prs._
    SortationUsersRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Boolean], <<[Long], <<?[String]))
  }
  /** Table description of table sortation_users. Objects of this class serve as prototypes for rows in queries. */
  class SortationUsers(_tableTag: Tag) extends profile.api.Table[SortationUsersRow](_tableTag, Some("ecommerce"), "sortation_users") {
    def * = (id, name, email, password, enabled, location, apikey) <> (SortationUsersRow.tupled, SortationUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(email), Rep.Some(password), Rep.Some(enabled), Rep.Some(location), apikey)).shaped.<>({r=>import r._; _1.map(_=> SortationUsersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column password SqlType(text) */
    val password: Rep[String] = column[String]("password")
    /** Database column enabled SqlType(bool), Default(false) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(false))
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column apikey SqlType(text), Default(None) */
    val apikey: Rep[Option[String]] = column[Option[String]]("apikey", O.Default(None))

    /** Foreign key referencing Droplocations (database name users_location_fkey) */
    lazy val droplocationsFk = foreignKey("users_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (email) (database name sortation_users_email_unique) */
    val index1 = index("sortation_users_email_unique", email, unique=true)
  }
  /** Collection-like TableQuery object for table SortationUsers */
  lazy val SortationUsers = new TableQuery(tag => new SortationUsers(tag))
}
