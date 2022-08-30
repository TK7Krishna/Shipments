package models
// AUTO-GENERATED Slick data model for table OutboundArticles
trait OutboundArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table OutboundArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param barcode Database column barcode SqlType(text)
   *  @param isExported Database column is_exported SqlType(bool), Default(false)
   *  @param attemptCount Database column attempt_count SqlType(int4), Default(Some(0))
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None) */
  case class OutboundArticlesRow(id: Long, consignmentId: Long, barcode: String, isExported: Boolean = false, attemptCount: Option[Int] = Some(0), createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching OutboundArticlesRow objects using plain SQL queries */
  implicit def GetResultOutboundArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[Option[Int]], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]]): GR[OutboundArticlesRow] = GR{
    prs => import prs._
    OutboundArticlesRow.tupled((<<[Long], <<[Long], <<[String], <<[Boolean], <<?[Int], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table outbound_articles. Objects of this class serve as prototypes for rows in queries. */
  class OutboundArticles(_tableTag: Tag) extends profile.api.Table[OutboundArticlesRow](_tableTag, Some("pakpobox"), "outbound_articles") {
    def * = (id, consignmentId, barcode, isExported, attemptCount, createdAt, modifiedAt) <> (OutboundArticlesRow.tupled, OutboundArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(barcode), Rep.Some(isExported), attemptCount, Rep.Some(createdAt), modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> OutboundArticlesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column barcode SqlType(text) */
    val barcode: Rep[String] = column[String]("barcode")
    /** Database column is_exported SqlType(bool), Default(false) */
    val isExported: Rep[Boolean] = column[Boolean]("is_exported", O.Default(false))
    /** Database column attempt_count SqlType(int4), Default(Some(0)) */
    val attemptCount: Rep[Option[Int]] = column[Option[Int]]("attempt_count", O.Default(Some(0)))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))

    /** Foreign key referencing OutboundConsignments (database name fk_outbound_article_consignment_id) */
    lazy val outboundConsignmentsFk = foreignKey("fk_outbound_article_consignment_id", consignmentId, OutboundConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OutboundArticles */
  lazy val OutboundArticles = new TableQuery(tag => new OutboundArticles(tag))
}
