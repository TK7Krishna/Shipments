package models
// AUTO-GENERATED Slick data model for table ConsignmentMissingEvents
trait ConsignmentMissingEventsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ConsignmentMissingEvents
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param location Database column location SqlType(int8)
   *  @param time Database column time SqlType(timestamptz) */
  case class ConsignmentMissingEventsRow(id: Long, consignment: Long, location: Long, time: java.sql.Timestamp)
  /** GetResult implicit for fetching ConsignmentMissingEventsRow objects using plain SQL queries */
  implicit def GetResultConsignmentMissingEventsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp]): GR[ConsignmentMissingEventsRow] = GR{
    prs => import prs._
    ConsignmentMissingEventsRow.tupled((<<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table consignment_missing_events. Objects of this class serve as prototypes for rows in queries. */
  class ConsignmentMissingEvents(_tableTag: Tag) extends profile.api.Table[ConsignmentMissingEventsRow](_tableTag, "consignment_missing_events") {
    def * = (id, consignment, location, time) <> (ConsignmentMissingEventsRow.tupled, ConsignmentMissingEventsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(location), Rep.Some(time))).shaped.<>({r=>import r._; _1.map(_=> ConsignmentMissingEventsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column time SqlType(timestamptz) */
    val time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("time")

    /** Foreign key referencing Consignments (database name consignment_missing_events_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("consignment_missing_events_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name consignment_missing_events_location_fkey) */
    lazy val droplocationsFk = foreignKey("consignment_missing_events_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ConsignmentMissingEvents */
  lazy val ConsignmentMissingEvents = new TableQuery(tag => new ConsignmentMissingEvents(tag))
}
