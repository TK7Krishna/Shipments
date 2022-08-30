package controllers

import com.fasterxml.jackson.core.JsonParser.Feature
import models.Tables.Rates

import javax.inject._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider

import scala.concurrent.ExecutionContext
import play.api.db.slick.HasDatabaseConfigProvider
import slick.jdbc.{GetResult, JdbcProfile}
import slick.jdbc.PostgresProfile.api._
import shapes.ShipmentShapes._

import scala.concurrent.Future
import models.DatabaseModel
import play.api.Play
import shapes.ShipmentShapes.ShipmentData
import play.api.Configuration
import play.api.libs.json.Json

@Singleton
class DatabaseIO @Inject() (config: Configuration) (protected val dbConfigProvider: DatabaseConfigProvider, cc: ControllerComponents)(implicit ec: ExecutionContext)
  extends AbstractController(cc) with HasDatabaseConfigProvider[JdbcProfile] {

  private val model = new DatabaseModel(db)
  val SHIPMENTS = "Shipments"

  def getPriceByProvider()  = Action.async { implicit request: Request[AnyContent] =>

    val data = request.body.asFormUrlEncoded
    var curreptedData: List[String] = List()
    var shipments: List[ShipmentData] = List()
    data.map{ a =>
      a(SHIPMENTS).map { a =>
         a.split("\n").map{ lines =>
        val row = lines.trim.split(",")
           try { if (row.length == 3) shipments = shipments ::: (ShipmentData(row(0), row(1), row(2).toInt) :: Nil) else curreptedData = curreptedData ::: (a :: Nil)
           } catch {
             case _ : Throwable =>  Ok(views.html.errors())
           }}
        }
  }
    for{
      shipmentRates <-  Future.sequence(shipments.distinct.map(a => model.multiGetRates(a)))
      } yield Ok(views.html.shipmentResponse(shipmentRates.flatten ))
    }
}
