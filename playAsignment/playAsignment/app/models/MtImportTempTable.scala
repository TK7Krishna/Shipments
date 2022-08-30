package models
// AUTO-GENERATED Slick data model for table MtImportTemp
trait MtImportTempTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table MtImportTemp
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param cons Database column cons SqlType(text), Default(None)
   *  @param courier Database column courier SqlType(text), Default(None)
   *  @param dlb Database column dlb SqlType(int8), Default(None)
   *  @param barcode Database column barcode SqlType(text), Default(None)
   *  @param card Database column card SqlType(text), Default(None)
   *  @param checkoutTime Database column checkout_time SqlType(timestamptz), Default(None)
   *  @param returnTime Database column return_time SqlType(timestamptz), Default(None) */
  case class MtImportTempRow(id: Long, cons: Option[String] = None, courier: Option[String] = None, dlb: Option[Long] = None, barcode: Option[String] = None, card: Option[String] = None, checkoutTime: Option[java.sql.Timestamp] = None, returnTime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching MtImportTempRow objects using plain SQL queries */
  implicit def GetResultMtImportTempRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[Option[java.sql.Timestamp]]): GR[MtImportTempRow] = GR{
    prs => import prs._
    MtImportTempRow.tupled((<<[Long], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mt_import_temp. Objects of this class serve as prototypes for rows in queries. */
  class MtImportTemp(_tableTag: Tag) extends profile.api.Table[MtImportTempRow](_tableTag, "mt_import_temp") {
    def * = (id, cons, courier, dlb, barcode, card, checkoutTime, returnTime) <> (MtImportTempRow.tupled, MtImportTempRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), cons, courier, dlb, barcode, card, checkoutTime, returnTime)).shaped.<>({r=>import r._; _1.map(_=> MtImportTempRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column cons SqlType(text), Default(None) */
    val cons: Rep[Option[String]] = column[Option[String]]("cons", O.Default(None))
    /** Database column courier SqlType(text), Default(None) */
    val courier: Rep[Option[String]] = column[Option[String]]("courier", O.Default(None))
    /** Database column dlb SqlType(int8), Default(None) */
    val dlb: Rep[Option[Long]] = column[Option[Long]]("dlb", O.Default(None))
    /** Database column barcode SqlType(text), Default(None) */
    val barcode: Rep[Option[String]] = column[Option[String]]("barcode", O.Default(None))
    /** Database column card SqlType(text), Default(None) */
    val card: Rep[Option[String]] = column[Option[String]]("card", O.Default(None))
    /** Database column checkout_time SqlType(timestamptz), Default(None) */
    val checkoutTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("checkout_time", O.Default(None))
    /** Database column return_time SqlType(timestamptz), Default(None) */
    val returnTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("return_time", O.Default(None))
  }
  /** Collection-like TableQuery object for table MtImportTemp */
  lazy val MtImportTemp = new TableQuery(tag => new MtImportTemp(tag))
}
