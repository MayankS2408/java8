package Program;

import java.util.ArrayList;
import java.util.List;

public class maximumarray {

	public static void main(String[] args) {

		int[] a = { 2, 5, 8, 3, 9, 1 };
		List<Integer> list = new ArrayList<>();

		for (int i = a.length - 1; i >= 0; i--) {
			list.add(a[i]);

		}
		System.out.println(list);
	}

}
