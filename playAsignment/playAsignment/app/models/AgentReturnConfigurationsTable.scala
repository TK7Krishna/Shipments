package models
// AUTO-GENERATED Slick data model for table AgentReturnConfigurations
trait AgentReturnConfigurationsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table AgentReturnConfigurations
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
   *  @param destinationCountry Database column destination_country SqlType(text), Default(None)
   *  @param destinationPhone Database column destination_phone SqlType(text)
   *  @param hubbedUserId Database column hubbed_user_id SqlType(int8), Default(None) */
  case class AgentReturnConfigurationsRow(id: Long, destinationFirstName: String, destinationLastName: String, destinationIsBusiness: Boolean, destinationCompanyName: Option[String] = None, destinationEmail: String, destinationAddress1: String, destinationAddress2: Option[String] = None, destinationSuburb: String, destinationState: String, destinationPostcode: String, destinationCountry: Option[String] = None, destinationPhone: String, hubbedUserId: Option[Long] = None)
  /** GetResult implicit for fetching AgentReturnConfigurationsRow objects using plain SQL queries */
  implicit def GetResultAgentReturnConfigurationsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Boolean], e3: GR[Option[String]], e4: GR[Option[Long]]): GR[AgentReturnConfigurationsRow] = GR{
    prs => import prs._
    AgentReturnConfigurationsRow.tupled((<<[Long], <<[String], <<[String], <<[Boolean], <<?[String], <<[String], <<[String], <<?[String], <<[String], <<[String], <<[String], <<?[String], <<[String], <<?[Long]))
  }
  /** Table description of table agent_return_configurations. Objects of this class serve as prototypes for rows in queries. */
  class AgentReturnConfigurations(_tableTag: Tag) extends profile.api.Table[AgentReturnConfigurationsRow](_tableTag, Some("ecommerce"), "agent_return_configurations") {
    def * = (id, destinationFirstName, destinationLastName, destinationIsBusiness, destinationCompanyName, destinationEmail, destinationAddress1, destinationAddress2, destinationSuburb, destinationState, destinationPostcode, destinationCountry, destinationPhone, hubbedUserId) <> (AgentReturnConfigurationsRow.tupled, AgentReturnConfigurationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(destinationFirstName), Rep.Some(destinationLastName), Rep.Some(destinationIsBusiness), destinationCompanyName, Rep.Some(destinationEmail), Rep.Some(destinationAddress1), destinationAddress2, Rep.Some(destinationSuburb), Rep.Some(destinationState), Rep.Some(destinationPostcode), destinationCountry, Rep.Some(destinationPhone), hubbedUserId)).shaped.<>({r=>import r._; _1.map(_=> AgentReturnConfigurationsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get, _8, _9.get, _10.get, _11.get, _12, _13.get, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column destination_country SqlType(text), Default(None) */
    val destinationCountry: Rep[Option[String]] = column[Option[String]]("destination_country", O.Default(None))
    /** Database column destination_phone SqlType(text) */
    val destinationPhone: Rep[String] = column[String]("destination_phone")
    /** Database column hubbed_user_id SqlType(int8), Default(None) */
    val hubbedUserId: Rep[Option[Long]] = column[Option[Long]]("hubbed_user_id", O.Default(None))

    /** Foreign key referencing HubbedUsers (database name agent_return_configurations_hubbed_user_id_fkey) */
    lazy val hubbedUsersFk = foreignKey("agent_return_configurations_hubbed_user_id_fkey", hubbedUserId, HubbedUsers)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table AgentReturnConfigurations */
  lazy val AgentReturnConfigurations = new TableQuery(tag => new AgentReturnConfigurations(tag))
}
