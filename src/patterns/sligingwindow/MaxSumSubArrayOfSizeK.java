package patterns.sligingwindow;

public class MaxSumSubArrayOfSizeK {
	public static int findMaxSumSubArray(int k, int[] arr) {
		int maxSum = 0;
		int windowStart = 0;
		int sum = 0;

		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			sum += arr[windowEnd]; // add the next element

			// slide the window, we don't need to slide if we've not hit the required window
			// size of 'k'
			if (windowEnd >= k - 1) {
				maxSum = Math.max(maxSum, sum);
				sum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 });
		System.out.println(result);
	}

}
