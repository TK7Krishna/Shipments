package models
// AUTO-GENERATED Slick data model for table AddressBook
trait AddressBookTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AddressBook
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(int8)
   *  @param firstName Database column first_name SqlType(text)
   *  @param lastName Database column last_name SqlType(text)
   *  @param companyName Database column company_name SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param address Database column address SqlType(text)
   *  @param suburb Database column suburb SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param postcode Database column postcode SqlType(text)
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None)
   *  @param serviceType Database column service_type SqlType(int4), Default(None) */
  case class AddressBookRow(id: Long, userId: Long, firstName: String, lastName: String, companyName: Option[String] = None, phone: String, email: String, address: String, suburb: String, state: String, postcode: String, droplocationId: Option[Long] = None, serviceType: Option[Int] = None)
  /** GetResult implicit for fetching AddressBookRow objects using plain SQL queries */
  implicit def GetResultAddressBookRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[Option[Int]]): GR[AddressBookRow] = GR{
    prs => import prs._
    AddressBookRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[Long], <<?[Int]))
  }
  /** Table description of table address_book. Objects of this class serve as prototypes for rows in queries. */
  class AddressBook(_tableTag: Tag) extends profile.api.Table[AddressBookRow](_tableTag, Some("consumer"), "address_book") {
    def * = (id, userId, firstName, lastName, companyName, phone, email, address, suburb, state, postcode, droplocationId, serviceType) <> (AddressBookRow.tupled, AddressBookRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(userId), Rep.Some(firstName), Rep.Some(lastName), companyName, Rep.Some(phone), Rep.Some(email), Rep.Some(address), Rep.Some(suburb), Rep.Some(state), Rep.Some(postcode), droplocationId, serviceType)).shaped.<>({r=>import r._; _1.map(_=> AddressBookRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(int8) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column first_name SqlType(text) */
    val firstName: Rep[String] = column[String]("first_name")
    /** Database column last_name SqlType(text) */
    val lastName: Rep[String] = column[String]("last_name")
    /** Database column company_name SqlType(text), Default(None) */
    val companyName: Rep[Option[String]] = column[Option[String]]("company_name", O.Default(None))
    /** Database column phone SqlType(text) */
    val phone: Rep[String] = column[String]("phone")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column address SqlType(text) */
    val address: Rep[String] = column[String]("address")
    /** Database column suburb SqlType(text) */
    val suburb: Rep[String] = column[String]("suburb")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))
    /** Database column service_type SqlType(int4), Default(None) */
    val serviceType: Rep[Option[Int]] = column[Option[Int]]("service_type", O.Default(None))

    /** Foreign key referencing Users (database name address_book_user_id_fkey) */
    lazy val usersFk = foreignKey("address_book_user_id_fkey", userId, Users)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (userId,firstName,lastName,companyName,phone,email,address,suburb,state,postcode) (database name unique_per_user_company) */
    val index1 = index("unique_per_user_company", (userId, firstName, lastName, companyName, phone, email, address, suburb, state, postcode), unique=true)
    /** Uniqueness Index over (userId,firstName,lastName,phone,email,address,suburb,state,postcode) (database name unique_per_user_no_company) */
    val index2 = index("unique_per_user_no_company", (userId, firstName, lastName, phone, email, address, suburb, state, postcode), unique=true)
  }
  /** Collection-like TableQuery object for table AddressBook */
  lazy val AddressBook = new TableQuery(tag => new AddressBook(tag))
}
