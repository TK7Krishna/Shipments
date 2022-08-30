package models
// AUTO-GENERATED Slick data model for table Returnreasons
trait ReturnreasonsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Returnreasons
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param description Database column description SqlType(text), Default(None) */
  case class ReturnreasonsRow(id: Long, description: Option[String] = None)
  /** GetResult implicit for fetching ReturnreasonsRow objects using plain SQL queries */
  implicit def GetResultReturnreasonsRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[ReturnreasonsRow] = GR{
    prs => import prs._
    ReturnreasonsRow.tupled((<<[Long], <<?[String]))
  }
  /** Table description of table returnreasons. Objects of this class serve as prototypes for rows in queries. */
  class Returnreasons(_tableTag: Tag) extends profile.api.Table[ReturnreasonsRow](_tableTag, Some("standard_apis"), "returnreasons") {
    def * = (id, description) <> (ReturnreasonsRow.tupled, ReturnreasonsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), description)).shaped.<>({r=>import r._; _1.map(_=> ReturnreasonsRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
  }
  /** Collection-like TableQuery object for table Returnreasons */
  lazy val Returnreasons = new TableQuery(tag => new Returnreasons(tag))
}
