package models
// AUTO-GENERATED Slick data model for table QuoteArticles
trait QuoteArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table QuoteArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param article Database column article SqlType(int8)
   *  @param consignment Database column consignment SqlType(int8)
   *  @param quote Database column quote SqlType(int8)
   *  @param isRateQuote Database column is_rate_quote SqlType(bool)
   *  @param rate Database column rate SqlType(int8), Default(None)
   *  @param product Database column product SqlType(int8)
   *  @param cost Database column cost SqlType(int8), Default(None) */
  case class QuoteArticlesRow(id: Long, article: Long, consignment: Long, quote: Long, isRateQuote: Boolean, rate: Option[Long] = None, product: Long, cost: Option[Long] = None)
  /** GetResult implicit for fetching QuoteArticlesRow objects using plain SQL queries */
  implicit def GetResultQuoteArticlesRow(implicit e0: GR[Long], e1: GR[Boolean], e2: GR[Option[Long]]): GR[QuoteArticlesRow] = GR{
    prs => import prs._
    QuoteArticlesRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[Boolean], <<?[Long], <<[Long], <<?[Long]))
  }
  /** Table description of table quote_articles. Objects of this class serve as prototypes for rows in queries. */
  class QuoteArticles(_tableTag: Tag) extends profile.api.Table[QuoteArticlesRow](_tableTag, Some("consumer"), "quote_articles") {
    def * = (id, article, consignment, quote, isRateQuote, rate, product, cost) <> (QuoteArticlesRow.tupled, QuoteArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(article), Rep.Some(consignment), Rep.Some(quote), Rep.Some(isRateQuote), rate, Rep.Some(product), cost)).shaped.<>({r=>import r._; _1.map(_=> QuoteArticlesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article SqlType(int8) */
    val article: Rep[Long] = column[Long]("article")
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column quote SqlType(int8) */
    val quote: Rep[Long] = column[Long]("quote")
    /** Database column is_rate_quote SqlType(bool) */
    val isRateQuote: Rep[Boolean] = column[Boolean]("is_rate_quote")
    /** Database column rate SqlType(int8), Default(None) */
    val rate: Rep[Option[Long]] = column[Option[Long]]("rate", O.Default(None))
    /** Database column product SqlType(int8) */
    val product: Rep[Long] = column[Long]("product")
    /** Database column cost SqlType(int8), Default(None) */
    val cost: Rep[Option[Long]] = column[Option[Long]]("cost", O.Default(None))

    /** Foreign key referencing Articles (database name quote_articles_article_fkey) */
    lazy val articlesFk = foreignKey("quote_articles_article_fkey", article, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name quote_articles_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("quote_articles_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Products (database name quote_articles_product_fkey) */
    lazy val productsFk = foreignKey("quote_articles_product_fkey", product, Products)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Quotes (database name quote_articles_quote_fkey) */
    lazy val quotesFk = foreignKey("quote_articles_quote_fkey", quote, Quotes)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Rates (database name quote_articles_rate_fkey) */
    lazy val ratesFk = foreignKey("quote_articles_rate_fkey", rate, Rates)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table QuoteArticles */
  lazy val QuoteArticles = new TableQuery(tag => new QuoteArticles(tag))
}
