package models
// AUTO-GENERATED Slick data model for table EcommerceLocationMapping
trait EcommerceLocationMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceLocationMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param name Database column name SqlType(text), Default(None)
   *  @param address Database column address SqlType(text), Default(None)
   *  @param suburb Database column suburb SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param reference Database column reference SqlType(text), Default(None)
   *  @param postcode Database column postcode SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(varchar), Length(20,true), Default(None)
   *  @param firstname Database column firstname SqlType(text), Default(None)
   *  @param lastname Database column lastname SqlType(text), Default(None) */
  case class EcommerceLocationMappingRow(id: Long, hubbedUserId: Long, name: Option[String] = None, address: Option[String] = None, suburb: Option[String] = None, state: Option[String] = None, country: Option[String] = None, reference: Option[String] = None, postcode: Option[String] = None, phone: Option[String] = None, firstname: Option[String] = None, lastname: Option[String] = None)
  /** GetResult implicit for fetching EcommerceLocationMappingRow objects using plain SQL queries */
  implicit def GetResultEcommerceLocationMappingRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[EcommerceLocationMappingRow] = GR{
    prs => import prs._
    EcommerceLocationMappingRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table ecommerce_location_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceLocationMapping(_tableTag: Tag) extends profile.api.Table[EcommerceLocationMappingRow](_tableTag, Some("ecommerce"), "ecommerce_location_mapping") {
    def * = (id, hubbedUserId, name, address, suburb, state, country, reference, postcode, phone, firstname, lastname) <> (EcommerceLocationMappingRow.tupled, EcommerceLocationMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), name, address, suburb, state, country, reference, postcode, phone, firstname, lastname)).shaped.<>({r=>import r._; _1.map(_=> EcommerceLocationMappingRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column address SqlType(text), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Default(None))
    /** Database column suburb SqlType(text), Default(None) */
    val suburb: Rep[Option[String]] = column[Option[String]]("suburb", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column reference SqlType(text), Default(None) */
    val reference: Rep[Option[String]] = column[Option[String]]("reference", O.Default(None))
    /** Database column postcode SqlType(text), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Default(None))
    /** Database column phone SqlType(varchar), Length(20,true), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Length(20,varying=true), O.Default(None))
    /** Database column firstname SqlType(text), Default(None) */
    val firstname: Rep[Option[String]] = column[Option[String]]("firstname", O.Default(None))
    /** Database column lastname SqlType(text), Default(None) */
    val lastname: Rep[Option[String]] = column[Option[String]]("lastname", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name fk_ecommerce_location_mapping_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("fk_ecommerce_location_mapping_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceLocationMapping */
  lazy val EcommerceLocationMapping = new TableQuery(tag => new EcommerceLocationMapping(tag))
}
