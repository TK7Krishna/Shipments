package models
// AUTO-GENERATED Slick data model for table InternationalShipmentLabelRequests
trait InternationalShipmentLabelRequestsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalShipmentLabelRequests
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentCode Database column consignment_code SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class InternationalShipmentLabelRequestsRow(id: Long, consignmentCode: String, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching InternationalShipmentLabelRequestsRow objects using plain SQL queries */
  implicit def GetResultInternationalShipmentLabelRequestsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[InternationalShipmentLabelRequestsRow] = GR{
    prs => import prs._
    InternationalShipmentLabelRequestsRow.tupled((<<[Long], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table international_shipment_label_requests. Objects of this class serve as prototypes for rows in queries. */
  class InternationalShipmentLabelRequests(_tableTag: Tag) extends profile.api.Table[InternationalShipmentLabelRequestsRow](_tableTag, Some("cpapi"), "international_shipment_label_requests") {
    def * = (id, consignmentCode, createdAt) <> (InternationalShipmentLabelRequestsRow.tupled, InternationalShipmentLabelRequestsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentCode), Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> InternationalShipmentLabelRequestsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_code SqlType(text) */
    val consignmentCode: Rep[String] = column[String]("consignment_code")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table InternationalShipmentLabelRequests */
  lazy val InternationalShipmentLabelRequests = new TableQuery(tag => new InternationalShipmentLabelRequests(tag))
}
