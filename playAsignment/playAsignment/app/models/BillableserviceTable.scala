package models
// AUTO-GENERATED Slick data model for table Billableservice
trait BillableserviceTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Billableservice
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text), Default(None) */
  case class BillableserviceRow(id: Long, name: Option[String] = None)
  /** GetResult implicit for fetching BillableserviceRow objects using plain SQL queries */
  implicit def GetResultBillableserviceRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[BillableserviceRow] = GR{
    prs => import prs._
    BillableserviceRow.tupled((<<[Long], <<?[String]))
  }
  /** Table description of table billableservice. Objects of this class serve as prototypes for rows in queries. */
  class Billableservice(_tableTag: Tag) extends profile.api.Table[BillableserviceRow](_tableTag, Some("ecommerce"), "billableservice") {
    def * = (id, name) <> (BillableserviceRow.tupled, BillableserviceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name)).shaped.<>({r=>import r._; _1.map(_=> BillableserviceRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
  }
  /** Collection-like TableQuery object for table Billableservice */
  lazy val Billableservice = new TableQuery(tag => new Billableservice(tag))
}
