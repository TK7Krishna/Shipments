package models
// AUTO-GENERATED Slick data model for table ConsignmentSmsCodes
trait ConsignmentSmsCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentSmsCodes
   *  @param consignment Database column consignment SqlType(int8), PrimaryKey
   *  @param pin Database column pin SqlType(text) */
  case class ConsignmentSmsCodesRow(consignment: Long, pin: String)
  /** GetResult implicit for fetching ConsignmentSmsCodesRow objects using plain SQL queries */
  implicit def GetResultConsignmentSmsCodesRow(implicit e0: GR[Long], e1: GR[String]): GR[ConsignmentSmsCodesRow] = GR{
    prs => import prs._
    ConsignmentSmsCodesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table consignment_sms_codes. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentSmsCodes(_tableTag: Tag) extends profile.api.Table[ConsignmentSmsCodesRow](_tableTag, "consignment_sms_codes") {
    def * = (consignment, pin) <> (ConsignmentSmsCodesRow.tupled, ConsignmentSmsCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(consignment), Rep.Some(pin))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentSmsCodesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column consignment SqlType(int8), PrimaryKey */
    val consignment: Rep[Long] = column[Long]("consignment", O.PrimaryKey)
    /** Database column pin SqlType(text) */
    val pin: Rep[String] = column[String]("pin")

    /** Foreign key referencing Consignments (database name consignment_sms_codes_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_sms_codes_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (pin) (database name consignment_sms_codes_pin_idx) */
    val index1 = index("consignment_sms_codes_pin_idx", pin)
    /** Index over (pin) (database name consignment_sms_codes_pin_idx1) */
    val index2 = index("consignment_sms_codes_pin_idx1", pin)
  }
  /** Collection-like TableQuery object for table ConsignmentSmsCodes */
  lazy val ConsignmentSmsCodes = new TableQuery(tag => new ConsignmentSmsCodes(tag))
}
