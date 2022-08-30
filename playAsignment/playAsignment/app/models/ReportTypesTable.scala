package models
// AUTO-GENERATED Slick data model for table ReportTypes
trait ReportTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ReportTypes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param reportName Database column report_name SqlType(text) */
  case class ReportTypesRow(id: Long, reportName: String)
  /** GetResult implicit for fetching ReportTypesRow objects using plain SQL queries */
  implicit def GetResultReportTypesRow(implicit e0: GR[Long], e1: GR[String]): GR[ReportTypesRow] = GR{
    prs => import prs._
    ReportTypesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table report_types. Objects of this class serve as prototypes for rows in queries. */
  class ReportTypes(_tableTag: Tag) extends profile.api.Table[ReportTypesRow](_tableTag, Some("reports"), "report_types") {
    def * = (id, reportName) <> (ReportTypesRow.tupled, ReportTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(reportName))).shaped.<>({r=>import r._; _1.map(_=> ReportTypesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column report_name SqlType(text) */
    val reportName: Rep[String] = column[String]("report_name")
  }
  /** Collection-like TableQuery object for table ReportTypes */
  lazy val ReportTypes = new TableQuery(tag => new ReportTypes(tag))
}
