
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

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
"""),format.raw/*3.1*/("""<h3>Table of Contents</h3>
<ul>
  <li><a href=""""),_display_(/*5.17*/routes/*5.23*/.HomeController.index()),format.raw/*5.46*/("""#Introduction">Welcome</a>
</ul>
<h3>Related Resources</h3>
<ul>
  <li><a href="https://playframework.com/documentation/"""),_display_(/*9.57*/version),format.raw/*9.64*/("""" target="_blank">Play documentation</a></li>
  <li><a href="https://discuss.lightbend.com/c/play/" target="_blank">Forum</a></li>
  <li><a href="//gitter.im/playframework/playframework" target="_blank">Gitter Channel</a></li>
  <li><a href="//stackoverflow.com/questions/tagged/playframework" target="_blank">Stackoverflow</a></li>
  <li><a href="//lightbend.com/how" target="_blank">Professional support</a></li>
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
                  SOURCE: app/views/commonSidebar.scala.html
                  HASH: c8b3169829ff25c3fb884974eb3550fb77a0ec2d
                  MATRIX: 730->1|826->3|854->6|901->45|951->58|979->60|1055->110|1069->116|1112->139|1263->264|1290->271
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|30->5|30->5|30->5|34->9|34->9
                  -- GENERATED --
              */
          