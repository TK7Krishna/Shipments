package models
// AUTO-GENERATED Slick data model for table InboundTntConsignments
trait InboundTntConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundTntConsignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param storeDlb Database column store_dlb SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text)
   *  @param contactName Database column contact_name SqlType(text), Default(None)
   *  @param receiverName Database column receiver_name SqlType(text), Default(None) */
  case class InboundTntConsignmentsRow(id: Long, storeDlb: String, consignmentNumber: String, contactName: Option[String] = None, receiverName: Option[String] = None)
  /** GetResult implicit for fetching InboundTntConsignmentsRow objects using plain SQL queries */
  implicit def GetResultInboundTntConsignmentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[InboundTntConsignmentsRow] = GR{
    prs => import prs._
    InboundTntConsignmentsRow.tupled((<<[Long], <<[String], <<[String], <<?[String], <<?[String]))
  }
  /** Table description of table inbound_tnt_consignments. Objects of this class serve as prototypes for rows in queries. */
  class InboundTntConsignments(_tableTag: Tag) extends profile.api.Table[InboundTntConsignmentsRow](_tableTag, "inbound_tnt_consignments") {
    def * = (id, storeDlb, consignmentNumber, contactName, receiverName) <> (InboundTntConsignmentsRow.tupled, InboundTntConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(storeDlb), Rep.Some(consignmentNumber), contactName, receiverName)).shaped.<>({r=>import r._; _1.map(_=> InboundTntConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column store_dlb SqlType(text) */
    val storeDlb: Rep[String] = column[String]("store_dlb")
    /** Database column consignment_number SqlType(text) */
    val consignmentNumber: Rep[String] = column[String]("consignment_number")
    /** Database column contact_name SqlType(text), Default(None) */
    val contactName: Rep[Option[String]] = column[Option[String]]("contact_name", O.Default(None))
    /** Database column receiver_name SqlType(text), Default(None) */
    val receiverName: Rep[Option[String]] = column[Option[String]]("receiver_name", O.Default(None))
  }
  /** Collection-like TableQuery object for table InboundTntConsignments */
  lazy val InboundTntConsignments = new TableQuery(tag => new InboundTntConsignments(tag))
}
