package models
// AUTO-GENERATED Slick data model for table BarcodeValidations
trait BarcodeValidationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BarcodeValidations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text)
   *  @param regex Database column regex SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param active Database column active SqlType(bool), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class BarcodeValidationsRow(id: Long, courierCode: String, regex: Option[String] = None, createdAt: java.sql.Timestamp, active: Option[Boolean] = None, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching BarcodeValidationsRow objects using plain SQL queries */
  implicit def GetResultBarcodeValidationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[Option[Boolean]], e5: GR[Option[java.sql.Timestamp]]): GR[BarcodeValidationsRow] = GR{
    prs => import prs._
    BarcodeValidationsRow.tupled((<<[Long], <<[String], <<?[String], <<[java.sql.Timestamp], <<?[Boolean], <<?[java.sql.Timestamp]))
  }
  /** Table description of table barcode_validations. Objects of this class serve as prototypes for rows in queries. */
  class BarcodeValidations(_tableTag: Tag) extends profile.api.Table[BarcodeValidationsRow](_tableTag, Some("seven_eleven"), "barcode_validations") {
    def * = (id, courierCode, regex, createdAt, active, modifiedAt) <> (BarcodeValidationsRow.tupled, BarcodeValidationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courierCode), regex, Rep.Some(createdAt), active, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> BarcodeValidationsRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")
    /** Database column regex SqlType(text), Default(None) */
    val regex: Rep[Option[String]] = column[Option[String]]("regex", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column active SqlType(bool), Default(None) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(None))
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table BarcodeValidations */
  lazy val BarcodeValidations = new TableQuery(tag => new BarcodeValidations(tag))
}
