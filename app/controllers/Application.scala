package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Application extends Controller {

  def validate = Action(parse.json) {
    request => {
      Logger.info(Json.prettyPrint(request.body))
      Ok("")
    }
  }

}