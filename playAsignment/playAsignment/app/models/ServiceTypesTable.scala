package models
// AUTO-GENERATED Slick data model for table ServiceTypes
trait ServiceTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ServiceTypes
   *  @param id Database column id SqlType(int8), PrimaryKey
   *  @param name Database column name SqlType(text) */
  case class ServiceTypesRow(id: Long, name: String)
  /** GetResult implicit for fetching ServiceTypesRow objects using plain SQL queries */
  implicit def GetResultServiceTypesRow(implicit e0: GR[Long], e1: GR[String]): GR[ServiceTypesRow] = GR{
    prs => import prs._
    ServiceTypesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table service_types. Objects of this class serve as prototypes for rows in queries. */
  class ServiceTypes(_tableTag: Tag) extends profile.api.Table[ServiceTypesRow](_tableTag, Some("consumer"), "service_types") {
    def * = (id, name) <> (ServiceTypesRow.tupled, ServiceTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> ServiceTypesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int8), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table ServiceTypes */
  lazy val ServiceTypes = new TableQuery(tag => new ServiceTypes(tag))
}
