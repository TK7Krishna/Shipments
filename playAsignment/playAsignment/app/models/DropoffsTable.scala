package models
// AUTO-GENERATED Slick data model for table Dropoffs
trait DropoffsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Dropoffs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param contactName Database column contact_name SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param phone Database column phone SqlType(text)
   *  @param fullAddress Database column full_address SqlType(text)
   *  @param notes Database column notes SqlType(text), Default(None) */
  case class DropoffsRow(id: Long, contactName: String, email: String, phone: String, fullAddress: String, notes: Option[String] = None)
  /** GetResult implicit for fetching DropoffsRow objects using plain SQL queries */
  implicit def GetResultDropoffsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[DropoffsRow] = GR{
    prs => import prs._
    DropoffsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<?[String]))
  }
  /** Table description of table dropoffs. Objects of this class serve as prototypes for rows in queries. */
  class Dropoffs(_tableTag: Tag) extends profile.api.Table[DropoffsRow](_tableTag, Some("zoom2u"), "dropoffs") {
    def * = (id, contactName, email, phone, fullAddress, notes) <> (DropoffsRow.tupled, DropoffsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(contactName), Rep.Some(email), Rep.Some(phone), Rep.Some(fullAddress), notes)).shaped.<>({r=>import r._; _1.map(_=> DropoffsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column contact_name SqlType(text) */
    val contactName: Rep[String] = column[String]("contact_name")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column phone SqlType(text) */
    val phone: Rep[String] = column[String]("phone")
    /** Database column full_address SqlType(text) */
    val fullAddress: Rep[String] = column[String]("full_address")
    /** Database column notes SqlType(text), Default(None) */
    val notes: Rep[Option[String]] = column[Option[String]]("notes", O.Default(None))
  }
  /** Collection-like TableQuery object for table Dropoffs */
  lazy val Dropoffs = new TableQuery(tag => new Dropoffs(tag))
}
