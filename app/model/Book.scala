package model

import java.net.URL

case class Book (isbn:String, title:String, author:String, categories:List[Category], libraries:List[Library], coverImage:URL) {

}