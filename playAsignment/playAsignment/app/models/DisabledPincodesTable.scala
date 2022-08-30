package models
// AUTO-GENERATED Slick data model for table DisabledPincodes
trait DisabledPincodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DisabledPincodes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param pin Database column pin SqlType(text), Default(None)
   *  @param location Database column location SqlType(int8), Default(None)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param createdOn Database column created_on SqlType(timestamptz) */
  case class DisabledPincodesRow(id: Long, pin: Option[String] = None, location: Option[Long] = None, consignmentId: Option[Long] = None, createdOn: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching DisabledPincodesRow objects using plain SQL queries */
  implicit def GetResultDisabledPincodesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]]): GR[DisabledPincodesRow] = GR{
    prs => import prs._
    DisabledPincodesRow.tupled((<<[Long], <<?[String], <<?[Long], <<?[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table disabled_pincodes. Objects of this class serve as prototypes for rows in queries. */
  class DisabledPincodes(_tableTag: Tag) extends profile.api.Table[DisabledPincodesRow](_tableTag, "disabled_pincodes") {
    def * = (id, pin, location, consignmentId, createdOn) <> (DisabledPincodesRow.tupled, DisabledPincodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), pin, location, consignmentId, createdOn)).shaped.<>({r=>import r._; _1.map(_=> DisabledPincodesRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column pin SqlType(text), Default(None) */
    val pin: Rep[Option[String]] = column[Option[String]]("pin", O.Default(None))
    /** Database column location SqlType(int8), Default(None) */
    val location: Rep[Option[Long]] = column[Option[Long]]("location", O.Default(None))
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column created_on SqlType(timestamptz) */
    val createdOn: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_on")
  }
  /** Collection-like TableQuery object for table DisabledPincodes */
  lazy val DisabledPincodes = new TableQuery(tag => new DisabledPincodes(tag))
}
