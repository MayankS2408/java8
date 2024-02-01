package Program;

public class STRING {

	public static void main(String[] args) {

		String s = "MAY1234";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);

		if(Character.isDigit(c)) {
			System.out.println(c);
		}
	}
	}
}
