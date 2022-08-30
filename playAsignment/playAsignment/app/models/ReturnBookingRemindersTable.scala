package models
// AUTO-GENERATED Slick data model for table ReturnBookingReminders
trait ReturnBookingRemindersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ReturnBookingReminders
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param hubbedUserParentId Database column hubbed_user_parent_id SqlType(int8)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param orderNumber Database column order_number SqlType(text), Default(None)
   *  @param firstName Database column first_name SqlType(text), Default(None)
   *  @param lastName Database column last_name SqlType(text), Default(None)
   *  @param email Database column email SqlType(text), Default(None)
   *  @param phone Database column phone SqlType(text), Default(None)
   *  @param dropLocationName Database column drop_location_name SqlType(text), Default(None)
   *  @param dropLocationStreet1 Database column drop_location_street1 SqlType(text), Default(None)
   *  @param dropLocationState Database column drop_location_state SqlType(text), Default(None)
   *  @param dropLocationPostcode Database column drop_location_postcode SqlType(text), Default(None)
   *  @param dropLocationOperatingHours Database column drop_location_operating_hours SqlType(text), Default(None)
   *  @param dropLocationLat Database column drop_location_lat SqlType(text), Default(None)
   *  @param dropLocationLon Database column drop_location_lon SqlType(text), Default(None)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param logo Database column logo SqlType(text), Default(None)
   *  @param contactCompanyName Database column contact_company_name SqlType(text), Default(None)
   *  @param isEmailSent2days Database column is_email_sent_2days SqlType(bool)
   *  @param isEmailSent5days Database column is_email_sent_5days SqlType(bool)
   *  @param isEmailSent7days Database column is_email_sent_7days SqlType(bool)
   *  @param dropLocationId Database column drop_location_id SqlType(int8), Default(None)
   *  @param isEmailSentDropConfirmation Database column is_email_sent_drop_confirmation SqlType(bool)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param attemptCountReminderEmails Database column attempt_count_reminder_emails SqlType(int4), Default(0)
   *  @param attemptCountDropOffConfirmationEmails Database column attempt_count_drop_off_confirmation_emails SqlType(int4), Default(0) */
  case class ReturnBookingRemindersRow(id: Long, consignmentId: Long, hubbedUserId: Long, hubbedUserParentId: Long, consignmentNumber: Option[String] = None, orderNumber: Option[String] = None, firstName: Option[String] = None, lastName: Option[String] = None, email: Option[String] = None, phone: Option[String] = None, dropLocationName: Option[String] = None, dropLocationStreet1: Option[String] = None, dropLocationState: Option[String] = None, dropLocationPostcode: Option[String] = None, dropLocationOperatingHours: Option[String] = None, dropLocationLat: Option[String] = None, dropLocationLon: Option[String] = None, courier: Option[String] = None, logo: Option[String] = None, contactCompanyName: Option[String] = None, isEmailSent2days: Boolean, isEmailSent5days: Boolean, isEmailSent7days: Boolean, dropLocationId: Option[Long] = None, isEmailSentDropConfirmation: Boolean, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, attemptCountReminderEmails: Int = 0, attemptCountDropOffConfirmationEmails: Int = 0)
  /** GetResult implicit for fetching ReturnBookingRemindersRow objects using plain SQL queries */
  implicit def GetResultReturnBookingRemindersRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Boolean], e3: GR[Option[Long]], e4: GR[java.sql.Timestamp], e5: GR[Int]): GR[ReturnBookingRemindersRow] = GR{
    prs => import prs._
    ReturnBookingRemindersRow(<<[Long], <<[Long], <<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Boolean], <<[Boolean], <<[Boolean], <<?[Long], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int])
  }
  /** Table description of table return_booking_reminders. Objects of this class serve as prototypes for rows in queries. */
  class ReturnBookingReminders(_tableTag: Tag) extends profile.api.Table[ReturnBookingRemindersRow](_tableTag, Some("ecommerce"), "return_booking_reminders") {
    def * = (id :: consignmentId :: hubbedUserId :: hubbedUserParentId :: consignmentNumber :: orderNumber :: firstName :: lastName :: email :: phone :: dropLocationName :: dropLocationStreet1 :: dropLocationState :: dropLocationPostcode :: dropLocationOperatingHours :: dropLocationLat :: dropLocationLon :: courier :: logo :: contactCompanyName :: isEmailSent2days :: isEmailSent5days :: isEmailSent7days :: dropLocationId :: isEmailSentDropConfirmation :: createdAt :: modifiedAt :: attemptCountReminderEmails :: attemptCountDropOffConfirmationEmails :: HNil).mapTo[ReturnBookingRemindersRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(consignmentId) :: Rep.Some(hubbedUserId) :: Rep.Some(hubbedUserParentId) :: consignmentNumber :: orderNumber :: firstName :: lastName :: email :: phone :: dropLocationName :: dropLocationStreet1 :: dropLocationState :: dropLocationPostcode :: dropLocationOperatingHours :: dropLocationLat :: dropLocationLon :: courier :: logo :: contactCompanyName :: Rep.Some(isEmailSent2days) :: Rep.Some(isEmailSent5days) :: Rep.Some(isEmailSent7days) :: dropLocationId :: Rep.Some(isEmailSentDropConfirmation) :: Rep.Some(createdAt) :: Rep.Some(modifiedAt) :: Rep.Some(attemptCountReminderEmails) :: Rep.Some(attemptCountDropOffConfirmationEmails) :: HNil).shaped.<>(r => ReturnBookingRemindersRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Long]].get, r(2).asInstanceOf[Option[Long]].get, r(3).asInstanceOf[Option[Long]].get, r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[String]], r(7).asInstanceOf[Option[String]], r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[String]], r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[Boolean]].get, r(21).asInstanceOf[Option[Boolean]].get, r(22).asInstanceOf[Option[Boolean]].get, r(23).asInstanceOf[Option[Long]], r(24).asInstanceOf[Option[Boolean]].get, r(25).asInstanceOf[Option[java.sql.Timestamp]].get, r(26).asInstanceOf[Option[java.sql.Timestamp]].get, r(27).asInstanceOf[Option[Int]].get, r(28).asInstanceOf[Option[Int]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column hubbed_user_parent_id SqlType(int8) */
    val hubbedUserParentId: Rep[Long] = column[Long]("hubbed_user_parent_id")
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column order_number SqlType(text), Default(None) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("order_number", O.Default(None))
    /** Database column first_name SqlType(text), Default(None) */
    val firstName: Rep[Option[String]] = column[Option[String]]("first_name", O.Default(None))
    /** Database column last_name SqlType(text), Default(None) */
    val lastName: Rep[Option[String]] = column[Option[String]]("last_name", O.Default(None))
    /** Database column email SqlType(text), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Default(None))
    /** Database column phone SqlType(text), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Default(None))
    /** Database column drop_location_name SqlType(text), Default(None) */
    val dropLocationName: Rep[Option[String]] = column[Option[String]]("drop_location_name", O.Default(None))
    /** Database column drop_location_street1 SqlType(text), Default(None) */
    val dropLocationStreet1: Rep[Option[String]] = column[Option[String]]("drop_location_street1", O.Default(None))
    /** Database column drop_location_state SqlType(text), Default(None) */
    val dropLocationState: Rep[Option[String]] = column[Option[String]]("drop_location_state", O.Default(None))
    /** Database column drop_location_postcode SqlType(text), Default(None) */
    val dropLocationPostcode: Rep[Option[String]] = column[Option[String]]("drop_location_postcode", O.Default(None))
    /** Database column drop_location_operating_hours SqlType(text), Default(None) */
    val dropLocationOperatingHours: Rep[Option[String]] = column[Option[String]]("drop_location_operating_hours", O.Default(None))
    /** Database column drop_location_lat SqlType(text), Default(None) */
    val dropLocationLat: Rep[Option[String]] = column[Option[String]]("drop_location_lat", O.Default(None))
    /** Database column drop_location_lon SqlType(text), Default(None) */
    val dropLocationLon: Rep[Option[String]] = column[Option[String]]("drop_location_lon", O.Default(None))
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column logo SqlType(text), Default(None) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Default(None))
    /** Database column contact_company_name SqlType(text), Default(None) */
    val contactCompanyName: Rep[Option[String]] = column[Option[String]]("contact_company_name", O.Default(None))
    /** Database column is_email_sent_2days SqlType(bool) */
    val isEmailSent2days: Rep[Boolean] = column[Boolean]("is_email_sent_2days")
    /** Database column is_email_sent_5days SqlType(bool) */
    val isEmailSent5days: Rep[Boolean] = column[Boolean]("is_email_sent_5days")
    /** Database column is_email_sent_7days SqlType(bool) */
    val isEmailSent7days: Rep[Boolean] = column[Boolean]("is_email_sent_7days")
    /** Database column drop_location_id SqlType(int8), Default(None) */
    val dropLocationId: Rep[Option[Long]] = column[Option[Long]]("drop_location_id", O.Default(None))
    /** Database column is_email_sent_drop_confirmation SqlType(bool) */
    val isEmailSentDropConfirmation: Rep[Boolean] = column[Boolean]("is_email_sent_drop_confirmation")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column attempt_count_reminder_emails SqlType(int4), Default(0) */
    val attemptCountReminderEmails: Rep[Int] = column[Int]("attempt_count_reminder_emails", O.Default(0))
    /** Database column attempt_count_drop_off_confirmation_emails SqlType(int4), Default(0) */
    val attemptCountDropOffConfirmationEmails: Rep[Int] = column[Int]("attempt_count_drop_off_confirmation_emails", O.Default(0))

    /** Foreign key referencing Consignments (database name return_booking_reminders_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("return_booking_reminders_consignment_id_fkey", consignmentId :: HNil, Consignments)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name return_booking_reminders_drop_location_id_fkey) */
    lazy val droplocationsFk = foreignKey("return_booking_reminders_drop_location_id_fkey", dropLocationId :: HNil, Droplocations)(r => Rep.Some(r.id) :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing HubbedUsers (database name return_booking_reminders_hubbed_user_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("return_booking_reminders_hubbed_user_id_fkey", hubbedUserId :: HNil, HubbedUsers)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ReturnBookingReminders */
  lazy val ReturnBookingReminders = new TableQuery(tag => new ReturnBookingReminders(tag))
}
