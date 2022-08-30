package models
// AUTO-GENERATED Slick data model for table PrioDepotCodes
trait PrioDepotCodesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PrioDepotCodes
   *  @param id Database column id SqlType(bigserial), AutoInc
   *  @param businessUnit Database column business_unit SqlType(text), Default(None)
   *  @param country Database column country SqlType(text), Default(None)
   *  @param state Database column state SqlType(text), Default(None)
   *  @param postCode Database column post_code SqlType(int4), Default(None)
   *  @param suburb Database column suburb SqlType(text), Default(None)
   *  @param pmsZone Database column pms_zone SqlType(int4), Default(None)
   *  @param local Database column local SqlType(bpchar), Default(None)
   *  @param collectionDepotCode Database column collection_depot_code SqlType(text), Default(None)
   *  @param collectionsDepotName Database column collections_depot_name SqlType(text), Default(None)
   *  @param depotCode Database column depot_code SqlType(text), Default(None)
   *  @param status Database column status SqlType(bool), Default(Some(true))
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class PrioDepotCodesRow(id: Long, businessUnit: Option[String] = None, country: Option[String] = None, state: Option[String] = None, postCode: Option[Int] = None, suburb: Option[String] = None, pmsZone: Option[Int] = None, local: Option[Char] = None, collectionDepotCode: Option[String] = None, collectionsDepotName: Option[String] = None, depotCode: Option[String] = None, status: Option[Boolean] = Some(true), createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching PrioDepotCodesRow objects using plain SQL queries */
  implicit def GetResultPrioDepotCodesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[Option[Char]], e4: GR[Option[Boolean]], e5: GR[java.sql.Timestamp]): GR[PrioDepotCodesRow] = GR{
    prs => import prs._
    PrioDepotCodesRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[String], <<?[Int], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table prio_depot_codes. Objects of this class serve as prototypes for rows in queries. */
  class PrioDepotCodes(_tableTag: Tag) extends profile.api.Table[PrioDepotCodesRow](_tableTag, "prio_depot_codes") {
    def * = (id, businessUnit, country, state, postCode, suburb, pmsZone, local, collectionDepotCode, collectionsDepotName, depotCode, status, createdAt) <> (PrioDepotCodesRow.tupled, PrioDepotCodesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), businessUnit, country, state, postCode, suburb, pmsZone, local, collectionDepotCode, collectionsDepotName, depotCode, status, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> PrioDepotCodesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc */
    val id: Rep[Long] = column[Long]("id", O.AutoInc)
    /** Database column business_unit SqlType(text), Default(None) */
    val businessUnit: Rep[Option[String]] = column[Option[String]]("business_unit", O.Default(None))
    /** Database column country SqlType(text), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column state SqlType(text), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Default(None))
    /** Database column post_code SqlType(int4), Default(None) */
    val postCode: Rep[Option[Int]] = column[Option[Int]]("post_code", O.Default(None))
    /** Database column suburb SqlType(text), Default(None) */
    val suburb: Rep[Option[String]] = column[Option[String]]("suburb", O.Default(None))
    /** Database column pms_zone SqlType(int4), Default(None) */
    val pmsZone: Rep[Option[Int]] = column[Option[Int]]("pms_zone", O.Default(None))
    /** Database column local SqlType(bpchar), Default(None) */
    val local: Rep[Option[Char]] = column[Option[Char]]("local", O.Default(None))
    /** Database column collection_depot_code SqlType(text), Default(None) */
    val collectionDepotCode: Rep[Option[String]] = column[Option[String]]("collection_depot_code", O.Default(None))
    /** Database column collections_depot_name SqlType(text), Default(None) */
    val collectionsDepotName: Rep[Option[String]] = column[Option[String]]("collections_depot_name", O.Default(None))
    /** Database column depot_code SqlType(text), Default(None) */
    val depotCode: Rep[Option[String]] = column[Option[String]]("depot_code", O.Default(None))
    /** Database column status SqlType(bool), Default(Some(true)) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(Some(true)))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
  }
  /** Collection-like TableQuery object for table PrioDepotCodes */
  lazy val PrioDepotCodes = new TableQuery(tag => new PrioDepotCodes(tag))
}
