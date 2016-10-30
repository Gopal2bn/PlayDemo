package controllers

import javax.inject.{Inject, Singleton}

import play.api.i18n.{I18nSupport, Messages, MessagesApi}
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.mvc.{Action, Controller}

import scala.concurrent.ExecutionContext

/**
  * Created y gopal on 10/29/16.
  */
@Singleton
class LoginController @Inject() (val messagesApi: MessagesApi)
(implicit ec: ExecutionContext) extends Controller with I18nSupport{

  /**
    * The mapping for the person form.
    */
  val loginForm: Form[LoginForm] = Form {
    mapping(
      "username" -> nonEmptyText,
      "password" -> nonEmptyText,
      "email"-> nonEmptyText
    )(LoginForm.apply)(LoginForm.unapply)
  }

  /**
    * The index action.
    */
  def login = Action {
    Ok(views.html.login(loginForm))
  }

}

case class LoginForm(username: String, password:String,email:String)