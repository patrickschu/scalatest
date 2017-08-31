//scilliscala

def factor (input_value:Int): Int = {
  if (input_value == 0)
    1
  else
    input_value * factor(input_value -1 )
}

val x = factor(4)
//println(x)

def fibbo(input_value: Int) :Int =
  {
    if (input_value < 2)
      input_value
    else
      return (fibbo(input_value - 1)) + (fibbo(input_value - 2))
    }
var n = 0
while (n < 10000)
{
  println(fibbo(n))
  n = n + 1
}

val y = fibbo(4)
println(y)
val z = fibbo(2)
println(z)
