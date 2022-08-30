package models
// AUTO-GENERATED Slick data model for table AlternatePickupNames
trait AlternatePickupNamesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AlternatePickupNames
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentId Database column consignment_id SqlType(int8)
   *  @param name Database column name SqlType(text) */
  case class AlternatePickupNamesRow(id: Long, consignmentId: Long, name: String)
  /** GetResult implicit for fetching AlternatePickupNamesRow objects using plain SQL queries */
  implicit def GetResultAlternatePickupNamesRow(implicit e0: GR[Long], e1: GR[String]): GR[AlternatePickupNamesRow] = GR{
    prs => import prs._
    AlternatePickupNamesRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table alternate_pickup_names. Objects of this class serve as prototypes for rows in queries. */
  class AlternatePickupNames(_tableTag: Tag) extends profile.api.Table[AlternatePickupNamesRow](_tableTag, "alternate_pickup_names") {
    def * = (id, consignmentId, name) <> (AlternatePickupNamesRow.tupled, AlternatePickupNamesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentId), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> AlternatePickupNamesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignment_id SqlType(int8) */
    val consignmentId: Rep[Long] = column[Long]("consignment_id")
    /** Database column name SqlType(text) */
    val name: Rep[String] = column[String]("name")

    /** Foreign key referencing Consignments (database name alternate_pickup_names_consignment_id_fkey) */
    lazy val consignmentsFk = foreignKey("alternate_pickup_names_consignment_id_fkey", consignmentId, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (consignmentId) (database name one_alternate_pickup_name) */
    val index1 = index("one_alternate_pickup_name", consignmentId, unique=true)
  }
  /** Collection-like TableQuery object for table AlternatePickupNames */
  lazy val AlternatePickupNames = new TableQuery(tag => new AlternatePickupNames(tag))
}
