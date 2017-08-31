class man(val age:Int, val name:String) {

	def hellski():Int  = {
		println("I am " + name)
		println("I am " + age + " years old")
		return (age)
	}
	}
	
val cat = new man(22, "pat")
println(cat.age)
println(cat.name)
cat.hellski()
