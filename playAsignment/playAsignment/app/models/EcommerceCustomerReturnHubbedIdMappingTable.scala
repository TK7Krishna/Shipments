package models
// AUTO-GENERATED Slick data model for table EcommerceCustomerReturnHubbedIdMapping
trait EcommerceCustomerReturnHubbedIdMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceCustomerReturnHubbedIdMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8) */
  case class EcommerceCustomerReturnHubbedIdMappingRow(id: Long, hubbedUserId: Long)
  /** GetResult implicit for fetching EcommerceCustomerReturnHubbedIdMappingRow objects using plain SQL queries */
  implicit def GetResultEcommerceCustomerReturnHubbedIdMappingRow(implicit e0: GR[Long]): GR[EcommerceCustomerReturnHubbedIdMappingRow] = GR{
    prs => import prs._
    EcommerceCustomerReturnHubbedIdMappingRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table ecommerce_customer_return_hubbed_id_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceCustomerReturnHubbedIdMapping(_tableTag: Tag) extends profile.api.Table[EcommerceCustomerReturnHubbedIdMappingRow](_tableTag, Some("standard_apis"), "ecommerce_customer_return_hubbed_id_mapping") {
    def * = (id, hubbedUserId) <> (EcommerceCustomerReturnHubbedIdMappingRow.tupled, EcommerceCustomerReturnHubbedIdMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId))).shaped.<>({r=>import r._; _1.map(_=> EcommerceCustomerReturnHubbedIdMappingRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")

    /** Foreign key referencing HubbedUsers (database name ecommerce_customer_return_hubbed_id_mapping_fk_hubbed_user_id) */
    lazy val hubbedUsersFk = foreignKey("ecommerce_customer_return_hubbed_id_mapping_fk_hubbed_user_id", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceCustomerReturnHubbedIdMapping */
  lazy val EcommerceCustomerReturnHubbedIdMapping = new TableQuery(tag => new EcommerceCustomerReturnHubbedIdMapping(tag))
}
