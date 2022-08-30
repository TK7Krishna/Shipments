package models
// AUTO-GENERATED Slick data model for table PackagingTypes
trait PackagingTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PackagingTypes
   *  @param name Database column name SqlType(text), PrimaryKey */
  case class PackagingTypesRow(name: String)
  /** GetResult implicit for fetching PackagingTypesRow objects using plain SQL queries */
  implicit def GetResultPackagingTypesRow(implicit e0: GR[String]): GR[PackagingTypesRow] = GR{
    prs => import prs._
    PackagingTypesRow(<<[String])
  }
  /** Table description of table packaging_types. Objects of this class serve as prototypes for rows in queries. */
  class PackagingTypes(_tableTag: Tag) extends profile.api.Table[PackagingTypesRow](_tableTag, Some("rate_card"), "packaging_types") {
    def * = name <> (PackagingTypesRow, PackagingTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(name)).shaped.<>(r => r.map(_=> PackagingTypesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(text), PrimaryKey */
    val name: Rep[String] = column[String]("name", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table PackagingTypes */
  lazy val PackagingTypes = new TableQuery(tag => new PackagingTypes(tag))
}
