package models
// AUTO-GENERATED Slick data model for table Missedconsignmentnotices
trait MissedconsignmentnoticesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Missedconsignmentnotices
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentid Database column consignmentid SqlType(int8)
   *  @param cardnumber Database column cardnumber SqlType(text) */
  case class MissedconsignmentnoticesRow(id: Long, consignmentid: Long, cardnumber: String)
  /** GetResult implicit for fetching MissedconsignmentnoticesRow objects using plain SQL queries */
  implicit def GetResultMissedconsignmentnoticesRow(implicit e0: GR[Long], e1: GR[String]): GR[MissedconsignmentnoticesRow] = GR{
    prs => import prs._
    MissedconsignmentnoticesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table missedconsignmentnotices. Objects of this class serve as prototypes for rows in queries. */
  class Missedconsignmentnotices(_tableTag: Tag) extends profile.api.Table[MissedconsignmentnoticesRow](_tableTag, "missedconsignmentnotices") {
    def * = (id, consignmentid, cardnumber) <> (MissedconsignmentnoticesRow.tupled, MissedconsignmentnoticesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentid), Rep.Some(cardnumber))).shaped.<>({r=>import r._; _1.map(_=> MissedconsignmentnoticesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentid SqlType(int8) */
    val consignmentid: Rep[Long] = column[Long]("consignmentid")
    /** Database column cardnumber SqlType(text) */
    val cardnumber: Rep[String] = column[String]("cardnumber")

    /** Foreign key referencing Consignments (database name missedconsignmentnotices_consignmentid_fkey) */
    lazy val consignmentsFk = foreignKey("missedconsignmentnotices_consignmentid_fkey", consignmentid, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (cardnumber) (database name missed_consignment_card_number_tri_idx) */
    val index1 = index("missed_consignment_card_number_tri_idx", cardnumber)
    /** Index over (cardnumber) (database name missedconsignmentnotices_cardnumber_idx) */
    val index2 = index("missedconsignmentnotices_cardnumber_idx", cardnumber)
  }
  /** Collection-like TableQuery object for table Missedconsignmentnotices */
  lazy val Missedconsignmentnotices = new TableQuery(tag => new Missedconsignmentnotices(tag))
}
