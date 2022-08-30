package models
// AUTO-GENERATED Slick data model for table StgApiResponses
trait StgApiResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgApiResponses
   *  @param request Database column request SqlType(int8), PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param headers Database column headers SqlType(json), Length(2147483647,false)
   *  @param status Database column status SqlType(int4)
   *  @param bodyRaw Database column body_raw SqlType(text), Default(None) */
  case class StgApiResponsesRow(request: Long, createdAt: java.sql.Timestamp, headers: String, status: Int, bodyRaw: Option[String] = None)
  /** GetResult implicit for fetching StgApiResponsesRow objects using plain SQL queries */
  implicit def GetResultStgApiResponsesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Int], e4: GR[Option[String]]): GR[StgApiResponsesRow] = GR{
    prs => import prs._
    StgApiResponsesRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[String], <<[Int], <<?[String]))
  }
  /** Table description of table stg_api_responses. Objects of this class serve as prototypes for rows in queries. */
  class StgApiResponses(_tableTag: Tag) extends profile.api.Table[StgApiResponsesRow](_tableTag, Some("seven_eleven"), "stg_api_responses") {
    def * = (request, createdAt, headers, status, bodyRaw) <> (StgApiResponsesRow.tupled, StgApiResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(request), Rep.Some(createdAt), Rep.Some(headers), Rep.Some(status), bodyRaw)).shaped.<>({r=>import r._; _1.map(_=> StgApiResponsesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column request SqlType(int8), PrimaryKey */
    val request: Rep[Long] = column[Long]("request", O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column headers SqlType(json), Length(2147483647,false) */
    val headers: Rep[String] = column[String]("headers", O.Length(2147483647,varying=false))
    /** Database column status SqlType(int4) */
    val status: Rep[Int] = column[Int]("status")
    /** Database column body_raw SqlType(text), Default(None) */
    val bodyRaw: Rep[Option[String]] = column[Option[String]]("body_raw", O.Default(None))

    /** Foreign key referencing StgApiRequests (database name stg_api_responses_request_fkey) */
    lazy val stgApiRequestsFk = foreignKey("stg_api_responses_request_fkey", request, StgApiRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table StgApiResponses */
  lazy val StgApiResponses = new TableQuery(tag => new StgApiResponses(tag))
}
