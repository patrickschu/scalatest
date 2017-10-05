// higher order functions
// sum all ints between a and b

def SumInts(a:Int, b:Int): Int = {
	println("Running SumInts, a is" + a) 
	if (a > b) 0 else a + SumInts(a + 1 , b)}

val t = SumInts(1, 4)
println("1 and 4: " + t)
//val x = SumInts(1, 200)
//println("1 and 200: " + x)

def cube(x: Int): Int = x * x * x

def sumCubes(a:Int, b:Int): Int = 
	if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

val cu = sumCubes(1,4)
println(cu)


// create generalized version, remember the math notation

def sum (fun: Int => Int, a: Int, b: Int): Int = 
	if (a > b) 0 else fun(a) + sum(fun, a + 1, b)


def depp (x: Int): Int = x

val de = sum (depp, 1, 4)
println(de)

// the below we could enter instead of writing the whole def beforehand
// note the =>
(x: Int) => x * x * x

// see how we use it. cool. 
val c = sum ((x:Int) => x * 2, 1, 4)
// we can often infer the type
val d = sum(x => x * 2, 1, 4)
println("c be " + c)

//write a tail recursive version of sum
def sumtailrec(func: Int => Int)(a: Int,  b: Int): Int = {
	def loop(a: Int, acc: Int) : Int = {
		if (a > b) acc
		else loop (a + 1, func(a) + acc)
}
	loop(a, 0)
}

val du = sumtailrec(x => x*x)(3,5)
println(du)

// Currying, aka functions returning other functions

def sumcurry(func: Int => Int) : (Int, Int) => Int = {
	def sumfun(a: Int, b: Int):Int = { 
		if (a > b) 0
		else func(a) + sumfun(a + 1, b)}
	sumfun}

// Lecture 2.2
// note that we call this: sumcurry(function)(x, y)

def product(func: Int => Int)(a: Int, b: Int) : Int =
	if (a > b) 1 
	else func(a) * product(func)(a + 1, b)



val gu = product(x => x * x)(3,7)
println(gu)

def factorial(in: Int):Int = product(x => x)(1,in)

val gugu = factorial(5)
println(gugu)
