package models
// AUTO-GENERATED Slick data model for table Categories
trait CategoriesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Categories
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param description Database column description SqlType(text) */
  case class CategoriesRow(id: Long, description: String)
  /** GetResult implicit for fetching CategoriesRow objects using plain SQL queries */
  implicit def GetResultCategoriesRow(implicit e0: GR[Long], e1: GR[String]): GR[CategoriesRow] = GR{
    prs => import prs._
    CategoriesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table categories. Objects of this class serve as prototypes for rows in queries. */
  class Categories(_tableTag: Tag) extends profile.api.Table[CategoriesRow](_tableTag, Some("rate_card"), "categories") {
    def * = (id, description) <> (CategoriesRow.tupled, CategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(description))).shaped.<>({r=>import r._; _1.map(_=> CategoriesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
  }
  /** Collection-like TableQuery object for table Categories */
  lazy val Categories = new TableQuery(tag => new Categories(tag))
}
