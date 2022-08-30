package models
// AUTO-GENERATED Slick data model for table CarrierLevelAccountCodes
trait CarrierLevelAccountCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CarrierLevelAccountCodes
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param product Database column product SqlType(text)
   *  @param customer Database column customer SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param accountCode Database column account_code SqlType(text)
   *  @param startRange Database column start_range SqlType(int4), Default(None)
   *  @param endRange Database column end_range SqlType(int4), Default(None)
   *  @param credit Database column credit SqlType(int4), Default(None)
   *  @param debit Database column debit SqlType(int4), Default(None)
   *  @param status Database column status SqlType(bool), Default(true)
   *  @param taxType Database column tax_type SqlType(varchar), Length(20,true), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param displayContactName Database column display_contact_name SqlType(text), Default(None) */
  case class CarrierLevelAccountCodesRow(id: Long, product: String, customer: String, description: String, accountCode: String, startRange: Option[Int] = None, endRange: Option[Int] = None, credit: Option[Int] = None, debit: Option[Int] = None, status: Boolean = true, taxType: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, displayContactName: Option[String] = None)
  /** GetResult implicit for fetching CarrierLevelAccountCodesRow objects using plain SQL queries */
  implicit def GetResultCarrierLevelAccountCodesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Int]], e3: GR[Boolean], e4: GR[Option[String]], e5: GR[java.sql.Timestamp], e6: GR[Option[java.sql.Timestamp]]): GR[CarrierLevelAccountCodesRow] = GR{
    prs => import prs._
    CarrierLevelAccountCodesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<?[Int], <<?[Int], <<?[Int], <<?[Int], <<[Boolean], <<?[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table carrier_level_account_codes. Objects of this class serve as prototypes for rows in queries. */
  class CarrierLevelAccountCodes(_tableTag: Tag) extends profile.api.Table[CarrierLevelAccountCodesRow](_tableTag, Some("reports"), "carrier_level_account_codes") {
    def * = (id, product, customer, description, accountCode, startRange, endRange, credit, debit, status, taxType, createdAt, modifiedAt, displayContactName) <> (CarrierLevelAccountCodesRow.tupled, CarrierLevelAccountCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(product), Rep.Some(customer), Rep.Some(description), Rep.Some(accountCode), startRange, endRange, credit, debit, Rep.Some(status), taxType, Rep.Some(createdAt), modifiedAt, displayContactName)).shaped.<>({r=>import r._; _1.map(_=> CarrierLevelAccountCodesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10.get, _11, _12.get, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column product SqlType(text) */
    val product: Rep[String] = column[String]("product")
    /** Database column customer SqlType(text) */
    val customer: Rep[String] = column[String]("customer")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column account_code SqlType(text) */
    val accountCode: Rep[String] = column[String]("account_code")
    /** Database column start_range SqlType(int4), Default(None) */
    val startRange: Rep[Option[Int]] = column[Option[Int]]("start_range", O.Default(None))
    /** Database column end_range SqlType(int4), Default(None) */
    val endRange: Rep[Option[Int]] = column[Option[Int]]("end_range", O.Default(None))
    /** Database column credit SqlType(int4), Default(None) */
    val credit: Rep[Option[Int]] = column[Option[Int]]("credit", O.Default(None))
    /** Database column debit SqlType(int4), Default(None) */
    val debit: Rep[Option[Int]] = column[Option[Int]]("debit", O.Default(None))
    /** Database column status SqlType(bool), Default(true) */
    val status: Rep[Boolean] = column[Boolean]("status", O.Default(true))
    /** Database column tax_type SqlType(varchar), Length(20,true), Default(None) */
    val taxType: Rep[Option[String]] = column[Option[String]]("tax_type", O.Length(20,varying=true), O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column display_contact_name SqlType(text), Default(None) */
    val displayContactName: Rep[Option[String]] = column[Option[String]]("display_contact_name", O.Default(None))
  }
  /** Collection-like TableQuery object for table CarrierLevelAccountCodes */
  lazy val CarrierLevelAccountCodes = new TableQuery(tag => new CarrierLevelAccountCodes(tag))
}
