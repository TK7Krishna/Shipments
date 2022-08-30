package models
// AUTO-GENERATED Slick data model for table DangerousGoodsDeclarations
trait DangerousGoodsDeclarationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DangerousGoodsDeclarations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentid Database column consignmentid SqlType(int8)
   *  @param signature Database column signature SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class DangerousGoodsDeclarationsRow(id: Long, consignmentid: Long, signature: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching DangerousGoodsDeclarationsRow objects using plain SQL queries */
  implicit def GetResultDangerousGoodsDeclarationsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[DangerousGoodsDeclarationsRow] = GR{
    prs => import prs._
    DangerousGoodsDeclarationsRow.tupled((<<[Long], <<[Long], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table dangerous_goods_declarations. Objects of this class serve as prototypes for rows in queries. */
  class DangerousGoodsDeclarations(_tableTag: Tag) extends profile.api.Table[DangerousGoodsDeclarationsRow](_tableTag, Some("seven_eleven"), "dangerous_goods_declarations") {
    def * = (id, consignmentid, signature, createdAt) <> (DangerousGoodsDeclarationsRow.tupled, DangerousGoodsDeclarationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentid), signature, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> DangerousGoodsDeclarationsRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentid SqlType(int8) */
    val consignmentid: Rep[Long] = column[Long]("consignmentid")
    /** Database column signature SqlType(text), Default(None) */
    val signature: Rep[Option[String]] = column[Option[String]]("signature", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing OtcConsignments (database name dangerous_goods_declarations_consignmentid_fkey) */
    lazy val otcConsignmentsFk = foreignKey("dangerous_goods_declarations_consignmentid_fkey", consignmentid, OtcConsignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DangerousGoodsDeclarations */
  lazy val DangerousGoodsDeclarations = new TableQuery(tag => new DangerousGoodsDeclarations(tag))
}
