package models
// AUTO-GENERATED Slick data model for table DroplocationAdditionalAttributes
trait DroplocationAdditionalAttributesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DroplocationAdditionalAttributes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param droplocationId Database column droplocation_id SqlType(int8), Default(None)
   *  @param locationtypeId Database column locationtype_id SqlType(int8), Default(None)
   *  @param specialInstructions Database column special_instructions SqlType(text), Default(None)
   *  @param channelId Database column channel_id SqlType(int8), Default(None)
   *  @param serviceType Database column service_type SqlType(text), Default(None)
   *  @param openingdays Database column openingdays SqlType(text), Default(None)
   *  @param showonmap Database column showonmap SqlType(bool), Default(None)
   *  @param printingEnabled Database column printing_enabled SqlType(bool), Default(false)
   *  @param packingEnabled Database column packing_enabled SqlType(bool), Default(false) */
  case class DroplocationAdditionalAttributesRow(id: Long, droplocationId: Option[Long] = None, locationtypeId: Option[Long] = None, specialInstructions: Option[String] = None, channelId: Option[Long] = None, serviceType: Option[String] = None, openingdays: Option[String] = None, showonmap: Option[Boolean] = None, printingEnabled: Boolean = false, packingEnabled: Boolean = false)
  /** GetResult implicit for fetching DroplocationAdditionalAttributesRow objects using plain SQL queries */
  implicit def GetResultDroplocationAdditionalAttributesRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[Boolean]): GR[DroplocationAdditionalAttributesRow] = GR{
    prs => import prs._
    DroplocationAdditionalAttributesRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[String], <<?[Long], <<?[String], <<?[String], <<?[Boolean], <<[Boolean], <<[Boolean]))
  }
  /** Table description of table droplocation_additional_attributes. Objects of this class serve as prototypes for rows in queries. */
  class DroplocationAdditionalAttributes(_tableTag: Tag) extends profile.api.Table[DroplocationAdditionalAttributesRow](_tableTag, Some("ecommerce"), "droplocation_additional_attributes") {
    def * = (id, droplocationId, locationtypeId, specialInstructions, channelId, serviceType, openingdays, showonmap, printingEnabled, packingEnabled) <> (DroplocationAdditionalAttributesRow.tupled, DroplocationAdditionalAttributesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), droplocationId, locationtypeId, specialInstructions, channelId, serviceType, openingdays, showonmap, Rep.Some(printingEnabled), Rep.Some(packingEnabled))).shaped.<>({r=>import r._; _1.map(_=> DroplocationAdditionalAttributesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column droplocation_id SqlType(int8), Default(None) */
    val droplocationId: Rep[Option[Long]] = column[Option[Long]]("droplocation_id", O.Default(None))
    /** Database column locationtype_id SqlType(int8), Default(None) */
    val locationtypeId: Rep[Option[Long]] = column[Option[Long]]("locationtype_id", O.Default(None))
    /** Database column special_instructions SqlType(text), Default(None) */
    val specialInstructions: Rep[Option[String]] = column[Option[String]]("special_instructions", O.Default(None))
    /** Database column channel_id SqlType(int8), Default(None) */
    val channelId: Rep[Option[Long]] = column[Option[Long]]("channel_id", O.Default(None))
    /** Database column service_type SqlType(text), Default(None) */
    val serviceType: Rep[Option[String]] = column[Option[String]]("service_type", O.Default(None))
    /** Database column openingdays SqlType(text), Default(None) */
    val openingdays: Rep[Option[String]] = column[Option[String]]("openingdays", O.Default(None))
    /** Database column showonmap SqlType(bool), Default(None) */
    val showonmap: Rep[Option[Boolean]] = column[Option[Boolean]]("showonmap", O.Default(None))
    /** Database column printing_enabled SqlType(bool), Default(false) */
    val printingEnabled: Rep[Boolean] = column[Boolean]("printing_enabled", O.Default(false))
    /** Database column packing_enabled SqlType(bool), Default(false) */
    val packingEnabled: Rep[Boolean] = column[Boolean]("packing_enabled", O.Default(false))

    /** Foreign key referencing Channel (database name fk_channel_id) */
    lazy val channelFk = foreignKey("fk_channel_id", channelId, Channel)(r => Rep.Some(r.channelId), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name fk_droplocation_id_droplocation) */
    lazy val droplocationsFk = foreignKey("fk_droplocation_id_droplocation", droplocationId, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Locationtype (database name fk_locationtype_id) */
    lazy val locationtypeFk = foreignKey("fk_locationtype_id", locationtypeId, Locationtype)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table DroplocationAdditionalAttributes */
  lazy val DroplocationAdditionalAttributes = new TableQuery(tag => new DroplocationAdditionalAttributes(tag))
}
