package views.Helpers

import views.html.helper._

import views.html.Helpers.{customFormInputTextField, myInputBox}

/**
  * Created by gopal on 10/30/16.
  */

object MyHelpers {
  implicit val emailinput = new FieldConstructor {
    def apply(elements: FieldElements) = myInputBox(elements, "user", true)
  }

  implicit val customFormInputText = new FieldConstructor {
    def apply(elements: FieldElements) = customFormInputTextField(elements)
  }
}
