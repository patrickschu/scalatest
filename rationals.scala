//make the rationals class

class Rational(x: Int, y:Int) {
      def numerator = x
      def denominator = y
      // this controls how the REPL prints this out
      override def toString = numerator + "/" + denominator

      def add (that:Rational) =
        // (n1 * d2 + n2 * d1) / (d1 * d2)
        (this.numerator * that.denominator + that.numerator * this.denominator) / (this.denominator * that.denominator)

      def subtract (that: Rational) =
        // (n1 * d2 - n2 * d1) / (d1 * d2)
        (this.numerator * that.denominator - that.numerator * this.denominator) / (this.denominator * that.denominator)

      def mult (that: Rational) =
        // n1 * n2 / d1 * d2
        (this.numerator * that.numerator) / (this.denominator * that.denominator)

      def divi (that: Rational) =
        // n1 * d2 / d1 * n2
        (this.numerator * that.denominator) / (this.denominator * that.numerator)




}

val test = new Rational(100,1)
val two = new Rational(200,100)
println(test)
println(test.numerator)
println(test.add(two))
println(test.subtract(two))
println(test.divi(two))
println(test.mult(two))
