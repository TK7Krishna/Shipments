package models
// AUTO-GENERATED Slick data model for table Channel
trait ChannelTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Channel
   *  @param channelId Database column channel_id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param channelName Database column channel_name SqlType(text), Default(None)
   *  @param logo Database column logo SqlType(text), Default(None)
   *  @param active Database column active SqlType(bool), Default(Some(true)) */
  case class ChannelRow(channelId: Long, channelName: Option[String] = None, logo: Option[String] = None, active: Option[Boolean] = Some(true))
  /** GetResult implicit for fetching ChannelRow objects using plain SQL queries */
  implicit def GetResultChannelRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]]): GR[ChannelRow] = GR{
    prs => import prs._
    ChannelRow.tupled((<<[Long], <<?[String], <<?[String], <<?[Boolean]))
  }
  /** Table description of table channel. Objects of this class serve as prototypes for rows in queries. */
  class Channel(_tableTag: Tag) extends profile.api.Table[ChannelRow](_tableTag, Some("ecommerce"), "channel") {
    def * = (channelId, channelName, logo, active) <> (ChannelRow.tupled, ChannelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(channelId), channelName, logo, active)).shaped.<>({r=>import r._; _1.map(_=> ChannelRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column channel_id SqlType(bigserial), AutoInc, PrimaryKey */
    val channelId: Rep[Long] = column[Long]("channel_id", O.AutoInc, O.PrimaryKey)
    /** Database column channel_name SqlType(text), Default(None) */
    val channelName: Rep[Option[String]] = column[Option[String]]("channel_name", O.Default(None))
    /** Database column logo SqlType(text), Default(None) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Default(None))
    /** Database column active SqlType(bool), Default(Some(true)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(true)))
  }
  /** Collection-like TableQuery object for table Channel */
  lazy val Channel = new TableQuery(tag => new Channel(tag))
}
