package models
// AUTO-GENERATED Slick data model for table StgWarranty
trait StgWarrantyTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table StgWarranty
   *  @param id Database column id SqlType(text), PrimaryKey
   *  @param cost Database column cost SqlType(int8)
   *  @param damage Database column damage SqlType(text), Default(None)
   *  @param lost Database column lost SqlType(text), Default(None)
   *  @param other Database column other SqlType(text), Default(None) */
  case class StgWarrantyRow(id: String, cost: Long, damage: Option[String] = None, lost: Option[String] = None, other: Option[String] = None)
  /** GetResult implicit for fetching StgWarrantyRow objects using plain SQL queries */
  implicit def GetResultStgWarrantyRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Option[String]]): GR[StgWarrantyRow] = GR{
    prs => import prs._
    StgWarrantyRow.tupled((<<[String], <<[Long], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table stg_warranty. Objects of this class serve as prototypes for rows in queries. */
  class StgWarranty(_tableTag: Tag) extends profile.api.Table[StgWarrantyRow](_tableTag, Some("seven_eleven"), "stg_warranty") {
    def * = (id, cost, damage, lost, other) <> (StgWarrantyRow.tupled, StgWarrantyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(cost), damage, lost, other)).shaped.<>({r=>import r._; _1.map(_=> StgWarrantyRow.tupled((_1.get, _2.get, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(text), PrimaryKey */
    val id: Rep[String] = column[String]("id", O.PrimaryKey)
    /** Database column cost SqlType(int8) */
    val cost: Rep[Long] = column[Long]("cost")
    /** Database column damage SqlType(text), Default(None) */
    val damage: Rep[Option[String]] = column[Option[String]]("damage", O.Default(None))
    /** Database column lost SqlType(text), Default(None) */
    val lost: Rep[Option[String]] = column[Option[String]]("lost", O.Default(None))
    /** Database column other SqlType(text), Default(None) */
    val other: Rep[Option[String]] = column[Option[String]]("other", O.Default(None))
  }
  /** Collection-like TableQuery object for table StgWarranty */
  lazy val StgWarranty = new TableQuery(tag => new StgWarranty(tag))
}
