package models
// AUTO-GENERATED Slick data model for table ObservedBarcodes
trait ObservedBarcodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ObservedBarcodes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param observedArticle Database column observed_article SqlType(int8)
   *  @param barcode Database column barcode SqlType(text) */
  case class ObservedBarcodesRow(id: Long, observedArticle: Long, barcode: String)
  /** GetResult implicit for fetching ObservedBarcodesRow objects using plain SQL queries */
  implicit def GetResultObservedBarcodesRow(implicit e0: GR[Long], e1: GR[String]): GR[ObservedBarcodesRow] = GR{
    prs => import prs._
    ObservedBarcodesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table observed_barcodes. Objects of this class serve as prototypes for rows in queries. */
  class ObservedBarcodes(_tableTag: Tag) extends profile.api.Table[ObservedBarcodesRow](_tableTag, "observed_barcodes") {
    def * = (id, observedArticle, barcode) <> (ObservedBarcodesRow.tupled, ObservedBarcodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(observedArticle), Rep.Some(barcode))).shaped.<>({r=>import r._; _1.map(_=> ObservedBarcodesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column observed_article SqlType(int8) */
    val observedArticle: Rep[Long] = column[Long]("observed_article")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")

    /** Foreign key referencing ObservedArticles (database name observed_barcodes_observed_article_fkey) */
    lazy val observedArticlesFk = foreignKey("observed_barcodes_observed_article_fkey", observedArticle, ObservedArticles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ObservedBarcodes */
  lazy val ObservedBarcodes = new TableQuery(tag => new ObservedBarcodes(tag))
}
