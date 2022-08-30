package models
// AUTO-GENERATED Slick data model for table Test123
trait Test123Table {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Test123
   *  @param col1 Database column col1 SqlType(text), Default(None)
   *  @param col2 Database column col2 SqlType(text), Default(None)
   *  @param col3 Database column col3 SqlType(text), Default(None) */
  case class Test123Row(col1: Option[String] = None, col2: Option[String] = None, col3: Option[String] = None)
  /** GetResult implicit for fetching Test123Row objects using plain SQL queries */
  implicit def GetResultTest123Row(implicit e0: GR[Option[String]]): GR[Test123Row] = GR{
    prs => import prs._
    Test123Row.tupled((<<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table test123. Objects of this class serve as prototypes for rows in queries. */
  class Test123(_tableTag: Tag) extends profile.api.Table[Test123Row](_tableTag, "test123") {
    def * = (col1, col2, col3) <> (Test123Row.tupled, Test123Row.unapply)

    /** Database column col1 SqlType(text), Default(None) */
    val col1: Rep[Option[String]] = column[Option[String]]("col1", O.Default(None))
    /** Database column col2 SqlType(text), Default(None) */
    val col2: Rep[Option[String]] = column[Option[String]]("col2", O.Default(None))
    /** Database column col3 SqlType(text), Default(None) */
    val col3: Rep[Option[String]] = column[Option[String]]("col3", O.Default(None))
  }
  /** Collection-like TableQuery object for table Test123 */
  lazy val Test123 = new TableQuery(tag => new Test123(tag))
}
