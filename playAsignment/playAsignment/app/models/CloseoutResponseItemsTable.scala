package models
// AUTO-GENERATED Slick data model for table CloseoutResponseItems
trait CloseoutResponseItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CloseoutResponseItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param closeout Database column closeout SqlType(int8)
   *  @param closeoutItem Database column closeout_item SqlType(int8)
   *  @param responseCode Database column response_code SqlType(text)
   *  @param responseMessage Database column response_message SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class CloseoutResponseItemsRow(id: Long, closeout: Long, closeoutItem: Long, responseCode: String, responseMessage: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CloseoutResponseItemsRow objects using plain SQL queries */
  implicit def GetResultCloseoutResponseItemsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[CloseoutResponseItemsRow] = GR{
    prs => import prs._
    CloseoutResponseItemsRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table closeout_response_items. Objects of this class serve as prototypes for rows in queries. */
  class CloseoutResponseItems(_tableTag: Tag) extends profile.api.Table[CloseoutResponseItemsRow](_tableTag, Some("dhl_ecom"), "closeout_response_items") {
    def * = (id, closeout, closeoutItem, responseCode, responseMessage, createdAt) <> (CloseoutResponseItemsRow.tupled, CloseoutResponseItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(closeout), Rep.Some(closeoutItem), Rep.Some(responseCode), Rep.Some(responseMessage), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> CloseoutResponseItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column closeout SqlType(int8) */
    val closeout: Rep[Long] = column[Long]("closeout")
    /** Database column closeout_item SqlType(int8) */
    val closeoutItem: Rep[Long] = column[Long]("closeout_item")
    /** Database column response_code SqlType(text) */
    val responseCode: Rep[String] = column[String]("response_code")
    /** Database column response_message SqlType(text) */
    val responseMessage: Rep[String] = column[String]("response_message")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing CloseoutItems (database name closeout_response_items_closeout_item_fkey) */
    lazy val closeoutItemsFk = foreignKey("closeout_response_items_closeout_item_fkey", closeoutItem, CloseoutItems)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Closeouts (database name closeout_response_items_closeout_fkey) */
    lazy val closeoutsFk = foreignKey("closeout_response_items_closeout_fkey", closeout, Closeouts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CloseoutResponseItems */
  lazy val CloseoutResponseItems = new TableQuery(tag => new CloseoutResponseItems(tag))
}
