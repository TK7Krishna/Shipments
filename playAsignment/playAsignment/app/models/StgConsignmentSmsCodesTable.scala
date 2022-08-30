package models
// AUTO-GENERATED Slick data model for table StgConsignmentSmsCodes
trait StgConsignmentSmsCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgConsignmentSmsCodes
   *  @param consignment Database column consignment SqlType(int8), PrimaryKey
   *  @param pin Database column pin SqlType(text) */
  case class StgConsignmentSmsCodesRow(consignment: Long, pin: String)
  /** GetResult implicit for fetching StgConsignmentSmsCodesRow objects using plain SQL queries */
  implicit def GetResultStgConsignmentSmsCodesRow(implicit e0: GR[Long], e1: GR[String]): GR[StgConsignmentSmsCodesRow] = GR{
    prs => import prs._
    StgConsignmentSmsCodesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table stg_consignment_sms_codes. Objects of this class serve as prototypes for rows in queries. */
  class StgConsignmentSmsCodes(_tableTag: Tag) extends profile.api.Table[StgConsignmentSmsCodesRow](_tableTag, Some("seven_eleven"), "stg_consignment_sms_codes") {
    def * = (consignment, pin) <> (StgConsignmentSmsCodesRow.tupled, StgConsignmentSmsCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(consignment), Rep.Some(pin))).shaped.<>({r=>import r._; _1.map(_=> StgConsignmentSmsCodesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column consignment SqlType(int8), PrimaryKey */
    val consignment: Rep[Long] = column[Long]("consignment", O.PrimaryKey)
    /** Database column pin SqlType(text) */
    val pin: Rep[String] = column[String]("pin")

    /** Foreign key referencing StgConsignments (database name consignment_sms_codes_consignment_fkey) */
    lazy val stgConsignmentsFk = foreignKey("consignment_sms_codes_consignment_fkey", consignment, StgConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table StgConsignmentSmsCodes */
  lazy val StgConsignmentSmsCodes = new TableQuery(tag => new StgConsignmentSmsCodes(tag))
}
