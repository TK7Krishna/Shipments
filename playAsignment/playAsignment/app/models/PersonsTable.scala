package models
// AUTO-GENERATED Slick data model for table Persons
trait PersonsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Persons
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param phone Database column phone SqlType(text), Default(None)
   *  @param street1 Database column street1 SqlType(text), Default(None)
   *  @param street2 Database column street2 SqlType(text), Default(None)
   *  @param city Database column city SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param postcode Database column postcode SqlType(text), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param createdat Database column createdat SqlType(timestamptz)
   *  @param modifiedat Database column modifiedat SqlType(timestamptz)
   *  @param email Database column email SqlType(text), Default(None) */
  case class PersonsRow(id: Long, name: String, phone: Option[String] = None, street1: Option[String] = None, street2: Option[String] = None, city: Option[String] = None, state: Option[String] = None, postcode: Option[String] = None, country: Option[String] = None, createdat: java.sql.Timestamp, modifiedat: java.sql.Timestamp, email: Option[String] = None)
  /** GetResult implicit for fetching PersonsRow objects using plain SQL queries */
  implicit def GetResultPersonsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[PersonsRow] = GR{
    prs => import prs._
    PersonsRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table persons. Objects of this class serve as prototypes for rows in queries. */
  class Persons(_tableTag: Tag) extends profile.api.Table[PersonsRow](_tableTag, "persons") {
    def * = (id, name, phone, street1, street2, city, state, postcode, country, createdat, modifiedat, email) <> (PersonsRow.tupled, PersonsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), phone, street1, street2, city, state, postcode, country, Rep.Some(createdat), Rep.Some(modifiedat), email)).shaped.<>({r=>import r._; _1.map(_=> PersonsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column phone SqlType(text), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Default(None))
    /** Database column street1 SqlType(text), Default(None) */
    val street1: Rep[Option[String]] = column[Option[String]]("street1", O.Default(None))
    /** Database column street2 SqlType(text), Default(None) */
    val street2: Rep[Option[String]] = column[Option[String]]("street2", O.Default(None))
    /** Database column city SqlType(text), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column postcode SqlType(text), Default(None) */
    val postcode: Rep[Option[String]] = column[Option[String]]("postcode", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column createdat SqlType(timestamptz) */
    val createdat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("createdat")
    /** Database column modifiedat SqlType(timestamptz) */
    val modifiedat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modifiedat")
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))

    /** Index over (name) (database name persons_name_idx) */
    val index1 = index("persons_name_idx", name)
  }
  /** Collection-like TableQuery object for table Persons */
  lazy val Persons = new TableQuery(tag => new Persons(tag))
}
