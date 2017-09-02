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
      // note edge cases for false: "())("
      def parens_evaluator(in_char: Char): Int = {
        if (in_char == "(") 1
        else if (in_char == ")") -1
        else 0}

      val balanced:Int = 0
      for (c <- chars) {
        val balanced: Int = balanced + parens_evaluator(c)
        print ("Ball at" + balanced)}

      balanced == 0}

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
