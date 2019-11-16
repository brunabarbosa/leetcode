package patterns.sligingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

	public static int findLength(String str, int k) {
		
		int windowStart = 0;
		int max = 0;
		
		Map<Character, Integer> charFrequencyMap = new HashMap<>();
		
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			if (charFrequencyMap.containsKey(str.charAt(windowEnd))) {
				charFrequencyMap.put(str.charAt(windowEnd), charFrequencyMap.get(str.charAt(windowEnd)) + 1);
			} else {
				charFrequencyMap.put(str.charAt(windowEnd), 1);
			}
			
			while (charFrequencyMap.size() > k) {
				charFrequencyMap.put(str.charAt(windowStart), charFrequencyMap.get(str.charAt(windowStart)) - 1);
				if (charFrequencyMap.get(str.charAt(windowStart)) < 1) {
					charFrequencyMap.remove(str.charAt(windowStart));
				}
				
				windowStart++;
			}
			
			max = Math.max(max, windowEnd - windowStart + 1);
		}
		
		return max;
	}

	public static void main(String[] args) {
		int result = LongestSubstringKDistinct.findLength("araaci", 1);
		System.out.println(result);
	}

}
