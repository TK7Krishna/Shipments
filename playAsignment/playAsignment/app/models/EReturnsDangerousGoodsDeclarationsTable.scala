package models
// AUTO-GENERATED Slick data model for table EReturnsDangerousGoodsDeclarations
trait EReturnsDangerousGoodsDeclarationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EReturnsDangerousGoodsDeclarations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentid Database column consignmentid SqlType(int8)
   *  @param signature Database column signature SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class EReturnsDangerousGoodsDeclarationsRow(id: Long, consignmentid: Long, signature: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching EReturnsDangerousGoodsDeclarationsRow objects using plain SQL queries */
  implicit def GetResultEReturnsDangerousGoodsDeclarationsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[EReturnsDangerousGoodsDeclarationsRow] = GR{
    prs => import prs._
    EReturnsDangerousGoodsDeclarationsRow.tupled((<<[Long], <<[Long], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table e_returns_dangerous_goods_declarations. Objects of this class serve as prototypes for rows in queries. */
  class EReturnsDangerousGoodsDeclarations(_tableTag: Tag) extends profile.api.Table[EReturnsDangerousGoodsDeclarationsRow](_tableTag, Some("seven_eleven"), "e_returns_dangerous_goods_declarations") {
    def * = (id, consignmentid, signature, createdAt) <> (EReturnsDangerousGoodsDeclarationsRow.tupled, EReturnsDangerousGoodsDeclarationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentid), signature, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> EReturnsDangerousGoodsDeclarationsRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentid SqlType(int8) */
    val consignmentid: Rep[Long] = column[Long]("consignmentid")
    /** Database column signature SqlType(text), Default(None) */
    val signature: Rep[Option[String]] = column[Option[String]]("signature", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Consignments (database name ereturns_dangerous_goods_declarations_consignmentid_fkey) */
    lazy val consignmentsFk = foreignKey("ereturns_dangerous_goods_declarations_consignmentid_fkey", consignmentid, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EReturnsDangerousGoodsDeclarations */
  lazy val EReturnsDangerousGoodsDeclarations = new TableQuery(tag => new EReturnsDangerousGoodsDeclarations(tag))
}
