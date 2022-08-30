package models
// AUTO-GENERATED Slick data model for table OutboundType
trait OutboundTypeTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundType
   *  @param id Database column id SqlType(int8), PrimaryKey
   *  @param name Database column name SqlType(text) */
  case class OutboundTypeRow(id: Long, name: String)
  /** GetResult implicit for fetching OutboundTypeRow objects using plain SQL queries */
  implicit def GetResultOutboundTypeRow(implicit e0: GR[Long], e1: GR[String]): GR[OutboundTypeRow] = GR{
    prs => import prs._
    OutboundTypeRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table outbound_type. Objects of this class serve as prototypes for rows in queries. */
  class OutboundType(_tableTag: Tag) extends profile.api.Table[OutboundTypeRow](_tableTag, Some("external_online"), "outbound_type") {
    def * = (id, name) <> (OutboundTypeRow.tupled, OutboundTypeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> OutboundTypeRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int8), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table OutboundType */
  lazy val OutboundType = new TableQuery(tag => new OutboundType(tag))
}
