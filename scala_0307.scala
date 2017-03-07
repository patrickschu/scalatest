import scala.util.parsing.json.{JSON => Jsonparser}


class me(name:String){if (name == null) throw new Exception("Du Assi")}

new me("volldepp")


//new me()

//Traits, pg 23

trait gg{
	def speak():String = "dppi"
}

class ggg extends gg{
	override def speak(): String = "assi"
}	

//class gggg extends gg with otherclass

val tt=(new ggg).speak()
println(tt)


//object pg 24
object thing {def oo(in: String) = "assi"+in}


//pg 27
//"all classes have uppercase letters at the beginning of their name": Int, Long...
//Unit == Java void
val v = ()

//Methods
def amethod(in: String): String={
	in	+"assis"
}




def combiner(in: String*): String={
	val r: String = "2"
	in.foldLeft("")(_ + _.toString)
	}

	
val t= combiner("assi", "volldepp", "idikopf")
println(t)

def nano()=
{
println("This is the nano")
System.nanoTime
}

val y=nano
println(y)

def delayer(funct: => Long)=
{
println("This is the delayer")
println(funct)
}

delayer(nano())

//Chptr 2, functions, pg 34
//Function1[Int, String]
//equals
//Int => String




def answer(f: Int => String):String={
f.apply(1000)
}

case class Testi(inputi: Int)
val uu= new Testi(22)
//val xx=uu.toString
println(uu.inputi)


//Pattern matching, pg 38
45 match{ case 44=> true; case _=> false}

def tester(in:Boolean)={
if (in) println(in)
}

tester(false)
//for comp
for {i <- 1 to 10} println(i+"aa")

//list comp equ, iterate over list
val lst=List(1,2,3,4)
for { i <- lst if i < 3} yield i

//for { i <- (1 to 20).toList} try {println("first"+i)} finally{println("assiende")}

//try and catch for error catching, pg 44
/* 
check out 
my multi line
comment
*/


