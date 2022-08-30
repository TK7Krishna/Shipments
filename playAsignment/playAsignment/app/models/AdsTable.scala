package models
// AUTO-GENERATED Slick data model for table Ads
trait AdsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Ads
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationid Database column droplocationid SqlType(int8)
   *  @param images Database column images SqlType(text)
   *  @param video Database column video SqlType(text) */
  case class AdsRow(id: Long, droplocationid: Long, images: String, video: String)
  /** GetResult implicit for fetching AdsRow objects using plain SQL queries */
  implicit def GetResultAdsRow(implicit e0: GR[Long], e1: GR[String]): GR[AdsRow] = GR{
    prs => import prs._
    AdsRow.tupled((<<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table ads. Objects of this class serve as prototypes for rows in queries. */
  class Ads(_tableTag: Tag) extends profile.api.Table[AdsRow](_tableTag, "ads") {
    def * = (id, droplocationid, images, video) <> (AdsRow.tupled, AdsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(droplocationid), Rep.Some(images), Rep.Some(video))).shaped.<>({r=>import r._; _1.map(_=> AdsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocationid SqlType(int8) */
    val droplocationid: Rep[Long] = column[Long]("droplocationid")
    /** Database column images SqlType(text) */
    val images: Rep[String] = column[String]("images")
    /** Database column video SqlType(text) */
    val video: Rep[String] = column[String]("video")

    /** Foreign key referencing Droplocations (database name ads_droplocationid_fkey) */
    lazy val droplocationsFk = foreignKey("ads_droplocationid_fkey", droplocationid, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Ads */
  lazy val Ads = new TableQuery(tag => new Ads(tag))
}
