package models
// AUTO-GENERATED Slick data model for table PinResends
trait PinResendsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PinResends
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param sms Database column sms SqlType(int8) */
  case class PinResendsRow(id: Long, consignment: Long, sms: Long)
  /** GetResult implicit for fetching PinResendsRow objects using plain SQL queries */
  implicit def GetResultPinResendsRow(implicit e0: GR[Long]): GR[PinResendsRow] = GR{
    prs => import prs._
    PinResendsRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table pin_resends. Objects of this class serve as prototypes for rows in queries. */
  class PinResends(_tableTag: Tag) extends profile.api.Table[PinResendsRow](_tableTag, "pin_resends") {
    def * = (id, consignment, sms) <> (PinResendsRow.tupled, PinResendsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(sms))).shaped.<>({r=>import r._; _1.map(_=> PinResendsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column sms SqlType(int8) */
    val sms: Rep[Long] = column[Long]("sms")

    /** Foreign key referencing Consignments (database name pin_resends_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("pin_resends_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SmsOutboundMessages (database name pin_resends_sms_fkey) */
    lazy val smsOutboundMessagesFk = foreignKey("pin_resends_sms_fkey", sms, SmsOutboundMessages)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PinResends */
  lazy val PinResends = new TableQuery(tag => new PinResends(tag))
}
