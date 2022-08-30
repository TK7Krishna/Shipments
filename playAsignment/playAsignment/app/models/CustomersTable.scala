package models
// AUTO-GENERATED Slick data model for table Customers
trait CustomersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Customers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param stripeCustId Database column stripe_cust_id SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param email Database column email SqlType(text), Default(None)
   *  @param sourceToken Database column source_token SqlType(text)
   *  @param stripeCardId Database column stripe_card_id SqlType(text)
   *  @param last4 Database column last4 SqlType(text)
   *  @param expMonth Database column exp_month SqlType(int4)
   *  @param expYear Database column exp_year SqlType(int4)
   *  @param cardholderName Database column cardholder_name SqlType(text), Default(None)
   *  @param deleted Database column deleted SqlType(bool), Default(false) */
  case class CustomersRow(id: Long, stripeCustId: String, createdAt: java.sql.Timestamp, email: Option[String] = None, sourceToken: String, stripeCardId: String, last4: String, expMonth: Int, expYear: Int, cardholderName: Option[String] = None, deleted: Boolean = false)
  /** GetResult implicit for fetching CustomersRow objects using plain SQL queries */
  implicit def GetResultCustomersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[String]], e4: GR[Int], e5: GR[Boolean]): GR[CustomersRow] = GR{
    prs => import prs._
    CustomersRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp], <<?[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<?[String], <<[Boolean]))
  }
  /** Table description of table customers. Objects of this class serve as prototypes for rows in queries. */
  class Customers(_tableTag: Tag) extends profile.api.Table[CustomersRow](_tableTag, Some("stripe"), "customers") {
    def * = (id, stripeCustId, createdAt, email, sourceToken, stripeCardId, last4, expMonth, expYear, cardholderName, deleted) <> (CustomersRow.tupled, CustomersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(stripeCustId), Rep.Some(createdAt), email, Rep.Some(sourceToken), Rep.Some(stripeCardId), Rep.Some(last4), Rep.Some(expMonth), Rep.Some(expYear), cardholderName, Rep.Some(deleted))).shaped.<>({r=>import r._; _1.map(_=> CustomersRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get, _8.get, _9.get, _10, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column stripe_cust_id SqlType(text) */
    val stripeCustId: Rep[String] = column[String]("stripe_cust_id")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))
    /** Database column source_token SqlType(text) */
    val sourceToken: Rep[String] = column[String]("source_token")
    /** Database column stripe_card_id SqlType(text) */
    val stripeCardId: Rep[String] = column[String]("stripe_card_id")
    /** Database column last4 SqlType(text) */
    val last4: Rep[String] = column[String]("last4")
    /** Database column exp_month SqlType(int4) */
    val expMonth: Rep[Int] = column[Int]("exp_month")
    /** Database column exp_year SqlType(int4) */
    val expYear: Rep[Int] = column[Int]("exp_year")
    /** Database column cardholder_name SqlType(text), Default(None) */
    val cardholderName: Rep[Option[String]] = column[Option[String]]("cardholder_name", O.Default(None))
    /** Database column deleted SqlType(bool), Default(false) */
    val deleted: Rep[Boolean] = column[Boolean]("deleted", O.Default(false))

    /** Uniqueness Index over (sourceToken) (database name customers_source_token_key) */
    val index1 = index("customers_source_token_key", sourceToken, unique=true)
    /** Uniqueness Index over (stripeCustId) (database name customers_stripe_cust_id_key) */
    val index2 = index("customers_stripe_cust_id_key", stripeCustId, unique=true)
  }
  /** Collection-like TableQuery object for table Customers */
  lazy val Customers = new TableQuery(tag => new Customers(tag))
}
