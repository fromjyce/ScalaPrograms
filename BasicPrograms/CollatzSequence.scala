//Collatz Sequence

def Collatz(num: Int) : List[Int] =
	var newnum = num
	var lst =  List[Int]
	if (num==0) {
		return 0
	}	
	else {
		while (newnum!=1) {
			if (newnum%2==0){
				newnum = newnum/2
				lst.append(newnum)
			}
			else {
				newnum= (3*newnum)+1
				lst.append(newnum)
			}
		}
	}
		return lst

@main def main() = 
	println(Collatz(13))
