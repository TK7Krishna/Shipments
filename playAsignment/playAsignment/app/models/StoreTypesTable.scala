package models
// AUTO-GENERATED Slick data model for table StoreTypes
trait StoreTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StoreTypes
   *  @param name Database column name SqlType(text), PrimaryKey
   *  @param special Database column special SqlType(bool), Default(false) */
  case class StoreTypesRow(name: String, special: Boolean = false)
  /** GetResult implicit for fetching StoreTypesRow objects using plain SQL queries */
  implicit def GetResultStoreTypesRow(implicit e0: GR[String], e1: GR[Boolean]): GR[StoreTypesRow] = GR{
    prs => import prs._
    StoreTypesRow.tupled((<<[String], <<[Boolean]))
  }
  /** Table description of table store_types. Objects of this class serve as prototypes for rows in queries. */
  class StoreTypes(_tableTag: Tag) extends profile.api.Table[StoreTypesRow](_tableTag, "store_types") {
    def * = (name, special) <> (StoreTypesRow.tupled, StoreTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(name), Rep.Some(special))).shaped.<>({r=>import r._; _1.map(_=> StoreTypesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(text), PrimaryKey */
    val name: Rep[String] = column[String]("name", O.PrimaryKey)
    /** Database column special SqlType(bool), Default(false) */
    val special: Rep[Boolean] = column[Boolean]("special", O.Default(false))
  }
  /** Collection-like TableQuery object for table StoreTypes */
  lazy val StoreTypes = new TableQuery(tag => new StoreTypes(tag))
}
