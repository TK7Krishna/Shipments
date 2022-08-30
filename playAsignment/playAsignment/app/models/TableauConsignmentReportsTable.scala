package models
// AUTO-GENERATED Slick data model for table TableauConsignmentReports
trait TableauConsignmentReportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TableauConsignmentReports
   *  @param time Database column Time SqlType(varchar), Default(None)
   *  @param `consignment number` Database column Consignment Number SqlType(text), Default(None)
   *  @param `article barcode` Database column Article Barcode SqlType(text), Default(None)
   *  @param status Database column Status SqlType(varchar), Default(None)
   *  @param `check in date` Database column Check in Date SqlType(date), Default(None)
   *  @param `check in time` Database column Check in Time SqlType(time), Default(None)
   *  @param `check out date` Database column Check Out Date SqlType(date), Default(None)
   *  @param `check out time` Database column Check Out Time SqlType(time), Default(None)
   *  @param `return date` Database column Return Date SqlType(date), Default(None)
   *  @param `return time` Database column Return Time SqlType(varchar), Default(None)
   *  @param `time zone` Database column Time Zone SqlType(varchar), Default(None)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param carrier Database column Carrier SqlType(varchar), Default(None)
   *  @param carrier2 Database column Carrier2 SqlType(varchar), Default(None)
   *  @param `store name` Database column Store Name SqlType(varchar), Default(None)
   *  @param `store dlb` Database column Store DLB SqlType(varchar), Default(None)
   *  @param `store suburb` Database column Store Suburb SqlType(varchar), Default(None)
   *  @param `store state` Database column Store State SqlType(varchar), Default(None)
   *  @param `store postcode` Database column Store Postcode SqlType(varchar), Default(None)
   *  @param `store type` Database column Store Type SqlType(varchar), Default(None)
   *  @param `cp location code` Database column CP Location Code SqlType(varchar), Default(None)
   *  @param `dhl location code` Database column DHL Location Code SqlType(varchar), Default(None)
   *  @param `toll location code` Database column Toll Location Code SqlType(varchar), Default(None)
   *  @param `dhl sc location code` Database column DHL SC Location Code SqlType(varchar), Default(None)
   *  @param `total weight` Database column Total Weight SqlType(varchar), Default(None)
   *  @param `receiver name` Database column Receiver Name SqlType(varchar), Default(None)
   *  @param pod Database column POD SqlType(varchar), Default(None)
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param `checkin date time` Database column Checkin Date Time SqlType(timestamp), Default(None)
   *  @param `checkout date time` Database column Checkout Date Time SqlType(timestamp), Default(None)
   *  @param `return date time` Database column Return Date Time SqlType(timestamp), Default(None) */
  case class TableauConsignmentReportsRow(time: Option[String] = None, `consignment number`: Option[String] = None, `article barcode`: Option[String] = None, status: Option[String] = None, `check in date`: Option[java.sql.Date] = None, `check in time`: Option[java.sql.Time] = None, `check out date`: Option[java.sql.Date] = None, `check out time`: Option[java.sql.Time] = None, `return date`: Option[java.sql.Date] = None, `return time`: Option[String] = None, `time zone`: Option[String] = None, description: Option[String] = None, carrier: Option[String] = None, carrier2: Option[String] = None, `store name`: Option[String] = None, `store dlb`: Option[String] = None, `store suburb`: Option[String] = None, `store state`: Option[String] = None, `store postcode`: Option[String] = None, `store type`: Option[String] = None, `cp location code`: Option[String] = None, `dhl location code`: Option[String] = None, `toll location code`: Option[String] = None, `dhl sc location code`: Option[String] = None, `total weight`: Option[String] = None, `receiver name`: Option[String] = None, pod: Option[String] = None, id: Int, `checkin date time`: Option[java.sql.Timestamp] = None, `checkout date time`: Option[java.sql.Timestamp] = None, `return date time`: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching TableauConsignmentReportsRow objects using plain SQL queries */
  implicit def GetResultTableauConsignmentReportsRow(implicit e0: GR[Option[String]], e1: GR[Option[java.sql.Date]], e2: GR[Option[java.sql.Time]], e3: GR[Int], e4: GR[Option[java.sql.Timestamp]]): GR[TableauConsignmentReportsRow] = GR{
    prs => import prs._
    TableauConsignmentReportsRow(<<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Date], <<?[java.sql.Time], <<?[java.sql.Date], <<?[java.sql.Time], <<?[java.sql.Date], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Int], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp])
  }
  /** Table description of table tableau_consignment_reports. Objects of this class serve as prototypes for rows in queries. */
  class TableauConsignmentReports(_tableTag: Tag) extends profile.api.Table[TableauConsignmentReportsRow](_tableTag, Some("reports"), "tableau_consignment_reports") {
    def * = (time :: `consignment number` :: `article barcode` :: status :: `check in date` :: `check in time` :: `check out date` :: `check out time` :: `return date` :: `return time` :: `time zone` :: description :: carrier :: carrier2 :: `store name` :: `store dlb` :: `store suburb` :: `store state` :: `store postcode` :: `store type` :: `cp location code` :: `dhl location code` :: `toll location code` :: `dhl sc location code` :: `total weight` :: `receiver name` :: pod :: id :: `checkin date time` :: `checkout date time` :: `return date time` :: HNil).mapTo[TableauConsignmentReportsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (time :: `consignment number` :: `article barcode` :: status :: `check in date` :: `check in time` :: `check out date` :: `check out time` :: `return date` :: `return time` :: `time zone` :: description :: carrier :: carrier2 :: `store name` :: `store dlb` :: `store suburb` :: `store state` :: `store postcode` :: `store type` :: `cp location code` :: `dhl location code` :: `toll location code` :: `dhl sc location code` :: `total weight` :: `receiver name` :: pod :: Rep.Some(id) :: `checkin date time` :: `checkout date time` :: `return date time` :: HNil).shaped.<>(r => TableauConsignmentReportsRow(r(0).asInstanceOf[Option[String]], r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[String]], r(4).asInstanceOf[Option[java.sql.Date]], r(5).asInstanceOf[Option[java.sql.Time]], r(6).asInstanceOf[Option[java.sql.Date]], r(7).asInstanceOf[Option[java.sql.Time]], r(8).asInstanceOf[Option[java.sql.Date]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[String]], r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]], r(21).asInstanceOf[Option[String]], r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[String]], r(24).asInstanceOf[Option[String]], r(25).asInstanceOf[Option[String]], r(26).asInstanceOf[Option[String]], r(27).asInstanceOf[Option[Int]].get, r(28).asInstanceOf[Option[java.sql.Timestamp]], r(29).asInstanceOf[Option[java.sql.Timestamp]], r(30).asInstanceOf[Option[java.sql.Timestamp]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Time SqlType(varchar), Default(None) */
    val time: Rep[Option[String]] = column[Option[String]]("Time", O.Default(None))
    /** Database column Consignment Number SqlType(text), Default(None) */
    val `consignment number`: Rep[Option[String]] = column[Option[String]]("Consignment Number", O.Default(None))
    /** Database column Article Barcode SqlType(text), Default(None) */
    val `article barcode`: Rep[Option[String]] = column[Option[String]]("Article Barcode", O.Default(None))
    /** Database column Status SqlType(varchar), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("Status", O.Default(None))
    /** Database column Check in Date SqlType(date), Default(None) */
    val `check in date`: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("Check in Date", O.Default(None))
    /** Database column Check in Time SqlType(time), Default(None) */
    val `check in time`: Rep[Option[java.sql.Time]] = column[Option[java.sql.Time]]("Check in Time", O.Default(None))
    /** Database column Check Out Date SqlType(date), Default(None) */
    val `check out date`: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("Check Out Date", O.Default(None))
    /** Database column Check Out Time SqlType(time), Default(None) */
    val `check out time`: Rep[Option[java.sql.Time]] = column[Option[java.sql.Time]]("Check Out Time", O.Default(None))
    /** Database column Return Date SqlType(date), Default(None) */
    val `return date`: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("Return Date", O.Default(None))
    /** Database column Return Time SqlType(varchar), Default(None) */
    val `return time`: Rep[Option[String]] = column[Option[String]]("Return Time", O.Default(None))
    /** Database column Time Zone SqlType(varchar), Default(None) */
    val `time zone`: Rep[Option[String]] = column[Option[String]]("Time Zone", O.Default(None))
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column Carrier SqlType(varchar), Default(None) */
    val carrier: Rep[Option[String]] = column[Option[String]]("Carrier", O.Default(None))
    /** Database column Carrier2 SqlType(varchar), Default(None) */
    val carrier2: Rep[Option[String]] = column[Option[String]]("Carrier2", O.Default(None))
    /** Database column Store Name SqlType(varchar), Default(None) */
    val `store name`: Rep[Option[String]] = column[Option[String]]("Store Name", O.Default(None))
    /** Database column Store DLB SqlType(varchar), Default(None) */
    val `store dlb`: Rep[Option[String]] = column[Option[String]]("Store DLB", O.Default(None))
    /** Database column Store Suburb SqlType(varchar), Default(None) */
    val `store suburb`: Rep[Option[String]] = column[Option[String]]("Store Suburb", O.Default(None))
    /** Database column Store State SqlType(varchar), Default(None) */
    val `store state`: Rep[Option[String]] = column[Option[String]]("Store State", O.Default(None))
    /** Database column Store Postcode SqlType(varchar), Default(None) */
    val `store postcode`: Rep[Option[String]] = column[Option[String]]("Store Postcode", O.Default(None))
    /** Database column Store Type SqlType(varchar), Default(None) */
    val `store type`: Rep[Option[String]] = column[Option[String]]("Store Type", O.Default(None))
    /** Database column CP Location Code SqlType(varchar), Default(None) */
    val `cp location code`: Rep[Option[String]] = column[Option[String]]("CP Location Code", O.Default(None))
    /** Database column DHL Location Code SqlType(varchar), Default(None) */
    val `dhl location code`: Rep[Option[String]] = column[Option[String]]("DHL Location Code", O.Default(None))
    /** Database column Toll Location Code SqlType(varchar), Default(None) */
    val `toll location code`: Rep[Option[String]] = column[Option[String]]("Toll Location Code", O.Default(None))
    /** Database column DHL SC Location Code SqlType(varchar), Default(None) */
    val `dhl sc location code`: Rep[Option[String]] = column[Option[String]]("DHL SC Location Code", O.Default(None))
    /** Database column Total Weight SqlType(varchar), Default(None) */
    val `total weight`: Rep[Option[String]] = column[Option[String]]("Total Weight", O.Default(None))
    /** Database column Receiver Name SqlType(varchar), Default(None) */
    val `receiver name`: Rep[Option[String]] = column[Option[String]]("Receiver Name", O.Default(None))
    /** Database column POD SqlType(varchar), Default(None) */
    val pod: Rep[Option[String]] = column[Option[String]]("POD", O.Default(None))
    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column Checkin Date Time SqlType(timestamp), Default(None) */
    val `checkin date time`: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("Checkin Date Time", O.Default(None))
    /** Database column Checkout Date Time SqlType(timestamp), Default(None) */
    val `checkout date time`: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("Checkout Date Time", O.Default(None))
    /** Database column Return Date Time SqlType(timestamp), Default(None) */
    val `return date time`: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("Return Date Time", O.Default(None))

    /** Uniqueness Index over (`consignment number`) (database name tableau_consignment_reports_consignment_number_idx) */
    val index1 = index("tableau_consignment_reports_consignment_number_idx", `consignment number` :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table TableauConsignmentReports */
  lazy val TableauConsignmentReports = new TableQuery(tag => new TableauConsignmentReports(tag))
}
