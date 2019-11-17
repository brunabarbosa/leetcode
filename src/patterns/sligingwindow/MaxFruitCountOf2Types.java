package patterns.sligingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
	public static int findLength(char[] arr) {
		int windowStart = 0;
		int fruits = 0;

		Map<Character, Integer> frequency = new HashMap<>();

		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			addFruit(frequency, arr[windowEnd]);

			while (frequency.size() > 2) {
				removeFruit(frequency, arr[windowStart]);
				windowStart++;

			}
			fruits = Math.max(fruits, windowEnd - windowStart + 1);
		}
		return fruits;
	}

	private static void addFruit(Map<Character, Integer> frequency, char c) {
		frequency.put(c, frequency.getOrDefault(c, 0) + 1);
	}

	private static void removeFruit(Map<Character, Integer> frequency, char c) {
		frequency.put(c, frequency.getOrDefault(c, 0) - 1);

		if (frequency.get(c) == 0) {
			frequency.remove(c);
		}
	}

	public static void main(String[] args) {
		int result = MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' });
		System.out.println(result);
	}
}
