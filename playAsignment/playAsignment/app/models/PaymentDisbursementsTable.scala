package models
// AUTO-GENERATED Slick data model for table PaymentDisbursements
trait PaymentDisbursementsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentDisbursements
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payment Database column payment SqlType(int8)
   *  @param disbursementType Database column disbursement_type SqlType(text) */
  case class PaymentDisbursementsRow(id: Long, payment: Long, disbursementType: String)
  /** GetResult implicit for fetching PaymentDisbursementsRow objects using plain SQL queries */
  implicit def GetResultPaymentDisbursementsRow(implicit e0: GR[Long], e1: GR[String]): GR[PaymentDisbursementsRow] = GR{
    prs => import prs._
    PaymentDisbursementsRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table payment_disbursements. Objects of this class serve as prototypes for rows in queries. */
  class PaymentDisbursements(_tableTag: Tag) extends profile.api.Table[PaymentDisbursementsRow](_tableTag, Some("moneytech"), "payment_disbursements") {
    def * = (id, payment, disbursementType) <> (PaymentDisbursementsRow.tupled, PaymentDisbursementsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payment), Rep.Some(disbursementType))).shaped.<>({r=>import r._; _1.map(_=> PaymentDisbursementsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column disbursement_type SqlType(text) */
    val disbursementType: Rep[String] = column[String]("disbursement_type")

    /** Foreign key referencing PaymentDisbursementTypes (database name payment_disbursements_disbursement_type_fkey) */
    lazy val paymentDisbursementTypesFk = foreignKey("payment_disbursements_disbursement_type_fkey", disbursementType, PaymentDisbursementTypes)(r => r.name, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Payments (database name payment_disbursements_payment_fkey) */
    lazy val paymentsFk = foreignKey("payment_disbursements_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentDisbursements */
  lazy val PaymentDisbursements = new TableQuery(tag => new PaymentDisbursements(tag))
}
