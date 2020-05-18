import java.util.Arrays;


public class Problem1 {


	
	public static MinMaxDiff findmaxdiff (double[] A)
	{
		MinMaxDiff maxDiff = new MinMaxDiff();

		if(A.length == 1) {
			maxDiff.min = A[0];
			maxDiff.max = A[0];
			maxDiff.diff = 0;
			
		}
		else if(A.length == 2) {
			if(A[0] < A[1]) {
				maxDiff.min = A[0];
				maxDiff.max = A[1];
				maxDiff.diff = A[1] - A[0];

			}
			else {
				maxDiff.min = A[1];
				maxDiff.max = A[0];
				maxDiff.diff = A[0] - A[1];

			}
		}
		else {
		
		int length = A.length;
		double[] L = Arrays.copyOfRange(A, 0, (length + 1)/2);
		double[] R = Arrays.copyOfRange(A, ((length + 1)/2), length);
		MinMaxDiff left = new MinMaxDiff();
		MinMaxDiff right = new MinMaxDiff();
		
		left = findmaxdiff(L);
		right = findmaxdiff(R);
		
		double otherDiff = right.max - left.min;
		
		if(left.max > right.max) {
			maxDiff.max = left.max;
		}
		else {
			maxDiff.max = right.max;
		}
		
		if(left.min < right.min) {
			maxDiff.min = left.min;
		}
		else {
			maxDiff.min = right.min;
		}
		
		if(left.diff > right.diff) {
			maxDiff.diff = left.diff;
		}
		else {
			maxDiff.diff = right.diff;
		}
		
		if(otherDiff > maxDiff.diff) {
			maxDiff.diff = otherDiff;
		}
	
		
		}
		
		return maxDiff;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your findmaxdiff() method here
		
		double[] testarray1 = {2, 3, 10, 6, 4, 8, 1};
		// maxdiff: 8
		
		double[] testarray2 = {7, 9, 1, 6, 3, 2};
		// maxdiff: 5
		
		MinMaxDiff arr1 = new MinMaxDiff();
		MinMaxDiff arr2 = new MinMaxDiff();
		
		arr1 = findmaxdiff(testarray1);
		arr2 = findmaxdiff(testarray2);

		System.out.println(arr1.diff);
		System.out.println(arr2.diff);


		
		// Add test statements 
		
		
		
	}
}
