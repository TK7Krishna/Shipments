package models
// AUTO-GENERATED Slick data model for table DomesticPickups
trait DomesticPickupsTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DomesticPickups
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createdAt Database column created_at SqlType(timestamptz)
   *  @param atTime Database column at_time SqlType(timestamp)
   *  @param address1 Database column address1 SqlType(text)
   *  @param address2 Database column address2 SqlType(text), Default(None)
   *  @param address3 Database column address3 SqlType(text), Default(None)
   *  @param address4 Database column address4 SqlType(text), Default(None)
   *  @param address5 Database column address5 SqlType(text), Default(None)
   *  @param suburb Database column suburb SqlType(text)
   *  @param postcode Database column postcode SqlType(text)
   *  @param email Database column email SqlType(text)
   *  @param customername Database column customername SqlType(text)
   *  @param jobNumber Database column job_number SqlType(text), Default(None)
   *  @param destinationAddress1 Database column destination_address1 SqlType(text), Default(None)
   *  @param destinationAddress2 Database column destination_address2 SqlType(text), Default(None)
   *  @param destinationAddress3 Database column destination_address3 SqlType(text), Default(None)
   *  @param destinationAddress4 Database column destination_address4 SqlType(text), Default(None)
   *  @param destinationAddress5 Database column destination_address5 SqlType(text), Default(None)
   *  @param destinationSuburb Database column destination_suburb SqlType(text), Default(None)
   *  @param destinationPostcode Database column destination_postcode SqlType(text), Default(None) */
  case class DomesticPickupsRow(id: Long, createdAt: java.sql.Timestamp, atTime: java.sql.Timestamp, address1: String, address2: Option[String] = None, address3: Option[String] = None, address4: Option[String] = None, address5: Option[String] = None, suburb: String, postcode: String, email: String, customername: String, jobNumber: Option[String] = None, destinationAddress1: Option[String] = None, destinationAddress2: Option[String] = None, destinationAddress3: Option[String] = None, destinationAddress4: Option[String] = None, destinationAddress5: Option[String] = None, destinationSuburb: Option[String] = None, destinationPostcode: Option[String] = None)
  /** GetResult implicit for fetching DomesticPickupsRow objects using plain SQL queries */
  implicit def GetResultDomesticPickupsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Option[String]]): GR[DomesticPickupsRow] = GR{
    prs => import prs._
    DomesticPickupsRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table domestic_pickups. Objects of this class serve as prototypes for rows in queries. */
  class DomesticPickups(_tableTag: Tag) extends profile.api.Table[DomesticPickupsRow](_tableTag, Some("cpapi"), "domestic_pickups") {
    def * = (id, createdAt, atTime, address1, address2, address3, address4, address5, suburb, postcode, email, customername, jobNumber, destinationAddress1, destinationAddress2, destinationAddress3, destinationAddress4, destinationAddress5, destinationSuburb, destinationPostcode) <> (DomesticPickupsRow.tupled, DomesticPickupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(createdAt), Rep.Some(atTime), Rep.Some(address1), address2, address3, address4, address5, Rep.Some(suburb), Rep.Some(postcode), Rep.Some(email), Rep.Some(customername), jobNumber, destinationAddress1, destinationAddress2, destinationAddress3, destinationAddress4, destinationAddress5, destinationSuburb, destinationPostcode)).shaped.<>({r=>import r._; _1.map(_=> DomesticPickupsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8, _9.get, _10.get, _11.get, _12.get, _13, _14, _15, _16, _17, _18, _19, _20)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_at SqlType(timestamptz) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_at")
    /** Database column at_time SqlType(timestamp) */
    val atTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("at_time")
    /** Database column address1 SqlType(text) */
    val address1: Rep[String] = column[String]("address1")
    /** Database column address2 SqlType(text), Default(None) */
    val address2: Rep[Option[String]] = column[Option[String]]("address2", O.Default(None))
    /** Database column address3 SqlType(text), Default(None) */
    val address3: Rep[Option[String]] = column[Option[String]]("address3", O.Default(None))
    /** Database column address4 SqlType(text), Default(None) */
    val address4: Rep[Option[String]] = column[Option[String]]("address4", O.Default(None))
    /** Database column address5 SqlType(text), Default(None) */
    val address5: Rep[Option[String]] = column[Option[String]]("address5", O.Default(None))
    /** Database column suburb SqlType(text) */
    val suburb: Rep[String] = column[String]("suburb")
    /** Database column postcode SqlType(text) */
    val postcode: Rep[String] = column[String]("postcode")
    /** Database column email SqlType(text) */
    val email: Rep[String] = column[String]("email")
    /** Database column customername SqlType(text) */
    val customername: Rep[String] = column[String]("customername")
    /** Database column job_number SqlType(text), Default(None) */
    val jobNumber: Rep[Option[String]] = column[Option[String]]("job_number", O.Default(None))
    /** Database column destination_address1 SqlType(text), Default(None) */
    val destinationAddress1: Rep[Option[String]] = column[Option[String]]("destination_address1", O.Default(None))
    /** Database column destination_address2 SqlType(text), Default(None) */
    val destinationAddress2: Rep[Option[String]] = column[Option[String]]("destination_address2", O.Default(None))
    /** Database column destination_address3 SqlType(text), Default(None) */
    val destinationAddress3: Rep[Option[String]] = column[Option[String]]("destination_address3", O.Default(None))
    /** Database column destination_address4 SqlType(text), Default(None) */
    val destinationAddress4: Rep[Option[String]] = column[Option[String]]("destination_address4", O.Default(None))
    /** Database column destination_address5 SqlType(text), Default(None) */
    val destinationAddress5: Rep[Option[String]] = column[Option[String]]("destination_address5", O.Default(None))
    /** Database column destination_suburb SqlType(text), Default(None) */
    val destinationSuburb: Rep[Option[String]] = column[Option[String]]("destination_suburb", O.Default(None))
    /** Database column destination_postcode SqlType(text), Default(None) */
    val destinationPostcode: Rep[Option[String]] = column[Option[String]]("destination_postcode", O.Default(None))
  }
  /** Collection-like TableQuery object for table DomesticPickups */
  lazy val DomesticPickups = new TableQuery(tag => new DomesticPickups(tag))
}
