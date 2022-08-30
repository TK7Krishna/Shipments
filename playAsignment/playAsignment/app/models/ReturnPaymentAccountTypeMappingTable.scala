package models
// AUTO-GENERATED Slick data model for table ReturnPaymentAccountTypeMapping
trait ReturnPaymentAccountTypeMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ReturnPaymentAccountTypeMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param returnPaymentAccountTypeId Database column return_payment_account_type_id SqlType(int8), Default(None)
   *  @param roleId Database column role_id SqlType(int8), Default(None)
   *  @param status Database column status SqlType(bool), Default(None) */
  case class ReturnPaymentAccountTypeMappingRow(id: Long, returnPaymentAccountTypeId: Option[Long] = None, roleId: Option[Long] = None, status: Option[Boolean] = None)
  /** GetResult implicit for fetching ReturnPaymentAccountTypeMappingRow objects using plain SQL queries */
  implicit def GetResultReturnPaymentAccountTypeMappingRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[Boolean]]): GR[ReturnPaymentAccountTypeMappingRow] = GR{
    prs => import prs._
    ReturnPaymentAccountTypeMappingRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[Boolean]))
  }
  /** Table description of table return_payment_account_type_mapping. Objects of this class serve as prototypes for rows in queries. */
  class ReturnPaymentAccountTypeMapping(_tableTag: Tag) extends profile.api.Table[ReturnPaymentAccountTypeMappingRow](_tableTag, Some("test"), "return_payment_account_type_mapping") {
    def * = (id, returnPaymentAccountTypeId, roleId, status) <> (ReturnPaymentAccountTypeMappingRow.tupled, ReturnPaymentAccountTypeMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), returnPaymentAccountTypeId, roleId, status)).shaped.<>({r=>import r._; _1.map(_=> ReturnPaymentAccountTypeMappingRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column return_payment_account_type_id SqlType(int8), Default(None) */
    val returnPaymentAccountTypeId: Rep[Option[Long]] = column[Option[Long]]("return_payment_account_type_id", O.Default(None))
    /** Database column role_id SqlType(int8), Default(None) */
    val roleId: Rep[Option[Long]] = column[Option[Long]]("role_id", O.Default(None))
    /** Database column status SqlType(bool), Default(None) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(None))

    /** Foreign key referencing HubbedRoles (database name role_id_fkey) */
    lazy val hubbedRolesFk = foreignKey("role_id_fkey", roleId, HubbedRoles)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (returnPaymentAccountTypeId) (database name unq_return_payment_account_type_mapping_return_payment_account_) */
    val index1 = index("unq_return_payment_account_type_mapping_return_payment_account_", returnPaymentAccountTypeId, unique=true)
  }
  /** Collection-like TableQuery object for table ReturnPaymentAccountTypeMapping */
  lazy val ReturnPaymentAccountTypeMapping = new TableQuery(tag => new ReturnPaymentAccountTypeMapping(tag))
}
