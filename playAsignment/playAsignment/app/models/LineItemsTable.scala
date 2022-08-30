package models
// AUTO-GENERATED Slick data model for table LineItems
trait LineItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LineItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param invoice Database column invoice SqlType(int8)
   *  @param description Database column description SqlType(text)
   *  @param quantity Database column quantity SqlType(int4)
   *  @param unitAmount Database column unit_amount SqlType(int8) */
  case class LineItemsRow(id: Long, invoice: Long, description: String, quantity: Int, unitAmount: Long)
  /** GetResult implicit for fetching LineItemsRow objects using plain SQL queries */
  implicit def GetResultLineItemsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int]): GR[LineItemsRow] = GR{
    prs => import prs._
    LineItemsRow.tupled((<<[Long], <<[Long], <<[String], <<[Int], <<[Long]))
  }
  /** Table description of table line_items. Objects of this class serve as prototypes for rows in queries. */
  class LineItems(_tableTag: Tag) extends profile.api.Table[LineItemsRow](_tableTag, Some("xero"), "line_items") {
    def * = (id, invoice, description, quantity, unitAmount) <> (LineItemsRow.tupled, LineItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(invoice), Rep.Some(description), Rep.Some(quantity), Rep.Some(unitAmount))).shaped.<>({r=>import r._; _1.map(_=> LineItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column invoice SqlType(int8) */
    val invoice: Rep[Long] = column[Long]("invoice")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column quantity SqlType(int4) */
    val quantity: Rep[Int] = column[Int]("quantity")
    /** Database column unit_amount SqlType(int8) */
    val unitAmount: Rep[Long] = column[Long]("unit_amount")

    /** Foreign key referencing Invoices (database name line_items_invoice_fkey) */
    lazy val invoicesFk = foreignKey("line_items_invoice_fkey", invoice, Invoices)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LineItems */
  lazy val LineItems = new TableQuery(tag => new LineItems(tag))
}
