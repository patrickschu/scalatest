//testing scala in sublime & atom
//2.1.2 Expressions, Types and Values
//An object is a grouping of data and operations on that data, e.g. 2 is an object
println("hello".toUpperCase)

//A literal expression represents a fixed value that stands “for itself”.

//Although null s are common in Java code, they are considered very bad prac ce in Scala.

//Unit, written () , is the Scala equivalent of Java’s void . Unit is the result of expressions that evaluate to no
//interesting value, such as prin ng to standard output using println .
//We need a placeholder for expressions that don’t yield a useful value, and unit provides just that.


object Gg {
	def nameofgg: String = "This is the namof method"
}

println(Gg)
println(Gg.nameofgg)

object Testi {
	def hello(input:String) : String =
		"Hello " + input
}

println(assert(Testi.hello("t") == "Hello"))
