package MapDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapDemo3 {
//	public static void main(String[] args) {
//		List<Integer> num = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 0);
//
//		List<Integer> MultipliedNum = new ArrayList<>();
//
////		for (int n : num) {
////			MultipliedNum.add(n * 3);
////
////		}
////		System.out.println(MultipliedNum);
////		MultipliedNum = num.stream().map(a -> a * 3).collect(Collectors.toList());
////		System.out.println(MultipliedNum);
//		
//		num.stream().map(a->a*3).forEach(a->System.out.println(a));
//	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int a1 = s.nextInt();
		System.out.println("Enter VALUES");
		List<Integer> num = new ArrayList<>();
		List<Integer> MultpliedNum = new ArrayList();
		for (int i = 0; i < a1; i++) {
			num.add(s.nextInt());
		}
		System.out.println("multiplied by which Number");
		int a = s.nextInt();
		for (int number : num) {
			MultpliedNum.add(number * a);
		}
		System.out.println(MultpliedNum);
	}
}
