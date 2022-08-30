package models
// AUTO-GENERATED Slick data model for table Closeouts
trait CloseoutsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Closeouts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param customerAccountId Database column customer_account_id SqlType(int8), Default(None)
   *  @param pickupAccountId Database column pickup_account_id SqlType(text)
   *  @param soldToAccountId Database column sold_to_account_id SqlType(text)
   *  @param success Database column success SqlType(bool), Default(false)
   *  @param handoverId Database column handover_id SqlType(text), Default(None)
   *  @param handoverNote Database column handover_note SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class CloseoutsRow(id: Long, customerAccountId: Option[Long] = None, pickupAccountId: String, soldToAccountId: String, success: Boolean = false, handoverId: Option[String] = None, handoverNote: Option[String] = None, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CloseoutsRow objects using plain SQL queries */
  implicit def GetResultCloseoutsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Boolean], e4: GR[Option[String]], e5: GR[java.sql.Timestamp]): GR[CloseoutsRow] = GR{
    prs => import prs._
    CloseoutsRow.tupled((<<[Long], <<?[Long], <<[String], <<[String], <<[Boolean], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table closeouts. Objects of this class serve as prototypes for rows in queries. */
  class Closeouts(_tableTag: Tag) extends profile.api.Table[CloseoutsRow](_tableTag, Some("dhl_ecom"), "closeouts") {
    def * = (id, customerAccountId, pickupAccountId, soldToAccountId, success, handoverId, handoverNote, createdAt, modifiedAt) <> (CloseoutsRow.tupled, CloseoutsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), customerAccountId, Rep.Some(pickupAccountId), Rep.Some(soldToAccountId), Rep.Some(success), handoverId, handoverNote, Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> CloseoutsRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column customer_account_id SqlType(int8), Default(None) */
    val customerAccountId: Rep[Option[Long]] = column[Option[Long]]("customer_account_id", O.Default(None))
    /** Database column pickup_account_id SqlType(text) */
    val pickupAccountId: Rep[String] = column[String]("pickup_account_id")
    /** Database column sold_to_account_id SqlType(text) */
    val soldToAccountId: Rep[String] = column[String]("sold_to_account_id")
    /** Database column success SqlType(bool), Default(false) */
    val success: Rep[Boolean] = column[Boolean]("success", O.Default(false))
    /** Database column handover_id SqlType(text), Default(None) */
    val handoverId: Rep[Option[String]] = column[Option[String]]("handover_id", O.Default(None))
    /** Database column handover_note SqlType(text), Default(None) */
    val handoverNote: Rep[Option[String]] = column[Option[String]]("handover_note", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table Closeouts */
  lazy val Closeouts = new TableQuery(tag => new Closeouts(tag))
}
