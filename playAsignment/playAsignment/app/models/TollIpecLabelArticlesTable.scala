package models
// AUTO-GENERATED Slick data model for table TollIpecLabelArticles
trait TollIpecLabelArticlesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollIpecLabelArticles
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param label Database column label SqlType(int8)
   *  @param sscc Database column sscc SqlType(text)
   *  @param lineWeightKgs Database column line_weight_kgs SqlType(numeric)
   *  @param lineCommodityCode Database column line_commodity_code SqlType(text), Default(None)
   *  @param dangerousGoods Database column dangerous_goods SqlType(bool) */
  case class TollIpecLabelArticlesRow(id: Long, label: Long, sscc: String, lineWeightKgs: scala.math.BigDecimal, lineCommodityCode: Option[String] = None, dangerousGoods: Boolean)
  /** GetResult implicit for fetching TollIpecLabelArticlesRow objects using plain SQL queries */
  implicit def GetResultTollIpecLabelArticlesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[Option[String]], e4: GR[Boolean]): GR[TollIpecLabelArticlesRow] = GR{
    prs => import prs._
    TollIpecLabelArticlesRow.tupled((<<[Long], <<[Long], <<[String], <<[scala.math.BigDecimal], <<?[String], <<[Boolean]))
  }
  /** Table description of table toll_ipec_label_articles. Objects of this class serve as prototypes for rows in queries. */
  class TollIpecLabelArticles(_tableTag: Tag) extends profile.api.Table[TollIpecLabelArticlesRow](_tableTag, "toll_ipec_label_articles") {
    def * = (id, label, sscc, lineWeightKgs, lineCommodityCode, dangerousGoods) <> (TollIpecLabelArticlesRow.tupled, TollIpecLabelArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(label), Rep.Some(sscc), Rep.Some(lineWeightKgs), lineCommodityCode, Rep.Some(dangerousGoods))).shaped.<>({r=>import r._; _1.map(_=> TollIpecLabelArticlesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column label SqlType(int8) */
    val label: Rep[Long] = column[Long]("label")
    /** Database column sscc SqlType(text) */
    val sscc: Rep[String] = column[String]("sscc")
    /** Database column line_weight_kgs SqlType(numeric) */
    val lineWeightKgs: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("line_weight_kgs")
    /** Database column line_commodity_code SqlType(text), Default(None) */
    val lineCommodityCode: Rep[Option[String]] = column[Option[String]]("line_commodity_code", O.Default(None))
    /** Database column dangerous_goods SqlType(bool) */
    val dangerousGoods: Rep[Boolean] = column[Boolean]("dangerous_goods")

    /** Foreign key referencing TollIpecLabels (database name toll_ipec_label_articles_label_fkey) */
    lazy val tollIpecLabelsFk = foreignKey("toll_ipec_label_articles_label_fkey", label, TollIpecLabels)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TollIpecLabelArticles */
  lazy val TollIpecLabelArticles = new TableQuery(tag => new TollIpecLabelArticles(tag))
}
