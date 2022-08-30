package models
// AUTO-GENERATED Slick data model for table SortationPreadviceAddresses
trait SortationPreadviceAddressesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SortationPreadviceAddresses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param destinationFirstName Database column destination_first_name SqlType(text)
   *  @param destinationLastName Database column destination_last_name SqlType(text)
   *  @param destinationIsBusiness Database column destination_is_business SqlType(bool)
   *  @param destinationCompanyName Database column destination_company_name SqlType(text), Default(None)
   *  @param destinationEmail Database column destination_email SqlType(text)
   *  @param destinationAddress1 Database column destination_address_1 SqlType(text)
   *  @param destinationAddress2 Database column destination_address_2 SqlType(text), Default(None)
   *  @param destinationSuburb Database column destination_suburb SqlType(text)
   *  @param destinationState Database column destination_state SqlType(text)
   *  @param destinationPostcode Database column destination_postcode SqlType(text)
   *  @param destinationPhone Database column destination_phone SqlType(text)
   *  @param consignmentNumber Database column consignment_number SqlType(text), Default(None)
   *  @param domesticShipmentId Database column domestic_shipment_id SqlType(int8), Default(None)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None)
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param reference Database column reference SqlType(text), Default(None)
   *  @param destinationCountry Database column destination_country SqlType(text), Default(None) */
  case class SortationPreadviceAddressesRow(id: Long, destinationFirstName: String, destinationLastName: String, destinationIsBusiness: Boolean, destinationCompanyName: Option[String] = None, destinationEmail: String, destinationAddress1: String, destinationAddress2: Option[String] = None, destinationSuburb: String, destinationState: String, destinationPostcode: String, destinationPhone: String, consignmentNumber: Option[String] = None, domesticShipmentId: Option[Long] = None, hubbedUserId: Option[Long] = None, createdAt: java.sql.Timestamp, reference: Option[String] = None, destinationCountry: Option[String] = None)
  /** GetResult implicit for fetching SortationPreadviceAddressesRow objects using plain SQL queries */
  implicit def GetResultSortationPreadviceAddressesRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[Option[String]], e4: GR[Option[Long]], e5: GR[java.sql.Timestamp]): GR[SortationPreadviceAddressesRow] = GR{
    prs => import prs._
    SortationPreadviceAddressesRow.tupled((<<[Long], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[Long], <<?[Long], <<[java.sql.Timestamp], <<?[String], <<?[String]))
  }
  /** Table description of table sortation_preadvice_addresses. Objects of this class serve as prototypes for rows in queries. */
  class SortationPreadviceAddresses(_tableTag: Tag) extends profile.api.Table[SortationPreadviceAddressesRow](_tableTag, Some("ecommerce"), "sortation_preadvice_addresses") {
    def * = (id, destinationFirstName, destinationLastName, destinationIsBusiness, destinationCompanyName, destinationEmail, destinationAddress1, destinationAddress2, destinationSuburb, destinationState, destinationPostcode, destinationPhone, consignmentNumber, domesticShipmentId, hubbedUserId, createdAt, reference, destinationCountry) <> (SortationPreadviceAddressesRow.tupled, SortationPreadviceAddressesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(destinationFirstName), Rep.Some(destinationLastName), Rep.Some(destinationIsBusiness), destinationCompanyName, Rep.Some(destinationEmail), Rep.Some(destinationAddress1), destinationAddress2, Rep.Some(destinationSuburb), Rep.Some(destinationState), Rep.Some(destinationPostcode), Rep.Some(destinationPhone), consignmentNumber, domesticShipmentId, hubbedUserId, Rep.Some(createdAt), reference, destinationCountry)).shaped.<>({r=>import r._; _1.map(_=> SortationPreadviceAddressesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8, _9.get, _10.get, _11.get, _12.get, _13, _14, _15, _16.get, _17, _18)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column destination_first_name SqlType(text) */
    val destinationFirstName: Rep[String] = column[String]("destination_first_name")
    /** Database column destination_last_name SqlType(text) */
    val destinationLastName: Rep[String] = column[String]("destination_last_name")
    /** Database column destination_is_business SqlType(bool) */
    val destinationIsBusiness: Rep[Boolean] = column[Boolean]("destination_is_business")
    /** Database column destination_company_name SqlType(text), Default(None) */
    val destinationCompanyName: Rep[Option[String]] = column[Option[String]]("destination_company_name", O.Default(None))
    /** Database column destination_email SqlType(text) */
    val destinationEmail: Rep[String] = column[String]("destination_email")
    /** Database column destination_address_1 SqlType(text) */
    val destinationAddress1: Rep[String] = column[String]("destination_address_1")
    /** Database column destination_address_2 SqlType(text), Default(None) */
    val destinationAddress2: Rep[Option[String]] = column[Option[String]]("destination_address_2", O.Default(None))
    /** Database column destination_suburb SqlType(text) */
    val destinationSuburb: Rep[String] = column[String]("destination_suburb")
    /** Database column destination_state SqlType(text) */
    val destinationState: Rep[String] = column[String]("destination_state")
    /** Database column destination_postcode SqlType(text) */
    val destinationPostcode: Rep[String] = column[String]("destination_postcode")
    /** Database column destination_phone SqlType(text) */
    val destinationPhone: Rep[String] = column[String]("destination_phone")
    /** Database column consignment_number SqlType(text), Default(None) */
    val consignmentNumber: Rep[Option[String]] = column[Option[String]]("consignment_number", O.Default(None))
    /** Database column domestic_shipment_id SqlType(int8), Default(None) */
    val domesticShipmentId: Rep[Option[Long]] = column[Option[Long]]("domestic_shipment_id", O.Default(None))
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column reference SqlType(text), Default(None) */
    val reference: Rep[Option[String]] = column[Option[String]]("reference", O.Default(None))
    /** Database column destination_country SqlType(text), Default(None) */
    val destinationCountry: Rep[Option[String]] = column[Option[String]]("destination_country", O.Default(None))

    /** Foreign key referencing DomesticShipments (database name sortation_preadvice_addresses_domestic_shipment_id_fkey) */
    lazy val domesticShipmentsFk = foreignKey("sortation_preadvice_addresses_domestic_shipment_id_fkey", domesticShipmentId, DomesticShipments)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SortationPreadviceAddresses */
  lazy val SortationPreadviceAddresses = new TableQuery(tag => new SortationPreadviceAddresses(tag))
}
