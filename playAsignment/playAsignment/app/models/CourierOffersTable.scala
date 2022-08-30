package models
// AUTO-GENERATED Slick data model for table CourierOffers
trait CourierOffersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierOffers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param quote Database column quote SqlType(int8)
   *  @param courier Database column courier SqlType(text)
   *  @param product Database column product SqlType(text)
   *  @param accepted Database column accepted SqlType(bool), Default(false) */
  case class CourierOffersRow(id: Long, quote: Long, courier: String, product: String, accepted: Boolean = false)
  /** GetResult implicit for fetching CourierOffersRow objects using plain SQL queries */
  implicit def GetResultCourierOffersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean]): GR[CourierOffersRow] = GR{
    prs => import prs._
    CourierOffersRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[Boolean]))
  }
  /** Table description of table courier_offers. Objects of this class serve as prototypes for rows in queries. */
  class CourierOffers(_tableTag: Tag) extends profile.api.Table[CourierOffersRow](_tableTag, "courier_offers") {
    def * = (id, quote, courier, product, accepted) <> (CourierOffersRow.tupled, CourierOffersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(quote), Rep.Some(courier), Rep.Some(product), Rep.Some(accepted))).shaped.<>({r=>import r._; _1.map(_=> CourierOffersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column quote SqlType(int8) */
    val quote: Rep[Long] = column[Long]("quote")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column product SqlType(text) */
    val product: Rep[String] = column[String]("product")
    /** Database column accepted SqlType(bool), Default(false) */
    val accepted: Rep[Boolean] = column[Boolean]("accepted", O.Default(false))

    /** Foreign key referencing CourierQuotes (database name courier_offers_quote_fkey) */
    lazy val courierQuotesFk = foreignKey("courier_offers_quote_fkey", quote, CourierQuotes)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name courier_offers_courier_fkey) */
    lazy val couriersFk = foreignKey("courier_offers_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierOffers */
  lazy val CourierOffers = new TableQuery(tag => new CourierOffers(tag))
}
