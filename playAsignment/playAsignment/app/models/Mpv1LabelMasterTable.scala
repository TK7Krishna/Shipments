package models
// AUTO-GENERATED Slick data model for table Mpv1LabelMaster
trait Mpv1LabelMasterTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Mpv1LabelMaster
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param nscCode Database column nsc_code SqlType(varchar), Length(10,true), Default(None)
   *  @param nscDescription Database column nsc_description SqlType(varchar), Length(100,true), Default(None)
   *  @param productCode Database column product_code SqlType(varchar), Length(10,true), Default(None)
   *  @param productDescription Database column product_description SqlType(varchar), Length(100,true), Default(None)
   *  @param serviceCode Database column service_code SqlType(varchar), Length(10,true), Default(None)
   *  @param serviceDescription Database column service_description SqlType(varchar), Length(100,true), Default(None)
   *  @param physicalWeightStart Database column physical_weight_start SqlType(numeric), Default(None)
   *  @param physicalWeightEnd Database column physical_weight_end SqlType(numeric), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamp), Default(None)
   *  @param modifiedAt Database column modified_at SqlType(timestamp), Default(None) */
  case class Mpv1LabelMasterRow(id: Long, nscCode: Option[String] = None, nscDescription: Option[String] = None, productCode: Option[String] = None, productDescription: Option[String] = None, serviceCode: Option[String] = None, serviceDescription: Option[String] = None, physicalWeightStart: Option[scala.math.BigDecimal] = None, physicalWeightEnd: Option[scala.math.BigDecimal] = None, createdAt: Option[java.sql.Timestamp] = None, modifiedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching Mpv1LabelMasterRow objects using plain SQL queries */
  implicit def GetResultMpv1LabelMasterRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]]): GR[Mpv1LabelMasterRow] = GR{
    prs => import prs._
    Mpv1LabelMasterRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mpv1_label_master. Objects of this class serve as prototypes for rows in queries. */
  class Mpv1LabelMaster(_tableTag: Tag) extends profile.api.Table[Mpv1LabelMasterRow](_tableTag, Some("ecommerce"), "mpv1_label_master") {
    def * = (id, nscCode, nscDescription, productCode, productDescription, serviceCode, serviceDescription, physicalWeightStart, physicalWeightEnd, createdAt, modifiedAt) <> (Mpv1LabelMasterRow.tupled, Mpv1LabelMasterRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), nscCode, nscDescription, productCode, productDescription, serviceCode, serviceDescription, physicalWeightStart, physicalWeightEnd, createdAt, modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> Mpv1LabelMasterRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column nsc_code SqlType(varchar), Length(10,true), Default(None) */
    val nscCode: Rep[Option[String]] = column[Option[String]]("nsc_code", O.Length(10,varying=true), O.Default(None))
    /** Database column nsc_description SqlType(varchar), Length(100,true), Default(None) */
    val nscDescription: Rep[Option[String]] = column[Option[String]]("nsc_description", O.Length(100,varying=true), O.Default(None))
    /** Database column product_code SqlType(varchar), Length(10,true), Default(None) */
    val productCode: Rep[Option[String]] = column[Option[String]]("product_code", O.Length(10,varying=true), O.Default(None))
    /** Database column product_description SqlType(varchar), Length(100,true), Default(None) */
    val productDescription: Rep[Option[String]] = column[Option[String]]("product_description", O.Length(100,varying=true), O.Default(None))
    /** Database column service_code SqlType(varchar), Length(10,true), Default(None) */
    val serviceCode: Rep[Option[String]] = column[Option[String]]("service_code", O.Length(10,varying=true), O.Default(None))
    /** Database column service_description SqlType(varchar), Length(100,true), Default(None) */
    val serviceDescription: Rep[Option[String]] = column[Option[String]]("service_description", O.Length(100,varying=true), O.Default(None))
    /** Database column physical_weight_start SqlType(numeric), Default(None) */
    val physicalWeightStart: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("physical_weight_start", O.Default(None))
    /** Database column physical_weight_end SqlType(numeric), Default(None) */
    val physicalWeightEnd: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("physical_weight_end", O.Default(None))
    /** Database column created_at SqlType(timestamp), Default(None) */
    val createdAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column modified_at SqlType(timestamp), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
  }
  /** Collection-like TableQuery object for table Mpv1LabelMaster */
  lazy val Mpv1LabelMaster = new TableQuery(tag => new Mpv1LabelMaster(tag))
}
