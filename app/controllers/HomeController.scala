package controllers

import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { Ok(Json.obj("answer" -> "Hello World")) }

  def exception = Action {
    throw new RuntimeException("This is an error message")

    Ok("will never be called")
  }
}
