package models
// AUTO-GENERATED Slick data model for table SendResults
trait SendResultsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SendResults
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param attempt Database column attempt SqlType(int8)
   *  @param succeeded Database column succeeded SqlType(bool), Default(None) */
  case class SendResultsRow(id: Long, attempt: Long, succeeded: Option[Boolean] = None)
  /** GetResult implicit for fetching SendResultsRow objects using plain SQL queries */
  implicit def GetResultSendResultsRow(implicit e0: GR[Long], e1: GR[Option[Boolean]]): GR[SendResultsRow] = GR{
    prs => import prs._
    SendResultsRow.tupled((<<[Long], <<[Long], <<?[Boolean]))
  }
  /** Table description of table send_results. Objects of this class serve as prototypes for rows in queries. */
  class SendResults(_tableTag: Tag) extends profile.api.Table[SendResultsRow](_tableTag, Some("email"), "send_results") {
    def * = (id, attempt, succeeded) <> (SendResultsRow.tupled, SendResultsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(attempt), succeeded)).shaped.<>({r=>import r._; _1.map(_=> SendResultsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column attempt SqlType(int8) */
    val attempt: Rep[Long] = column[Long]("attempt")
    /** Database column succeeded SqlType(bool), Default(None) */
    val succeeded: Rep[Option[Boolean]] = column[Option[Boolean]]("succeeded", O.Default(None))

    /** Foreign key referencing SendAttempts (database name send_results_attempt_fkey) */
    lazy val sendAttemptsFk = foreignKey("send_results_attempt_fkey", attempt, SendAttempts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SendResults */
  lazy val SendResults = new TableQuery(tag => new SendResults(tag))
}
