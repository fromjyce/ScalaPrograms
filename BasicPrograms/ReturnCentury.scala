/*Given a year, return the century it is in. 
The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.
Example
For year = 1905, the output should be
solution(year) = 20;
For year = 1700, the output should be
solution(year) = 17*/
import scala.math
def ReturnCentury(year: Int): Int = {
	return math.ceil(year.toDouble /100).toInt;
}

@main def main(): Unit = 
	print("Enter the year: ");
	var year = scala.io.StdIn.readInt();
	printf("Century : %d", ReturnCentury(year));
