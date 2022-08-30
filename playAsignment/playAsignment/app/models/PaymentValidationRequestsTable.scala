package models
// AUTO-GENERATED Slick data model for table PaymentValidationRequests
trait PaymentValidationRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentValidationRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payment Database column payment SqlType(int8)
   *  @param request Database column request SqlType(int8) */
  case class PaymentValidationRequestsRow(id: Long, payment: Long, request: Long)
  /** GetResult implicit for fetching PaymentValidationRequestsRow objects using plain SQL queries */
  implicit def GetResultPaymentValidationRequestsRow(implicit e0: GR[Long]): GR[PaymentValidationRequestsRow] = GR{
    prs => import prs._
    PaymentValidationRequestsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table payment_validation_requests. Objects of this class serve as prototypes for rows in queries. */
  class PaymentValidationRequests(_tableTag: Tag) extends profile.api.Table[PaymentValidationRequestsRow](_tableTag, Some("moneytech"), "payment_validation_requests") {
    def * = (id, payment, request) <> (PaymentValidationRequestsRow.tupled, PaymentValidationRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payment), Rep.Some(request))).shaped.<>({r=>import r._; _1.map(_=> PaymentValidationRequestsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")

    /** Foreign key referencing Payments (database name payment_validation_requests_payment_fkey) */
    lazy val paymentsFk = foreignKey("payment_validation_requests_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Requests (database name payment_validation_requests_request_fkey) */
    lazy val requestsFk = foreignKey("payment_validation_requests_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentValidationRequests */
  lazy val PaymentValidationRequests = new TableQuery(tag => new PaymentValidationRequests(tag))
}
