package Program;

public class deletevowel {

	public static void main(String[] args) {

		String s = "Mayank";
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				build.append(c);
			}

		}
		System.out.println(build);
	}
}