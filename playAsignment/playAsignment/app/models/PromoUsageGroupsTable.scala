package models
// AUTO-GENERATED Slick data model for table PromoUsageGroups
trait PromoUsageGroupsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PromoUsageGroups
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey */
  case class PromoUsageGroupsRow(id: Long)
  /** GetResult implicit for fetching PromoUsageGroupsRow objects using plain SQL queries */
  implicit def GetResultPromoUsageGroupsRow(implicit e0: GR[Long]): GR[PromoUsageGroupsRow] = GR{
    prs => import prs._
    PromoUsageGroupsRow(<<[Long])
  }
  /** Table description of table promo_usage_groups. Objects of this class serve as prototypes for rows in queries. */
  class PromoUsageGroups(_tableTag: Tag) extends profile.api.Table[PromoUsageGroupsRow](_tableTag, Some("consumer"), "promo_usage_groups") {
    def * = id <> (PromoUsageGroupsRow, PromoUsageGroupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id)).shaped.<>(r => r.map(_=> PromoUsageGroupsRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table PromoUsageGroups */
  lazy val PromoUsageGroups = new TableQuery(tag => new PromoUsageGroups(tag))
}
