package models
// AUTO-GENERATED Slick data model for table ConnoteUploads
trait ConnoteUploadsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConnoteUploads
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param renderedConnote Database column rendered_connote SqlType(text)
   *  @param success Database column success SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class ConnoteUploadsRow(id: Long, consignment: Long, renderedConnote: String, success: Option[Boolean] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ConnoteUploadsRow objects using plain SQL queries */
  implicit def GetResultConnoteUploadsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp]): GR[ConnoteUploadsRow] = GR{
    prs => import prs._
    ConnoteUploadsRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table connote_uploads. Objects of this class serve as prototypes for rows in queries. */
  class ConnoteUploads(_tableTag: Tag) extends profile.api.Table[ConnoteUploadsRow](_tableTag, Some("toll"), "connote_uploads") {
    def * = (id, consignment, renderedConnote, success, createdAt, modifiedAt) <> (ConnoteUploadsRow.tupled, ConnoteUploadsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(renderedConnote), success, Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> ConnoteUploadsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column rendered_connote SqlType(text) */
    val renderedConnote: Rep[String] = column[String]("rendered_connote")
    /** Database column success SqlType(bool), Default(None) */
    val success: Rep[Option[Boolean]] = column[Option[Boolean]]("success", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")

    /** Foreign key referencing Consignments (database name connote_uploads_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("connote_uploads_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConnoteUploads */
  lazy val ConnoteUploads = new TableQuery(tag => new ConnoteUploads(tag))
}
