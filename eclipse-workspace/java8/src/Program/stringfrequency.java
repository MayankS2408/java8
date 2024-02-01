package Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class stringfrequency {

	public static void main(String[] args) {

		String s = "Mayank";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

}
