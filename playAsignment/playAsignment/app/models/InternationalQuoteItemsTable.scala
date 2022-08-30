package models
// AUTO-GENERATED Slick data model for table InternationalQuoteItems
trait InternationalQuoteItemsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalQuoteItems
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param quote Database column quote SqlType(int8)
   *  @param quantity Database column quantity SqlType(int4)
   *  @param length Database column length SqlType(int4)
   *  @param height Database column height SqlType(int4)
   *  @param width Database column width SqlType(int4)
   *  @param physicalWeight Database column physical_weight SqlType(float8) */
  case class InternationalQuoteItemsRow(id: Long, quote: Long, quantity: Int, length: Int, height: Int, width: Int, physicalWeight: Double)
  /** GetResult implicit for fetching InternationalQuoteItemsRow objects using plain SQL queries */
  implicit def GetResultInternationalQuoteItemsRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[Double]): GR[InternationalQuoteItemsRow] = GR{
    prs => import prs._
    InternationalQuoteItemsRow.tupled((<<[Long], <<[Long], <<[Int], <<[Int], <<[Int], <<[Int], <<[Double]))
  }
  /** Table description of table international_quote_items. Objects of this class serve as prototypes for rows in queries. */
  class InternationalQuoteItems(_tableTag: Tag) extends profile.api.Table[InternationalQuoteItemsRow](_tableTag, Some("cpapi"), "international_quote_items") {
    def * = (id, quote, quantity, length, height, width, physicalWeight) <> (InternationalQuoteItemsRow.tupled, InternationalQuoteItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(quote), Rep.Some(quantity), Rep.Some(length), Rep.Some(height), Rep.Some(width), Rep.Some(physicalWeight))).shaped.<>({r=>import r._; _1.map(_=> InternationalQuoteItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column quote SqlType(int8) */
    val quote: Rep[Long] = column[Long]("quote")
    /** Database column quantity SqlType(int4) */
    val quantity: Rep[Int] = column[Int]("quantity")
    /** Database column length SqlType(int4) */
    val length: Rep[Int] = column[Int]("length")
    /** Database column height SqlType(int4) */
    val height: Rep[Int] = column[Int]("height")
    /** Database column width SqlType(int4) */
    val width: Rep[Int] = column[Int]("width")
    /** Database column physical_weight SqlType(float8) */
    val physicalWeight: Rep[Double] = column[Double]("physical_weight")

    /** Foreign key referencing InternationalQuotes (database name international_quote_items_quote_fkey) */
    lazy val internationalQuotesFk = foreignKey("international_quote_items_quote_fkey", quote, InternationalQuotes)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalQuoteItems */
  lazy val InternationalQuoteItems = new TableQuery(tag => new InternationalQuoteItems(tag))
}
