package models
// AUTO-GENERATED Slick data model for table ConsignmentSms
trait ConsignmentSmsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentSms
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param sms Database column sms SqlType(int8) */
  case class ConsignmentSmsRow(id: Long, consignment: Long, sms: Long)
  /** GetResult implicit for fetching ConsignmentSmsRow objects using plain SQL queries */
  implicit def GetResultConsignmentSmsRow(implicit e0: GR[Long]): GR[ConsignmentSmsRow] = GR{
    prs => import prs._
    ConsignmentSmsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table consignment_sms. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentSms(_tableTag: Tag) extends profile.api.Table[ConsignmentSmsRow](_tableTag, "consignment_sms") {
    def * = (id, consignment, sms) <> (ConsignmentSmsRow.tupled, ConsignmentSmsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(sms))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentSmsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column sms SqlType(int8) */
    val sms: Rep[Long] = column[Long]("sms")

    /** Foreign key referencing Consignments (database name consignment_sms_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_sms_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SmsOutboundMessages (database name consignment_sms_sms_fkey) */
    lazy val smsOutboundMessagesFk = foreignKey("consignment_sms_sms_fkey", sms, SmsOutboundMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentSms */
  lazy val ConsignmentSms = new TableQuery(tag => new ConsignmentSms(tag))
}
