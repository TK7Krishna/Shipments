package models
// AUTO-GENERATED Slick data model for table StoreLevelAccountCodes
trait StoreLevelAccountCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StoreLevelAccountCodes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param product Database column product SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param accountCode Database column account_code SqlType(text)
   *  @param status Database column status SqlType(bool), Default(true)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param taxType Database column tax_type SqlType(varchar), Length(20,true), Default(None) */
  case class StoreLevelAccountCodesRow(id: Long, product: String, description: String, accountCode: String, status: Boolean = true, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, taxType: Option[String] = None)
  /** GetResult implicit for fetching StoreLevelAccountCodesRow objects using plain SQL queries */
  implicit def GetResultStoreLevelAccountCodesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[java.sql.Timestamp], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[String]]): GR[StoreLevelAccountCodesRow] = GR{
    prs => import prs._
    StoreLevelAccountCodesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Boolean], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table store_level_account_codes. Objects of this class serve as prototypes for rows in queries. */
  class StoreLevelAccountCodes(_tableTag: Tag) extends profile.api.Table[StoreLevelAccountCodesRow](_tableTag, Some("reports"), "store_level_account_codes") {
    def * = (id, product, description, accountCode, status, createdAt, modifiedAt, taxType) <> (StoreLevelAccountCodesRow.tupled, StoreLevelAccountCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(product), Rep.Some(description), Rep.Some(accountCode), Rep.Some(status), Rep.Some(createdAt), modifiedAt, taxType)).shaped.<>({r=>import r._; _1.map(_=> StoreLevelAccountCodesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column product SqlType(text) */
    val product: Rep[String] = column[String]("product")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column account_code SqlType(text) */
    val accountCode: Rep[String] = column[String]("account_code")
    /** Database column status SqlType(bool), Default(true) */
    val status: Rep[Boolean] = column[Boolean]("status", O.Default(true))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column tax_type SqlType(varchar), Length(20,true), Default(None) */
    val taxType: Rep[Option[String]] = column[Option[String]]("tax_type", O.Length(20,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table StoreLevelAccountCodes */
  lazy val StoreLevelAccountCodes = new TableQuery(tag => new StoreLevelAccountCodes(tag))
}
