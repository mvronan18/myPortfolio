public class Problem2 {
	
	
	
	
	public static boolean checksum(double[] A, double[] B, double x)
	{
		int i = 0;
		int j = 0;
		double answer = 0;
		
		while(i < A.length && j < B.length) {
			if(A[i] + B[j] == x) {
				return true;
			}
			else if(A[i] > B[j]) {
				j++;
			}
			else {
				i++;
			}
		}
		return false;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your checksum() method here
		double[] testarray1 = {1, 10, 45};
		double[] testarray2 = {-8, 4, 6};
		double target1 = 16;
		double target2 = 70;
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target1 + "?");
		System.out.println(checksum(testarray1,testarray2, target1));
		// should print true
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target2 + "?");
		System.out.println(checksum(testarray1,testarray2, target2));
		// should print false
		
	}

}
