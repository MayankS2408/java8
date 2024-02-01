package Program;

public class stringcase {

	public static void main(String[] args) {

		String a = "MayanK";
		int uppercount = 0;
		int lowercount = 0;
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);

			if (c == Character.toUpperCase(c)) {
				uppercount++;
			} else {
				lowercount++;
			}
		}

		System.out.println(uppercount);
		System.out.println(lowercount);

	}

}
