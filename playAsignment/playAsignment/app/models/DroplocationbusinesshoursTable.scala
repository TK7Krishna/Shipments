package models
// AUTO-GENERATED Slick data model for table Droplocationbusinesshours
trait DroplocationbusinesshoursTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Droplocationbusinesshours
   *  @param accountname Database column accountname SqlType(text), Default(None)
   *  @param weekdaynum Database column weekdaynum SqlType(int4), Default(None)
   *  @param timein Database column timein SqlType(text)
   *  @param timeout Database column timeout SqlType(text), Default(None) */
  case class DroplocationbusinesshoursRow(accountname: Option[String] = None, weekdaynum: Option[Int] = None, timein: Option[String], timeout: Option[String] = None)
  /** GetResult implicit for fetching DroplocationbusinesshoursRow objects using plain SQL queries */
  implicit def GetResultDroplocationbusinesshoursRow(implicit e0: GR[Option[String]], e1: GR[Option[Int]]): GR[DroplocationbusinesshoursRow] = GR{
    prs => import prs._
    DroplocationbusinesshoursRow.tupled((<<?[String], <<?[Int], <<?[String], <<?[String]))
  }
  /** Table description of table droplocationbusinesshours. Objects of this class serve as prototypes for rows in queries. */
  class Droplocationbusinesshours(_tableTag: Tag) extends profile.api.Table[DroplocationbusinesshoursRow](_tableTag, "droplocationbusinesshours") {
    def * = (accountname, weekdaynum, timein, timeout) <> (DroplocationbusinesshoursRow.tupled, DroplocationbusinesshoursRow.unapply)

    /** Database column accountname SqlType(text), Default(None) */
    val accountname: Rep[Option[String]] = column[Option[String]]("accountname", O.Default(None))
    /** Database column weekdaynum SqlType(int4), Default(None) */
    val weekdaynum: Rep[Option[Int]] = column[Option[Int]]("weekdaynum", O.Default(None))
    /** Database column timein SqlType(text) */
    val timein: Rep[Option[String]] = column[Option[String]]("timein")
    /** Database column timeout SqlType(text), Default(None) */
    val timeout: Rep[Option[String]] = column[Option[String]]("timeout", O.Default(None))
  }
  /** Collection-like TableQuery object for table Droplocationbusinesshours */
  lazy val Droplocationbusinesshours = new TableQuery(tag => new Droplocationbusinesshours(tag))
}
