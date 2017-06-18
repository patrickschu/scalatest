class Person(val first: String = "patrick", val last: String = "schultz") {
	val initial = first(0)
	val last_string = last.toString
	def fullname = first + last
	
	}

//val man = new Person ("tommy", "1000")

val man = new Person(last = "deppski")

println(man.initial)
println(man.fullname)

/**Name Colour Food
Oswald
Henderson
Quen n Black
Ginger
Tabby and white Milk
Chips
Curry
**/

class Cat (val name: String = "Default", val color: String = "Green", val food: String = "Cat food") {
	println(name); println(color); println(food + "\n+++\n")
}

val t = new Cat(name = "deppski", "purple")
val Oswald = new Cat ( name = "Oswald", color = "black", food = "milk")
val Henderson = new Cat ( name = "Henderson", color = "ginger", food = "chips")
val Qen = new Cat ( name = "Quen", color = "tabby and white", food = "curry")


/**object argh {
def a = {
println("a")
1
}
**/
//object for one-time things, classes for repeated objects.
//e.g. we could make a ChipShop instance of a Shop class. 
object ChipShop {
	def willServe(in:Cat):Boolean = {
		if (in.food == "chips") 
			true 
		else 
			false}
}


println(ChipShop.willServe(Oswald))
println(ChipShop.willServe(Henderson))

class Counter (val count: Int ) {
	def inc = new Counter(count + 1)
	def dec = new Counter(count - 1)
}

println(new Counter(0).dec.dec.dec.dec.count)
//println(t)
println ("assi".split(" ").toList.map( x => x+1))//.map("a" => "x")
