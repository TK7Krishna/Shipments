package models
// AUTO-GENERATED Slick data model for table ReturnLabelDetails
trait ReturnLabelDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ReturnLabelDetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param domesticShipmentId Database column domestic_shipment_id SqlType(int8)
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
   *  @param createdAt Database column created_at SqlType(timestamp)
   *  @param adpFlag Database column adp_flag SqlType(bool), Default(false)
   *  @param nsrFlag Database column nsr_flag SqlType(bool), Default(false)
   *  @param receiverAddressCode Database column receiver_address_code SqlType(text), Default(B)
   *  @param dutiesAndTaxes Database column duties_and_taxes SqlType(text), Default(None) */
  case class ReturnLabelDetailsRow(id: Long, domesticShipmentId: Long, buCode: Option[String] = None, carrierName: String, extraChargeCodes: Option[String] = None, lineCommodityCode: Option[String] = None, dispatchDate: java.sql.Date, authorityToLeave: Option[String] = None, security: Option[String] = None, signatureRequired: Option[Boolean] = None, qrCountryCode: String, gs1CountryCode: String, chargeAccountNumber: String, chargeCode: String, createdAt: java.sql.Timestamp, adpFlag: Boolean = false, nsrFlag: Boolean = false, receiverAddressCode: String = "B", dutiesAndTaxes: Option[String] = None)
  /** GetResult implicit for fetching ReturnLabelDetailsRow objects using plain SQL queries */
  implicit def GetResultReturnLabelDetailsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[java.sql.Date], e4: GR[Option[Boolean]], e5: GR[java.sql.Timestamp], e6: GR[Boolean]): GR[ReturnLabelDetailsRow] = GR{
    prs => import prs._
    ReturnLabelDetailsRow.tupled((<<[Long], <<[Long], <<?[String], <<[String], <<?[String], <<?[String], <<[java.sql.Date], <<?[String], <<?[String], <<?[Boolean], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[Boolean], <<[Boolean], <<[String], <<?[String]))
  }
  /** Table description of table return_label_details. Objects of this class serve as prototypes for rows in queries. */
  class ReturnLabelDetails(_tableTag: Tag) extends profile.api.Table[ReturnLabelDetailsRow](_tableTag, Some("ecommerce"), "return_label_details") {
    def * = (id, domesticShipmentId, buCode, carrierName, extraChargeCodes, lineCommodityCode, dispatchDate, authorityToLeave, security, signatureRequired, qrCountryCode, gs1CountryCode, chargeAccountNumber, chargeCode, createdAt, adpFlag, nsrFlag, receiverAddressCode, dutiesAndTaxes) <> (ReturnLabelDetailsRow.tupled, ReturnLabelDetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(domesticShipmentId), buCode, Rep.Some(carrierName), extraChargeCodes, lineCommodityCode, Rep.Some(dispatchDate), authorityToLeave, security, signatureRequired, Rep.Some(qrCountryCode), Rep.Some(gs1CountryCode), Rep.Some(chargeAccountNumber), Rep.Some(chargeCode), Rep.Some(createdAt), Rep.Some(adpFlag), Rep.Some(nsrFlag), Rep.Some(receiverAddressCode), dutiesAndTaxes)).shaped.<>({r=>import r._; _1.map(_=> ReturnLabelDetailsRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7.get, _8, _9, _10, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column domestic_shipment_id SqlType(int8) */
    val domesticShipmentId: Rep[Long] = column[Long]("domestic_shipment_id")
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
    /** Database column created_at SqlType(timestamp) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column adp_flag SqlType(bool), Default(false) */
    val adpFlag: Rep[Boolean] = column[Boolean]("adp_flag", O.Default(false))
    /** Database column nsr_flag SqlType(bool), Default(false) */
    val nsrFlag: Rep[Boolean] = column[Boolean]("nsr_flag", O.Default(false))
    /** Database column receiver_address_code SqlType(text), Default(B) */
    val receiverAddressCode: Rep[String] = column[String]("receiver_address_code", O.Default("B"))
    /** Database column duties_and_taxes SqlType(text), Default(None) */
    val dutiesAndTaxes: Rep[Option[String]] = column[Option[String]]("duties_and_taxes", O.Default(None))

    /** Foreign key referencing DomesticShipments (database name domestic_shipment_id) */
    lazy val domesticShipmentsFk = foreignKey("domestic_shipment_id", domesticShipmentId, DomesticShipments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ReturnLabelDetails */
  lazy val ReturnLabelDetails = new TableQuery(tag => new ReturnLabelDetails(tag))
}
