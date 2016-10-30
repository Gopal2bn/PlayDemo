package views
import views.html.helper._
import views.html.myInputBox

/**
  * Created by gopal on 10/30/16.
  */

object MyHelpers {
  implicit val emailinput = new FieldConstructor {
    def apply(elements: FieldElements) = myInputBox(elements, "user", true)
  }
}
