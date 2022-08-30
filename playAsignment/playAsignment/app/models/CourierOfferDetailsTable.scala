package models
// AUTO-GENERATED Slick data model for table CourierOfferDetails
trait CourierOfferDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierOfferDetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param offer Database column offer SqlType(int8)
   *  @param article Database column article SqlType(int8), Default(None)
   *  @param comment Database column comment SqlType(text)
   *  @param buyPrice Database column buy_price SqlType(int4)
   *  @param sellPrice Database column sell_price SqlType(int4)
   *  @param commission Database column commission SqlType(int4)
   *  @param tax Database column tax SqlType(int4), Default(0) */
  case class CourierOfferDetailsRow(id: Long, offer: Long, article: Option[Long] = None, comment: String, buyPrice: Int, sellPrice: Int, commission: Int, tax: Int = 0)
  /** GetResult implicit for fetching CourierOfferDetailsRow objects using plain SQL queries */
  implicit def GetResultCourierOfferDetailsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Int]): GR[CourierOfferDetailsRow] = GR{
    prs => import prs._
    CourierOfferDetailsRow.tupled((<<[Long], <<[Long], <<?[Long], <<[String], <<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table courier_offer_details. Objects of this class serve as prototypes for rows in queries. */
  class CourierOfferDetails(_tableTag: Tag) extends profile.api.Table[CourierOfferDetailsRow](_tableTag, "courier_offer_details") {
    def * = (id, offer, article, comment, buyPrice, sellPrice, commission, tax) <> (CourierOfferDetailsRow.tupled, CourierOfferDetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(offer), article, Rep.Some(comment), Rep.Some(buyPrice), Rep.Some(sellPrice), Rep.Some(commission), Rep.Some(tax))).shaped.<>({r=>import r._; _1.map(_=> CourierOfferDetailsRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column offer SqlType(int8) */
    val offer: Rep[Long] = column[Long]("offer")
    /** Database column article SqlType(int8), Default(None) */
    val article: Rep[Option[Long]] = column[Option[Long]]("article", O.Default(None))
    /** Database column comment SqlType(text) */
    val comment: Rep[String] = column[String]("comment")
    /** Database column buy_price SqlType(int4) */
    val buyPrice: Rep[Int] = column[Int]("buy_price")
    /** Database column sell_price SqlType(int4) */
    val sellPrice: Rep[Int] = column[Int]("sell_price")
    /** Database column commission SqlType(int4) */
    val commission: Rep[Int] = column[Int]("commission")
    /** Database column tax SqlType(int4), Default(0) */
    val tax: Rep[Int] = column[Int]("tax", O.Default(0))

    /** Foreign key referencing Articles (database name courier_offer_details_article_fkey) */
    lazy val articlesFk = foreignKey("courier_offer_details_article_fkey", article, Articles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CourierOffers (database name courier_offer_details_offer_fkey) */
    lazy val courierOffersFk = foreignKey("courier_offer_details_offer_fkey", offer, CourierOffers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CourierOfferDetails */
  lazy val CourierOfferDetails = new TableQuery(tag => new CourierOfferDetails(tag))
}
