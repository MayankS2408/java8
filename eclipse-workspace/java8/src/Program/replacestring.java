package Program;

public class replacestring {

	public static void main(String[] args) {

		String s = "May nk";
		char c = 'h';

		replace(s, c);

	}

	public static void replace(String s, char c) {

		
		StringBuilder build= new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
                 build.append(c);
			} else {
                build.append(s.charAt(i));
            }

		}
		System.out.println(build.toString());
	}

}
