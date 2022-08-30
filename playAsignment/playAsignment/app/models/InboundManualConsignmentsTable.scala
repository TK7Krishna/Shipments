package models
// AUTO-GENERATED Slick data model for table InboundManualConsignments
trait InboundManualConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundManualConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param courier Database column courier SqlType(text)
   *  @param receiverName Database column receiver_name SqlType(text), Default(None)
   *  @param receiverPhone Database column receiver_phone SqlType(text), Default(None)
   *  @param receiverEmail Database column receiver_email SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InboundManualConsignmentsRow(id: Long, location: Long, consignmentNumber: String, courier: String, receiverName: Option[String] = None, receiverPhone: Option[String] = None, receiverEmail: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InboundManualConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundManualConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[InboundManualConsignmentsRow] = GR{
    prs => import prs._
    InboundManualConsignmentsRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table inbound_manual_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundManualConsignments(_tableTag: Tag) extends profile.api.Table[InboundManualConsignmentsRow](_tableTag, "inbound_manual_consignments") {
    def * = (id, location, consignmentNumber, courier, receiverName, receiverPhone, receiverEmail, createdAt) <> (InboundManualConsignmentsRow.tupled, InboundManualConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(consignmentNumber), Rep.Some(courier), receiverName, receiverPhone, receiverEmail, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InboundManualConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column receiver_name SqlType(text), Default(None) */
    val receiverName: Rep[Option[String]] = column[Option[String]]("receiver_name", O.Default(None))
    /** Database column receiver_phone SqlType(text), Default(None) */
    val receiverPhone: Rep[Option[String]] = column[Option[String]]("receiver_phone", O.Default(None))
    /** Database column receiver_email SqlType(text), Default(None) */
    val receiverEmail: Rep[Option[String]] = column[Option[String]]("receiver_email", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Couriers (database name inbound_manual_consignments_courier_fkey) */
    lazy val couriersFk = foreignKey("inbound_manual_consignments_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name inbound_manual_consignments_location_fkey) */
    lazy val droplocationsFk = foreignKey("inbound_manual_consignments_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundManualConsignments */
  lazy val InboundManualConsignments = new TableQuery(tag => new InboundManualConsignments(tag))
}
