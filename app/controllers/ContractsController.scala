package controllers

import play.api._
import play.api.mvc._
import play.api.i18n._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.libs.json.Json
import models._
import dal._

import scala.concurrent.{ExecutionContext, Future}

import javax.inject._

/**
  * Created y gopal on 10/29/16.
  */
@Singleton
class ContractsController @Inject()(val messagesApi: MessagesApi)
                                   (implicit ec: ExecutionContext) extends Controller with I18nSupport {

  /**
    * The mapping for the person form.
    */
  val searchCriteriaForm: Form[SearchCriteriaForm] = Form {
    mapping(
      "contractName" -> nonEmptyText,
      "contractID" -> nonEmptyText,
      "contractType" -> nonEmptyText,
      "version" -> nonEmptyText,
      "category" -> nonEmptyText,
      "contractEntity" -> nonEmptyText
    )(SearchCriteriaForm.apply)(SearchCriteriaForm.unapply)
  }

  /**
    * The index action.
    */
  def search = Action {
    Ok(views.html.Contracts.contractsSearch(searchCriteriaForm))
  }

  def search1 = Action { implicit request =>
    searchCriteriaForm.bindFromRequest.fold(
      errors => BadRequest(views.html.Contracts.contractsSearch(searchCriteriaForm)),
      label => {
        Redirect(routes.ContractsController.search())
      }
    )
  }
}

case class SearchCriteriaForm(contractName: String, contractID: String, contractType: String, version: String, category: String, contractEntity: String)