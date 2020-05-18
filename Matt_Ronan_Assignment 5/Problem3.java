import java.util.Arrays;

public class Problem3 {
	
	
	
	
	public static void commonelements(double[] A, double[] B)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		double prev = Integer.MIN_VALUE;
		double C[] = new double[5];
		
		while(i < A.length && j < B.length) {
			if(A[i] == B[j] && A[i] != prev){
				C[k] = A[i]; 
				prev = C[k];
				k++; 
				i++; 
				j++; 
			}
			else if(A[i] > B[j]) {
				j++;
			}
			else {
				i++;
			}
		
		}
		
		System.out.println(Arrays.toString(C));
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your commonelements() method here
		double[] testarray1 = {0, 0, 0, 1, 2, 3, 97, 98};
		double[] testarray2 = {0, 1, 2, 3, 4, 4, 10, 98, 100, 100};

		
		System.out.println("Elements that occur in both arrays: ");
		commonelements(testarray1,testarray2);
		//should output 0, 1, 2, 3, 98
		
	}

}
