package models
// AUTO-GENERATED Slick data model for table Openingdays
trait OpeningdaysTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Openingdays
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text), Default(None) */
  case class OpeningdaysRow(id: Int, name: Option[String] = None)
  /** GetResult implicit for fetching OpeningdaysRow objects using plain SQL queries */
  implicit def GetResultOpeningdaysRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[OpeningdaysRow] = GR{
    prs => import prs._
    OpeningdaysRow.tupled((<<[Int], <<?[String]))
  }
  /** Table description of table openingdays. Objects of this class serve as prototypes for rows in queries. */
  class Openingdays(_tableTag: Tag) extends profile.api.Table[OpeningdaysRow](_tableTag, Some("ecommerce"), "openingdays") {
    def * = (id, name) <> (OpeningdaysRow.tupled, OpeningdaysRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name)).shaped.<>({r=>import r._; _1.map(_=> OpeningdaysRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
  }
  /** Collection-like TableQuery object for table Openingdays */
  lazy val Openingdays = new TableQuery(tag => new Openingdays(tag))
}
