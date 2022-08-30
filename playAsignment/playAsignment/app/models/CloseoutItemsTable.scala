package models
// AUTO-GENERATED Slick data model for table CloseoutItems
trait CloseoutItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CloseoutItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param closeout Database column closeout SqlType(int8)
   *  @param shipmentId Database column shipment_id SqlType(text) */
  case class CloseoutItemsRow(id: Long, closeout: Long, shipmentId: String)
  /** GetResult implicit for fetching CloseoutItemsRow objects using plain SQL queries */
  implicit def GetResultCloseoutItemsRow(implicit e0: GR[Long], e1: GR[String]): GR[CloseoutItemsRow] = GR{
    prs => import prs._
    CloseoutItemsRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table closeout_items. Objects of this class serve as prototypes for rows in queries. */
  class CloseoutItems(_tableTag: Tag) extends profile.api.Table[CloseoutItemsRow](_tableTag, Some("dhl_ecom"), "closeout_items") {
    def * = (id, closeout, shipmentId) <> (CloseoutItemsRow.tupled, CloseoutItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(closeout), Rep.Some(shipmentId))).shaped.<>({r=>import r._; _1.map(_=> CloseoutItemsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column closeout SqlType(int8) */
    val closeout: Rep[Long] = column[Long]("closeout")
    /** Database column shipment_id SqlType(text) */
    val shipmentId: Rep[String] = column[String]("shipment_id")

    /** Foreign key referencing Closeouts (database name closeout_items_closeout_fkey) */
    lazy val closeoutsFk = foreignKey("closeout_items_closeout_fkey", closeout, Closeouts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CloseoutItems */
  lazy val CloseoutItems = new TableQuery(tag => new CloseoutItems(tag))
}
