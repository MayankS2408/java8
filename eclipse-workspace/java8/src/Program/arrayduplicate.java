package Program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class arrayduplicate {

	public static void main(String[] args) {

		 int[] array = {4, 2, 7, 2, 1, 7, 4, 8};
		 
		 Set<Integer>set= new LinkedHashSet<>();
		 
		 for(int element:array) {
			 set.add(element);
		 }
		 
		 System.out.println(set);

	}

}
