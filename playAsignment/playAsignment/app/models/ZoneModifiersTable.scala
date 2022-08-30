package models
// AUTO-GENERATED Slick data model for table ZoneModifiers
trait ZoneModifiersTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ZoneModifiers
   *  @param fromZone Database column from_zone SqlType(int8)
   *  @param toZone Database column to_zone SqlType(int8)
   *  @param delta Database column delta SqlType(int4)
   *  @param kgDelta Database column kg_delta SqlType(int4)
   *  @param productClass Database column product_class SqlType(int8) */
  case class ZoneModifiersRow(fromZone: Long, toZone: Long, delta: Int, kgDelta: Int, productClass: Long)
  /** GetResult implicit for fetching ZoneModifiersRow objects using plain SQL queries */
  implicit def GetResultZoneModifiersRow(implicit e0: GR[Long], e1: GR[Int]): GR[ZoneModifiersRow] = GR{
    prs => import prs._
    ZoneModifiersRow.tupled((<<[Long], <<[Long], <<[Int], <<[Int], <<[Long]))
  }
  /** Table description of table zone_modifiers. Objects of this class serve as prototypes for rows in queries. */
  class ZoneModifiers(_tableTag: Tag) extends profile.api.Table[ZoneModifiersRow](_tableTag, Some("rate_admin"), "zone_modifiers") {
    def * = (fromZone, toZone, delta, kgDelta, productClass) <> (ZoneModifiersRow.tupled, ZoneModifiersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(fromZone), Rep.Some(toZone), Rep.Some(delta), Rep.Some(kgDelta), Rep.Some(productClass))).shaped.<>({r=>import r._; _1.map(_=> ZoneModifiersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column from_zone SqlType(int8) */
    val fromZone: Rep[Long] = column[Long]("from_zone")
    /** Database column to_zone SqlType(int8) */
    val toZone: Rep[Long] = column[Long]("to_zone")
    /** Database column delta SqlType(int4) */
    val delta: Rep[Int] = column[Int]("delta")
    /** Database column kg_delta SqlType(int4) */
    val kgDelta: Rep[Int] = column[Int]("kg_delta")
    /** Database column product_class SqlType(int8) */
    val productClass: Rep[Long] = column[Long]("product_class")

    /** Primary key of ZoneModifiers (database name zone_modifiers_pkey) */
    val pk = primaryKey("zone_modifiers_pkey", (fromZone, toZone, productClass))

    /** Foreign key referencing ProductClass (database name zone_modifiers_product_class_fkey) */
    lazy val productClassFk = foreignKey("zone_modifiers_product_class_fkey", productClass, ProductClass)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Zones (database name zone_modifiers_from_zone_fkey) */
    lazy val zonesFk2 = foreignKey("zone_modifiers_from_zone_fkey", fromZone, Zones)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Zones (database name zone_modifiers_to_zone_fkey) */
    lazy val zonesFk3 = foreignKey("zone_modifiers_to_zone_fkey", toZone, Zones)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ZoneModifiers */
  lazy val ZoneModifiers = new TableQuery(tag => new ZoneModifiers(tag))
}
