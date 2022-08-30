package models
// AUTO-GENERATED Slick data model for table CourierUsers
trait CourierUsersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierUsers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param email Database column email SqlType(text)
   *  @param password Database column password SqlType(text)
   *  @param courierCode Database column courier_code SqlType(text) */
  case class CourierUsersRow(id: Long, email: String, password: String, courierCode: String)
  /** GetResult implicit for fetching CourierUsersRow objects using plain SQL queries */
  implicit def GetResultCourierUsersRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierUsersRow] = GR{
    prs => import prs._
    CourierUsersRow.tupled((<<[Long], <<[String], <<[String], <<[String]))
  }
  /** Table description of table courier_users. Objects of this class serve as prototypes for rows in queries. */
  class CourierUsers(_tableTag: Tag) extends profile.api.Table[CourierUsersRow](_tableTag, "courier_users") {
    def * = (id, email, password, courierCode) <> (CourierUsersRow.tupled, CourierUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(email), Rep.Some(password), Rep.Some(courierCode))).shaped.<>({r=>import r._; _1.map(_=> CourierUsersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column password SqlType(text) */
    val password: Rep[String] = column[String]("password")
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")

    /** Foreign key referencing Couriers (database name courier_users_courier_code_fkey) */
    lazy val couriersFk = foreignKey("courier_users_courier_code_fkey", courierCode, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierUsers */
  lazy val CourierUsers = new TableQuery(tag => new CourierUsers(tag))
}
