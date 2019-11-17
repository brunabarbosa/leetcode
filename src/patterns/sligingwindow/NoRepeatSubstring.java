package patterns.sligingwindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
	public static int findLength(String str) {
		int windowStart = 0;
		int max = 0;

		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			charFrequencyMap.put(str.charAt(windowEnd), charFrequencyMap.getOrDefault(str.charAt(windowEnd), 0) + 1);

			while (charFrequencyMap.get(str.charAt(windowEnd)) > 1) {
				charFrequencyMap.put(str.charAt(windowStart),
						charFrequencyMap.getOrDefault(str.charAt(windowStart), 0) - 1);

				if (charFrequencyMap.get(str.charAt(windowStart)) == 0) {
					charFrequencyMap.remove(str.charAt(windowStart));
				}

				windowStart++;
			}

			max = Math.max(max, windowEnd - windowStart + 1);

		}

		return max;

	}

	public static void main(String[] args) {
		int result = NoRepeatSubstring.findLength("aabccbb");
		System.out.println(result);
	}
}
