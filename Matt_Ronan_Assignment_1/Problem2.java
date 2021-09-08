public class Problem2 {

	
	
	public static int missingnumber(int[] A)
	{
		int temp = 0;//holds value to be transfer in array
		int temp2 = 1;

		for(int g = 0; g < A.length; g++)
		{	
			for(int i = 0; i < A.length; i++) {
				if(A[i] > A[g]) {
					temp = A[g];
					A[g] = A[i];
					A[i] = temp;	
				}
			}
			
		}
		
		for(int j = 0; j < A.length - 1; j++) {
			System.out.print(A[j]);
		}

		for(int k = 0; k < A.length - 1; k++) {
			if(A[k] == A[k + 1] - 1) {
			}
			else {
				return A[k] + 1;
			}
		} 
		return -1;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your majority method
		
		int[] testarray1 = {2, 4, 1, 6, 3, 7, 8};
		
		int[] testarray2 = {6, 3, 4, 5, 1};
		
		
		System.out.println("The missing number in testarray1 "+ missingnumber(testarray1));
		System.out.println("The missing number in testarray2 "+ missingnumber(testarray2));
		
	}

}
