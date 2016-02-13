

import java.io.File
import java.util.ArrayList

object Test extends App{
  val files = (new File(".")).listFiles()
  def fileMatching(matcher:(String)=>Boolean)={
      for(file <- files;if matcher(file.getName) )
          yield file
  }
  
  def fileEnding(query:String) = fileMatching(_.endsWith(query))
  def fileContaining(query:String)=fileMatching( _.contains(query))
  def fileRegex(query:String) = fileMatching( _.matches(query))
  
  fileEnding("xml").foreach { f => println(f) }
  fileContaining("s").foreach { f => println(f) }
}