package models
// AUTO-GENERATED Slick data model for table Quotes
trait QuotesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Quotes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param isRateQuote Database column is_rate_quote SqlType(bool)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param expiresAt Database column expires_at SqlType(timestamptz) */
  case class QuotesRow(id: Long, consignment: Long, isRateQuote: Boolean, createdAt: java.sql.Timestamp, expiresAt: java.sql.Timestamp)
  /** GetResult implicit for fetching QuotesRow objects using plain SQL queries */
  implicit def GetResultQuotesRow(implicit e0: GR[Long], e1: GR[Boolean], e2: GR[java.sql.Timestamp]): GR[QuotesRow] = GR{
    prs => import prs._
    QuotesRow.tupled((<<[Long], <<[Long], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table quotes. Objects of this class serve as prototypes for rows in queries. */
  class Quotes(_tableTag: Tag) extends profile.api.Table[QuotesRow](_tableTag, Some("consumer"), "quotes") {
    def * = (id, consignment, isRateQuote, createdAt, expiresAt) <> (QuotesRow.tupled, QuotesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(isRateQuote), Rep.Some(createdAt), Rep.Some(expiresAt))).shaped.<>({r=>import r._; _1.map(_=> QuotesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column is_rate_quote SqlType(bool) */
    val isRateQuote: Rep[Boolean] = column[Boolean]("is_rate_quote")
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column expires_at SqlType(timestamptz) */
    val expiresAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("expires_at")

    /** Foreign key referencing Consignments (database name quotes_consignment_fkey) */
    lazy val consignmentsFk = foreignKey("quotes_consignment_fkey", consignment, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Quotes */
  lazy val Quotes = new TableQuery(tag => new Quotes(tag))
}
