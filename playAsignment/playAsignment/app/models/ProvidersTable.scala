package models
// AUTO-GENERATED Slick data model for table Providers
trait ProvidersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Providers
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param iss Database column iss SqlType(text)
   *  @param name Database column name SqlType(text) */
  case class ProvidersRow(id: Long, iss: String, name: String)
  /** GetResult implicit for fetching ProvidersRow objects using plain SQL queries */
  implicit def GetResultProvidersRow(implicit e0: GR[Long], e1: GR[String]): GR[ProvidersRow] = GR{
    prs => import prs._
    ProvidersRow.tupled((<<[Long], <<[String], <<[String]))
  }
  /** Table description of table providers. Objects of this class serve as prototypes for rows in queries. */
  class Providers(_tableTag: Tag) extends profile.api.Table[ProvidersRow](_tableTag, Some("locker"), "providers") {
    def * = (id, iss, name) <> (ProvidersRow.tupled, ProvidersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(iss), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> ProvidersRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column iss SqlType(text) */
    val iss: Rep[String] = column[String]("iss")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")

    /** Uniqueness Index over (iss) (database name providers_iss_key) */
    val index1 = index("providers_iss_key", iss, unique=true)
  }
  /** Collection-like TableQuery object for table Providers */
  lazy val Providers = new TableQuery(tag => new Providers(tag))
}
