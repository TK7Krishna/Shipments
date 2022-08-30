package models
// AUTO-GENERATED Slick data model for table Droplocationabilities
trait DroplocationabilitiesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Droplocationabilities
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text) */
  case class DroplocationabilitiesRow(id: Long, name: String)
  /** GetResult implicit for fetching DroplocationabilitiesRow objects using plain SQL queries */
  implicit def GetResultDroplocationabilitiesRow(implicit e0: GR[Long], e1: GR[String]): GR[DroplocationabilitiesRow] = GR{
    prs => import prs._
    DroplocationabilitiesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table droplocationabilities. Objects of this class serve as prototypes for rows in queries. */
  class Droplocationabilities(_tableTag: Tag) extends profile.api.Table[DroplocationabilitiesRow](_tableTag, "droplocationabilities") {
    def * = (id, name) <> (DroplocationabilitiesRow.tupled, DroplocationabilitiesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> DroplocationabilitiesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table Droplocationabilities */
  lazy val Droplocationabilities = new TableQuery(tag => new Droplocationabilities(tag))
}
