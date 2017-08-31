// do the stats

   //def matchTest(x: Int): String = x match {
      //case 1 => "one"
      //case 2 => "two"
      //case _ => "many"
   //}

def uniform_pdf(input:Double):Int = {
	if (input >= 0 & input < 1) {
		return 1
	}
	else {
		return 0
	}
}



val t = uniform_pdf(0.7)
println(t)
