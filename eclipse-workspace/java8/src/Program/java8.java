package Program;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class java8 {

	public static void main(String[] args) {

		String a = "Mayank";
		System.out.println(Stringcharac("Mayank"));

		removeduplicate(a);
	}

	public static long Stringcharac(String s) {
		return s.chars().filter(c -> !Character.isWhitespace(c)).count();

	}

	public static void removeduplicate(String s) {
		Arrays.stream(s.split("")).collect(Collectors.toSet()).forEach(System.out::print);

	}

}
