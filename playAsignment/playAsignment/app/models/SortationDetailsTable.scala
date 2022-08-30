package models
// AUTO-GENERATED Slick data model for table SortationDetails
trait SortationDetailsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SortationDetails
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param barcode Database column barcode SqlType(text), Default(None)
   *  @param merchant Database column merchant SqlType(text), Default(None)
   *  @param destinationAddress Database column destination_address SqlType(text), Default(None)
   *  @param isAccepted Database column is_accepted SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None)
   *  @param scannedById Database column scanned_by_id SqlType(int8), Default(None)
   *  @param outboundConsignmentId Database column outbound_consignment_id SqlType(int8), Default(None) */
  case class SortationDetailsRow(id: Long, consignmentId: Option[Long] = None, consignmentNumber: Option[String] = None, barcode: Option[String] = None, merchant: Option[String] = None, destinationAddress: Option[String] = None, isAccepted: Option[Boolean] = None, createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None, hubbedUserId: Option[Long] = None, scannedById: Option[Long] = None, outboundConsignmentId: Option[Long] = None)
  /** GetResult implicit for fetching SortationDetailsRow objects using plain SQL queries */
  implicit def GetResultSortationDetailsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[Option[java.sql.Timestamp]]): GR[SortationDetailsRow] = GR{
    prs => import prs._
    SortationDetailsRow.tupled((<<[Long], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table sortation_details. Objects of this class serve as prototypes for rows in queries. */
  class SortationDetails(_tableTag: Tag) extends profile.api.Table[SortationDetailsRow](_tableTag, Some("ecommerce"), "sortation_details") {
    def * = (id, consignmentId, consignmentNumber, barcode, merchant, destinationAddress, isAccepted, createdAt, modifiedAt, hubbedUserId, scannedById, outboundConsignmentId) <> (SortationDetailsRow.tupled, SortationDetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), consignmentId, consignmentNumber, barcode, merchant, destinationAddress, isAccepted, createdAt, modifiedAt, hubbedUserId, scannedById, outboundConsignmentId)).shaped.<>({r=>import r._; _1.map(_=> SortationDetailsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))
    /** Database column merchant SqlType(text), Default(None) */
    val merchant: Rep[Option[String]] = column[Option[String]]("merchant", O.Default(None))
    /** Database column destination_address SqlType(text), Default(None) */
    val destinationAddress: Rep[Option[String]] = column[Option[String]]("destination_address", O.Default(None))
    /** Database column is_accepted SqlType(bool), Default(None) */
    val isAccepted: Rep[Option[Boolean]] = column[Option[Boolean]]("is_accepted", O.Default(None))
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
    /** Database column scanned_by_id SqlType(int8), Default(None) */
    val scannedById: Rep[Option[Long]] = column[Option[Long]]("scanned_by_id", O.Default(None))
    /** Database column outbound_consignment_id SqlType(int8), Default(None) */
    val outboundConsignmentId: Rep[Option[Long]] = column[Option[Long]]("outbound_consignment_id", O.Default(None))

    /** Foreign key referencing Consignments (database name fk_consignment_id) */
    lazy val consignmentsFk = foreignKey("fk_consignment_id", consignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SortationDetails */
  lazy val SortationDetails = new TableQuery(tag => new SortationDetails(tag))
}
