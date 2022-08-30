package models
// AUTO-GENERATED Slick data model for table Charges
trait ChargesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Charges
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param amount Database column amount SqlType(int8)
   *  @param currency Database column currency SqlType(text)
   *  @param sourceToken Database column source_token SqlType(text), Default(None)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param statementDescriptor Database column statement_descriptor SqlType(text), Default(None)
   *  @param stripeId Database column stripe_id SqlType(text), Default(None)
   *  @param sourceCustomer Database column source_customer SqlType(text), Default(None)
   *  @param discountMeta Database column discount_meta SqlType(int8), Default(None) */
  case class ChargesRow(id: Long, createdAt: java.sql.Timestamp, amount: Long, currency: String, sourceToken: Option[String] = None, description: Option[String] = None, statementDescriptor: Option[String] = None, stripeId: Option[String] = None, sourceCustomer: Option[String] = None, discountMeta: Option[Long] = None)
  /** GetResult implicit for fetching ChargesRow objects using plain SQL queries */
  implicit def GetResultChargesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[Long]]): GR[ChargesRow] = GR{
    prs => import prs._
    ChargesRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long]))
  }
  /** Table description of table charges. Objects of this class serve as prototypes for rows in queries. */
  class Charges(_tableTag: Tag) extends profile.api.Table[ChargesRow](_tableTag, Some("stripe"), "charges") {
    def * = (id, createdAt, amount, currency, sourceToken, description, statementDescriptor, stripeId, sourceCustomer, discountMeta) <> (ChargesRow.tupled, ChargesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(createdAt), Rep.Some(amount), Rep.Some(currency), sourceToken, description, statementDescriptor, stripeId, sourceCustomer, discountMeta)).shaped.<>({r=>import r._; _1.map(_=> ChargesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column amount SqlType(int8) */
    val amount: Rep[Long] = column[Long]("amount")
    /** Database column currency SqlType(text) */
    val currency: Rep[String] = column[String]("currency")
    /** Database column source_token SqlType(text), Default(None) */
    val sourceToken: Rep[Option[String]] = column[Option[String]]("source_token", O.Default(None))
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column statement_descriptor SqlType(text), Default(None) */
    val statementDescriptor: Rep[Option[String]] = column[Option[String]]("statement_descriptor", O.Default(None))
    /** Database column stripe_id SqlType(text), Default(None) */
    val stripeId: Rep[Option[String]] = column[Option[String]]("stripe_id", O.Default(None))
    /** Database column source_customer SqlType(text), Default(None) */
    val sourceCustomer: Rep[Option[String]] = column[Option[String]]("source_customer", O.Default(None))
    /** Database column discount_meta SqlType(int8), Default(None) */
    val discountMeta: Rep[Option[Long]] = column[Option[Long]]("discount_meta", O.Default(None))

    /** Uniqueness Index over (sourceToken) (database name charges_source_token_key) */
    val index1 = index("charges_source_token_key", sourceToken, unique=true)
    /** Uniqueness Index over (stripeId) (database name charges_stripe_id_key) */
    val index2 = index("charges_stripe_id_key", stripeId, unique=true)
  }
  /** Collection-like TableQuery object for table Charges */
  lazy val Charges = new TableQuery(tag => new Charges(tag))
}
