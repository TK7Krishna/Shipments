package models
// AUTO-GENERATED Slick data model for table CreateShippingLabelResponseItems
trait CreateShippingLabelResponseItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreateShippingLabelResponseItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createShippingLabel Database column create_shipping_label SqlType(int8)
   *  @param createShippingLabelItem Database column create_shipping_label_item SqlType(int8)
   *  @param deliveryConfirmationNo Database column delivery_confirmation_no SqlType(text), Default(None)
   *  @param labelUrl Database column label_url SqlType(text), Default(None)
   *  @param content Database column content SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class CreateShippingLabelResponseItemsRow(id: Long, createShippingLabel: Long, createShippingLabelItem: Long, deliveryConfirmationNo: Option[String] = None, labelUrl: Option[String] = None, content: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CreateShippingLabelResponseItemsRow objects using plain SQL queries */
  implicit def GetResultCreateShippingLabelResponseItemsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[CreateShippingLabelResponseItemsRow] = GR{
    prs => import prs._
    CreateShippingLabelResponseItemsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table create_shipping_label_response_items. Objects of this class serve as prototypes for rows in queries. */
  class CreateShippingLabelResponseItems(_tableTag: Tag) extends profile.api.Table[CreateShippingLabelResponseItemsRow](_tableTag, Some("dhl_ecom"), "create_shipping_label_response_items") {
    def * = (id, createShippingLabel, createShippingLabelItem, deliveryConfirmationNo, labelUrl, content, createdAt) <> (CreateShippingLabelResponseItemsRow.tupled, CreateShippingLabelResponseItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(createShippingLabel), Rep.Some(createShippingLabelItem), deliveryConfirmationNo, labelUrl, content, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> CreateShippingLabelResponseItemsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_shipping_label SqlType(int8) */
    val createShippingLabel: Rep[Long] = column[Long]("create_shipping_label")
    /** Database column create_shipping_label_item SqlType(int8) */
    val createShippingLabelItem: Rep[Long] = column[Long]("create_shipping_label_item")
    /** Database column delivery_confirmation_no SqlType(text), Default(None) */
    val deliveryConfirmationNo: Rep[Option[String]] = column[Option[String]]("delivery_confirmation_no", O.Default(None))
    /** Database column label_url SqlType(text), Default(None) */
    val labelUrl: Rep[Option[String]] = column[Option[String]]("label_url", O.Default(None))
    /** Database column content SqlType(text), Default(None) */
    val content: Rep[Option[String]] = column[Option[String]]("content", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing CreateShippingLabelItems (database name create_shipping_label_response__create_shipping_label_item_fkey) */
    lazy val createShippingLabelItemsFk = foreignKey("create_shipping_label_response__create_shipping_label_item_fkey", createShippingLabelItem, CreateShippingLabelItems)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CreateShippingLabels (database name create_shipping_label_response_items_create_shipping_label_fkey) */
    lazy val createShippingLabelsFk = foreignKey("create_shipping_label_response_items_create_shipping_label_fkey", createShippingLabel, CreateShippingLabels)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CreateShippingLabelResponseItems */
  lazy val CreateShippingLabelResponseItems = new TableQuery(tag => new CreateShippingLabelResponseItems(tag))
}
