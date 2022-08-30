package models
// AUTO-GENERATED Slick data model for table ReturnConfigurations
trait ReturnConfigurationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ReturnConfigurations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param configKey Database column config_key SqlType(text)
   *  @param configValue Database column config_value SqlType(text), Default(None) */
  case class ReturnConfigurationsRow(id: Long, configKey: String, configValue: Option[String] = None)
  /** GetResult implicit for fetching ReturnConfigurationsRow objects using plain SQL queries */
  implicit def GetResultReturnConfigurationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]]): GR[ReturnConfigurationsRow] = GR{
    prs => import prs._
    ReturnConfigurationsRow.tupled((<<[Long], <<[String], <<?[String]))
  }
  /** Table description of table return_configurations. Objects of this class serve as prototypes for rows in queries. */
  class ReturnConfigurations(_tableTag: Tag) extends profile.api.Table[ReturnConfigurationsRow](_tableTag, Some("ebay"), "return_configurations") {
    def * = (id, configKey, configValue) <> (ReturnConfigurationsRow.tupled, ReturnConfigurationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(configKey), configValue)).shaped.<>({r=>import r._; _1.map(_=> ReturnConfigurationsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column config_key SqlType(text) */
    val configKey: Rep[String] = column[String]("config_key")
    /** Database column config_value SqlType(text), Default(None) */
    val configValue: Rep[Option[String]] = column[Option[String]]("config_value", O.Default(None))
  }
  /** Collection-like TableQuery object for table ReturnConfigurations */
  lazy val ReturnConfigurations = new TableQuery(tag => new ReturnConfigurations(tag))
}
