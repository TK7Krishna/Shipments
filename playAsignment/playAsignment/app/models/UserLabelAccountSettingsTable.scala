package models
// AUTO-GENERATED Slick data model for table UserLabelAccountSettings
trait UserLabelAccountSettingsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UserLabelAccountSettings
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param serviceTypeId Database column service_type_id SqlType(int4)
   *  @param accountCustomerName Database column account_customer_name SqlType(text)
   *  @param accountNumber Database column account_number SqlType(int4)
   *  @param accountSysid Database column account_sysid SqlType(text)
   *  @param connotePrefix Database column connote_prefix SqlType(int4)
   *  @param connoteStart Database column connote_start SqlType(int4)
   *  @param accountUrl Database column account_url SqlType(text)
   *  @param accountUser Database column account_user SqlType(text)
   *  @param accountPassword Database column account_password SqlType(text)
   *  @param gs1Prefix Database column gs1_prefix SqlType(text)
   *  @param ssccStart Database column sscc_start SqlType(int4)
   *  @param ssccEnd Database column sscc_end SqlType(int4)
   *  @param ssccAi Database column sscc_ai SqlType(int4)
   *  @param ssccExtension Database column sscc_extension SqlType(int4)
   *  @param ssccSerialNumberPrefix Database column sscc_serial_number_prefix SqlType(int4)
   *  @param ssccCompanyPrefix Database column sscc_company_prefix SqlType(int4)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz) */
  case class UserLabelAccountSettingsRow(id: Long, hubbedUserId: Long, serviceTypeId: Int, accountCustomerName: String, accountNumber: Int, accountSysid: String, connotePrefix: Int, connoteStart: Int, accountUrl: String, accountUser: String, accountPassword: String, gs1Prefix: String, ssccStart: Int, ssccEnd: Int, ssccAi: Int, ssccExtension: Int, ssccSerialNumberPrefix: Int, ssccCompanyPrefix: Int, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp)
  /** GetResult implicit for fetching UserLabelAccountSettingsRow objects using plain SQL queries */
  implicit def GetResultUserLabelAccountSettingsRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[UserLabelAccountSettingsRow] = GR{
    prs => import prs._
    UserLabelAccountSettingsRow.tupled((<<[Long], <<[Long], <<[Int], <<[String], <<[Int], <<[String], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table user_label_account_settings. Objects of this class serve as prototypes for rows in queries. */
  class UserLabelAccountSettings(_tableTag: Tag) extends profile.api.Table[UserLabelAccountSettingsRow](_tableTag, Some("test"), "user_label_account_settings") {
    def * = (id, hubbedUserId, serviceTypeId, accountCustomerName, accountNumber, accountSysid, connotePrefix, connoteStart, accountUrl, accountUser, accountPassword, gs1Prefix, ssccStart, ssccEnd, ssccAi, ssccExtension, ssccSerialNumberPrefix, ssccCompanyPrefix, createdAt, modifiedAt) <> (UserLabelAccountSettingsRow.tupled, UserLabelAccountSettingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), Rep.Some(serviceTypeId), Rep.Some(accountCustomerName), Rep.Some(accountNumber), Rep.Some(accountSysid), Rep.Some(connotePrefix), Rep.Some(connoteStart), Rep.Some(accountUrl), Rep.Some(accountUser), Rep.Some(accountPassword), Rep.Some(gs1Prefix), Rep.Some(ssccStart), Rep.Some(ssccEnd), Rep.Some(ssccAi), Rep.Some(ssccExtension), Rep.Some(ssccSerialNumberPrefix), Rep.Some(ssccCompanyPrefix), Rep.Some(createdAt), Rep.Some(modifiedAt))).shaped.<>({r=>import r._; _1.map(_=> UserLabelAccountSettingsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column service_type_id SqlType(int4) */
    val serviceTypeId: Rep[Int] = column[Int]("service_type_id")
    /** Database column account_customer_name SqlType(text) */
    val accountCustomerName: Rep[String] = column[String]("account_customer_name")
    /** Database column account_number SqlType(int4) */
    val accountNumber: Rep[Int] = column[Int]("account_number")
    /** Database column account_sysid SqlType(text) */
    val accountSysid: Rep[String] = column[String]("account_sysid")
    /** Database column connote_prefix SqlType(int4) */
    val connotePrefix: Rep[Int] = column[Int]("connote_prefix")
    /** Database column connote_start SqlType(int4) */
    val connoteStart: Rep[Int] = column[Int]("connote_start")
    /** Database column account_url SqlType(text) */
    val accountUrl: Rep[String] = column[String]("account_url")
    /** Database column account_user SqlType(text) */
    val accountUser: Rep[String] = column[String]("account_user")
    /** Database column account_password SqlType(text) */
    val accountPassword: Rep[String] = column[String]("account_password")
    /** Database column gs1_prefix SqlType(text) */
    val gs1Prefix: Rep[String] = column[String]("gs1_prefix")
    /** Database column sscc_start SqlType(int4) */
    val ssccStart: Rep[Int] = column[Int]("sscc_start")
    /** Database column sscc_end SqlType(int4) */
    val ssccEnd: Rep[Int] = column[Int]("sscc_end")
    /** Database column sscc_ai SqlType(int4) */
    val ssccAi: Rep[Int] = column[Int]("sscc_ai")
    /** Database column sscc_extension SqlType(int4) */
    val ssccExtension: Rep[Int] = column[Int]("sscc_extension")
    /** Database column sscc_serial_number_prefix SqlType(int4) */
    val ssccSerialNumberPrefix: Rep[Int] = column[Int]("sscc_serial_number_prefix")
    /** Database column sscc_company_prefix SqlType(int4) */
    val ssccCompanyPrefix: Rep[Int] = column[Int]("sscc_company_prefix")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")

    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fkey", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table UserLabelAccountSettings */
  lazy val UserLabelAccountSettings = new TableQuery(tag => new UserLabelAccountSettings(tag))
}
