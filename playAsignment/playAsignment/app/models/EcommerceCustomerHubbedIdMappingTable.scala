package models
// AUTO-GENERATED Slick data model for table EcommerceCustomerHubbedIdMapping
trait EcommerceCustomerHubbedIdMappingTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EcommerceCustomerHubbedIdMapping
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8) */
  case class EcommerceCustomerHubbedIdMappingRow(id: Long, hubbedUserId: Long)
  /** GetResult implicit for fetching EcommerceCustomerHubbedIdMappingRow objects using plain SQL queries */
  implicit def GetResultEcommerceCustomerHubbedIdMappingRow(implicit e0: GR[Long]): GR[EcommerceCustomerHubbedIdMappingRow] = GR{
    prs => import prs._
    EcommerceCustomerHubbedIdMappingRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table ecommerce_customer_hubbed_id_mapping. Objects of this class serve as prototypes for rows in queries. */
  class EcommerceCustomerHubbedIdMapping(_tableTag: Tag) extends profile.api.Table[EcommerceCustomerHubbedIdMappingRow](_tableTag, Some("standard_apis"), "ecommerce_customer_hubbed_id_mapping") {
    def * = (id, hubbedUserId) <> (EcommerceCustomerHubbedIdMappingRow.tupled, EcommerceCustomerHubbedIdMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hubbedUserId))).shaped.<>({r=>import r._; _1.map(_=> EcommerceCustomerHubbedIdMappingRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column hubbed_user_id SqlType(int8) */
    val hubbedUserId: Rep[Long] = column[Long]("hubbed_user_id")

    /** Foreign key referencing HubbedUsers (database name ecommercecustomer_hubbed_user_id_fk) */
    lazy val hubbedUsersFk = foreignKey("ecommercecustomer_hubbed_user_id_fk", hubbedUserId, HubbedUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table EcommerceCustomerHubbedIdMapping */
  lazy val EcommerceCustomerHubbedIdMapping = new TableQuery(tag => new EcommerceCustomerHubbedIdMapping(tag))
}
