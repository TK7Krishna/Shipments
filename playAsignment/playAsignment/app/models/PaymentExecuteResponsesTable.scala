package models
// AUTO-GENERATED Slick data model for table PaymentExecuteResponses
trait PaymentExecuteResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentExecuteResponses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param request Database column request SqlType(int8)
   *  @param status Database column status SqlType(text)
   *  @param statusDescription Database column status_description SqlType(text) */
  case class PaymentExecuteResponsesRow(id: Long, request: Long, status: String, statusDescription: String)
  /** GetResult implicit for fetching PaymentExecuteResponsesRow objects using plain SQL queries */
  implicit def GetResultPaymentExecuteResponsesRow(implicit e0: GR[Long], e1: GR[String]): GR[PaymentExecuteResponsesRow] = GR{
    prs => import prs._
    PaymentExecuteResponsesRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table payment_execute_responses. Objects of this class serve as prototypes for rows in queries. */
  class PaymentExecuteResponses(_tableTag: Tag) extends profile.api.Table[PaymentExecuteResponsesRow](_tableTag, Some("moneytech"), "payment_execute_responses") {
    def * = (id, request, status, statusDescription) <> (PaymentExecuteResponsesRow.tupled, PaymentExecuteResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(request), Rep.Some(status), Rep.Some(statusDescription))).shaped.<>({r=>import r._; _1.map(_=> PaymentExecuteResponsesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column status SqlType(text) */
    val status: Rep[String] = column[String]("status")
    /** Database column status_description SqlType(text) */
    val statusDescription: Rep[String] = column[String]("status_description")

    /** Foreign key referencing PaymentExecuteRequests (database name payment_execute_responses_request_fkey) */
    lazy val paymentExecuteRequestsFk = foreignKey("payment_execute_responses_request_fkey", request, PaymentExecuteRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentExecuteResponses */
  lazy val PaymentExecuteResponses = new TableQuery(tag => new PaymentExecuteResponses(tag))
}
