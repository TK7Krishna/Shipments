package models
// AUTO-GENERATED Slick data model for table Responses
trait ResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Responses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param requestId Database column request_id SqlType(bigserial), AutoInc
   *  @param code Database column code SqlType(int4), Default(None)
   *  @param body Database column body SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class ResponsesRow(id: Long, requestId: Long, code: Option[Int] = None, body: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ResponsesRow objects using plain SQL queries */
  implicit def GetResultResponsesRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[ResponsesRow] = GR{
    prs => import prs._
    ResponsesRow.tupled((<<[Long], <<[Long], <<?[Int], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table responses. Objects of this class serve as prototypes for rows in queries. */
  class Responses(_tableTag: Tag) extends profile.api.Table[ResponsesRow](_tableTag, Some("pakpobox"), "responses") {
    def * = (id, requestId, code, body, createdAt) <> (ResponsesRow.tupled, ResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(requestId), code, body, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> ResponsesRow.tupled((_1.get, _2.get, _3, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request_id SqlType(bigserial), AutoInc */
    val requestId: Rep[Long] = column[Long]("request_id", O.AutoInc)
    /** Database column code SqlType(int4), Default(None) */
    val code: Rep[Option[Int]] = column[Option[Int]]("code", O.Default(None))
    /** Database column body SqlType(text), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Requests (database name fk_request_response) */
    lazy val requestsFk = foreignKey("fk_request_response", requestId, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Responses */
  lazy val Responses = new TableQuery(tag => new Responses(tag))
}
