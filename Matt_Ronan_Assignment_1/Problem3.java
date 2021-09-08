public class Problem3 {

	
	
	public static boolean majority(int[] A)
	{
		int j = A.length/2;
		int k = 0;
		for(int i = 0; i < A.length/2; i++) {
			if(A[i] == A[j]) {
				return true;
			}
			j++;
		}
		
		return false;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your majority method
		
		int[] testarray1 = {0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7};
		
		int[] testarray2 = {0, 0, 0, 1, 1, 2, 3, 10, 10};
		
		
		System.out.println("Does there exist a majoirty element in testarray1? "+ majority(testarray1));
		System.out.println("Does there exist a majoirty element in testarray2? "+ majority(testarray2));
		
	}

}
