package models
// AUTO-GENERATED Slick data model for table MobileTutorials
trait MobileTutorialsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table MobileTutorials
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param image Database column image SqlType(text)
   *  @param title Database column title SqlType(text)
   *  @param description Database column description SqlType(text)
   *  @param position Database column position SqlType(int8) */
  case class MobileTutorialsRow(id: Long, image: String, title: String, description: String, position: Long)
  /** GetResult implicit for fetching MobileTutorialsRow objects using plain SQL queries */
  implicit def GetResultMobileTutorialsRow(implicit e0: GR[Long], e1: GR[String]): GR[MobileTutorialsRow] = GR{
    prs => import prs._
    MobileTutorialsRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table mobile_tutorials. Objects of this class serve as prototypes for rows in queries. */
  class MobileTutorials(_tableTag: Tag) extends profile.api.Table[MobileTutorialsRow](_tableTag, "mobile_tutorials") {
    def * = (id, image, title, description, position) <> (MobileTutorialsRow.tupled, MobileTutorialsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(image), Rep.Some(title), Rep.Some(description), Rep.Some(position))).shaped.<>({r=>import r._; _1.map(_=> MobileTutorialsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column image SqlType(text) */
    val image: Rep[String] = column[String]("image")
    /** Database column title SqlType(text) */
    val title: Rep[String] = column[String]("title")
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
    /** Database column position SqlType(int8) */
    val position: Rep[Long] = column[Long]("position")
  }
  /** Collection-like TableQuery object for table MobileTutorials */
  lazy val MobileTutorials = new TableQuery(tag => new MobileTutorials(tag))
}
