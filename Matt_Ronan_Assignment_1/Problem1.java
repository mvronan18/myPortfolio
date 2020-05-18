
public class Problem1 {

	public static int reverse(int input)
	{
		int rev = 0; //this variable will store the reverse of the input

		while(input != 0) {
			rev = rev * 10 + input % 10;//takes the last digit of
			//input and stores it in rev, next iteration it will multiply 
			//by 10 to move it up a place value
			input = input / 10;//reduces input number a place value so next
			//digit can be popped off
		}//while

		return rev;

	}//reverse
	/*Given a 32-bit signed integer input, this method
	reverses the digits of input.*/
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test1 = 123;
		int test2 = -95;
		int test3 = 890;
		
		
		System.out.println("Input :" + test1 + " Output: " + reverse(test1));
		System.out.println("Input :" + test2 + " Output: " + reverse(test2));
		System.out.println("Input :" + test3 + " Output: " + reverse(test3));
		
		
	}

}
