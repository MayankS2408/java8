package Program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s = "Final";
		String s1 = "Fnial";
		System.out.println(findanagram(s, s1));

	}

	public static boolean findanagram(String s, String s1) {

		int n = s.length();
		int m = s1.length();

		if (n != m) {
			return false;
		}

		char[] a = s.toCharArray();
		char[] b = s.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);

	}
}
