package models
// AUTO-GENERATED Slick data model for table TollLocationData
trait TollLocationDataTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollLocationData
   *  @param locationCode Database column location_code SqlType(text), PrimaryKey
   *  @param location Database column location SqlType(int8) */
  case class TollLocationDataRow(locationCode: String, location: Long)
  /** GetResult implicit for fetching TollLocationDataRow objects using plain SQL queries */
  implicit def GetResultTollLocationDataRow(implicit e0: GR[String], e1: GR[Long]): GR[TollLocationDataRow] = GR{
    prs => import prs._
    TollLocationDataRow.tupled((<<[String], <<[Long]))
  }
  /** Table description of table toll_location_data. Objects of this class serve as prototypes for rows in queries. */
  class TollLocationData(_tableTag: Tag) extends profile.api.Table[TollLocationDataRow](_tableTag, "toll_location_data") {
    def * = (locationCode, location) <> (TollLocationDataRow.tupled, TollLocationDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(locationCode), Rep.Some(location))).shaped.<>({r=>import r._; _1.map(_=> TollLocationDataRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column location_code SqlType(text), PrimaryKey */
    val locationCode: Rep[String] = column[String]("location_code", O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")

    /** Foreign key referencing Droplocations (database name toll_location_data_location_fkey) */
    lazy val droplocationsFk = foreignKey("toll_location_data_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TollLocationData */
  lazy val TollLocationData = new TableQuery(tag => new TollLocationData(tag))
}
