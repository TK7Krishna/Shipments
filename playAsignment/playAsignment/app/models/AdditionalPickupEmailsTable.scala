package models
// AUTO-GENERATED Slick data model for table AdditionalPickupEmails
trait AdditionalPickupEmailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AdditionalPickupEmails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param subject Database column subject SqlType(text)
   *  @param processDate Database column process_date SqlType(timestamptz), Default(None)
   *  @param success Database column success SqlType(bool), Default(false)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class AdditionalPickupEmailsRow(id: Long, subject: String, processDate: Option[java.sql.Timestamp] = None, success: Boolean = false, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching AdditionalPickupEmailsRow objects using plain SQL queries */
  implicit def GetResultAdditionalPickupEmailsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[AdditionalPickupEmailsRow] = GR{
    prs => import prs._
    AdditionalPickupEmailsRow.tupled((<<[Long], <<[String], <<?[java.sql.Timestamp], <<[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table additional_pickup_emails. Objects of this class serve as prototypes for rows in queries. */
  class AdditionalPickupEmails(_tableTag: Tag) extends profile.api.Table[AdditionalPickupEmailsRow](_tableTag, Some("locker"), "additional_pickup_emails") {
    def * = (id, subject, processDate, success, createdAt) <> (AdditionalPickupEmailsRow.tupled, AdditionalPickupEmailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(subject), processDate, Rep.Some(success), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> AdditionalPickupEmailsRow.tupled((_1.get, _2.get, _3, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column subject SqlType(text) */
    val subject: Rep[String] = column[String]("subject")
    /** Database column process_date SqlType(timestamptz), Default(None) */
    val processDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("process_date", O.Default(None))
    /** Database column success SqlType(bool), Default(false) */
    val success: Rep[Boolean] = column[Boolean]("success", O.Default(false))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table AdditionalPickupEmails */
  lazy val AdditionalPickupEmails = new TableQuery(tag => new AdditionalPickupEmails(tag))
}
