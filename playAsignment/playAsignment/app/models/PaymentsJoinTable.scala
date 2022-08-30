package models
// AUTO-GENERATED Slick data model for table PaymentsJoin
trait PaymentsJoinTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentsJoin
   *  @param consignment Database column consignment SqlType(int8)
   *  @param payment Database column payment SqlType(int8) */
  case class PaymentsJoinRow(consignment: Long, payment: Long)
  /** GetResult implicit for fetching PaymentsJoinRow objects using plain SQL queries */
  implicit def GetResultPaymentsJoinRow(implicit e0: GR[Long]): GR[PaymentsJoinRow] = GR{
    prs => import prs._
    PaymentsJoinRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table payments_join. Objects of this class serve as prototypes for rows in queries. */
  class PaymentsJoin(_tableTag: Tag) extends profile.api.Table[PaymentsJoinRow](_tableTag, Some("consumer"), "payments_join") {
    def * = (consignment, payment) <> (PaymentsJoinRow.tupled, PaymentsJoinRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(consignment), Rep.Some(payment))).shaped.<>({r=>import r._; _1.map(_=> PaymentsJoinRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")

    /** Primary key of PaymentsJoin (database name payments_join_pkey) */
    val pk = primaryKey("payments_join_pkey", (consignment, payment))

    /** Foreign key referencing Consignments (database name payments_join_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("payments_join_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Payments (database name payments_join_payment_fkey) */
    lazy val paymentsFk = foreignKey("payments_join_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentsJoin */
  lazy val PaymentsJoin = new TableQuery(tag => new PaymentsJoin(tag))
}
