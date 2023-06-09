package StreamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numberList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		ArrayList<Integer> numberList = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		for (int i = 1; i <= a; i++) {
			numberList.add(s.nextInt());
		}

		Optional<Integer> min = numberList.stream().max((m1, m2) -> {
			return m1.compareTo(m2);
		});
		System.out.println(min.get());
	}
}
