package model

import java.net.URL
import play.api.Play.current
import java.util.Date
import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.dao._
import com.mongodb.casbah.Imports._
import se.radley.plugin.salat._
import mongoContext._

case class Book (@Key("isbn") ibn:String, title:String, author:String, categories:List[Category], libraries:List[Library], coverImage:URL) {

}

object BookDAO extends SalatDAO[Book, String](collection = mongoCollection("books"))