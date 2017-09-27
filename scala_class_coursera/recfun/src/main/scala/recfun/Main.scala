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
   def balance(chars: List[Char]) : Boolean =
     {
       def isParens(char: Char): Int =
         if (char == ')') {-1}
         else if (char == '(') {1}
         else {0}

       def loop(chars: List[Char], acc: Int): Int =
       {
         if (chars.isEmpty) {acc}
         else if (acc + isParens(chars.head) < 0) {-1}
         else {
           println(chars.head)
           loop(chars.tail, acc + isParens(chars.head))
           }
         }
         loop(chars, 0) == 0
       }




      /**
       * Exercise 3
       */
        def countChange(money: Int, coins: List[Int]): Int = ???
      }
