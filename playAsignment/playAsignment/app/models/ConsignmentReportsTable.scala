package models
// AUTO-GENERATED Slick data model for table ConsignmentReports
trait ConsignmentReportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentReports
   *  @param `article barcode` Database column Article Barcode SqlType(text), Default(None)
   *  @param carrier Database column Carrier SqlType(varchar), Default(None)
   *  @param carrier2 Database column Carrier2 SqlType(varchar), Default(None)
   *  @param `check in date` Database column Check in Date SqlType(varchar), Default(None)
   *  @param `check in time` Database column Check in Time SqlType(varchar), Default(None)
   *  @param `check out date` Database column Check Out Date SqlType(varchar), Default(None)
   *  @param `check out time` Database column Check Out Time SqlType(varchar), Default(None)
   *  @param `consignment number` Database column Consignment Number SqlType(text), Default(None)
   *  @param `cp location code` Database column CP Location Code SqlType(varchar), Default(None)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param `dhl location code` Database column DHL Location Code SqlType(varchar), Default(None)
   *  @param `dhl sc location code` Database column DHL SC Location Code SqlType(varchar), Default(None)
   *  @param pod Database column POD SqlType(varchar), Default(None)
   *  @param `receiver name` Database column Receiver Name SqlType(varchar), Default(None)
   *  @param `return date` Database column Return Date SqlType(varchar), Default(None)
   *  @param `return time` Database column Return Time SqlType(varchar), Default(None)
   *  @param status Database column Status SqlType(varchar), Default(None)
   *  @param `store dlb` Database column Store DLB SqlType(varchar), Default(None)
   *  @param `store name` Database column Store Name SqlType(varchar), Default(None)
   *  @param `store postcode` Database column Store Postcode SqlType(varchar), Default(None)
   *  @param `store state` Database column Store State SqlType(varchar), Default(None)
   *  @param `store suburb` Database column Store Suburb SqlType(varchar), Default(None)
   *  @param `store type` Database column Store Type SqlType(varchar), Default(None)
   *  @param time Database column Time SqlType(varchar), Default(None)
   *  @param `time zone` Database column Time Zone SqlType(varchar), Default(None)
   *  @param `toll location code` Database column Toll Location Code SqlType(varchar), Default(None)
   *  @param `total weight` Database column Total Weight SqlType(varchar), Default(None) */
  case class ConsignmentReportsRow(`article barcode`: Option[String] = None, carrier: Option[String] = None, carrier2: Option[String] = None, `check in date`: Option[String] = None, `check in time`: Option[String] = None, `check out date`: Option[String] = None, `check out time`: Option[String] = None, `consignment number`: Option[String] = None, `cp location code`: Option[String] = None, description: Option[String] = None, `dhl location code`: Option[String] = None, `dhl sc location code`: Option[String] = None, pod: Option[String] = None, `receiver name`: Option[String] = None, `return date`: Option[String] = None, `return time`: Option[String] = None, status: Option[String] = None, `store dlb`: Option[String] = None, `store name`: Option[String] = None, `store postcode`: Option[String] = None, `store state`: Option[String] = None, `store suburb`: Option[String] = None, `store type`: Option[String] = None, time: Option[String] = None, `time zone`: Option[String] = None, `toll location code`: Option[String] = None, `total weight`: Option[String] = None)
  /** GetResult implicit for fetching ConsignmentReportsRow objects using plain SQL queries */
  implicit def GetResultConsignmentReportsRow(implicit e0: GR[Option[String]]): GR[ConsignmentReportsRow] = GR{
    prs => import prs._
    ConsignmentReportsRow(<<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String])
  }
  /** Table description of table consignment_reports. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentReports(_tableTag: Tag) extends profile.api.Table[ConsignmentReportsRow](_tableTag, Some("reports"), "consignment_reports") {
    def * = (`article barcode` :: carrier :: carrier2 :: `check in date` :: `check in time` :: `check out date` :: `check out time` :: `consignment number` :: `cp location code` :: description :: `dhl location code` :: `dhl sc location code` :: pod :: `receiver name` :: `return date` :: `return time` :: status :: `store dlb` :: `store name` :: `store postcode` :: `store state` :: `store suburb` :: `store type` :: time :: `time zone` :: `toll location code` :: `total weight` :: HNil).mapTo[ConsignmentReportsRow]

    /** Database column Article Barcode SqlType(text), Default(None) */
    val `article barcode`: Rep[Option[String]] = column[Option[String]]("Article Barcode", O.Default(None))
    /** Database column Carrier SqlType(varchar), Default(None) */
    val carrier: Rep[Option[String]] = column[Option[String]]("Carrier", O.Default(None))
    /** Database column Carrier2 SqlType(varchar), Default(None) */
    val carrier2: Rep[Option[String]] = column[Option[String]]("Carrier2", O.Default(None))
    /** Database column Check in Date SqlType(varchar), Default(None) */
    val `check in date`: Rep[Option[String]] = column[Option[String]]("Check in Date", O.Default(None))
    /** Database column Check in Time SqlType(varchar), Default(None) */
    val `check in time`: Rep[Option[String]] = column[Option[String]]("Check in Time", O.Default(None))
    /** Database column Check Out Date SqlType(varchar), Default(None) */
    val `check out date`: Rep[Option[String]] = column[Option[String]]("Check Out Date", O.Default(None))
    /** Database column Check Out Time SqlType(varchar), Default(None) */
    val `check out time`: Rep[Option[String]] = column[Option[String]]("Check Out Time", O.Default(None))
    /** Database column Consignment Number SqlType(text), Default(None) */
    val `consignment number`: Rep[Option[String]] = column[Option[String]]("Consignment Number", O.Default(None))
    /** Database column CP Location Code SqlType(varchar), Default(None) */
    val `cp location code`: Rep[Option[String]] = column[Option[String]]("CP Location Code", O.Default(None))
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column DHL Location Code SqlType(varchar), Default(None) */
    val `dhl location code`: Rep[Option[String]] = column[Option[String]]("DHL Location Code", O.Default(None))
    /** Database column DHL SC Location Code SqlType(varchar), Default(None) */
    val `dhl sc location code`: Rep[Option[String]] = column[Option[String]]("DHL SC Location Code", O.Default(None))
    /** Database column POD SqlType(varchar), Default(None) */
    val pod: Rep[Option[String]] = column[Option[String]]("POD", O.Default(None))
    /** Database column Receiver Name SqlType(varchar), Default(None) */
    val `receiver name`: Rep[Option[String]] = column[Option[String]]("Receiver Name", O.Default(None))
    /** Database column Return Date SqlType(varchar), Default(None) */
    val `return date`: Rep[Option[String]] = column[Option[String]]("Return Date", O.Default(None))
    /** Database column Return Time SqlType(varchar), Default(None) */
    val `return time`: Rep[Option[String]] = column[Option[String]]("Return Time", O.Default(None))
    /** Database column Status SqlType(varchar), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("Status", O.Default(None))
    /** Database column Store DLB SqlType(varchar), Default(None) */
    val `store dlb`: Rep[Option[String]] = column[Option[String]]("Store DLB", O.Default(None))
    /** Database column Store Name SqlType(varchar), Default(None) */
    val `store name`: Rep[Option[String]] = column[Option[String]]("Store Name", O.Default(None))
    /** Database column Store Postcode SqlType(varchar), Default(None) */
    val `store postcode`: Rep[Option[String]] = column[Option[String]]("Store Postcode", O.Default(None))
    /** Database column Store State SqlType(varchar), Default(None) */
    val `store state`: Rep[Option[String]] = column[Option[String]]("Store State", O.Default(None))
    /** Database column Store Suburb SqlType(varchar), Default(None) */
    val `store suburb`: Rep[Option[String]] = column[Option[String]]("Store Suburb", O.Default(None))
    /** Database column Store Type SqlType(varchar), Default(None) */
    val `store type`: Rep[Option[String]] = column[Option[String]]("Store Type", O.Default(None))
    /** Database column Time SqlType(varchar), Default(None) */
    val time: Rep[Option[String]] = column[Option[String]]("Time", O.Default(None))
    /** Database column Time Zone SqlType(varchar), Default(None) */
    val `time zone`: Rep[Option[String]] = column[Option[String]]("Time Zone", O.Default(None))
    /** Database column Toll Location Code SqlType(varchar), Default(None) */
    val `toll location code`: Rep[Option[String]] = column[Option[String]]("Toll Location Code", O.Default(None))
    /** Database column Total Weight SqlType(varchar), Default(None) */
    val `total weight`: Rep[Option[String]] = column[Option[String]]("Total Weight", O.Default(None))
  }
  /** Collection-like TableQuery object for table ConsignmentReports */
  lazy val ConsignmentReports = new TableQuery(tag => new ConsignmentReports(tag))
}
