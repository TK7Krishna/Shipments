package models
// AUTO-GENERATED Slick data model for table CategoryModifiers
trait CategoryModifiersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CategoryModifiers
   *  @param category Database column category SqlType(int8), PrimaryKey
   *  @param delta Database column delta SqlType(int4)
   *  @param kgDelta Database column kg_delta SqlType(int4) */
  case class CategoryModifiersRow(category: Long, delta: Int, kgDelta: Int)
  /** GetResult implicit for fetching CategoryModifiersRow objects using plain SQL queries */
  implicit def GetResultCategoryModifiersRow(implicit e0: GR[Long], e1: GR[Int]): GR[CategoryModifiersRow] = GR{
    prs => import prs._
    CategoryModifiersRow.tupled((<<[Long], <<[Int], <<[Int]))
  }
  /** Table description of table category_modifiers. Objects of this class serve as prototypes for rows in queries. */
  class CategoryModifiers(_tableTag: Tag) extends profile.api.Table[CategoryModifiersRow](_tableTag, Some("rate_admin"), "category_modifiers") {
    def * = (category, delta, kgDelta) <> (CategoryModifiersRow.tupled, CategoryModifiersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(category), Rep.Some(delta), Rep.Some(kgDelta))).shaped.<>({r=>import r._; _1.map(_=> CategoryModifiersRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column category SqlType(int8), PrimaryKey */
    val category: Rep[Long] = column[Long]("category", O.PrimaryKey)
    /** Database column delta SqlType(int4) */
    val delta: Rep[Int] = column[Int]("delta")
    /** Database column kg_delta SqlType(int4) */
    val kgDelta: Rep[Int] = column[Int]("kg_delta")

    /** Foreign key referencing Categories (database name category_modifiers_category_fkey) */
    lazy val categoriesFk = foreignKey("category_modifiers_category_fkey", category, Categories)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CategoryModifiers */
  lazy val CategoryModifiers = new TableQuery(tag => new CategoryModifiers(tag))
}
