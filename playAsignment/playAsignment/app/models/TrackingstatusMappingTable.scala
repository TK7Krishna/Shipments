package models
// AUTO-GENERATED Slick data model for table TrackingstatusMapping
trait TrackingstatusMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TrackingstatusMapping
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param status Database column status SqlType(text), Default(None)
   *  @param mapStatus Database column map_status SqlType(text), Default(None)
   *  @param statuscode Database column statuscode SqlType(text), Default(None) */
  case class TrackingstatusMappingRow(id: Int, status: Option[String] = None, mapStatus: Option[String] = None, statuscode: Option[String] = None)
  /** GetResult implicit for fetching TrackingstatusMappingRow objects using plain SQL queries */
  implicit def GetResultTrackingstatusMappingRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[TrackingstatusMappingRow] = GR{
    prs => import prs._
    TrackingstatusMappingRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table trackingstatus_mapping. Objects of this class serve as prototypes for rows in queries. */
  class TrackingstatusMapping(_tableTag: Tag) extends profile.api.Table[TrackingstatusMappingRow](_tableTag, Some("standard_apis"), "trackingstatus_mapping") {
    def * = (id, status, mapStatus, statuscode) <> (TrackingstatusMappingRow.tupled, TrackingstatusMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), status, mapStatus, statuscode)).shaped.<>({r=>import r._; _1.map(_=> TrackingstatusMappingRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column status SqlType(text), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column map_status SqlType(text), Default(None) */
    val mapStatus: Rep[Option[String]] = column[Option[String]]("map_status", O.Default(None))
    /** Database column statuscode SqlType(text), Default(None) */
    val statuscode: Rep[Option[String]] = column[Option[String]]("statuscode", O.Default(None))
  }
  /** Collection-like TableQuery object for table TrackingstatusMapping */
  lazy val TrackingstatusMapping = new TableQuery(tag => new TrackingstatusMapping(tag))
}
