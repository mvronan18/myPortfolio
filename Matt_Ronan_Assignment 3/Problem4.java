
public class Problem4 {

	public static int squareroot(int x)
	{
		int i = x/2; 
		int result = i*i;
		int start = 0;
		int end = x;
		while(start <= end) {
			if(result > x) {
			 	end = i -1;
			 	i = (start + end)/2;
			 	result = i*i;
			}
			else if(result < x) {
				start = i + 1;
			 	i = (start + end)/2;
			 	result = i*i;
			}
		}
		return i;
	
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test your count() method here
		
		int x1 = 8;
		int x2 = 5;
		int x3 = 17;
		System.out.println("The square root of " + x1 + " is " + squareroot(x1));
		System.out.println("The square root of " + x2 + " is " + squareroot(x2));
		System.out.println("The square root of " + x3 + " is " + squareroot(x3));
		
		
	}

}
