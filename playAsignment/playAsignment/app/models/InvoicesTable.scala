package models
// AUTO-GENERATED Slick data model for table Invoices
trait InvoicesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Invoices
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param xeroId Database column xero_id SqlType(text), Default(None)
   *  @param invoiceType Database column invoice_type SqlType(text)
   *  @param contact Database column contact SqlType(int8)
   *  @param issueDate Database column issue_date SqlType(timestamp)
   *  @param dueDate Database column due_date SqlType(timestamp)
   *  @param lineAmountType Database column line_amount_type SqlType(text) */
  case class InvoicesRow(id: Long, xeroId: Option[String] = None, invoiceType: String, contact: Long, issueDate: java.sql.Timestamp, dueDate: java.sql.Timestamp, lineAmountType: String)
  /** GetResult implicit for fetching InvoicesRow objects using plain SQL queries */
  implicit def GetResultInvoicesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[InvoicesRow] = GR{
    prs => import prs._
    InvoicesRow.tupled((<<[Long], <<?[String], <<[String], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table invoices. Objects of this class serve as prototypes for rows in queries. */
  class Invoices(_tableTag: Tag) extends profile.api.Table[InvoicesRow](_tableTag, Some("xero"), "invoices") {
    def * = (id, xeroId, invoiceType, contact, issueDate, dueDate, lineAmountType) <> (InvoicesRow.tupled, InvoicesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), xeroId, Rep.Some(invoiceType), Rep.Some(contact), Rep.Some(issueDate), Rep.Some(dueDate), Rep.Some(lineAmountType))).shaped.<>({r=>import r._; _1.map(_=> InvoicesRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column xero_id SqlType(text), Default(None) */
    val xeroId: Rep[Option[String]] = column[Option[String]]("xero_id", O.Default(None))
    /** Database column invoice_type SqlType(text) */
    val invoiceType: Rep[String] = column[String]("invoice_type")
    /** Database column contact SqlType(int8) */
    val contact: Rep[Long] = column[Long]("contact")
    /** Database column issue_date SqlType(timestamp) */
    val issueDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("issue_date")
    /** Database column due_date SqlType(timestamp) */
    val dueDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("due_date")
    /** Database column line_amount_type SqlType(text) */
    val lineAmountType: Rep[String] = column[String]("line_amount_type")

    /** Foreign key referencing Contacts (database name invoices_contact_fkey) */
    lazy val contactsFk = foreignKey("invoices_contact_fkey", contact, Contacts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Invoices */
  lazy val Invoices = new TableQuery(tag => new Invoices(tag))
}
