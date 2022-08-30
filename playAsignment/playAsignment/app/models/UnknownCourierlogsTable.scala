package models
// AUTO-GENERATED Slick data model for table UnknownCourierlogs
trait UnknownCourierlogsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UnknownCourierlogs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentnumber Database column consignmentnumber SqlType(text)
   *  @param discription Database column discription SqlType(text), Default(None)
   *  @param webhookstatus Database column webhookstatus SqlType(bool), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param eventid Database column eventid SqlType(int8), Default(None) */
  case class UnknownCourierlogsRow(id: Long, consignmentnumber: String, discription: Option[String] = None, webhookstatus: Option[Boolean] = None, createdAt: java.sql.Timestamp, eventid: Option[Long] = None)
  /** GetResult implicit for fetching UnknownCourierlogsRow objects using plain SQL queries */
  implicit def GetResultUnknownCourierlogsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[java.sql.Timestamp], e5: GR[Option[Long]]): GR[UnknownCourierlogsRow] = GR{
    prs => import prs._
    UnknownCourierlogsRow.tupled((<<[Long], <<[String], <<?[String], <<?[Boolean], <<[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table unknown_courierlogs. Objects of this class serve as prototypes for rows in queries. */
  class UnknownCourierlogs(_tableTag: Tag) extends profile.api.Table[UnknownCourierlogsRow](_tableTag, Some("ecommerce"), "unknown_courierlogs") {
    def * = (id, consignmentnumber, discription, webhookstatus, createdAt, eventid) <> (UnknownCourierlogsRow.tupled, UnknownCourierlogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentnumber), discription, webhookstatus, Rep.Some(createdAt), eventid)).shaped.<>({r=>import r._; _1.map(_=> UnknownCourierlogsRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentnumber SqlType(text) */
    val consignmentnumber: Rep[String] = column[String]("consignmentnumber")
    /** Database column discription SqlType(text), Default(None) */
    val discription: Rep[Option[String]] = column[Option[String]]("discription", O.Default(None))
    /** Database column webhookstatus SqlType(bool), Default(None) */
    val webhookstatus: Rep[Option[Boolean]] = column[Option[Boolean]]("webhookstatus", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column eventid SqlType(int8), Default(None) */
    val eventid: Rep[Option[Long]] = column[Option[Long]]("eventid", O.Default(None))
  }
  /** Collection-like TableQuery object for table UnknownCourierlogs */
  lazy val UnknownCourierlogs = new TableQuery(tag => new UnknownCourierlogs(tag))
}
