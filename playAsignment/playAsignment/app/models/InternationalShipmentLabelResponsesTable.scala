package models
// AUTO-GENERATED Slick data model for table InternationalShipmentLabelResponses
trait InternationalShipmentLabelResponsesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalShipmentLabelResponses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param request Database column request SqlType(int8)
   *  @param httpStatus Database column http_status SqlType(int4)
   *  @param responseCode Database column response_code SqlType(text), Default(None)
   *  @param msg Database column msg SqlType(text), Default(None) */
  case class InternationalShipmentLabelResponsesRow(id: Long, request: Long, httpStatus: Int, responseCode: Option[String] = None, msg: Option[String] = None)
  /** GetResult implicit for fetching InternationalShipmentLabelResponsesRow objects using plain SQL queries */
  implicit def GetResultInternationalShipmentLabelResponsesRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[Option[String]]): GR[InternationalShipmentLabelResponsesRow] = GR{
    prs => import prs._
    InternationalShipmentLabelResponsesRow.tupled((<<[Long], <<[Long], <<[Int], <<?[String], <<?[String]))
  }
  /** Table description of table international_shipment_label_responses. Objects of this class serve as prototypes for rows in queries. */
  class InternationalShipmentLabelResponses(_tableTag: Tag) extends profile.api.Table[InternationalShipmentLabelResponsesRow](_tableTag, Some("cpapi"), "international_shipment_label_responses") {
    def * = (id, request, httpStatus, responseCode, msg) <> (InternationalShipmentLabelResponsesRow.tupled, InternationalShipmentLabelResponsesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(request), Rep.Some(httpStatus), responseCode, msg)).shaped.<>({r=>import r._; _1.map(_=> InternationalShipmentLabelResponsesRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")
    /** Database column http_status SqlType(int4) */
    val httpStatus: Rep[Int] = column[Int]("http_status")
    /** Database column response_code SqlType(text), Default(None) */
    val responseCode: Rep[Option[String]] = column[Option[String]]("response_code", O.Default(None))
    /** Database column msg SqlType(text), Default(None) */
    val msg: Rep[Option[String]] = column[Option[String]]("msg", O.Default(None))

    /** Foreign key referencing InternationalShipmentLabelRequests (database name international_shipment_label_responses_request_fkey) */
    lazy val internationalShipmentLabelRequestsFk = foreignKey("international_shipment_label_responses_request_fkey", request, InternationalShipmentLabelRequests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalShipmentLabelResponses */
  lazy val InternationalShipmentLabelResponses = new TableQuery(tag => new InternationalShipmentLabelResponses(tag))
}
