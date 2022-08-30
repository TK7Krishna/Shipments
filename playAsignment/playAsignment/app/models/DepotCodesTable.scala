package models
// AUTO-GENERATED Slick data model for table DepotCodes
trait DepotCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DepotCodes
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param postcode Database column postcode SqlType(text)
   *  @param depotCode Database column depot_code SqlType(text)
   *  @param depotName Database column depot_name SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param suburbName Database column suburb_name SqlType(text), Default(None) */
  case class DepotCodesRow(id: Long, postcode: String, depotCode: String, depotName: Option[String] = None, state: Option[String] = None, suburbName: Option[String] = None)
  /** GetResult implicit for fetching DepotCodesRow objects using plain SQL queries */
  implicit def GetResultDepotCodesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[DepotCodesRow] = GR{
    prs => import prs._
    DepotCodesRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table depot_codes. Objects of this class serve as prototypes for rows in queries. */
  class DepotCodes(_tableTag: Tag) extends profile.api.Table[DepotCodesRow](_tableTag, Some("seven_eleven"), "depot_codes") {
    def * = (id, postcode, depotCode, depotName, state, suburbName) <> (DepotCodesRow.tupled, DepotCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(postcode), Rep.Some(depotCode), depotName, state, suburbName)).shaped.<>({r=>import r._; _1.map(_=> DepotCodesRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column depot_code SqlType(text) */
    val depotCode: Rep[String] = column[String]("depot_code")
    /** Database column depot_name SqlType(text), Default(None) */
    val depotName: Rep[Option[String]] = column[Option[String]]("depot_name", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column suburb_name SqlType(text), Default(None) */
    val suburbName: Rep[Option[String]] = column[Option[String]]("suburb_name", O.Default(None))
  }
  /** Collection-like TableQuery object for table DepotCodes */
  lazy val DepotCodes = new TableQuery(tag => new DepotCodes(tag))
}
