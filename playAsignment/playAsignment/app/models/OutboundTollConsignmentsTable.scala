package models
// AUTO-GENERATED Slick data model for table OutboundTollConsignments
trait OutboundTollConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundTollConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param serviceType Database column service_type SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param externalConsignmentId Database column external_consignment_id SqlType(int8) */
  case class OutboundTollConsignmentsRow(id: Long, serviceType: String, consignmentNumber: String, externalConsignmentId: Long)
  /** GetResult implicit for fetching OutboundTollConsignmentsRow objects using plain SQL queries */
  implicit def GetResultOutboundTollConsignmentsRow(implicit e0: GR[Long], e1: GR[String]): GR[OutboundTollConsignmentsRow] = GR{
    prs => import prs._
    OutboundTollConsignmentsRow.tupled((<<[Long], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table outbound_toll_consignments. Objects of this class serve as prototypes for rows in queries. */
  class OutboundTollConsignments(_tableTag: Tag) extends profile.api.Table[OutboundTollConsignmentsRow](_tableTag, "outbound_toll_consignments") {
    def * = (id, serviceType, consignmentNumber, externalConsignmentId) <> (OutboundTollConsignmentsRow.tupled, OutboundTollConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(serviceType), Rep.Some(consignmentNumber), Rep.Some(externalConsignmentId))).shaped.<>({r=>import r._; _1.map(_=> OutboundTollConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column service_type SqlType(text) */
    val serviceType: Rep[String] = column[String]("service_type")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column external_consignment_id SqlType(int8) */
    val externalConsignmentId: Rep[Long] = column[Long]("external_consignment_id")

    /** Foreign key referencing Consignments (database name outbound_toll_consignments_external_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("outbound_toll_consignments_external_consignment_id_fkey", externalConsignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OutboundTollConsignments */
  lazy val OutboundTollConsignments = new TableQuery(tag => new OutboundTollConsignments(tag))
}
