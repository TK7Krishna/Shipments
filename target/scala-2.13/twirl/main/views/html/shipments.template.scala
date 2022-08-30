
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

object shipments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(task : Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.22*/("""
 """),_display_(/*3.3*/main("Cost Per Provider")/*3.28*/{_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<form method="post" action=home/getRates  xmlns="http://www.w3.org/1999/html">
    <label for="Shipments"> <h2> Enter Shipments: </h2> </label><br>
    <textarea id="Shipments" name="Shipments" rows="30" cols="60">Input as follows ShipmentId, CountryCode, Weight each line is consider as single input.</textarea>
    <input type = "submit">
    <input type="reset">
</form>
""")))}))
      }
    }
  }

  def render(task:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(task)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (task) => apply(task)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/shipments.scala.html
                  HASH: 21b62ab139eee5a2feb8081be4aa200b054471c3
                  MATRIX: 738->3|853->23|882->27|915->52|953->53|983->57
                  LINES: 21->2|26->2|27->3|27->3|27->3|29->5
                  -- GENERATED --
              */
          