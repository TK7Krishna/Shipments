package models
// AUTO-GENERATED Slick data model for table Test
trait TestTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Test
   *  @param id Database column id SqlType(text), Default(None)
   *  @param name Database column name SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(text), Default(None) */
  case class TestRow(id: Option[String] = None, name: Option[String] = None, phone: Option[String] = None)
  /** GetResult implicit for fetching TestRow objects using plain SQL queries */
  implicit def GetResultTestRow(implicit e0: GR[Option[String]]): GR[TestRow] = GR{
    prs => import prs._
    TestRow.tupled((<<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table test. Objects of this class serve as prototypes for rows in queries. */
  class Test(_tableTag: Tag) extends profile.api.Table[TestRow](_tableTag, Some("zoom2u"), "test") {
    def * = (id, name, phone) <> (TestRow.tupled, TestRow.unapply)

    /** Database column id SqlType(text), Default(None) */
    val id: Rep[Option[String]] = column[Option[String]]("id", O.Default(None))
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column phone SqlType(text), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Default(None))
  }
  /** Collection-like TableQuery object for table Test */
  lazy val Test = new TableQuery(tag => new Test(tag))
}
