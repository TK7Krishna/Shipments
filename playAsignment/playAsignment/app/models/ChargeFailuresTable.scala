package models
// AUTO-GENERATED Slick data model for table ChargeFailures
trait ChargeFailuresTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ChargeFailures
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param charge Database column charge SqlType(int8)
   *  @param request Database column request SqlType(int8) */
  case class ChargeFailuresRow(id: Long, charge: Long, request: Long)
  /** GetResult implicit for fetching ChargeFailuresRow objects using plain SQL queries */
  implicit def GetResultChargeFailuresRow(implicit e0: GR[Long]): GR[ChargeFailuresRow] = GR{
    prs => import prs._
    ChargeFailuresRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table charge_failures. Objects of this class serve as prototypes for rows in queries. */
  class ChargeFailures(_tableTag: Tag) extends profile.api.Table[ChargeFailuresRow](_tableTag, Some("stripe"), "charge_failures") {
    def * = (id, charge, request) <> (ChargeFailuresRow.tupled, ChargeFailuresRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(charge), Rep.Some(request))).shaped.<>({r=>import r._; _1.map(_=> ChargeFailuresRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column charge SqlType(int8) */
    val charge: Rep[Long] = column[Long]("charge")
    /** Database column request SqlType(int8) */
    val request: Rep[Long] = column[Long]("request")

    /** Foreign key referencing Charges (database name charge_failures_charge_fkey) */
    lazy val chargesFk = foreignKey("charge_failures_charge_fkey", charge, Charges)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Requests (database name charge_failures_request_fkey) */
    lazy val requestsFk = foreignKey("charge_failures_request_fkey", request, Requests)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ChargeFailures */
  lazy val ChargeFailures = new TableQuery(tag => new ChargeFailures(tag))
}
