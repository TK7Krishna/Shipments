package models
// AUTO-GENERATED Slick data model for table DroplocationMaccounts
trait DroplocationMaccountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DroplocationMaccounts
   *  @param location Database column location SqlType(int8)
   *  @param maccount Database column maccount SqlType(text) */
  case class DroplocationMaccountsRow(location: Long, maccount: String)
  /** GetResult implicit for fetching DroplocationMaccountsRow objects using plain SQL queries */
  implicit def GetResultDroplocationMaccountsRow(implicit e0: GR[Long], e1: GR[String]): GR[DroplocationMaccountsRow] = GR{
    prs => import prs._
    DroplocationMaccountsRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table droplocation_maccounts. Objects of this class serve as prototypes for rows in queries. */
  class DroplocationMaccounts(_tableTag: Tag) extends profile.api.Table[DroplocationMaccountsRow](_tableTag, "droplocation_maccounts") {
    def * = (location, maccount) <> (DroplocationMaccountsRow.tupled, DroplocationMaccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(location), Rep.Some(maccount))).shaped.<>({r=>import r._; _1.map(_=> DroplocationMaccountsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column maccount SqlType(text) */
    val maccount: Rep[String] = column[String]("maccount")

    /** Primary key of DroplocationMaccounts (database name droplocation_maccounts_pkey) */
    val pk = primaryKey("droplocation_maccounts_pkey", (location, maccount))

    /** Foreign key referencing Droplocations (database name droplocation_maccounts_location_fkey) */
    lazy val droplocationsFk = foreignKey("droplocation_maccounts_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing MaccountNumbers (database name droplocation_maccounts_maccount_fkey) */
    lazy val maccountNumbersFk = foreignKey("droplocation_maccounts_maccount_fkey", maccount, MaccountNumbers)(r => r.token, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DroplocationMaccounts */
  lazy val DroplocationMaccounts = new TableQuery(tag => new DroplocationMaccounts(tag))
}
