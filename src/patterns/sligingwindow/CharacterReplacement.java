package patterns.sligingwindow;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {

	public static int findLength(String str, int k) {

		int windowStart = 0;
		int max = 0;
		
		Map<Character, Integer> charFrequencyMap = new HashMap<>();
		
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			charFrequencyMap.put(str.charAt(windowEnd), charFrequencyMap.getOrDefault(str.charAt(windowEnd), 0) + 1);
		
			if (charFrequencyMap.size() > 1) {

				windowStart++;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		int result = CharacterReplacement.findLength("abbcb", 1);
		System.out.println(result);
	}

}
