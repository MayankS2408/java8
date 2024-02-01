package Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringremovetarget {

	public static void main(String[] args) {

		String s="Mayank";
		char c='y';
		
		System.out.println(removeelement(s, c));

	}

	public static List<Character> removeelement(String s, char c) {

		Set<Character> set = new HashSet<>();
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (a == c) {
				set.add(a);
			} else {
				list.add(a);
			}
		}
		return list;

	}

}
