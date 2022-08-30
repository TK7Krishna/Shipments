package models
// AUTO-GENERATED Slick data model for table BpFinanceProfitCentre
trait BpFinanceProfitCentreTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BpFinanceProfitCentre
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text), Default(None)
   *  @param profitCentre Database column profit_centre SqlType(varchar), Length(20,true), Default(None)
   *  @param idass Database column idass SqlType(int4), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class BpFinanceProfitCentreRow(id: Long, name: Option[String] = None, profitCentre: Option[String] = None, idass: Option[Int] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching BpFinanceProfitCentreRow objects using plain SQL queries */
  implicit def GetResultBpFinanceProfitCentreRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[java.sql.Timestamp]): GR[BpFinanceProfitCentreRow] = GR{
    prs => import prs._
    BpFinanceProfitCentreRow.tupled((<<[Long], <<?[String], <<?[String], <<?[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table bp_finance_profit_centre. Objects of this class serve as prototypes for rows in queries. */
  class BpFinanceProfitCentre(_tableTag: Tag) extends profile.api.Table[BpFinanceProfitCentreRow](_tableTag, Some("reports"), "bp_finance_profit_centre") {
    def * = (id, name, profitCentre, idass, createdAt) <> (BpFinanceProfitCentreRow.tupled, BpFinanceProfitCentreRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name, profitCentre, idass, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> BpFinanceProfitCentreRow.tupled((_1.get, _2, _3, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column profit_centre SqlType(varchar), Length(20,true), Default(None) */
    val profitCentre: Rep[Option[String]] = column[Option[String]]("profit_centre", O.Length(20,varying=true), O.Default(None))
    /** Database column idass SqlType(int4), Default(None) */
    val idass: Rep[Option[Int]] = column[Option[Int]]("idass", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table BpFinanceProfitCentre */
  lazy val BpFinanceProfitCentre = new TableQuery(tag => new BpFinanceProfitCentre(tag))
}
