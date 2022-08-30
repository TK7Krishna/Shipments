package models
// AUTO-GENERATED Slick data model for table PromoDiscounts
trait PromoDiscountsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PromoDiscounts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param usageGroup Database column usage_group SqlType(int8)
   *  @param flatDiscount Database column flat_discount SqlType(int4), Default(None)
   *  @param fractionalDiscount Database column fractional_discount SqlType(numeric), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param createdBy Database column created_by SqlType(int8) */
  case class PromoDiscountsRow(id: Long, usageGroup: Long, flatDiscount: Option[Int] = None, fractionalDiscount: Option[scala.math.BigDecimal] = None, createdAt: java.sql.Timestamp, createdBy: Long)
  /** GetResult implicit for fetching PromoDiscountsRow objects using plain SQL queries */
  implicit def GetResultPromoDiscountsRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[java.sql.Timestamp]): GR[PromoDiscountsRow] = GR{
    prs => import prs._
    PromoDiscountsRow.tupled((<<[Long], <<[Long], <<?[Int], <<?[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[Long]))
  }
  /** Table description of table promo_discounts. Objects of this class serve as prototypes for rows in queries. */
  class PromoDiscounts(_tableTag: Tag) extends profile.api.Table[PromoDiscountsRow](_tableTag, Some("consumer"), "promo_discounts") {
    def * = (id, usageGroup, flatDiscount, fractionalDiscount, createdAt, createdBy) <> (PromoDiscountsRow.tupled, PromoDiscountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(usageGroup), flatDiscount, fractionalDiscount, Rep.Some(createdAt), Rep.Some(createdBy))).shaped.<>({r=>import r._; _1.map(_=> PromoDiscountsRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column usage_group SqlType(int8) */
    val usageGroup: Rep[Long] = column[Long]("usage_group")
    /** Database column flat_discount SqlType(int4), Default(None) */
    val flatDiscount: Rep[Option[Int]] = column[Option[Int]]("flat_discount", O.Default(None))
    /** Database column fractional_discount SqlType(numeric), Default(None) */
    val fractionalDiscount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("fractional_discount", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column created_by SqlType(int8) */
    val createdBy: Rep[Long] = column[Long]("created_by")

    /** Foreign key referencing AdminUsers (database name promo_discounts_created_by_fkey) */
    lazy val adminUsersFk = foreignKey("promo_discounts_created_by_fkey", createdBy, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing PromoUsageGroups (database name promo_discounts_usage_group_fkey) */
    lazy val promoUsageGroupsFk = foreignKey("promo_discounts_usage_group_fkey", usageGroup, PromoUsageGroups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (usageGroup,createdAt,id) (database name promo_discounts_usage_group_created_at_id_idx) */
    val index1 = index("promo_discounts_usage_group_created_at_id_idx", (usageGroup, createdAt, id))
  }
  /** Collection-like TableQuery object for table PromoDiscounts */
  lazy val PromoDiscounts = new TableQuery(tag => new PromoDiscounts(tag))
}
