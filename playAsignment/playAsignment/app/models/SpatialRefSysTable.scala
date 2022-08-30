package models
// AUTO-GENERATED Slick data model for table SpatialRefSys
trait SpatialRefSysTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SpatialRefSys
   *  @param srid Database column srid SqlType(int4), PrimaryKey
   *  @param authName Database column auth_name SqlType(varchar), Length(256,true), Default(None)
   *  @param authSrid Database column auth_srid SqlType(int4), Default(None)
   *  @param srtext Database column srtext SqlType(varchar), Length(2048,true), Default(None)
   *  @param proj4text Database column proj4text SqlType(varchar), Length(2048,true), Default(None) */
  case class SpatialRefSysRow(srid: Int, authName: Option[String] = None, authSrid: Option[Int] = None, srtext: Option[String] = None, proj4text: Option[String] = None)
  /** GetResult implicit for fetching SpatialRefSysRow objects using plain SQL queries */
  implicit def GetResultSpatialRefSysRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]]): GR[SpatialRefSysRow] = GR{
    prs => import prs._
    SpatialRefSysRow.tupled((<<[Int], <<?[String], <<?[Int], <<?[String], <<?[String]))
  }
  /** Table description of table spatial_ref_sys. Objects of this class serve as prototypes for rows in queries. */
  class SpatialRefSys(_tableTag: Tag) extends profile.api.Table[SpatialRefSysRow](_tableTag, "spatial_ref_sys") {
    def * = (srid, authName, authSrid, srtext, proj4text) <> (SpatialRefSysRow.tupled, SpatialRefSysRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(srid), authName, authSrid, srtext, proj4text)).shaped.<>({r=>import r._; _1.map(_=> SpatialRefSysRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column srid SqlType(int4), PrimaryKey */
    val srid: Rep[Int] = column[Int]("srid", O.PrimaryKey)
    /** Database column auth_name SqlType(varchar), Length(256,true), Default(None) */
    val authName: Rep[Option[String]] = column[Option[String]]("auth_name", O.Length(256,varying=true), O.Default(None))
    /** Database column auth_srid SqlType(int4), Default(None) */
    val authSrid: Rep[Option[Int]] = column[Option[Int]]("auth_srid", O.Default(None))
    /** Database column srtext SqlType(varchar), Length(2048,true), Default(None) */
    val srtext: Rep[Option[String]] = column[Option[String]]("srtext", O.Length(2048,varying=true), O.Default(None))
    /** Database column proj4text SqlType(varchar), Length(2048,true), Default(None) */
    val proj4text: Rep[Option[String]] = column[Option[String]]("proj4text", O.Length(2048,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table SpatialRefSys */
  lazy val SpatialRefSys = new TableQuery(tag => new SpatialRefSys(tag))
}
