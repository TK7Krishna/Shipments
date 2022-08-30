package models
// AUTO-GENERATED Slick data model for table Pickupreceipts
trait PickupreceiptsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pickupreceipts
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param consignmentid Database column consignmentid SqlType(int8)
   *  @param receiver Database column receiver SqlType(text)
   *  @param signature Database column signature SqlType(text), Default(None)
   *  @param reason Database column reason SqlType(text), Default(None)
   *  @param createdat Database column createdat SqlType(timestamptz)
   *  @param signatureUrl Database column signature_url SqlType(text), Default(None)
   *  @param uploadFailedPermanently Database column upload_failed_permanently SqlType(bool), Default(None)
   *  @param identityType Database column identity_type SqlType(text), Default(None)
   *  @param identityLast4 Database column identity_last4 SqlType(text), Default(None)
   *  @param pin Database column pin SqlType(text), Default(None)
   *  @param location Database column location SqlType(int8), Default(None)
   *  @param eSignature Database column e_signature SqlType(text), Default(None) */
  case class PickupreceiptsRow(id: Long, consignmentid: Long, receiver: String, signature: Option[String] = None, reason: Option[String] = None, createdat: java.sql.Timestamp, signatureUrl: Option[String] = None, uploadFailedPermanently: Option[Boolean] = None, identityType: Option[String] = None, identityLast4: Option[String] = None, pin: Option[String] = None, location: Option[Long] = None, eSignature: Option[String] = None)
  /** GetResult implicit for fetching PickupreceiptsRow objects using plain SQL queries */
  implicit def GetResultPickupreceiptsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[Option[Boolean]], e5: GR[Option[Long]]): GR[PickupreceiptsRow] = GR{
    prs => import prs._
    PickupreceiptsRow.tupled((<<[Long], <<[Long], <<[String], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[String], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String]))
  }
  /** Table description of table pickupreceipts. Objects of this class serve as prototypes for rows in queries. */
  class Pickupreceipts(_tableTag: Tag) extends profile.api.Table[PickupreceiptsRow](_tableTag, "pickupreceipts") {
    def * = (id, consignmentid, receiver, signature, reason, createdat, signatureUrl, uploadFailedPermanently, identityType, identityLast4, pin, location, eSignature) <> (PickupreceiptsRow.tupled, PickupreceiptsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(consignmentid), Rep.Some(receiver), signature, reason, Rep.Some(createdat), signatureUrl, uploadFailedPermanently, identityType, identityLast4, pin, location, eSignature)).shaped.<>({r=>import r._; _1.map(_=> PickupreceiptsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6.get, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column consignmentid SqlType(int8) */
    val consignmentid: Rep[Long] = column[Long]("consignmentid")
    /** Database column receiver SqlType(text) */
    val receiver: Rep[String] = column[String]("receiver")
    /** Database column signature SqlType(text), Default(None) */
    val signature: Rep[Option[String]] = column[Option[String]]("signature", O.Default(None))
    /** Database column reason SqlType(text), Default(None) */
    val reason: Rep[Option[String]] = column[Option[String]]("reason", O.Default(None))
    /** Database column createdat SqlType(timestamptz) */
    val createdat: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("createdat")
    /** Database column signature_url SqlType(text), Default(None) */
    val signatureUrl: Rep[Option[String]] = column[Option[String]]("signature_url", O.Default(None))
    /** Database column upload_failed_permanently SqlType(bool), Default(None) */
    val uploadFailedPermanently: Rep[Option[Boolean]] = column[Option[Boolean]]("upload_failed_permanently", O.Default(None))
    /** Database column identity_type SqlType(text), Default(None) */
    val identityType: Rep[Option[String]] = column[Option[String]]("identity_type", O.Default(None))
    /** Database column identity_last4 SqlType(text), Default(None) */
    val identityLast4: Rep[Option[String]] = column[Option[String]]("identity_last4", O.Default(None))
    /** Database column pin SqlType(text), Default(None) */
    val pin: Rep[Option[String]] = column[Option[String]]("pin", O.Default(None))
    /** Database column location SqlType(int8), Default(None) */
    val location: Rep[Option[Long]] = column[Option[Long]]("location", O.Default(None))
    /** Database column e_signature SqlType(text), Default(None) */
    val eSignature: Rep[Option[String]] = column[Option[String]]("e_signature", O.Default(None))

    /** Foreign key referencing Consignments (database name pickupreceipts_consignmentid_fkey) */
    lazy val consignmentsFk = foreignKey("pickupreceipts_consignmentid_fkey", consignmentid, Consignments)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Droplocations (database name pickupreceipts_location_fkey) */
    lazy val droplocationsFk = foreignKey("pickupreceipts_location_fkey", location, Droplocations)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Index over (uploadFailedPermanently) (database name pickupreceipts_upload_failed_permanently_idx) */
    val index1 = index("pickupreceipts_upload_failed_permanently_idx", uploadFailedPermanently)
  }
  /** Collection-like TableQuery object for table Pickupreceipts */
  lazy val Pickupreceipts = new TableQuery(tag => new Pickupreceipts(tag))
}
