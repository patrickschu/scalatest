val source = scala.io.Source.fromFile("fili.txt", "UTF-8")
val lines = try source.mkString finally source.close()

val dici= collection.mutable.Map[String, Int]()
for (i <- lines.split(" ")) {
	println(i)
	if (dici.contains(i)) 
	{
	dici(i) = dici(i)+1
	} 
	else
	{dici(i) = 1
	}
	}


println(dici)
