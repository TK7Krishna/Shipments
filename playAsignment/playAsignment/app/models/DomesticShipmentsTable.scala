package models
// AUTO-GENERATED Slick data model for table DomesticShipments
trait DomesticShipmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DomesticShipments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param contactFirstName Database column contact_first_name SqlType(text)
   *  @param contactLastName Database column contact_last_name SqlType(text)
   *  @param contactIsBusiness Database column contact_is_business SqlType(bool)
   *  @param contactCompanyName Database column contact_company_name SqlType(text), Default(None)
   *  @param contactEmail Database column contact_email SqlType(text)
   *  @param contactAddress1 Database column contact_address_1 SqlType(text)
   *  @param contactAddress2 Database column contact_address_2 SqlType(text), Default(None)
   *  @param contactSuburb Database column contact_suburb SqlType(text)
   *  @param contactState Database column contact_state SqlType(text)
   *  @param contactPostcode Database column contact_postcode SqlType(text)
   *  @param contactPhone Database column contact_phone SqlType(text)
   *  @param destinationFirstName Database column destination_first_name SqlType(text)
   *  @param destinationLastName Database column destination_last_name SqlType(text)
   *  @param destinationIsBusiness Database column destination_is_business SqlType(bool)
   *  @param destinationCompanyName Database column destination_company_name SqlType(text), Default(None)
   *  @param destinationEmail Database column destination_email SqlType(text)
   *  @param destinationAddress1 Database column destination_address_1 SqlType(text)
   *  @param destinationAddress2 Database column destination_address_2 SqlType(text), Default(None)
   *  @param destinationSuburb Database column destination_suburb SqlType(text)
   *  @param destinationState Database column destination_state SqlType(text)
   *  @param destinationPostcode Database column destination_postcode SqlType(text)
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
   *  @param rateCardId Database column rate_card_id SqlType(text)
   *  @param specialInstruction Database column special_instruction SqlType(text), Default(None)
   *  @param attemptedAt Database column attempted_at SqlType(timestamptz)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param reasonid Database column reasonid SqlType(int4), Default(None)
   *  @param destinationCountry Database column destination_country SqlType(text), Default(None)
   *  @param contactCountry Database column contact_country SqlType(text), Default(None)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param externalConsignmentid Database column external_consignmentid SqlType(int8), Default(None)
   *  @param carrierpartner Database column carrierpartner SqlType(text), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None)
   *  @param ordernumber Database column ordernumber SqlType(text), Default(None)
   *  @param returntype Database column returntype SqlType(text), Default(None)
   *  @param storedlb Database column storedlb SqlType(text), Default(None)
   *  @param comment Database column comment SqlType(text), Default(None)
   *  @param contentDescription Database column content_description SqlType(text), Default(None)
   *  @param service Database column service SqlType(text), Default(Some(Road))
   *  @param serviceCode Database column service_code SqlType(text), Default(Some(x))
   *  @param depotCode Database column depot_code SqlType(text), Default(Some(SYD))
   *  @param paymentRateType Database column payment_rate_type SqlType(int4), Default(None)
   *  @param t1250ServiceCode Database column t1250_service_code SqlType(text)
   *  @param t1250ServiceName Database column t1250_service_name SqlType(text), Default(Off-peak Parcels)
   *  @param returnHubbedId Database column return_hubbed_id SqlType(int8), Default(None)
   *  @param isPaperless Database column is_paperless SqlType(bool), Default(false)
   *  @param descriptionOfGoods Database column description_of_goods SqlType(text), Default(None)
   *  @param printAtStore Database column print_at_store SqlType(bool), Default(false)
   *  @param carrier Database column carrier SqlType(text), Default(None)
   *  @param signatureText Database column signature_text SqlType(text), Default(None)
   *  @param reference Database column reference SqlType(text), Default(None) */
  case class DomesticShipmentsRow(id: Long, createdAt: java.sql.Timestamp, contactFirstName: String, contactLastName: String, contactIsBusiness: Boolean, contactCompanyName: Option[String] = None, contactEmail: String, contactAddress1: String, contactAddress2: Option[String] = None, contactSuburb: String, contactState: String, contactPostcode: String, contactPhone: String, destinationFirstName: String, destinationLastName: String, destinationIsBusiness: Boolean, destinationCompanyName: Option[String] = None, destinationEmail: String, destinationAddress1: String, destinationAddress2: Option[String] = None, destinationSuburb: String, destinationState: String, destinationPostcode: String, destinationPhone: String, dangerousGoods: Boolean, termsAccepted: Boolean, pickupFirstName: String, pickupLastName: String, pickupIsBusiness: Boolean, pickupCompanyName: Option[String] = None, pickupEmail: String, pickupAddress1: String, pickupAddress2: Option[String] = None, pickupSuburb: String, pickupState: String, pickupPostcode: String, pickupPhone: String, rateCardId: String, specialInstruction: Option[String] = None, attemptedAt: Option[java.sql.Timestamp], consignmentNumber: Option[String] = None, reasonid: Option[Int] = None, destinationCountry: Option[String] = None, contactCountry: Option[String] = None, courier: Option[String] = None, externalConsignmentid: Option[Long] = None, carrierpartner: Option[String] = None, hubbedUserId: Option[Long] = None, ordernumber: Option[String] = None, returntype: Option[String] = None, storedlb: Option[String] = None, comment: Option[String] = None, contentDescription: Option[String] = None, service: Option[String] = Some("Road"), serviceCode: Option[String] = Some("x"), depotCode: Option[String] = Some("SYD"), paymentRateType: Option[Int] = None, t1250ServiceCode: String, t1250ServiceName: String = "Off-peak Parcels", returnHubbedId: Option[Long] = None, isPaperless: Boolean = false, descriptionOfGoods: Option[String] = None, printAtStore: Boolean = false, carrier: Option[String] = None, signatureText: Option[String] = None, reference: Option[String] = None)
  /** GetResult implicit for fetching DomesticShipmentsRow objects using plain SQL queries */
  implicit def GetResultDomesticShipmentsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Boolean], e4: GR[Option[String]], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[Int]], e7: GR[Option[Long]]): GR[DomesticShipmentsRow] = GR{
    prs => import prs._
    DomesticShipmentsRow(<<[Long], <<[java.sql.Timestamp], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[Boolean], <<[Boolean], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<[String], <<[String], <<?[Long], <<[Boolean], <<?[String], <<[Boolean], <<?[String], <<?[String], <<?[String])
  }
  /** Table description of table domestic_shipments. Objects of this class serve as prototypes for rows in queries. */
  class DomesticShipments(_tableTag: Tag) extends profile.api.Table[DomesticShipmentsRow](_tableTag, Some("standard_apis"), "domestic_shipments") {
    def * = (id :: createdAt :: contactFirstName :: contactLastName :: contactIsBusiness :: contactCompanyName :: contactEmail :: contactAddress1 :: contactAddress2 :: contactSuburb :: contactState :: contactPostcode :: contactPhone :: destinationFirstName :: destinationLastName :: destinationIsBusiness :: destinationCompanyName :: destinationEmail :: destinationAddress1 :: destinationAddress2 :: destinationSuburb :: destinationState :: destinationPostcode :: destinationPhone :: dangerousGoods :: termsAccepted :: pickupFirstName :: pickupLastName :: pickupIsBusiness :: pickupCompanyName :: pickupEmail :: pickupAddress1 :: pickupAddress2 :: pickupSuburb :: pickupState :: pickupPostcode :: pickupPhone :: rateCardId :: specialInstruction :: attemptedAt :: consignmentNumber :: reasonid :: destinationCountry :: contactCountry :: courier :: externalConsignmentid :: carrierpartner :: hubbedUserId :: ordernumber :: returntype :: storedlb :: comment :: contentDescription :: service :: serviceCode :: depotCode :: paymentRateType :: t1250ServiceCode :: t1250ServiceName :: returnHubbedId :: isPaperless :: descriptionOfGoods :: printAtStore :: carrier :: signatureText :: reference :: HNil).mapTo[DomesticShipmentsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(createdAt) :: Rep.Some(contactFirstName) :: Rep.Some(contactLastName) :: Rep.Some(contactIsBusiness) :: contactCompanyName :: Rep.Some(contactEmail) :: Rep.Some(contactAddress1) :: contactAddress2 :: Rep.Some(contactSuburb) :: Rep.Some(contactState) :: Rep.Some(contactPostcode) :: Rep.Some(contactPhone) :: Rep.Some(destinationFirstName) :: Rep.Some(destinationLastName) :: Rep.Some(destinationIsBusiness) :: destinationCompanyName :: Rep.Some(destinationEmail) :: Rep.Some(destinationAddress1) :: destinationAddress2 :: Rep.Some(destinationSuburb) :: Rep.Some(destinationState) :: Rep.Some(destinationPostcode) :: Rep.Some(destinationPhone) :: Rep.Some(dangerousGoods) :: Rep.Some(termsAccepted) :: Rep.Some(pickupFirstName) :: Rep.Some(pickupLastName) :: Rep.Some(pickupIsBusiness) :: pickupCompanyName :: Rep.Some(pickupEmail) :: Rep.Some(pickupAddress1) :: pickupAddress2 :: Rep.Some(pickupSuburb) :: Rep.Some(pickupState) :: Rep.Some(pickupPostcode) :: Rep.Some(pickupPhone) :: Rep.Some(rateCardId) :: specialInstruction :: attemptedAt :: consignmentNumber :: reasonid :: destinationCountry :: contactCountry :: courier :: externalConsignmentid :: carrierpartner :: hubbedUserId :: ordernumber :: returntype :: storedlb :: comment :: contentDescription :: service :: serviceCode :: depotCode :: paymentRateType :: Rep.Some(t1250ServiceCode) :: Rep.Some(t1250ServiceName) :: returnHubbedId :: Rep.Some(isPaperless) :: descriptionOfGoods :: Rep.Some(printAtStore) :: carrier :: signatureText :: reference :: HNil).shaped.<>(r => DomesticShipmentsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[java.sql.Timestamp]].get, r(2).asInstanceOf[Option[String]].get, r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[Boolean]].get, r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]].get, r(7).asInstanceOf[Option[String]].get, r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]].get, r(12).asInstanceOf[Option[String]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[String]].get, r(15).asInstanceOf[Option[Boolean]].get, r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]].get, r(18).asInstanceOf[Option[String]].get, r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]].get, r(21).asInstanceOf[Option[String]].get, r(22).asInstanceOf[Option[String]].get, r(23).asInstanceOf[Option[String]].get, r(24).asInstanceOf[Option[Boolean]].get, r(25).asInstanceOf[Option[Boolean]].get, r(26).asInstanceOf[Option[String]].get, r(27).asInstanceOf[Option[String]].get, r(28).asInstanceOf[Option[Boolean]].get, r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[String]].get, r(31).asInstanceOf[Option[String]].get, r(32).asInstanceOf[Option[String]], r(33).asInstanceOf[Option[String]].get, r(34).asInstanceOf[Option[String]].get, r(35).asInstanceOf[Option[String]].get, r(36).asInstanceOf[Option[String]].get, r(37).asInstanceOf[Option[String]].get, r(38).asInstanceOf[Option[String]], r(39).asInstanceOf[Option[java.sql.Timestamp]], r(40).asInstanceOf[Option[String]], r(41).asInstanceOf[Option[Int]], r(42).asInstanceOf[Option[String]], r(43).asInstanceOf[Option[String]], r(44).asInstanceOf[Option[String]], r(45).asInstanceOf[Option[Long]], r(46).asInstanceOf[Option[String]], r(47).asInstanceOf[Option[Long]], r(48).asInstanceOf[Option[String]], r(49).asInstanceOf[Option[String]], r(50).asInstanceOf[Option[String]], r(51).asInstanceOf[Option[String]], r(52).asInstanceOf[Option[String]], r(53).asInstanceOf[Option[String]], r(54).asInstanceOf[Option[String]], r(55).asInstanceOf[Option[String]], r(56).asInstanceOf[Option[Int]], r(57).asInstanceOf[Option[String]].get, r(58).asInstanceOf[Option[String]].get, r(59).asInstanceOf[Option[Long]], r(60).asInstanceOf[Option[Boolean]].get, r(61).asInstanceOf[Option[String]], r(62).asInstanceOf[Option[Boolean]].get, r(63).asInstanceOf[Option[String]], r(64).asInstanceOf[Option[String]], r(65).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column contact_first_name SqlType(text) */
    val contactFirstName: Rep[String] = column[String]("contact_first_name")
    /** Database column contact_last_name SqlType(text) */
    val contactLastName: Rep[String] = column[String]("contact_last_name")
    /** Database column contact_is_business SqlType(bool) */
    val contactIsBusiness: Rep[Boolean] = column[Boolean]("contact_is_business")
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
    /** Database column contact_phone SqlType(text) */
    val contactPhone: Rep[String] = column[String]("contact_phone")
    /** Database column destination_first_name SqlType(text) */
    val destinationFirstName: Rep[String] = column[String]("destination_first_name")
    /** Database column destination_last_name SqlType(text) */
    val destinationLastName: Rep[String] = column[String]("destination_last_name")
    /** Database column destination_is_business SqlType(bool) */
    val destinationIsBusiness: Rep[Boolean] = column[Boolean]("destination_is_business")
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
    /** Database column rate_card_id SqlType(text) */
    val rateCardId: Rep[String] = column[String]("rate_card_id")
    /** Database column special_instruction SqlType(text), Default(None) */
    val specialInstruction: Rep[Option[String]] = column[Option[String]]("special_instruction", O.Default(None))
    /** Database column attempted_at SqlType(timestamptz) */
    val attemptedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("attempted_at")
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column reasonid SqlType(int4), Default(None) */
    val reasonid: Rep[Option[Int]] = column[Option[Int]]("reasonid", O.Default(None))
    /** Database column destination_country SqlType(text), Default(None) */
    val destinationCountry: Rep[Option[String]] = column[Option[String]]("destination_country", O.Default(None))
    /** Database column contact_country SqlType(text), Default(None) */
    val contactCountry: Rep[Option[String]] = column[Option[String]]("contact_country", O.Default(None))
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column external_consignmentid SqlType(int8), Default(None) */
    val externalConsignmentid: Rep[Option[Long]] = column[Option[Long]]("external_consignmentid", O.Default(None))
    /** Database column carrierpartner SqlType(text), Default(None) */
    val carrierpartner: Rep[Option[String]] = column[Option[String]]("carrierpartner", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
    /** Database column ordernumber SqlType(text), Default(None) */
    val ordernumber: Rep[Option[String]] = column[Option[String]]("ordernumber", O.Default(None))
    /** Database column returntype SqlType(text), Default(None) */
    val returntype: Rep[Option[String]] = column[Option[String]]("returntype", O.Default(None))
    /** Database column storedlb SqlType(text), Default(None) */
    val storedlb: Rep[Option[String]] = column[Option[String]]("storedlb", O.Default(None))
    /** Database column comment SqlType(text), Default(None) */
    val comment: Rep[Option[String]] = column[Option[String]]("comment", O.Default(None))
    /** Database column content_description SqlType(text), Default(None) */
    val contentDescription: Rep[Option[String]] = column[Option[String]]("content_description", O.Default(None))
    /** Database column service SqlType(text), Default(Some(Road)) */
    val service: Rep[Option[String]] = column[Option[String]]("service", O.Default(Some("Road")))
    /** Database column service_code SqlType(text), Default(Some(x)) */
    val serviceCode: Rep[Option[String]] = column[Option[String]]("service_code", O.Default(Some("x")))
    /** Database column depot_code SqlType(text), Default(Some(SYD)) */
    val depotCode: Rep[Option[String]] = column[Option[String]]("depot_code", O.Default(Some("SYD")))
    /** Database column payment_rate_type SqlType(int4), Default(None) */
    val paymentRateType: Rep[Option[Int]] = column[Option[Int]]("payment_rate_type", O.Default(None))
    /** Database column t1250_service_code SqlType(text) */
    val t1250ServiceCode: Rep[String] = column[String]("t1250_service_code")
    /** Database column t1250_service_name SqlType(text), Default(Off-peak Parcels) */
    val t1250ServiceName: Rep[String] = column[String]("t1250_service_name", O.Default("Off-peak Parcels"))
    /** Database column return_hubbed_id SqlType(int8), Default(None) */
    val returnHubbedId: Rep[Option[Long]] = column[Option[Long]]("return_hubbed_id", O.Default(None))
    /** Database column is_paperless SqlType(bool), Default(false) */
    val isPaperless: Rep[Boolean] = column[Boolean]("is_paperless", O.Default(false))
    /** Database column description_of_goods SqlType(text), Default(None) */
    val descriptionOfGoods: Rep[Option[String]] = column[Option[String]]("description_of_goods", O.Default(None))
    /** Database column print_at_store SqlType(bool), Default(false) */
    val printAtStore: Rep[Boolean] = column[Boolean]("print_at_store", O.Default(false))
    /** Database column carrier SqlType(text), Default(None) */
    val carrier: Rep[Option[String]] = column[Option[String]]("carrier", O.Default(None))
    /** Database column signature_text SqlType(text), Default(None) */
    val signatureText: Rep[Option[String]] = column[Option[String]]("signature_text", O.Default(None))
    /** Database column reference SqlType(text), Default(None) */
    val reference: Rep[Option[String]] = column[Option[String]]("reference", O.Default(None))

    /** Foreign key referencing Consignments (database name domestic_shipments_external_online_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("domestic_shipments_external_online_consignment_fkey", externalConsignmentid :: HNil, Consignments)(r => Rep.Some(r.id) :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing EcommerceCustomerReturnHubbedIdMapping (database name domestic_shipments_return_hubbed_id_fkey) */
    lazy val ecommerceCustomerReturnHubbedIdMappingFk = foreignKey("domestic_shipments_return_hubbed_id_fkey", returnHubbedId :: HNil, EcommerceCustomerReturnHubbedIdMapping)(r => Rep.Some(r.id) :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (consignmentNumber) (database name consignment_number_idx) */
    val index1 = index("consignment_number_idx", consignmentNumber :: HNil)
  }
  /** Collection-like TableQuery object for table DomesticShipments */
  lazy val DomesticShipments = new TableQuery(tag => new DomesticShipments(tag))
}
