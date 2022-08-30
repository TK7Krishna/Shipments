package models
// AUTO-GENERATED Slick data model for table ArchiveRevenueReportsCopy
trait ArchiveRevenueReportsCopyTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArchiveRevenueReportsCopy
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param month Database column month SqlType(int4), Default(None)
   *  @param year Database column year SqlType(int4), Default(None)
   *  @param customer Database column customer SqlType(varchar), Length(50,true), Default(None)
   *  @param product Database column product SqlType(varchar), Length(50,true), Default(None)
   *  @param actualVolume Database column actual_volume SqlType(int8), Default(None)
   *  @param actualRevenue Database column actual_revenue SqlType(numeric)
   *  @param targetVolume Database column target_volume SqlType(int8), Default(None)
   *  @param targetRevenue Database column target_revenue SqlType(numeric)
   *  @param segment Database column segment SqlType(varchar), Length(20,true), Default(Some(Transactional))
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class ArchiveRevenueReportsCopyRow(id: Long, month: Option[Int] = None, year: Option[Int] = None, customer: Option[String] = None, product: Option[String] = None, actualVolume: Option[Long] = None, actualRevenue: Option[scala.math.BigDecimal], targetVolume: Option[Long] = None, targetRevenue: Option[scala.math.BigDecimal], segment: Option[String] = Some("Transactional"), createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ArchiveRevenueReportsCopyRow objects using plain SQL queries */
  implicit def GetResultArchiveRevenueReportsCopyRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[scala.math.BigDecimal]], e5: GR[java.sql.Timestamp]): GR[ArchiveRevenueReportsCopyRow] = GR{
    prs => import prs._
    ArchiveRevenueReportsCopyRow.tupled((<<[Long], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table archive_revenue_reports_copy. Objects of this class serve as prototypes for rows in queries. */
  class ArchiveRevenueReportsCopy(_tableTag: Tag) extends profile.api.Table[ArchiveRevenueReportsCopyRow](_tableTag, Some("reports"), "archive_revenue_reports_copy") {
    def * = (id, month, year, customer, product, actualVolume, actualRevenue, targetVolume, targetRevenue, segment, createdAt, modifiedAt) <> (ArchiveRevenueReportsCopyRow.tupled, ArchiveRevenueReportsCopyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), month, year, customer, product, actualVolume, actualRevenue, targetVolume, targetRevenue, segment, Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> ArchiveRevenueReportsCopyRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column month SqlType(int4), Default(None) */
    val month: Rep[Option[Int]] = column[Option[Int]]("month", O.Default(None))
    /** Database column year SqlType(int4), Default(None) */
    val year: Rep[Option[Int]] = column[Option[Int]]("year", O.Default(None))
    /** Database column customer SqlType(varchar), Length(50,true), Default(None) */
    val customer: Rep[Option[String]] = column[Option[String]]("customer", O.Length(50,varying=true), O.Default(None))
    /** Database column product SqlType(varchar), Length(50,true), Default(None) */
    val product: Rep[Option[String]] = column[Option[String]]("product", O.Length(50,varying=true), O.Default(None))
    /** Database column actual_volume SqlType(int8), Default(None) */
    val actualVolume: Rep[Option[Long]] = column[Option[Long]]("actual_volume", O.Default(None))
    /** Database column actual_revenue SqlType(numeric) */
    val actualRevenue: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("actual_revenue")
    /** Database column target_volume SqlType(int8), Default(None) */
    val targetVolume: Rep[Option[Long]] = column[Option[Long]]("target_volume", O.Default(None))
    /** Database column target_revenue SqlType(numeric) */
    val targetRevenue: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("target_revenue")
    /** Database column segment SqlType(varchar), Length(20,true), Default(Some(Transactional)) */
    val segment: Rep[Option[String]] = column[Option[String]]("segment", O.Length(20,varying=true), O.Default(Some("Transactional")))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table ArchiveRevenueReportsCopy */
  lazy val ArchiveRevenueReportsCopy = new TableQuery(tag => new ArchiveRevenueReportsCopy(tag))
}
