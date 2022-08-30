package models
// AUTO-GENERATED Slick data model for table CourierConfig
trait CourierConfigTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierConfig
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courier Database column courier SqlType(text)
   *  @param actions Database column actions SqlType(_text), Length(2147483647,false), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamp) */
  case class CourierConfigRow(id: Long, courier: String, actions: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CourierConfigRow objects using plain SQL queries */
  implicit def GetResultCourierConfigRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[CourierConfigRow] = GR{
    prs => import prs._
    CourierConfigRow.tupled((<<[Long], <<[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table courier_config. Objects of this class serve as prototypes for rows in queries. */
  class CourierConfig(_tableTag: Tag) extends profile.api.Table[CourierConfigRow](_tableTag, Some("external_online"), "courier_config") {
    def * = (id, courier, actions, createdAt) <> (CourierConfigRow.tupled, CourierConfigRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courier), actions, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> CourierConfigRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column actions SqlType(_text), Length(2147483647,false), Default(None) */
    val actions: Rep[Option[String]] = column[Option[String]]("actions", O.Length(2147483647,varying=false), O.Default(None))
    /** Database column created_at SqlType(timestamp) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Couriers (database name courier_config_courier_fkey) */
    lazy val couriersFk = foreignKey("courier_config_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierConfig */
  lazy val CourierConfig = new TableQuery(tag => new CourierConfig(tag))
}
