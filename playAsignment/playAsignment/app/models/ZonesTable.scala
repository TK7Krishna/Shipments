package models
// AUTO-GENERATED Slick data model for table Zones
trait ZonesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Zones
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param description Database column description SqlType(text) */
  case class ZonesRow(id: Long, description: String)
  /** GetResult implicit for fetching ZonesRow objects using plain SQL queries */
  implicit def GetResultZonesRow(implicit e0: GR[Long], e1: GR[String]): GR[ZonesRow] = GR{
    prs => import prs._
    ZonesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table zones. Objects of this class serve as prototypes for rows in queries. */
  class Zones(_tableTag: Tag) extends profile.api.Table[ZonesRow](_tableTag, Some("rate_card"), "zones") {
    def * = (id, description) <> (ZonesRow.tupled, ZonesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(description))).shaped.<>({r=>import r._; _1.map(_=> ZonesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
  }
  /** Collection-like TableQuery object for table Zones */
  lazy val Zones = new TableQuery(tag => new Zones(tag))
}
