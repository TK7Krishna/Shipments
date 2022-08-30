package models
// AUTO-GENERATED Slick data model for table Suburbs
trait SuburbsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Suburbs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param suburb Database column suburb SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param postcode Database column postcode SqlType(text)
   *  @param country Database column country SqlType(text)
   *  @param usedBy Database column used_by SqlType(varchar), Length(100,true), Default(None)
   *  @param tollDeliveryZone Database column toll_delivery_zone SqlType(text), Default(Some(Regional)) */
  case class SuburbsRow(id: Long, suburb: String, state: String, postcode: String, country: String, usedBy: Option[String] = None, tollDeliveryZone: Option[String] = Some("Regional"))
  /** GetResult implicit for fetching SuburbsRow objects using plain SQL queries */
  implicit def GetResultSuburbsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[SuburbsRow] = GR{
    prs => import prs._
    SuburbsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[String]))
  }
  /** Table description of table suburbs. Objects of this class serve as prototypes for rows in queries. */
  class Suburbs(_tableTag: Tag) extends profile.api.Table[SuburbsRow](_tableTag, Some("rate_card"), "suburbs") {
    def * = (id, suburb, state, postcode, country, usedBy, tollDeliveryZone) <> (SuburbsRow.tupled, SuburbsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(suburb), Rep.Some(state), Rep.Some(postcode), Rep.Some(country), usedBy, tollDeliveryZone)).shaped.<>({r=>import r._; _1.map(_=> SuburbsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column suburb SqlType(text) */
    val suburb: Rep[String] = column[String]("suburb")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column country SqlType(text) */
    val country: Rep[String] = column[String]("country")
    /** Database column used_by SqlType(varchar), Length(100,true), Default(None) */
    val usedBy: Rep[Option[String]] = column[Option[String]]("used_by", O.Length(100,varying=true), O.Default(None))
    /** Database column toll_delivery_zone SqlType(text), Default(Some(Regional)) */
    val tollDeliveryZone: Rep[Option[String]] = column[Option[String]]("toll_delivery_zone", O.Default(Some("Regional")))

    /** Foreign key referencing Countries (database name suburbs_country_fkey) */
    lazy val countriesFk = foreignKey("suburbs_country_fkey", country, Countries)(r => r.countryCode, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (postcode) (database name suburbs_postcode_idx) */
    val index1 = index("suburbs_postcode_idx", postcode)
    /** Index over (suburb) (database name suburbs_suburb_idx) */
    val index2 = index("suburbs_suburb_idx", suburb)
    /** Uniqueness Index over (suburb,state,postcode) (database name suburbs_suburb_state_postcode_idx) */
    val index3 = index("suburbs_suburb_state_postcode_idx", (suburb, state, postcode), unique=true)
  }
  /** Collection-like TableQuery object for table Suburbs */
  lazy val Suburbs = new TableQuery(tag => new Suburbs(tag))
}
