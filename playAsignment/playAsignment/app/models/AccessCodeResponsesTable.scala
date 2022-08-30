package models
// AUTO-GENERATED Slick data model for table AccessCodeResponses
trait AccessCodeResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AccessCodeResponses
   *  @param request Database column request SqlType(int8), PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param status Database column status SqlType(int4) */
  case class AccessCodeResponsesRow(request: Long, createdAt: java.sql.Timestamp, status: Int)
  /** GetResult implicit for fetching AccessCodeResponsesRow objects using plain SQL queries */
  implicit def GetResultAccessCodeResponsesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Int]): GR[AccessCodeResponsesRow] = GR{
    prs => import prs._
    AccessCodeResponsesRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table access_code_responses. Objects of this class serve as prototypes for rows in queries. */
  class AccessCodeResponses(_tableTag: Tag) extends profile.api.Table[AccessCodeResponsesRow](_tableTag, Some("locker"), "access_code_responses") {
    def * = (request, createdAt, status) <> (AccessCodeResponsesRow.tupled, AccessCodeResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(request), Rep.Some(createdAt), Rep.Some(status))).shaped.<>({r=>import r._; _1.map(_=> AccessCodeResponsesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column request SqlType(int8), PrimaryKey */
    val request: Rep[Long] = column[Long]("request", O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column status SqlType(int4) */
    val status: Rep[Int] = column[Int]("status")

    /** Foreign key referencing AccessCodeRequests (database name access_code_responses_request_fkey) */
    lazy val accessCodeRequestsFk = foreignKey("access_code_responses_request_fkey", request, AccessCodeRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AccessCodeResponses */
  lazy val AccessCodeResponses = new TableQuery(tag => new AccessCodeResponses(tag))
}
