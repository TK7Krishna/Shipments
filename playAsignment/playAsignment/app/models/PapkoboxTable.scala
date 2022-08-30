package models
// AUTO-GENERATED Slick data model for table Papkobox
trait PapkoboxTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Papkobox
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param orderid Database column orderid SqlType(text), Default(None)
   *  @param trackingnumber Database column trackingnumber SqlType(text), Default(None)
   *  @param locationid Database column locationid SqlType(text), Default(None)
   *  @param locationname Database column locationname SqlType(text), Default(None)
   *  @param event Database column event SqlType(text), Default(None)
   *  @param eventtime Database column eventtime SqlType(int8), Default(None)
   *  @param operator Database column operator SqlType(text), Default(None)
   *  @param platform Database column platform SqlType(text), Default(None)
   *  @param remark Database column remark SqlType(text), Default(None)
   *  @param pincode Database column pincode SqlType(text), Default(None)
   *  @param expirytime Database column expirytime SqlType(int8), Default(None)
   *  @param payloadAsJson Database column payload_as_json SqlType(text), Default(None) */
  case class PapkoboxRow(id: Long, orderid: Option[String] = None, trackingnumber: Option[String] = None, locationid: Option[String] = None, locationname: Option[String] = None, event: Option[String] = None, eventtime: Option[Long] = None, operator: Option[String] = None, platform: Option[String] = None, remark: Option[String] = None, pincode: Option[String] = None, expirytime: Option[Long] = None, payloadAsJson: Option[String] = None)
  /** GetResult implicit for fetching PapkoboxRow objects using plain SQL queries */
  implicit def GetResultPapkoboxRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]]): GR[PapkoboxRow] = GR{
    prs => import prs._
    PapkoboxRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String]))
  }
  /** Table description of table papkobox. Objects of this class serve as prototypes for rows in queries. */
  class Papkobox(_tableTag: Tag) extends profile.api.Table[PapkoboxRow](_tableTag, Some("ecommerce"), "papkobox") {
    def * = (id, orderid, trackingnumber, locationid, locationname, event, eventtime, operator, platform, remark, pincode, expirytime, payloadAsJson) <> (PapkoboxRow.tupled, PapkoboxRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), orderid, trackingnumber, locationid, locationname, event, eventtime, operator, platform, remark, pincode, expirytime, payloadAsJson)).shaped.<>({r=>import r._; _1.map(_=> PapkoboxRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column orderid SqlType(text), Default(None) */
    val orderid: Rep[Option[String]] = column[Option[String]]("orderid", O.Default(None))
    /** Database column trackingnumber SqlType(text), Default(None) */
    val trackingnumber: Rep[Option[String]] = column[Option[String]]("trackingnumber", O.Default(None))
    /** Database column locationid SqlType(text), Default(None) */
    val locationid: Rep[Option[String]] = column[Option[String]]("locationid", O.Default(None))
    /** Database column locationname SqlType(text), Default(None) */
    val locationname: Rep[Option[String]] = column[Option[String]]("locationname", O.Default(None))
    /** Database column event SqlType(text), Default(None) */
    val event: Rep[Option[String]] = column[Option[String]]("event", O.Default(None))
    /** Database column eventtime SqlType(int8), Default(None) */
    val eventtime: Rep[Option[Long]] = column[Option[Long]]("eventtime", O.Default(None))
    /** Database column operator SqlType(text), Default(None) */
    val operator: Rep[Option[String]] = column[Option[String]]("operator", O.Default(None))
    /** Database column platform SqlType(text), Default(None) */
    val platform: Rep[Option[String]] = column[Option[String]]("platform", O.Default(None))
    /** Database column remark SqlType(text), Default(None) */
    val remark: Rep[Option[String]] = column[Option[String]]("remark", O.Default(None))
    /** Database column pincode SqlType(text), Default(None) */
    val pincode: Rep[Option[String]] = column[Option[String]]("pincode", O.Default(None))
    /** Database column expirytime SqlType(int8), Default(None) */
    val expirytime: Rep[Option[Long]] = column[Option[Long]]("expirytime", O.Default(None))
    /** Database column payload_as_json SqlType(text), Default(None) */
    val payloadAsJson: Rep[Option[String]] = column[Option[String]]("payload_as_json", O.Default(None))
  }
  /** Collection-like TableQuery object for table Papkobox */
  lazy val Papkobox = new TableQuery(tag => new Papkobox(tag))
}
