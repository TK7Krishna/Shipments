package models
// AUTO-GENERATED Slick data model for table Settings
trait SettingsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Settings
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param key Database column key SqlType(text), Default(None)
   *  @param value Database column value SqlType(text), Default(None) */
  case class SettingsRow(id: Long, key: Option[String] = None, value: Option[String] = None)
  /** GetResult implicit for fetching SettingsRow objects using plain SQL queries */
  implicit def GetResultSettingsRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[SettingsRow] = GR{
    prs => import prs._
    SettingsRow.tupled((<<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table settings. Objects of this class serve as prototypes for rows in queries. */
  class Settings(_tableTag: Tag) extends profile.api.Table[SettingsRow](_tableTag, Some("pakpobox"), "settings") {
    def * = (id, key, value) <> (SettingsRow.tupled, SettingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), key, value)).shaped.<>({r=>import r._; _1.map(_=> SettingsRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column key SqlType(text), Default(None) */
    val key: Rep[Option[String]] = column[Option[String]]("key", O.Default(None))
    /** Database column value SqlType(text), Default(None) */
    val value: Rep[Option[String]] = column[Option[String]]("value", O.Default(None))
  }
  /** Collection-like TableQuery object for table Settings */
  lazy val Settings = new TableQuery(tag => new Settings(tag))
}
