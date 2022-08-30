package models
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends Tables {
  val profile = slick.jdbc.PostgresProfile
}

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Rates.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Rates
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param provider Database column provider SqlType(text)
   *  @param minWeight Database column min_weight SqlType(int4)
   *  @param maxWeight Database column max_weight SqlType(int4)
   *  @param country Database column country SqlType(text)
   *  @param price Database column price SqlType(int4) */
  case class RatesRow(id: Long, provider: String, minWeight: Int, maxWeight: Int, country: String, price: Int)
  /** GetResult implicit for fetching RatesRow objects using plain SQL queries */
  implicit def GetResultRatesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int]): GR[RatesRow] = GR{
    prs => import prs._
    RatesRow.tupled((<<[Long], <<[String], <<[Int], <<[Int], <<[String], <<[Int]))
  }
  /** Table description of table rates. Objects of this class serve as prototypes for rows in queries. */
  class Rates(_tableTag: Tag) extends profile.api.Table[RatesRow](_tableTag, "rates") {
    def * = (id, provider, minWeight, maxWeight, country, price) <> (RatesRow.tupled, RatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(provider), Rep.Some(minWeight), Rep.Some(maxWeight), Rep.Some(country), Rep.Some(price))).shaped.<>({r=>import r._; _1.map(_=> RatesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column provider SqlType(text) */
    val provider: Rep[String] = column[String]("provider")
    /** Database column min_weight SqlType(int4) */
    val minWeight: Rep[Int] = column[Int]("min_weight")
    /** Database column max_weight SqlType(int4) */
    val maxWeight: Rep[Int] = column[Int]("max_weight")
    /** Database column country SqlType(text) */
    val country: Rep[String] = column[String]("country")
    /** Database column price SqlType(int4) */
    val price: Rep[Int] = column[Int]("price")
  }
  /** Collection-like TableQuery object for table Rates */
  lazy val Rates = new TableQuery(tag => new Rates(tag))
}


