package models
// AUTO-GENERATED Slick data model for table Templates
trait TemplatesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Templates
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param templateCode Database column template_code SqlType(text), Default(None)
   *  @param subject Database column subject SqlType(text), Default(None)
   *  @param macros Database column macros SqlType(text), Default(None)
   *  @param body Database column body SqlType(text), Default(None)
   *  @param status Database column status SqlType(bool), Default(None)
   *  @param templateType Database column template_type SqlType(text), Default(None)
   *  @param updatedAt Database column updated_at SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(text), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None) */
  case class TemplatesRow(id: Long, templateCode: Option[String] = None, subject: Option[String] = None, macros: Option[String] = None, body: Option[String] = None, status: Option[Boolean] = None, templateType: Option[String] = None, updatedAt: Option[String] = None, createdAt: Option[String] = None, hubbedUserId: Option[Long] = None)
  /** GetResult implicit for fetching TemplatesRow objects using plain SQL queries */
  implicit def GetResultTemplatesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]], e3: GR[Option[Long]]): GR[TemplatesRow] = GR{
    prs => import prs._
    TemplatesRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[Long]))
  }
  /** Table description of table templates. Objects of this class serve as prototypes for rows in queries. */
  class Templates(_tableTag: Tag) extends profile.api.Table[TemplatesRow](_tableTag, Some("standard_apis"), "templates") {
    def * = (id, templateCode, subject, macros, body, status, templateType, updatedAt, createdAt, hubbedUserId) <> (TemplatesRow.tupled, TemplatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), templateCode, subject, macros, body, status, templateType, updatedAt, createdAt, hubbedUserId)).shaped.<>({r=>import r._; _1.map(_=> TemplatesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column template_code SqlType(text), Default(None) */
    val templateCode: Rep[Option[String]] = column[Option[String]]("template_code", O.Default(None))
    /** Database column subject SqlType(text), Default(None) */
    val subject: Rep[Option[String]] = column[Option[String]]("subject", O.Default(None))
    /** Database column macros SqlType(text), Default(None) */
    val macros: Rep[Option[String]] = column[Option[String]]("macros", O.Default(None))
    /** Database column body SqlType(text), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Default(None))
    /** Database column status SqlType(bool), Default(None) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(None))
    /** Database column template_type SqlType(text), Default(None) */
    val templateType: Rep[Option[String]] = column[Option[String]]("template_type", O.Default(None))
    /** Database column updated_at SqlType(text), Default(None) */
    val updatedAt: Rep[Option[String]] = column[Option[String]]("updated_at", O.Default(None))
    /** Database column created_at SqlType(text), Default(None) */
    val createdAt: Rep[Option[String]] = column[Option[String]]("created_at", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name hubbed_user_id_fk) */
    lazy val hubbedUsersFk = foreignKey("hubbed_user_id_fk", hubbedUserId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Templates */
  lazy val Templates = new TableQuery(tag => new Templates(tag))
}
