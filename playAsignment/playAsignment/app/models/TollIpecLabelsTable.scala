package models
// AUTO-GENERATED Slick data model for table TollIpecLabels
trait TollIpecLabelsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollIpecLabels
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param carrierName Database column carrier_name SqlType(text)
   *  @param service Database column service SqlType(text)
   *  @param serviceCode Database column service_code SqlType(text)
   *  @param depotCode Database column depot_code SqlType(text)
   *  @param connoteNumber Database column connote_number SqlType(text)
   *  @param senderName Database column sender_name SqlType(text)
   *  @param senderAddress1 Database column sender_address1 SqlType(text)
   *  @param senderAddress2 Database column sender_address2 SqlType(text), Default(None)
   *  @param senderSuburb Database column sender_suburb SqlType(text)
   *  @param senderState Database column sender_state SqlType(text)
   *  @param senderPostcode Database column sender_postcode SqlType(text)
   *  @param receiverName Database column receiver_name SqlType(text)
   *  @param receiverAddress1 Database column receiver_address1 SqlType(text)
   *  @param receiverAddress2 Database column receiver_address2 SqlType(text), Default(None)
   *  @param receiverSuburb Database column receiver_suburb SqlType(text)
   *  @param receiverState Database column receiver_state SqlType(text)
   *  @param receiverPostcode Database column receiver_postcode SqlType(text)
   *  @param specialInstructions1 Database column special_instructions1 SqlType(text), Default(None)
   *  @param specialInstructions2 Database column special_instructions2 SqlType(text), Default(None)
   *  @param specialInstructions3 Database column special_instructions3 SqlType(text), Default(None)
   *  @param contactName Database column contact_name SqlType(text)
   *  @param contactPhone Database column contact_phone SqlType(text)
   *  @param totalCubicMetres Database column total_cubic_metres SqlType(numeric)
   *  @param totalWeightKgs Database column total_weight_kgs SqlType(numeric)
   *  @param dispatchDate Database column dispatch_date SqlType(date)
   *  @param authorityToLeave Database column authority_to_leave SqlType(bool), Default(None)
   *  @param security Database column security SqlType(bool), Default(None)
   *  @param gs1CountryCode Database column gs1_country_code SqlType(text)
   *  @param chargeAccountNumber Database column charge_account_number SqlType(text)
   *  @param chargeCode Database column charge_code SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamp) */
  case class TollIpecLabelsRow(id: Long, carrierName: String, service: String, serviceCode: String, depotCode: String, connoteNumber: String, senderName: String, senderAddress1: String, senderAddress2: Option[String] = None, senderSuburb: String, senderState: String, senderPostcode: String, receiverName: String, receiverAddress1: String, receiverAddress2: Option[String] = None, receiverSuburb: String, receiverState: String, receiverPostcode: String, specialInstructions1: Option[String] = None, specialInstructions2: Option[String] = None, specialInstructions3: Option[String] = None, contactName: String, contactPhone: String, totalCubicMetres: scala.math.BigDecimal, totalWeightKgs: scala.math.BigDecimal, dispatchDate: java.sql.Date, authorityToLeave: Option[Boolean] = None, security: Option[Boolean] = None, gs1CountryCode: String, chargeAccountNumber: String, chargeCode: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching TollIpecLabelsRow objects using plain SQL queries */
  implicit def GetResultTollIpecLabelsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Date], e5: GR[Option[Boolean]], e6: GR[java.sql.Timestamp]): GR[TollIpecLabelsRow] = GR{
    prs => import prs._
    TollIpecLabelsRow(<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<[String], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Date], <<?[Boolean], <<?[Boolean], <<[String], <<[String], <<[String], <<[java.sql.Timestamp])
  }
  /** Table description of table toll_ipec_labels. Objects of this class serve as prototypes for rows in queries. */
  class TollIpecLabels(_tableTag: Tag) extends profile.api.Table[TollIpecLabelsRow](_tableTag, "toll_ipec_labels") {
    def * = (id :: carrierName :: service :: serviceCode :: depotCode :: connoteNumber :: senderName :: senderAddress1 :: senderAddress2 :: senderSuburb :: senderState :: senderPostcode :: receiverName :: receiverAddress1 :: receiverAddress2 :: receiverSuburb :: receiverState :: receiverPostcode :: specialInstructions1 :: specialInstructions2 :: specialInstructions3 :: contactName :: contactPhone :: totalCubicMetres :: totalWeightKgs :: dispatchDate :: authorityToLeave :: security :: gs1CountryCode :: chargeAccountNumber :: chargeCode :: createdAt :: HNil).mapTo[TollIpecLabelsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(carrierName) :: Rep.Some(service) :: Rep.Some(serviceCode) :: Rep.Some(depotCode) :: Rep.Some(connoteNumber) :: Rep.Some(senderName) :: Rep.Some(senderAddress1) :: senderAddress2 :: Rep.Some(senderSuburb) :: Rep.Some(senderState) :: Rep.Some(senderPostcode) :: Rep.Some(receiverName) :: Rep.Some(receiverAddress1) :: receiverAddress2 :: Rep.Some(receiverSuburb) :: Rep.Some(receiverState) :: Rep.Some(receiverPostcode) :: specialInstructions1 :: specialInstructions2 :: specialInstructions3 :: Rep.Some(contactName) :: Rep.Some(contactPhone) :: Rep.Some(totalCubicMetres) :: Rep.Some(totalWeightKgs) :: Rep.Some(dispatchDate) :: authorityToLeave :: security :: Rep.Some(gs1CountryCode) :: Rep.Some(chargeAccountNumber) :: Rep.Some(chargeCode) :: Rep.Some(createdAt) :: HNil).shaped.<>(r => TollIpecLabelsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[String]].get, r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[String]].get, r(5).asInstanceOf[Option[String]].get, r(6).asInstanceOf[Option[String]].get, r(7).asInstanceOf[Option[String]].get, r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]].get, r(12).asInstanceOf[Option[String]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]].get, r(16).asInstanceOf[Option[String]].get, r(17).asInstanceOf[Option[String]].get, r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[String]], r(21).asInstanceOf[Option[String]].get, r(22).asInstanceOf[Option[String]].get, r(23).asInstanceOf[Option[scala.math.BigDecimal]].get, r(24).asInstanceOf[Option[scala.math.BigDecimal]].get, r(25).asInstanceOf[Option[java.sql.Date]].get, r(26).asInstanceOf[Option[Boolean]], r(27).asInstanceOf[Option[Boolean]], r(28).asInstanceOf[Option[String]].get, r(29).asInstanceOf[Option[String]].get, r(30).asInstanceOf[Option[String]].get, r(31).asInstanceOf[Option[java.sql.Timestamp]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column carrier_name SqlType(text) */
    val carrierName: Rep[String] = column[String]("carrier_name")
    /** Database column service SqlType(text) */
    val service: Rep[String] = column[String]("service")
    /** Database column service_code SqlType(text) */
    val serviceCode: Rep[String] = column[String]("service_code")
    /** Database column depot_code SqlType(text) */
    val depotCode: Rep[String] = column[String]("depot_code")
    /** Database column connote_number SqlType(text) */
    val connoteNumber: Rep[String] = column[String]("connote_number")
    /** Database column sender_name SqlType(text) */
    val senderName: Rep[String] = column[String]("sender_name")
    /** Database column sender_address1 SqlType(text) */
    val senderAddress1: Rep[String] = column[String]("sender_address1")
    /** Database column sender_address2 SqlType(text), Default(None) */
    val senderAddress2: Rep[Option[String]] = column[Option[String]]("sender_address2", O.Default(None))
    /** Database column sender_suburb SqlType(text) */
    val senderSuburb: Rep[String] = column[String]("sender_suburb")
    /** Database column sender_state SqlType(text) */
    val senderState: Rep[String] = column[String]("sender_state")
    /** Database column sender_postcode SqlType(text) */
    val senderPostcode: Rep[String] = column[String]("sender_postcode")
    /** Database column receiver_name SqlType(text) */
    val receiverName: Rep[String] = column[String]("receiver_name")
    /** Database column receiver_address1 SqlType(text) */
    val receiverAddress1: Rep[String] = column[String]("receiver_address1")
    /** Database column receiver_address2 SqlType(text), Default(None) */
    val receiverAddress2: Rep[Option[String]] = column[Option[String]]("receiver_address2", O.Default(None))
    /** Database column receiver_suburb SqlType(text) */
    val receiverSuburb: Rep[String] = column[String]("receiver_suburb")
    /** Database column receiver_state SqlType(text) */
    val receiverState: Rep[String] = column[String]("receiver_state")
    /** Database column receiver_postcode SqlType(text) */
    val receiverPostcode: Rep[String] = column[String]("receiver_postcode")
    /** Database column special_instructions1 SqlType(text), Default(None) */
    val specialInstructions1: Rep[Option[String]] = column[Option[String]]("special_instructions1", O.Default(None))
    /** Database column special_instructions2 SqlType(text), Default(None) */
    val specialInstructions2: Rep[Option[String]] = column[Option[String]]("special_instructions2", O.Default(None))
    /** Database column special_instructions3 SqlType(text), Default(None) */
    val specialInstructions3: Rep[Option[String]] = column[Option[String]]("special_instructions3", O.Default(None))
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column contact_phone SqlType(text) */
    val contactPhone: Rep[String] = column[String]("contact_phone")
    /** Database column total_cubic_metres SqlType(numeric) */
    val totalCubicMetres: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("total_cubic_metres")
    /** Database column total_weight_kgs SqlType(numeric) */
    val totalWeightKgs: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("total_weight_kgs")
    /** Database column dispatch_date SqlType(date) */
    val dispatchDate: Rep[java.sql.Date] = column[java.sql.Date]("dispatch_date")
    /** Database column authority_to_leave SqlType(bool), Default(None) */
    val authorityToLeave: Rep[Option[Boolean]] = column[Option[Boolean]]("authority_to_leave", O.Default(None))
    /** Database column security SqlType(bool), Default(None) */
    val security: Rep[Option[Boolean]] = column[Option[Boolean]]("security", O.Default(None))
    /** Database column gs1_country_code SqlType(text) */
    val gs1CountryCode: Rep[String] = column[String]("gs1_country_code")
    /** Database column charge_account_number SqlType(text) */
    val chargeAccountNumber: Rep[String] = column[String]("charge_account_number")
    /** Database column charge_code SqlType(text) */
    val chargeCode: Rep[String] = column[String]("charge_code")
    /** Database column created_at SqlType(timestamp) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table TollIpecLabels */
  lazy val TollIpecLabels = new TableQuery(tag => new TollIpecLabels(tag))
}
