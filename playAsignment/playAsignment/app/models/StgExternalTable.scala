package models
// AUTO-GENERATED Slick data model for table StgExternal
trait StgExternalTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgExternal
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param status Database column status SqlType(text)
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param eventTime Database column event_time SqlType(timestamptz)
   *  @param barcode Database column barcode SqlType(text), Default(None) */
  case class StgExternalRow(id: Long, status: String, consignmentId: Long, eventTime: Option[java.sql.Timestamp], barcode: Option[String] = None)
  /** GetResult implicit for fetching StgExternalRow objects using plain SQL queries */
  implicit def GetResultStgExternalRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]]): GR[StgExternalRow] = GR{
    prs => import prs._
    StgExternalRow.tupled((<<[Long], <<[String], <<[Long], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table stg_external. Objects of this class serve as prototypes for rows in queries. */
  class StgExternal(_tableTag: Tag) extends profile.api.Table[StgExternalRow](_tableTag, Some("seven_eleven"), "stg_external") {
    def * = (id, status, consignmentId, eventTime, barcode) <> (StgExternalRow.tupled, StgExternalRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(status), Rep.Some(consignmentId), eventTime, barcode)).shaped.<>({r=>import r._; _1.map(_=> StgExternalRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column status SqlType(text) */
    val status: Rep[String] = column[String]("status")
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column event_time SqlType(timestamptz) */
    val eventTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("event_time")
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))

    /** Foreign key referencing StgConsignments (database name stg_consignments_fkey) */
    lazy val stgConsignmentsFk = foreignKey("stg_consignments_fkey", consignmentId, StgConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table StgExternal */
  lazy val StgExternal = new TableQuery(tag => new StgExternal(tag))
}
