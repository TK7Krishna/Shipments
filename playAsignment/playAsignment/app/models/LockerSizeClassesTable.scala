package models
// AUTO-GENERATED Slick data model for table LockerSizeClasses
trait LockerSizeClassesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table LockerSizeClasses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param extRef Database column ext_ref SqlType(text), Default(None)
   *  @param provider Database column provider SqlType(int8)
   *  @param name Database column name SqlType(text)
   *  @param height Database column height SqlType(int8), Default(None)
   *  @param width Database column width SqlType(int8), Default(None)
   *  @param depth Database column depth SqlType(int8), Default(None)
   *  @param maxWeight Database column max_weight SqlType(int8), Default(None) */
  case class LockerSizeClassesRow(id: Long, extRef: Option[String] = None, provider: Long, name: String, height: Option[Long] = None, width: Option[Long] = None, depth: Option[Long] = None, maxWeight: Option[Long] = None)
  /** GetResult implicit for fetching LockerSizeClassesRow objects using plain SQL queries */
  implicit def GetResultLockerSizeClassesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[Long]]): GR[LockerSizeClassesRow] = GR{
    prs => import prs._
    LockerSizeClassesRow.tupled((<<[Long], <<?[String], <<[Long], <<[String], <<?[Long], <<?[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table locker_size_classes. Objects of this class serve as prototypes for rows in queries. */
  class LockerSizeClasses(_tableTag: Tag) extends profile.api.Table[LockerSizeClassesRow](_tableTag, Some("locker"), "locker_size_classes") {
    def * = (id, extRef, provider, name, height, width, depth, maxWeight) <> (LockerSizeClassesRow.tupled, LockerSizeClassesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), extRef, Rep.Some(provider), Rep.Some(name), height, width, depth, maxWeight)).shaped.<>({r=>import r._; _1.map(_=> LockerSizeClassesRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column ext_ref SqlType(text), Default(None) */
    val extRef: Rep[Option[String]] = column[Option[String]]("ext_ref", O.Default(None))
    /** Database column provider SqlType(int8) */
    val provider: Rep[Long] = column[Long]("provider")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")
    /** Database column height SqlType(int8), Default(None) */
    val height: Rep[Option[Long]] = column[Option[Long]]("height", O.Default(None))
    /** Database column width SqlType(int8), Default(None) */
    val width: Rep[Option[Long]] = column[Option[Long]]("width", O.Default(None))
    /** Database column depth SqlType(int8), Default(None) */
    val depth: Rep[Option[Long]] = column[Option[Long]]("depth", O.Default(None))
    /** Database column max_weight SqlType(int8), Default(None) */
    val maxWeight: Rep[Option[Long]] = column[Option[Long]]("max_weight", O.Default(None))

    /** Foreign key referencing Providers (database name locker_size_classes_provider_fkey) */
    lazy val providersFk = foreignKey("locker_size_classes_provider_fkey", provider, Providers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (provider,extRef) (database name locker_size_classes_provider_ext_ref_key) */
    val index1 = index("locker_size_classes_provider_ext_ref_key", (provider, extRef), unique=true)
  }
  /** Collection-like TableQuery object for table LockerSizeClasses */
  lazy val LockerSizeClasses = new TableQuery(tag => new LockerSizeClasses(tag))
}
