package models
// AUTO-GENERATED Slick data model for table SubCouriers
trait SubCouriersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SubCouriers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courier Database column courier SqlType(text)
   *  @param businessUnitCode Database column business_unit_code SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param name Database column name SqlType(text) */
  case class SubCouriersRow(id: Long, courier: String, businessUnitCode: Option[String] = None, state: Option[String] = None, name: String)
  /** GetResult implicit for fetching SubCouriersRow objects using plain SQL queries */
  implicit def GetResultSubCouriersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[SubCouriersRow] = GR{
    prs => import prs._
    SubCouriersRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<[String]))
  }
  /** Table description of table sub_couriers. Objects of this class serve as prototypes for rows in queries. */
  class SubCouriers(_tableTag: Tag) extends profile.api.Table[SubCouriersRow](_tableTag, "sub_couriers") {
    def * = (id, courier, businessUnitCode, state, name) <> (SubCouriersRow.tupled, SubCouriersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courier), businessUnitCode, state, Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> SubCouriersRow.tupled((_1.get, _2.get, _3, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column business_unit_code SqlType(text), Default(None) */
    val businessUnitCode: Rep[Option[String]] = column[Option[String]]("business_unit_code", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")

    /** Foreign key referencing Couriers (database name sub_couriers_courier_fkey) */
    lazy val couriersFk = foreignKey("sub_couriers_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SubCouriers */
  lazy val SubCouriers = new TableQuery(tag => new SubCouriers(tag))
}
