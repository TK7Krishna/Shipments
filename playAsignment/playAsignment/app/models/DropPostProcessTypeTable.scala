package models
// AUTO-GENERATED Slick data model for table DropPostProcessType
trait DropPostProcessTypeTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DropPostProcessType
   *  @param id Database column id SqlType(int8), PrimaryKey
   *  @param description Database column description SqlType(text) */
  case class DropPostProcessTypeRow(id: Long, description: String)
  /** GetResult implicit for fetching DropPostProcessTypeRow objects using plain SQL queries */
  implicit def GetResultDropPostProcessTypeRow(implicit e0: GR[Long], e1: GR[String]): GR[DropPostProcessTypeRow] = GR{
    prs => import prs._
    DropPostProcessTypeRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table drop_post_process_type. Objects of this class serve as prototypes for rows in queries. */
  class DropPostProcessType(_tableTag: Tag) extends profile.api.Table[DropPostProcessTypeRow](_tableTag, Some("external_online"), "drop_post_process_type") {
    def * = (id, description) <> (DropPostProcessTypeRow.tupled, DropPostProcessTypeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(description))).shaped.<>({r=>import r._; _1.map(_=> DropPostProcessTypeRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int8), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column description SqlType(text) */
    val description: Rep[String] = column[String]("description")
  }
  /** Collection-like TableQuery object for table DropPostProcessType */
  lazy val DropPostProcessType = new TableQuery(tag => new DropPostProcessType(tag))
}
