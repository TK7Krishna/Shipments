package models
// AUTO-GENERATED Slick data model for table CourierspleaseConsignments
trait CourierspleaseConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleaseConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param `type` Database column type SqlType(text)
   *  @param specialInstructions Database column special_instructions SqlType(text), Default(None)
   *  @param referenceNumber Database column reference_number SqlType(text), Default(None)
   *  @param shippingCode Database column shipping_code SqlType(text)
   *  @param ftpContents Database column ftp_contents SqlType(text), Default(None)
   *  @param ftpFilename Database column ftp_filename SqlType(text), Default(None)
   *  @param ftpCompleteTime Database column ftp_complete_time SqlType(timestamptz), Default(None)
   *  @param subcontractorEmail Database column subcontractor_email SqlType(text), Default(None)
   *  @param subcontractorEmailSent Database column subcontractor_email_sent SqlType(timestamptz), Default(None) */
  case class CourierspleaseConsignmentsRow(id: Long, `type`: String, specialInstructions: Option[String] = None, referenceNumber: Option[String] = None, shippingCode: String, ftpContents: Option[String] = None, ftpFilename: Option[String] = None, ftpCompleteTime: Option[java.sql.Timestamp] = None, subcontractorEmail: Option[String] = None, subcontractorEmailSent: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching CourierspleaseConsignmentsRow objects using plain SQL queries */
  implicit def GetResultCourierspleaseConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[CourierspleaseConsignmentsRow] = GR{
    prs => import prs._
    CourierspleaseConsignmentsRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table couriersplease_consignments. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class CourierspleaseConsignments(_tableTag: Tag) extends profile.api.Table[CourierspleaseConsignmentsRow](_tableTag, "couriersplease_consignments") {
    def * = (id, `type`, specialInstructions, referenceNumber, shippingCode, ftpContents, ftpFilename, ftpCompleteTime, subcontractorEmail, subcontractorEmailSent) <> (CourierspleaseConsignmentsRow.tupled, CourierspleaseConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(`type`), specialInstructions, referenceNumber, Rep.Some(shippingCode), ftpContents, ftpFilename, ftpCompleteTime, subcontractorEmail, subcontractorEmailSent)).shaped.<>({r=>import r._; _1.map(_=> CourierspleaseConsignmentsRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column type SqlType(text)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type")
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
    /** Database column subcontractor_email SqlType(text), Default(None) */
    val subcontractorEmail: Rep[Option[String]] = column[Option[String]]("subcontractor_email", O.Default(None))
    /** Database column subcontractor_email_sent SqlType(timestamptz), Default(None) */
    val subcontractorEmailSent: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("subcontractor_email_sent", O.Default(None))

    /** Uniqueness Index over (ftpFilename) (database name couriersplease_consignments_ftp_filename_key) */
    val index1 = index("couriersplease_consignments_ftp_filename_key", ftpFilename, unique=true)
  }
  /** Collection-like TableQuery object for table CourierspleaseConsignments */
  lazy val CourierspleaseConsignments = new TableQuery(tag => new CourierspleaseConsignments(tag))
}
