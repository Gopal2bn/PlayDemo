package views.helpers

import applicationlayer._
import views.html.helper._
import views.html.helpers.{customFormInputTextField, myInputBox, searchDropdownField, searchInputTextField}

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
  implicit val searchInputTextField1 = new FieldConstructor {
    def apply(elements: FieldElements) = searchInputTextField(elements)
  }

  implicit val searchDropdownField1 = new FieldConstructor {
    def apply(elements: FieldElements) = searchDropdownField(elements)
  }
}
