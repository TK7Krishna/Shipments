package models
// AUTO-GENERATED Slick data model for table Purchases
trait PurchasesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Purchases
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationid Database column droplocationid SqlType(int8)
   *  @param timestamp Database column timestamp SqlType(timestamptz)
   *  @param total Database column total SqlType(float8) */
  case class PurchasesRow(id: Long, droplocationid: Long, timestamp: java.sql.Timestamp, total: Double)
  /** GetResult implicit for fetching PurchasesRow objects using plain SQL queries */
  implicit def GetResultPurchasesRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Double]): GR[PurchasesRow] = GR{
    prs => import prs._
    PurchasesRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp], <<[Double]))
  }
  /** Table description of table purchases. Objects of this class serve as prototypes for rows in queries. */
  class Purchases(_tableTag: Tag) extends profile.api.Table[PurchasesRow](_tableTag, "purchases") {
    def * = (id, droplocationid, timestamp, total) <> (PurchasesRow.tupled, PurchasesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(droplocationid), Rep.Some(timestamp), Rep.Some(total))).shaped.<>({r=>import r._; _1.map(_=> PurchasesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocationid SqlType(int8) */
    val droplocationid: Rep[Long] = column[Long]("droplocationid")
    /** Database column timestamp SqlType(timestamptz) */
    val timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("timestamp")
    /** Database column total SqlType(float8) */
    val total: Rep[Double] = column[Double]("total")

    /** Foreign key referencing Droplocations (database name purchases_droplocationid_fkey) */
    lazy val droplocationsFk = foreignKey("purchases_droplocationid_fkey", droplocationid, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Purchases */
  lazy val Purchases = new TableQuery(tag => new Purchases(tag))
}
