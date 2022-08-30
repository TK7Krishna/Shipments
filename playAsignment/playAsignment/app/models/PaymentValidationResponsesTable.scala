package models
// AUTO-GENERATED Slick data model for table PaymentValidationResponses
trait PaymentValidationResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentValidationResponses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param validation Database column validation SqlType(int8)
   *  @param status Database column status SqlType(text)
   *  @param statusDescription Database column status_description SqlType(text) */
  case class PaymentValidationResponsesRow(id: Long, validation: Long, status: String, statusDescription: String)
  /** GetResult implicit for fetching PaymentValidationResponsesRow objects using plain SQL queries */
  implicit def GetResultPaymentValidationResponsesRow(implicit e0: GR[Long], e1: GR[String]): GR[PaymentValidationResponsesRow] = GR{
    prs => import prs._
    PaymentValidationResponsesRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table payment_validation_responses. Objects of this class serve as prototypes for rows in queries. */
  class PaymentValidationResponses(_tableTag: Tag) extends profile.api.Table[PaymentValidationResponsesRow](_tableTag, Some("moneytech"), "payment_validation_responses") {
    def * = (id, validation, status, statusDescription) <> (PaymentValidationResponsesRow.tupled, PaymentValidationResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(validation), Rep.Some(status), Rep.Some(statusDescription))).shaped.<>({r=>import r._; _1.map(_=> PaymentValidationResponsesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column validation SqlType(int8) */
    val validation: Rep[Long] = column[Long]("validation")
    /** Database column status SqlType(text) */
    val status: Rep[String] = column[String]("status")
    /** Database column status_description SqlType(text) */
    val statusDescription: Rep[String] = column[String]("status_description")

    /** Foreign key referencing PaymentValidationRequests (database name payment_validation_responses_validation_fkey) */
    lazy val paymentValidationRequestsFk = foreignKey("payment_validation_responses_validation_fkey", validation, PaymentValidationRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentValidationResponses */
  lazy val PaymentValidationResponses = new TableQuery(tag => new PaymentValidationResponses(tag))
}
