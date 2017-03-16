//CHPTR 4
//call by name
//call by ref: foo(s: String)
//call by name: foo(s => String)

import scala.actors.Actor

//CHPTR 5 Pattern Matching
//Cornerstones of Scala: immutable dtypes, passing funcs as parameters, pattern matching
//attern matching happens with match {case, case,} command, cf switch in Java

// Type testing!
def test1(in: Any) : String = in match {case s: String => "its a string"; case _ => "No clue"}

case class Person(name: String, age: Int, married: Boolean)
//equivalent
val p = Person("david", 21, true)
val t = new Person("david", 21, true)

def older(in:Person): Option[String] = in match {case Person(x,y,z) if y > 35 => Some(x); case _ =>  None}

//limit on chracterisitcs def older(in:Person): Option[String] = in match {case Person(x,y,true) if y > 35 => Some(x); case _ =>  None}


//Pattern matching in lists

def polarizer(in: List[String]): List[String] = in match {
case Nil => Nil
case _ :: "very" :: tail => polarizer(tail)
case x :: tail => x :: polarizer(tail)
}

//CHPTR 5
//Note that methods take def, functions are val x = (x:Int) => x + 1

/*
Chapter 6 
The actor model
*/
//message actor with !
//actor ! msg
//to send message to author

class BActor extends Actor {
def act = loop { 
react { 
case s => println ("Got a message: "+s)
}
}
}