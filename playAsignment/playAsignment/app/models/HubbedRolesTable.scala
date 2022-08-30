package models
// AUTO-GENERATED Slick data model for table HubbedRoles
trait HubbedRolesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HubbedRoles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param rolename Database column rolename SqlType(text), Default(None)
   *  @param description Database column description SqlType(text), Default(None) */
  case class HubbedRolesRow(id: Long, rolename: Option[String] = None, description: Option[String] = None)
  /** GetResult implicit for fetching HubbedRolesRow objects using plain SQL queries */
  implicit def GetResultHubbedRolesRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[HubbedRolesRow] = GR{
    prs => import prs._
    HubbedRolesRow.tupled((<<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table hubbed_roles. Objects of this class serve as prototypes for rows in queries. */
  class HubbedRoles(_tableTag: Tag) extends profile.api.Table[HubbedRolesRow](_tableTag, Some("test"), "hubbed_roles") {
    def * = (id, rolename, description) <> (HubbedRolesRow.tupled, HubbedRolesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), rolename, description)).shaped.<>({r=>import r._; _1.map(_=> HubbedRolesRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column rolename SqlType(text), Default(None) */
    val rolename: Rep[Option[String]] = column[Option[String]]("rolename", O.Default(None))
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
  }
  /** Collection-like TableQuery object for table HubbedRoles */
  lazy val HubbedRoles = new TableQuery(tag => new HubbedRoles(tag))
}
