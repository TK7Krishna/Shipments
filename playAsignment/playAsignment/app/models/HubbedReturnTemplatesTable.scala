package models
// AUTO-GENERATED Slick data model for table HubbedReturnTemplates
trait HubbedReturnTemplatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HubbedReturnTemplates
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8)
   *  @param templateName Database column template_name SqlType(varchar), Length(150,true)
   *  @param enabled Database column enabled SqlType(bool), Default(Some(false))
   *  @param createdDate Database column created_date SqlType(timestamptz), Default(None)
   *  @param modifiedDate Database column modified_date SqlType(timestamptz), Default(None) */
  case class HubbedReturnTemplatesRow(id: Long, hubbedUserId: Long, templateName: String, enabled: Option[Boolean] = Some(false), createdDate: Option[java.sql.Timestamp] = None, modifiedDate: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching HubbedReturnTemplatesRow objects using plain SQL queries */
  implicit def GetResultHubbedReturnTemplatesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]], e3: GR[Option[java.sql.Timestamp]]): GR[HubbedReturnTemplatesRow] = GR{
    prs => import prs._
    HubbedReturnTemplatesRow.tupled((<<[Long], <<[Long], <<[String], <<?[Boolean], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table hubbed_return_templates. Objects of this class serve as prototypes for rows in queries. */
  class HubbedReturnTemplates(_tableTag: Tag) extends profile.api.Table[HubbedReturnTemplatesRow](_tableTag, Some("standard_apis"), "hubbed_return_templates") {
    def * = (id, hubbedUserId, templateName, enabled, createdDate, modifiedDate) <> (HubbedReturnTemplatesRow.tupled, HubbedReturnTemplatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId), Rep.Some(templateName), enabled, createdDate, modifiedDate)).shaped.<>({r=>import r._; _1.map(_=> HubbedReturnTemplatesRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")
    /** Database column template_name SqlType(varchar), Length(150,true) */
    val templateName: Rep[String] = column[String]("template_name", O.Length(150,varying=true))
    /** Database column enabled SqlType(bool), Default(Some(false)) */
    val enabled: Rep[Option[Boolean]] = column[Option[Boolean]]("enabled", O.Default(Some(false)))
    /** Database column created_date SqlType(timestamptz), Default(None) */
    val createdDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_date", O.Default(None))
    /** Database column modified_date SqlType(timestamptz), Default(None) */
    val modifiedDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_date", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fk) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fk", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table HubbedReturnTemplates */
  lazy val HubbedReturnTemplates = new TableQuery(tag => new HubbedReturnTemplates(tag))
}
