package models
// AUTO-GENERATED Slick data model for table DroplocationsBusinessHoursCsvUpdate
trait DroplocationsBusinessHoursCsvUpdateTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table DroplocationsBusinessHoursCsvUpdate
   *  @param locationId Database column location_id SqlType(text), Default(None)
   *  @param mondayOpen Database column monday_open SqlType(text), Default(None)
   *  @param mondayClose Database column monday_close SqlType(text), Default(None)
   *  @param tuesdayOpen Database column tuesday_open SqlType(text), Default(None)
   *  @param tuesdayClose Database column tuesday_close SqlType(text), Default(None)
   *  @param wednesdayOpen Database column wednesday_open SqlType(text), Default(None)
   *  @param wednesdayClose Database column wednesday_close SqlType(text), Default(None)
   *  @param thursdayOpen Database column thursday_open SqlType(text), Default(None)
   *  @param thursdayClose Database column thursday_close SqlType(text), Default(None)
   *  @param fridayOpen Database column friday_open SqlType(text), Default(None)
   *  @param fridayClose Database column friday_close SqlType(text), Default(None)
   *  @param saturdayOpen Database column saturday_open SqlType(text), Default(None)
   *  @param saturdayClose Database column saturday_close SqlType(text), Default(None)
   *  @param sundayOpen Database column sunday_open SqlType(text), Default(None)
   *  @param sundayClose Database column sunday_close SqlType(text), Default(None) */
  case class DroplocationsBusinessHoursCsvUpdateRow(locationId: Option[String] = None, mondayOpen: Option[String] = None, mondayClose: Option[String] = None, tuesdayOpen: Option[String] = None, tuesdayClose: Option[String] = None, wednesdayOpen: Option[String] = None, wednesdayClose: Option[String] = None, thursdayOpen: Option[String] = None, thursdayClose: Option[String] = None, fridayOpen: Option[String] = None, fridayClose: Option[String] = None, saturdayOpen: Option[String] = None, saturdayClose: Option[String] = None, sundayOpen: Option[String] = None, sundayClose: Option[String] = None)
  /** GetResult implicit for fetching DroplocationsBusinessHoursCsvUpdateRow objects using plain SQL queries */
  implicit def GetResultDroplocationsBusinessHoursCsvUpdateRow(implicit e0: GR[Option[String]]): GR[DroplocationsBusinessHoursCsvUpdateRow] = GR{
    prs => import prs._
    DroplocationsBusinessHoursCsvUpdateRow.tupled((<<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table droplocations_business_hours_csv_update. Objects of this class serve as prototypes for rows in queries. */
  class DroplocationsBusinessHoursCsvUpdate(_tableTag: Tag) extends profile.api.Table[DroplocationsBusinessHoursCsvUpdateRow](_tableTag, "droplocations_business_hours_csv_update") {
    def * = (locationId, mondayOpen, mondayClose, tuesdayOpen, tuesdayClose, wednesdayOpen, wednesdayClose, thursdayOpen, thursdayClose, fridayOpen, fridayClose, saturdayOpen, saturdayClose, sundayOpen, sundayClose) <> (DroplocationsBusinessHoursCsvUpdateRow.tupled, DroplocationsBusinessHoursCsvUpdateRow.unapply)

    /** Database column location_id SqlType(text), Default(None) */
    val locationId: Rep[Option[String]] = column[Option[String]]("location_id", O.Default(None))
    /** Database column monday_open SqlType(text), Default(None) */
    val mondayOpen: Rep[Option[String]] = column[Option[String]]("monday_open", O.Default(None))
    /** Database column monday_close SqlType(text), Default(None) */
    val mondayClose: Rep[Option[String]] = column[Option[String]]("monday_close", O.Default(None))
    /** Database column tuesday_open SqlType(text), Default(None) */
    val tuesdayOpen: Rep[Option[String]] = column[Option[String]]("tuesday_open", O.Default(None))
    /** Database column tuesday_close SqlType(text), Default(None) */
    val tuesdayClose: Rep[Option[String]] = column[Option[String]]("tuesday_close", O.Default(None))
    /** Database column wednesday_open SqlType(text), Default(None) */
    val wednesdayOpen: Rep[Option[String]] = column[Option[String]]("wednesday_open", O.Default(None))
    /** Database column wednesday_close SqlType(text), Default(None) */
    val wednesdayClose: Rep[Option[String]] = column[Option[String]]("wednesday_close", O.Default(None))
    /** Database column thursday_open SqlType(text), Default(None) */
    val thursdayOpen: Rep[Option[String]] = column[Option[String]]("thursday_open", O.Default(None))
    /** Database column thursday_close SqlType(text), Default(None) */
    val thursdayClose: Rep[Option[String]] = column[Option[String]]("thursday_close", O.Default(None))
    /** Database column friday_open SqlType(text), Default(None) */
    val fridayOpen: Rep[Option[String]] = column[Option[String]]("friday_open", O.Default(None))
    /** Database column friday_close SqlType(text), Default(None) */
    val fridayClose: Rep[Option[String]] = column[Option[String]]("friday_close", O.Default(None))
    /** Database column saturday_open SqlType(text), Default(None) */
    val saturdayOpen: Rep[Option[String]] = column[Option[String]]("saturday_open", O.Default(None))
    /** Database column saturday_close SqlType(text), Default(None) */
    val saturdayClose: Rep[Option[String]] = column[Option[String]]("saturday_close", O.Default(None))
    /** Database column sunday_open SqlType(text), Default(None) */
    val sundayOpen: Rep[Option[String]] = column[Option[String]]("sunday_open", O.Default(None))
    /** Database column sunday_close SqlType(text), Default(None) */
    val sundayClose: Rep[Option[String]] = column[Option[String]]("sunday_close", O.Default(None))
  }
  /** Collection-like TableQuery object for table DroplocationsBusinessHoursCsvUpdate */
  lazy val DroplocationsBusinessHoursCsvUpdate = new TableQuery(tag => new DroplocationsBusinessHoursCsvUpdate(tag))
}
