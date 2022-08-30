package models
// AUTO-GENERATED Slick data model for table AgedParcelReportSettings
trait AgedParcelReportSettingsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgedParcelReportSettings
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param sendReport Database column send_report SqlType(bool), Default(Some(false))
   *  @param createdAt Database column created_at SqlType(timestamp), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamp), Default(None) */
  case class AgedParcelReportSettingsRow(id: Int, courierCode: String, email: String, sendReport: Option[Boolean] = Some(false), createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching AgedParcelReportSettingsRow objects using plain SQL queries */
  implicit def GetResultAgedParcelReportSettingsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[java.sql.Timestamp]]): GR[AgedParcelReportSettingsRow] = GR{
    prs => import prs._
    AgedParcelReportSettingsRow.tupled((<<[Int], <<[String], <<[String], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table aged_parcel_report_settings. Objects of this class serve as prototypes for rows in queries. */
  class AgedParcelReportSettings(_tableTag: Tag) extends profile.api.Table[AgedParcelReportSettingsRow](_tableTag, "aged_parcel_report_settings") {
    def * = (id, courierCode, email, sendReport, createdAt, modifiedAt) <> (AgedParcelReportSettingsRow.tupled, AgedParcelReportSettingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courierCode), Rep.Some(email), sendReport, createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> AgedParcelReportSettingsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column send_report SqlType(bool), Default(Some(false)) */
    val sendReport: Rep[Option[Boolean]] = column[Option[Boolean]]("send_report", O.Default(Some(false)))
    /** Database column created_at SqlType(timestamp), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column modified_at SqlType(timestamp), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))

    /** Foreign key referencing Couriers (database name courier_code_fk) */
    lazy val couriersFk = foreignKey("courier_code_fk", courierCode, Couriers)(r => r.code, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table AgedParcelReportSettings */
  lazy val AgedParcelReportSettings = new TableQuery(tag => new AgedParcelReportSettings(tag))
}
