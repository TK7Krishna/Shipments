package models
// AUTO-GENERATED Slick data model for table FixedRates
trait FixedRatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table FixedRates
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param buyRate Database column buy_rate SqlType(numeric), Default(0)
   *  @param saleRate Database column sale_rate SqlType(numeric), Default(0)
   *  @param additionalCharge Database column additional_charge SqlType(numeric), Default(Some(0))
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class FixedRatesRow(id: Long, hubbedUserId: Long, buyRate: scala.math.BigDecimal = scala.math.BigDecimal("0"), saleRate: scala.math.BigDecimal = scala.math.BigDecimal("0"), additionalCharge: Option[scala.math.BigDecimal] = Some(scala.math.BigDecimal("0")), createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching FixedRatesRow objects using plain SQL queries */
  implicit def GetResultFixedRatesRow(implicit e0: GR[Long], e1: GR[scala.math.BigDecimal], e2: GR[Option[scala.math.BigDecimal]], e3: GR[java.sql.Timestamp]): GR[FixedRatesRow] = GR{
    prs => import prs._
    FixedRatesRow.tupled((<<[Long], <<[Long], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[java.sql.Timestamp]))
  }
  /** Table description of table fixed_rates. Objects of this class serve as prototypes for rows in queries. */
  class FixedRates(_tableTag: Tag) extends profile.api.Table[FixedRatesRow](_tableTag, Some("ecommerce"), "fixed_rates") {
    def * = (id, hubbedUserId, buyRate, saleRate, additionalCharge, createdAt) <> (FixedRatesRow.tupled, FixedRatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), Rep.Some(buyRate), Rep.Some(saleRate), additionalCharge, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> FixedRatesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column buy_rate SqlType(numeric), Default(0) */
    val buyRate: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("buy_rate", O.Default(scala.math.BigDecimal("0")))
    /** Database column sale_rate SqlType(numeric), Default(0) */
    val saleRate: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("sale_rate", O.Default(scala.math.BigDecimal("0")))
    /** Database column additional_charge SqlType(numeric), Default(Some(0)) */
    val additionalCharge: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("additional_charge", O.Default(Some(scala.math.BigDecimal("0"))))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fkey", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table FixedRates */
  lazy val FixedRates = new TableQuery(tag => new FixedRates(tag))
}
