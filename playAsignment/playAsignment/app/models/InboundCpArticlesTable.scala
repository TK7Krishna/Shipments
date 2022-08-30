package models
// AUTO-GENERATED Slick data model for table InboundCpArticles
trait InboundCpArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InboundCpArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignment Database column consignment SqlType(int8)
   *  @param labelNumber Database column label_number SqlType(text) */
  case class InboundCpArticlesRow(id: Long, consignment: Long, labelNumber: String)
  /** GetResult implicit for fetching InboundCpArticlesRow objects using plain SQL queries */
  implicit def GetResultInboundCpArticlesRow(implicit e0: GR[Long], e1: GR[String]): GR[InboundCpArticlesRow] = GR{
    prs => import prs._
    InboundCpArticlesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table inbound_cp_articles. Objects of this class serve as prototypes for rows in queries. */
  class InboundCpArticles(_tableTag: Tag) extends profile.api.Table[InboundCpArticlesRow](_tableTag, "inbound_cp_articles") {
    def * = (id, consignment, labelNumber) <> (InboundCpArticlesRow.tupled, InboundCpArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignment), Rep.Some(labelNumber))).shaped.<>({r=>import r._; _1.map(_=> InboundCpArticlesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment SqlType(int8) */
    val consignment: Rep[Long] = column[Long]("consignment")
    /** Database column label_number SqlType(text) */
    val labelNumber: Rep[String] = column[String]("label_number")

    /** Foreign key referencing InboundCpConsignments (database name inbound_cp_articles_consignment_fkey) */
    lazy val inboundCpConsignmentsFk = foreignKey("inbound_cp_articles_consignment_fkey", consignment, InboundCpConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InboundCpArticles */
  lazy val InboundCpArticles = new TableQuery(tag => new InboundCpArticles(tag))
}
