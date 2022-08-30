package models
// AUTO-GENERATED Slick data model for table WebhookLog
trait WebhookLogTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookLog
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param accesscode Database column accesscode SqlType(text), Default(None)
   *  @param locationid Database column locationid SqlType(text), Default(None)
   *  @param trackingnumber Database column trackingnumber SqlType(text), Default(None)
   *  @param servicetype Database column servicetype SqlType(text), Default(None)
   *  @param locationname Database column locationname SqlType(text), Default(None)
   *  @param expressnumber Database column expressnumber SqlType(text), Default(None)
   *  @param compartmentnumber Database column compartmentnumber SqlType(text), Default(None)
   *  @param compartmentid Database column compartmentid SqlType(text), Default(None)
   *  @param event Database column event SqlType(text), Default(None)
   *  @param operator Database column operator SqlType(text), Default(None)
   *  @param status Database column status SqlType(text), Default(None)
   *  @param isProcessed Database column is_processed SqlType(bool), Default(false)
   *  @param statustime Database column statustime SqlType(timestamptz), Default(None)
   *  @param statustimestamp Database column statustimestamp SqlType(text), Default(None)
   *  @param createdat Database column createdat SqlType(timestamptz), Default(None)
   *  @param modifiedat Database column modifiedat SqlType(timestamptz), Default(None)
   *  @param responseAsJson Database column response_as_json SqlType(text), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(None) */
  case class WebhookLogRow(id: Long, accesscode: Option[String] = None, locationid: Option[String] = None, trackingnumber: Option[String] = None, servicetype: Option[String] = None, locationname: Option[String] = None, expressnumber: Option[String] = None, compartmentnumber: Option[String] = None, compartmentid: Option[String] = None, event: Option[String] = None, operator: Option[String] = None, status: Option[String] = None, isProcessed: Boolean = false, statustime: Option[java.sql.Timestamp] = None, statustimestamp: Option[String] = None, createdat: Option[java.sql.Timestamp] = None, modifiedat: Option[java.sql.Timestamp] = None, responseAsJson: Option[String] = None, attemptCount: Option[Int] = None)
  /** GetResult implicit for fetching WebhookLogRow objects using plain SQL queries */
  implicit def GetResultWebhookLogRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Boolean], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Int]]): GR[WebhookLogRow] = GR{
    prs => import prs._
    WebhookLogRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Boolean], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[Int]))
  }
  /** Table description of table webhook_log. Objects of this class serve as prototypes for rows in queries. */
  class WebhookLog(_tableTag: Tag) extends profile.api.Table[WebhookLogRow](_tableTag, Some("pakpobox"), "webhook_log") {
    def * = (id, accesscode, locationid, trackingnumber, servicetype, locationname, expressnumber, compartmentnumber, compartmentid, event, operator, status, isProcessed, statustime, statustimestamp, createdat, modifiedat, responseAsJson, attemptCount) <> (WebhookLogRow.tupled, WebhookLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), accesscode, locationid, trackingnumber, servicetype, locationname, expressnumber, compartmentnumber, compartmentid, event, operator, status, Rep.Some(isProcessed), statustime, statustimestamp, createdat, modifiedat, responseAsJson, attemptCount)).shaped.<>({r=>import r._; _1.map(_=> WebhookLogRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13.get, _14, _15, _16, _17, _18, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column accesscode SqlType(text), Default(None) */
    val accesscode: Rep[Option[String]] = column[Option[String]]("accesscode", O.Default(None))
    /** Database column locationid SqlType(text), Default(None) */
    val locationid: Rep[Option[String]] = column[Option[String]]("locationid", O.Default(None))
    /** Database column trackingnumber SqlType(text), Default(None) */
    val trackingnumber: Rep[Option[String]] = column[Option[String]]("trackingnumber", O.Default(None))
    /** Database column servicetype SqlType(text), Default(None) */
    val servicetype: Rep[Option[String]] = column[Option[String]]("servicetype", O.Default(None))
    /** Database column locationname SqlType(text), Default(None) */
    val locationname: Rep[Option[String]] = column[Option[String]]("locationname", O.Default(None))
    /** Database column expressnumber SqlType(text), Default(None) */
    val expressnumber: Rep[Option[String]] = column[Option[String]]("expressnumber", O.Default(None))
    /** Database column compartmentnumber SqlType(text), Default(None) */
    val compartmentnumber: Rep[Option[String]] = column[Option[String]]("compartmentnumber", O.Default(None))
    /** Database column compartmentid SqlType(text), Default(None) */
    val compartmentid: Rep[Option[String]] = column[Option[String]]("compartmentid", O.Default(None))
    /** Database column event SqlType(text), Default(None) */
    val event: Rep[Option[String]] = column[Option[String]]("event", O.Default(None))
    /** Database column operator SqlType(text), Default(None) */
    val operator: Rep[Option[String]] = column[Option[String]]("operator", O.Default(None))
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column is_processed SqlType(bool), Default(false) */
    val isProcessed: Rep[Boolean] = column[Boolean]("is_processed", O.Default(false))
    /** Database column statustime SqlType(timestamptz), Default(None) */
    val statustime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("statustime", O.Default(None))
    /** Database column statustimestamp SqlType(text), Default(None) */
    val statustimestamp: Rep[Option[String]] = column[Option[String]]("statustimestamp", O.Default(None))
    /** Database column createdat SqlType(timestamptz), Default(None) */
    val createdat: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdat", O.Default(None))
    /** Database column modifiedat SqlType(timestamptz), Default(None) */
    val modifiedat: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modifiedat", O.Default(None))
    /** Database column response_as_json SqlType(text), Default(None) */
    val responseAsJson: Rep[Option[String]] = column[Option[String]]("response_as_json", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(None) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(None))
  }
  /** Collection-like TableQuery object for table WebhookLog */
  lazy val WebhookLog = new TableQuery(tag => new WebhookLog(tag))
}
