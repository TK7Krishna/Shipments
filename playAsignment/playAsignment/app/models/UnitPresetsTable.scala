package models
// AUTO-GENERATED Slick data model for table UnitPresets
trait UnitPresetsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UnitPresets
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(text)
   *  @param provider Database column provider SqlType(int8) */
  case class UnitPresetsRow(id: Long, name: String, provider: Long)
  /** GetResult implicit for fetching UnitPresetsRow objects using plain SQL queries */
  implicit def GetResultUnitPresetsRow(implicit e0: GR[Long], e1: GR[String]): GR[UnitPresetsRow] = GR{
    prs => import prs._
    UnitPresetsRow.tupled((<<[Long], <<[String], <<[Long]))
  }
  /** Table description of table unit_presets. Objects of this class serve as prototypes for rows in queries. */
  class UnitPresets(_tableTag: Tag) extends profile.api.Table[UnitPresetsRow](_tableTag, Some("locker"), "unit_presets") {
    def * = (id, name, provider) <> (UnitPresetsRow.tupled, UnitPresetsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(provider))).shaped.<>({r=>import r._; _1.map(_=> UnitPresetsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column provider SqlType(int8) */
    val provider: Rep[Long] = column[Long]("provider")

    /** Foreign key referencing Providers (database name unit_presets_provider_fkey) */
    lazy val providersFk = foreignKey("unit_presets_provider_fkey", provider, Providers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table UnitPresets */
  lazy val UnitPresets = new TableQuery(tag => new UnitPresets(tag))
}
