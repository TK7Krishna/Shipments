package models
// AUTO-GENERATED Slick data model for table ArchiveStoreLevelReports
trait ArchiveStoreLevelReportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArchiveStoreLevelReports
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param month Database column month SqlType(int4), Default(None)
   *  @param year Database column year SqlType(int4), Default(None)
   *  @param storeType Database column store_type SqlType(text), Default(None)
   *  @param billTo Database column bill_to SqlType(text), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param storeName Database column store_name SqlType(varchar), Length(100,true), Default(None)
   *  @param volumeInbound Database column volume_inbound SqlType(int8), Default(None)
   *  @param creditInbound Database column credit_inbound SqlType(numeric), Default(None)
   *  @param volumeClickCollect Database column volume_click_collect SqlType(int8), Default(None)
   *  @param creditClickCollect Database column credit_click_collect SqlType(numeric), Default(None)
   *  @param volumeDropoff Database column volume_dropoff SqlType(int8), Default(None)
   *  @param creditDropoff Database column credit_dropoff SqlType(numeric), Default(None)
   *  @param totalVolume Database column total_volume SqlType(int8), Default(None)
   *  @param totalCredit Database column total_credit SqlType(numeric), Default(None)
   *  @param volumeSendleDropoff Database column volume_sendle_dropoff SqlType(int8), Default(None)
   *  @param creditSendleDropoff Database column credit_sendle_dropoff SqlType(numeric), Default(None)
   *  @param volumeCpDropoff Database column volume_cp_dropoff SqlType(int8), Default(None)
   *  @param creditCpDropoff Database column credit_cp_dropoff SqlType(numeric), Default(None)
   *  @param volumeVodafoneDropoff Database column volume_vodafone_dropoff SqlType(int8), Default(None)
   *  @param creditVodafoneDropoff Database column credit_vodafone_dropoff SqlType(numeric), Default(None)
   *  @param volumeOutbundDropoff Database column volume_outbund_dropoff SqlType(int8), Default(None)
   *  @param creditOutbundDropoff Database column credit_outbund_dropoff SqlType(numeric), Default(None)
   *  @param volumeReturnsDropoff Database column volume_returns_dropoff SqlType(int8), Default(None)
   *  @param creditReturnsDropoff Database column credit_returns_dropoff SqlType(numeric), Default(None)
   *  @param monthYear Database column month_year SqlType(varchar), Length(20,true), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param idass Database column idass SqlType(text), Default(None)
   *  @param profitCentre Database column profit_centre SqlType(text), Default(None)
   *  @param gst Database column gst SqlType(numeric), Default(None)
   *  @param servicefeeInclGst Database column servicefee_incl_gst SqlType(numeric), Default(None)
   *  @param netRevenue Database column net_revenue SqlType(numeric), Default(None) */
  case class ArchiveStoreLevelReportsRow(id: Long, month: Option[Int] = None, year: Option[Int] = None, storeType: Option[String] = None, billTo: Option[String] = None, country: Option[String] = None, storeName: Option[String] = None, volumeInbound: Option[Long] = None, creditInbound: Option[scala.math.BigDecimal] = None, volumeClickCollect: Option[Long] = None, creditClickCollect: Option[scala.math.BigDecimal] = None, volumeDropoff: Option[Long] = None, creditDropoff: Option[scala.math.BigDecimal] = None, totalVolume: Option[Long] = None, totalCredit: Option[scala.math.BigDecimal] = None, volumeSendleDropoff: Option[Long] = None, creditSendleDropoff: Option[scala.math.BigDecimal] = None, volumeCpDropoff: Option[Long] = None, creditCpDropoff: Option[scala.math.BigDecimal] = None, volumeVodafoneDropoff: Option[Long] = None, creditVodafoneDropoff: Option[scala.math.BigDecimal] = None, volumeOutbundDropoff: Option[Long] = None, creditOutbundDropoff: Option[scala.math.BigDecimal] = None, volumeReturnsDropoff: Option[Long] = None, creditReturnsDropoff: Option[scala.math.BigDecimal] = None, monthYear: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, idass: Option[String] = None, profitCentre: Option[String] = None, gst: Option[scala.math.BigDecimal] = None, servicefeeInclGst: Option[scala.math.BigDecimal] = None, netRevenue: Option[scala.math.BigDecimal] = None)
  /** GetResult implicit for fetching ArchiveStoreLevelReportsRow objects using plain SQL queries */
  implicit def GetResultArchiveStoreLevelReportsRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[scala.math.BigDecimal]], e5: GR[java.sql.Timestamp]): GR[ArchiveStoreLevelReportsRow] = GR{
    prs => import prs._
    ArchiveStoreLevelReportsRow(<<[Long], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal])
  }
  /** Table description of table archive_store_level_reports. Objects of this class serve as prototypes for rows in queries. */
  class ArchiveStoreLevelReports(_tableTag: Tag) extends profile.api.Table[ArchiveStoreLevelReportsRow](_tableTag, Some("reports"), "archive_store_level_reports") {
    def * = (id :: month :: year :: storeType :: billTo :: country :: storeName :: volumeInbound :: creditInbound :: volumeClickCollect :: creditClickCollect :: volumeDropoff :: creditDropoff :: totalVolume :: totalCredit :: volumeSendleDropoff :: creditSendleDropoff :: volumeCpDropoff :: creditCpDropoff :: volumeVodafoneDropoff :: creditVodafoneDropoff :: volumeOutbundDropoff :: creditOutbundDropoff :: volumeReturnsDropoff :: creditReturnsDropoff :: monthYear :: createdAt :: modifiedAt :: idass :: profitCentre :: gst :: servicefeeInclGst :: netRevenue :: HNil).mapTo[ArchiveStoreLevelReportsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: month :: year :: storeType :: billTo :: country :: storeName :: volumeInbound :: creditInbound :: volumeClickCollect :: creditClickCollect :: volumeDropoff :: creditDropoff :: totalVolume :: totalCredit :: volumeSendleDropoff :: creditSendleDropoff :: volumeCpDropoff :: creditCpDropoff :: volumeVodafoneDropoff :: creditVodafoneDropoff :: volumeOutbundDropoff :: creditOutbundDropoff :: volumeReturnsDropoff :: creditReturnsDropoff :: monthYear :: Rep.Some(createdAt) :: Rep.Some(modifiedAt) :: idass :: profitCentre :: gst :: servicefeeInclGst :: netRevenue :: HNil).shaped.<>(r => ArchiveStoreLevelReportsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Int]], r(2).asInstanceOf[Option[Int]], r(3).asInstanceOf[Option[String]], r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[Long]], r(8).asInstanceOf[Option[scala.math.BigDecimal]], r(9).asInstanceOf[Option[Long]], r(10).asInstanceOf[Option[scala.math.BigDecimal]], r(11).asInstanceOf[Option[Long]], r(12).asInstanceOf[Option[scala.math.BigDecimal]], r(13).asInstanceOf[Option[Long]], r(14).asInstanceOf[Option[scala.math.BigDecimal]], r(15).asInstanceOf[Option[Long]], r(16).asInstanceOf[Option[scala.math.BigDecimal]], r(17).asInstanceOf[Option[Long]], r(18).asInstanceOf[Option[scala.math.BigDecimal]], r(19).asInstanceOf[Option[Long]], r(20).asInstanceOf[Option[scala.math.BigDecimal]], r(21).asInstanceOf[Option[Long]], r(22).asInstanceOf[Option[scala.math.BigDecimal]], r(23).asInstanceOf[Option[Long]], r(24).asInstanceOf[Option[scala.math.BigDecimal]], r(25).asInstanceOf[Option[String]], r(26).asInstanceOf[Option[java.sql.Timestamp]].get, r(27).asInstanceOf[Option[java.sql.Timestamp]].get, r(28).asInstanceOf[Option[String]], r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[scala.math.BigDecimal]], r(31).asInstanceOf[Option[scala.math.BigDecimal]], r(32).asInstanceOf[Option[scala.math.BigDecimal]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column month SqlType(int4), Default(None) */
    val month: Rep[Option[Int]] = column[Option[Int]]("month", O.Default(None))
    /** Database column year SqlType(int4), Default(None) */
    val year: Rep[Option[Int]] = column[Option[Int]]("year", O.Default(None))
    /** Database column store_type SqlType(text), Default(None) */
    val storeType: Rep[Option[String]] = column[Option[String]]("store_type", O.Default(None))
    /** Database column bill_to SqlType(text), Default(None) */
    val billTo: Rep[Option[String]] = column[Option[String]]("bill_to", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column store_name SqlType(varchar), Length(100,true), Default(None) */
    val storeName: Rep[Option[String]] = column[Option[String]]("store_name", O.Length(100,varying=true), O.Default(None))
    /** Database column volume_inbound SqlType(int8), Default(None) */
    val volumeInbound: Rep[Option[Long]] = column[Option[Long]]("volume_inbound", O.Default(None))
    /** Database column credit_inbound SqlType(numeric), Default(None) */
    val creditInbound: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_inbound", O.Default(None))
    /** Database column volume_click_collect SqlType(int8), Default(None) */
    val volumeClickCollect: Rep[Option[Long]] = column[Option[Long]]("volume_click_collect", O.Default(None))
    /** Database column credit_click_collect SqlType(numeric), Default(None) */
    val creditClickCollect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_click_collect", O.Default(None))
    /** Database column volume_dropoff SqlType(int8), Default(None) */
    val volumeDropoff: Rep[Option[Long]] = column[Option[Long]]("volume_dropoff", O.Default(None))
    /** Database column credit_dropoff SqlType(numeric), Default(None) */
    val creditDropoff: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_dropoff", O.Default(None))
    /** Database column total_volume SqlType(int8), Default(None) */
    val totalVolume: Rep[Option[Long]] = column[Option[Long]]("total_volume", O.Default(None))
    /** Database column total_credit SqlType(numeric), Default(None) */
    val totalCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("total_credit", O.Default(None))
    /** Database column volume_sendle_dropoff SqlType(int8), Default(None) */
    val volumeSendleDropoff: Rep[Option[Long]] = column[Option[Long]]("volume_sendle_dropoff", O.Default(None))
    /** Database column credit_sendle_dropoff SqlType(numeric), Default(None) */
    val creditSendleDropoff: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_sendle_dropoff", O.Default(None))
    /** Database column volume_cp_dropoff SqlType(int8), Default(None) */
    val volumeCpDropoff: Rep[Option[Long]] = column[Option[Long]]("volume_cp_dropoff", O.Default(None))
    /** Database column credit_cp_dropoff SqlType(numeric), Default(None) */
    val creditCpDropoff: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_cp_dropoff", O.Default(None))
    /** Database column volume_vodafone_dropoff SqlType(int8), Default(None) */
    val volumeVodafoneDropoff: Rep[Option[Long]] = column[Option[Long]]("volume_vodafone_dropoff", O.Default(None))
    /** Database column credit_vodafone_dropoff SqlType(numeric), Default(None) */
    val creditVodafoneDropoff: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_vodafone_dropoff", O.Default(None))
    /** Database column volume_outbund_dropoff SqlType(int8), Default(None) */
    val volumeOutbundDropoff: Rep[Option[Long]] = column[Option[Long]]("volume_outbund_dropoff", O.Default(None))
    /** Database column credit_outbund_dropoff SqlType(numeric), Default(None) */
    val creditOutbundDropoff: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_outbund_dropoff", O.Default(None))
    /** Database column volume_returns_dropoff SqlType(int8), Default(None) */
    val volumeReturnsDropoff: Rep[Option[Long]] = column[Option[Long]]("volume_returns_dropoff", O.Default(None))
    /** Database column credit_returns_dropoff SqlType(numeric), Default(None) */
    val creditReturnsDropoff: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_returns_dropoff", O.Default(None))
    /** Database column month_year SqlType(varchar), Length(20,true), Default(None) */
    val monthYear: Rep[Option[String]] = column[Option[String]]("month_year", O.Length(20,varying=true), O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column idass SqlType(text), Default(None) */
    val idass: Rep[Option[String]] = column[Option[String]]("idass", O.Default(None))
    /** Database column profit_centre SqlType(text), Default(None) */
    val profitCentre: Rep[Option[String]] = column[Option[String]]("profit_centre", O.Default(None))
    /** Database column gst SqlType(numeric), Default(None) */
    val gst: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("gst", O.Default(None))
    /** Database column servicefee_incl_gst SqlType(numeric), Default(None) */
    val servicefeeInclGst: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("servicefee_incl_gst", O.Default(None))
    /** Database column net_revenue SqlType(numeric), Default(None) */
    val netRevenue: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("net_revenue", O.Default(None))
  }
  /** Collection-like TableQuery object for table ArchiveStoreLevelReports */
  lazy val ArchiveStoreLevelReports = new TableQuery(tag => new ArchiveStoreLevelReports(tag))
}
