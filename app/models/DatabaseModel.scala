package models

import slick.jdbc.PostgresProfile.api._
import scala.concurrent.ExecutionContext
import models.Tables._
import shapes.ShipmentShapes.{ResultShipment, ShipmentData}

class DatabaseModel(db: Database)(implicit ec: ExecutionContext) {

  def getRates(country: String, weight: Int) = {
     db.run(Rates.filter( row => row.country === country && row.minWeight <= weight && row.maxWeight >= weight).result)
  }

  def multiGetRates(shipments : ShipmentData) =  {
    db.run(
      (for {
          rates <- Rates.filter(row => row.country === shipments.countryCode && row.maxWeight >= shipments.price && row.minWeight<= shipments.price).sortBy(_.price)
         } yield {
        rates
      }).result
    ).map(items => items.map(item => ResultShipment(item.id.toString, item.provider, item.minWeight.toString, item.maxWeight.toString, item.country.toString, item.price.toString)))
   }
}
