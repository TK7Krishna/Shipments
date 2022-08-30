package models
// AUTO-GENERATED Slick data model for table StgArticles
trait StgArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgArticles
   *  @param stgConsignmentId Database column stg_consignment_id SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param weight Database column weight SqlType(float8)
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey */
  case class StgArticlesRow(stgConsignmentId: Long, barcode: String, weight: Double, id: Long)
  /** GetResult implicit for fetching StgArticlesRow objects using plain SQL queries */
  implicit def GetResultStgArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Double]): GR[StgArticlesRow] = GR{
    prs => import prs._
    StgArticlesRow.tupled((<<[Long], <<[String], <<[Double], <<[Long]))
  }
  /** Table description of table stg_articles. Objects of this class serve as prototypes for rows in queries. */
  class StgArticles(_tableTag: Tag) extends profile.api.Table[StgArticlesRow](_tableTag, Some("seven_eleven"), "stg_articles") {
    def * = (stgConsignmentId, barcode, weight, id) <> (StgArticlesRow.tupled, StgArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(stgConsignmentId), Rep.Some(barcode), Rep.Some(weight), Rep.Some(id))).shaped.<>({r=>import r._; _1.map(_=> StgArticlesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column stg_consignment_id SqlType(int8) */
    val stgConsignmentId: Rep[Long] = column[Long]("stg_consignment_id")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column weight SqlType(float8) */
    val weight: Rep[Double] = column[Double]("weight")
    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)

    /** Uniqueness Index over (barcode) (database name stg_barcode_uniqueconstraint) */
    val index1 = index("stg_barcode_uniqueconstraint", barcode, unique=true)
  }
  /** Collection-like TableQuery object for table StgArticles */
  lazy val StgArticles = new TableQuery(tag => new StgArticles(tag))
}
