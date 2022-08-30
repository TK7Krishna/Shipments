package models
// AUTO-GENERATED Slick data model for table LabelServiceMaster
trait LabelServiceMasterTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LabelServiceMaster
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text)
   *  @param service Database column service SqlType(text)
   *  @param serviceCode Database column service_code SqlType(int4)
   *  @param buCode Database column bu_code SqlType(int4)
   *  @param status Database column status SqlType(bool), Default(true) */
  case class LabelServiceMasterRow(id: Long, courierCode: String, service: String, serviceCode: Int, buCode: Int, status: Boolean = true)
  /** GetResult implicit for fetching LabelServiceMasterRow objects using plain SQL queries */
  implicit def GetResultLabelServiceMasterRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Boolean]): GR[LabelServiceMasterRow] = GR{
    prs => import prs._
    LabelServiceMasterRow.tupled((<<[Long], <<[String], <<[String], <<[Int], <<[Int], <<[Boolean]))
  }
  /** Table description of table label_service_master. Objects of this class serve as prototypes for rows in queries. */
  class LabelServiceMaster(_tableTag: Tag) extends profile.api.Table[LabelServiceMasterRow](_tableTag, Some("test"), "label_service_master") {
    def * = (id, courierCode, service, serviceCode, buCode, status) <> (LabelServiceMasterRow.tupled, LabelServiceMasterRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courierCode), Rep.Some(service), Rep.Some(serviceCode), Rep.Some(buCode), Rep.Some(status))).shaped.<>({r=>import r._; _1.map(_=> LabelServiceMasterRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")
    /** Database column service SqlType(text) */
    val service: Rep[String] = column[String]("service")
    /** Database column service_code SqlType(int4) */
    val serviceCode: Rep[Int] = column[Int]("service_code")
    /** Database column bu_code SqlType(int4) */
    val buCode: Rep[Int] = column[Int]("bu_code")
    /** Database column status SqlType(bool), Default(true) */
    val status: Rep[Boolean] = column[Boolean]("status", O.Default(true))
  }
  /** Collection-like TableQuery object for table LabelServiceMaster */
  lazy val LabelServiceMaster = new TableQuery(tag => new LabelServiceMaster(tag))
}
