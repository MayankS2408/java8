package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {

		int[] a = { 2, 5, 8, 3, 9, 1 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		System.out.println(list);
	}

}
