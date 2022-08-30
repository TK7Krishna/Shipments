package models
// AUTO-GENERATED Slick data model for table CourierDetails
trait CourierDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierDetails
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None)
   *  @param companyName Database column company_name SqlType(text), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param notificationUrl Database column notification_url SqlType(text), Default(None)
   *  @param username Database column username SqlType(text), Default(None)
   *  @param password Database column password SqlType(text), Default(None)
   *  @param token Database column token SqlType(text), Default(None)
   *  @param contactPhone Database column contact_phone SqlType(varchar), Length(20,true), Default(None)
   *  @param contactEmail Database column contact_email SqlType(text), Default(None)
   *  @param billingCountry Database column billing_country SqlType(varchar), Length(20,true), Default(None)
   *  @param billingPostcode Database column billing_postcode SqlType(varchar), Length(20,true), Default(None)
   *  @param billingState Database column billing_state SqlType(varchar), Length(100,true), Default(None)
   *  @param billingSuburb Database column billing_suburb SqlType(varchar), Length(100,true), Default(None)
   *  @param billingAddress Database column billing_address SqlType(text), Default(None)
   *  @param billingAddress2 Database column billing_address2 SqlType(text), Default(None)
   *  @param contactCountry Database column contact_country SqlType(varchar), Length(100,true), Default(None)
   *  @param contactPostcode Database column contact_postcode SqlType(varchar), Length(20,true), Default(None)
   *  @param contactState Database column contact_state SqlType(varchar), Length(100,true), Default(None)
   *  @param contactSuburb Database column contact_suburb SqlType(varchar), Length(100,true), Default(None)
   *  @param contactAddress Database column contact_address SqlType(text), Default(None)
   *  @param contactAddress2 Database column contact_address2 SqlType(text), Default(None)
   *  @param carrierPartner Database column carrier_partner SqlType(varchar), Length(20,true), Default(Some(toll))
   *  @param sendNotification Database column send_notification SqlType(bool), Default(Some(true))
   *  @param billingContactname Database column billing_contactname SqlType(text), Default(None)
   *  @param contactName Database column contact_name SqlType(text), Default(None)
   *  @param integrationMethod Database column integration_method SqlType(text), Default(None)
   *  @param productPaymentMethod Database column product_payment_method SqlType(text), Default(None)
   *  @param billingPosition Database column billing_position SqlType(text), Default(None)
   *  @param contactPosition Database column contact_position SqlType(text), Default(None)
   *  @param duplicateAllowedDays Database column duplicate_allowed_days SqlType(int4), Default(Some(0))
   *  @param languageCode Database column language_code SqlType(text), Default(None)
   *  @param billingPhone Database column billing_phone SqlType(text), Default(None)
   *  @param billingEmail Database column billing_email SqlType(text), Default(None)
   *  @param currency Database column currency SqlType(text), Default(Some(AUD))
   *  @param paymentRateType Database column payment_rate_type SqlType(int4), Default(Some(0))
   *  @param externalCustomerId Database column external_customer_id SqlType(text), Default(None)
   *  @param externalSource Database column external_source SqlType(text), Default(None)
   *  @param isCustomNetwork Database column is_custom_network SqlType(bool), Default(false)
   *  @param consolidatedLocationId Database column consolidated_location_id SqlType(int8), Default(0)
   *  @param enabledAgentReturns Database column enabled_agent_returns SqlType(bool), Default(false)
   *  @param sendOutboundNotification Database column send_outbound_notification SqlType(bool), Default(true)
   *  @param basicToken Database column basic_token SqlType(text), Default(None) */
  case class CourierDetailsRow(id: Long, hubbedUserId: Option[Long] = None, companyName: Option[String] = None, modifiedAt: Option[java.sql.Timestamp], createdAt: Option[java.sql.Timestamp], notificationUrl: Option[String] = None, username: Option[String] = None, password: Option[String] = None, token: Option[String] = None, contactPhone: Option[String] = None, contactEmail: Option[String] = None, billingCountry: Option[String] = None, billingPostcode: Option[String] = None, billingState: Option[String] = None, billingSuburb: Option[String] = None, billingAddress: Option[String] = None, billingAddress2: Option[String] = None, contactCountry: Option[String] = None, contactPostcode: Option[String] = None, contactState: Option[String] = None, contactSuburb: Option[String] = None, contactAddress: Option[String] = None, contactAddress2: Option[String] = None, carrierPartner: Option[String] = Some("toll"), sendNotification: Option[Boolean] = Some(true), billingContactname: Option[String] = None, contactName: Option[String] = None, integrationMethod: Option[String] = None, productPaymentMethod: Option[String] = None, billingPosition: Option[String] = None, contactPosition: Option[String] = None, duplicateAllowedDays: Option[Int] = Some(0), languageCode: Option[String] = None, billingPhone: Option[String] = None, billingEmail: Option[String] = None, currency: Option[String] = Some("AUD"), paymentRateType: Option[Int] = Some(0), externalCustomerId: Option[String] = None, externalSource: Option[String] = None, isCustomNetwork: Boolean = false, consolidatedLocationId: Long = 0L, enabledAgentReturns: Boolean = false, sendOutboundNotification: Boolean = true, basicToken: Option[String] = None)
  /** GetResult implicit for fetching CourierDetailsRow objects using plain SQL queries */
  implicit def GetResultCourierDetailsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Boolean]], e5: GR[Option[Int]], e6: GR[Boolean]): GR[CourierDetailsRow] = GR{
    prs => import prs._
    CourierDetailsRow(<<[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[String], <<?[String], <<[Boolean], <<[Long], <<[Boolean], <<[Boolean], <<?[String])
  }
  /** Table description of table courier_details. Objects of this class serve as prototypes for rows in queries. */
  class CourierDetails(_tableTag: Tag) extends profile.api.Table[CourierDetailsRow](_tableTag, Some("standard_apis"), "courier_details") {
    def * = (id :: hubbedUserId :: companyName :: modifiedAt :: createdAt :: notificationUrl :: username :: password :: token :: contactPhone :: contactEmail :: billingCountry :: billingPostcode :: billingState :: billingSuburb :: billingAddress :: billingAddress2 :: contactCountry :: contactPostcode :: contactState :: contactSuburb :: contactAddress :: contactAddress2 :: carrierPartner :: sendNotification :: billingContactname :: contactName :: integrationMethod :: productPaymentMethod :: billingPosition :: contactPosition :: duplicateAllowedDays :: languageCode :: billingPhone :: billingEmail :: currency :: paymentRateType :: externalCustomerId :: externalSource :: isCustomNetwork :: consolidatedLocationId :: enabledAgentReturns :: sendOutboundNotification :: basicToken :: HNil).mapTo[CourierDetailsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: hubbedUserId :: companyName :: modifiedAt :: createdAt :: notificationUrl :: username :: password :: token :: contactPhone :: contactEmail :: billingCountry :: billingPostcode :: billingState :: billingSuburb :: billingAddress :: billingAddress2 :: contactCountry :: contactPostcode :: contactState :: contactSuburb :: contactAddress :: contactAddress2 :: carrierPartner :: sendNotification :: billingContactname :: contactName :: integrationMethod :: productPaymentMethod :: billingPosition :: contactPosition :: duplicateAllowedDays :: languageCode :: billingPhone :: billingEmail :: currency :: paymentRateType :: externalCustomerId :: externalSource :: Rep.Some(isCustomNetwork) :: Rep.Some(consolidatedLocationId) :: Rep.Some(enabledAgentReturns) :: Rep.Some(sendOutboundNotification) :: basicToken :: HNil).shaped.<>(r => CourierDetailsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Long]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[java.sql.Timestamp]], r(4).asInstanceOf[Option[java.sql.Timestamp]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[String]], r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[String]], r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]], r(21).asInstanceOf[Option[String]], r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[String]], r(24).asInstanceOf[Option[Boolean]], r(25).asInstanceOf[Option[String]], r(26).asInstanceOf[Option[String]], r(27).asInstanceOf[Option[String]], r(28).asInstanceOf[Option[String]], r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[String]], r(31).asInstanceOf[Option[Int]], r(32).asInstanceOf[Option[String]], r(33).asInstanceOf[Option[String]], r(34).asInstanceOf[Option[String]], r(35).asInstanceOf[Option[String]], r(36).asInstanceOf[Option[Int]], r(37).asInstanceOf[Option[String]], r(38).asInstanceOf[Option[String]], r(39).asInstanceOf[Option[Boolean]].get, r(40).asInstanceOf[Option[Long]].get, r(41).asInstanceOf[Option[Boolean]].get, r(42).asInstanceOf[Option[Boolean]].get, r(43).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
    /** Database column company_name SqlType(text), Default(None) */
    val companyName: Rep[Option[String]] = column[Option[String]]("company_name", O.Default(None))
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column notification_url SqlType(text), Default(None) */
    val notificationUrl: Rep[Option[String]] = column[Option[String]]("notification_url", O.Default(None))
    /** Database column username SqlType(text), Default(None) */
    val username: Rep[Option[String]] = column[Option[String]]("username", O.Default(None))
    /** Database column password SqlType(text), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Default(None))
    /** Database column token SqlType(text), Default(None) */
    val token: Rep[Option[String]] = column[Option[String]]("token", O.Default(None))
    /** Database column contact_phone SqlType(varchar), Length(20,true), Default(None) */
    val contactPhone: Rep[Option[String]] = column[Option[String]]("contact_phone", O.Length(20,varying=true), O.Default(None))
    /** Database column contact_email SqlType(text), Default(None) */
    val contactEmail: Rep[Option[String]] = column[Option[String]]("contact_email", O.Default(None))
    /** Database column billing_country SqlType(varchar), Length(20,true), Default(None) */
    val billingCountry: Rep[Option[String]] = column[Option[String]]("billing_country", O.Length(20,varying=true), O.Default(None))
    /** Database column billing_postcode SqlType(varchar), Length(20,true), Default(None) */
    val billingPostcode: Rep[Option[String]] = column[Option[String]]("billing_postcode", O.Length(20,varying=true), O.Default(None))
    /** Database column billing_state SqlType(varchar), Length(100,true), Default(None) */
    val billingState: Rep[Option[String]] = column[Option[String]]("billing_state", O.Length(100,varying=true), O.Default(None))
    /** Database column billing_suburb SqlType(varchar), Length(100,true), Default(None) */
    val billingSuburb: Rep[Option[String]] = column[Option[String]]("billing_suburb", O.Length(100,varying=true), O.Default(None))
    /** Database column billing_address SqlType(text), Default(None) */
    val billingAddress: Rep[Option[String]] = column[Option[String]]("billing_address", O.Default(None))
    /** Database column billing_address2 SqlType(text), Default(None) */
    val billingAddress2: Rep[Option[String]] = column[Option[String]]("billing_address2", O.Default(None))
    /** Database column contact_country SqlType(varchar), Length(100,true), Default(None) */
    val contactCountry: Rep[Option[String]] = column[Option[String]]("contact_country", O.Length(100,varying=true), O.Default(None))
    /** Database column contact_postcode SqlType(varchar), Length(20,true), Default(None) */
    val contactPostcode: Rep[Option[String]] = column[Option[String]]("contact_postcode", O.Length(20,varying=true), O.Default(None))
    /** Database column contact_state SqlType(varchar), Length(100,true), Default(None) */
    val contactState: Rep[Option[String]] = column[Option[String]]("contact_state", O.Length(100,varying=true), O.Default(None))
    /** Database column contact_suburb SqlType(varchar), Length(100,true), Default(None) */
    val contactSuburb: Rep[Option[String]] = column[Option[String]]("contact_suburb", O.Length(100,varying=true), O.Default(None))
    /** Database column contact_address SqlType(text), Default(None) */
    val contactAddress: Rep[Option[String]] = column[Option[String]]("contact_address", O.Default(None))
    /** Database column contact_address2 SqlType(text), Default(None) */
    val contactAddress2: Rep[Option[String]] = column[Option[String]]("contact_address2", O.Default(None))
    /** Database column carrier_partner SqlType(varchar), Length(20,true), Default(Some(toll)) */
    val carrierPartner: Rep[Option[String]] = column[Option[String]]("carrier_partner", O.Length(20,varying=true), O.Default(Some("toll")))
    /** Database column send_notification SqlType(bool), Default(Some(true)) */
    val sendNotification: Rep[Option[Boolean]] = column[Option[Boolean]]("send_notification", O.Default(Some(true)))
    /** Database column billing_contactname SqlType(text), Default(None) */
    val billingContactname: Rep[Option[String]] = column[Option[String]]("billing_contactname", O.Default(None))
    /** Database column contact_name SqlType(text), Default(None) */
    val contactName: Rep[Option[String]] = column[Option[String]]("contact_name", O.Default(None))
    /** Database column integration_method SqlType(text), Default(None) */
    val integrationMethod: Rep[Option[String]] = column[Option[String]]("integration_method", O.Default(None))
    /** Database column product_payment_method SqlType(text), Default(None) */
    val productPaymentMethod: Rep[Option[String]] = column[Option[String]]("product_payment_method", O.Default(None))
    /** Database column billing_position SqlType(text), Default(None) */
    val billingPosition: Rep[Option[String]] = column[Option[String]]("billing_position", O.Default(None))
    /** Database column contact_position SqlType(text), Default(None) */
    val contactPosition: Rep[Option[String]] = column[Option[String]]("contact_position", O.Default(None))
    /** Database column duplicate_allowed_days SqlType(int4), Default(Some(0)) */
    val duplicateAllowedDays: Rep[Option[Int]] = column[Option[Int]]("duplicate_allowed_days", O.Default(Some(0)))
    /** Database column language_code SqlType(text), Default(None) */
    val languageCode: Rep[Option[String]] = column[Option[String]]("language_code", O.Default(None))
    /** Database column billing_phone SqlType(text), Default(None) */
    val billingPhone: Rep[Option[String]] = column[Option[String]]("billing_phone", O.Default(None))
    /** Database column billing_email SqlType(text), Default(None) */
    val billingEmail: Rep[Option[String]] = column[Option[String]]("billing_email", O.Default(None))
    /** Database column currency SqlType(text), Default(Some(AUD)) */
    val currency: Rep[Option[String]] = column[Option[String]]("currency", O.Default(Some("AUD")))
    /** Database column payment_rate_type SqlType(int4), Default(Some(0)) */
    val paymentRateType: Rep[Option[Int]] = column[Option[Int]]("payment_rate_type", O.Default(Some(0)))
    /** Database column external_customer_id SqlType(text), Default(None) */
    val externalCustomerId: Rep[Option[String]] = column[Option[String]]("external_customer_id", O.Default(None))
    /** Database column external_source SqlType(text), Default(None) */
    val externalSource: Rep[Option[String]] = column[Option[String]]("external_source", O.Default(None))
    /** Database column is_custom_network SqlType(bool), Default(false) */
    val isCustomNetwork: Rep[Boolean] = column[Boolean]("is_custom_network", O.Default(false))
    /** Database column consolidated_location_id SqlType(int8), Default(0) */
    val consolidatedLocationId: Rep[Long] = column[Long]("consolidated_location_id", O.Default(0L))
    /** Database column enabled_agent_returns SqlType(bool), Default(false) */
    val enabledAgentReturns: Rep[Boolean] = column[Boolean]("enabled_agent_returns", O.Default(false))
    /** Database column send_outbound_notification SqlType(bool), Default(true) */
    val sendOutboundNotification: Rep[Boolean] = column[Boolean]("send_outbound_notification", O.Default(true))
    /** Database column basic_token SqlType(text), Default(None) */
    val basicToken: Rep[Option[String]] = column[Option[String]]("basic_token", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name courierdetails_hubbed_users_fkey) */
    lazy val hubbedUsersFk = foreignKey("courierdetails_hubbed_users_fkey", hubbedUserId :: HNil, HubbedUsers)(r => Rep.Some(r.id) :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (sendOutboundNotification) (database name idx_send_notification) */
    val index1 = index("idx_send_notification", sendOutboundNotification :: HNil)
  }
  /** Collection-like TableQuery object for table CourierDetails */
  lazy val CourierDetails = new TableQuery(tag => new CourierDetails(tag))
}
