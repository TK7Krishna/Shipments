package models
// AUTO-GENERATED Slick data model for table TransactionsReportsConsignments
trait TransactionsReportsConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionsReportsConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param transactionHeader Database column transaction_header SqlType(int8)
   *  @param eventType Database column event_type SqlType(text)
   *  @param locationId Database column location_id SqlType(int8)
   *  @param webhookId Database column webhook_id SqlType(int8), Default(None)
   *  @param courier Database column courier SqlType(text)
   *  @param inboundConsignmentId Database column inbound_consignment_id SqlType(int8), Default(None)
   *  @param inboundArticleId Database column inbound_article_id SqlType(int8), Default(None)
   *  @param externalConsignmentId Database column external_consignment_id SqlType(int8), Default(None)
   *  @param externalArticleId Database column external_article_id SqlType(int8), Default(None)
   *  @param stgConsignmentId Database column stg_consignment_id SqlType(int8), Default(None)
   *  @param stgArticlesId Database column stg_articles_id SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param sevenElevenLocationData Database column seven_eleven_location_data SqlType(int8), Default(None) */
  case class TransactionsReportsConsignmentsRow(id: Long, transactionHeader: Long, eventType: String, locationId: Long, webhookId: Option[Long] = None, courier: String, inboundConsignmentId: Option[Long] = None, inboundArticleId: Option[Long] = None, externalConsignmentId: Option[Long] = None, externalArticleId: Option[Long] = None, stgConsignmentId: Option[Long] = None, stgArticlesId: Option[Long] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, sevenElevenLocationData: Option[Long] = None)
  /** GetResult implicit for fetching TransactionsReportsConsignmentsRow objects using plain SQL queries */
  implicit def GetResultTransactionsReportsConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[java.sql.Timestamp]): GR[TransactionsReportsConsignmentsRow] = GR{
    prs => import prs._
    TransactionsReportsConsignmentsRow.tupled((<<[Long], <<[Long], <<[String], <<[Long], <<?[Long], <<[String], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table transactions_reports_consignments. Objects of this class serve as prototypes for rows in queries. */
  class TransactionsReportsConsignments(_tableTag: Tag) extends profile.api.Table[TransactionsReportsConsignmentsRow](_tableTag, Some("seven_eleven"), "transactions_reports_consignments") {
    def * = (id, transactionHeader, eventType, locationId, webhookId, courier, inboundConsignmentId, inboundArticleId, externalConsignmentId, externalArticleId, stgConsignmentId, stgArticlesId, createdAt, modifiedAt, sevenElevenLocationData) <> (TransactionsReportsConsignmentsRow.tupled, TransactionsReportsConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(transactionHeader), Rep.Some(eventType), Rep.Some(locationId), webhookId, Rep.Some(courier), inboundConsignmentId, inboundArticleId, externalConsignmentId, externalArticleId, stgConsignmentId, stgArticlesId, Rep.Some(createdAt), Rep.Some(modifiedAt), sevenElevenLocationData)).shaped.<>({r=>import r._; _1.map(_=> TransactionsReportsConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7, _8, _9, _10, _11, _12, _13.get, _14.get, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column transaction_header SqlType(int8) */
    val transactionHeader: Rep[Long] = column[Long]("transaction_header")
    /** Database column event_type SqlType(text) */
    val eventType: Rep[String] = column[String]("event_type")
    /** Database column location_id SqlType(int8) */
    val locationId: Rep[Long] = column[Long]("location_id")
    /** Database column webhook_id SqlType(int8), Default(None) */
    val webhookId: Rep[Option[Long]] = column[Option[Long]]("webhook_id", O.Default(None))
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column inbound_consignment_id SqlType(int8), Default(None) */
    val inboundConsignmentId: Rep[Option[Long]] = column[Option[Long]]("inbound_consignment_id", O.Default(None))
    /** Database column inbound_article_id SqlType(int8), Default(None) */
    val inboundArticleId: Rep[Option[Long]] = column[Option[Long]]("inbound_article_id", O.Default(None))
    /** Database column external_consignment_id SqlType(int8), Default(None) */
    val externalConsignmentId: Rep[Option[Long]] = column[Option[Long]]("external_consignment_id", O.Default(None))
    /** Database column external_article_id SqlType(int8), Default(None) */
    val externalArticleId: Rep[Option[Long]] = column[Option[Long]]("external_article_id", O.Default(None))
    /** Database column stg_consignment_id SqlType(int8), Default(None) */
    val stgConsignmentId: Rep[Option[Long]] = column[Option[Long]]("stg_consignment_id", O.Default(None))
    /** Database column stg_articles_id SqlType(int8), Default(None) */
    val stgArticlesId: Rep[Option[Long]] = column[Option[Long]]("stg_articles_id", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column seven_eleven_location_data SqlType(int8), Default(None) */
    val sevenElevenLocationData: Rep[Option[Long]] = column[Option[Long]]("seven_eleven_location_data", O.Default(None))

    /** Foreign key referencing Articles (database name transactions_reports_consignments_external_article_id_fkey) */
    lazy val articlesFk = foreignKey("transactions_reports_consignments_external_article_id_fkey", externalArticleId, Articles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Articles (database name transactions_reports_consignments_inbound_article_id_fkey) */
    lazy val articlesFk = foreignKey("transactions_reports_consignments_inbound_article_id_fkey", inboundArticleId, Articles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name transactions_reports_consignments_external_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("transactions_reports_consignments_external_consignment_id_fkey", externalConsignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name transactions_reports_consignments_inbound_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("transactions_reports_consignments_inbound_consignment_id_fkey", inboundConsignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name transactions_reports_consignments_courier_fkey) */
    lazy val couriersFk = foreignKey("transactions_reports_consignments_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name transactions_reports_consignments_location_id_fkey) */
    lazy val droplocationsFk = foreignKey("transactions_reports_consignments_location_id_fkey", locationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LocationData (database name transactions_reports_consignmen_seven_eleven_location_data_fkey) */
    lazy val locationDataFk = foreignKey("transactions_reports_consignmen_seven_eleven_location_data_fkey", sevenElevenLocationData, LocationData)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing StgArticles (database name transactions_reports_consignments_stg_articles_id_fkey) */
    lazy val stgArticlesFk = foreignKey("transactions_reports_consignments_stg_articles_id_fkey", stgArticlesId, StgArticles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing StgConsignments (database name transactions_reports_consignments_stg_consignment_id_fkey) */
    lazy val stgConsignmentsFk = foreignKey("transactions_reports_consignments_stg_consignment_id_fkey", stgConsignmentId, StgConsignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name transactions_reports_consignments_transaction_header_fkey) */
    lazy val transactionHeadersFk = foreignKey("transactions_reports_consignments_transaction_header_fkey", transactionHeader, TransactionHeaders)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Webhooks (database name transactions_reports_consignments_webhook_id_fkey) */
    lazy val webhooksFk = foreignKey("transactions_reports_consignments_webhook_id_fkey", webhookId, Webhooks)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TransactionsReportsConsignments */
  lazy val TransactionsReportsConsignments = new TableQuery(tag => new TransactionsReportsConsignments(tag))
}
