package models
// AUTO-GENERATED Slick data model for table ConsignmentKeepEvents
trait ConsignmentKeepEventsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentKeepEvents
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param location Database column location SqlType(int8)
   *  @param time Database column time SqlType(timestamptz) */
  case class ConsignmentKeepEventsRow(id: Long, consignment: Long, location: Long, time: java.sql.Timestamp)
  /** GetResult implicit for fetching ConsignmentKeepEventsRow objects using plain SQL queries */
  implicit def GetResultConsignmentKeepEventsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp]): GR[ConsignmentKeepEventsRow] = GR{
    prs => import prs._
    ConsignmentKeepEventsRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table consignment_keep_events. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentKeepEvents(_tableTag: Tag) extends profile.api.Table[ConsignmentKeepEventsRow](_tableTag, "consignment_keep_events") {
    def * = (id, consignment, location, time) <> (ConsignmentKeepEventsRow.tupled, ConsignmentKeepEventsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(location), Rep.Some(time))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentKeepEventsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column time SqlType(timestamptz) */
    val time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("time")

    /** Foreign key referencing Consignments (database name consignment_keep_events_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_keep_events_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name consignment_keep_events_location_fkey) */
    lazy val droplocationsFk = foreignKey("consignment_keep_events_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentKeepEvents */
  lazy val ConsignmentKeepEvents = new TableQuery(tag => new ConsignmentKeepEvents(tag))
}
