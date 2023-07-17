//Sum of two numbers
import scala.math
def ReturnSum(num1: Int, num2: Int): Int = {
	return num1+num2;
}

@main def main(): Unit = 
	print("Enter number one: ");
	var num1 = scala.io.StdIn.readInt();
	print("Enter number two: ");
	var num2 = scala.io.StdIn.readInt();
	printf("Century is %d", ReturnSum(num1,num2));
