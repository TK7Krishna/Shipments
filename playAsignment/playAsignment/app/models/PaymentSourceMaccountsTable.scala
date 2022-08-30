package models
// AUTO-GENERATED Slick data model for table PaymentSourceMaccounts
trait PaymentSourceMaccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentSourceMaccounts
   *  @param source Database column source SqlType(int8), PrimaryKey
   *  @param amount Database column amount SqlType(float8)
   *  @param maccount Database column maccount SqlType(text) */
  case class PaymentSourceMaccountsRow(source: Long, amount: Double, maccount: String)
  /** GetResult implicit for fetching PaymentSourceMaccountsRow objects using plain SQL queries */
  implicit def GetResultPaymentSourceMaccountsRow(implicit e0: GR[Long], e1: GR[Double], e2: GR[String]): GR[PaymentSourceMaccountsRow] = GR{
    prs => import prs._
    PaymentSourceMaccountsRow.tupled((<<[Long], <<[Double], <<[String]))
  }
  /** Table description of table payment_source_maccounts. Objects of this class serve as prototypes for rows in queries. */
  class PaymentSourceMaccounts(_tableTag: Tag) extends profile.api.Table[PaymentSourceMaccountsRow](_tableTag, Some("moneytech"), "payment_source_maccounts") {
    def * = (source, amount, maccount) <> (PaymentSourceMaccountsRow.tupled, PaymentSourceMaccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(source), Rep.Some(amount), Rep.Some(maccount))).shaped.<>({r=>import r._; _1.map(_=> PaymentSourceMaccountsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column source SqlType(int8), PrimaryKey */
    val source: Rep[Long] = column[Long]("source", O.PrimaryKey)
    /** Database column amount SqlType(float8) */
    val amount: Rep[Double] = column[Double]("amount")
    /** Database column maccount SqlType(text) */
    val maccount: Rep[String] = column[String]("maccount")

    /** Foreign key referencing PaymentSources (database name payment_source_maccounts_source_fkey) */
    lazy val paymentSourcesFk = foreignKey("payment_source_maccounts_source_fkey", source, PaymentSources)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentSourceMaccounts */
  lazy val PaymentSourceMaccounts = new TableQuery(tag => new PaymentSourceMaccounts(tag))
}
