package models
// AUTO-GENERATED Slick data model for table Capabilities
trait CapabilitiesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Capabilities
   *  @param name Database column name SqlType(text), PrimaryKey */
  case class CapabilitiesRow(name: String)
  /** GetResult implicit for fetching CapabilitiesRow objects using plain SQL queries */
  implicit def GetResultCapabilitiesRow(implicit e0: GR[String]): GR[CapabilitiesRow] = GR{
    prs => import prs._
    CapabilitiesRow(<<[String])
  }
  /** Table description of table capabilities. Objects of this class serve as prototypes for rows in queries. */
  class Capabilities(_tableTag: Tag) extends profile.api.Table[CapabilitiesRow](_tableTag, "capabilities") {
    def * = name <> (CapabilitiesRow, CapabilitiesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(name)).shaped.<>(r => r.map(_=> CapabilitiesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(text), PrimaryKey */
    val name: Rep[String] = column[String]("name", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table Capabilities */
  lazy val Capabilities = new TableQuery(tag => new Capabilities(tag))
}
