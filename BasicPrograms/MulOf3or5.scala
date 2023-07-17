//Find the sum of all the multiples of 3 or 5 below 1000


def Mulof3or5(num: Int): Unit  = 
	var counter =  0
	var sum =  0
	for (counter <- 1 to num-1) {
		if (counter%3==0 || counter%5==0) {
			println(counter)
			sum+=counter
		}
	}
	print(sum)


@main def main(): Unit = 
	print("Enter the limit: ")
	var num = scala.io.StdIn.readInt()
	Mulof3or5(num)
