package models
// AUTO-GENERATED Slick data model for table EcommerceChannelMapping
trait EcommerceChannelMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceChannelMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param channelId Database column channel_id SqlType(int8)
   *  @param active Database column active SqlType(bool), Default(Some(true))
   *  @param selfActive Database column self_active SqlType(bool), Default(true) */
  case class EcommerceChannelMappingRow(id: Long, hubbedUserId: Long, channelId: Long, active: Option[Boolean] = Some(true), selfActive: Boolean = true)
  /** GetResult implicit for fetching EcommerceChannelMappingRow objects using plain SQL queries */
  implicit def GetResultEcommerceChannelMappingRow(implicit e0: GR[Long], e1: GR[Option[Boolean]], e2: GR[Boolean]): GR[EcommerceChannelMappingRow] = GR{
    prs => import prs._
    EcommerceChannelMappingRow.tupled((<<[Long], <<[Long], <<[Long], <<?[Boolean], <<[Boolean]))
  }
  /** Table description of table ecommerce_channel_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceChannelMapping(_tableTag: Tag) extends profile.api.Table[EcommerceChannelMappingRow](_tableTag, Some("ecommerce"), "ecommerce_channel_mapping") {
    def * = (id, hubbedUserId, channelId, active, selfActive) <> (EcommerceChannelMappingRow.tupled, EcommerceChannelMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), Rep.Some(channelId), active, Rep.Some(selfActive))).shaped.<>({r=>import r._; _1.map(_=> EcommerceChannelMappingRow.tupled((_1.get, _2.get, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column channel_id SqlType(int8) */
    val channelId: Rep[Long] = column[Long]("channel_id")
    /** Database column active SqlType(bool), Default(Some(true)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(true)))
    /** Database column self_active SqlType(bool), Default(true) */
    val selfActive: Rep[Boolean] = column[Boolean]("self_active", O.Default(true))

    /** Foreign key referencing Channel (database name fk_ecommerce_channel_mapping_channel_id) */
    lazy val channelFk = foreignKey("fk_ecommerce_channel_mapping_channel_id", channelId, Channel)(r => r.channelId, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name fk_ecommerce_channel_mapping_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("fk_ecommerce_channel_mapping_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceChannelMapping */
  lazy val EcommerceChannelMapping = new TableQuery(tag => new EcommerceChannelMapping(tag))
}
