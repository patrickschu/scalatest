// use newton to figure out sqr root

val tolerance = 0.0000000001

def newton(number: Double, guess: Double, tol:Double) : Double = {
  println("running newton, guess:" + guess)
  def abs(x: Double) = if (x > 0) x else -x

  def improveguess(number: Double, guess: Double) :Double =
    (guess + number / guess) / 2

  def goodenough(number: Double, guess: Double, tol: Double) : Boolean =
    abs(guess * guess - number) / number < tolerance

  if (goodenough(number, guess, tol)) guess
  else newton(number, improveguess(number, guess), tol)
}

newton(1000000000, 1, tolerance)
