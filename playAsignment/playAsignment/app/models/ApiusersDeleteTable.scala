package models
// AUTO-GENERATED Slick data model for table ApiusersDelete
trait ApiusersDeleteTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ApiusersDelete
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param companyName Database column company_name SqlType(text), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param notificationUrl Database column notification_url SqlType(text), Default(None)
   *  @param username Database column username SqlType(text), Default(None)
   *  @param password Database column password SqlType(text), Default(None)
   *  @param token Database column token SqlType(text), Default(None)
   *  @param email Database column email SqlType(text), Default(None)
   *  @param billingPostcode Database column billing_postcode SqlType(varchar), Length(20,true), Default(None)
   *  @param billingState Database column billing_state SqlType(varchar), Length(100,true), Default(None)
   *  @param billingSuburb Database column billing_suburb SqlType(varchar), Length(100,true), Default(None)
   *  @param billingAddress Database column billing_address SqlType(text), Default(None)
   *  @param isdeleted Database column isdeleted SqlType(bool), Default(None)
   *  @param languagecode Database column languagecode SqlType(varchar), Length(20,true), Default(None)
   *  @param country Database column country SqlType(varchar), Length(100,true), Default(None)
   *  @param postcode Database column postcode SqlType(varchar), Length(20,true), Default(None)
   *  @param addressState Database column address_state SqlType(varchar), Length(100,true), Default(None)
   *  @param suburb Database column suburb SqlType(varchar), Length(100,true), Default(None)
   *  @param address Database column address SqlType(text), Default(None)
   *  @param mobile Database column mobile SqlType(varchar), Length(20,true), Default(None)
   *  @param billingCountry Database column billing_country SqlType(varchar), Length(20,true), Default(None)
   *  @param carrierPartner Database column carrier_partner SqlType(varchar), Length(20,true), Default(Some(toll))
   *  @param sendNotification Database column send_notification SqlType(bool), Default(Some(true))
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None) */
  case class ApiusersDeleteRow(id: Long, companyName: Option[String] = None, modifiedAt: Option[java.sql.Timestamp], createdAt: Option[java.sql.Timestamp], notificationUrl: Option[String] = None, username: Option[String] = None, password: Option[String] = None, token: Option[String] = None, email: Option[String] = None, billingPostcode: Option[String] = None, billingState: Option[String] = None, billingSuburb: Option[String] = None, billingAddress: Option[String] = None, isdeleted: Option[Boolean] = None, languagecode: Option[String] = None, country: Option[String] = None, postcode: Option[String] = None, addressState: Option[String] = None, suburb: Option[String] = None, address: Option[String] = None, mobile: Option[String] = None, billingCountry: Option[String] = None, carrierPartner: Option[String] = Some("toll"), sendNotification: Option[Boolean] = Some(true), hubbedUserId: Option[Long] = None)
  /** GetResult implicit for fetching ApiusersDeleteRow objects using plain SQL queries */
  implicit def GetResultApiusersDeleteRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Boolean]], e4: GR[Option[Long]]): GR[ApiusersDeleteRow] = GR{
    prs => import prs._
    ApiusersDeleteRow(<<[Long], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[Long])
  }
  /** Table description of table apiusers_delete. Objects of this class serve as prototypes for rows in queries. */
  class ApiusersDelete(_tableTag: Tag) extends profile.api.Table[ApiusersDeleteRow](_tableTag, Some("standard_apis"), "apiusers_delete") {
    def * = (id :: companyName :: modifiedAt :: createdAt :: notificationUrl :: username :: password :: token :: email :: billingPostcode :: billingState :: billingSuburb :: billingAddress :: isdeleted :: languagecode :: country :: postcode :: addressState :: suburb :: address :: mobile :: billingCountry :: carrierPartner :: sendNotification :: hubbedUserId :: HNil).mapTo[ApiusersDeleteRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: companyName :: modifiedAt :: createdAt :: notificationUrl :: username :: password :: token :: email :: billingPostcode :: billingState :: billingSuburb :: billingAddress :: isdeleted :: languagecode :: country :: postcode :: addressState :: suburb :: address :: mobile :: billingCountry :: carrierPartner :: sendNotification :: hubbedUserId :: HNil).shaped.<>(r => ApiusersDeleteRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[java.sql.Timestamp]], r(3).asInstanceOf[Option[java.sql.Timestamp]], r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[String]], r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[Boolean]], r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]], r(21).asInstanceOf[Option[String]], r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[Boolean]], r(24).asInstanceOf[Option[Long]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
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
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))
    /** Database column billing_postcode SqlType(varchar), Length(20,true), Default(None) */
    val billingPostcode: Rep[Option[String]] = column[Option[String]]("billing_postcode", O.Length(20,varying=true), O.Default(None))
    /** Database column billing_state SqlType(varchar), Length(100,true), Default(None) */
    val billingState: Rep[Option[String]] = column[Option[String]]("billing_state", O.Length(100,varying=true), O.Default(None))
    /** Database column billing_suburb SqlType(varchar), Length(100,true), Default(None) */
    val billingSuburb: Rep[Option[String]] = column[Option[String]]("billing_suburb", O.Length(100,varying=true), O.Default(None))
    /** Database column billing_address SqlType(text), Default(None) */
    val billingAddress: Rep[Option[String]] = column[Option[String]]("billing_address", O.Default(None))
    /** Database column isdeleted SqlType(bool), Default(None) */
    val isdeleted: Rep[Option[Boolean]] = column[Option[Boolean]]("isdeleted", O.Default(None))
    /** Database column languagecode SqlType(varchar), Length(20,true), Default(None) */
    val languagecode: Rep[Option[String]] = column[Option[String]]("languagecode", O.Length(20,varying=true), O.Default(None))
    /** Database column country SqlType(varchar), Length(100,true), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Length(100,varying=true), O.Default(None))
    /** Database column postcode SqlType(varchar), Length(20,true), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Length(20,varying=true), O.Default(None))
    /** Database column address_state SqlType(varchar), Length(100,true), Default(None) */
    val addressState: Rep[Option[String]] = column[Option[String]]("address_state", O.Length(100,varying=true), O.Default(None))
    /** Database column suburb SqlType(varchar), Length(100,true), Default(None) */
    val suburb: Rep[Option[String]] = column[Option[String]]("suburb", O.Length(100,varying=true), O.Default(None))
    /** Database column address SqlType(text), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Default(None))
    /** Database column mobile SqlType(varchar), Length(20,true), Default(None) */
    val mobile: Rep[Option[String]] = column[Option[String]]("mobile", O.Length(20,varying=true), O.Default(None))
    /** Database column billing_country SqlType(varchar), Length(20,true), Default(None) */
    val billingCountry: Rep[Option[String]] = column[Option[String]]("billing_country", O.Length(20,varying=true), O.Default(None))
    /** Database column carrier_partner SqlType(varchar), Length(20,true), Default(Some(toll)) */
    val carrierPartner: Rep[Option[String]] = column[Option[String]]("carrier_partner", O.Length(20,varying=true), O.Default(Some("toll")))
    /** Database column send_notification SqlType(bool), Default(Some(true)) */
    val sendNotification: Rep[Option[Boolean]] = column[Option[Boolean]]("send_notification", O.Default(Some(true)))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
  }
  /** Collection-like TableQuery object for table ApiusersDelete */
  lazy val ApiusersDelete = new TableQuery(tag => new ApiusersDelete(tag))
}
