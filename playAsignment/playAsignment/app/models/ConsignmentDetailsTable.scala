package models
// AUTO-GENERATED Slick data model for table ConsignmentDetails
trait ConsignmentDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentDetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param statusId Database column status_id SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param customerName Database column customer_name SqlType(text), Default(None) */
  case class ConsignmentDetailsRow(id: Long, consignmentId: Long, statusId: Long, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, customerName: Option[String] = None)
  /** GetResult implicit for fetching ConsignmentDetailsRow objects using plain SQL queries */
  implicit def GetResultConsignmentDetailsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]]): GR[ConsignmentDetailsRow] = GR{
    prs => import prs._
    ConsignmentDetailsRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table consignment_details. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentDetails(_tableTag: Tag) extends profile.api.Table[ConsignmentDetailsRow](_tableTag, Some("external_online"), "consignment_details") {
    def * = (id, consignmentId, statusId, createdAt, modifiedAt, customerName) <> (ConsignmentDetailsRow.tupled, ConsignmentDetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(statusId), Rep.Some(createdAt), modifiedAt, customerName)).shaped.<>({r=>import r._; _1.map(_=> ConsignmentDetailsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column status_id SqlType(int8) */
    val statusId: Rep[Long] = column[Long]("status_id")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column customer_name SqlType(text), Default(None) */
    val customerName: Rep[Option[String]] = column[Option[String]]("customer_name", O.Default(None))

    /** Foreign key referencing Consignments (database name external_online_consignment_details_consignments) */
    lazy val consignmentsFk = foreignKey("external_online_consignment_details_consignments", consignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing OutboundStatus (database name external_online_consignment_details_outbound_status_fkey) */
    lazy val outboundStatusFk = foreignKey("external_online_consignment_details_outbound_status_fkey", statusId, OutboundStatus)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentDetails */
  lazy val ConsignmentDetails = new TableQuery(tag => new ConsignmentDetails(tag))
}
