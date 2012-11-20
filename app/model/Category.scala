package model

import play.api.Play.current
import java.util.Date
import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.dao._
import com.mongodb.casbah.Imports._
import se.radley.plugin.salat._
import mongoContext._

case class Category (@Key("id") id:String, name:String){

}

object CategoryDAO extends SalatDAO[Category, String](collection = mongoCollection("categories"))