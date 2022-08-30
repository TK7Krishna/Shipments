package models
// AUTO-GENERATED Slick data model for table Students
trait StudentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Students
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param studentName Database column student_name SqlType(text), Default(None)
   *  @param isIndian Database column is_indian SqlType(bool)
   *  @param createdAt Database column created_at SqlType(timestamptz), Default(None) */
  case class StudentsRow(id: Long, studentName: Option[String] = None, isIndian: Boolean, createdAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching StudentsRow objects using plain SQL queries */
  implicit def GetResultStudentsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Boolean], e3: GR[Option[java.sql.Timestamp]]): GR[StudentsRow] = GR{
    prs => import prs._
    StudentsRow.tupled((<<[Long], <<?[String], <<[Boolean], <<?[java.sql.Timestamp]))
  }
  /** Table description of table students. Objects of this class serve as prototypes for rows in queries. */
  class Students(_tableTag: Tag) extends profile.api.Table[StudentsRow](_tableTag, Some("ecommerce"), "students") {
    def * = (id, studentName, isIndian, createdAt) <> (StudentsRow.tupled, StudentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), studentName, Rep.Some(isIndian), createdAt)).shaped.<>({r=>import r._; _1.map(_=> StudentsRow.tupled((_1.get, _2, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column student_name SqlType(text), Default(None) */
    val studentName: Rep[Option[String]] = column[Option[String]]("student_name", O.Default(None))
    /** Database column is_indian SqlType(bool) */
    val isIndian: Rep[Boolean] = column[Boolean]("is_indian")
    /** Database column created_at SqlType(timestamptz), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table Students */
  lazy val Students = new TableQuery(tag => new Students(tag))
}
