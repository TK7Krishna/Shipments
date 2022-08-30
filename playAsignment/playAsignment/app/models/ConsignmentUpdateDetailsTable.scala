package models
// AUTO-GENERATED Slick data model for table ConsignmentUpdateDetails
trait ConsignmentUpdateDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentUpdateDetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param oldConsignmentNumber Database column old_consignment_number SqlType(text), Default(None)
   *  @param oldArticleNumber Database column old_article_number SqlType(text), Default(None)
   *  @param oldLocation Database column old_location SqlType(text), Default(None)
   *  @param oldReceiver Database column old_receiver SqlType(text), Default(None)
   *  @param sendPod Database column send_pod SqlType(bool), Default(Some(true))
   *  @param isNonCompliant Database column is_non_compliant SqlType(bool), Default(Some(false))
   *  @param ip Database column ip SqlType(text), Default(None)
   *  @param state Database column state SqlType(int8)
   *  @param adminUserId Database column admin_user_id SqlType(int8)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class ConsignmentUpdateDetailsRow(id: Long, consignmentId: Long, oldConsignmentNumber: Option[String] = None, oldArticleNumber: Option[String] = None, oldLocation: Option[String] = None, oldReceiver: Option[String] = None, sendPod: Option[Boolean] = Some(true), isNonCompliant: Option[Boolean] = Some(false), ip: Option[String] = None, state: Long, adminUserId: Long, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ConsignmentUpdateDetailsRow objects using plain SQL queries */
  implicit def GetResultConsignmentUpdateDetailsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp]): GR[ConsignmentUpdateDetailsRow] = GR{
    prs => import prs._
    ConsignmentUpdateDetailsRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[Boolean], <<?[String], <<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table consignment_update_details. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentUpdateDetails(_tableTag: Tag) extends profile.api.Table[ConsignmentUpdateDetailsRow](_tableTag, "consignment_update_details") {
    def * = (id, consignmentId, oldConsignmentNumber, oldArticleNumber, oldLocation, oldReceiver, sendPod, isNonCompliant, ip, state, adminUserId, createdAt) <> (ConsignmentUpdateDetailsRow.tupled, ConsignmentUpdateDetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), oldConsignmentNumber, oldArticleNumber, oldLocation, oldReceiver, sendPod, isNonCompliant, ip, Rep.Some(state), Rep.Some(adminUserId), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentUpdateDetailsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column old_consignment_number SqlType(text), Default(None) */
    val oldConsignmentNumber: Rep[Option[String]] = column[Option[String]]("old_consignment_number", O.Default(None))
    /** Database column old_article_number SqlType(text), Default(None) */
    val oldArticleNumber: Rep[Option[String]] = column[Option[String]]("old_article_number", O.Default(None))
    /** Database column old_location SqlType(text), Default(None) */
    val oldLocation: Rep[Option[String]] = column[Option[String]]("old_location", O.Default(None))
    /** Database column old_receiver SqlType(text), Default(None) */
    val oldReceiver: Rep[Option[String]] = column[Option[String]]("old_receiver", O.Default(None))
    /** Database column send_pod SqlType(bool), Default(Some(true)) */
    val sendPod: Rep[Option[Boolean]] = column[Option[Boolean]]("send_pod", O.Default(Some(true)))
    /** Database column is_non_compliant SqlType(bool), Default(Some(false)) */
    val isNonCompliant: Rep[Option[Boolean]] = column[Option[Boolean]]("is_non_compliant", O.Default(Some(false)))
    /** Database column ip SqlType(text), Default(None) */
    val ip: Rep[Option[String]] = column[Option[String]]("ip", O.Default(None))
    /** Database column state SqlType(int8) */
    val state: Rep[Long] = column[Long]("state")
    /** Database column admin_user_id SqlType(int8) */
    val adminUserId: Rep[Long] = column[Long]("admin_user_id")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing AdminUsers (database name consignment_update_details_admin_user_id_fkey) */
    lazy val adminUsersFk = foreignKey("consignment_update_details_admin_user_id_fkey", adminUserId, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Consignments (database name consignment_update_details_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_update_details_consignment_id_fkey", consignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentUpdateDetails */
  lazy val ConsignmentUpdateDetails = new TableQuery(tag => new ConsignmentUpdateDetails(tag))
}
