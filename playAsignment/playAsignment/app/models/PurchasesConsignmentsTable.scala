package models
// AUTO-GENERATED Slick data model for table PurchasesConsignments
trait PurchasesConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PurchasesConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param purchaseid Database column purchaseid SqlType(int8)
   *  @param courier Database column courier SqlType(text)
   *  @param bookingReference Database column booking_reference SqlType(text)
   *  @param price Database column price SqlType(float8) */
  case class PurchasesConsignmentsRow(id: Long, purchaseid: Long, courier: String, bookingReference: String, price: Double)
  /** GetResult implicit for fetching PurchasesConsignmentsRow objects using plain SQL queries */
  implicit def GetResultPurchasesConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double]): GR[PurchasesConsignmentsRow] = GR{
    prs => import prs._
    PurchasesConsignmentsRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[Double]))
  }
  /** Table description of table purchases_consignments. Objects of this class serve as prototypes for rows in queries. */
  class PurchasesConsignments(_tableTag: Tag) extends profile.api.Table[PurchasesConsignmentsRow](_tableTag, "purchases_consignments") {
    def * = (id, purchaseid, courier, bookingReference, price) <> (PurchasesConsignmentsRow.tupled, PurchasesConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(purchaseid), Rep.Some(courier), Rep.Some(bookingReference), Rep.Some(price))).shaped.<>({r=>import r._; _1.map(_=> PurchasesConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column purchaseid SqlType(int8) */
    val purchaseid: Rep[Long] = column[Long]("purchaseid")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column booking_reference SqlType(text) */
    val bookingReference: Rep[String] = column[String]("booking_reference")
    /** Database column price SqlType(float8) */
    val price: Rep[Double] = column[Double]("price")

    /** Foreign key referencing Purchases (database name purchases_consignments_purchaseid_fkey) */
    lazy val purchasesFk = foreignKey("purchases_consignments_purchaseid_fkey", purchaseid, Purchases)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PurchasesConsignments */
  lazy val PurchasesConsignments = new TableQuery(tag => new PurchasesConsignments(tag))
}
