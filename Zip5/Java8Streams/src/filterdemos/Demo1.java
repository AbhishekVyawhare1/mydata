package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<String> names =new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("ENter Number choice");
		int a = input.nextInt();
		for (int i = 1; i <= a; i++) {
			names.add(input.next());
		}

		
		
		
		names.stream().filter(a->a.length()>4 && a.length()<10).forEach(a1->System.out.println(a1));
	}
}
