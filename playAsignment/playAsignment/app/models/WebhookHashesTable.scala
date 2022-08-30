package models
// AUTO-GENERATED Slick data model for table WebhookHashes
trait WebhookHashesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WebhookHashes
   *  @param hashKey Database column hash_key SqlType(text), PrimaryKey */
  case class WebhookHashesRow(hashKey: String)
  /** GetResult implicit for fetching WebhookHashesRow objects using plain SQL queries */
  implicit def GetResultWebhookHashesRow(implicit e0: GR[String]): GR[WebhookHashesRow] = GR{
    prs => import prs._
    WebhookHashesRow(<<[String])
  }
  /** Table description of table webhook_hashes. Objects of this class serve as prototypes for rows in queries. */
  class WebhookHashes(_tableTag: Tag) extends profile.api.Table[WebhookHashesRow](_tableTag, Some("locker"), "webhook_hashes") {
    def * = hashKey <> (WebhookHashesRow, WebhookHashesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(hashKey)).shaped.<>(r => r.map(_=> WebhookHashesRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column hash_key SqlType(text), PrimaryKey */
    val hashKey: Rep[String] = column[String]("hash_key", O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table WebhookHashes */
  lazy val WebhookHashes = new TableQuery(tag => new WebhookHashes(tag))
}
