// esting for assgmt
//
// Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String. For example, the function should return true for the following strings:
//
//     (if (zero? x) max (/ 1 x))
//     I told him (that it’s not (yet) done). (But he wasn’t listening)
//
// The function should return false for the following strings:
//
//     :-)
//     ())(
//
// The last example shows that it’s not enough to verify that a string contains the same number of opening and closing parentheses.
//
// Do this exercise by implementing the balance function in Main.scala. Its signature is as follows:
//
// There are three methods on List[Char] that are useful for this exercise:
//
//     chars.isEmpty: Boolean returns whether a list is empty
//     chars.head: Char returns the first element of the list
//     chars.tail: List[Char] returns the list without the first element
//
// Hint: you can define an inner function if you need to pass extra parameters to your function.
//
// Testing: You can use the toList method to convert from a String to aList[Char]: e.g. "(just an) example".toList.
// check this: https://stackoverflow.com/questions/2711032/basic-recursion-check-balanced-parenthesis#2718114

val test = "(just an) example".toList
val test1 =  "(if (zero? x) max (/ 1 x))".toList
val test2 = "I told him (that it’s not (yet) done). (But he wasn’t listening)".toList
val fals =  ":-)".toList
val fals1 = "())(s".toList
  //
  //
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


balance(test)
//balance(test1)
//balance(test2)
//balance(fals)
