package models
// AUTO-GENERATED Slick data model for table TollTrackAndTraceEvents
trait TollTrackAndTraceEventsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollTrackAndTraceEvents
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param scanDate Database column scan_date SqlType(timestamptz)
   *  @param eventCode Database column event_code SqlType(int8)
   *  @param eventDescription Database column event_description SqlType(text), Default(None)
   *  @param reasonCode Database column reason_code SqlType(text), Default(None)
   *  @param itemNumber Database column item_number SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text) */
  case class TollTrackAndTraceEventsRow(id: Long, scanDate: java.sql.Timestamp, eventCode: Long, eventDescription: Option[String] = None, reasonCode: Option[String] = None, itemNumber: String, consignmentNumber: String)
  /** GetResult implicit for fetching TollTrackAndTraceEventsRow objects using plain SQL queries */
  implicit def GetResultTollTrackAndTraceEventsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]], e3: GR[String]): GR[TollTrackAndTraceEventsRow] = GR{
    prs => import prs._
    TollTrackAndTraceEventsRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[Long], <<?[String], <<?[String], <<[String], <<[String]))
  }
  /** Table description of table toll_track_and_trace_events. Objects of this class serve as prototypes for rows in queries. */
  class TollTrackAndTraceEvents(_tableTag: Tag) extends profile.api.Table[TollTrackAndTraceEventsRow](_tableTag, "toll_track_and_trace_events") {
    def * = (id, scanDate, eventCode, eventDescription, reasonCode, itemNumber, consignmentNumber) <> (TollTrackAndTraceEventsRow.tupled, TollTrackAndTraceEventsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(scanDate), Rep.Some(eventCode), eventDescription, reasonCode, Rep.Some(itemNumber), Rep.Some(consignmentNumber))).shaped.<>({r=>import r._; _1.map(_=> TollTrackAndTraceEventsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column scan_date SqlType(timestamptz) */
    val scanDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("scan_date")
    /** Database column event_code SqlType(int8) */
    val eventCode: Rep[Long] = column[Long]("event_code")
    /** Database column event_description SqlType(text), Default(None) */
    val eventDescription: Rep[Option[String]] = column[Option[String]]("event_description", O.Default(None))
    /** Database column reason_code SqlType(text), Default(None) */
    val reasonCode: Rep[Option[String]] = column[Option[String]]("reason_code", O.Default(None))
    /** Database column item_number SqlType(text) */
    val itemNumber: Rep[String] = column[String]("item_number")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")

    /** Index over (consignmentNumber) (database name track_and_trace_consignment_number) */
    val index1 = index("track_and_trace_consignment_number", consignmentNumber)
    /** Index over (itemNumber) (database name track_and_trace_item_number) */
    val index2 = index("track_and_trace_item_number", itemNumber)
  }
  /** Collection-like TableQuery object for table TollTrackAndTraceEvents */
  lazy val TollTrackAndTraceEvents = new TableQuery(tag => new TollTrackAndTraceEvents(tag))
}
