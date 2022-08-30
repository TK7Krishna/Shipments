package models
// AUTO-GENERATED Slick data model for table Droplocationabilitiesjoin
trait DroplocationabilitiesjoinTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Droplocationabilitiesjoin
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationid Database column droplocationid SqlType(int8)
   *  @param droplocationabilityid Database column droplocationabilityid SqlType(int8) */
  case class DroplocationabilitiesjoinRow(id: Long, droplocationid: Long, droplocationabilityid: Long)
  /** GetResult implicit for fetching DroplocationabilitiesjoinRow objects using plain SQL queries */
  implicit def GetResultDroplocationabilitiesjoinRow(implicit e0: GR[Long]): GR[DroplocationabilitiesjoinRow] = GR{
    prs => import prs._
    DroplocationabilitiesjoinRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table droplocationabilitiesjoin. Objects of this class serve as prototypes for rows in queries. */
  class Droplocationabilitiesjoin(_tableTag: Tag) extends profile.api.Table[DroplocationabilitiesjoinRow](_tableTag, "droplocationabilitiesjoin") {
    def * = (id, droplocationid, droplocationabilityid) <> (DroplocationabilitiesjoinRow.tupled, DroplocationabilitiesjoinRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(droplocationid), Rep.Some(droplocationabilityid))).shaped.<>({r=>import r._; _1.map(_=> DroplocationabilitiesjoinRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocationid SqlType(int8) */
    val droplocationid: Rep[Long] = column[Long]("droplocationid")
    /** Database column droplocationabilityid SqlType(int8) */
    val droplocationabilityid: Rep[Long] = column[Long]("droplocationabilityid")

    /** Foreign key referencing Droplocationabilities (database name droplocationabilitiesjoin_droplocationabilityid_fkey) */
    lazy val droplocationabilitiesFk = foreignKey("droplocationabilitiesjoin_droplocationabilityid_fkey", droplocationabilityid, Droplocationabilities)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name droplocationabilitiesjoin_droplocationid_fkey) */
    lazy val droplocationsFk = foreignKey("droplocationabilitiesjoin_droplocationid_fkey", droplocationid, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Droplocationabilitiesjoin */
  lazy val Droplocationabilitiesjoin = new TableQuery(tag => new Droplocationabilitiesjoin(tag))
}
