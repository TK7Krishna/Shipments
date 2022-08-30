package models
// AUTO-GENERATED Slick data model for table TransactionAnalysisReports
trait TransactionAnalysisReportsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionAnalysisReports
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param timeZone Database column time_zone SqlType(text), Default(None)
   *  @param difference Database column difference SqlType(text), Default(None)
   *  @param lineId Database column line_id SqlType(int8), Default(None)
   *  @param transactionType Database column transaction_type SqlType(text), Default(None)
   *  @param courierCode Database column courier_code SqlType(text), Default(None)
   *  @param accountType Database column account_type SqlType(text), Default(None)
   *  @param checkInDate Database column check_in_date SqlType(timestamptz), Default(None)
   *  @param checkOutDate Database column check_out_date SqlType(timestamptz), Default(None)
   *  @param pod Database column pod SqlType(text), Default(None)
   *  @param storeName Database column store_name SqlType(text), Default(None)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param credit Database column credit SqlType(numeric), Default(None)
   *  @param debit Database column debit SqlType(numeric), Default(None)
   *  @param product Database column product SqlType(text), Default(None)
   *  @param txcode Database column txcode SqlType(text), Default(None)
   *  @param customers Database column customers SqlType(text), Default(None)
   *  @param account Database column account SqlType(text), Default(None)
   *  @param storeDlb Database column store_dlb SqlType(text), Default(None)
   *  @param storeSuburb Database column store_suburb SqlType(text), Default(None)
   *  @param storeState Database column store_state SqlType(text), Default(None)
   *  @param storePostcode Database column store_postcode SqlType(text), Default(None)
   *  @param storeType Database column store_type SqlType(text), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param receiverName Database column receiver_name SqlType(text), Default(None)
   *  @param senderSuburb Database column sender_suburb SqlType(text), Default(None)
   *  @param senderState Database column sender_state SqlType(text), Default(None)
   *  @param senderPostcode Database column sender_postcode SqlType(text), Default(None)
   *  @param destinationSuburb Database column destination_suburb SqlType(text), Default(None)
   *  @param destinationState Database column destination_state SqlType(text), Default(None)
   *  @param destinationPostcode Database column destination_postcode SqlType(text), Default(None)
   *  @param destinationCountry Database column destination_country SqlType(text), Default(None)
   *  @param totalWeightKg Database column total_weight_kg SqlType(numeric), Default(None)
   *  @param parcelCount Database column parcel_count SqlType(int4), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param newCredit Database column new_credit SqlType(numeric), Default(None)
   *  @param barcode Database column barcode SqlType(text), Default(None)
   *  @param header Database column header SqlType(int8), Default(None)
   *  @param accountTypeId Database column account_type_id SqlType(int8), Default(None)
   *  @param locationType Database column location_type SqlType(text), Default(None)
   *  @param storeAddress Database column store_address SqlType(text), Default(None)
   *  @param storeLatitude Database column store_latitude SqlType(float8), Default(None)
   *  @param storeLongitude Database column store_longitude SqlType(float8), Default(None)
   *  @param storeCountry Database column store_country SqlType(text), Default(None)
   *  @param channel Database column channel SqlType(text), Default(None)
   *  @param biLocationType Database column bi_location_type SqlType(text), Default(None) */
  case class TransactionAnalysisReportsRow(id: Long, timeZone: Option[String] = None, difference: Option[String] = None, lineId: Option[Long] = None, transactionType: Option[String] = None, courierCode: Option[String] = None, accountType: Option[String] = None, checkInDate: Option[java.sql.Timestamp] = None, checkOutDate: Option[java.sql.Timestamp] = None, pod: Option[String] = None, storeName: Option[String] = None, description: Option[String] = None, credit: Option[scala.math.BigDecimal] = None, debit: Option[scala.math.BigDecimal] = None, product: Option[String] = None, txcode: Option[String] = None, customers: Option[String] = None, account: Option[String] = None, storeDlb: Option[String] = None, storeSuburb: Option[String] = None, storeState: Option[String] = None, storePostcode: Option[String] = None, storeType: Option[String] = None, consignmentNumber: Option[String] = None, receiverName: Option[String] = None, senderSuburb: Option[String] = None, senderState: Option[String] = None, senderPostcode: Option[String] = None, destinationSuburb: Option[String] = None, destinationState: Option[String] = None, destinationPostcode: Option[String] = None, destinationCountry: Option[String] = None, totalWeightKg: Option[scala.math.BigDecimal] = None, parcelCount: Option[Int] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, newCredit: Option[scala.math.BigDecimal] = None, barcode: Option[String] = None, header: Option[Long] = None, accountTypeId: Option[Long] = None, locationType: Option[String] = None, storeAddress: Option[String] = None, storeLatitude: Option[Double] = None, storeLongitude: Option[Double] = None, storeCountry: Option[String] = None, channel: Option[String] = None, biLocationType: Option[String] = None)
  /** GetResult implicit for fetching TransactionAnalysisReportsRow objects using plain SQL queries */
  implicit def GetResultTransactionAnalysisReportsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[scala.math.BigDecimal]], e5: GR[Option[Int]], e6: GR[java.sql.Timestamp], e7: GR[Option[Double]]): GR[TransactionAnalysisReportsRow] = GR{
    prs => import prs._
    TransactionAnalysisReportsRow(<<[Long], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[String], <<?[Long], <<?[Long], <<?[String], <<?[String], <<?[Double], <<?[Double], <<?[String], <<?[String], <<?[String])
  }
  /** Table description of table transaction_analysis_reports. Objects of this class serve as prototypes for rows in queries. */
  class TransactionAnalysisReports(_tableTag: Tag) extends profile.api.Table[TransactionAnalysisReportsRow](_tableTag, Some("reports"), "transaction_analysis_reports") {
    def * = (id :: timeZone :: difference :: lineId :: transactionType :: courierCode :: accountType :: checkInDate :: checkOutDate :: pod :: storeName :: description :: credit :: debit :: product :: txcode :: customers :: account :: storeDlb :: storeSuburb :: storeState :: storePostcode :: storeType :: consignmentNumber :: receiverName :: senderSuburb :: senderState :: senderPostcode :: destinationSuburb :: destinationState :: destinationPostcode :: destinationCountry :: totalWeightKg :: parcelCount :: createdAt :: modifiedAt :: newCredit :: barcode :: header :: accountTypeId :: locationType :: storeAddress :: storeLatitude :: storeLongitude :: storeCountry :: channel :: biLocationType :: HNil).mapTo[TransactionAnalysisReportsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: timeZone :: difference :: lineId :: transactionType :: courierCode :: accountType :: checkInDate :: checkOutDate :: pod :: storeName :: description :: credit :: debit :: product :: txcode :: customers :: account :: storeDlb :: storeSuburb :: storeState :: storePostcode :: storeType :: consignmentNumber :: receiverName :: senderSuburb :: senderState :: senderPostcode :: destinationSuburb :: destinationState :: destinationPostcode :: destinationCountry :: totalWeightKg :: parcelCount :: Rep.Some(createdAt) :: Rep.Some(modifiedAt) :: newCredit :: barcode :: header :: accountTypeId :: locationType :: storeAddress :: storeLatitude :: storeLongitude :: storeCountry :: channel :: biLocationType :: HNil).shaped.<>(r => TransactionAnalysisReportsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Long]], r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[java.sql.Timestamp]], r(8).asInstanceOf[Option[java.sql.Timestamp]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[scala.math.BigDecimal]], r(13).asInstanceOf[Option[scala.math.BigDecimal]], r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]], r(21).asInstanceOf[Option[String]], r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[String]], r(24).asInstanceOf[Option[String]], r(25).asInstanceOf[Option[String]], r(26).asInstanceOf[Option[String]], r(27).asInstanceOf[Option[String]], r(28).asInstanceOf[Option[String]], r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[String]], r(31).asInstanceOf[Option[String]], r(32).asInstanceOf[Option[scala.math.BigDecimal]], r(33).asInstanceOf[Option[Int]], r(34).asInstanceOf[Option[java.sql.Timestamp]].get, r(35).asInstanceOf[Option[java.sql.Timestamp]].get, r(36).asInstanceOf[Option[scala.math.BigDecimal]], r(37).asInstanceOf[Option[String]], r(38).asInstanceOf[Option[Long]], r(39).asInstanceOf[Option[Long]], r(40).asInstanceOf[Option[String]], r(41).asInstanceOf[Option[String]], r(42).asInstanceOf[Option[Double]], r(43).asInstanceOf[Option[Double]], r(44).asInstanceOf[Option[String]], r(45).asInstanceOf[Option[String]], r(46).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column time_zone SqlType(text), Default(None) */
    val timeZone: Rep[Option[String]] = column[Option[String]]("time_zone", O.Default(None))
    /** Database column difference SqlType(text), Default(None) */
    val difference: Rep[Option[String]] = column[Option[String]]("difference", O.Default(None))
    /** Database column line_id SqlType(int8), Default(None) */
    val lineId: Rep[Option[Long]] = column[Option[Long]]("line_id", O.Default(None))
    /** Database column transaction_type SqlType(text), Default(None) */
    val transactionType: Rep[Option[String]] = column[Option[String]]("transaction_type", O.Default(None))
    /** Database column courier_code SqlType(text), Default(None) */
    val courierCode: Rep[Option[String]] = column[Option[String]]("courier_code", O.Default(None))
    /** Database column account_type SqlType(text), Default(None) */
    val accountType: Rep[Option[String]] = column[Option[String]]("account_type", O.Default(None))
    /** Database column check_in_date SqlType(timestamptz), Default(None) */
    val checkInDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("check_in_date", O.Default(None))
    /** Database column check_out_date SqlType(timestamptz), Default(None) */
    val checkOutDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("check_out_date", O.Default(None))
    /** Database column pod SqlType(text), Default(None) */
    val pod: Rep[Option[String]] = column[Option[String]]("pod", O.Default(None))
    /** Database column store_name SqlType(text), Default(None) */
    val storeName: Rep[Option[String]] = column[Option[String]]("store_name", O.Default(None))
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column credit SqlType(numeric), Default(None) */
    val credit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("credit", O.Default(None))
    /** Database column debit SqlType(numeric), Default(None) */
    val debit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("debit", O.Default(None))
    /** Database column product SqlType(text), Default(None) */
    val product: Rep[Option[String]] = column[Option[String]]("product", O.Default(None))
    /** Database column txcode SqlType(text), Default(None) */
    val txcode: Rep[Option[String]] = column[Option[String]]("txcode", O.Default(None))
    /** Database column customers SqlType(text), Default(None) */
    val customers: Rep[Option[String]] = column[Option[String]]("customers", O.Default(None))
    /** Database column account SqlType(text), Default(None) */
    val account: Rep[Option[String]] = column[Option[String]]("account", O.Default(None))
    /** Database column store_dlb SqlType(text), Default(None) */
    val storeDlb: Rep[Option[String]] = column[Option[String]]("store_dlb", O.Default(None))
    /** Database column store_suburb SqlType(text), Default(None) */
    val storeSuburb: Rep[Option[String]] = column[Option[String]]("store_suburb", O.Default(None))
    /** Database column store_state SqlType(text), Default(None) */
    val storeState: Rep[Option[String]] = column[Option[String]]("store_state", O.Default(None))
    /** Database column store_postcode SqlType(text), Default(None) */
    val storePostcode: Rep[Option[String]] = column[Option[String]]("store_postcode", O.Default(None))
    /** Database column store_type SqlType(text), Default(None) */
    val storeType: Rep[Option[String]] = column[Option[String]]("store_type", O.Default(None))
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column receiver_name SqlType(text), Default(None) */
    val receiverName: Rep[Option[String]] = column[Option[String]]("receiver_name", O.Default(None))
    /** Database column sender_suburb SqlType(text), Default(None) */
    val senderSuburb: Rep[Option[String]] = column[Option[String]]("sender_suburb", O.Default(None))
    /** Database column sender_state SqlType(text), Default(None) */
    val senderState: Rep[Option[String]] = column[Option[String]]("sender_state", O.Default(None))
    /** Database column sender_postcode SqlType(text), Default(None) */
    val senderPostcode: Rep[Option[String]] = column[Option[String]]("sender_postcode", O.Default(None))
    /** Database column destination_suburb SqlType(text), Default(None) */
    val destinationSuburb: Rep[Option[String]] = column[Option[String]]("destination_suburb", O.Default(None))
    /** Database column destination_state SqlType(text), Default(None) */
    val destinationState: Rep[Option[String]] = column[Option[String]]("destination_state", O.Default(None))
    /** Database column destination_postcode SqlType(text), Default(None) */
    val destinationPostcode: Rep[Option[String]] = column[Option[String]]("destination_postcode", O.Default(None))
    /** Database column destination_country SqlType(text), Default(None) */
    val destinationCountry: Rep[Option[String]] = column[Option[String]]("destination_country", O.Default(None))
    /** Database column total_weight_kg SqlType(numeric), Default(None) */
    val totalWeightKg: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("total_weight_kg", O.Default(None))
    /** Database column parcel_count SqlType(int4), Default(None) */
    val parcelCount: Rep[Option[Int]] = column[Option[Int]]("parcel_count", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column new_credit SqlType(numeric), Default(None) */
    val newCredit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("new_credit", O.Default(None))
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))
    /** Database column header SqlType(int8), Default(None) */
    val header: Rep[Option[Long]] = column[Option[Long]]("header", O.Default(None))
    /** Database column account_type_id SqlType(int8), Default(None) */
    val accountTypeId: Rep[Option[Long]] = column[Option[Long]]("account_type_id", O.Default(None))
    /** Database column location_type SqlType(text), Default(None) */
    val locationType: Rep[Option[String]] = column[Option[String]]("location_type", O.Default(None))
    /** Database column store_address SqlType(text), Default(None) */
    val storeAddress: Rep[Option[String]] = column[Option[String]]("store_address", O.Default(None))
    /** Database column store_latitude SqlType(float8), Default(None) */
    val storeLatitude: Rep[Option[Double]] = column[Option[Double]]("store_latitude", O.Default(None))
    /** Database column store_longitude SqlType(float8), Default(None) */
    val storeLongitude: Rep[Option[Double]] = column[Option[Double]]("store_longitude", O.Default(None))
    /** Database column store_country SqlType(text), Default(None) */
    val storeCountry: Rep[Option[String]] = column[Option[String]]("store_country", O.Default(None))
    /** Database column channel SqlType(text), Default(None) */
    val channel: Rep[Option[String]] = column[Option[String]]("channel", O.Default(None))
    /** Database column bi_location_type SqlType(text), Default(None) */
    val biLocationType: Rep[Option[String]] = column[Option[String]]("bi_location_type", O.Default(None))

    /** Index over (checkOutDate) (database name check_out_date_idx) */
    val index1 = index("check_out_date_idx", checkOutDate :: HNil)
    /** Index over (courierCode) (database name courier_code_idx) */
    val index2 = index("courier_code_idx", courierCode :: HNil)
    /** Index over (lineId) (database name line_id_idx) */
    val index3 = index("line_id_idx", lineId :: HNil)
    /** Index over (parcelCount) (database name parcel_count_idx) */
    val index4 = index("parcel_count_idx", parcelCount :: HNil)
  }
  /** Collection-like TableQuery object for table TransactionAnalysisReports */
  lazy val TransactionAnalysisReports = new TableQuery(tag => new TransactionAnalysisReports(tag))
}
