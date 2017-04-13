package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class UserController @Inject() extends Controller {

  def list = Action { implicit request =>
    Ok(views.html.users())
  }

}


