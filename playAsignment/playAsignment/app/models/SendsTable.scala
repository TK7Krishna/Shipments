package models
// AUTO-GENERATED Slick data model for table Sends
trait SendsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Sends
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param workflow Database column workflow SqlType(text)
   *  @param fromEmail Database column from_email SqlType(text)
   *  @param fromName Database column from_name SqlType(text), Default(None)
   *  @param subject Database column subject SqlType(text)
   *  @param text Database column text SqlType(text), Default(None)
   *  @param html Database column html SqlType(text), Default(None)
   *  @param replyTo Database column reply_to SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param maxRetries Database column max_retries SqlType(int4)
   *  @param nextRetry Database column next_retry SqlType(timestamptz), Default(None) */
  case class SendsRow(id: Long, workflow: String, fromEmail: String, fromName: Option[String] = None, subject: String, text: Option[String] = None, html: Option[String] = None, replyTo: Option[String] = None, createdAt: Option[java.sql.Timestamp], maxRetries: Int, nextRetry: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching SendsRow objects using plain SQL queries */
  implicit def GetResultSendsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Int]): GR[SendsRow] = GR{
    prs => import prs._
    SendsRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<[Int], <<?[java.sql.Timestamp]))
  }
  /** Table description of table sends. Objects of this class serve as prototypes for rows in queries. */
  class Sends(_tableTag: Tag) extends profile.api.Table[SendsRow](_tableTag, Some("email"), "sends") {
    def * = (id, workflow, fromEmail, fromName, subject, text, html, replyTo, createdAt, maxRetries, nextRetry) <> (SendsRow.tupled, SendsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(workflow), Rep.Some(fromEmail), fromName, Rep.Some(subject), text, html, replyTo, createdAt, Rep.Some(maxRetries), nextRetry)).shaped.<>({r=>import r._; _1.map(_=> SendsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8, _9, _10.get, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column workflow SqlType(text) */
    val workflow: Rep[String] = column[String]("workflow")
    /** Database column from_email SqlType(text) */
    val fromEmail: Rep[String] = column[String]("from_email")
    /** Database column from_name SqlType(text), Default(None) */
    val fromName: Rep[Option[String]] = column[Option[String]]("from_name", O.Default(None))
    /** Database column subject SqlType(text) */
    val subject: Rep[String] = column[String]("subject")
    /** Database column text SqlType(text), Default(None) */
    val text: Rep[Option[String]] = column[Option[String]]("text", O.Default(None))
    /** Database column html SqlType(text), Default(None) */
    val html: Rep[Option[String]] = column[Option[String]]("html", O.Default(None))
    /** Database column reply_to SqlType(text), Default(None) */
    val replyTo: Rep[Option[String]] = column[Option[String]]("reply_to", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column max_retries SqlType(int4) */
    val maxRetries: Rep[Int] = column[Int]("max_retries")
    /** Database column next_retry SqlType(timestamptz), Default(None) */
    val nextRetry: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_retry", O.Default(None))
  }
  /** Collection-like TableQuery object for table Sends */
  lazy val Sends = new TableQuery(tag => new Sends(tag))
}
