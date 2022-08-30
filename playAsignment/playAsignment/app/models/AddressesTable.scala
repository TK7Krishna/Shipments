package models
// AUTO-GENERATED Slick data model for table Addresses
trait AddressesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Addresses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param contact Database column contact SqlType(int8)
   *  @param attentionTo Database column attention_to SqlType(text)
   *  @param addressLine1 Database column address_line1 SqlType(text)
   *  @param addressLine2 Database column address_line2 SqlType(text), Default(None)
   *  @param addressLine3 Database column address_line3 SqlType(text), Default(None)
   *  @param addressLine4 Database column address_line4 SqlType(text), Default(None)
   *  @param city Database column city SqlType(text)
   *  @param region Database column region SqlType(text)
   *  @param postalCode Database column postal_code SqlType(text)
   *  @param country Database column country SqlType(text) */
  case class AddressesRow(id: Long, contact: Long, attentionTo: String, addressLine1: String, addressLine2: Option[String] = None, addressLine3: Option[String] = None, addressLine4: Option[String] = None, city: String, region: String, postalCode: String, country: String)
  /** GetResult implicit for fetching AddressesRow objects using plain SQL queries */
  implicit def GetResultAddressesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[AddressesRow] = GR{
    prs => import prs._
    AddressesRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table addresses. Objects of this class serve as prototypes for rows in queries. */
  class Addresses(_tableTag: Tag) extends profile.api.Table[AddressesRow](_tableTag, Some("xero"), "addresses") {
    def * = (id, contact, attentionTo, addressLine1, addressLine2, addressLine3, addressLine4, city, region, postalCode, country) <> (AddressesRow.tupled, AddressesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(contact), Rep.Some(attentionTo), Rep.Some(addressLine1), addressLine2, addressLine3, addressLine4, Rep.Some(city), Rep.Some(region), Rep.Some(postalCode), Rep.Some(country))).shaped.<>({r=>import r._; _1.map(_=> AddressesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column contact SqlType(int8) */
    val contact: Rep[Long] = column[Long]("contact")
    /** Database column attention_to SqlType(text) */
    val attentionTo: Rep[String] = column[String]("attention_to")
    /** Database column address_line1 SqlType(text) */
    val addressLine1: Rep[String] = column[String]("address_line1")
    /** Database column address_line2 SqlType(text), Default(None) */
    val addressLine2: Rep[Option[String]] = column[Option[String]]("address_line2", O.Default(None))
    /** Database column address_line3 SqlType(text), Default(None) */
    val addressLine3: Rep[Option[String]] = column[Option[String]]("address_line3", O.Default(None))
    /** Database column address_line4 SqlType(text), Default(None) */
    val addressLine4: Rep[Option[String]] = column[Option[String]]("address_line4", O.Default(None))
    /** Database column city SqlType(text) */
    val city: Rep[String] = column[String]("city")
    /** Database column region SqlType(text) */
    val region: Rep[String] = column[String]("region")
    /** Database column postal_code SqlType(text) */
    val postalCode: Rep[String] = column[String]("postal_code")
    /** Database column country SqlType(text) */
    val country: Rep[String] = column[String]("country")

    /** Foreign key referencing Contacts (database name addresses_contact_fkey) */
    lazy val contactsFk = foreignKey("addresses_contact_fkey", contact, Contacts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Addresses */
  lazy val Addresses = new TableQuery(tag => new Addresses(tag))
}
