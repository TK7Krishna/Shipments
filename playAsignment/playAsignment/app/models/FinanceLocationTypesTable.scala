package models
// AUTO-GENERATED Slick data model for table FinanceLocationTypes
trait FinanceLocationTypesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table FinanceLocationTypes
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(50,true), Default(None)
   *  @param channelId Database column channel_id SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz) */
  case class FinanceLocationTypesRow(id: Long, name: Option[String] = None, channelId: Option[Long] = None, createdAt: java.sql.Timestamp)
  /** GetResult implicit for fetching FinanceLocationTypesRow objects using plain SQL queries */
  implicit def GetResultFinanceLocationTypesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[java.sql.Timestamp]): GR[FinanceLocationTypesRow] = GR{
    prs => import prs._
    FinanceLocationTypesRow.tupled((<<[Long], <<?[String], <<?[Long], <<[java.sql.Timestamp]))
  }
  /** Table description of table finance_location_types. Objects of this class serve as prototypes for rows in queries. */
  class FinanceLocationTypes(_tableTag: Tag) extends profile.api.Table[FinanceLocationTypesRow](_tableTag, Some("reports"), "finance_location_types") {
    def * = (id, name, channelId, createdAt) <> (FinanceLocationTypesRow.tupled, FinanceLocationTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name, channelId, Rep.Some(createdAt))).shaped.<>({r=>import r._; _1.map(_=> FinanceLocationTypesRow.tupled((_1.get, _2, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(50,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(50,varying=true), O.Default(None))
    /** Database column channel_id SqlType(int8), Default(None) */
    val channelId: Rep[Option[Long]] = column[Option[Long]]("channel_id", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")

    /** Foreign key referencing Channel (database name fk_channel_id) */
    lazy val channelFk = foreignKey("fk_channel_id", channelId, Channel)(r => Rep.Some(r.channelId), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table FinanceLocationTypes */
  lazy val FinanceLocationTypes = new TableQuery(tag => new FinanceLocationTypes(tag))
}
