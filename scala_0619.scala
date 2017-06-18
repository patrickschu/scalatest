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

def ChipShop(in: Cat) = {if (in.food == "chips") true; else false}

println(ChipShop(Oswald))
println(ChipShop(Henderson))

