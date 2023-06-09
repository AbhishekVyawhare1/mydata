package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Abhishek", null, "Gajanan", null, "Vyawhare");

		List<String> A = new ArrayList<>();
		for (String n : words) {

			if (n != null) {
				A.add(n);
			}
		}
		System.out.println(A);

//		List<String> A = words.stream().filter(w -> w != null).collect(Collectors.toList());
//		System.out.println(A);
	}

}
