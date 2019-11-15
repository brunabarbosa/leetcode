package patterns.sligingwindow;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {

	public static double[] findAverages(int k, int[] arr) {
		double[] result = new double[arr.length - k + 1];

		int windowStart = 0;
		double sum = 0;
		
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			sum += arr[windowEnd];
			
			// slide window
			if (windowEnd >= k - 1) {
				result[windowStart] = sum/k;
				sum -= arr[windowStart];
				windowStart++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
		System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
	}

}
