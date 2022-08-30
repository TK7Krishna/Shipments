package models
// AUTO-GENERATED Slick data model for table Errorlogs
trait ErrorlogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Errorlogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param details Database column details SqlType(text), Default(None)
   *  @param summary Database column summary SqlType(text), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(varchar), Length(30,true), Default(None)
   *  @param servicename Database column servicename SqlType(text), Default(None)
   *  @param logdate Database column logdate SqlType(timestamptz) */
  case class ErrorlogsRow(id: Long, details: Option[String] = None, summary: Option[String] = None, hubbedUserId: Option[String] = None, servicename: Option[String] = None, logdate: java.sql.Timestamp)
  /** GetResult implicit for fetching ErrorlogsRow objects using plain SQL queries */
  implicit def GetResultErrorlogsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[ErrorlogsRow] = GR{
    prs => import prs._
    ErrorlogsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table errorlogs. Objects of this class serve as prototypes for rows in queries. */
  class Errorlogs(_tableTag: Tag) extends profile.api.Table[ErrorlogsRow](_tableTag, Some("standard_apis"), "errorlogs") {
    def * = (id, details, summary, hubbedUserId, servicename, logdate) <> (ErrorlogsRow.tupled, ErrorlogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), details, summary, hubbedUserId, servicename, Rep.Some(logdate))).shaped.<>({r=>import r._; _1.map(_=> ErrorlogsRow.tupled((_1.get, _2, _3, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column details SqlType(text), Default(None) */
    val details: Rep[Option[String]] = column[Option[String]]("details", O.Default(None))
    /** Database column summary SqlType(text), Default(None) */
    val summary: Rep[Option[String]] = column[Option[String]]("summary", O.Default(None))
    /** Database column hubbed_user_id SqlType(varchar), Length(30,true), Default(None) */
    val hubbedUserId: Rep[Option[String]] = column[Option[String]]("hubbed_user_id", O.Length(30,varying=true), O.Default(None))
    /** Database column servicename SqlType(text), Default(None) */
    val servicename: Rep[Option[String]] = column[Option[String]]("servicename", O.Default(None))
    /** Database column logdate SqlType(timestamptz) */
    val logdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("logdate")
  }
  /** Collection-like TableQuery object for table Errorlogs */
  lazy val Errorlogs = new TableQuery(tag => new Errorlogs(tag))
}
