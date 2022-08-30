package models
// AUTO-GENERATED Slick data model for table TransactionCommissions
trait TransactionCommissionsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionCommissions
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text)
   *  @param courierName Database column courier_name SqlType(text)
   *  @param inboundHubbed Database column inbound_hubbed SqlType(int4), Default(None)
   *  @param inboundAgent Database column inbound_agent SqlType(int4), Default(None)
   *  @param ouboundHubbed Database column oubound_hubbed SqlType(int4), Default(None)
   *  @param ouboundAgent Database column oubound_agent SqlType(int4), Default(None) */
  case class TransactionCommissionsRow(id: Long, courierCode: String, courierName: String, inboundHubbed: Option[Int] = None, inboundAgent: Option[Int] = None, ouboundHubbed: Option[Int] = None, ouboundAgent: Option[Int] = None)
  /** GetResult implicit for fetching TransactionCommissionsRow objects using plain SQL queries */
  implicit def GetResultTransactionCommissionsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Int]]): GR[TransactionCommissionsRow] = GR{
    prs => import prs._
    TransactionCommissionsRow.tupled((<<[Long], <<[String], <<[String], <<?[Int], <<?[Int], <<?[Int], <<?[Int]))
  }
  /** Table description of table transaction_commissions. Objects of this class serve as prototypes for rows in queries. */
  class TransactionCommissions(_tableTag: Tag) extends profile.api.Table[TransactionCommissionsRow](_tableTag, "transaction_commissions") {
    def * = (id, courierCode, courierName, inboundHubbed, inboundAgent, ouboundHubbed, ouboundAgent) <> (TransactionCommissionsRow.tupled, TransactionCommissionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courierCode), Rep.Some(courierName), inboundHubbed, inboundAgent, ouboundHubbed, ouboundAgent)).shaped.<>({r=>import r._; _1.map(_=> TransactionCommissionsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")
    /** Database column courier_name SqlType(text) */
    val courierName: Rep[String] = column[String]("courier_name")
    /** Database column inbound_hubbed SqlType(int4), Default(None) */
    val inboundHubbed: Rep[Option[Int]] = column[Option[Int]]("inbound_hubbed", O.Default(None))
    /** Database column inbound_agent SqlType(int4), Default(None) */
    val inboundAgent: Rep[Option[Int]] = column[Option[Int]]("inbound_agent", O.Default(None))
    /** Database column oubound_hubbed SqlType(int4), Default(None) */
    val ouboundHubbed: Rep[Option[Int]] = column[Option[Int]]("oubound_hubbed", O.Default(None))
    /** Database column oubound_agent SqlType(int4), Default(None) */
    val ouboundAgent: Rep[Option[Int]] = column[Option[Int]]("oubound_agent", O.Default(None))
  }
  /** Collection-like TableQuery object for table TransactionCommissions */
  lazy val TransactionCommissions = new TableQuery(tag => new TransactionCommissions(tag))
}
