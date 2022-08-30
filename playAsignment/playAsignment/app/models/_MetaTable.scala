package models
// AUTO-GENERATED Slick data model for table _Meta
trait _MetaTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table _Meta
   *  @param version Database column version SqlType(int4), PrimaryKey
   *  @param ctime Database column ctime SqlType(timestamptz) */
  case class _MetaRow(version: Int, ctime: java.sql.Timestamp)
  /** GetResult implicit for fetching _MetaRow objects using plain SQL queries */
  implicit def GetResult_MetaRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[_MetaRow] = GR{
    prs => import prs._
    _MetaRow.tupled((<<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table _meta. Objects of this class serve as prototypes for rows in queries. */
  class _Meta(_tableTag: Tag) extends profile.api.Table[_MetaRow](_tableTag, "_meta") {
    def * = (version, ctime) <> (_MetaRow.tupled, _MetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(version), Rep.Some(ctime))).shaped.<>({r=>import r._; _1.map(_=> _MetaRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column version SqlType(int4), PrimaryKey */
    val version: Rep[Int] = column[Int]("version", O.PrimaryKey)
    /** Database column ctime SqlType(timestamptz) */
    val ctime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("ctime")
  }
  /** Collection-like TableQuery object for table _Meta */
  lazy val _Meta = new TableQuery(tag => new _Meta(tag))
}
