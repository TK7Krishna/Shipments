package models
// AUTO-GENERATED Slick data model for table OutboundStatus
trait OutboundStatusTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundStatus
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param statusName Database column status_name SqlType(text) */
  case class OutboundStatusRow(id: Long, statusName: String)
  /** GetResult implicit for fetching OutboundStatusRow objects using plain SQL queries */
  implicit def GetResultOutboundStatusRow(implicit e0: GR[Long], e1: GR[String]): GR[OutboundStatusRow] = GR{
    prs => import prs._
    OutboundStatusRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table outbound_status. Objects of this class serve as prototypes for rows in queries. */
  class OutboundStatus(_tableTag: Tag) extends profile.api.Table[OutboundStatusRow](_tableTag, Some("external_online"), "outbound_status") {
    def * = (id, statusName) <> (OutboundStatusRow.tupled, OutboundStatusRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(statusName))).shaped.<>({r=>import r._; _1.map(_=> OutboundStatusRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column status_name SqlType(text) */
    val statusName: Rep[String] = column[String]("status_name")
  }
  /** Collection-like TableQuery object for table OutboundStatus */
  lazy val OutboundStatus = new TableQuery(tag => new OutboundStatus(tag))
}
