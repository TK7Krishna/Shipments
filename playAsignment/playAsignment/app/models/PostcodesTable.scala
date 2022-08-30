package models
// AUTO-GENERATED Slick data model for table Postcodes
trait PostcodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Postcodes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param countrycode Database column countrycode SqlType(text)
   *  @param postcode Database column postcode SqlType(text)
   *  @param suburb Database column suburb SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param latitude Database column latitude SqlType(float8)
   *  @param longitude Database column longitude SqlType(float8) */
  case class PostcodesRow(id: Long, countrycode: String, postcode: String, suburb: String, state: String, latitude: Double, longitude: Double)
  /** GetResult implicit for fetching PostcodesRow objects using plain SQL queries */
  implicit def GetResultPostcodesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double]): GR[PostcodesRow] = GR{
    prs => import prs._
    PostcodesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[Double], <<[Double]))
  }
  /** Table description of table postcodes. Objects of this class serve as prototypes for rows in queries. */
  class Postcodes(_tableTag: Tag) extends profile.api.Table[PostcodesRow](_tableTag, "postcodes") {
    def * = (id, countrycode, postcode, suburb, state, latitude, longitude) <> (PostcodesRow.tupled, PostcodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(countrycode), Rep.Some(postcode), Rep.Some(suburb), Rep.Some(state), Rep.Some(latitude), Rep.Some(longitude))).shaped.<>({r=>import r._; _1.map(_=> PostcodesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column countrycode SqlType(text) */
    val countrycode: Rep[String] = column[String]("countrycode")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column suburb SqlType(text) */
    val suburb: Rep[String] = column[String]("suburb")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column latitude SqlType(float8) */
    val latitude: Rep[Double] = column[Double]("latitude")
    /** Database column longitude SqlType(float8) */
    val longitude: Rep[Double] = column[Double]("longitude")
  }
  /** Collection-like TableQuery object for table Postcodes */
  lazy val Postcodes = new TableQuery(tag => new Postcodes(tag))
}
