package models
// AUTO-GENERATED Slick data model for table HubbedUsers
trait HubbedUsersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HubbedUsers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param roleId Database column role_id SqlType(int4), Default(None)
   *  @param username Database column username SqlType(text), Default(None)
   *  @param firstname Database column firstname SqlType(text), Default(None)
   *  @param lastname Database column lastname SqlType(text), Default(None)
   *  @param email Database column email SqlType(text), Default(None)
   *  @param password Database column password SqlType(text), Default(None)
   *  @param activationKey Database column activation_key SqlType(text), Default(None)
   *  @param emailVerified Database column email_verified SqlType(bool), Default(Some(false))
   *  @param ip Database column ip SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param lastLoggedinAt Database column last_loggedin_at SqlType(timestamp), Default(None)
   *  @param parentId Database column parent_id SqlType(int4), Default(None)
   *  @param active Database column active SqlType(bool), Default(Some(true))
   *  @param activationkeyGeneratedAt Database column activationkey_generated_at SqlType(timestamp), Default(None)
   *  @param apikey Database column apikey SqlType(text), Default(None)
   *  @param couriercode Database column couriercode SqlType(text), Default(None)
   *  @param timezoneId Database column timezone_id SqlType(int8), Default(None)
   *  @param isDeleted Database column is_deleted SqlType(bool), Default(Some(false))
   *  @param paymentAccountTypeId Database column payment_account_type_id SqlType(int4), Default(None) */
  case class HubbedUsersRow(id: Long, roleId: Option[Int] = None, username: Option[String] = None, firstname: Option[String] = None, lastname: Option[String] = None, email: Option[String] = None, password: Option[String] = None, activationKey: Option[String] = None, emailVerified: Option[Boolean] = Some(false), ip: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, lastLoggedinAt: Option[java.sql.Timestamp] = None, parentId: Option[Int] = None, active: Option[Boolean] = Some(true), activationkeyGeneratedAt: Option[java.sql.Timestamp] = None, apikey: Option[String] = None, couriercode: Option[String] = None, timezoneId: Option[Long] = None, isDeleted: Option[Boolean] = Some(false), paymentAccountTypeId: Option[Int] = None)
  /** GetResult implicit for fetching HubbedUsersRow objects using plain SQL queries */
  implicit def GetResultHubbedUsersRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[Long]]): GR[HubbedUsersRow] = GR{
    prs => import prs._
    HubbedUsersRow.tupled((<<[Long], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int], <<?[Boolean], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[Long], <<?[Boolean], <<?[Int]))
  }
  /** Table description of table hubbed_users. Objects of this class serve as prototypes for rows in queries. */
  class HubbedUsers(_tableTag: Tag) extends profile.api.Table[HubbedUsersRow](_tableTag, Some("test"), "hubbed_users") {
    def * = (id, roleId, username, firstname, lastname, email, password, activationKey, emailVerified, ip, createdAt, modifiedAt, lastLoggedinAt, parentId, active, activationkeyGeneratedAt, apikey, couriercode, timezoneId, isDeleted, paymentAccountTypeId) <> (HubbedUsersRow.tupled, HubbedUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), roleId, username, firstname, lastname, email, password, activationKey, emailVerified, ip, Rep.Some(createdAt), Rep.Some(modifiedAt), lastLoggedinAt, parentId, active, activationkeyGeneratedAt, apikey, couriercode, timezoneId, isDeleted, paymentAccountTypeId)).shaped.<>({r=>import r._; _1.map(_=> HubbedUsersRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11.get, _12.get, _13, _14, _15, _16, _17, _18, _19, _20, _21)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column role_id SqlType(int4), Default(None) */
    val roleId: Rep[Option[Int]] = column[Option[Int]]("role_id", O.Default(None))
    /** Database column username SqlType(text), Default(None) */
    val username: Rep[Option[String]] = column[Option[String]]("username", O.Default(None))
    /** Database column firstname SqlType(text), Default(None) */
    val firstname: Rep[Option[String]] = column[Option[String]]("firstname", O.Default(None))
    /** Database column lastname SqlType(text), Default(None) */
    val lastname: Rep[Option[String]] = column[Option[String]]("lastname", O.Default(None))
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))
    /** Database column password SqlType(text), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Default(None))
    /** Database column activation_key SqlType(text), Default(None) */
    val activationKey: Rep[Option[String]] = column[Option[String]]("activation_key", O.Default(None))
    /** Database column email_verified SqlType(bool), Default(Some(false)) */
    val emailVerified: Rep[Option[Boolean]] = column[Option[Boolean]]("email_verified", O.Default(Some(false)))
    /** Database column ip SqlType(text), Default(None) */
    val ip: Rep[Option[String]] = column[Option[String]]("ip", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column last_loggedin_at SqlType(timestamp), Default(None) */
    val lastLoggedinAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_loggedin_at", O.Default(None))
    /** Database column parent_id SqlType(int4), Default(None) */
    val parentId: Rep[Option[Int]] = column[Option[Int]]("parent_id", O.Default(None))
    /** Database column active SqlType(bool), Default(Some(true)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(true)))
    /** Database column activationkey_generated_at SqlType(timestamp), Default(None) */
    val activationkeyGeneratedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("activationkey_generated_at", O.Default(None))
    /** Database column apikey SqlType(text), Default(None) */
    val apikey: Rep[Option[String]] = column[Option[String]]("apikey", O.Default(None))
    /** Database column couriercode SqlType(text), Default(None) */
    val couriercode: Rep[Option[String]] = column[Option[String]]("couriercode", O.Default(None))
    /** Database column timezone_id SqlType(int8), Default(None) */
    val timezoneId: Rep[Option[Long]] = column[Option[Long]]("timezone_id", O.Default(None))
    /** Database column is_deleted SqlType(bool), Default(Some(false)) */
    val isDeleted: Rep[Option[Boolean]] = column[Option[Boolean]]("is_deleted", O.Default(Some(false)))
    /** Database column payment_account_type_id SqlType(int4), Default(None) */
    val paymentAccountTypeId: Rep[Option[Int]] = column[Option[Int]]("payment_account_type_id", O.Default(None))

    /** Foreign key referencing HubbedRoles (database name role_id_fk) */
    lazy val hubbedRolesFk = foreignKey("role_id_fk", roleId, HubbedRoles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Cascade)
    /** Foreign key referencing TimeZones (database name timezone_id_fk) */
    lazy val timeZonesFk = foreignKey("timezone_id_fk", timezoneId, TimeZones)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table HubbedUsers */
  lazy val HubbedUsers = new TableQuery(tag => new HubbedUsers(tag))
}
