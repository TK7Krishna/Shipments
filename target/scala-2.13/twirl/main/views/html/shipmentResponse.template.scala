
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object shipmentResponse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[shapes.ShipmentShapes.ResultShipment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task : List[shapes.ShipmentShapes.ResultShipment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),_display_(/*2.2*/main("Shipments Cost per provider")/*2.37*/{_display_(Seq[Any](format.raw/*2.38*/("""
"""),format.raw/*3.1*/("""<h2>SHIPMENTS</h2>
    <ul>
     """),_display_(/*5.7*/if(task.length < 1 )/*5.27*/{_display_(Seq[Any](format.raw/*5.28*/("""No Shipments found for the given input combination, please try something different""")))}),format.raw/*5.111*/("""
        """),_display_(/*6.10*/if(task.nonEmpty)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
        """),_display_(/*7.10*/for( i <- task) yield /*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
        """),format.raw/*8.9*/("""<li style="padding-left:1em"> SHIPMENTID: """),_display_(/*8.52*/i/*8.53*/.shipment),format.raw/*8.62*/(""", PROVIDER: """),_display_(/*8.75*/i/*8.76*/.provider),format.raw/*8.85*/(""", COUNTRY: """),_display_(/*8.97*/i/*8.98*/.country),format.raw/*8.106*/(""", WEIGHT: """),_display_(/*8.117*/i/*8.118*/.minWeight),format.raw/*8.128*/(""" """),format.raw/*8.129*/("""- """),_display_(/*8.132*/i/*8.133*/.maxWeight),format.raw/*8.143*/(""", PRICE: """),_display_(/*8.153*/i/*8.154*/.price),format.raw/*8.160*/("""</li>
        """)))}),format.raw/*9.10*/("""
        """)))}),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</ul>
    <form method="get" action= /  xmlns="http://www.w3.org/1999/html">

        <button onclick= action > Home </button>
    </form>
""")))}))
      }
    }
  }

  def render(task:List[shapes.ShipmentShapes.ResultShipment]): play.twirl.api.HtmlFormat.Appendable = apply(task)

  def f:((List[shapes.ShipmentShapes.ResultShipment]) => play.twirl.api.HtmlFormat.Appendable) = (task) => apply(task)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/shipmentResponse.scala.html
                  HASH: 4feeddf708017bd5c1562e9c7026a8f26e212735
                  MATRIX: 776->1|922->52|950->55|993->90|1031->91|1059->93|1120->129|1148->149|1186->150|1300->233|1337->244|1362->261|1400->262|1437->273|1467->288|1505->289|1541->299|1610->342|1619->343|1648->352|1687->365|1696->366|1725->375|1763->387|1772->388|1801->396|1839->407|1849->408|1880->418|1909->419|1939->422|1949->423|1980->433|2017->443|2027->444|2054->450|2100->466|2142->477|2175->483
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|33->8|34->9|35->10|36->11
                  -- GENERATED --
              */
          