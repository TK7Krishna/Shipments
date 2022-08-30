package models
// AUTO-GENERATED Slick data model for table InternationalShipments
trait InternationalShipmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalShipments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
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
   *  @param contactCountryCode Database column contact_country_code SqlType(text)
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
   *  @param destinationCountryCode Database column destination_country_code SqlType(text)
   *  @param destinationPhone Database column destination_phone SqlType(text)
   *  @param insurance Database column insurance SqlType(bool)
   *  @param isReturnToSender Database column is_return_to_sender SqlType(bool)
   *  @param natureOfGoods Database column nature_of_goods SqlType(text)
   *  @param dangerousGoods Database column dangerous_goods SqlType(bool)
   *  @param termsAccepted Database column terms_accepted SqlType(bool)
   *  @param acceptPhotoIdRequired Database column accept_photo_id_required SqlType(bool)
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
   *  @param pickupCountryCode Database column pickup_country_code SqlType(text)
   *  @param pickupPhone Database column pickup_phone SqlType(text)
   *  @param rateCardId Database column rate_card_id SqlType(text)
   *  @param shipmentType Database column shipment_type SqlType(text)
   *  @param specialInstruction Database column special_instruction SqlType(text)
   *  @param typeOfExport Database column type_of_export SqlType(text)
   *  @param preferredPickupDateTime Database column preferred_pickup_date_time SqlType(timestamptz) */
  case class InternationalShipmentsRow(id: Long, contactFirstName: String, contactLastName: String, contactIsBusiness: Boolean, contactCompanyName: Option[String] = None, contactEmail: String, contactAddress1: String, contactAddress2: Option[String] = None, contactSuburb: String, contactState: String, contactPostcode: String, contactCountryCode: String, contactPhone: String, destinationFirstName: String, destinationLastName: String, destinationIsBusiness: Boolean, destinationCompanyName: Option[String] = None, destinationEmail: String, destinationAddress1: String, destinationAddress2: Option[String] = None, destinationSuburb: String, destinationState: String, destinationPostcode: String, destinationCountryCode: String, destinationPhone: String, insurance: Boolean, isReturnToSender: Boolean, natureOfGoods: String, dangerousGoods: Boolean, termsAccepted: Boolean, acceptPhotoIdRequired: Boolean, pickupFirstName: String, pickupLastName: String, pickupIsBusiness: Boolean, pickupCompanyName: Option[String] = None, pickupEmail: String, pickupAddress1: String, pickupAddress2: Option[String] = None, pickupSuburb: String, pickupState: String, pickupPostcode: String, pickupCountryCode: String, pickupPhone: String, rateCardId: String, shipmentType: String, specialInstruction: String, typeOfExport: String, preferredPickupDateTime: java.sql.Timestamp)
  /** GetResult implicit for fetching InternationalShipmentsRow objects using plain SQL queries */
  implicit def GetResultInternationalShipmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[Option[String]], e4: GR[java.sql.Timestamp]): GR[InternationalShipmentsRow] = GR{
    prs => import prs._
    InternationalShipmentsRow(<<[Long], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Boolean], <<[Boolean], <<[String], <<[Boolean], <<[Boolean], <<[Boolean], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp])
  }
  /** Table description of table international_shipments. Objects of this class serve as prototypes for rows in queries. */
  class InternationalShipments(_tableTag: Tag) extends profile.api.Table[InternationalShipmentsRow](_tableTag, Some("cpapi"), "international_shipments") {
    def * = (id :: contactFirstName :: contactLastName :: contactIsBusiness :: contactCompanyName :: contactEmail :: contactAddress1 :: contactAddress2 :: contactSuburb :: contactState :: contactPostcode :: contactCountryCode :: contactPhone :: destinationFirstName :: destinationLastName :: destinationIsBusiness :: destinationCompanyName :: destinationEmail :: destinationAddress1 :: destinationAddress2 :: destinationSuburb :: destinationState :: destinationPostcode :: destinationCountryCode :: destinationPhone :: insurance :: isReturnToSender :: natureOfGoods :: dangerousGoods :: termsAccepted :: acceptPhotoIdRequired :: pickupFirstName :: pickupLastName :: pickupIsBusiness :: pickupCompanyName :: pickupEmail :: pickupAddress1 :: pickupAddress2 :: pickupSuburb :: pickupState :: pickupPostcode :: pickupCountryCode :: pickupPhone :: rateCardId :: shipmentType :: specialInstruction :: typeOfExport :: preferredPickupDateTime :: HNil).mapTo[InternationalShipmentsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(contactFirstName) :: Rep.Some(contactLastName) :: Rep.Some(contactIsBusiness) :: contactCompanyName :: Rep.Some(contactEmail) :: Rep.Some(contactAddress1) :: contactAddress2 :: Rep.Some(contactSuburb) :: Rep.Some(contactState) :: Rep.Some(contactPostcode) :: Rep.Some(contactCountryCode) :: Rep.Some(contactPhone) :: Rep.Some(destinationFirstName) :: Rep.Some(destinationLastName) :: Rep.Some(destinationIsBusiness) :: destinationCompanyName :: Rep.Some(destinationEmail) :: Rep.Some(destinationAddress1) :: destinationAddress2 :: Rep.Some(destinationSuburb) :: Rep.Some(destinationState) :: Rep.Some(destinationPostcode) :: Rep.Some(destinationCountryCode) :: Rep.Some(destinationPhone) :: Rep.Some(insurance) :: Rep.Some(isReturnToSender) :: Rep.Some(natureOfGoods) :: Rep.Some(dangerousGoods) :: Rep.Some(termsAccepted) :: Rep.Some(acceptPhotoIdRequired) :: Rep.Some(pickupFirstName) :: Rep.Some(pickupLastName) :: Rep.Some(pickupIsBusiness) :: pickupCompanyName :: Rep.Some(pickupEmail) :: Rep.Some(pickupAddress1) :: pickupAddress2 :: Rep.Some(pickupSuburb) :: Rep.Some(pickupState) :: Rep.Some(pickupPostcode) :: Rep.Some(pickupCountryCode) :: Rep.Some(pickupPhone) :: Rep.Some(rateCardId) :: Rep.Some(shipmentType) :: Rep.Some(specialInstruction) :: Rep.Some(typeOfExport) :: Rep.Some(preferredPickupDateTime) :: HNil).shaped.<>(r => InternationalShipmentsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[String]].get, r(3).asInstanceOf[Option[Boolean]].get, r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]].get, r(6).asInstanceOf[Option[String]].get, r(7).asInstanceOf[Option[String]], r(8).asInstanceOf[Option[String]].get, r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]].get, r(12).asInstanceOf[Option[String]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[String]].get, r(15).asInstanceOf[Option[Boolean]].get, r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]].get, r(18).asInstanceOf[Option[String]].get, r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]].get, r(21).asInstanceOf[Option[String]].get, r(22).asInstanceOf[Option[String]].get, r(23).asInstanceOf[Option[String]].get, r(24).asInstanceOf[Option[String]].get, r(25).asInstanceOf[Option[Boolean]].get, r(26).asInstanceOf[Option[Boolean]].get, r(27).asInstanceOf[Option[String]].get, r(28).asInstanceOf[Option[Boolean]].get, r(29).asInstanceOf[Option[Boolean]].get, r(30).asInstanceOf[Option[Boolean]].get, r(31).asInstanceOf[Option[String]].get, r(32).asInstanceOf[Option[String]].get, r(33).asInstanceOf[Option[Boolean]].get, r(34).asInstanceOf[Option[String]], r(35).asInstanceOf[Option[String]].get, r(36).asInstanceOf[Option[String]].get, r(37).asInstanceOf[Option[String]], r(38).asInstanceOf[Option[String]].get, r(39).asInstanceOf[Option[String]].get, r(40).asInstanceOf[Option[String]].get, r(41).asInstanceOf[Option[String]].get, r(42).asInstanceOf[Option[String]].get, r(43).asInstanceOf[Option[String]].get, r(44).asInstanceOf[Option[String]].get, r(45).asInstanceOf[Option[String]].get, r(46).asInstanceOf[Option[String]].get, r(47).asInstanceOf[Option[java.sql.Timestamp]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
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
    /** Database column contact_country_code SqlType(text) */
    val contactCountryCode: Rep[String] = column[String]("contact_country_code")
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
    /** Database column destination_country_code SqlType(text) */
    val destinationCountryCode: Rep[String] = column[String]("destination_country_code")
    /** Database column destination_phone SqlType(text) */
    val destinationPhone: Rep[String] = column[String]("destination_phone")
    /** Database column insurance SqlType(bool) */
    val insurance: Rep[Boolean] = column[Boolean]("insurance")
    /** Database column is_return_to_sender SqlType(bool) */
    val isReturnToSender: Rep[Boolean] = column[Boolean]("is_return_to_sender")
    /** Database column nature_of_goods SqlType(text) */
    val natureOfGoods: Rep[String] = column[String]("nature_of_goods")
    /** Database column dangerous_goods SqlType(bool) */
    val dangerousGoods: Rep[Boolean] = column[Boolean]("dangerous_goods")
    /** Database column terms_accepted SqlType(bool) */
    val termsAccepted: Rep[Boolean] = column[Boolean]("terms_accepted")
    /** Database column accept_photo_id_required SqlType(bool) */
    val acceptPhotoIdRequired: Rep[Boolean] = column[Boolean]("accept_photo_id_required")
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
    /** Database column pickup_country_code SqlType(text) */
    val pickupCountryCode: Rep[String] = column[String]("pickup_country_code")
    /** Database column pickup_phone SqlType(text) */
    val pickupPhone: Rep[String] = column[String]("pickup_phone")
    /** Database column rate_card_id SqlType(text) */
    val rateCardId: Rep[String] = column[String]("rate_card_id")
    /** Database column shipment_type SqlType(text) */
    val shipmentType: Rep[String] = column[String]("shipment_type")
    /** Database column special_instruction SqlType(text) */
    val specialInstruction: Rep[String] = column[String]("special_instruction")
    /** Database column type_of_export SqlType(text) */
    val typeOfExport: Rep[String] = column[String]("type_of_export")
    /** Database column preferred_pickup_date_time SqlType(timestamptz) */
    val preferredPickupDateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("preferred_pickup_date_time")
  }
  /** Collection-like TableQuery object for table InternationalShipments */
  lazy val InternationalShipments = new TableQuery(tag => new InternationalShipments(tag))
}
