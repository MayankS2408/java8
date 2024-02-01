package Program;

public class Stringpalindrome {

	public static void main(String[] args) {

		ispalindrome("ABDDBA");
	}

	public static void ispalindrome(String s) {

		String rev = "";
		String palkin = s;

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
			if (rev.equals(palkin)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}
		}

	

}
