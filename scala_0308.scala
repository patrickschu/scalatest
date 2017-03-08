//Immutability

/*List, Options, Map*/
//val x = List(1,2,3,8d,885.9)
//note that this is the same as 
//val x = List.apply(1,2,3,8d,885.9)
//check this
val x = List.apply[Double](1,2,3,8d,885.9)


//use an anoymous func to find unevens
x.filter(i => i % 2 == 1)
//or make it real
def assikind(number_in: Double):Boolean = {(number_in % 2 == 1)}
x.filter(assikind)
//x.remove()

List.apply("AA", "BB").map(s=> s.toLowerCase)
List.apply("AA", "BB").map(_.toLowerCase)
List.apply(2, 200).sorted

//reduceLeft starts computation at beginning, feeds result
//into next iter, pg 62

x.reduceLeft( _ max _)
//the same as
x.reduceLeft((a,b) => if (a > b) a else b)

//tuples and advanced functions
def sumsq(number_in: List[Double]): (Int, Double, Double) = 
	number_in.foldLeft(Tuple3(0,0d,0d))((t,v) => (t._1 + 1, t._2 + v, t._3 + v*v))

def sumsq2(number_in: List[Double]) : (Int, Double, Double) =
	number_in.foldLeft((0,0d,0d)){
	case ((cnt, sum, sq), v) => (cnt + 1, sum + v, sq + v*v)}
	
//you can also make a tuple like so: (x,y,z); == Tuple3(x,y,z)
Tuple2(1,2) == Pair(1,2)

//Here we make a dictionary, pg 70 ++
val m = Map("a" -> "Assi", "b" -> "Oberassi")
//or so val m = Map(("a", "Assi"), ("b", "Oberassi"))
m("a")
//or
m.get("a")
List.apply("a","b", "q").flatMap(m.getOrElse(_,"DEFAULT"))
//add and del
m + (("z", "idi"))
m -= "a"