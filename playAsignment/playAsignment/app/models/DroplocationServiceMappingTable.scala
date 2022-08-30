package models
// AUTO-GENERATED Slick data model for table DroplocationServiceMapping
trait DroplocationServiceMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DroplocationServiceMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None)
   *  @param serviceId Database column service_id SqlType(int8), Default(None) */
  case class DroplocationServiceMappingRow(id: Long, droplocationId: Option[Long] = None, serviceId: Option[Long] = None)
  /** GetResult implicit for fetching DroplocationServiceMappingRow objects using plain SQL queries */
  implicit def GetResultDroplocationServiceMappingRow(implicit e0: GR[Long], e1: GR[Option[Long]]): GR[DroplocationServiceMappingRow] = GR{
    prs => import prs._
    DroplocationServiceMappingRow.tupled((<<[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table droplocation_service_mapping. Objects of this class serve as prototypes for rows in queries. */
  class DroplocationServiceMapping(_tableTag: Tag) extends profile.api.Table[DroplocationServiceMappingRow](_tableTag, Some("ecommerce"), "droplocation_service_mapping") {
    def * = (id, droplocationId, serviceId) <> (DroplocationServiceMappingRow.tupled, DroplocationServiceMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), droplocationId, serviceId)).shaped.<>({r=>import r._; _1.map(_=> DroplocationServiceMappingRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))
    /** Database column service_id SqlType(int8), Default(None) */
    val serviceId: Rep[Option[Long]] = column[Option[Long]]("service_id", O.Default(None))

    /** Foreign key referencing Droplocations (database name fk_droplocation_id) */
    lazy val droplocationsFk = foreignKey("fk_droplocation_id", droplocationId, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Service (database name fk_service_id) */
    lazy val serviceFk = foreignKey("fk_service_id", serviceId, Service)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DroplocationServiceMapping */
  lazy val DroplocationServiceMapping = new TableQuery(tag => new DroplocationServiceMapping(tag))
}
