package Program;

public class array {

	public static void main(String[] args) {

		int[] a = { 2, 5, 8, 3, 9, 7 };
		int target = 12;

		boolean value = false;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					value = true;
					System.out.println(a[i] + " " + a[j]);
					break;
				}
			}

		}

		if (value) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
