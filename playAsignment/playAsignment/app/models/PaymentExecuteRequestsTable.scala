package models
// AUTO-GENERATED Slick data model for table PaymentExecuteRequests
trait PaymentExecuteRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentExecuteRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payment Database column payment SqlType(int8)
   *  @param request Database column request SqlType(int8) */
  case class PaymentExecuteRequestsRow(id: Long, payment: Long, request: Long)
  /** GetResult implicit for fetching PaymentExecuteRequestsRow objects using plain SQL queries */
  implicit def GetResultPaymentExecuteRequestsRow(implicit e0: GR[Long]): GR[PaymentExecuteRequestsRow] = GR{
    prs => import prs._
    PaymentExecuteRequestsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table payment_execute_requests. Objects of this class serve as prototypes for rows in queries. */
  class PaymentExecuteRequests(_tableTag: Tag) extends profile.api.Table[PaymentExecuteRequestsRow](_tableTag, Some("moneytech"), "payment_execute_requests") {
    def * = (id, payment, request) <> (PaymentExecuteRequestsRow.tupled, PaymentExecuteRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payment), Rep.Some(request))).shaped.<>({r=>import r._; _1.map(_=> PaymentExecuteRequestsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")

    /** Foreign key referencing Payments (database name payment_execute_requests_payment_fkey) */
    lazy val paymentsFk = foreignKey("payment_execute_requests_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Requests (database name payment_execute_requests_request_fkey) */
    lazy val requestsFk = foreignKey("payment_execute_requests_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentExecuteRequests */
  lazy val PaymentExecuteRequests = new TableQuery(tag => new PaymentExecuteRequests(tag))
}
