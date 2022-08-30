package models
// AUTO-GENERATED Slick data model for table CourierspleaseReturns
trait CourierspleaseReturnsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseReturns
   *  @param returnId Database column return_id SqlType(int8), PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param originalConsignment Database column original_consignment SqlType(text)
   *  @param returnConsignment Database column return_consignment SqlType(text) */
  case class CourierspleaseReturnsRow(returnId: Long, consignment: Long, originalConsignment: String, returnConsignment: String)
  /** GetResult implicit for fetching CourierspleaseReturnsRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseReturnsRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierspleaseReturnsRow] = GR{
    prs => import prs._
    CourierspleaseReturnsRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table couriersplease_returns. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleaseReturns(_tableTag: Tag) extends profile.api.Table[CourierspleaseReturnsRow](_tableTag, "couriersplease_returns") {
    def * = (returnId, consignment, originalConsignment, returnConsignment) <> (CourierspleaseReturnsRow.tupled, CourierspleaseReturnsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(returnId), Rep.Some(consignment), Rep.Some(originalConsignment), Rep.Some(returnConsignment))).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseReturnsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column return_id SqlType(int8), PrimaryKey */
    val returnId: Rep[Long] = column[Long]("return_id", O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column original_consignment SqlType(text) */
    val originalConsignment: Rep[String] = column[String]("original_consignment")
    /** Database column return_consignment SqlType(text) */
    val returnConsignment: Rep[String] = column[String]("return_consignment")

    /** Foreign key referencing CourierReturns (database name couriersplease_returns_return_id_fkey) */
    lazy val courierReturnsFk = foreignKey("couriersplease_returns_return_id_fkey", returnId, CourierReturns)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CourierspleaseConsignments (database name couriersplease_returns_consignment_fkey) */
    lazy val courierspleaseConsignmentsFk = foreignKey("couriersplease_returns_consignment_fkey", consignment, CourierspleaseConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierspleaseReturns */
  lazy val CourierspleaseReturns = new TableQuery(tag => new CourierspleaseReturns(tag))
}
