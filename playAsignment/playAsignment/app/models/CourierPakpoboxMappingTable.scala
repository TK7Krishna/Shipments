package models
// AUTO-GENERATED Slick data model for table CourierPakpoboxMapping
trait CourierPakpoboxMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierPakpoboxMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param code Database column code SqlType(text)
   *  @param username Database column username SqlType(text)
   *  @param password Database column password SqlType(text) */
  case class CourierPakpoboxMappingRow(id: Long, code: String, username: String, password: String)
  /** GetResult implicit for fetching CourierPakpoboxMappingRow objects using plain SQL queries */
  implicit def GetResultCourierPakpoboxMappingRow(implicit e0: GR[Long], e1: GR[String]): GR[CourierPakpoboxMappingRow] = GR{
    prs => import prs._
    CourierPakpoboxMappingRow.tupled((<<[Long], <<[String], <<[String], <<[String]))
  }
  /** Table description of table courier_pakpobox_mapping. Objects of this class serve as prototypes for rows in queries. */
  class CourierPakpoboxMapping(_tableTag: Tag) extends profile.api.Table[CourierPakpoboxMappingRow](_tableTag, Some("pakpobox"), "courier_pakpobox_mapping") {
    def * = (id, code, username, password) <> (CourierPakpoboxMappingRow.tupled, CourierPakpoboxMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(code), Rep.Some(username), Rep.Some(password))).shaped.<>({r=>import r._; _1.map(_=> CourierPakpoboxMappingRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(text) */
    val code: Rep[String] = column[String]("code")
    /** Database column username SqlType(text) */
    val username: Rep[String] = column[String]("username")
    /** Database column password SqlType(text) */
    val password: Rep[String] = column[String]("password")
  }
  /** Collection-like TableQuery object for table CourierPakpoboxMapping */
  lazy val CourierPakpoboxMapping = new TableQuery(tag => new CourierPakpoboxMapping(tag))
}
