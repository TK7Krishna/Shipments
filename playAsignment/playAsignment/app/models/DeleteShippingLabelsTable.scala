package models
// AUTO-GENERATED Slick data model for table DeleteShippingLabels
trait DeleteShippingLabelsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DeleteShippingLabels
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param customerAccountId Database column customer_account_id SqlType(int8), Default(None)
   *  @param pickupAccountId Database column pickup_account_id SqlType(text)
   *  @param soldToAccountId Database column sold_to_account_id SqlType(text)
   *  @param success Database column success SqlType(bool), Default(false)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class DeleteShippingLabelsRow(id: Long, customerAccountId: Option[Long] = None, pickupAccountId: String, soldToAccountId: String, success: Boolean = false, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching DeleteShippingLabelsRow objects using plain SQL queries */
  implicit def GetResultDeleteShippingLabelsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[DeleteShippingLabelsRow] = GR{
    prs => import prs._
    DeleteShippingLabelsRow.tupled((<<[Long], <<?[Long], <<[String], <<[String], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table delete_shipping_labels. Objects of this class serve as prototypes for rows in queries. */
  class DeleteShippingLabels(_tableTag: Tag) extends profile.api.Table[DeleteShippingLabelsRow](_tableTag, Some("dhl_ecom"), "delete_shipping_labels") {
    def * = (id, customerAccountId, pickupAccountId, soldToAccountId, success, createdAt, modifiedAt) <> (DeleteShippingLabelsRow.tupled, DeleteShippingLabelsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), customerAccountId, Rep.Some(pickupAccountId), Rep.Some(soldToAccountId), Rep.Some(success), Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> DeleteShippingLabelsRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table DeleteShippingLabels */
  lazy val DeleteShippingLabels = new TableQuery(tag => new DeleteShippingLabels(tag))
}
