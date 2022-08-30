package models
// AUTO-GENERATED Slick data model for table OtcConsignments
trait OtcConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OtcConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param serviceType Database column service_type SqlType(text)
   *  @param weight Database column weight SqlType(int4)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param pin Database column pin SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param dropLocation Database column drop_location SqlType(int8), Default(None)
   *  @param dropTime Database column drop_time SqlType(timestamptz), Default(None)
   *  @param dropTransaction Database column drop_transaction SqlType(int8), Default(None) */
  case class OtcConsignmentsRow(id: Long, serviceType: String, weight: Int, consignmentNumber: String, pin: String, createdAt: java.sql.Timestamp, dropLocation: Option[Long] = None, dropTime: Option[java.sql.Timestamp] = None, dropTransaction: Option[Long] = None)
  /** GetResult implicit for fetching OtcConsignmentsRow objects using plain SQL queries */
  implicit def GetResultOtcConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[java.sql.Timestamp], e4: GR[Option[Long]], e5: GR[Option[java.sql.Timestamp]]): GR[OtcConsignmentsRow] = GR{
    prs => import prs._
    OtcConsignmentsRow.tupled((<<[Long], <<[String], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<?[Long], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table otc_consignments. Objects of this class serve as prototypes for rows in queries. */
  class OtcConsignments(_tableTag: Tag) extends profile.api.Table[OtcConsignmentsRow](_tableTag, Some("seven_eleven"), "otc_consignments") {
    def * = (id, serviceType, weight, consignmentNumber, pin, createdAt, dropLocation, dropTime, dropTransaction) <> (OtcConsignmentsRow.tupled, OtcConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(serviceType), Rep.Some(weight), Rep.Some(consignmentNumber), Rep.Some(pin), Rep.Some(createdAt), dropLocation, dropTime, dropTransaction)).shaped.<>({r=>import r._; _1.map(_=> OtcConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column service_type SqlType(text) */
    val serviceType: Rep[String] = column[String]("service_type")
    /** Database column weight SqlType(int4) */
    val weight: Rep[Int] = column[Int]("weight")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column pin SqlType(text) */
    val pin: Rep[String] = column[String]("pin")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column drop_location SqlType(int8), Default(None) */
    val dropLocation: Rep[Option[Long]] = column[Option[Long]]("drop_location", O.Default(None))
    /** Database column drop_time SqlType(timestamptz), Default(None) */
    val dropTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("drop_time", O.Default(None))
    /** Database column drop_transaction SqlType(int8), Default(None) */
    val dropTransaction: Rep[Option[Long]] = column[Option[Long]]("drop_transaction", O.Default(None))

    /** Foreign key referencing Droplocations (database name otc_consignments_drop_location_fkey) */
    lazy val droplocationsFk = foreignKey("otc_consignments_drop_location_fkey", dropLocation, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name otc_consignments_drop_transaction_fkey) */
    lazy val transactionHeadersFk = foreignKey("otc_consignments_drop_transaction_fkey", dropTransaction, TransactionHeaders)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (consignmentNumber) (database name otc_consignments_unique) */
    val index1 = index("otc_consignments_unique", consignmentNumber, unique=true)
  }
  /** Collection-like TableQuery object for table OtcConsignments */
  lazy val OtcConsignments = new TableQuery(tag => new OtcConsignments(tag))
}
