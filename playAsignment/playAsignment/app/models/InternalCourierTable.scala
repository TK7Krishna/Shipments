package models
// AUTO-GENERATED Slick data model for table InternalCourier
trait InternalCourierTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternalCourier
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param couriercode Database column couriercode SqlType(text)
   *  @param hubbedUsersId Database column hubbed_users_id SqlType(int8) */
  case class InternalCourierRow(id: Long, couriercode: String, hubbedUsersId: Long)
  /** GetResult implicit for fetching InternalCourierRow objects using plain SQL queries */
  implicit def GetResultInternalCourierRow(implicit e0: GR[Long], e1: GR[String]): GR[InternalCourierRow] = GR{
    prs => import prs._
    InternalCourierRow.tupled((<<[Long], <<[String], <<[Long]))
  }
  /** Table description of table internal_courier. Objects of this class serve as prototypes for rows in queries. */
  class InternalCourier(_tableTag: Tag) extends profile.api.Table[InternalCourierRow](_tableTag, "internal_courier") {
    def * = (id, couriercode, hubbedUsersId) <> (InternalCourierRow.tupled, InternalCourierRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(couriercode), Rep.Some(hubbedUsersId))).shaped.<>({r=>import r._; _1.map(_=> InternalCourierRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column couriercode SqlType(text) */
    val couriercode: Rep[String] = column[String]("couriercode")
    /** Database column hubbed_users_id SqlType(int8) */
    val hubbedUsersId: Rep[Long] = column[Long]("hubbed_users_id")

    /** Foreign key referencing Couriers (database name public_couriers_internal_courier_couriercode_fkey) */
    lazy val couriersFk = foreignKey("public_couriers_internal_courier_couriercode_fkey", couriercode, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name public_couriers_internal_courier_hubbed_users_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("public_couriers_internal_courier_hubbed_users_id_fkey", hubbedUsersId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternalCourier */
  lazy val InternalCourier = new TableQuery(tag => new InternalCourier(tag))
}
