package models
// AUTO-GENERATED Slick data model for table EcommerceAccountSettings
trait EcommerceAccountSettingsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceAccountSettings
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param logo Database column logo SqlType(text), Default(None)
   *  @param themeurl Database column themeurl SqlType(text), Default(None)
   *  @param termsofserviceurl Database column termsofserviceurl SqlType(text), Default(None)
   *  @param parcelinstructionsurl Database column parcelinstructionsurl SqlType(text), Default(None)
   *  @param name Database column name SqlType(text), Default(None)
   *  @param website Database column website SqlType(text), Default(None)
   *  @param aboutus Database column aboutus SqlType(text), Default(None)
   *  @param skinbackground Database column skinbackground SqlType(text), Default(None)
   *  @param backgroundcolor Database column backgroundcolor SqlType(text), Default(None)
   *  @param ccLocationMap Database column cc_location_map SqlType(bool), Default(None)
   *  @param returnType Database column return_type SqlType(text), Default(None)
   *  @param title Database column title SqlType(text), Default(None)
   *  @param buttoncolor Database column buttoncolor SqlType(text), Default(None)
   *  @param fontcolor Database column fontcolor SqlType(text), Default(None)
   *  @param headertextcolor Database column headertextcolor SqlType(text), Default(None)
   *  @param stepsbackgroundcolor Database column stepsbackgroundcolor SqlType(text), Default(None)
   *  @param returnpolicy Database column returnpolicy SqlType(text), Default(None) */
  case class EcommerceAccountSettingsRow(id: Long, hubbedUserId: Long, logo: Option[String] = None, themeurl: Option[String] = None, termsofserviceurl: Option[String] = None, parcelinstructionsurl: Option[String] = None, name: Option[String] = None, website: Option[String] = None, aboutus: Option[String] = None, skinbackground: Option[String] = None, backgroundcolor: Option[String] = None, ccLocationMap: Option[Boolean] = None, returnType: Option[String] = None, title: Option[String] = None, buttoncolor: Option[String] = None, fontcolor: Option[String] = None, headertextcolor: Option[String] = None, stepsbackgroundcolor: Option[String] = None, returnpolicy: Option[String] = None)
  /** GetResult implicit for fetching EcommerceAccountSettingsRow objects using plain SQL queries */
  implicit def GetResultEcommerceAccountSettingsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]]): GR[EcommerceAccountSettingsRow] = GR{
    prs => import prs._
    EcommerceAccountSettingsRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table ecommerce_account_settings. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceAccountSettings(_tableTag: Tag) extends profile.api.Table[EcommerceAccountSettingsRow](_tableTag, Some("ecommerce"), "ecommerce_account_settings") {
    def * = (id, hubbedUserId, logo, themeurl, termsofserviceurl, parcelinstructionsurl, name, website, aboutus, skinbackground, backgroundcolor, ccLocationMap, returnType, title, buttoncolor, fontcolor, headertextcolor, stepsbackgroundcolor, returnpolicy) <> (EcommerceAccountSettingsRow.tupled, EcommerceAccountSettingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), logo, themeurl, termsofserviceurl, parcelinstructionsurl, name, website, aboutus, skinbackground, backgroundcolor, ccLocationMap, returnType, title, buttoncolor, fontcolor, headertextcolor, stepsbackgroundcolor, returnpolicy)).shaped.<>({r=>import r._; _1.map(_=> EcommerceAccountSettingsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column logo SqlType(text), Default(None) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Default(None))
    /** Database column themeurl SqlType(text), Default(None) */
    val themeurl: Rep[Option[String]] = column[Option[String]]("themeurl", O.Default(None))
    /** Database column termsofserviceurl SqlType(text), Default(None) */
    val termsofserviceurl: Rep[Option[String]] = column[Option[String]]("termsofserviceurl", O.Default(None))
    /** Database column parcelinstructionsurl SqlType(text), Default(None) */
    val parcelinstructionsurl: Rep[Option[String]] = column[Option[String]]("parcelinstructionsurl", O.Default(None))
    /** Database column name SqlType(text), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(None))
    /** Database column website SqlType(text), Default(None) */
    val website: Rep[Option[String]] = column[Option[String]]("website", O.Default(None))
    /** Database column aboutus SqlType(text), Default(None) */
    val aboutus: Rep[Option[String]] = column[Option[String]]("aboutus", O.Default(None))
    /** Database column skinbackground SqlType(text), Default(None) */
    val skinbackground: Rep[Option[String]] = column[Option[String]]("skinbackground", O.Default(None))
    /** Database column backgroundcolor SqlType(text), Default(None) */
    val backgroundcolor: Rep[Option[String]] = column[Option[String]]("backgroundcolor", O.Default(None))
    /** Database column cc_location_map SqlType(bool), Default(None) */
    val ccLocationMap: Rep[Option[Boolean]] = column[Option[Boolean]]("cc_location_map", O.Default(None))
    /** Database column return_type SqlType(text), Default(None) */
    val returnType: Rep[Option[String]] = column[Option[String]]("return_type", O.Default(None))
    /** Database column title SqlType(text), Default(None) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Default(None))
    /** Database column buttoncolor SqlType(text), Default(None) */
    val buttoncolor: Rep[Option[String]] = column[Option[String]]("buttoncolor", O.Default(None))
    /** Database column fontcolor SqlType(text), Default(None) */
    val fontcolor: Rep[Option[String]] = column[Option[String]]("fontcolor", O.Default(None))
    /** Database column headertextcolor SqlType(text), Default(None) */
    val headertextcolor: Rep[Option[String]] = column[Option[String]]("headertextcolor", O.Default(None))
    /** Database column stepsbackgroundcolor SqlType(text), Default(None) */
    val stepsbackgroundcolor: Rep[Option[String]] = column[Option[String]]("stepsbackgroundcolor", O.Default(None))
    /** Database column returnpolicy SqlType(text), Default(None) */
    val returnpolicy: Rep[Option[String]] = column[Option[String]]("returnpolicy", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name fk_ecommerce_account_settings_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("fk_ecommerce_account_settings_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceAccountSettings */
  lazy val EcommerceAccountSettings = new TableQuery(tag => new EcommerceAccountSettings(tag))
}
