package models
// AUTO-GENERATED Slick data model for table OutboundTransaction
trait OutboundTransactionTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundTransaction
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param billingAddress1 Database column billing_address1 SqlType(text), Default(None)
   *  @param billingAddress2 Database column billing_address2 SqlType(text), Default(None)
   *  @param billingSuburb Database column billing_suburb SqlType(text), Default(None)
   *  @param billingCountry Database column billing_country SqlType(text), Default(None)
   *  @param billingState Database column billing_state SqlType(text), Default(None)
   *  @param billingPostalcode Database column billing_postalcode SqlType(text), Default(None)
   *  @param paymentMessage Database column payment_message SqlType(text), Default(None)
   *  @param paymentResponseJson Database column payment_response_json SqlType(text), Default(None)
   *  @param isPaymentSuccess Database column is_payment_success SqlType(bool), Default(None)
   *  @param refundMessage Database column refund_message SqlType(text), Default(None)
   *  @param refundResponseJson Database column refund_response_json SqlType(text), Default(None)
   *  @param isRefundSuccess Database column is_refund_success SqlType(bool), Default(None)
   *  @param status Database column status SqlType(text), Default(None)
   *  @param merchantAccountId Database column merchant_account_id SqlType(text), Default(None)
   *  @param paymentMethodName Database column payment_method_name SqlType(text), Default(None)
   *  @param currencyCode Database column currency_code SqlType(text), Default(None)
   *  @param orderTax Database column order_tax SqlType(numeric), Default(None)
   *  @param orderDiscount Database column order_discount SqlType(numeric), Default(None)
   *  @param orderTotal Database column order_total SqlType(numeric), Default(None)
   *  @param customerIp Database column customer_ip SqlType(text), Default(None)
   *  @param cardType Database column card_type SqlType(text), Default(None)
   *  @param cardHolderName Database column card_holder_name SqlType(text), Default(None)
   *  @param last4CardNumber Database column last4_card_number SqlType(int4), Default(None)
   *  @param cardExpirationMonth Database column card_expiration_month SqlType(int4), Default(None)
   *  @param cardExpirationYear Database column card_expiration_year SqlType(int4), Default(None)
   *  @param authorizationTransactionId Database column authorization_transaction_id SqlType(text), Default(None)
   *  @param authorizationTransactionGlobalId Database column authorization_transaction_global_id SqlType(text), Default(None)
   *  @param processAuthorizationCode Database column process_authorization_code SqlType(text), Default(None)
   *  @param processResponseCode Database column process_response_code SqlType(text), Default(None)
   *  @param processResponseType Database column process_response_type SqlType(text), Default(None)
   *  @param refundTransactionGlobalId Database column refund_transaction_global_id SqlType(text), Default(None)
   *  @param refundTransactionId Database column refund_transaction_id SqlType(text), Default(None)
   *  @param refundId Database column refund_id SqlType(text), Default(None)
   *  @param transactionId Database column transaction_id SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param paidDate Database column paid_date SqlType(timestamptz), Default(None)
   *  @param saleRate Database column sale_rate SqlType(numeric), Default(Some(0))
   *  @param buyRate Database column buy_rate SqlType(numeric), Default(Some(0))
   *  @param additionalCharge Database column additional_charge SqlType(numeric), Default(None)
   *  @param paymentRateType Database column payment_rate_type SqlType(int4), Default(None)
   *  @param returnapiResponse Database column returnapi_response SqlType(text), Default(None) */
  case class OutboundTransactionRow(id: Long, consignmentNumber: Option[String] = None, hubbedUserId: Long, billingAddress1: Option[String] = None, billingAddress2: Option[String] = None, billingSuburb: Option[String] = None, billingCountry: Option[String] = None, billingState: Option[String] = None, billingPostalcode: Option[String] = None, paymentMessage: Option[String] = None, paymentResponseJson: Option[String] = None, isPaymentSuccess: Option[Boolean] = None, refundMessage: Option[String] = None, refundResponseJson: Option[String] = None, isRefundSuccess: Option[Boolean] = None, status: Option[String] = None, merchantAccountId: Option[String] = None, paymentMethodName: Option[String] = None, currencyCode: Option[String] = None, orderTax: Option[scala.math.BigDecimal] = None, orderDiscount: Option[scala.math.BigDecimal] = None, orderTotal: Option[scala.math.BigDecimal] = None, customerIp: Option[String] = None, cardType: Option[String] = None, cardHolderName: Option[String] = None, last4CardNumber: Option[Int] = None, cardExpirationMonth: Option[Int] = None, cardExpirationYear: Option[Int] = None, authorizationTransactionId: Option[String] = None, authorizationTransactionGlobalId: Option[String] = None, processAuthorizationCode: Option[String] = None, processResponseCode: Option[String] = None, processResponseType: Option[String] = None, refundTransactionGlobalId: Option[String] = None, refundTransactionId: Option[String] = None, refundId: Option[String] = None, transactionId: Option[String] = None, createdAt: java.sql.Timestamp, paidDate: Option[java.sql.Timestamp] = None, saleRate: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), buyRate: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), additionalCharge: Option[scala.math.BigDecimal] = None, paymentRateType: Option[Int] = None, returnapiResponse: Option[String] = None)
  /** GetResult implicit for fetching OutboundTransactionRow objects using plain SQL queries */
  implicit def GetResultOutboundTransactionRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[Int]], e5: GR[java.sql.Timestamp], e6: GR[Option[java.sql.Timestamp]]): GR[OutboundTransactionRow] = GR{
    prs => import prs._
    OutboundTransactionRow(<<[Long], <<?[String], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[Int], <<?[String])
  }
  /** Table description of table outbound_transaction. Objects of this class serve as prototypes for rows in queries. */
  class OutboundTransaction(_tableTag: Tag) extends profile.api.Table[OutboundTransactionRow](_tableTag, Some("ecommerce"), "outbound_transaction") {
    def * = (id :: consignmentNumber :: hubbedUserId :: billingAddress1 :: billingAddress2 :: billingSuburb :: billingCountry :: billingState :: billingPostalcode :: paymentMessage :: paymentResponseJson :: isPaymentSuccess :: refundMessage :: refundResponseJson :: isRefundSuccess :: status :: merchantAccountId :: paymentMethodName :: currencyCode :: orderTax :: orderDiscount :: orderTotal :: customerIp :: cardType :: cardHolderName :: last4CardNumber :: cardExpirationMonth :: cardExpirationYear :: authorizationTransactionId :: authorizationTransactionGlobalId :: processAuthorizationCode :: processResponseCode :: processResponseType :: refundTransactionGlobalId :: refundTransactionId :: refundId :: transactionId :: createdAt :: paidDate :: saleRate :: buyRate :: additionalCharge :: paymentRateType :: returnapiResponse :: HNil).mapTo[OutboundTransactionRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: consignmentNumber :: Rep.Some(hubbedUserId) :: billingAddress1 :: billingAddress2 :: billingSuburb :: billingCountry :: billingState :: billingPostalcode :: paymentMessage :: paymentResponseJson :: isPaymentSuccess :: refundMessage :: refundResponseJson :: isRefundSuccess :: status :: merchantAccountId :: paymentMethodName :: currencyCode :: orderTax :: orderDiscount :: orderTotal :: customerIp :: cardType :: cardHolderName :: last4CardNumber :: cardExpirationMonth :: cardExpirationYear :: authorizationTransactionId :: authorizationTransactionGlobalId :: processAuthorizationCode :: processResponseCode :: processResponseType :: refundTransactionGlobalId :: refundTransactionId :: refundId :: transactionId :: Rep.Some(createdAt) :: paidDate :: saleRate :: buyRate :: additionalCharge :: paymentRateType :: returnapiResponse :: HNil).shaped.<>(r => OutboundTransactionRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[Long]].get, r(3).asInstanceOf[Option[String]], r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[String]], r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[Boolean]], r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[String]], r(14).asInstanceOf[Option[Boolean]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[scala.math.BigDecimal]], r(20).asInstanceOf[Option[scala.math.BigDecimal]], r(21).asInstanceOf[Option[scala.math.BigDecimal]], r(22).asInstanceOf[Option[String]], r(23).asInstanceOf[Option[String]], r(24).asInstanceOf[Option[String]], r(25).asInstanceOf[Option[Int]], r(26).asInstanceOf[Option[Int]], r(27).asInstanceOf[Option[Int]], r(28).asInstanceOf[Option[String]], r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[String]], r(31).asInstanceOf[Option[String]], r(32).asInstanceOf[Option[String]], r(33).asInstanceOf[Option[String]], r(34).asInstanceOf[Option[String]], r(35).asInstanceOf[Option[String]], r(36).asInstanceOf[Option[String]], r(37).asInstanceOf[Option[java.sql.Timestamp]].get, r(38).asInstanceOf[Option[java.sql.Timestamp]], r(39).asInstanceOf[Option[scala.math.BigDecimal]], r(40).asInstanceOf[Option[scala.math.BigDecimal]], r(41).asInstanceOf[Option[scala.math.BigDecimal]], r(42).asInstanceOf[Option[Int]], r(43).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column billing_address1 SqlType(text), Default(None) */
    val billingAddress1: Rep[Option[String]] = column[Option[String]]("billing_address1", O.Default(None))
    /** Database column billing_address2 SqlType(text), Default(None) */
    val billingAddress2: Rep[Option[String]] = column[Option[String]]("billing_address2", O.Default(None))
    /** Database column billing_suburb SqlType(text), Default(None) */
    val billingSuburb: Rep[Option[String]] = column[Option[String]]("billing_suburb", O.Default(None))
    /** Database column billing_country SqlType(text), Default(None) */
    val billingCountry: Rep[Option[String]] = column[Option[String]]("billing_country", O.Default(None))
    /** Database column billing_state SqlType(text), Default(None) */
    val billingState: Rep[Option[String]] = column[Option[String]]("billing_state", O.Default(None))
    /** Database column billing_postalcode SqlType(text), Default(None) */
    val billingPostalcode: Rep[Option[String]] = column[Option[String]]("billing_postalcode", O.Default(None))
    /** Database column payment_message SqlType(text), Default(None) */
    val paymentMessage: Rep[Option[String]] = column[Option[String]]("payment_message", O.Default(None))
    /** Database column payment_response_json SqlType(text), Default(None) */
    val paymentResponseJson: Rep[Option[String]] = column[Option[String]]("payment_response_json", O.Default(None))
    /** Database column is_payment_success SqlType(bool), Default(None) */
    val isPaymentSuccess: Rep[Option[Boolean]] = column[Option[Boolean]]("is_payment_success", O.Default(None))
    /** Database column refund_message SqlType(text), Default(None) */
    val refundMessage: Rep[Option[String]] = column[Option[String]]("refund_message", O.Default(None))
    /** Database column refund_response_json SqlType(text), Default(None) */
    val refundResponseJson: Rep[Option[String]] = column[Option[String]]("refund_response_json", O.Default(None))
    /** Database column is_refund_success SqlType(bool), Default(None) */
    val isRefundSuccess: Rep[Option[Boolean]] = column[Option[Boolean]]("is_refund_success", O.Default(None))
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column merchant_account_id SqlType(text), Default(None) */
    val merchantAccountId: Rep[Option[String]] = column[Option[String]]("merchant_account_id", O.Default(None))
    /** Database column payment_method_name SqlType(text), Default(None) */
    val paymentMethodName: Rep[Option[String]] = column[Option[String]]("payment_method_name", O.Default(None))
    /** Database column currency_code SqlType(text), Default(None) */
    val currencyCode: Rep[Option[String]] = column[Option[String]]("currency_code", O.Default(None))
    /** Database column order_tax SqlType(numeric), Default(None) */
    val orderTax: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("order_tax", O.Default(None))
    /** Database column order_discount SqlType(numeric), Default(None) */
    val orderDiscount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("order_discount", O.Default(None))
    /** Database column order_total SqlType(numeric), Default(None) */
    val orderTotal: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("order_total", O.Default(None))
    /** Database column customer_ip SqlType(text), Default(None) */
    val customerIp: Rep[Option[String]] = column[Option[String]]("customer_ip", O.Default(None))
    /** Database column card_type SqlType(text), Default(None) */
    val cardType: Rep[Option[String]] = column[Option[String]]("card_type", O.Default(None))
    /** Database column card_holder_name SqlType(text), Default(None) */
    val cardHolderName: Rep[Option[String]] = column[Option[String]]("card_holder_name", O.Default(None))
    /** Database column last4_card_number SqlType(int4), Default(None) */
    val last4CardNumber: Rep[Option[Int]] = column[Option[Int]]("last4_card_number", O.Default(None))
    /** Database column card_expiration_month SqlType(int4), Default(None) */
    val cardExpirationMonth: Rep[Option[Int]] = column[Option[Int]]("card_expiration_month", O.Default(None))
    /** Database column card_expiration_year SqlType(int4), Default(None) */
    val cardExpirationYear: Rep[Option[Int]] = column[Option[Int]]("card_expiration_year", O.Default(None))
    /** Database column authorization_transaction_id SqlType(text), Default(None) */
    val authorizationTransactionId: Rep[Option[String]] = column[Option[String]]("authorization_transaction_id", O.Default(None))
    /** Database column authorization_transaction_global_id SqlType(text), Default(None) */
    val authorizationTransactionGlobalId: Rep[Option[String]] = column[Option[String]]("authorization_transaction_global_id", O.Default(None))
    /** Database column process_authorization_code SqlType(text), Default(None) */
    val processAuthorizationCode: Rep[Option[String]] = column[Option[String]]("process_authorization_code", O.Default(None))
    /** Database column process_response_code SqlType(text), Default(None) */
    val processResponseCode: Rep[Option[String]] = column[Option[String]]("process_response_code", O.Default(None))
    /** Database column process_response_type SqlType(text), Default(None) */
    val processResponseType: Rep[Option[String]] = column[Option[String]]("process_response_type", O.Default(None))
    /** Database column refund_transaction_global_id SqlType(text), Default(None) */
    val refundTransactionGlobalId: Rep[Option[String]] = column[Option[String]]("refund_transaction_global_id", O.Default(None))
    /** Database column refund_transaction_id SqlType(text), Default(None) */
    val refundTransactionId: Rep[Option[String]] = column[Option[String]]("refund_transaction_id", O.Default(None))
    /** Database column refund_id SqlType(text), Default(None) */
    val refundId: Rep[Option[String]] = column[Option[String]]("refund_id", O.Default(None))
    /** Database column transaction_id SqlType(text), Default(None) */
    val transactionId: Rep[Option[String]] = column[Option[String]]("transaction_id", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column paid_date SqlType(timestamptz), Default(None) */
    val paidDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("paid_date", O.Default(None))
    /** Database column sale_rate SqlType(numeric), Default(Some(0)) */
    val saleRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("sale_rate", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column buy_rate SqlType(numeric), Default(Some(0)) */
    val buyRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("buy_rate", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column additional_charge SqlType(numeric), Default(None) */
    val additionalCharge: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("additional_charge", O.Default(None))
    /** Database column payment_rate_type SqlType(int4), Default(None) */
    val paymentRateType: Rep[Option[Int]] = column[Option[Int]]("payment_rate_type", O.Default(None))
    /** Database column returnapi_response SqlType(text), Default(None) */
    val returnapiResponse: Rep[Option[String]] = column[Option[String]]("returnapi_response", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name outbound_transaction_hubbed_user_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("outbound_transaction_hubbed_user_id_fkey", hubbedUserId :: HNil, HubbedUsers)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OutboundTransaction */
  lazy val OutboundTransaction = new TableQuery(tag => new OutboundTransaction(tag))
}
