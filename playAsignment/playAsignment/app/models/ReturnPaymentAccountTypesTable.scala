package models
// AUTO-GENERATED Slick data model for table ReturnPaymentAccountTypes
trait ReturnPaymentAccountTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ReturnPaymentAccountTypes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param accountType Database column account_type SqlType(text), Default(None)
   *  @param status Database column status SqlType(bool), Default(None) */
  case class ReturnPaymentAccountTypesRow(id: Long, accountType: Option[String] = None, status: Option[Boolean] = None)
  /** GetResult implicit for fetching ReturnPaymentAccountTypesRow objects using plain SQL queries */
  implicit def GetResultReturnPaymentAccountTypesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]]): GR[ReturnPaymentAccountTypesRow] = GR{
    prs => import prs._
    ReturnPaymentAccountTypesRow.tupled((<<[Long], <<?[String], <<?[Boolean]))
  }
  /** Table description of table return_payment_account_types. Objects of this class serve as prototypes for rows in queries. */
  class ReturnPaymentAccountTypes(_tableTag: Tag) extends profile.api.Table[ReturnPaymentAccountTypesRow](_tableTag, Some("test"), "return_payment_account_types") {
    def * = (id, accountType, status) <> (ReturnPaymentAccountTypesRow.tupled, ReturnPaymentAccountTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), accountType, status)).shaped.<>({r=>import r._; _1.map(_=> ReturnPaymentAccountTypesRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column account_type SqlType(text), Default(None) */
    val accountType: Rep[Option[String]] = column[Option[String]]("account_type", O.Default(None))
    /** Database column status SqlType(bool), Default(None) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(None))
  }
  /** Collection-like TableQuery object for table ReturnPaymentAccountTypes */
  lazy val ReturnPaymentAccountTypes = new TableQuery(tag => new ReturnPaymentAccountTypes(tag))
}
