package models
// AUTO-GENERATED Slick data model for table IpecDepotCodes
trait IpecDepotCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table IpecDepotCodes
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param suburb Database column suburb SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param postCode Database column post_code SqlType(text), Default(None)
   *  @param depotCode Database column depot_code SqlType(text), Default(None)
   *  @param chargeZone Database column charge_zone SqlType(text), Default(None)
   *  @param status Database column status SqlType(bool), Default(Some(true))
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class IpecDepotCodesRow(id: Long, suburb: Option[String] = None, state: Option[String] = None, postCode: Option[String] = None, depotCode: Option[String] = None, chargeZone: Option[String] = None, status: Option[Boolean] = Some(true), createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching IpecDepotCodesRow objects using plain SQL queries */
  implicit def GetResultIpecDepotCodesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp]): GR[IpecDepotCodesRow] = GR{
    prs => import prs._
    IpecDepotCodesRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table ipec_depot_codes. Objects of this class serve as prototypes for rows in queries. */
  class IpecDepotCodes(_tableTag: Tag) extends profile.api.Table[IpecDepotCodesRow](_tableTag, "ipec_depot_codes") {
    def * = (id, suburb, state, postCode, depotCode, chargeZone, status, createdAt) <> (IpecDepotCodesRow.tupled, IpecDepotCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), suburb, state, postCode, depotCode, chargeZone, status, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> IpecDepotCodesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column suburb SqlType(text), Default(None) */
    val suburb: Rep[Option[String]] = column[Option[String]]("suburb", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column post_code SqlType(text), Default(None) */
    val postCode: Rep[Option[String]] = column[Option[String]]("post_code", O.Default(None))
    /** Database column depot_code SqlType(text), Default(None) */
    val depotCode: Rep[Option[String]] = column[Option[String]]("depot_code", O.Default(None))
    /** Database column charge_zone SqlType(text), Default(None) */
    val chargeZone: Rep[Option[String]] = column[Option[String]]("charge_zone", O.Default(None))
    /** Database column status SqlType(bool), Default(Some(true)) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(Some(true)))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table IpecDepotCodes */
  lazy val IpecDepotCodes = new TableQuery(tag => new IpecDepotCodes(tag))
}
