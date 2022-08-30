package models
// AUTO-GENERATED Slick data model for table EcpMapping
trait EcpMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcpMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param locationOrderLogId Database column location_order_log_id SqlType(int8)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param ecpCode Database column ecp_code SqlType(text)
   *  @param trackingNumber Database column tracking_number SqlType(text), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param barcode Database column barcode SqlType(text), Default(None)
   *  @param courierCode Database column courier_code SqlType(text), Default(Some(ebay))
   *  @param buyerFirstName Database column buyer_first_name SqlType(text), Default(None)
   *  @param buyerLastName Database column buyer_last_name SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class EcpMappingRow(id: Long, locationOrderLogId: Long, consignmentId: Option[Long] = None, ecpCode: String, trackingNumber: Option[String] = None, consignmentNumber: Option[String] = None, barcode: Option[String] = None, courierCode: Option[String] = Some("ebay"), buyerFirstName: Option[String] = None, buyerLastName: Option[String] = None, createdAt: Option[java.sql.Timestamp], modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching EcpMappingRow objects using plain SQL queries */
  implicit def GetResultEcpMappingRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[EcpMappingRow] = GR{
    prs => import prs._
    EcpMappingRow.tupled((<<[Long], <<[Long], <<?[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table ecp_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcpMapping(_tableTag: Tag) extends profile.api.Table[EcpMappingRow](_tableTag, Some("ebay"), "ecp_mapping") {
    def * = (id, locationOrderLogId, consignmentId, ecpCode, trackingNumber, consignmentNumber, barcode, courierCode, buyerFirstName, buyerLastName, createdAt, modifiedAt) <> (EcpMappingRow.tupled, EcpMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(locationOrderLogId), consignmentId, Rep.Some(ecpCode), trackingNumber, consignmentNumber, barcode, courierCode, buyerFirstName, buyerLastName, createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> EcpMappingRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location_order_log_id SqlType(int8) */
    val locationOrderLogId: Rep[Long] = column[Long]("location_order_log_id")
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column ecp_code SqlType(text) */
    val ecpCode: Rep[String] = column[String]("ecp_code")
    /** Database column tracking_number SqlType(text), Default(None) */
    val trackingNumber: Rep[Option[String]] = column[Option[String]]("tracking_number", O.Default(None))
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))
    /** Database column courier_code SqlType(text), Default(Some(ebay)) */
    val courierCode: Rep[Option[String]] = column[Option[String]]("courier_code", O.Default(Some("ebay")))
    /** Database column buyer_first_name SqlType(text), Default(None) */
    val buyerFirstName: Rep[Option[String]] = column[Option[String]]("buyer_first_name", O.Default(None))
    /** Database column buyer_last_name SqlType(text), Default(None) */
    val buyerLastName: Rep[Option[String]] = column[Option[String]]("buyer_last_name", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))

    /** Foreign key referencing Consignments (database name consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_id_fkey", consignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LocationOrderLogs (database name location_order_log_id_fkey) */
    lazy val locationOrderLogsFk = foreignKey("location_order_log_id_fkey", locationOrderLogId, LocationOrderLogs)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcpMapping */
  lazy val EcpMapping = new TableQuery(tag => new EcpMapping(tag))
}
