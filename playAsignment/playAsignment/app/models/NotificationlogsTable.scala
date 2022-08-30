package models
// AUTO-GENERATED Slick data model for table Notificationlogs
trait NotificationlogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Notificationlogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentnumber Database column consignmentnumber SqlType(text)
   *  @param mobilenumber Database column mobilenumber SqlType(text), Default(None)
   *  @param email Database column email SqlType(text), Default(None)
   *  @param pin Database column pin SqlType(text), Default(None)
   *  @param couriercode Database column couriercode SqlType(text), Default(None)
   *  @param mailbody Database column mailbody SqlType(text), Default(None)
   *  @param emailapiresponse Database column emailapiresponse SqlType(text), Default(None)
   *  @param emailIssend Database column email_issend SqlType(bool), Default(Some(false))
   *  @param smsbody Database column smsbody SqlType(text), Default(None)
   *  @param smsapiresponse Database column smsapiresponse SqlType(text), Default(None)
   *  @param smsIssend Database column sms_issend SqlType(bool), Default(Some(false))
   *  @param sendtry Database column sendtry SqlType(int8), Default(None)
   *  @param notificationIssend Database column notification_issend SqlType(bool), Default(Some(false))
   *  @param eventid Database column eventid SqlType(int8), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param couriername Database column couriername SqlType(text), Default(None)
   *  @param daysend Database column daysend SqlType(text), Default(None)
   *  @param daysendat Database column daysendat SqlType(timestamptz), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class NotificationlogsRow(id: Long, consignmentnumber: String, mobilenumber: Option[String] = None, email: Option[String] = None, pin: Option[String] = None, couriercode: Option[String] = None, mailbody: Option[String] = None, emailapiresponse: Option[String] = None, emailIssend: Option[Boolean] = Some(false), smsbody: Option[String] = None, smsapiresponse: Option[String] = None, smsIssend: Option[Boolean] = Some(false), sendtry: Option[Long] = None, notificationIssend: Option[Boolean] = Some(false), eventid: Option[Long] = None, country: Option[String] = None, couriername: Option[String] = None, daysend: Option[String] = None, daysendat: Option[java.sql.Timestamp] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching NotificationlogsRow objects using plain SQL queries */
  implicit def GetResultNotificationlogsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]], e6: GR[java.sql.Timestamp]): GR[NotificationlogsRow] = GR{
    prs => import prs._
    NotificationlogsRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[Boolean], <<?[Long], <<?[Boolean], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table notificationlogs. Objects of this class serve as prototypes for rows in queries. */
  class Notificationlogs(_tableTag: Tag) extends profile.api.Table[NotificationlogsRow](_tableTag, Some("standard_apis"), "notificationlogs") {
    def * = (id, consignmentnumber, mobilenumber, email, pin, couriercode, mailbody, emailapiresponse, emailIssend, smsbody, smsapiresponse, smsIssend, sendtry, notificationIssend, eventid, country, couriername, daysend, daysendat, createdAt) <> (NotificationlogsRow.tupled, NotificationlogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentnumber), mobilenumber, email, pin, couriercode, mailbody, emailapiresponse, emailIssend, smsbody, smsapiresponse, smsIssend, sendtry, notificationIssend, eventid, country, couriername, daysend, daysendat, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> NotificationlogsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentnumber SqlType(text) */
    val consignmentnumber: Rep[String] = column[String]("consignmentnumber")
    /** Database column mobilenumber SqlType(text), Default(None) */
    val mobilenumber: Rep[Option[String]] = column[Option[String]]("mobilenumber", O.Default(None))
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))
    /** Database column pin SqlType(text), Default(None) */
    val pin: Rep[Option[String]] = column[Option[String]]("pin", O.Default(None))
    /** Database column couriercode SqlType(text), Default(None) */
    val couriercode: Rep[Option[String]] = column[Option[String]]("couriercode", O.Default(None))
    /** Database column mailbody SqlType(text), Default(None) */
    val mailbody: Rep[Option[String]] = column[Option[String]]("mailbody", O.Default(None))
    /** Database column emailapiresponse SqlType(text), Default(None) */
    val emailapiresponse: Rep[Option[String]] = column[Option[String]]("emailapiresponse", O.Default(None))
    /** Database column email_issend SqlType(bool), Default(Some(false)) */
    val emailIssend: Rep[Option[Boolean]] = column[Option[Boolean]]("email_issend", O.Default(Some(false)))
    /** Database column smsbody SqlType(text), Default(None) */
    val smsbody: Rep[Option[String]] = column[Option[String]]("smsbody", O.Default(None))
    /** Database column smsapiresponse SqlType(text), Default(None) */
    val smsapiresponse: Rep[Option[String]] = column[Option[String]]("smsapiresponse", O.Default(None))
    /** Database column sms_issend SqlType(bool), Default(Some(false)) */
    val smsIssend: Rep[Option[Boolean]] = column[Option[Boolean]]("sms_issend", O.Default(Some(false)))
    /** Database column sendtry SqlType(int8), Default(None) */
    val sendtry: Rep[Option[Long]] = column[Option[Long]]("sendtry", O.Default(None))
    /** Database column notification_issend SqlType(bool), Default(Some(false)) */
    val notificationIssend: Rep[Option[Boolean]] = column[Option[Boolean]]("notification_issend", O.Default(Some(false)))
    /** Database column eventid SqlType(int8), Default(None) */
    val eventid: Rep[Option[Long]] = column[Option[Long]]("eventid", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column couriername SqlType(text), Default(None) */
    val couriername: Rep[Option[String]] = column[Option[String]]("couriername", O.Default(None))
    /** Database column daysend SqlType(text), Default(None) */
    val daysend: Rep[Option[String]] = column[Option[String]]("daysend", O.Default(None))
    /** Database column daysendat SqlType(timestamptz), Default(None) */
    val daysendat: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("daysendat", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table Notificationlogs */
  lazy val Notificationlogs = new TableQuery(tag => new Notificationlogs(tag))
}
