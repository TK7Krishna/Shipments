package models
// AUTO-GENERATED Slick data model for table Payments
trait PaymentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Payments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param description Database column description SqlType(text)
   *  @param source Database column source SqlType(int8)
   *  @param mwalletAccount Database column mwallet_account SqlType(text), Default(None)
   *  @param mwalletPin Database column mwallet_pin SqlType(text), Default(None) */
  case class PaymentsRow(id: Long, description: String, source: Long, mwalletAccount: Option[String] = None, mwalletPin: Option[String] = None)
  /** GetResult implicit for fetching PaymentsRow objects using plain SQL queries */
  implicit def GetResultPaymentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[PaymentsRow] = GR{
    prs => import prs._
    PaymentsRow.tupled((<<[Long], <<[String], <<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table payments. Objects of this class serve as prototypes for rows in queries. */
  class Payments(_tableTag: Tag) extends profile.api.Table[PaymentsRow](_tableTag, Some("moneytech"), "payments") {
    def * = (id, description, source, mwalletAccount, mwalletPin) <> (PaymentsRow.tupled, PaymentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(description), Rep.Some(source), mwalletAccount, mwalletPin)).shaped.<>({r=>import r._; _1.map(_=> PaymentsRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column source SqlType(int8) */
    val source: Rep[Long] = column[Long]("source")
    /** Database column mwallet_account SqlType(text), Default(None) */
    val mwalletAccount: Rep[Option[String]] = column[Option[String]]("mwallet_account", O.Default(None))
    /** Database column mwallet_pin SqlType(text), Default(None) */
    val mwalletPin: Rep[Option[String]] = column[Option[String]]("mwallet_pin", O.Default(None))

    /** Foreign key referencing PaymentSources (database name payments_source_fkey) */
    lazy val paymentSourcesFk = foreignKey("payments_source_fkey", source, PaymentSources)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Payments */
  lazy val Payments = new TableQuery(tag => new Payments(tag))
}
