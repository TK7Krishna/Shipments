package models
// AUTO-GENERATED Slick data model for table StgConnoteUploads
trait StgConnoteUploadsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgConnoteUploads
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param renderedConnote Database column rendered_connote SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param nextAttemptAt Database column next_attempt_at SqlType(timestamptz), Default(None)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(None) */
  case class StgConnoteUploadsRow(id: Long, consignment: Long, renderedConnote: String, success: Option[Boolean] = None, createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp], nextAttemptAt: Option[java.sql.Timestamp] = None, attemptCount: Option[Int] = None)
  /** GetResult implicit for fetching StgConnoteUploadsRow objects using plain SQL queries */
  implicit def GetResultStgConnoteUploadsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Int]]): GR[StgConnoteUploadsRow] = GR{
    prs => import prs._
    StgConnoteUploadsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Int]))
  }
  /** Table description of table stg_connote_uploads. Objects of this class serve as prototypes for rows in queries. */
  class StgConnoteUploads(_tableTag: Tag) extends profile.api.Table[StgConnoteUploadsRow](_tableTag, Some("seven_eleven"), "stg_connote_uploads") {
    def * = (id, consignment, renderedConnote, success, createdAt, modifiedAt, nextAttemptAt, attemptCount) <> (StgConnoteUploadsRow.tupled, StgConnoteUploadsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(renderedConnote), success, createdAt, modifiedAt, nextAttemptAt, attemptCount)).shaped.<>({r=>import r._; _1.map(_=> StgConnoteUploadsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column rendered_connote SqlType(text) */
    val renderedConnote: Rep[String] = column[String]("rendered_connote")
    /** Database column success SqlType(bool), Default(None) */
    val success: Rep[Option[Boolean]] = column[Option[Boolean]]("success", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at")
    /** Database column next_attempt_at SqlType(timestamptz), Default(None) */
    val nextAttemptAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("next_attempt_at", O.Default(None))
    /** Database column attempt_count SqlType(int4), Default(None) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(None))

    /** Foreign key referencing StgConsignments (database name stg_connote_uploads_consignment_fkey) */
    lazy val stgConsignmentsFk = foreignKey("stg_connote_uploads_consignment_fkey", consignment, StgConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table StgConnoteUploads */
  lazy val StgConnoteUploads = new TableQuery(tag => new StgConnoteUploads(tag))
}
