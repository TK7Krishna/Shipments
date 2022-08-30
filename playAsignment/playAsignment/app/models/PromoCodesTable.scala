package models
// AUTO-GENERATED Slick data model for table PromoCodes
trait PromoCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PromoCodes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param code Database column code SqlType(text)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param discount Database column discount SqlType(int8)
   *  @param userCategory Database column user_category SqlType(int8), Default(None)
   *  @param promoStart Database column promo_start SqlType(timestamptz)
   *  @param promoEnd Database column promo_end SqlType(timestamptz), Default(None)
   *  @param disabled Database column disabled SqlType(bool), Default(false)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param createdBy Database column created_by SqlType(int8)
   *  @param serviceType Database column service_type SqlType(int8), Default(None) */
  case class PromoCodesRow(id: Long, code: String, description: Option[String] = None, discount: Long, userCategory: Option[Long] = None, promoStart: java.sql.Timestamp, promoEnd: Option[java.sql.Timestamp] = None, disabled: Boolean = false, createdAt: java.sql.Timestamp, createdBy: Long, serviceType: Option[Long] = None)
  /** GetResult implicit for fetching PromoCodesRow objects using plain SQL queries */
  implicit def GetResultPromoCodesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Long]], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Boolean]): GR[PromoCodesRow] = GR{
    prs => import prs._
    PromoCodesRow.tupled((<<[Long], <<[String], <<?[String], <<[Long], <<?[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Boolean], <<[java.sql.Timestamp], <<[Long], <<?[Long]))
  }
  /** Table description of table promo_codes. Objects of this class serve as prototypes for rows in queries. */
  class PromoCodes(_tableTag: Tag) extends profile.api.Table[PromoCodesRow](_tableTag, Some("consumer"), "promo_codes") {
    def * = (id, code, description, discount, userCategory, promoStart, promoEnd, disabled, createdAt, createdBy, serviceType) <> (PromoCodesRow.tupled, PromoCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(code), description, Rep.Some(discount), userCategory, Rep.Some(promoStart), promoEnd, Rep.Some(disabled), Rep.Some(createdAt), Rep.Some(createdBy), serviceType)).shaped.<>({r=>import r._; _1.map(_=> PromoCodesRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6.get, _7, _8.get, _9.get, _10.get, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(text) */
    val code: Rep[String] = column[String]("code")
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column discount SqlType(int8) */
    val discount: Rep[Long] = column[Long]("discount")
    /** Database column user_category SqlType(int8), Default(None) */
    val userCategory: Rep[Option[Long]] = column[Option[Long]]("user_category", O.Default(None))
    /** Database column promo_start SqlType(timestamptz) */
    val promoStart: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("promo_start")
    /** Database column promo_end SqlType(timestamptz), Default(None) */
    val promoEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("promo_end", O.Default(None))
    /** Database column disabled SqlType(bool), Default(false) */
    val disabled: Rep[Boolean] = column[Boolean]("disabled", O.Default(false))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column created_by SqlType(int8) */
    val createdBy: Rep[Long] = column[Long]("created_by")
    /** Database column service_type SqlType(int8), Default(None) */
    val serviceType: Rep[Option[Long]] = column[Option[Long]]("service_type", O.Default(None))

    /** Foreign key referencing AdminUsers (database name promo_codes_created_by_fkey) */
    lazy val adminUsersFk = foreignKey("promo_codes_created_by_fkey", createdBy, AdminUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Categories (database name promo_codes_user_category_fkey) */
    lazy val categoriesFk = foreignKey("promo_codes_user_category_fkey", userCategory, Categories)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing PromoDiscounts (database name promo_codes_discount_fkey) */
    lazy val promoDiscountsFk = foreignKey("promo_codes_discount_fkey", discount, PromoDiscounts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ServiceTypes (database name promo_codes_service_type_fkey) */
    lazy val serviceTypesFk = foreignKey("promo_codes_service_type_fkey", serviceType, ServiceTypes)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (discount,createdAt,id) (database name promo_codes_discount_created_at_id_idx) */
    val index1 = index("promo_codes_discount_created_at_id_idx", (discount, createdAt, id))
    /** Uniqueness Index over (code) (database name promo_codes_unique_enabled_codes) */
    val index2 = index("promo_codes_unique_enabled_codes", code, unique=true)
  }
  /** Collection-like TableQuery object for table PromoCodes */
  lazy val PromoCodes = new TableQuery(tag => new PromoCodes(tag))
}
