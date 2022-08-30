package models
// AUTO-GENERATED Slick data model for table ArchiveCarrierSummaryReports
trait ArchiveCarrierSummaryReportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArchiveCarrierSummaryReports
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param month Database column month SqlType(int4), Default(None)
   *  @param year Database column year SqlType(int4), Default(None)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param country Database column country SqlType(varchar), Length(20,true), Default(None)
   *  @param state Database column state SqlType(varchar), Length(20,true), Default(None)
   *  @param volume20k Database column volume_20k SqlType(int8), Default(None)
   *  @param credit20k Database column credit_20k SqlType(numeric), Default(None)
   *  @param volume20001And30000 Database column volume_20001_and_30000 SqlType(int8), Default(None)
   *  @param credit20001And30000 Database column credit_20001_and_30000 SqlType(numeric), Default(None)
   *  @param volume30001And40000 Database column volume_30001_and_40000 SqlType(int8), Default(None)
   *  @param credit30001And40000 Database column credit_30001_and_40000 SqlType(numeric), Default(None)
   *  @param volume40001And50000 Database column volume_40001_and_50000 SqlType(int8), Default(None)
   *  @param credit40001And50000 Database column credit_40001_and_50000 SqlType(numeric), Default(None)
   *  @param volume50001And60000 Database column volume_50001_and_60000 SqlType(int8), Default(None)
   *  @param credit50001And60000 Database column credit_50001_and_60000 SqlType(numeric), Default(None)
   *  @param volume60001And70000 Database column volume_60001_and_70000 SqlType(int8), Default(None)
   *  @param credit60001And70000 Database column credit_60001_and_70000 SqlType(numeric), Default(None)
   *  @param volume70001And80000 Database column volume_70001_and_80000 SqlType(int8), Default(None)
   *  @param credit70001And80000 Database column credit_70001_and_80000 SqlType(numeric), Default(None)
   *  @param volume80001And90000 Database column volume_80001_and_90000 SqlType(int8), Default(None)
   *  @param credit80001And90000 Database column credit_80001_and_90000 SqlType(numeric), Default(None)
   *  @param volume90001And1lakh Database column volume_90001_and_1lakh SqlType(int8), Default(None)
   *  @param credit90001And1lakh Database column credit_90001_and_1lakh SqlType(numeric), Default(None)
   *  @param volume100001 Database column volume_100001 SqlType(int8), Default(None)
   *  @param credit100001 Database column credit_100001 SqlType(numeric), Default(None)
   *  @param clickCollectVolume Database column click_collect_volume SqlType(int8), Default(None)
   *  @param clickCollectCredit Database column click_collect_credit SqlType(numeric), Default(None)
   *  @param sendleDropoffVolume Database column sendle_dropoff_volume SqlType(int8), Default(None)
   *  @param sendleDropoffCredit Database column sendle_dropoff_credit SqlType(numeric), Default(None)
   *  @param cpExternalVolume Database column cp_external_volume SqlType(int8), Default(None)
   *  @param cpExternalCredit Database column cp_external_credit SqlType(numeric), Default(None)
   *  @param consumerPortalVolume Database column consumer_portal_volume SqlType(int8), Default(None)
   *  @param consumerPortalCredit Database column consumer_portal_credit SqlType(numeric), Default(None)
   *  @param vodafoneVolume Database column vodafone_volume SqlType(int8), Default(None)
   *  @param vodafoneCredit Database column vodafone_credit SqlType(numeric), Default(None)
   *  @param returnsVolume Database column returns_volume SqlType(int8), Default(None)
   *  @param returnsCredit Database column returns_credit SqlType(numeric), Default(None)
   *  @param outboundVolume Database column outbound_volume SqlType(int8), Default(None)
   *  @param outboundCredit Database column outbound_credit SqlType(numeric), Default(None)
   *  @param dropoffGrandVolume Database column dropoff_grand_volume SqlType(int8), Default(None)
   *  @param dropoffGrandCredit Database column dropoff_grand_credit SqlType(numeric), Default(None)
   *  @param totalVolume Database column total_volume SqlType(int8), Default(None)
   *  @param totalCredit Database column total_credit SqlType(numeric), Default(None)
   *  @param monthYear Database column month_year SqlType(varchar), Length(20,true), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class ArchiveCarrierSummaryReportsRow(id: Long, month: Option[Int] = None, year: Option[Int] = None, courier: Option[String] = None, country: Option[String] = None, state: Option[String] = None, volume20k: Option[Long] = None, credit20k: Option[scala.math.BigDecimal] = None, volume20001And30000: Option[Long] = None, credit20001And30000: Option[scala.math.BigDecimal] = None, volume30001And40000: Option[Long] = None, credit30001And40000: Option[scala.math.BigDecimal] = None, volume40001And50000: Option[Long] = None, credit40001And50000: Option[scala.math.BigDecimal] = None, volume50001And60000: Option[Long] = None, credit50001And60000: Option[scala.math.BigDecimal] = None, volume60001And70000: Option[Long] = None, credit60001And70000: Option[scala.math.BigDecimal] = None, volume70001And80000: Option[Long] = None, credit70001And80000: Option[scala.math.BigDecimal] = None, volume80001And90000: Option[Long] = None, credit80001And90000: Option[scala.math.BigDecimal] = None, volume90001And1lakh: Option[Long] = None, credit90001And1lakh: Option[scala.math.BigDecimal] = None, volume100001: Option[Long] = None, credit100001: Option[scala.math.BigDecimal] = None, clickCollectVolume: Option[Long] = None, clickCollectCredit: Option[scala.math.BigDecimal] = None, sendleDropoffVolume: Option[Long] = None, sendleDropoffCredit: Option[scala.math.BigDecimal] = None, cpExternalVolume: Option[Long] = None, cpExternalCredit: Option[scala.math.BigDecimal] = None, consumerPortalVolume: Option[Long] = None, consumerPortalCredit: Option[scala.math.BigDecimal] = None, vodafoneVolume: Option[Long] = None, vodafoneCredit: Option[scala.math.BigDecimal] = None, returnsVolume: Option[Long] = None, returnsCredit: Option[scala.math.BigDecimal] = None, outboundVolume: Option[Long] = None, outboundCredit: Option[scala.math.BigDecimal] = None, dropoffGrandVolume: Option[Long] = None, dropoffGrandCredit: Option[scala.math.BigDecimal] = None, totalVolume: Option[Long] = None, totalCredit: Option[scala.math.BigDecimal] = None, monthYear: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ArchiveCarrierSummaryReportsRow objects using plain SQL queries */
  implicit def GetResultArchiveCarrierSummaryReportsRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[scala.math.BigDecimal]], e5: GR[java.sql.Timestamp]): GR[ArchiveCarrierSummaryReportsRow] = GR{
    prs => import prs._
    ArchiveCarrierSummaryReportsRow(<<[Long], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[Long], <<?[scala.math.BigDecimal], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp])
  }
  /** Table description of table archive_carrier_summary_reports. Objects of this class serve as prototypes for rows in queries. */
  class ArchiveCarrierSummaryReports(_tableTag: Tag) extends profile.api.Table[ArchiveCarrierSummaryReportsRow](_tableTag, Some("reports"), "archive_carrier_summary_reports") {
    def * = (id :: month :: year :: courier :: country :: state :: volume20k :: credit20k :: volume20001And30000 :: credit20001And30000 :: volume30001And40000 :: credit30001And40000 :: volume40001And50000 :: credit40001And50000 :: volume50001And60000 :: credit50001And60000 :: volume60001And70000 :: credit60001And70000 :: volume70001And80000 :: credit70001And80000 :: volume80001And90000 :: credit80001And90000 :: volume90001And1lakh :: credit90001And1lakh :: volume100001 :: credit100001 :: clickCollectVolume :: clickCollectCredit :: sendleDropoffVolume :: sendleDropoffCredit :: cpExternalVolume :: cpExternalCredit :: consumerPortalVolume :: consumerPortalCredit :: vodafoneVolume :: vodafoneCredit :: returnsVolume :: returnsCredit :: outboundVolume :: outboundCredit :: dropoffGrandVolume :: dropoffGrandCredit :: totalVolume :: totalCredit :: monthYear :: createdAt :: modifiedAt :: HNil).mapTo[ArchiveCarrierSummaryReportsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: month :: year :: courier :: country :: state :: volume20k :: credit20k :: volume20001And30000 :: credit20001And30000 :: volume30001And40000 :: credit30001And40000 :: volume40001And50000 :: credit40001And50000 :: volume50001And60000 :: credit50001And60000 :: volume60001And70000 :: credit60001And70000 :: volume70001And80000 :: credit70001And80000 :: volume80001And90000 :: credit80001And90000 :: volume90001And1lakh :: credit90001And1lakh :: volume100001 :: credit100001 :: clickCollectVolume :: clickCollectCredit :: sendleDropoffVolume :: sendleDropoffCredit :: cpExternalVolume :: cpExternalCredit :: consumerPortalVolume :: consumerPortalCredit :: vodafoneVolume :: vodafoneCredit :: returnsVolume :: returnsCredit :: outboundVolume :: outboundCredit :: dropoffGrandVolume :: dropoffGrandCredit :: totalVolume :: totalCredit :: monthYear :: Rep.Some(createdAt) :: Rep.Some(modifiedAt) :: HNil).shaped.<>(r => ArchiveCarrierSummaryReportsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Int]], r(2).asInstanceOf[Option[Int]], r(3).asInstanceOf[Option[String]], r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[Long]], r(7).asInstanceOf[Option[scala.math.BigDecimal]], r(8).asInstanceOf[Option[Long]], r(9).asInstanceOf[Option[scala.math.BigDecimal]], r(10).asInstanceOf[Option[Long]], r(11).asInstanceOf[Option[scala.math.BigDecimal]], r(12).asInstanceOf[Option[Long]], r(13).asInstanceOf[Option[scala.math.BigDecimal]], r(14).asInstanceOf[Option[Long]], r(15).asInstanceOf[Option[scala.math.BigDecimal]], r(16).asInstanceOf[Option[Long]], r(17).asInstanceOf[Option[scala.math.BigDecimal]], r(18).asInstanceOf[Option[Long]], r(19).asInstanceOf[Option[scala.math.BigDecimal]], r(20).asInstanceOf[Option[Long]], r(21).asInstanceOf[Option[scala.math.BigDecimal]], r(22).asInstanceOf[Option[Long]], r(23).asInstanceOf[Option[scala.math.BigDecimal]], r(24).asInstanceOf[Option[Long]], r(25).asInstanceOf[Option[scala.math.BigDecimal]], r(26).asInstanceOf[Option[Long]], r(27).asInstanceOf[Option[scala.math.BigDecimal]], r(28).asInstanceOf[Option[Long]], r(29).asInstanceOf[Option[scala.math.BigDecimal]], r(30).asInstanceOf[Option[Long]], r(31).asInstanceOf[Option[scala.math.BigDecimal]], r(32).asInstanceOf[Option[Long]], r(33).asInstanceOf[Option[scala.math.BigDecimal]], r(34).asInstanceOf[Option[Long]], r(35).asInstanceOf[Option[scala.math.BigDecimal]], r(36).asInstanceOf[Option[Long]], r(37).asInstanceOf[Option[scala.math.BigDecimal]], r(38).asInstanceOf[Option[Long]], r(39).asInstanceOf[Option[scala.math.BigDecimal]], r(40).asInstanceOf[Option[Long]], r(41).asInstanceOf[Option[scala.math.BigDecimal]], r(42).asInstanceOf[Option[Long]], r(43).asInstanceOf[Option[scala.math.BigDecimal]], r(44).asInstanceOf[Option[String]], r(45).asInstanceOf[Option[java.sql.Timestamp]].get, r(46).asInstanceOf[Option[java.sql.Timestamp]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column month SqlType(int4), Default(None) */
    val month: Rep[Option[Int]] = column[Option[Int]]("month", O.Default(None))
    /** Database column year SqlType(int4), Default(None) */
    val year: Rep[Option[Int]] = column[Option[Int]]("year", O.Default(None))
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column country SqlType(varchar), Length(20,true), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Length(20,varying=true), O.Default(None))
    /** Database column state SqlType(varchar), Length(20,true), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Length(20,varying=true), O.Default(None))
    /** Database column volume_20k SqlType(int8), Default(None) */
    val volume20k: Rep[Option[Long]] = column[Option[Long]]("volume_20k", O.Default(None))
    /** Database column credit_20k SqlType(numeric), Default(None) */
    val credit20k: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_20k", O.Default(None))
    /** Database column volume_20001_and_30000 SqlType(int8), Default(None) */
    val volume20001And30000: Rep[Option[Long]] = column[Option[Long]]("volume_20001_and_30000", O.Default(None))
    /** Database column credit_20001_and_30000 SqlType(numeric), Default(None) */
    val credit20001And30000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_20001_and_30000", O.Default(None))
    /** Database column volume_30001_and_40000 SqlType(int8), Default(None) */
    val volume30001And40000: Rep[Option[Long]] = column[Option[Long]]("volume_30001_and_40000", O.Default(None))
    /** Database column credit_30001_and_40000 SqlType(numeric), Default(None) */
    val credit30001And40000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_30001_and_40000", O.Default(None))
    /** Database column volume_40001_and_50000 SqlType(int8), Default(None) */
    val volume40001And50000: Rep[Option[Long]] = column[Option[Long]]("volume_40001_and_50000", O.Default(None))
    /** Database column credit_40001_and_50000 SqlType(numeric), Default(None) */
    val credit40001And50000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_40001_and_50000", O.Default(None))
    /** Database column volume_50001_and_60000 SqlType(int8), Default(None) */
    val volume50001And60000: Rep[Option[Long]] = column[Option[Long]]("volume_50001_and_60000", O.Default(None))
    /** Database column credit_50001_and_60000 SqlType(numeric), Default(None) */
    val credit50001And60000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_50001_and_60000", O.Default(None))
    /** Database column volume_60001_and_70000 SqlType(int8), Default(None) */
    val volume60001And70000: Rep[Option[Long]] = column[Option[Long]]("volume_60001_and_70000", O.Default(None))
    /** Database column credit_60001_and_70000 SqlType(numeric), Default(None) */
    val credit60001And70000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_60001_and_70000", O.Default(None))
    /** Database column volume_70001_and_80000 SqlType(int8), Default(None) */
    val volume70001And80000: Rep[Option[Long]] = column[Option[Long]]("volume_70001_and_80000", O.Default(None))
    /** Database column credit_70001_and_80000 SqlType(numeric), Default(None) */
    val credit70001And80000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_70001_and_80000", O.Default(None))
    /** Database column volume_80001_and_90000 SqlType(int8), Default(None) */
    val volume80001And90000: Rep[Option[Long]] = column[Option[Long]]("volume_80001_and_90000", O.Default(None))
    /** Database column credit_80001_and_90000 SqlType(numeric), Default(None) */
    val credit80001And90000: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_80001_and_90000", O.Default(None))
    /** Database column volume_90001_and_1lakh SqlType(int8), Default(None) */
    val volume90001And1lakh: Rep[Option[Long]] = column[Option[Long]]("volume_90001_and_1lakh", O.Default(None))
    /** Database column credit_90001_and_1lakh SqlType(numeric), Default(None) */
    val credit90001And1lakh: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_90001_and_1lakh", O.Default(None))
    /** Database column volume_100001 SqlType(int8), Default(None) */
    val volume100001: Rep[Option[Long]] = column[Option[Long]]("volume_100001", O.Default(None))
    /** Database column credit_100001 SqlType(numeric), Default(None) */
    val credit100001: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit_100001", O.Default(None))
    /** Database column click_collect_volume SqlType(int8), Default(None) */
    val clickCollectVolume: Rep[Option[Long]] = column[Option[Long]]("click_collect_volume", O.Default(None))
    /** Database column click_collect_credit SqlType(numeric), Default(None) */
    val clickCollectCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("click_collect_credit", O.Default(None))
    /** Database column sendle_dropoff_volume SqlType(int8), Default(None) */
    val sendleDropoffVolume: Rep[Option[Long]] = column[Option[Long]]("sendle_dropoff_volume", O.Default(None))
    /** Database column sendle_dropoff_credit SqlType(numeric), Default(None) */
    val sendleDropoffCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("sendle_dropoff_credit", O.Default(None))
    /** Database column cp_external_volume SqlType(int8), Default(None) */
    val cpExternalVolume: Rep[Option[Long]] = column[Option[Long]]("cp_external_volume", O.Default(None))
    /** Database column cp_external_credit SqlType(numeric), Default(None) */
    val cpExternalCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("cp_external_credit", O.Default(None))
    /** Database column consumer_portal_volume SqlType(int8), Default(None) */
    val consumerPortalVolume: Rep[Option[Long]] = column[Option[Long]]("consumer_portal_volume", O.Default(None))
    /** Database column consumer_portal_credit SqlType(numeric), Default(None) */
    val consumerPortalCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("consumer_portal_credit", O.Default(None))
    /** Database column vodafone_volume SqlType(int8), Default(None) */
    val vodafoneVolume: Rep[Option[Long]] = column[Option[Long]]("vodafone_volume", O.Default(None))
    /** Database column vodafone_credit SqlType(numeric), Default(None) */
    val vodafoneCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("vodafone_credit", O.Default(None))
    /** Database column returns_volume SqlType(int8), Default(None) */
    val returnsVolume: Rep[Option[Long]] = column[Option[Long]]("returns_volume", O.Default(None))
    /** Database column returns_credit SqlType(numeric), Default(None) */
    val returnsCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("returns_credit", O.Default(None))
    /** Database column outbound_volume SqlType(int8), Default(None) */
    val outboundVolume: Rep[Option[Long]] = column[Option[Long]]("outbound_volume", O.Default(None))
    /** Database column outbound_credit SqlType(numeric), Default(None) */
    val outboundCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("outbound_credit", O.Default(None))
    /** Database column dropoff_grand_volume SqlType(int8), Default(None) */
    val dropoffGrandVolume: Rep[Option[Long]] = column[Option[Long]]("dropoff_grand_volume", O.Default(None))
    /** Database column dropoff_grand_credit SqlType(numeric), Default(None) */
    val dropoffGrandCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("dropoff_grand_credit", O.Default(None))
    /** Database column total_volume SqlType(int8), Default(None) */
    val totalVolume: Rep[Option[Long]] = column[Option[Long]]("total_volume", O.Default(None))
    /** Database column total_credit SqlType(numeric), Default(None) */
    val totalCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("total_credit", O.Default(None))
    /** Database column month_year SqlType(varchar), Length(20,true), Default(None) */
    val monthYear: Rep[Option[String]] = column[Option[String]]("month_year", O.Length(20,varying=true), O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table ArchiveCarrierSummaryReports */
  lazy val ArchiveCarrierSummaryReports = new TableQuery(tag => new ArchiveCarrierSummaryReports(tag))
}
