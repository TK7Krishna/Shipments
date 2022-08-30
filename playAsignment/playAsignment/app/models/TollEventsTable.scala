package models
// AUTO-GENERATED Slick data model for table TollEvents
trait TollEventsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollEvents
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param eventDiscription Database column event_discription SqlType(text)
   *  @param eventCode Database column event_code SqlType(text) */
  case class TollEventsRow(id: Long, eventDiscription: String, eventCode: String)
  /** GetResult implicit for fetching TollEventsRow objects using plain SQL queries */
  implicit def GetResultTollEventsRow(implicit e0: GR[Long], e1: GR[String]): GR[TollEventsRow] = GR{
    prs => import prs._
    TollEventsRow.tupled((<<[Long], <<[String], <<[String]))
  }
  /** Table description of table toll_events. Objects of this class serve as prototypes for rows in queries. */
  class TollEvents(_tableTag: Tag) extends profile.api.Table[TollEventsRow](_tableTag, Some("seven_eleven"), "toll_events") {
    def * = (id, eventDiscription, eventCode) <> (TollEventsRow.tupled, TollEventsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(eventDiscription), Rep.Some(eventCode))).shaped.<>({r=>import r._; _1.map(_=> TollEventsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column event_discription SqlType(text) */
    val eventDiscription: Rep[String] = column[String]("event_discription")
    /** Database column event_code SqlType(text) */
    val eventCode: Rep[String] = column[String]("event_code")
  }
  /** Collection-like TableQuery object for table TollEvents */
  lazy val TollEvents = new TableQuery(tag => new TollEvents(tag))
}
