package models
// AUTO-GENERATED Slick data model for table Couriers
trait CouriersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Couriers
   *  @param code Database column code SqlType(text), PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param logo Database column logo SqlType(text), Default(None)
   *  @param contactname Database column contactname SqlType(text)
   *  @param contactphone Database column contactphone SqlType(text)
   *  @param active Database column active SqlType(bool), Default(false)
   *  @param courierType Database column courier_type SqlType(int8), Default(0) */
  case class CouriersRow(code: String, name: String, logo: Option[String] = None, contactname: String, contactphone: String, active: Boolean = false, courierType: Long = 0L)
  /** GetResult implicit for fetching CouriersRow objects using plain SQL queries */
  implicit def GetResultCouriersRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Boolean], e3: GR[Long]): GR[CouriersRow] = GR{
    prs => import prs._
    CouriersRow.tupled((<<[String], <<[String], <<?[String], <<[String], <<[String], <<[Boolean], <<[Long]))
  }
  /** Table description of table couriers. Objects of this class serve as prototypes for rows in queries. */
  class Couriers(_tableTag: Tag) extends profile.api.Table[CouriersRow](_tableTag, Some("test"), "couriers") {
    def * = (code, name, logo, contactname, contactphone, active, courierType) <> (CouriersRow.tupled, CouriersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(code), Rep.Some(name), logo, Rep.Some(contactname), Rep.Some(contactphone), Rep.Some(active), Rep.Some(courierType))).shaped.<>({r=>import r._; _1.map(_=> CouriersRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column code SqlType(text), PrimaryKey */
    val code: Rep[String] = column[String]("code", O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column logo SqlType(text), Default(None) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Default(None))
    /** Database column contactname SqlType(text) */
    val contactname: Rep[String] = column[String]("contactname")
    /** Database column contactphone SqlType(text) */
    val contactphone: Rep[String] = column[String]("contactphone")
    /** Database column active SqlType(bool), Default(false) */
    val active: Rep[Boolean] = column[Boolean]("active", O.Default(false))
    /** Database column courier_type SqlType(int8), Default(0) */
    val courierType: Rep[Long] = column[Long]("courier_type", O.Default(0L))
  }
  /** Collection-like TableQuery object for table Couriers */
  lazy val Couriers = new TableQuery(tag => new Couriers(tag))
}
