package eu.bergamote.eclipse.scala.java.maven.handlers

class HelloScala {
	def getMessage() : String = { "Hello Scala..." + new HelloJava().getMessage() }
	
}