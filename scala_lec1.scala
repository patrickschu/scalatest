// lecture 1

def abs(x:Int) = if (x >= 0) x else -x



// boleans
//&& for conjunction
//|| for disjunction


//EX: and and or function

def and(x: Boolean, y: Boolean):Boolean =
  {
    //note that we could just do if (x) here. oops.
    // we can protect from crazy loops by using => on the second argument
    if (x == true)
    {
      if (y == true) {true}
      else {false}
    }
    else {false}
  }

def or(x: Boolean, y: Boolean): Boolean =
  {
    if (x == true) {true}
    else if (y == true) {true}
    else {false}
  }


val tests = List((false, false), (false, true), (true, false), (true, true))
for (t <- tests) {println("test case:" + t); println(and(t._1, t._2))}


// make the square root function, using Newton's method
/** calculate the square root of parameter x **/
// def sqrt(in: Double): Double = sqrtIter(1.0, in)
//
// def abs (x:Double) = if (x < 0) -x else x
//
// def sqrtIter(guess: Double, in: Double): Double =
//   if (isGoodEnough(guess, in)) guess
//   else sqrtIter(improve(guess, in), in)
//
// def isGoodEnough(guess:Double, in:Double): Boolean =
//   // note that this returns a Bool cause true or false that smaller than threshold
//   // this first attempt is not good for small and large numberabs
//   //(guess * guess - in) < 0.001
//   //we improve by making it relative to in; divide the value by in
//   // this gives us a consistent ratio
//   (guess * guess - in) / in < 0.001


// def improve(guess: Double, in: Double) = {
//   // take the mean of y + x/y
//   println("now improving!")
//   (guess + in / guess) / 2 }




// lets move the functions inside sqrt
def sqrt_better(in: Double): Double = {

  //check how in is now available to all the functions below

  def abs (x:Double) = if (x < 0) -x else x

  def isGoodEnough(guess:Double): Boolean =
    abs(guess * guess - in) / in < 0.000000000000001

  def improve(guess: Double) = {
    // take the mean of y + x/y
    println("now improving!")
    (guess + in / guess) / 2 }

  def sqrtIter_in(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter_in(improve(guess))

  sqrtIter_in(1.0)
}

//@tailrec
def gcd(one: Int, two:Int) : Int =
  if (two == 0) one
  else gcd(two, one % two)

def factorial(in: Int) : Int =
  if (in == 0) 1 else {println("take fac of "+ (in - 1)); in * factorial(in - 1)}

println(factorial(49))

val sqrttests = Array(1,2,3,4,5,25,48,100,12121212, 1e-6, 1e60)
//for (t <- sqrttests) {println("++++\n\n" + t); println(sqrt_better(t))}


//make factorial tail recursive
//that requires adding a second function
def tailrecfac(in:Int): Int = {
  def loop(acc: Int, in: Int): Int =
    if (in == 0) acc
    else {println("looping at " + (in - 1)); loop(acc * in, in - 1)}
  //note that 1 inits out accumulator; note that it is the right return for in = 0, as needed
  loop(1, in)
}

println(tailrecfac(10))
