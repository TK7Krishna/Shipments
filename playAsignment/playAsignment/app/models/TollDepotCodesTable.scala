package models
// AUTO-GENERATED Slick data model for table TollDepotCodes
trait TollDepotCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollDepotCodes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param suburb Database column suburb SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param postCode Database column post_code SqlType(text), Default(None)
   *  @param depotCode Database column depot_code SqlType(text), Default(None)
   *  @param chargeZone Database column charge_zone SqlType(text), Default(None)
   *  @param status Database column status SqlType(bool), Default(None)
   *  @param carrierId Database column carrier_id SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None) */
  case class TollDepotCodesRow(id: Long, suburb: Option[String] = None, state: Option[String] = None, postCode: Option[String] = None, depotCode: Option[String] = None, chargeZone: Option[String] = None, status: Option[Boolean] = None, carrierId: Option[String] = None, createdAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching TollDepotCodesRow objects using plain SQL queries */
  implicit def GetResultTollDepotCodesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[Option[java.sql.Timestamp]]): GR[TollDepotCodesRow] = GR{
    prs => import prs._
    TollDepotCodesRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table toll_depot_codes. Objects of this class serve as prototypes for rows in queries. */
  class TollDepotCodes(_tableTag: Tag) extends profile.api.Table[TollDepotCodesRow](_tableTag, "toll_depot_codes") {
    def * = (id, suburb, state, postCode, depotCode, chargeZone, status, carrierId, createdAt) <> (TollDepotCodesRow.tupled, TollDepotCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), suburb, state, postCode, depotCode, chargeZone, status, carrierId, createdAt)).shaped.<>({r=>import r._; _1.map(_=> TollDepotCodesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
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
    /** Database column status SqlType(bool), Default(None) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(None))
    /** Database column carrier_id SqlType(text), Default(None) */
    val carrierId: Rep[Option[String]] = column[Option[String]]("carrier_id", O.Default(None))
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table TollDepotCodes */
  lazy val TollDepotCodes = new TableQuery(tag => new TollDepotCodes(tag))
}
