package models
// AUTO-GENERATED Slick data model for table PickupManifestRules
trait PickupManifestRulesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PickupManifestRules
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param courierCode Database column courier_code SqlType(text)
   *  @param manifestDay Database column manifest_day SqlType(text)
   *  @param manifestTime Database column manifest_time SqlType(text)
   *  @param manifestNumber Database column manifest_number SqlType(int4)
   *  @param enabled Database column enabled SqlType(bool), Default(true)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param modifiedAt Database column modified_at SqlType(timestamptz), Default(None)
   *  @param droplocationId Database column droplocation_id SqlType(int8) */
  case class PickupManifestRulesRow(id: Long, courierCode: String, manifestDay: String, manifestTime: String, manifestNumber: Int, enabled: Boolean = true, createdAt: java.sql.Timestamp, modifiedAt: Option[java.sql.Timestamp] = None, droplocationId: Long)
  /** GetResult implicit for fetching PickupManifestRulesRow objects using plain SQL queries */
  implicit def GetResultPickupManifestRulesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[Boolean], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]]): GR[PickupManifestRulesRow] = GR{
    prs => import prs._
    PickupManifestRulesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Int], <<[Boolean], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Long]))
  }
  /** Table description of table pickup_manifest_rules. Objects of this class serve as prototypes for rows in queries. */
  class PickupManifestRules(_tableTag: Tag) extends profile.api.Table[PickupManifestRulesRow](_tableTag, "pickup_manifest_rules") {
    def * = (id, courierCode, manifestDay, manifestTime, manifestNumber, enabled, createdAt, modifiedAt, droplocationId) <> (PickupManifestRulesRow.tupled, PickupManifestRulesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(courierCode), Rep.Some(manifestDay), Rep.Some(manifestTime), Rep.Some(manifestNumber), Rep.Some(enabled), Rep.Some(createdAt), modifiedAt, Rep.Some(droplocationId))).shaped.<>({r=>import r._; _1.map(_=> PickupManifestRulesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column courier_code SqlType(text) */
    val courierCode: Rep[String] = column[String]("courier_code")
    /** Database column manifest_day SqlType(text) */
    val manifestDay: Rep[String] = column[String]("manifest_day")
    /** Database column manifest_time SqlType(text) */
    val manifestTime: Rep[String] = column[String]("manifest_time")
    /** Database column manifest_number SqlType(int4) */
    val manifestNumber: Rep[Int] = column[Int]("manifest_number")
    /** Database column enabled SqlType(bool), Default(true) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled", O.Default(true))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column modified_at SqlType(timestamptz), Default(None) */
    val modifiedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified_at", O.Default(None))
    /** Database column droplocation_id SqlType(int8) */
    val droplocationId: Rep[Long] = column[Long]("droplocation_id")

    /** Foreign key referencing Couriers (database name pickup_manifest_rules_public_couriers_fkey) */
    lazy val couriersFk = foreignKey("pickup_manifest_rules_public_couriers_fkey", courierCode, Couriers)(r => r.code, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name pickup_manifest_rules_droplocation_id_fkey) */
    lazy val droplocationsFk = foreignKey("pickup_manifest_rules_droplocation_id_fkey", droplocationId, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PickupManifestRules */
  lazy val PickupManifestRules = new TableQuery(tag => new PickupManifestRules(tag))
}
