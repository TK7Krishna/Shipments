package models
// AUTO-GENERATED Slick data model for table StgConsignments
trait StgConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param serviceType Database column service_type SqlType(int8)
   *  @param productSize Database column product_size SqlType(text)
   *  @param totalWeight Database column total_weight SqlType(float8)
   *  @param sourcePersonId Database column source_person_id SqlType(int8)
   *  @param destinationPersonId Database column destination_person_id SqlType(int8)
   *  @param bookedLocationId Database column booked_location_id SqlType(int8)
   *  @param dropLocationId Database column drop_location_id SqlType(int8), Default(None)
   *  @param dropTime Database column drop_time SqlType(timestamptz), Default(None)
   *  @param pickupTime Database column pickup_time SqlType(timestamptz), Default(None)
   *  @param status Database column status SqlType(text), Default(None)
   *  @param rateamount Database column rateamount SqlType(float8)
   *  @param ratecode Database column ratecode SqlType(text)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param tollProcessing Database column toll_processing SqlType(bool), Default(Some(false))
   *  @param tollProcessedAt Database column toll_processed_at SqlType(timestamptz)
   *  @param tollRetryCount Database column toll_retry_count SqlType(int4), Default(Some(-1))
   *  @param productType Database column product_type SqlType(text), Default(box)
   *  @param specialInstructions Database column special_instructions SqlType(bool), Default(None)
   *  @param transactionReference Database column transaction_reference SqlType(text), Default(None)
   *  @param dbRatecodeAmount Database column db_ratecode_amount SqlType(float8), Default(None)
   *  @param depotCode Database column depot_code SqlType(text), Default(None)
   *  @param warranty Database column warranty SqlType(text), Default(None)
   *  @param tollEventdatetime Database column toll_eventdatetime SqlType(timestamptz), Default(None) */
  case class StgConsignmentsRow(id: Long, consignmentNumber: String, serviceType: Long, productSize: String, totalWeight: Double, sourcePersonId: Long, destinationPersonId: Long, bookedLocationId: Long, dropLocationId: Option[Long] = None, dropTime: Option[java.sql.Timestamp] = None, pickupTime: Option[java.sql.Timestamp] = None, status: Option[String] = None, rateamount: Double, ratecode: String, modifiedAt: java.sql.Timestamp, createdAt: java.sql.Timestamp, tollProcessing: Option[Boolean] = Some(false), tollProcessedAt: Option[java.sql.Timestamp], tollRetryCount: Option[Int] = Some(-1), productType: String = "box", specialInstructions: Option[Boolean] = None, transactionReference: Option[String] = None, dbRatecodeAmount: Option[Double] = None, depotCode: Option[String] = None, warranty: Option[String] = None, tollEventdatetime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching StgConsignmentsRow objects using plain SQL queries */
  implicit def GetResultStgConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double], e3: GR[Option[Long]], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[String]], e6: GR[java.sql.Timestamp], e7: GR[Option[Boolean]], e8: GR[Option[Int]], e9: GR[Option[Double]]): GR[StgConsignmentsRow] = GR{
    prs => import prs._
    StgConsignmentsRow(<<[Long], <<[String], <<[Long], <<[String], <<[Double], <<[Long], <<[Long], <<[Long], <<?[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<[Double], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[Boolean], <<?[java.sql.Timestamp], <<?[Int], <<[String], <<?[Boolean], <<?[String], <<?[Double], <<?[String], <<?[String], <<?[java.sql.Timestamp])
  }
  /** Table description of table stg_consignments. Objects of this class serve as prototypes for rows in queries. */
  class StgConsignments(_tableTag: Tag) extends profile.api.Table[StgConsignmentsRow](_tableTag, Some("seven_eleven"), "stg_consignments") {
    def * = (id :: consignmentNumber :: serviceType :: productSize :: totalWeight :: sourcePersonId :: destinationPersonId :: bookedLocationId :: dropLocationId :: dropTime :: pickupTime :: status :: rateamount :: ratecode :: modifiedAt :: createdAt :: tollProcessing :: tollProcessedAt :: tollRetryCount :: productType :: specialInstructions :: transactionReference :: dbRatecodeAmount :: depotCode :: warranty :: tollEventdatetime :: HNil).mapTo[StgConsignmentsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(consignmentNumber) :: Rep.Some(serviceType) :: Rep.Some(productSize) :: Rep.Some(totalWeight) :: Rep.Some(sourcePersonId) :: Rep.Some(destinationPersonId) :: Rep.Some(bookedLocationId) :: dropLocationId :: dropTime :: pickupTime :: status :: Rep.Some(rateamount) :: Rep.Some(ratecode) :: Rep.Some(modifiedAt) :: Rep.Some(createdAt) :: tollProcessing :: tollProcessedAt :: tollRetryCount :: Rep.Some(productType) :: specialInstructions :: transactionReference :: dbRatecodeAmount :: depotCode :: warranty :: tollEventdatetime :: HNil).shaped.<>(r => StgConsignmentsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[Long]].get, r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[Double]].get, r(5).asInstanceOf[Option[Long]].get, r(6).asInstanceOf[Option[Long]].get, r(7).asInstanceOf[Option[Long]].get, r(8).asInstanceOf[Option[Long]], r(9).asInstanceOf[Option[java.sql.Timestamp]], r(10).asInstanceOf[Option[java.sql.Timestamp]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[Double]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[java.sql.Timestamp]].get, r(15).asInstanceOf[Option[java.sql.Timestamp]].get, r(16).asInstanceOf[Option[Boolean]], r(17).asInstanceOf[Option[java.sql.Timestamp]], r(18).asInstanceOf[Option[Int]], r(19).asInstanceOf[Option[String]].get, r(20).asInstanceOf[Option[Boolean]], r(21).asInstanceOf[Option[String]], r(22).asInstanceOf[Option[Double]], r(23).asInstanceOf[Option[String]], r(24).asInstanceOf[Option[String]], r(25).asInstanceOf[Option[java.sql.Timestamp]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column service_type SqlType(int8) */
    val serviceType: Rep[Long] = column[Long]("service_type")
    /** Database column product_size SqlType(text) */
    val productSize: Rep[String] = column[String]("product_size")
    /** Database column total_weight SqlType(float8) */
    val totalWeight: Rep[Double] = column[Double]("total_weight")
    /** Database column source_person_id SqlType(int8) */
    val sourcePersonId: Rep[Long] = column[Long]("source_person_id")
    /** Database column destination_person_id SqlType(int8) */
    val destinationPersonId: Rep[Long] = column[Long]("destination_person_id")
    /** Database column booked_location_id SqlType(int8) */
    val bookedLocationId: Rep[Long] = column[Long]("booked_location_id")
    /** Database column drop_location_id SqlType(int8), Default(None) */
    val dropLocationId: Rep[Option[Long]] = column[Option[Long]]("drop_location_id", O.Default(None))
    /** Database column drop_time SqlType(timestamptz), Default(None) */
    val dropTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("drop_time", O.Default(None))
    /** Database column pickup_time SqlType(timestamptz), Default(None) */
    val pickupTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("pickup_time", O.Default(None))
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column rateamount SqlType(float8) */
    val rateamount: Rep[Double] = column[Double]("rateamount")
    /** Database column ratecode SqlType(text) */
    val ratecode: Rep[String] = column[String]("ratecode")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column toll_processing SqlType(bool), Default(Some(false)) */
    val tollProcessing: Rep[Option[Boolean]] = column[Option[Boolean]]("toll_processing", O.Default(Some(false)))
    /** Database column toll_processed_at SqlType(timestamptz) */
    val tollProcessedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("toll_processed_at")
    /** Database column toll_retry_count SqlType(int4), Default(Some(-1)) */
    val tollRetryCount: Rep[Option[Int]] = column[Option[Int]]("toll_retry_count", O.Default(Some(-1)))
    /** Database column product_type SqlType(text), Default(box) */
    val productType: Rep[String] = column[String]("product_type", O.Default("box"))
    /** Database column special_instructions SqlType(bool), Default(None) */
    val specialInstructions: Rep[Option[Boolean]] = column[Option[Boolean]]("special_instructions", O.Default(None))
    /** Database column transaction_reference SqlType(text), Default(None) */
    val transactionReference: Rep[Option[String]] = column[Option[String]]("transaction_reference", O.Default(None))
    /** Database column db_ratecode_amount SqlType(float8), Default(None) */
    val dbRatecodeAmount: Rep[Option[Double]] = column[Option[Double]]("db_ratecode_amount", O.Default(None))
    /** Database column depot_code SqlType(text), Default(None) */
    val depotCode: Rep[Option[String]] = column[Option[String]]("depot_code", O.Default(None))
    /** Database column warranty SqlType(text), Default(None) */
    val warranty: Rep[Option[String]] = column[Option[String]]("warranty", O.Default(None))
    /** Database column toll_eventdatetime SqlType(timestamptz), Default(None) */
    val tollEventdatetime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("toll_eventdatetime", O.Default(None))

    /** Uniqueness Index over (consignmentNumber) (database name consignment_number_uniqueconstraint) */
    val index1 = index("consignment_number_uniqueconstraint", consignmentNumber :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table StgConsignments */
  lazy val StgConsignments = new TableQuery(tag => new StgConsignments(tag))
}
