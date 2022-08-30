package models
// AUTO-GENERATED Slick data model for table ExternalCourierDangerousGoodsDeclarations
trait ExternalCourierDangerousGoodsDeclarationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ExternalCourierDangerousGoodsDeclarations
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentid Database column consignmentid SqlType(int8)
   *  @param signature Database column signature SqlType(text), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class ExternalCourierDangerousGoodsDeclarationsRow(id: Long, consignmentid: Long, signature: Option[String] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching ExternalCourierDangerousGoodsDeclarationsRow objects using plain SQL queries */
  implicit def GetResultExternalCourierDangerousGoodsDeclarationsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[ExternalCourierDangerousGoodsDeclarationsRow] = GR{
    prs => import prs._
    ExternalCourierDangerousGoodsDeclarationsRow.tupled((<<[Long], <<[Long], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table external_courier_dangerous_goods_declarations. Objects of this class serve as prototypes for rows in queries. */
  class ExternalCourierDangerousGoodsDeclarations(_tableTag: Tag) extends profile.api.Table[ExternalCourierDangerousGoodsDeclarationsRow](_tableTag, Some("seven_eleven"), "external_courier_dangerous_goods_declarations") {
    def * = (id, consignmentid, signature, createdAt) <> (ExternalCourierDangerousGoodsDeclarationsRow.tupled, ExternalCourierDangerousGoodsDeclarationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentid), signature, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> ExternalCourierDangerousGoodsDeclarationsRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentid SqlType(int8) */
    val consignmentid: Rep[Long] = column[Long]("consignmentid")
    /** Database column signature SqlType(text), Default(None) */
    val signature: Rep[Option[String]] = column[Option[String]]("signature", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Consignments (database name external_courier_dangerous_goods_declaration_consignmentid_fkey) */
    lazy val consignmentsFk = foreignKey("external_courier_dangerous_goods_declaration_consignmentid_fkey", consignmentid, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ExternalCourierDangerousGoodsDeclarations */
  lazy val ExternalCourierDangerousGoodsDeclarations = new TableQuery(tag => new ExternalCourierDangerousGoodsDeclarations(tag))
}
