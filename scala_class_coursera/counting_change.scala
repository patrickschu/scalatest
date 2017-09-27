// Exercise 3: Counting Change
//
// Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.
//
// Do this exercise by implementing the countChange function inMain.scala. This function takes an amount to change, and a list of unique denominations for the coins. Its signature is as follows:
//
// Once again, you can make use of functions isEmpty, head and tail on the list of integers coins.
//
// Hint: Think of the degenerate cases. How many ways can you give change for 0 CHF(swiss money)? How many ways can you give change for >0 CHF, if you have no coins?


def countChange(money: Int, coins: List[Int]): Int = {
  if (money < 0) 0
  else if (coins.isEmpty) if (money == 0) 1 else 0
  else {
    //println("iter; money is " + money + ";coins is " + coins)
    countChange(money - coins.head, coins) + countChange(money, coins.tail)}
    }

  def count_Change(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else if (coins.isEmpty) if (money == 0) 1 else 0
    else {
      println("money is" + money)
      println("money less coins head", money - coins.head)
      println("coins", coins)
      println(count_Change(money - coins.head, coins))// + count_Change(money, coins.tail)}
      1
      }
    }


val t = count_Change(10, List(1))
println(t)
