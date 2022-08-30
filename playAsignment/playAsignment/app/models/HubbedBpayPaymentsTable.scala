package models
// AUTO-GENERATED Slick data model for table HubbedBpayPayments
trait HubbedBpayPaymentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HubbedBpayPayments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param maccount Database column maccount SqlType(text)
   *  @param mwalletAccountNumber Database column mwallet_account_number SqlType(text)
   *  @param mwalletAccountName Database column mwallet_account_name SqlType(text)
   *  @param mwalletAccountEmail Database column mwallet_account_email SqlType(text)
   *  @param mwalletAccountPhone Database column mwallet_account_phone SqlType(text)
   *  @param payment Database column payment SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class HubbedBpayPaymentsRow(id: Long, location: Long, maccount: String, mwalletAccountNumber: String, mwalletAccountName: String, mwalletAccountEmail: String, mwalletAccountPhone: String, payment: Long, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching HubbedBpayPaymentsRow objects using plain SQL queries */
  implicit def GetResultHubbedBpayPaymentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[HubbedBpayPaymentsRow] = GR{
    prs => import prs._
    HubbedBpayPaymentsRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table hubbed_bpay_payments. Objects of this class serve as prototypes for rows in queries. */
  class HubbedBpayPayments(_tableTag: Tag) extends profile.api.Table[HubbedBpayPaymentsRow](_tableTag, "hubbed_bpay_payments") {
    def * = (id, location, maccount, mwalletAccountNumber, mwalletAccountName, mwalletAccountEmail, mwalletAccountPhone, payment, createdAt) <> (HubbedBpayPaymentsRow.tupled, HubbedBpayPaymentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(maccount), Rep.Some(mwalletAccountNumber), Rep.Some(mwalletAccountName), Rep.Some(mwalletAccountEmail), Rep.Some(mwalletAccountPhone), Rep.Some(payment), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> HubbedBpayPaymentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column maccount SqlType(text) */
    val maccount: Rep[String] = column[String]("maccount")
    /** Database column mwallet_account_number SqlType(text) */
    val mwalletAccountNumber: Rep[String] = column[String]("mwallet_account_number")
    /** Database column mwallet_account_name SqlType(text) */
    val mwalletAccountName: Rep[String] = column[String]("mwallet_account_name")
    /** Database column mwallet_account_email SqlType(text) */
    val mwalletAccountEmail: Rep[String] = column[String]("mwallet_account_email")
    /** Database column mwallet_account_phone SqlType(text) */
    val mwalletAccountPhone: Rep[String] = column[String]("mwallet_account_phone")
    /** Database column payment SqlType(int8) */
    val payment: Rep[Long] = column[Long]("payment")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Droplocations (database name hubbed_bpay_payments_location_fkey) */
    lazy val droplocationsFk = foreignKey("hubbed_bpay_payments_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing MaccountNumbers (database name hubbed_bpay_payments_maccount_fkey) */
    lazy val maccountNumbersFk = foreignKey("hubbed_bpay_payments_maccount_fkey", maccount, MaccountNumbers)(r => r.token, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Payments (database name hubbed_bpay_payments_payment_fkey) */
    lazy val paymentsFk = foreignKey("hubbed_bpay_payments_payment_fkey", payment, Payments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table HubbedBpayPayments */
  lazy val HubbedBpayPayments = new TableQuery(tag => new HubbedBpayPayments(tag))
}
