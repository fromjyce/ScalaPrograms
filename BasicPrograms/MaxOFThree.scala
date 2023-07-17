object ExFindLargest {
	def main(args: Array[String]): Unit =  {
		print("Enter first number: ")
		var a = scala.io.StdIn.readInt()
		print("Enter second number: ")
		var b = scala.io.StdIn.readInt()
		print("Enter third number: ")
		var c = scala.io.StdIn.readInt()
		if (a>b && a>c){
			println("Largest number: " + a);
		}
		else if (b>a && b>c) {
			println("Largest number: " + b);
		}
		else {
			println("Largest number: " + c);
		}
	}
}
