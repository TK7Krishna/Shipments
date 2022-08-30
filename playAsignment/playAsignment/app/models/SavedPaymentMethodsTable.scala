package models
// AUTO-GENERATED Slick data model for table SavedPaymentMethods
trait SavedPaymentMethodsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SavedPaymentMethods
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param stripeCustomer Database column stripe_customer SqlType(int8)
   *  @param userId Database column user_id SqlType(int8)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param lastUsed Database column last_used SqlType(timestamptz)
   *  @param deleted Database column deleted SqlType(bool), Default(false) */
  case class SavedPaymentMethodsRow(id: Long, stripeCustomer: Long, userId: Long, description: Option[String] = None, lastUsed: java.sql.Timestamp, deleted: Boolean = false)
  /** GetResult implicit for fetching SavedPaymentMethodsRow objects using plain SQL queries */
  implicit def GetResultSavedPaymentMethodsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Boolean]): GR[SavedPaymentMethodsRow] = GR{
    prs => import prs._
    SavedPaymentMethodsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String], <<[java.sql.Timestamp], <<[Boolean]))
  }
  /** Table description of table saved_payment_methods. Objects of this class serve as prototypes for rows in queries. */
  class SavedPaymentMethods(_tableTag: Tag) extends profile.api.Table[SavedPaymentMethodsRow](_tableTag, Some("consumer"), "saved_payment_methods") {
    def * = (id, stripeCustomer, userId, description, lastUsed, deleted) <> (SavedPaymentMethodsRow.tupled, SavedPaymentMethodsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(stripeCustomer), Rep.Some(userId), description, Rep.Some(lastUsed), Rep.Some(deleted))).shaped.<>({r=>import r._; _1.map(_=> SavedPaymentMethodsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column stripe_customer SqlType(int8) */
    val stripeCustomer: Rep[Long] = column[Long]("stripe_customer")
    /** Database column user_id SqlType(int8) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column last_used SqlType(timestamptz) */
    val lastUsed: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_used")
    /** Database column deleted SqlType(bool), Default(false) */
    val deleted: Rep[Boolean] = column[Boolean]("deleted", O.Default(false))

    /** Foreign key referencing Customers (database name saved_payment_methods_stripe_customer_fkey) */
    lazy val customersFk = foreignKey("saved_payment_methods_stripe_customer_fkey", stripeCustomer, Customers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Users (database name saved_payment_methods_user_id_fkey) */
    lazy val usersFk = foreignKey("saved_payment_methods_user_id_fkey", userId, Users)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SavedPaymentMethods */
  lazy val SavedPaymentMethods = new TableQuery(tag => new SavedPaymentMethods(tag))
}
