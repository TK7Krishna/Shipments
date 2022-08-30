package models
// AUTO-GENERATED Slick data model for table CourierspleasePackageCodes
trait CourierspleasePackageCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CourierspleasePackageCodes
   *  @param code Database column code SqlType(text), PrimaryKey
   *  @param weight Database column weight SqlType(int4)
   *  @param name Database column name SqlType(text) */
  case class CourierspleasePackageCodesRow(code: String, weight: Int, name: String)
  /** GetResult implicit for fetching CourierspleasePackageCodesRow objects using plain SQL queries */
  implicit def GetResultCourierspleasePackageCodesRow(implicit e0: GR[String], e1: GR[Int]): GR[CourierspleasePackageCodesRow] = GR{
    prs => import prs._
    CourierspleasePackageCodesRow.tupled((<<[String], <<[Int], <<[String]))
  }
  /** Table description of table couriersplease_package_codes. Objects of this class serve as prototypes for rows in queries. */
  class CourierspleasePackageCodes(_tableTag: Tag) extends profile.api.Table[CourierspleasePackageCodesRow](_tableTag, "couriersplease_package_codes") {
    def * = (code, weight, name) <> (CourierspleasePackageCodesRow.tupled, CourierspleasePackageCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(code), Rep.Some(weight), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> CourierspleasePackageCodesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column code SqlType(text), PrimaryKey */
    val code: Rep[String] = column[String]("code", O.PrimaryKey)
    /** Database column weight SqlType(int4) */
    val weight: Rep[Int] = column[Int]("weight")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
  }
  /** Collection-like TableQuery object for table CourierspleasePackageCodes */
  lazy val CourierspleasePackageCodes = new TableQuery(tag => new CourierspleasePackageCodes(tag))
}
