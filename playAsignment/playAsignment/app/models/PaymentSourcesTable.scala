package models
// AUTO-GENERATED Slick data model for table PaymentSources
trait PaymentSourcesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PaymentSources
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param sourceType Database column source_type SqlType(text) */
  case class PaymentSourcesRow(id: Long, sourceType: String)
  /** GetResult implicit for fetching PaymentSourcesRow objects using plain SQL queries */
  implicit def GetResultPaymentSourcesRow(implicit e0: GR[Long], e1: GR[String]): GR[PaymentSourcesRow] = GR{
    prs => import prs._
    PaymentSourcesRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table payment_sources. Objects of this class serve as prototypes for rows in queries. */
  class PaymentSources(_tableTag: Tag) extends profile.api.Table[PaymentSourcesRow](_tableTag, Some("moneytech"), "payment_sources") {
    def * = (id, sourceType) <> (PaymentSourcesRow.tupled, PaymentSourcesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(sourceType))).shaped.<>({r=>import r._; _1.map(_=> PaymentSourcesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column source_type SqlType(text) */
    val sourceType: Rep[String] = column[String]("source_type")

    /** Foreign key referencing PaymentSourceTypes (database name payment_sources_source_type_fkey) */
    lazy val paymentSourceTypesFk = foreignKey("payment_sources_source_type_fkey", sourceType, PaymentSourceTypes)(r => r.name, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PaymentSources */
  lazy val PaymentSources = new TableQuery(tag => new PaymentSources(tag))
}
