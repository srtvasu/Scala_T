package scala.training

object Upper{
	
	def upper(strings: String*): Seq[String] = {
		strings.map( (s:String) => {
				Console.println(s)
				s.toUpperCase()
		})
	}
	
	def main(args: Array[String]) = {
		//var up = new Upper
	  
		Console.print(Upper.upper("Vasu", "Shreenidhi", "Vidya"))
		println("")
	}

}

