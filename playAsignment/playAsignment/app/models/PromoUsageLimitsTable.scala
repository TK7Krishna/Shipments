package models
// AUTO-GENERATED Slick data model for table PromoUsageLimits
trait PromoUsageLimitsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PromoUsageLimits
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param usageGroup Database column usage_group SqlType(int8)
   *  @param userLimit Database column user_limit SqlType(int8), Default(None)
   *  @param overallLimit Database column overall_limit SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param createdBy Database column created_by SqlType(int8) */
  case class PromoUsageLimitsRow(id: Long, usageGroup: Long, userLimit: Option[Long] = None, overallLimit: Option[Long] = None, createdAt: java.sql.Timestamp, createdBy: Long)
  /** GetResult implicit for fetching PromoUsageLimitsRow objects using plain SQL queries */
  implicit def GetResultPromoUsageLimitsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[java.sql.Timestamp]): GR[PromoUsageLimitsRow] = GR{
    prs => import prs._
    PromoUsageLimitsRow.tupled((<<[Long], <<[Long], <<?[Long], <<?[Long], <<[java.sql.Timestamp], <<[Long]))
  }
  /** Table description of table promo_usage_limits. Objects of this class serve as prototypes for rows in queries. */
  class PromoUsageLimits(_tableTag: Tag) extends profile.api.Table[PromoUsageLimitsRow](_tableTag, Some("consumer"), "promo_usage_limits") {
    def * = (id, usageGroup, userLimit, overallLimit, createdAt, createdBy) <> (PromoUsageLimitsRow.tupled, PromoUsageLimitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(usageGroup), userLimit, overallLimit, Rep.Some(createdAt), Rep.Some(createdBy))).shaped.<>({r=>import r._; _1.map(_=> PromoUsageLimitsRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column usage_group SqlType(int8) */
    val usageGroup: Rep[Long] = column[Long]("usage_group")
    /** Database column user_limit SqlType(int8), Default(None) */
    val userLimit: Rep[Option[Long]] = column[Option[Long]]("user_limit", O.Default(None))
    /** Database column overall_limit SqlType(int8), Default(None) */
    val overallLimit: Rep[Option[Long]] = column[Option[Long]]("overall_limit", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column created_by SqlType(int8) */
    val createdBy: Rep[Long] = column[Long]("created_by")

    /** Foreign key referencing AdminUsers (database name promo_usage_limits_created_by_fkey) */
    lazy val adminUsersFk = foreignKey("promo_usage_limits_created_by_fkey", createdBy, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing PromoUsageGroups (database name promo_usage_limits_usage_group_fkey) */
    lazy val promoUsageGroupsFk = foreignKey("promo_usage_limits_usage_group_fkey", usageGroup, PromoUsageGroups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (usageGroup,createdAt,id) (database name promo_usage_limits_usage_group_created_at_id_idx) */
    val index1 = index("promo_usage_limits_usage_group_created_at_id_idx", (usageGroup, createdAt, id))
  }
  /** Collection-like TableQuery object for table PromoUsageLimits */
  lazy val PromoUsageLimits = new TableQuery(tag => new PromoUsageLimits(tag))
}
