package models
// AUTO-GENERATED Slick data model for table DeleteShippingLabelItems
trait DeleteShippingLabelItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DeleteShippingLabelItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param deleteShippingLabel Database column delete_shipping_label SqlType(int8)
   *  @param shipmentId Database column shipment_id SqlType(text) */
  case class DeleteShippingLabelItemsRow(id: Long, deleteShippingLabel: Long, shipmentId: String)
  /** GetResult implicit for fetching DeleteShippingLabelItemsRow objects using plain SQL queries */
  implicit def GetResultDeleteShippingLabelItemsRow(implicit e0: GR[Long], e1: GR[String]): GR[DeleteShippingLabelItemsRow] = GR{
    prs => import prs._
    DeleteShippingLabelItemsRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table delete_shipping_label_items. Objects of this class serve as prototypes for rows in queries. */
  class DeleteShippingLabelItems(_tableTag: Tag) extends profile.api.Table[DeleteShippingLabelItemsRow](_tableTag, Some("dhl_ecom"), "delete_shipping_label_items") {
    def * = (id, deleteShippingLabel, shipmentId) <> (DeleteShippingLabelItemsRow.tupled, DeleteShippingLabelItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(deleteShippingLabel), Rep.Some(shipmentId))).shaped.<>({r=>import r._; _1.map(_=> DeleteShippingLabelItemsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column delete_shipping_label SqlType(int8) */
    val deleteShippingLabel: Rep[Long] = column[Long]("delete_shipping_label")
    /** Database column shipment_id SqlType(text) */
    val shipmentId: Rep[String] = column[String]("shipment_id")

    /** Foreign key referencing DeleteShippingLabels (database name delete_shipping_label_items_delete_shipping_label_fkey) */
    lazy val deleteShippingLabelsFk = foreignKey("delete_shipping_label_items_delete_shipping_label_fkey", deleteShippingLabel, DeleteShippingLabels)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DeleteShippingLabelItems */
  lazy val DeleteShippingLabelItems = new TableQuery(tag => new DeleteShippingLabelItems(tag))
}
