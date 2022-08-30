package models
// AUTO-GENERATED Slick data model for table TollConfig
trait TollConfigTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollConfig
   *  @param id Database column id SqlType(text), PrimaryKey
   *  @param payload Database column payload SqlType(text) */
  case class TollConfigRow(id: String, payload: String)
  /** GetResult implicit for fetching TollConfigRow objects using plain SQL queries */
  implicit def GetResultTollConfigRow(implicit e0: GR[String]): GR[TollConfigRow] = GR{
    prs => import prs._
    TollConfigRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table toll_config. Objects of this class serve as prototypes for rows in queries. */
  class TollConfig(_tableTag: Tag) extends profile.api.Table[TollConfigRow](_tableTag, Some("seven_eleven"), "toll_config") {
    def * = (id, payload) <> (TollConfigRow.tupled, TollConfigRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(payload))).shaped.<>({r=>import r._; _1.map(_=> TollConfigRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(text), PrimaryKey */
    val id: Rep[String] = column[String]("id", O.PrimaryKey)
    /** Database column payload SqlType(text) */
    val payload: Rep[String] = column[String]("payload")
  }
  /** Collection-like TableQuery object for table TollConfig */
  lazy val TollConfig = new TableQuery(tag => new TollConfig(tag))
}
