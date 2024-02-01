package Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {

		int[] a = { 2, 4, 3, 5, 2, 3 };

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if(!set.contains(a[i])) {
				set.add(a[i]);//not duplicate
			}else {
				list.add(a[i]);//duplicate
			}
		}
		System.out.println(set);
		System.out.println(list);
	}

}
