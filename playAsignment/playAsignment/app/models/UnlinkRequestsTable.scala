package models
// AUTO-GENERATED Slick data model for table UnlinkRequests
trait UnlinkRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UnlinkRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param adminUser Database column admin_user SqlType(int8), Default(None)
   *  @param courierUser Database column courier_user SqlType(int8), Default(None)
   *  @param body Database column body SqlType(text)
   *  @param errors Database column errors SqlType(text), Default(None)
   *  @param linkType Database column link_type SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class UnlinkRequestsRow(id: Long, consignmentNumber: String, consignmentId: Option[Long] = None, adminUser: Option[Long] = None, courierUser: Option[Long] = None, body: String, errors: Option[String] = None, linkType: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching UnlinkRequestsRow objects using plain SQL queries */
  implicit def GetResultUnlinkRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[Option[String]], e4: GR[java.sql.Timestamp]): GR[UnlinkRequestsRow] = GR{
    prs => import prs._
    UnlinkRequestsRow.tupled((<<[Long], <<[String], <<?[Long], <<?[Long], <<?[Long], <<[String], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table unlink_requests. Objects of this class serve as prototypes for rows in queries. */
  class UnlinkRequests(_tableTag: Tag) extends profile.api.Table[UnlinkRequestsRow](_tableTag, "unlink_requests") {
    def * = (id, consignmentNumber, consignmentId, adminUser, courierUser, body, errors, linkType, createdAt) <> (UnlinkRequestsRow.tupled, UnlinkRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentNumber), consignmentId, adminUser, courierUser, Rep.Some(body), errors, linkType, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> UnlinkRequestsRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7, _8, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column admin_user SqlType(int8), Default(None) */
    val adminUser: Rep[Option[Long]] = column[Option[Long]]("admin_user", O.Default(None))
    /** Database column courier_user SqlType(int8), Default(None) */
    val courierUser: Rep[Option[Long]] = column[Option[Long]]("courier_user", O.Default(None))
    /** Database column body SqlType(text) */
    val body: Rep[String] = column[String]("body")
    /** Database column errors SqlType(text), Default(None) */
    val errors: Rep[Option[String]] = column[Option[String]]("errors", O.Default(None))
    /** Database column link_type SqlType(text), Default(None) */
    val linkType: Rep[Option[String]] = column[Option[String]]("link_type", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing AdminUsers (database name unlink_requests_admin_user_fkey) */
    lazy val adminUsersFk = foreignKey("unlink_requests_admin_user_fkey", adminUser, AdminUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name unlink_requests_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("unlink_requests_consignment_id_fkey", consignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing CourierUsers (database name unlink_requests_courier_user_fkey) */
    lazy val courierUsersFk = foreignKey("unlink_requests_courier_user_fkey", courierUser, CourierUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (linkType) (database name unlink_requests_link_type_idx) */
    val index1 = index("unlink_requests_link_type_idx", linkType)
  }
  /** Collection-like TableQuery object for table UnlinkRequests */
  lazy val UnlinkRequests = new TableQuery(tag => new UnlinkRequests(tag))
}
