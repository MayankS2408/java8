package Program;

public class stringvowelconsonent {

	public static void main(String[] args) {

		String s = "Myank";
		int vow = 0;
		int con = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vow++;
			} else {
				con++;
			}
		}
		
		System.out.println("no of vowels"+ " " + vow);
		System.out.println("no of consonenet"+ " " +con);
	}
}
