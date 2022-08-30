package models
// AUTO-GENERATED Slick data model for table DriversBarcodePrefix
trait DriversBarcodePrefixTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DriversBarcodePrefix
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param identifier Database column identifier SqlType(text)
   *  @param courier Database column courier SqlType(text)
   *  @param barcodePrefix Database column barcode_prefix SqlType(text), Default(None)
   *  @param barcodeModel Database column barcode_model SqlType(_text), Length(2147483647,false), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class DriversBarcodePrefixRow(id: Long, identifier: String, courier: String, barcodePrefix: Option[String] = None, barcodeModel: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching DriversBarcodePrefixRow objects using plain SQL queries */
  implicit def GetResultDriversBarcodePrefixRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp]): GR[DriversBarcodePrefixRow] = GR{
    prs => import prs._
    DriversBarcodePrefixRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table drivers_barcode_prefix. Objects of this class serve as prototypes for rows in queries. */
  class DriversBarcodePrefix(_tableTag: Tag) extends profile.api.Table[DriversBarcodePrefixRow](_tableTag, Some("external_online"), "drivers_barcode_prefix") {
    def * = (id, identifier, courier, barcodePrefix, barcodeModel, createdAt) <> (DriversBarcodePrefixRow.tupled, DriversBarcodePrefixRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(identifier), Rep.Some(courier), barcodePrefix, barcodeModel, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> DriversBarcodePrefixRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column identifier SqlType(text) */
    val identifier: Rep[String] = column[String]("identifier")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column barcode_prefix SqlType(text), Default(None) */
    val barcodePrefix: Rep[Option[String]] = column[Option[String]]("barcode_prefix", O.Default(None))
    /** Database column barcode_model SqlType(_text), Length(2147483647,false), Default(None) */
    val barcodeModel: Rep[Option[String]] = column[Option[String]]("barcode_model", O.Length(2147483647,varying=false), O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing AuthorizedDrivers (database name drivers_barcode_prefix_identifier_fkey) */
    lazy val authorizedDriversFk = foreignKey("drivers_barcode_prefix_identifier_fkey", identifier, AuthorizedDrivers)(r => r.identifier, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name drivers_barcode_prefix_courier_fkey) */
    lazy val couriersFk = foreignKey("drivers_barcode_prefix_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DriversBarcodePrefix */
  lazy val DriversBarcodePrefix = new TableQuery(tag => new DriversBarcodePrefix(tag))
}
