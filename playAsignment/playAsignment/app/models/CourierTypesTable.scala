package models
// AUTO-GENERATED Slick data model for table CourierTypes
trait CourierTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierTypes
   *  @param id Database column id SqlType(int8), PrimaryKey
   *  @param name Database column name SqlType(text) */
  case class CourierTypesRow(id: Long, name: String)
  /** GetResult implicit for fetching CourierTypesRow objects using plain SQL queries */
  implicit def GetResultCourierTypesRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierTypesRow] = GR{
    prs => import prs._
    CourierTypesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table courier_types. Objects of this class serve as prototypes for rows in queries. */
  class CourierTypes(_tableTag: Tag) extends profile.api.Table[CourierTypesRow](_tableTag, "courier_types") {
    def * = (id, name) <> (CourierTypesRow.tupled, CourierTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> CourierTypesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int8), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table CourierTypes */
  lazy val CourierTypes = new TableQuery(tag => new CourierTypes(tag))
}
