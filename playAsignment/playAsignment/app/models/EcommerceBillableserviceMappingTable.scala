package models
// AUTO-GENERATED Slick data model for table EcommerceBillableserviceMapping
trait EcommerceBillableserviceMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceBillableserviceMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param billableserviceId Database column billableservice_id SqlType(int8)
   *  @param active Database column active SqlType(bool), Default(Some(true)) */
  case class EcommerceBillableserviceMappingRow(id: Long, hubbedUserId: Long, billableserviceId: Long, active: Option[Boolean] = Some(true))
  /** GetResult implicit for fetching EcommerceBillableserviceMappingRow objects using plain SQL queries */
  implicit def GetResultEcommerceBillableserviceMappingRow(implicit e0: GR[Long], e1: GR[Option[Boolean]]): GR[EcommerceBillableserviceMappingRow] = GR{
    prs => import prs._
    EcommerceBillableserviceMappingRow.tupled((<<[Long], <<[Long], <<[Long], <<?[Boolean]))
  }
  /** Table description of table ecommerce_billableservice_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceBillableserviceMapping(_tableTag: Tag) extends profile.api.Table[EcommerceBillableserviceMappingRow](_tableTag, Some("ecommerce"), "ecommerce_billableservice_mapping") {
    def * = (id, hubbedUserId, billableserviceId, active) <> (EcommerceBillableserviceMappingRow.tupled, EcommerceBillableserviceMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), Rep.Some(billableserviceId), active)).shaped.<>({r=>import r._; _1.map(_=> EcommerceBillableserviceMappingRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column billableservice_id SqlType(int8) */
    val billableserviceId: Rep[Long] = column[Long]("billableservice_id")
    /** Database column active SqlType(bool), Default(Some(true)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(true)))

    /** Foreign key referencing Billableservice (database name fk_ecommerce_billableservice_mapping_billableservice_id) */
    lazy val billableserviceFk = foreignKey("fk_ecommerce_billableservice_mapping_billableservice_id", billableserviceId, Billableservice)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name fk_ecommerce_billableservice_mapping_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("fk_ecommerce_billableservice_mapping_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceBillableserviceMapping */
  lazy val EcommerceBillableserviceMapping = new TableQuery(tag => new EcommerceBillableserviceMapping(tag))
}
