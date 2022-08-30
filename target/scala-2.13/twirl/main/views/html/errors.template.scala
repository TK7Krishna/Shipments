
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

object errors extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Shipments Cost per provider")/*2.37*/{_display_(Seq[Any](format.raw/*2.38*/("""
"""),format.raw/*3.1*/("""<h2>SHIPMENTS</h2>
<ul>
    Please enter the input as shown below
    <li style="padding-left:1em">  1,NL,100 </li>
    <li style="padding-left:1em">  2,BE,300 </li>
</ul>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/errors.scala.html
                  HASH: 4f62094d861ec9b17389fb688da62cdea4da8741
                  MATRIX: 812->3|855->38|893->39|921->41
                  LINES: 26->2|26->2|26->2|27->3
                  -- GENERATED --
              */
          