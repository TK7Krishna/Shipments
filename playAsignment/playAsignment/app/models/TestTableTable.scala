package models
// AUTO-GENERATED Slick data model for table TestTable
trait TestTableTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TestTable
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param ip Database column ip SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None) */
  case class TestTableRow(id: Long, ip: String, createdAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching TestTableRow objects using plain SQL queries */
  implicit def GetResultTestTableRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]]): GR[TestTableRow] = GR{
    prs => import prs._
    TestTableRow.tupled((<<[Long], <<[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table test_table. Objects of this class serve as prototypes for rows in queries. */
  class TestTable(_tableTag: Tag) extends profile.api.Table[TestTableRow](_tableTag, Some("ecommerce"), "test_table") {
    def * = (id, ip, createdAt) <> (TestTableRow.tupled, TestTableRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(ip), createdAt)).shaped.<>({r=>import r._; _1.map(_=> TestTableRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column ip SqlType(text) */
    val ip: Rep[String] = column[String]("ip")
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table TestTable */
  lazy val TestTable = new TableQuery(tag => new TestTable(tag))
}
