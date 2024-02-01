package Program;

public class digitischaracter {

	public static void main(String[] args) {

		char c = '1';

		if (!Character.isDigit(c)) {
			System.out.println("No digit");
		} else {
			System.out.println("Yes it is digit");
		}

	}

}
