package models
// AUTO-GENERATED Slick data model for table Pickups
trait PickupsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pickups
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param contactName Database column contact_name SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param phone Database column phone SqlType(text)
   *  @param notes Database column notes SqlType(text), Default(None)
   *  @param fullAddress Database column full_address SqlType(text) */
  case class PickupsRow(id: Long, contactName: String, email: String, phone: String, notes: Option[String] = None, fullAddress: String)
  /** GetResult implicit for fetching PickupsRow objects using plain SQL queries */
  implicit def GetResultPickupsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[PickupsRow] = GR{
    prs => import prs._
    PickupsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table pickups. Objects of this class serve as prototypes for rows in queries. */
  class Pickups(_tableTag: Tag) extends profile.api.Table[PickupsRow](_tableTag, Some("zoom2u"), "pickups") {
    def * = (id, contactName, email, phone, notes, fullAddress) <> (PickupsRow.tupled, PickupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(contactName), Rep.Some(email), Rep.Some(phone), notes, Rep.Some(fullAddress))).shaped.<>({r=>import r._; _1.map(_=> PickupsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column phone SqlType(text) */
    val phone: Rep[String] = column[String]("phone")
    /** Database column notes SqlType(text), Default(None) */
    val notes: Rep[Option[String]] = column[Option[String]]("notes", O.Default(None))
    /** Database column full_address SqlType(text) */
    val fullAddress: Rep[String] = column[String]("full_address")
  }
  /** Collection-like TableQuery object for table Pickups */
  lazy val Pickups = new TableQuery(tag => new Pickups(tag))
}
