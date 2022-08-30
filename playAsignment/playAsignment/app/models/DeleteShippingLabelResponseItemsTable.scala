package models
// AUTO-GENERATED Slick data model for table DeleteShippingLabelResponseItems
trait DeleteShippingLabelResponseItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DeleteShippingLabelResponseItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param deleteShippingLabel Database column delete_shipping_label SqlType(int8)
   *  @param deleteShippingLabelItem Database column delete_shipping_label_item SqlType(int8)
   *  @param responseCode Database column response_code SqlType(text)
   *  @param responseMessage Database column response_message SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class DeleteShippingLabelResponseItemsRow(id: Long, deleteShippingLabel: Long, deleteShippingLabelItem: Long, responseCode: String, responseMessage: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching DeleteShippingLabelResponseItemsRow objects using plain SQL queries */
  implicit def GetResultDeleteShippingLabelResponseItemsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[DeleteShippingLabelResponseItemsRow] = GR{
    prs => import prs._
    DeleteShippingLabelResponseItemsRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table delete_shipping_label_response_items. Objects of this class serve as prototypes for rows in queries. */
  class DeleteShippingLabelResponseItems(_tableTag: Tag) extends profile.api.Table[DeleteShippingLabelResponseItemsRow](_tableTag, Some("dhl_ecom"), "delete_shipping_label_response_items") {
    def * = (id, deleteShippingLabel, deleteShippingLabelItem, responseCode, responseMessage, createdAt) <> (DeleteShippingLabelResponseItemsRow.tupled, DeleteShippingLabelResponseItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(deleteShippingLabel), Rep.Some(deleteShippingLabelItem), Rep.Some(responseCode), Rep.Some(responseMessage), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> DeleteShippingLabelResponseItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column delete_shipping_label SqlType(int8) */
    val deleteShippingLabel: Rep[Long] = column[Long]("delete_shipping_label")
    /** Database column delete_shipping_label_item SqlType(int8) */
    val deleteShippingLabelItem: Rep[Long] = column[Long]("delete_shipping_label_item")
    /** Database column response_code SqlType(text) */
    val responseCode: Rep[String] = column[String]("response_code")
    /** Database column response_message SqlType(text) */
    val responseMessage: Rep[String] = column[String]("response_message")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing DeleteShippingLabelItems (database name delete_shipping_label_response__delete_shipping_label_item_fkey) */
    lazy val deleteShippingLabelItemsFk = foreignKey("delete_shipping_label_response__delete_shipping_label_item_fkey", deleteShippingLabelItem, DeleteShippingLabelItems)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing DeleteShippingLabels (database name delete_shipping_label_response_items_delete_shipping_label_fkey) */
    lazy val deleteShippingLabelsFk = foreignKey("delete_shipping_label_response_items_delete_shipping_label_fkey", deleteShippingLabel, DeleteShippingLabels)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DeleteShippingLabelResponseItems */
  lazy val DeleteShippingLabelResponseItems = new TableQuery(tag => new DeleteShippingLabelResponseItems(tag))
}
