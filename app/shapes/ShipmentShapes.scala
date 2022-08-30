package shapes

object ShipmentShapes {
  case class ShipmentData(id: String, countryCode: String, price: Int)
  case class FinalResultSet(shipmentPricingAvaiableFor : List[ResultShipment] )
  case class ResultShipment(shipment: String, provider: String, minWeight: String, maxWeight: String ,country: String, price: String)
}
