//today is lame
//XML
println(<b>The time is {new java.util.Date}</b>)



//Man i never push these

val x = new Function1[Int,Int] { def apply(i:Int) = i }

def plus (a: Int)(b: Int) = "result is"+(a+b)

//Note that we can put an entire function into one of the parentheses
plus(9){val r= new java.util.Random; r.nextInt(100)}

//These are the same?
val whoTo = (s:String) => {s+ " " + depp}
//whoTo: String => String = <function1>
whoTo("ppppp")
//res23: String = ppppp HALLLLLLO
def whoTo(s:String) = {s+ " " + depp}
