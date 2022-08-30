package models
// AUTO-GENERATED Slick data model for table Images
trait ImagesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Images
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param base64Png Database column base_64_png SqlType(text), Default(None)
   *  @param url Database column url SqlType(text), Default(None)
   *  @param uploadFailedPermanently Database column upload_failed_permanently SqlType(bool), Default(false) */
  case class ImagesRow(id: Long, base64Png: Option[String] = None, url: Option[String] = None, uploadFailedPermanently: Boolean = false)
  /** GetResult implicit for fetching ImagesRow objects using plain SQL queries */
  implicit def GetResultImagesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Boolean]): GR[ImagesRow] = GR{
    prs => import prs._
    ImagesRow.tupled((<<[Long], <<?[String], <<?[String], <<[Boolean]))
  }
  /** Table description of table images. Objects of this class serve as prototypes for rows in queries. */
  class Images(_tableTag: Tag) extends profile.api.Table[ImagesRow](_tableTag, "images") {
    def * = (id, base64Png, url, uploadFailedPermanently) <> (ImagesRow.tupled, ImagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), base64Png, url, Rep.Some(uploadFailedPermanently))).shaped.<>({r=>import r._; _1.map(_=> ImagesRow.tupled((_1.get, _2, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column base_64_png SqlType(text), Default(None) */
    val base64Png: Rep[Option[String]] = column[Option[String]]("base_64_png", O.Default(None))
    /** Database column url SqlType(text), Default(None) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Default(None))
    /** Database column upload_failed_permanently SqlType(bool), Default(false) */
    val uploadFailedPermanently: Rep[Boolean] = column[Boolean]("upload_failed_permanently", O.Default(false))
  }
  /** Collection-like TableQuery object for table Images */
  lazy val Images = new TableQuery(tag => new Images(tag))
}
