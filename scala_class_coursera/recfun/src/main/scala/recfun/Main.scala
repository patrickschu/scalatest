package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(column: Int, rowz: Int): Int =
      // note that pascal (col, row) = (pascal(col - 1, row - 1) + pascal(col, row - 1))
      if (rowz == 0 | column == 0) 1
      // probs we could add the below to our | condition
      else if (rowz == column) 1
      else pascal(column -1 , rowz - 1) + pascal(column, rowz - 1)
      //this is the top down



  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      // iterate over `chars`. Count # of parens
      // jeez this was difficult, and is still not quite 100 %
      // we essentially run the loop over every item in chars, adding to the iterator `acc`

      def evaluator(in:Char): Int = {
        //println("run evaluator")
        if (in == '(') {println("plus one"); val t = 1}
        else if (in == ')') {println("neg one"); val t = -1}
        else {val t = 0}
        t
      }

      /**chars.isEmpty: Boolean returns whether a list is empty
      chars.head: Char returns the first element of the list
      chars.tail: List[Char] returns the list without the first element**/
      def loop(loop_in:List[Char], acc: Int):Int = {
        if (loop_in.isEmpty) {
          println("returnign" + acc)
          acc}
        //else if (loop_in.last == '(' | loop_in.head == ')') {println("catch ex"); 1}
          else {
            if (acc < -1 | acc > 1) {1}
            else{
            println("looping over" + acc)
            loop(loop_in.tail, (acc + evaluator(loop_in.head)))}
          }}

        if (chars.last == '(' | chars.head == ')') {false}
        else {val t = loop(chars, 0); t == 0}
        }

        //val t = "(if (zero? x) max (/ 1 x))".toList
        //val x = balance(t)
        //println (x)

      // def tailrecfac(in:Int): Int = {
      //   def loop(acc: Int, in: Int): Int =
      //     if (in == 0) acc
      //     else {println("looping at " + (in - 1)); loop(acc * in, in - 1)}
      //   //note that 1 inits out accumulator; note that it is the right return for in = 0, as needed
      //   loop(1, in)
      // }



      /**
       * Exercise 3
       */
        def countChange(money: Int, coins: List[Int]): Int = ???
      }
