package models
// AUTO-GENERATED Slick data model for table PickupAddresses
trait PickupAddressesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PickupAddresses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(int8)
   *  @param streetAddress Database column street_address SqlType(text)
   *  @param suburb Database column suburb SqlType(text)
   *  @param state Database column state SqlType(text)
   *  @param postcode Database column postcode SqlType(text) */
  case class PickupAddressesRow(id: Long, userId: Long, streetAddress: String, suburb: String, state: String, postcode: String)
  /** GetResult implicit for fetching PickupAddressesRow objects using plain SQL queries */
  implicit def GetResultPickupAddressesRow(implicit e0: GR[Long], e1: GR[String]): GR[PickupAddressesRow] = GR{
    prs => import prs._
    PickupAddressesRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pickup_addresses. Objects of this class serve as prototypes for rows in queries. */
  class PickupAddresses(_tableTag: Tag) extends profile.api.Table[PickupAddressesRow](_tableTag, Some("consumer"), "pickup_addresses") {
    def * = (id, userId, streetAddress, suburb, state, postcode) <> (PickupAddressesRow.tupled, PickupAddressesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(userId), Rep.Some(streetAddress), Rep.Some(suburb), Rep.Some(state), Rep.Some(postcode))).shaped.<>({r=>import r._; _1.map(_=> PickupAddressesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(int8) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column street_address SqlType(text) */
    val streetAddress: Rep[String] = column[String]("street_address")
    /** Database column suburb SqlType(text) */
    val suburb: Rep[String] = column[String]("suburb")
    /** Database column state SqlType(text) */
    val state: Rep[String] = column[String]("state")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")

    /** Foreign key referencing Users (database name pickup_addresses_user_id_fkey) */
    lazy val usersFk = foreignKey("pickup_addresses_user_id_fkey", userId, Users)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PickupAddresses */
  lazy val PickupAddresses = new TableQuery(tag => new PickupAddresses(tag))
}
