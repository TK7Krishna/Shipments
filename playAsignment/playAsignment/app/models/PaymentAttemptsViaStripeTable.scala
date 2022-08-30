package models
// AUTO-GENERATED Slick data model for table PaymentAttemptsViaStripe
trait PaymentAttemptsViaStripeTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentAttemptsViaStripe
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payment Database column payment SqlType(int8)
   *  @param stripeCharge Database column stripe_charge SqlType(int8)
   *  @param inProgress Database column in_progress SqlType(bool) */
  case class PaymentAttemptsViaStripeRow(id: Long, payment: Long, stripeCharge: Long, inProgress: Boolean)
  /** GetResult implicit for fetching PaymentAttemptsViaStripeRow objects using plain SQL queries */
  implicit def GetResultPaymentAttemptsViaStripeRow(implicit e0: GR[Long], e1: GR[Boolean]): GR[PaymentAttemptsViaStripeRow] = GR{
    prs => import prs._
    PaymentAttemptsViaStripeRow.tupled((<<[Long], <<[Long], <<[Long], <<[Boolean]))
  }
  /** Table description of table payment_attempts_via_stripe. Objects of this class serve as prototypes for rows in queries. */
  class PaymentAttemptsViaStripe(_tableTag: Tag) extends profile.api.Table[PaymentAttemptsViaStripeRow](_tableTag, Some("consumer"), "payment_attempts_via_stripe") {
    def * = (id, payment, stripeCharge, inProgress) <> (PaymentAttemptsViaStripeRow.tupled, PaymentAttemptsViaStripeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payment), Rep.Some(stripeCharge), Rep.Some(inProgress))).shaped.<>({r=>import r._; _1.map(_=> PaymentAttemptsViaStripeRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column stripe_charge SqlType(int8) */
    val stripeCharge: Rep[Long] = column[Long]("stripe_charge")
    /** Database column in_progress SqlType(bool) */
    val inProgress: Rep[Boolean] = column[Boolean]("in_progress")

    /** Foreign key referencing Charges (database name payment_attempts_via_stripe_stripe_charge_fkey) */
    lazy val chargesFk = foreignKey("payment_attempts_via_stripe_stripe_charge_fkey", stripeCharge, Charges)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Payments (database name payment_attempts_via_stripe_payment_fkey) */
    lazy val paymentsFk = foreignKey("payment_attempts_via_stripe_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentAttemptsViaStripe */
  lazy val PaymentAttemptsViaStripe = new TableQuery(tag => new PaymentAttemptsViaStripe(tag))
}
