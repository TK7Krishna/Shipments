package models
// AUTO-GENERATED Slick data model for table InternationalOutbounds
trait InternationalOutboundsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InternationalOutbounds
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(int8)
   *  @param quote Database column quote SqlType(int8)
   *  @param senderIdImage Database column sender_id_image SqlType(int8), Default(None)
   *  @param shipment Database column shipment SqlType(int8), Default(None)
   *  @param payment Database column payment SqlType(int8), Default(None)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param shipmentCompletedAt Database column shipment_completed_at SqlType(timestamptz), Default(None) */
  case class InternationalOutboundsRow(id: Long, location: Long, quote: Long, senderIdImage: Option[Long] = None, shipment: Option[Long] = None, payment: Option[Long] = None, consignmentNumber: Option[String] = None, shipmentCompletedAt: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching InternationalOutboundsRow objects using plain SQL queries */
  implicit def GetResultInternationalOutboundsRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[InternationalOutboundsRow] = GR{
    prs => import prs._
    InternationalOutboundsRow.tupled((<<[Long], <<[Long], <<[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table international_outbounds. Objects of this class serve as prototypes for rows in queries. */
  class InternationalOutbounds(_tableTag: Tag) extends profile.api.Table[InternationalOutboundsRow](_tableTag, "international_outbounds") {
    def * = (id, location, quote, senderIdImage, shipment, payment, consignmentNumber, shipmentCompletedAt) <> (InternationalOutboundsRow.tupled, InternationalOutboundsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(location), Rep.Some(quote), senderIdImage, shipment, payment, consignmentNumber, shipmentCompletedAt)).shaped.<>({r=>import r._; _1.map(_=> InternationalOutboundsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(int8) */
    val location: Rep[Long] = column[Long]("location")
    /** Database column quote SqlType(int8) */
    val quote: Rep[Long] = column[Long]("quote")
    /** Database column sender_id_image SqlType(int8), Default(None) */
    val senderIdImage: Rep[Option[Long]] = column[Option[Long]]("sender_id_image", O.Default(None))
    /** Database column shipment SqlType(int8), Default(None) */
    val shipment: Rep[Option[Long]] = column[Option[Long]]("shipment", O.Default(None))
    /** Database column payment SqlType(int8), Default(None) */
    val payment: Rep[Option[Long]] = column[Option[Long]]("payment", O.Default(None))
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column shipment_completed_at SqlType(timestamptz), Default(None) */
    val shipmentCompletedAt: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("shipment_completed_at", O.Default(None))

    /** Foreign key referencing Droplocations (database name international_outbounds_location_fkey) */
    lazy val droplocationsFk = foreignKey("international_outbounds_location_fkey", location, Droplocations)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Images (database name international_outbounds_sender_id_image_fkey) */
    lazy val imagesFk = foreignKey("international_outbounds_sender_id_image_fkey", senderIdImage, Images)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing InternationalQuotes (database name international_outbounds_quote_fkey) */
    lazy val internationalQuotesFk = foreignKey("international_outbounds_quote_fkey", quote, InternationalQuotes)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing InternationalShipments (database name international_outbounds_shipment_fkey) */
    lazy val internationalShipmentsFk = foreignKey("international_outbounds_shipment_fkey", shipment, InternationalShipments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing TransactionHeaders (database name international_outbounds_payment_fkey) */
    lazy val transactionHeadersFk = foreignKey("international_outbounds_payment_fkey", payment, TransactionHeaders)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table InternationalOutbounds */
  lazy val InternationalOutbounds = new TableQuery(tag => new InternationalOutbounds(tag))
}
