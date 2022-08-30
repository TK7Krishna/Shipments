package models
// AUTO-GENERATED Slick data model for table PaperlessLabelDetails
trait PaperlessLabelDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaperlessLabelDetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param barcode Database column barcode SqlType(text), Default(None)
   *  @param quantity Database column quantity SqlType(int4)
   *  @param length Database column length SqlType(int4)
   *  @param height Database column height SqlType(int4)
   *  @param width Database column width SqlType(int4)
   *  @param physicalWeight Database column physical_weight SqlType(float8)
   *  @param volumetricweight Database column volumetricweight SqlType(float8)
   *  @param contactFirstName Database column contact_first_name SqlType(text)
   *  @param contactLastName Database column contact_last_name SqlType(text)
   *  @param contactCompanyName Database column contact_company_name SqlType(text), Default(None)
   *  @param contactEmail Database column contact_email SqlType(text)
   *  @param contactAddress1 Database column contact_address_1 SqlType(text)
   *  @param contactAddress2 Database column contact_address_2 SqlType(text), Default(None)
   *  @param contactSuburb Database column contact_suburb SqlType(text)
   *  @param contactState Database column contact_state SqlType(text)
   *  @param contactPostcode Database column contact_postcode SqlType(text)
   *  @param contactCountry Database column contact_country SqlType(text), Default(None)
   *  @param contactPhone Database column contact_phone SqlType(text)
   *  @param destinationFirstName Database column destination_first_name SqlType(text)
   *  @param destinationLastName Database column destination_last_name SqlType(text)
   *  @param destinationCompanyName Database column destination_company_name SqlType(text), Default(None)
   *  @param destinationEmail Database column destination_email SqlType(text)
   *  @param destinationAddress1 Database column destination_address_1 SqlType(text)
   *  @param destinationAddress2 Database column destination_address_2 SqlType(text), Default(None)
   *  @param destinationSuburb Database column destination_suburb SqlType(text)
   *  @param destinationState Database column destination_state SqlType(text)
   *  @param destinationPostcode Database column destination_postcode SqlType(text)
   *  @param destinationCountry Database column destination_country SqlType(text), Default(None)
   *  @param destinationPhone Database column destination_phone SqlType(text)
   *  @param dangerousGoods Database column dangerous_goods SqlType(bool)
   *  @param termsAccepted Database column terms_accepted SqlType(bool)
   *  @param pickupFirstName Database column pickup_first_name SqlType(text)
   *  @param pickupLastName Database column pickup_last_name SqlType(text)
   *  @param pickupIsBusiness Database column pickup_is_business SqlType(bool)
   *  @param pickupCompanyName Database column pickup_company_name SqlType(text), Default(None)
   *  @param pickupEmail Database column pickup_email SqlType(text)
   *  @param pickupAddress1 Database column pickup_address_1 SqlType(text)
   *  @param pickupAddress2 Database column pickup_address_2 SqlType(text), Default(None)
   *  @param pickupSuburb Database column pickup_suburb SqlType(text)
   *  @param pickupState Database column pickup_state SqlType(text)
   *  @param pickupPostcode Database column pickup_postcode SqlType(text)
   *  @param pickupPhone Database column pickup_phone SqlType(text)
   *  @param specialInstruction Database column special_instruction SqlType(text), Default(None)
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None)
   *  @param service Database column service SqlType(text), Default(Road)
   *  @param serviceCode Database column service_code SqlType(text), Default(x)
   *  @param depotCode Database column depot_code SqlType(text), Default(Some(SYD))
   *  @param t1250ServiceCode Database column t1250_service_code SqlType(text)
   *  @param t1250ServiceName Database column t1250_service_name SqlType(text), Default(Off-peak Parcels)
   *  @param buCode Database column bu_code SqlType(text), Default(None)
   *  @param carrierName Database column carrier_name SqlType(text)
   *  @param extraChargeCodes Database column extra_charge_codes SqlType(text), Default(None)
   *  @param lineCommodityCode Database column line_commodity_code SqlType(text), Default(None)
   *  @param dispatchDate Database column dispatch_date SqlType(date)
   *  @param authorityToLeave Database column authority_to_leave SqlType(text), Default(None)
   *  @param security Database column security SqlType(text), Default(None)
   *  @param signatureRequired Database column signature_required SqlType(bool), Default(None)
   *  @param qrCountryCode Database column qr_country_code SqlType(text)
   *  @param gs1CountryCode Database column gs1_country_code SqlType(text)
   *  @param chargeAccountNumber Database column charge_account_number SqlType(text)
   *  @param chargeCode Database column charge_code SqlType(text)
   *  @param adpFlag Database column adp_flag SqlType(bool), Default(false)
   *  @param nsrFlag Database column nsr_flag SqlType(bool), Default(false)
   *  @param receiverAddressCode Database column receiver_address_code SqlType(text), Default(B)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param descriptionOfGoods Database column description_of_goods SqlType(text), Default(None)
   *  @param carrier Database column carrier SqlType(text), Default(None)
   *  @param signatureText Database column signature_text SqlType(text), Default(None)
   *  @param reference Database column reference SqlType(text), Default(None) */
  case class PaperlessLabelDetailsRow(id: Long, consignmentNumber: Option[String] = None, barcode: Option[String] = None, quantity: Int, length: Int, height: Int, width: Int, physicalWeight: Double, volumetricweight: Double, contactFirstName: String, contactLastName: String, contactCompanyName: Option[String] = None, contactEmail: String, contactAddress1: String, contactAddress2: Option[String] = None, contactSuburb: String, contactState: String, contactPostcode: String, contactCountry: Option[String] = None, contactPhone: String, destinationFirstName: String, destinationLastName: String, destinationCompanyName: Option[String] = None, destinationEmail: String, destinationAddress1: String, destinationAddress2: Option[String] = None, destinationSuburb: String, destinationState: String, destinationPostcode: String, destinationCountry: Option[String] = None, destinationPhone: String, dangerousGoods: Boolean, termsAccepted: Boolean, pickupFirstName: String, pickupLastName: String, pickupIsBusiness: Boolean, pickupCompanyName: Option[String] = None, pickupEmail: String, pickupAddress1: String, pickupAddress2: Option[String] = None, pickupSuburb: String, pickupState: String, pickupPostcode: String, pickupPhone: String, specialInstruction: Option[String] = None, droplocationId: Option[Long] = None, service: String = "Road", serviceCode: String = "x", depotCode: Option[String] = Some("SYD"), t1250ServiceCode: String, t1250ServiceName: String = "Off-peak Parcels", buCode: Option[String] = None, carrierName: String, extraChargeCodes: Option[String] = None, lineCommodityCode: Option[String] = None, dispatchDate: java.sql.Date, authorityToLeave: Option[String] = None, security: Option[String] = None, signatureRequired: Option[Boolean] = None, qrCountryCode: String, gs1CountryCode: String, chargeAccountNumber: String, chargeCode: String, adpFlag: Boolean = false, nsrFlag: Boolean = false, receiverAddressCode: String = "B", createdAt: java.sql.Timestamp, descriptionOfGoods: Option[String] = None, carrier: Option[String] = None, signatureText: Option[String] = None, reference: Option[String] = None)
  /** GetResult implicit for fetching PaperlessLabelDetailsRow objects using plain SQL queries */
  implicit def GetResultPaperlessLabelDetailsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Int], e3: GR[Double], e4: GR[String], e5: GR[Boolean], e6: GR[Option[Long]], e7: GR[java.sql.Date], e8: GR[Option[Boolean]], e9: GR[java.sql.Timestamp]): GR[PaperlessLabelDetailsRow] = GR{
    prs => import prs._
    PaperlessLabelDetailsRow(<<[Long], <<?[String], <<?[String], <<[Int], <<[Int], <<[Int], <<[Int], <<[Double], <<[Double], <<[String], <<[String], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[Boolean], <<[Boolean], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[Long], <<[String], <<[String], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<?[String], <<?[String], <<[java.sql.Date], <<?[String], <<?[String], <<?[Boolean], <<[String], <<[String], <<[String], <<[String], <<[Boolean], <<[Boolean], <<[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String])
  }
  /** Table description of table paperless_label_details. Objects of this class serve as prototypes for rows in queries. */
  class PaperlessLabelDetails(_tableTag: Tag) extends profile.api.Table[PaperlessLabelDetailsRow](_tableTag, Some("ecommerce"), "paperless_label_details") {
    def * = (id :: consignmentNumber :: barcode :: quantity :: length :: height :: width :: physicalWeight :: volumetricweight :: contactFirstName :: contactLastName :: contactCompanyName :: contactEmail :: contactAddress1 :: contactAddress2 :: contactSuburb :: contactState :: contactPostcode :: contactCountry :: contactPhone :: destinationFirstName :: destinationLastName :: destinationCompanyName :: destinationEmail :: destinationAddress1 :: destinationAddress2 :: destinationSuburb :: destinationState :: destinationPostcode :: destinationCountry :: destinationPhone :: dangerousGoods :: termsAccepted :: pickupFirstName :: pickupLastName :: pickupIsBusiness :: pickupCompanyName :: pickupEmail :: pickupAddress1 :: pickupAddress2 :: pickupSuburb :: pickupState :: pickupPostcode :: pickupPhone :: specialInstruction :: droplocationId :: service :: serviceCode :: depotCode :: t1250ServiceCode :: t1250ServiceName :: buCode :: carrierName :: extraChargeCodes :: lineCommodityCode :: dispatchDate :: authorityToLeave :: security :: signatureRequired :: qrCountryCode :: gs1CountryCode :: chargeAccountNumber :: chargeCode :: adpFlag :: nsrFlag :: receiverAddressCode :: createdAt :: descriptionOfGoods :: carrier :: signatureText :: reference :: HNil).mapTo[PaperlessLabelDetailsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: consignmentNumber :: barcode :: Rep.Some(quantity) :: Rep.Some(length) :: Rep.Some(height) :: Rep.Some(width) :: Rep.Some(physicalWeight) :: Rep.Some(volumetricweight) :: Rep.Some(contactFirstName) :: Rep.Some(contactLastName) :: contactCompanyName :: Rep.Some(contactEmail) :: Rep.Some(contactAddress1) :: contactAddress2 :: Rep.Some(contactSuburb) :: Rep.Some(contactState) :: Rep.Some(contactPostcode) :: contactCountry :: Rep.Some(contactPhone) :: Rep.Some(destinationFirstName) :: Rep.Some(destinationLastName) :: destinationCompanyName :: Rep.Some(destinationEmail) :: Rep.Some(destinationAddress1) :: destinationAddress2 :: Rep.Some(destinationSuburb) :: Rep.Some(destinationState) :: Rep.Some(destinationPostcode) :: destinationCountry :: Rep.Some(destinationPhone) :: Rep.Some(dangerousGoods) :: Rep.Some(termsAccepted) :: Rep.Some(pickupFirstName) :: Rep.Some(pickupLastName) :: Rep.Some(pickupIsBusiness) :: pickupCompanyName :: Rep.Some(pickupEmail) :: Rep.Some(pickupAddress1) :: pickupAddress2 :: Rep.Some(pickupSuburb) :: Rep.Some(pickupState) :: Rep.Some(pickupPostcode) :: Rep.Some(pickupPhone) :: specialInstruction :: droplocationId :: Rep.Some(service) :: Rep.Some(serviceCode) :: depotCode :: Rep.Some(t1250ServiceCode) :: Rep.Some(t1250ServiceName) :: buCode :: Rep.Some(carrierName) :: extraChargeCodes :: lineCommodityCode :: Rep.Some(dispatchDate) :: authorityToLeave :: security :: signatureRequired :: Rep.Some(qrCountryCode) :: Rep.Some(gs1CountryCode) :: Rep.Some(chargeAccountNumber) :: Rep.Some(chargeCode) :: Rep.Some(adpFlag) :: Rep.Some(nsrFlag) :: Rep.Some(receiverAddressCode) :: Rep.Some(createdAt) :: descriptionOfGoods :: carrier :: signatureText :: reference :: HNil).shaped.<>(r => PaperlessLabelDetailsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Int]].get, r(4).asInstanceOf[Option[Int]].get, r(5).asInstanceOf[Option[Int]].get, r(6).asInstanceOf[Option[Int]].get, r(7).asInstanceOf[Option[Double]].get, r(8).asInstanceOf[Option[Double]].get, r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[String]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]].get, r(16).asInstanceOf[Option[String]].get, r(17).asInstanceOf[Option[String]].get, r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]].get, r(20).asInstanceOf[Option[String]].get, r(21).asInstanceOf[Option[String]].get, r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[String]].get, r(24).asInstanceOf[Option[String]].get, r(25).asInstanceOf[Option[String]], r(26).asInstanceOf[Option[String]].get, r(27).asInstanceOf[Option[String]].get, r(28).asInstanceOf[Option[String]].get, r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[String]].get, r(31).asInstanceOf[Option[Boolean]].get, r(32).asInstanceOf[Option[Boolean]].get, r(33).asInstanceOf[Option[String]].get, r(34).asInstanceOf[Option[String]].get, r(35).asInstanceOf[Option[Boolean]].get, r(36).asInstanceOf[Option[String]], r(37).asInstanceOf[Option[String]].get, r(38).asInstanceOf[Option[String]].get, r(39).asInstanceOf[Option[String]], r(40).asInstanceOf[Option[String]].get, r(41).asInstanceOf[Option[String]].get, r(42).asInstanceOf[Option[String]].get, r(43).asInstanceOf[Option[String]].get, r(44).asInstanceOf[Option[String]], r(45).asInstanceOf[Option[Long]], r(46).asInstanceOf[Option[String]].get, r(47).asInstanceOf[Option[String]].get, r(48).asInstanceOf[Option[String]], r(49).asInstanceOf[Option[String]].get, r(50).asInstanceOf[Option[String]].get, r(51).asInstanceOf[Option[String]], r(52).asInstanceOf[Option[String]].get, r(53).asInstanceOf[Option[String]], r(54).asInstanceOf[Option[String]], r(55).asInstanceOf[Option[java.sql.Date]].get, r(56).asInstanceOf[Option[String]], r(57).asInstanceOf[Option[String]], r(58).asInstanceOf[Option[Boolean]], r(59).asInstanceOf[Option[String]].get, r(60).asInstanceOf[Option[String]].get, r(61).asInstanceOf[Option[String]].get, r(62).asInstanceOf[Option[String]].get, r(63).asInstanceOf[Option[Boolean]].get, r(64).asInstanceOf[Option[Boolean]].get, r(65).asInstanceOf[Option[String]].get, r(66).asInstanceOf[Option[java.sql.Timestamp]].get, r(67).asInstanceOf[Option[String]], r(68).asInstanceOf[Option[String]], r(69).asInstanceOf[Option[String]], r(70).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))
    /** Database column quantity SqlType(int4) */
    val quantity: Rep[Int] = column[Int]("quantity")
    /** Database column length SqlType(int4) */
    val length: Rep[Int] = column[Int]("length")
    /** Database column height SqlType(int4) */
    val height: Rep[Int] = column[Int]("height")
    /** Database column width SqlType(int4) */
    val width: Rep[Int] = column[Int]("width")
    /** Database column physical_weight SqlType(float8) */
    val physicalWeight: Rep[Double] = column[Double]("physical_weight")
    /** Database column volumetricweight SqlType(float8) */
    val volumetricweight: Rep[Double] = column[Double]("volumetricweight")
    /** Database column contact_first_name SqlType(text) */
    val contactFirstName: Rep[String] = column[String]("contact_first_name")
    /** Database column contact_last_name SqlType(text) */
    val contactLastName: Rep[String] = column[String]("contact_last_name")
    /** Database column contact_company_name SqlType(text), Default(None) */
    val contactCompanyName: Rep[Option[String]] = column[Option[String]]("contact_company_name", O.Default(None))
    /** Database column contact_email SqlType(text) */
    val contactEmail: Rep[String] = column[String]("contact_email")
    /** Database column contact_address_1 SqlType(text) */
    val contactAddress1: Rep[String] = column[String]("contact_address_1")
    /** Database column contact_address_2 SqlType(text), Default(None) */
    val contactAddress2: Rep[Option[String]] = column[Option[String]]("contact_address_2", O.Default(None))
    /** Database column contact_suburb SqlType(text) */
    val contactSuburb: Rep[String] = column[String]("contact_suburb")
    /** Database column contact_state SqlType(text) */
    val contactState: Rep[String] = column[String]("contact_state")
    /** Database column contact_postcode SqlType(text) */
    val contactPostcode: Rep[String] = column[String]("contact_postcode")
    /** Database column contact_country SqlType(text), Default(None) */
    val contactCountry: Rep[Option[String]] = column[Option[String]]("contact_country", O.Default(None))
    /** Database column contact_phone SqlType(text) */
    val contactPhone: Rep[String] = column[String]("contact_phone")
    /** Database column destination_first_name SqlType(text) */
    val destinationFirstName: Rep[String] = column[String]("destination_first_name")
    /** Database column destination_last_name SqlType(text) */
    val destinationLastName: Rep[String] = column[String]("destination_last_name")
    /** Database column destination_company_name SqlType(text), Default(None) */
    val destinationCompanyName: Rep[Option[String]] = column[Option[String]]("destination_company_name", O.Default(None))
    /** Database column destination_email SqlType(text) */
    val destinationEmail: Rep[String] = column[String]("destination_email")
    /** Database column destination_address_1 SqlType(text) */
    val destinationAddress1: Rep[String] = column[String]("destination_address_1")
    /** Database column destination_address_2 SqlType(text), Default(None) */
    val destinationAddress2: Rep[Option[String]] = column[Option[String]]("destination_address_2", O.Default(None))
    /** Database column destination_suburb SqlType(text) */
    val destinationSuburb: Rep[String] = column[String]("destination_suburb")
    /** Database column destination_state SqlType(text) */
    val destinationState: Rep[String] = column[String]("destination_state")
    /** Database column destination_postcode SqlType(text) */
    val destinationPostcode: Rep[String] = column[String]("destination_postcode")
    /** Database column destination_country SqlType(text), Default(None) */
    val destinationCountry: Rep[Option[String]] = column[Option[String]]("destination_country", O.Default(None))
    /** Database column destination_phone SqlType(text) */
    val destinationPhone: Rep[String] = column[String]("destination_phone")
    /** Database column dangerous_goods SqlType(bool) */
    val dangerousGoods: Rep[Boolean] = column[Boolean]("dangerous_goods")
    /** Database column terms_accepted SqlType(bool) */
    val termsAccepted: Rep[Boolean] = column[Boolean]("terms_accepted")
    /** Database column pickup_first_name SqlType(text) */
    val pickupFirstName: Rep[String] = column[String]("pickup_first_name")
    /** Database column pickup_last_name SqlType(text) */
    val pickupLastName: Rep[String] = column[String]("pickup_last_name")
    /** Database column pickup_is_business SqlType(bool) */
    val pickupIsBusiness: Rep[Boolean] = column[Boolean]("pickup_is_business")
    /** Database column pickup_company_name SqlType(text), Default(None) */
    val pickupCompanyName: Rep[Option[String]] = column[Option[String]]("pickup_company_name", O.Default(None))
    /** Database column pickup_email SqlType(text) */
    val pickupEmail: Rep[String] = column[String]("pickup_email")
    /** Database column pickup_address_1 SqlType(text) */
    val pickupAddress1: Rep[String] = column[String]("pickup_address_1")
    /** Database column pickup_address_2 SqlType(text), Default(None) */
    val pickupAddress2: Rep[Option[String]] = column[Option[String]]("pickup_address_2", O.Default(None))
    /** Database column pickup_suburb SqlType(text) */
    val pickupSuburb: Rep[String] = column[String]("pickup_suburb")
    /** Database column pickup_state SqlType(text) */
    val pickupState: Rep[String] = column[String]("pickup_state")
    /** Database column pickup_postcode SqlType(text) */
    val pickupPostcode: Rep[String] = column[String]("pickup_postcode")
    /** Database column pickup_phone SqlType(text) */
    val pickupPhone: Rep[String] = column[String]("pickup_phone")
    /** Database column special_instruction SqlType(text), Default(None) */
    val specialInstruction: Rep[Option[String]] = column[Option[String]]("special_instruction", O.Default(None))
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))
    /** Database column service SqlType(text), Default(Road) */
    val service: Rep[String] = column[String]("service", O.Default("Road"))
    /** Database column service_code SqlType(text), Default(x) */
    val serviceCode: Rep[String] = column[String]("service_code", O.Default("x"))
    /** Database column depot_code SqlType(text), Default(Some(SYD)) */
    val depotCode: Rep[Option[String]] = column[Option[String]]("depot_code", O.Default(Some("SYD")))
    /** Database column t1250_service_code SqlType(text) */
    val t1250ServiceCode: Rep[String] = column[String]("t1250_service_code")
    /** Database column t1250_service_name SqlType(text), Default(Off-peak Parcels) */
    val t1250ServiceName: Rep[String] = column[String]("t1250_service_name", O.Default("Off-peak Parcels"))
    /** Database column bu_code SqlType(text), Default(None) */
    val buCode: Rep[Option[String]] = column[Option[String]]("bu_code", O.Default(None))
    /** Database column carrier_name SqlType(text) */
    val carrierName: Rep[String] = column[String]("carrier_name")
    /** Database column extra_charge_codes SqlType(text), Default(None) */
    val extraChargeCodes: Rep[Option[String]] = column[Option[String]]("extra_charge_codes", O.Default(None))
    /** Database column line_commodity_code SqlType(text), Default(None) */
    val lineCommodityCode: Rep[Option[String]] = column[Option[String]]("line_commodity_code", O.Default(None))
    /** Database column dispatch_date SqlType(date) */
    val dispatchDate: Rep[java.sql.Date] = column[java.sql.Date]("dispatch_date")
    /** Database column authority_to_leave SqlType(text), Default(None) */
    val authorityToLeave: Rep[Option[String]] = column[Option[String]]("authority_to_leave", O.Default(None))
    /** Database column security SqlType(text), Default(None) */
    val security: Rep[Option[String]] = column[Option[String]]("security", O.Default(None))
    /** Database column signature_required SqlType(bool), Default(None) */
    val signatureRequired: Rep[Option[Boolean]] = column[Option[Boolean]]("signature_required", O.Default(None))
    /** Database column qr_country_code SqlType(text) */
    val qrCountryCode: Rep[String] = column[String]("qr_country_code")
    /** Database column gs1_country_code SqlType(text) */
    val gs1CountryCode: Rep[String] = column[String]("gs1_country_code")
    /** Database column charge_account_number SqlType(text) */
    val chargeAccountNumber: Rep[String] = column[String]("charge_account_number")
    /** Database column charge_code SqlType(text) */
    val chargeCode: Rep[String] = column[String]("charge_code")
    /** Database column adp_flag SqlType(bool), Default(false) */
    val adpFlag: Rep[Boolean] = column[Boolean]("adp_flag", O.Default(false))
    /** Database column nsr_flag SqlType(bool), Default(false) */
    val nsrFlag: Rep[Boolean] = column[Boolean]("nsr_flag", O.Default(false))
    /** Database column receiver_address_code SqlType(text), Default(B) */
    val receiverAddressCode: Rep[String] = column[String]("receiver_address_code", O.Default("B"))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column description_of_goods SqlType(text), Default(None) */
    val descriptionOfGoods: Rep[Option[String]] = column[Option[String]]("description_of_goods", O.Default(None))
    /** Database column carrier SqlType(text), Default(None) */
    val carrier: Rep[Option[String]] = column[Option[String]]("carrier", O.Default(None))
    /** Database column signature_text SqlType(text), Default(None) */
    val signatureText: Rep[Option[String]] = column[Option[String]]("signature_text", O.Default(None))
    /** Database column reference SqlType(text), Default(None) */
    val reference: Rep[Option[String]] = column[Option[String]]("reference", O.Default(None))

    /** Index over (consignmentNumber) (database name consignment_number_trgm) */
    val index1 = index("consignment_number_trgm", consignmentNumber :: HNil)
  }
  /** Collection-like TableQuery object for table PaperlessLabelDetails */
  lazy val PaperlessLabelDetails = new TableQuery(tag => new PaperlessLabelDetails(tag))
}
