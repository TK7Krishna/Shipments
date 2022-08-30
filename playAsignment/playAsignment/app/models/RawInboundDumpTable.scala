package models
// AUTO-GENERATED Slick data model for table RawInboundDump
trait RawInboundDumpTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RawInboundDump
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param body Database column body SqlType(text)
   *  @param time Database column time SqlType(timestamptz)
   *  @param forwarded Database column forwarded SqlType(timestamptz) */
  case class RawInboundDumpRow(id: Long, body: String, time: java.sql.Timestamp, forwarded: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching RawInboundDumpRow objects using plain SQL queries */
  implicit def GetResultRawInboundDumpRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[RawInboundDumpRow] = GR{
    prs => import prs._
    RawInboundDumpRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table raw_inbound_dump. Objects of this class serve as prototypes for rows in queries. */
  class RawInboundDump(_tableTag: Tag) extends profile.api.Table[RawInboundDumpRow](_tableTag, "raw_inbound_dump") {
    def * = (id, body, time, forwarded) <> (RawInboundDumpRow.tupled, RawInboundDumpRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(body), Rep.Some(time), forwarded)).shaped.<>({r=>import r._; _1.map(_=> RawInboundDumpRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column body SqlType(text) */
    val body: Rep[String] = column[String]("body")
    /** Database column time SqlType(timestamptz) */
    val time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("time")
    /** Database column forwarded SqlType(timestamptz) */
    val forwarded: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("forwarded")
  }
  /** Collection-like TableQuery object for table RawInboundDump */
  lazy val RawInboundDump = new TableQuery(tag => new RawInboundDump(tag))
}
