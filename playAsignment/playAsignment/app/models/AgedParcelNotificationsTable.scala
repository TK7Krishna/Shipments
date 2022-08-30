package models
// AUTO-GENERATED Slick data model for table AgedParcelNotifications
trait AgedParcelNotificationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgedParcelNotifications
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param agedParcelNotificationType Database column aged_parcel_notification_type SqlType(text), Default(None)
   *  @param personsSentToId Database column persons_sent_to_id SqlType(int8), Default(None)
   *  @param consignmentId Database column consignment_id SqlType(int8), Default(None)
   *  @param lockerId Database column locker_id SqlType(int8), Default(None)
   *  @param createdOn Database column created_on SqlType(timestamptz) */
  case class AgedParcelNotificationsRow(id: Long, agedParcelNotificationType: Option[String] = None, personsSentToId: Option[Long] = None, consignmentId: Option[Long] = None, lockerId: Option[Long] = None, createdOn: java.sql.Timestamp)
  /** GetResult implicit for fetching AgedParcelNotificationsRow objects using plain SQL queries */
  implicit def GetResultAgedParcelNotificationsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[java.sql.Timestamp]): GR[AgedParcelNotificationsRow] = GR{
    prs => import prs._
    AgedParcelNotificationsRow.tupled((<<[Long], <<?[String], <<?[Long], <<?[Long], <<?[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table aged_parcel_notifications. Objects of this class serve as prototypes for rows in queries. */
  class AgedParcelNotifications(_tableTag: Tag) extends profile.api.Table[AgedParcelNotificationsRow](_tableTag, Some("locker"), "aged_parcel_notifications") {
    def * = (id, agedParcelNotificationType, personsSentToId, consignmentId, lockerId, createdOn) <> (AgedParcelNotificationsRow.tupled, AgedParcelNotificationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), agedParcelNotificationType, personsSentToId, consignmentId, lockerId, Rep.Some(createdOn))).shaped.<>({r=>import r._; _1.map(_=> AgedParcelNotificationsRow.tupled((_1.get, _2, _3, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column aged_parcel_notification_type SqlType(text), Default(None) */
    val agedParcelNotificationType: Rep[Option[String]] = column[Option[String]]("aged_parcel_notification_type", O.Default(None))
    /** Database column persons_sent_to_id SqlType(int8), Default(None) */
    val personsSentToId: Rep[Option[Long]] = column[Option[Long]]("persons_sent_to_id", O.Default(None))
    /** Database column consignment_id SqlType(int8), Default(None) */
    val consignmentId: Rep[Option[Long]] = column[Option[Long]]("consignment_id", O.Default(None))
    /** Database column locker_id SqlType(int8), Default(None) */
    val lockerId: Rep[Option[Long]] = column[Option[Long]]("locker_id", O.Default(None))
    /** Database column created_on SqlType(timestamptz) */
    val createdOn: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_on")

    /** Foreign key referencing Consignments (database name aged_parcel_notifications_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("aged_parcel_notifications_consignment_id_fkey", consignmentId, Consignments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Lockers (database name aged_parcel_notifications_locker_id_fkey) */
    lazy val lockersFk = foreignKey("aged_parcel_notifications_locker_id_fkey", lockerId, Lockers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Persons (database name aged_parcel_notifications_persons_sent_to_id_fkey) */
    lazy val personsFk = foreignKey("aged_parcel_notifications_persons_sent_to_id_fkey", personsSentToId, Persons)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (agedParcelNotificationType) (database name aged_parcels_notification_notification) */
    val index1 = index("aged_parcels_notification_notification", agedParcelNotificationType)
  }
  /** Collection-like TableQuery object for table AgedParcelNotifications */
  lazy val AgedParcelNotifications = new TableQuery(tag => new AgedParcelNotifications(tag))
}
