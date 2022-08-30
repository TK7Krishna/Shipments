package models
// AUTO-GENERATED Slick data model for table UserLabelAccountSettingsTest
trait UserLabelAccountSettingsTestTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UserLabelAccountSettingsTest
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param serviceTypeId Database column service_type_id SqlType(int8)
   *  @param accountCustomerName Database column account_customer_name SqlType(text)
   *  @param accountNumber Database column account_number SqlType(text)
   *  @param accountSysid Database column account_sysid SqlType(text)
   *  @param connotePrefix Database column connote_prefix SqlType(text)
   *  @param connoteStart Database column connote_start SqlType(text)
   *  @param connoteEnd Database column connote_end SqlType(text)
   *  @param ftpUrl Database column ftp_url SqlType(text), Default(54.153.206.76)
   *  @param ftpUser Database column ftp_user SqlType(text), Default(toll-ftp)
   *  @param ftpPassword Database column ftp_password SqlType(text), Default(toll-ftp123)
   *  @param gs1Prefix Database column gs1_prefix SqlType(text)
   *  @param ssccStart Database column sscc_start SqlType(text)
   *  @param ssccEnd Database column sscc_end SqlType(text)
   *  @param ssccAi Database column sscc_ai SqlType(text)
   *  @param ssccExtension Database column sscc_extension SqlType(text)
   *  @param ssccSerialNumberPrefix Database column sscc_serial_number_prefix SqlType(text)
   *  @param ssccCompanyPrefix Database column sscc_company_prefix SqlType(text)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz)
   *  @param ftpPort Database column ftp_port SqlType(int4), Default(21)
   *  @param currentCanot Database column current_canot SqlType(text), Default(None) */
  case class UserLabelAccountSettingsTestRow(id: Long, hubbedUserId: Long, serviceTypeId: Long, accountCustomerName: String, accountNumber: String, accountSysid: String, connotePrefix: String, connoteStart: String, connoteEnd: String, ftpUrl: String = "54.153.206.76", ftpUser: String = "toll-ftp", ftpPassword: String = "toll-ftp123", gs1Prefix: String, ssccStart: String, ssccEnd: String, ssccAi: String, ssccExtension: String, ssccSerialNumberPrefix: String, ssccCompanyPrefix: String, createdAt: java.sql.Timestamp, modifiedAt: java.sql.Timestamp, ftpPort: Int = 21, currentCanot: Option[String] = None)
  /** GetResult implicit for fetching UserLabelAccountSettingsTestRow objects using plain SQL queries */
  implicit def GetResultUserLabelAccountSettingsTestRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Int], e4: GR[Option[String]]): GR[UserLabelAccountSettingsTestRow] = GR{
    prs => import prs._
    UserLabelAccountSettingsTestRow(<<[Long], <<[Long], <<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<?[String])
  }
  /** Table description of table user_label_account_settings_test. Objects of this class serve as prototypes for rows in queries. */
  class UserLabelAccountSettingsTest(_tableTag: Tag) extends profile.api.Table[UserLabelAccountSettingsTestRow](_tableTag, Some("ecommerce"), "user_label_account_settings_test") {
    def * = (id :: hubbedUserId :: serviceTypeId :: accountCustomerName :: accountNumber :: accountSysid :: connotePrefix :: connoteStart :: connoteEnd :: ftpUrl :: ftpUser :: ftpPassword :: gs1Prefix :: ssccStart :: ssccEnd :: ssccAi :: ssccExtension :: ssccSerialNumberPrefix :: ssccCompanyPrefix :: createdAt :: modifiedAt :: ftpPort :: currentCanot :: HNil).mapTo[UserLabelAccountSettingsTestRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: Rep.Some(hubbedUserId) :: Rep.Some(serviceTypeId) :: Rep.Some(accountCustomerName) :: Rep.Some(accountNumber) :: Rep.Some(accountSysid) :: Rep.Some(connotePrefix) :: Rep.Some(connoteStart) :: Rep.Some(connoteEnd) :: Rep.Some(ftpUrl) :: Rep.Some(ftpUser) :: Rep.Some(ftpPassword) :: Rep.Some(gs1Prefix) :: Rep.Some(ssccStart) :: Rep.Some(ssccEnd) :: Rep.Some(ssccAi) :: Rep.Some(ssccExtension) :: Rep.Some(ssccSerialNumberPrefix) :: Rep.Some(ssccCompanyPrefix) :: Rep.Some(createdAt) :: Rep.Some(modifiedAt) :: Rep.Some(ftpPort) :: currentCanot :: HNil).shaped.<>(r => UserLabelAccountSettingsTestRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Long]].get, r(2).asInstanceOf[Option[Long]].get, r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[String]].get, r(5).asInstanceOf[Option[String]].get, r(6).asInstanceOf[Option[String]].get, r(7).asInstanceOf[Option[String]].get, r(8).asInstanceOf[Option[String]].get, r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]].get, r(12).asInstanceOf[Option[String]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[String]].get, r(15).asInstanceOf[Option[String]].get, r(16).asInstanceOf[Option[String]].get, r(17).asInstanceOf[Option[String]].get, r(18).asInstanceOf[Option[String]].get, r(19).asInstanceOf[Option[java.sql.Timestamp]].get, r(20).asInstanceOf[Option[java.sql.Timestamp]].get, r(21).asInstanceOf[Option[Int]].get, r(22).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column service_type_id SqlType(int8) */
    val serviceTypeId: Rep[Long] = column[Long]("service_type_id")
    /** Database column account_customer_name SqlType(text) */
    val accountCustomerName: Rep[String] = column[String]("account_customer_name")
    /** Database column account_number SqlType(text) */
    val accountNumber: Rep[String] = column[String]("account_number")
    /** Database column account_sysid SqlType(text) */
    val accountSysid: Rep[String] = column[String]("account_sysid")
    /** Database column connote_prefix SqlType(text) */
    val connotePrefix: Rep[String] = column[String]("connote_prefix")
    /** Database column connote_start SqlType(text) */
    val connoteStart: Rep[String] = column[String]("connote_start")
    /** Database column connote_end SqlType(text) */
    val connoteEnd: Rep[String] = column[String]("connote_end")
    /** Database column ftp_url SqlType(text), Default(54.153.206.76) */
    val ftpUrl: Rep[String] = column[String]("ftp_url", O.Default("54.153.206.76"))
    /** Database column ftp_user SqlType(text), Default(toll-ftp) */
    val ftpUser: Rep[String] = column[String]("ftp_user", O.Default("toll-ftp"))
    /** Database column ftp_password SqlType(text), Default(toll-ftp123) */
    val ftpPassword: Rep[String] = column[String]("ftp_password", O.Default("toll-ftp123"))
    /** Database column gs1_prefix SqlType(text) */
    val gs1Prefix: Rep[String] = column[String]("gs1_prefix")
    /** Database column sscc_start SqlType(text) */
    val ssccStart: Rep[String] = column[String]("sscc_start")
    /** Database column sscc_end SqlType(text) */
    val ssccEnd: Rep[String] = column[String]("sscc_end")
    /** Database column sscc_ai SqlType(text) */
    val ssccAi: Rep[String] = column[String]("sscc_ai")
    /** Database column sscc_extension SqlType(text) */
    val ssccExtension: Rep[String] = column[String]("sscc_extension")
    /** Database column sscc_serial_number_prefix SqlType(text) */
    val ssccSerialNumberPrefix: Rep[String] = column[String]("sscc_serial_number_prefix")
    /** Database column sscc_company_prefix SqlType(text) */
    val ssccCompanyPrefix: Rep[String] = column[String]("sscc_company_prefix")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz) */
    val modifiedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified_at")
    /** Database column ftp_port SqlType(int4), Default(21) */
    val ftpPort: Rep[Int] = column[Int]("ftp_port", O.Default(21))
    /** Database column current_canot SqlType(text), Default(None) */
    val currentCanot: Rep[Option[String]] = column[Option[String]]("current_canot", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fkey", hubbedUserId :: HNil, HubbedUsers)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing LabelServiceMaster (database name service_type_id_fkey) */
    lazy val labelServiceMasterFk = foreignKey("service_type_id_fkey", serviceTypeId :: HNil, LabelServiceMaster)(r => r.id :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (hubbedUserId) (database name unique_hubbed_user_test) */
    val index1 = index("unique_hubbed_user_test", hubbedUserId :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table UserLabelAccountSettingsTest */
  lazy val UserLabelAccountSettingsTest = new TableQuery(tag => new UserLabelAccountSettingsTest(tag))
}
