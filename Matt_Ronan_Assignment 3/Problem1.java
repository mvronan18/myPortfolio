
public class Problem1 {

	public static int count(double[] A, double x)
	{
		return rightSide(A, x) - leftSide(A, x) + 1;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test your count() method here
		
		double[] testarray = {1.3, 2.1, 2.1, 2.1, 2.1, 6.7, 7.5, 7.5, 8.6, 9.0};
		double t1 = 2.1;
		double t2 = 7.5;
		double t3 = 1.3;
		System.out.println(t1+" appears "+ count(testarray, t1) + " times");
		System.out.println(t2+" appears "+ count(testarray, t2) + " times");
		System.out.println(t3+" appears "+ count(testarray, t3) + " times");
		
		
	}
	
	public static int leftSide(double[] A, double x) { 
		int start = 0;
		int end = A.length - 1; 
		int mid = 0;  
				while(start <= end) {
					mid = (end + start)/2;
					if((mid == 0 && A[mid] == x) || (A[mid] == x && A[mid - 1] < x)) 
						return mid;
					else if(A[mid] < x)
						start = mid + 1;
					else if(A[mid] >= x)
						end = mid - 1;
				}
		return mid;
	}
	
	public static int rightSide(double[] A, double x) { 
		int start = 0;
		int end = A.length - 1; 
		int mid = 0;  
				while(start <= end) {
					mid = (end + start)/2;
					if((mid == A.length - 1 && A[mid] == x) || (A[mid] == x && A[mid + 1] > x))
						return mid;
					else if(A[mid] <= x)
						start = mid + 1;
					else if(A[mid] > x)
						end = mid - 1;
				}
		return mid;
	}

}
