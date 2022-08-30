package models
// AUTO-GENERATED Slick data model for table ApSettings
trait ApSettingsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ApSettings
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param key Database column key SqlType(text)
   *  @param value Database column value SqlType(text), Default(None) */
  case class ApSettingsRow(id: Long, key: String, value: Option[String] = None)
  /** GetResult implicit for fetching ApSettingsRow objects using plain SQL queries */
  implicit def GetResultApSettingsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[ApSettingsRow] = GR{
    prs => import prs._
    ApSettingsRow.tupled((<<[Long], <<[String], <<?[String]))
  }
  /** Table description of table ap_settings. Objects of this class serve as prototypes for rows in queries. */
  class ApSettings(_tableTag: Tag) extends profile.api.Table[ApSettingsRow](_tableTag, Some("ecommerce"), "ap_settings") {
    def * = (id, key, value) <> (ApSettingsRow.tupled, ApSettingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(key), value)).shaped.<>({r=>import r._; _1.map(_=> ApSettingsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column key SqlType(text) */
    val key: Rep[String] = column[String]("key")
    /** Database column value SqlType(text), Default(None) */
    val value: Rep[Option[String]] = column[Option[String]]("value", O.Default(None))
  }
  /** Collection-like TableQuery object for table ApSettings */
  lazy val ApSettings = new TableQuery(tag => new ApSettings(tag))
}
