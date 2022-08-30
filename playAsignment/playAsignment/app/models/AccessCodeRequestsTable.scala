package models
// AUTO-GENERATED Slick data model for table AccessCodeRequests
trait AccessCodeRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AccessCodeRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param userAgent Database column user_agent SqlType(text), Default(None)
   *  @param sourceIp Database column source_ip SqlType(text), Default(None)
   *  @param token Database column token SqlType(text), Default(None) */
  case class AccessCodeRequestsRow(id: Long, createdAt: java.sql.Timestamp, userAgent: Option[String] = None, sourceIp: Option[String] = None, token: Option[String] = None)
  /** GetResult implicit for fetching AccessCodeRequestsRow objects using plain SQL queries */
  implicit def GetResultAccessCodeRequestsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]]): GR[AccessCodeRequestsRow] = GR{
    prs => import prs._
    AccessCodeRequestsRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table access_code_requests. Objects of this class serve as prototypes for rows in queries. */
  class AccessCodeRequests(_tableTag: Tag) extends profile.api.Table[AccessCodeRequestsRow](_tableTag, Some("locker"), "access_code_requests") {
    def * = (id, createdAt, userAgent, sourceIp, token) <> (AccessCodeRequestsRow.tupled, AccessCodeRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(createdAt), userAgent, sourceIp, token)).shaped.<>({r=>import r._; _1.map(_=> AccessCodeRequestsRow.tupled((_1.get, _2.get, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column user_agent SqlType(text), Default(None) */
    val userAgent: Rep[Option[String]] = column[Option[String]]("user_agent", O.Default(None))
    /** Database column source_ip SqlType(text), Default(None) */
    val sourceIp: Rep[Option[String]] = column[Option[String]]("source_ip", O.Default(None))
    /** Database column token SqlType(text), Default(None) */
    val token: Rep[Option[String]] = column[Option[String]]("token", O.Default(None))
  }
  /** Collection-like TableQuery object for table AccessCodeRequests */
  lazy val AccessCodeRequests = new TableQuery(tag => new AccessCodeRequests(tag))
}
