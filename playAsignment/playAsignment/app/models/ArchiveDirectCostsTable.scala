package models
// AUTO-GENERATED Slick data model for table ArchiveDirectCosts
trait ArchiveDirectCostsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ArchiveDirectCosts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param month Database column month SqlType(int4), Default(None)
   *  @param year Database column year SqlType(int4), Default(None)
   *  @param directCost Database column direct_cost SqlType(text), Default(None)
   *  @param segment Database column segment SqlType(varchar), Length(50,true), Default(None)
   *  @param actualCost Database column actual_cost SqlType(numeric)
   *  @param targetCost Database column target_cost SqlType(numeric)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class ArchiveDirectCostsRow(id: Long, month: Option[Int] = None, year: Option[Int] = None, directCost: Option[String] = None, segment: Option[String] = None, actualCost: Option[scala.math.BigDecimal], targetCost: Option[scala.math.BigDecimal], createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ArchiveDirectCostsRow objects using plain SQL queries */
  implicit def GetResultArchiveDirectCostsRow(implicit e0: GR[Long], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[java.sql.Timestamp]): GR[ArchiveDirectCostsRow] = GR{
    prs => import prs._
    ArchiveDirectCostsRow.tupled((<<[Long], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table archive_direct_costs. Objects of this class serve as prototypes for rows in queries. */
  class ArchiveDirectCosts(_tableTag: Tag) extends profile.api.Table[ArchiveDirectCostsRow](_tableTag, Some("reports"), "archive_direct_costs") {
    def * = (id, month, year, directCost, segment, actualCost, targetCost, createdAt, modifiedAt) <> (ArchiveDirectCostsRow.tupled, ArchiveDirectCostsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), month, year, directCost, segment, actualCost, targetCost, Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> ArchiveDirectCostsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column month SqlType(int4), Default(None) */
    val month: Rep[Option[Int]] = column[Option[Int]]("month", O.Default(None))
    /** Database column year SqlType(int4), Default(None) */
    val year: Rep[Option[Int]] = column[Option[Int]]("year", O.Default(None))
    /** Database column direct_cost SqlType(text), Default(None) */
    val directCost: Rep[Option[String]] = column[Option[String]]("direct_cost", O.Default(None))
    /** Database column segment SqlType(varchar), Length(50,true), Default(None) */
    val segment: Rep[Option[String]] = column[Option[String]]("segment", O.Length(50,varying=true), O.Default(None))
    /** Database column actual_cost SqlType(numeric) */
    val actualCost: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("actual_cost")
    /** Database column target_cost SqlType(numeric) */
    val targetCost: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("target_cost")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table ArchiveDirectCosts */
  lazy val ArchiveDirectCosts = new TableQuery(tag => new ArchiveDirectCosts(tag))
}
