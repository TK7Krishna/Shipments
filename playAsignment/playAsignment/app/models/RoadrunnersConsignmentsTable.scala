package models
// AUTO-GENERATED Slick data model for table RoadrunnersConsignments
trait RoadrunnersConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RoadrunnersConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param specialInstructions Database column special_instructions SqlType(text), Default(None)
   *  @param referenceNumber Database column reference_number SqlType(text), Default(None)
   *  @param shippingCode Database column shipping_code SqlType(text)
   *  @param ftpContents Database column ftp_contents SqlType(text), Default(None)
   *  @param ftpFilename Database column ftp_filename SqlType(text), Default(None)
   *  @param ftpCompleteTime Database column ftp_complete_time SqlType(timestamptz), Default(None) */
  case class RoadrunnersConsignmentsRow(id: Long, specialInstructions: Option[String] = None, referenceNumber: Option[String] = None, shippingCode: String, ftpContents: Option[String] = None, ftpFilename: Option[String] = None, ftpCompleteTime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching RoadrunnersConsignmentsRow objects using plain SQL queries */
  implicit def GetResultRoadrunnersConsignmentsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]]): GR[RoadrunnersConsignmentsRow] = GR{
    prs => import prs._
    RoadrunnersConsignmentsRow.tupled((<<[Long], <<?[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table roadrunners_consignments. Objects of this class serve as prototypes for rows in queries. */
  class RoadrunnersConsignments(_tableTag: Tag) extends profile.api.Table[RoadrunnersConsignmentsRow](_tableTag, "roadrunners_consignments") {
    def * = (id, specialInstructions, referenceNumber, shippingCode, ftpContents, ftpFilename, ftpCompleteTime) <> (RoadrunnersConsignmentsRow.tupled, RoadrunnersConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), specialInstructions, referenceNumber, Rep.Some(shippingCode), ftpContents, ftpFilename, ftpCompleteTime)).shaped.<>({r=>import r._; _1.map(_=> RoadrunnersConsignmentsRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column special_instructions SqlType(text), Default(None) */
    val specialInstructions: Rep[Option[String]] = column[Option[String]]("special_instructions", O.Default(None))
    /** Database column reference_number SqlType(text), Default(None) */
    val referenceNumber: Rep[Option[String]] = column[Option[String]]("reference_number", O.Default(None))
    /** Database column shipping_code SqlType(text) */
    val shippingCode: Rep[String] = column[String]("shipping_code")
    /** Database column ftp_contents SqlType(text), Default(None) */
    val ftpContents: Rep[Option[String]] = column[Option[String]]("ftp_contents", O.Default(None))
    /** Database column ftp_filename SqlType(text), Default(None) */
    val ftpFilename: Rep[Option[String]] = column[Option[String]]("ftp_filename", O.Default(None))
    /** Database column ftp_complete_time SqlType(timestamptz), Default(None) */
    val ftpCompleteTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ftp_complete_time", O.Default(None))

    /** Uniqueness Index over (ftpFilename) (database name roadrunners_consignments_ftp_filename_key) */
    val index1 = index("roadrunners_consignments_ftp_filename_key", ftpFilename, unique=true)
  }
  /** Collection-like TableQuery object for table RoadrunnersConsignments */
  lazy val RoadrunnersConsignments = new TableQuery(tag => new RoadrunnersConsignments(tag))
}
