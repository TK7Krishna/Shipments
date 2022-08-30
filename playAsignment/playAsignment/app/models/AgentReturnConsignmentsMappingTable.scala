package models
// AUTO-GENERATED Slick data model for table AgentReturnConsignmentsMapping
trait AgentReturnConsignmentsMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgentReturnConsignmentsMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param inboundConsignmentId Database column inbound_consignment_id SqlType(int8)
   *  @param returnConsignmentId Database column return_consignment_id SqlType(int8) */
  case class AgentReturnConsignmentsMappingRow(id: Long, inboundConsignmentId: Long, returnConsignmentId: Long)
  /** GetResult implicit for fetching AgentReturnConsignmentsMappingRow objects using plain SQL queries */
  implicit def GetResultAgentReturnConsignmentsMappingRow(implicit e0: GR[Long]): GR[AgentReturnConsignmentsMappingRow] = GR{
    prs => import prs._
    AgentReturnConsignmentsMappingRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table agent_return_consignments_mapping. Objects of this class serve as prototypes for rows in queries. */
  class AgentReturnConsignmentsMapping(_tableTag: Tag) extends profile.api.Table[AgentReturnConsignmentsMappingRow](_tableTag, Some("ecommerce"), "agent_return_consignments_mapping") {
    def * = (id, inboundConsignmentId, returnConsignmentId) <> (AgentReturnConsignmentsMappingRow.tupled, AgentReturnConsignmentsMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(inboundConsignmentId), Rep.Some(returnConsignmentId))).shaped.<>({r=>import r._; _1.map(_=> AgentReturnConsignmentsMappingRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column inbound_consignment_id SqlType(int8) */
    val inboundConsignmentId: Rep[Long] = column[Long]("inbound_consignment_id")
    /** Database column return_consignment_id SqlType(int8) */
    val returnConsignmentId: Rep[Long] = column[Long]("return_consignment_id")

    /** Foreign key referencing Consignments (database name inbound_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("inbound_consignment_id_fkey", inboundConsignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name return_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("return_consignment_id_fkey", returnConsignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AgentReturnConsignmentsMapping */
  lazy val AgentReturnConsignmentsMapping = new TableQuery(tag => new AgentReturnConsignmentsMapping(tag))
}
