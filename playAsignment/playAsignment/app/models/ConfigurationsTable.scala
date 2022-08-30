package models
// AUTO-GENERATED Slick data model for table Configurations
trait ConfigurationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Configurations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param configKey Database column config_key SqlType(text), Default(None)
   *  @param configValue Database column config_value SqlType(text), Default(None) */
  case class ConfigurationsRow(id: Long, configKey: Option[String] = None, configValue: Option[String] = None)
  /** GetResult implicit for fetching ConfigurationsRow objects using plain SQL queries */
  implicit def GetResultConfigurationsRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[ConfigurationsRow] = GR{
    prs => import prs._
    ConfigurationsRow.tupled((<<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table configurations. Objects of this class serve as prototypes for rows in queries. */
  class Configurations(_tableTag: Tag) extends profile.api.Table[ConfigurationsRow](_tableTag, Some("standard_apis"), "configurations") {
    def * = (id, configKey, configValue) <> (ConfigurationsRow.tupled, ConfigurationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), configKey, configValue)).shaped.<>({r=>import r._; _1.map(_=> ConfigurationsRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column config_key SqlType(text), Default(None) */
    val configKey: Rep[Option[String]] = column[Option[String]]("config_key", O.Default(None))
    /** Database column config_value SqlType(text), Default(None) */
    val configValue: Rep[Option[String]] = column[Option[String]]("config_value", O.Default(None))
  }
  /** Collection-like TableQuery object for table Configurations */
  lazy val Configurations = new TableQuery(tag => new Configurations(tag))
}
