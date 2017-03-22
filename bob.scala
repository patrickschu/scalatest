object Bob {
	def apply(in:String):String = in match {
		case nocontent if in.isEmpty => "Fine. Be that way!"
		case question if in.endsWith("?") => "Sure." 
		case yell if in.endsWith("!") => "Whoa, chill out!" 
		case _ => "Whatever."
		}
	}

