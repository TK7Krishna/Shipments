package models
// AUTO-GENERATED Slick data model for table Consignments
trait ConsignmentsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Consignments
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param receiver Database column receiver SqlType(int8)
   *  @param sender Database column sender SqlType(int8)
   *  @param articles Database column articles SqlType(int8)
   *  @param signaturerequired Database column signaturerequired SqlType(bool)
   *  @param pickupnotes Database column pickupnotes SqlType(text), Default(None)
   *  @param deliverynotes Database column deliverynotes SqlType(text), Default(None)
   *  @param consignmentnumber Database column consignmentnumber SqlType(text)
   *  @param courier Database column courier SqlType(text)
   *  @param createdat Database column createdat SqlType(timestamptz)
   *  @param modifiedat Database column modifiedat SqlType(timestamptz)
   *  @param authenticated Database column authenticated SqlType(timestamptz), Default(None)
   *  @param voided Database column voided SqlType(timestamptz), Default(None)
   *  @param subCourier Database column sub_courier SqlType(int8), Default(None) */
  case class ConsignmentsRow(id: Long, receiver: Long, sender: Long, articles: Long, signaturerequired: Boolean, pickupnotes: Option[String] = None, deliverynotes: Option[String] = None, consignmentnumber: String, courier: String, createdat: java.sql.Timestamp, modifiedat: java.sql.Timestamp, authenticated: Option[java.sql.Timestamp] = None, voided: Option[java.sql.Timestamp] = None, subCourier: Option[Long] = None)
  /** GetResult implicit for fetching ConsignmentsRow objects using plain SQL queries */
  implicit def GetResultConsignmentsRow(implicit e0: GR[Long], e1: GR[Boolean], e2: GR[Option[String]], e3: GR[String], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[Long]]): GR[ConsignmentsRow] = GR{
    prs => import prs._
    ConsignmentsRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long], <<[Boolean], <<?[String], <<?[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long]))
  }
  /** Table description of table consignments. Objects of this class serve as prototypes for rows in queries. */
  class Consignments(_tableTag: Tag) extends profile.api.Table[ConsignmentsRow](_tableTag, "consignments") {
    def * = (id, receiver, sender, articles, signaturerequired, pickupnotes, deliverynotes, consignmentnumber, courier, createdat, modifiedat, authenticated, voided, subCourier) <> (ConsignmentsRow.tupled, ConsignmentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(receiver), Rep.Some(sender), Rep.Some(articles), Rep.Some(signaturerequired), pickupnotes, deliverynotes, Rep.Some(consignmentnumber), Rep.Some(courier), Rep.Some(createdat), Rep.Some(modifiedat), authenticated, voided, subCourier)).shaped.<>({r=>import r._; _1.map(_=> ConsignmentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8.get, _9.get, _10.get, _11.get, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column receiver SqlType(int8) */
    val receiver: Rep[Long] = column[Long]("receiver")
    /** Database column sender SqlType(int8) */
    val sender: Rep[Long] = column[Long]("sender")
    /** Database column articles SqlType(int8) */
    val articles: Rep[Long] = column[Long]("articles")
    /** Database column signaturerequired SqlType(bool) */
    val signaturerequired: Rep[Boolean] = column[Boolean]("signaturerequired")
    /** Database column pickupnotes SqlType(text), Default(None) */
    val pickupnotes: Rep[Option[String]] = column[Option[String]]("pickupnotes", O.Default(None))
    /** Database column deliverynotes SqlType(text), Default(None) */
    val deliverynotes: Rep[Option[String]] = column[Option[String]]("deliverynotes", O.Default(None))
    /** Database column consignmentnumber SqlType(text) */
    val consignmentnumber: Rep[String] = column[String]("consignmentnumber")
    /** Database column courier SqlType(text) */
    val courier: Rep[String] = column[String]("courier")
    /** Database column createdat SqlType(timestamptz) */
    val createdat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("createdat")
    /** Database column modifiedat SqlType(timestamptz) */
    val modifiedat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modifiedat")
    /** Database column authenticated SqlType(timestamptz), Default(None) */
    val authenticated: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("authenticated", O.Default(None))
    /** Database column voided SqlType(timestamptz), Default(None) */
    val voided: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("voided", O.Default(None))
    /** Database column sub_courier SqlType(int8), Default(None) */
    val subCourier: Rep[Option[Long]] = column[Option[Long]]("sub_courier", O.Default(None))

    /** Foreign key referencing ArticleGroups (database name consignments_articles_fkey) */
    lazy val articleGroupsFk = foreignKey("consignments_articles_fkey", articles, ArticleGroups)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Couriers (database name consignments_courier_fkey) */
    lazy val couriersFk = foreignKey("consignments_courier_fkey", courier, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Persons (database name consignments_receiver_fkey) */
    lazy val personsFk3 = foreignKey("consignments_receiver_fkey", receiver, Persons)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Persons (database name consignments_sender_fkey) */
    lazy val personsFk4 = foreignKey("consignments_sender_fkey", sender, Persons)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SubCouriers (database name consignments_sub_courier_fkey) */
    lazy val subCouriersFk = foreignKey("consignments_sub_courier_fkey", subCourier, SubCouriers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (consignmentnumber) (database name consignment_number_trgm) */
    val index1 = index("consignment_number_trgm", consignmentnumber)
    /** Index over (courier,articles) (database name consignments_courier_article_idx) */
    val index2 = index("consignments_courier_article_idx", (courier, articles))
    /** Index over (createdat) (database name consignments_createdat_idx) */
    val index3 = index("consignments_createdat_idx", createdat)
    /** Uniqueness Index over (consignmentnumber,courier) (database name unique_con_courier) */
    val index4 = index("unique_con_courier", (consignmentnumber, courier), unique=true)
  }
  /** Collection-like TableQuery object for table Consignments */
  lazy val Consignments = new TableQuery(tag => new Consignments(tag))
}
