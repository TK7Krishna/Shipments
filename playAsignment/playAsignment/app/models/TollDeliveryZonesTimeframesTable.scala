package models
// AUTO-GENERATED Slick data model for table TollDeliveryZonesTimeframes
trait TollDeliveryZonesTimeframesTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TollDeliveryZonesTimeframes
   *  @param serviceType Database column service_type SqlType(text)
   *  @param originDeliveryZone Database column origin_delivery_zone SqlType(text)
   *  @param destinationDeliveryZone Database column destination_delivery_zone SqlType(text)
   *  @param timeframe Database column timeframe SqlType(text)
   *  @param destinationStates Database column destination_states SqlType(text), Default() */
  case class TollDeliveryZonesTimeframesRow(serviceType: String, originDeliveryZone: String, destinationDeliveryZone: String, timeframe: String, destinationStates: String = "")
  /** GetResult implicit for fetching TollDeliveryZonesTimeframesRow objects using plain SQL queries */
  implicit def GetResultTollDeliveryZonesTimeframesRow(implicit e0: GR[String]): GR[TollDeliveryZonesTimeframesRow] = GR{
    prs => import prs._
    TollDeliveryZonesTimeframesRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table toll_delivery_zones_timeframes. Objects of this class serve as prototypes for rows in queries. */
  class TollDeliveryZonesTimeframes(_tableTag: Tag) extends profile.api.Table[TollDeliveryZonesTimeframesRow](_tableTag, Some("seven_eleven"), "toll_delivery_zones_timeframes") {
    def * = (serviceType, originDeliveryZone, destinationDeliveryZone, timeframe, destinationStates) <> (TollDeliveryZonesTimeframesRow.tupled, TollDeliveryZonesTimeframesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(serviceType), Rep.Some(originDeliveryZone), Rep.Some(destinationDeliveryZone), Rep.Some(timeframe), Rep.Some(destinationStates))).shaped.<>({r=>import r._; _1.map(_=> TollDeliveryZonesTimeframesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column service_type SqlType(text) */
    val serviceType: Rep[String] = column[String]("service_type")
    /** Database column origin_delivery_zone SqlType(text) */
    val originDeliveryZone: Rep[String] = column[String]("origin_delivery_zone")
    /** Database column destination_delivery_zone SqlType(text) */
    val destinationDeliveryZone: Rep[String] = column[String]("destination_delivery_zone")
    /** Database column timeframe SqlType(text) */
    val timeframe: Rep[String] = column[String]("timeframe")
    /** Database column destination_states SqlType(text), Default() */
    val destinationStates: Rep[String] = column[String]("destination_states", O.Default(""))

    /** Uniqueness Index over (serviceType,originDeliveryZone,destinationDeliveryZone,destinationStates) (database name toll_delivery_zones_timeframe_service_type_origin_delivery__idx) */
    val index1 = index("toll_delivery_zones_timeframe_service_type_origin_delivery__idx", (serviceType, originDeliveryZone, destinationDeliveryZone, destinationStates), unique=true)
  }
  /** Collection-like TableQuery object for table TollDeliveryZonesTimeframes */
  lazy val TollDeliveryZonesTimeframes = new TableQuery(tag => new TollDeliveryZonesTimeframes(tag))
}
