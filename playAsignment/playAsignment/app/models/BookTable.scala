package models
// AUTO-GENERATED Slick data model for table Book
trait BookTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Book
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param auther Database column auther SqlType(text), Default(None) */
  case class BookRow(id: Long, name: String, auther: Option[String] = None)
  /** GetResult implicit for fetching BookRow objects using plain SQL queries */
  implicit def GetResultBookRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[BookRow] = GR{
    prs => import prs._
    BookRow.tupled((<<[Long], <<[String], <<?[String]))
  }
  /** Table description of table book. Objects of this class serve as prototypes for rows in queries. */
  class Book(_tableTag: Tag) extends profile.api.Table[BookRow](_tableTag, Some("ecommerce"), "book") {
    def * = (id, name, auther) <> (BookRow.tupled, BookRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), auther)).shaped.<>({r=>import r._; _1.map(_=> BookRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column auther SqlType(text), Default(None) */
    val auther: Rep[Option[String]] = column[Option[String]]("auther", O.Default(None))
  }
  /** Collection-like TableQuery object for table Book */
  lazy val Book = new TableQuery(tag => new Book(tag))
}
