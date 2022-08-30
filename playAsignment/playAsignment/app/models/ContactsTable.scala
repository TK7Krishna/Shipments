package models
// AUTO-GENERATED Slick data model for table Contacts
trait ContactsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Contacts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param contactNumber Database column contact_number SqlType(text)
   *  @param name Database column name SqlType(text)
   *  @param emailAddress Database column email_address SqlType(text)
   *  @param taxNumber Database column tax_number SqlType(text), Default(None)
   *  @param defaultCurrency Database column default_currency SqlType(text) */
  case class ContactsRow(id: Long, contactNumber: String, name: String, emailAddress: String, taxNumber: Option[String] = None, defaultCurrency: String)
  /** GetResult implicit for fetching ContactsRow objects using plain SQL queries */
  implicit def GetResultContactsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[ContactsRow] = GR{
    prs => import prs._
    ContactsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table contacts. Objects of this class serve as prototypes for rows in queries. */
  class Contacts(_tableTag: Tag) extends profile.api.Table[ContactsRow](_tableTag, Some("xero"), "contacts") {
    def * = (id, contactNumber, name, emailAddress, taxNumber, defaultCurrency) <> (ContactsRow.tupled, ContactsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(contactNumber), Rep.Some(name), Rep.Some(emailAddress), taxNumber, Rep.Some(defaultCurrency))).shaped.<>({r=>import r._; _1.map(_=> ContactsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column contact_number SqlType(text) */
    val contactNumber: Rep[String] = column[String]("contact_number")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column email_address SqlType(text) */
    val emailAddress: Rep[String] = column[String]("email_address")
    /** Database column tax_number SqlType(text), Default(None) */
    val taxNumber: Rep[Option[String]] = column[Option[String]]("tax_number", O.Default(None))
    /** Database column default_currency SqlType(text) */
    val defaultCurrency: Rep[String] = column[String]("default_currency")
  }
  /** Collection-like TableQuery object for table Contacts */
  lazy val Contacts = new TableQuery(tag => new Contacts(tag))
}
