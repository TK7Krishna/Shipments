package models
// AUTO-GENERATED Slick data model for table Student
trait StudentTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Student
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text), Default(None)
   *  @param gender Database column gender SqlType(text), Default(None) */
  case class StudentRow(id: Long, name: Option[String] = None, gender: Option[String] = None)
  /** GetResult implicit for fetching StudentRow objects using plain SQL queries */
  implicit def GetResultStudentRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[StudentRow] = GR{
    prs => import prs._
    StudentRow.tupled((<<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table student. Objects of this class serve as prototypes for rows in queries. */
  class Student(_tableTag: Tag) extends profile.api.Table[StudentRow](_tableTag, Some("test"), "student") {
    def * = (id, name, gender) <> (StudentRow.tupled, StudentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name, gender)).shaped.<>({r=>import r._; _1.map(_=> StudentRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column gender SqlType(text), Default(None) */
    val gender: Rep[Option[String]] = column[Option[String]]("gender", O.Default(None))
  }
  /** Collection-like TableQuery object for table Student */
  lazy val Student = new TableQuery(tag => new Student(tag))
}
