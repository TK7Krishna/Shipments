package models
// AUTO-GENERATED Slick data model for table CpLocationData
trait CpLocationDataTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CpLocationData
   *  @param location Database column location SqlType(int8), PrimaryKey
   *  @param dlb Database column dlb SqlType(text), Default(None)
   *  @param cpSuburb Database column cp_suburb SqlType(text), Default(None)
   *  @param cpState Database column cp_state SqlType(text), Default(None)
   *  @param cpPostcode Database column cp_postcode SqlType(text), Default(None) */
  case class CpLocationDataRow(location: Long, dlb: Option[String] = None, cpSuburb: Option[String] = None, cpState: Option[String] = None, cpPostcode: Option[String] = None)
  /** GetResult implicit for fetching CpLocationDataRow objects using plain SQL queries */
  implicit def GetResultCpLocationDataRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[CpLocationDataRow] = GR{
    prs => import prs._
    CpLocationDataRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table cp_location_data. Objects of this class serve as prototypes for rows in queries. */
  class CpLocationData(_tableTag: Tag) extends profile.api.Table[CpLocationDataRow](_tableTag, "cp_location_data") {
    def * = (location, dlb, cpSuburb, cpState, cpPostcode) <> (CpLocationDataRow.tupled, CpLocationDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(location), dlb, cpSuburb, cpState, cpPostcode)).shaped.<>({r=>import r._; _1.map(_=> CpLocationDataRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column location SqlType(int8), PrimaryKey */
    val location: Rep[Long] = column[Long]("location", O.PrimaryKey)
    /** Database column dlb SqlType(text), Default(None) */
    val dlb: Rep[Option[String]] = column[Option[String]]("dlb", O.Default(None))
    /** Database column cp_suburb SqlType(text), Default(None) */
    val cpSuburb: Rep[Option[String]] = column[Option[String]]("cp_suburb", O.Default(None))
    /** Database column cp_state SqlType(text), Default(None) */
    val cpState: Rep[Option[String]] = column[Option[String]]("cp_state", O.Default(None))
    /** Database column cp_postcode SqlType(text), Default(None) */
    val cpPostcode: Rep[Option[String]] = column[Option[String]]("cp_postcode", O.Default(None))

    /** Foreign key referencing Droplocations (database name cp_location_data_location_fkey) */
    lazy val droplocationsFk = foreignKey("cp_location_data_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (dlb) (database name cp_location_data_dlb_key) */
    val index1 = index("cp_location_data_dlb_key", dlb, unique=true)
  }
  /** Collection-like TableQuery object for table CpLocationData */
  lazy val CpLocationData = new TableQuery(tag => new CpLocationData(tag))
}
