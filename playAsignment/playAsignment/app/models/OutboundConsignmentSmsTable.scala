package models
// AUTO-GENERATED Slick data model for table OutboundConsignmentSms
trait OutboundConsignmentSmsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundConsignmentSms
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param sms Database column sms SqlType(int8) */
  case class OutboundConsignmentSmsRow(id: Long, consignment: Long, sms: Long)
  /** GetResult implicit for fetching OutboundConsignmentSmsRow objects using plain SQL queries */
  implicit def GetResultOutboundConsignmentSmsRow(implicit e0: GR[Long]): GR[OutboundConsignmentSmsRow] = GR{
    prs => import prs._
    OutboundConsignmentSmsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table outbound_consignment_sms. Objects of this class serve as prototypes for rows in queries. */
  class OutboundConsignmentSms(_tableTag: Tag) extends profile.api.Table[OutboundConsignmentSmsRow](_tableTag, "outbound_consignment_sms") {
    def * = (id, consignment, sms) <> (OutboundConsignmentSmsRow.tupled, OutboundConsignmentSmsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(sms))).shaped.<>({r=>import r._; _1.map(_=> OutboundConsignmentSmsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column sms SqlType(int8) */
    val sms: Rep[Long] = column[Long]("sms")

    /** Foreign key referencing Consignments (database name outbound_consignment_sms_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("outbound_consignment_sms_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SmsOutboundMessages (database name outbound_consignment_sms_sms_fkey) */
    lazy val smsOutboundMessagesFk = foreignKey("outbound_consignment_sms_sms_fkey", sms, SmsOutboundMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OutboundConsignmentSms */
  lazy val OutboundConsignmentSms = new TableQuery(tag => new OutboundConsignmentSms(tag))
}
