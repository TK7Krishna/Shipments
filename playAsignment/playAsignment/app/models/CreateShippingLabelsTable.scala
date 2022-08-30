package models
// AUTO-GENERATED Slick data model for table CreateShippingLabels
trait CreateShippingLabelsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CreateShippingLabels
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param customerAccountId Database column customer_account_id SqlType(text), Default(None)
   *  @param pickupAccountId Database column pickup_account_id SqlType(text)
   *  @param soldToAccountId Database column sold_to_account_id SqlType(text)
   *  @param pickupDateTime Database column pickup_date_time SqlType(timestamptz), Default(None)
   *  @param pickupAddress Database column pickup_address SqlType(text)
   *  @param shipperAddress Database column shipper_address SqlType(text)
   *  @param success Database column success SqlType(bool), Default(false)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class CreateShippingLabelsRow(id: Long, customerAccountId: Option[String] = None, pickupAccountId: String, soldToAccountId: String, pickupDateTime: Option[java.sql.Timestamp] = None, pickupAddress: String, shipperAddress: String, success: Boolean = false, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching CreateShippingLabelsRow objects using plain SQL queries */
  implicit def GetResultCreateShippingLabelsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]], e4: GR[Boolean], e5: GR[java.sql.Timestamp]): GR[CreateShippingLabelsRow] = GR{
    prs => import prs._
    CreateShippingLabelsRow.tupled((<<[Long], <<?[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<[String], <<[String], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table create_shipping_labels. Objects of this class serve as prototypes for rows in queries. */
  class CreateShippingLabels(_tableTag: Tag) extends profile.api.Table[CreateShippingLabelsRow](_tableTag, Some("dhl_ecom"), "create_shipping_labels") {
    def * = (id, customerAccountId, pickupAccountId, soldToAccountId, pickupDateTime, pickupAddress, shipperAddress, success, createdAt, modifiedAt) <> (CreateShippingLabelsRow.tupled, CreateShippingLabelsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), customerAccountId, Rep.Some(pickupAccountId), Rep.Some(soldToAccountId), pickupDateTime, Rep.Some(pickupAddress), Rep.Some(shipperAddress), Rep.Some(success), Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> CreateShippingLabelsRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column customer_account_id SqlType(text), Default(None) */
    val customerAccountId: Rep[Option[String]] = column[Option[String]]("customer_account_id", O.Default(None))
    /** Database column pickup_account_id SqlType(text) */
    val pickupAccountId: Rep[String] = column[String]("pickup_account_id")
    /** Database column sold_to_account_id SqlType(text) */
    val soldToAccountId: Rep[String] = column[String]("sold_to_account_id")
    /** Database column pickup_date_time SqlType(timestamptz), Default(None) */
    val pickupDateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("pickup_date_time", O.Default(None))
    /** Database column pickup_address SqlType(text) */
    val pickupAddress: Rep[String] = column[String]("pickup_address")
    /** Database column shipper_address SqlType(text) */
    val shipperAddress: Rep[String] = column[String]("shipper_address")
    /** Database column success SqlType(bool), Default(false) */
    val success: Rep[Boolean] = column[Boolean]("success", O.Default(false))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
  }
  /** Collection-like TableQuery object for table CreateShippingLabels */
  lazy val CreateShippingLabels = new TableQuery(tag => new CreateShippingLabels(tag))
}
