package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

		String[] str = { "megha", "raju", "cat", "ab" };

		for (String s : str) {
			System.out.println(s.toUpperCase());
		}
	}

////	public static void main(String[] args) {
//////		ArrayList <Integer> numberList=new ArrayList<Integer>();
//////		numberList.add(10);
//////		numberList.add(15);
//////		numberList.add(20);
//////		numberList.add(25);
//////		numberList.add(26);
////
////		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 26);
////		List<Integer> evenNumbersList = new ArrayList<Integer>();
////
////		// Without using Stream
//////		for (int n : numberList) {
//////			if (n % 2 == 0) {
//////				evenNumbersList.add(n);
//////			}
//////
//////		}
//////		System.out.println(evenNumbersList);
////
////		// With Using Stream
////		//It will Boolean Value
//////		evenNumbersList = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//////		System.out.println(evenNumbersList);
////
////		//It Will Not return any Thing
//////		numberList.stream().filter(n -> n % 2 == 0).forEach(n->System.out.println(n));
////		numberList.parallelStream().filter(n->n%2==0).forEach(System.out::println);
////	}
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		ArrayList<Integer> numberList = new ArrayList<Integer>();
////		numberList.add(10);
////		numberList.add(15);
////		numberList.add(20);
////		numberList.add(25);
////		numberList.add(26);
////		List<Integer> numberList = Arrays.asList(20, 1020, 182, 34, 423, 34, 23);
//
//		System.out.println("Enter How Many Times We Will add Numbers");
//		int a1=s.nextInt();
//		System.out.println("Enter DATA");
//		for (int i = 1; i <= a1; i++) {
//
//			numberList.add(s.nextInt());
//		}
//
//		List<Integer> evenNumberList = new ArrayList<Integer>();
////		for (int f : numberList) {
////			if (f % 2 == 0)
////				evenNumberList.add(f);
////		}
////		System.out.println(evenNumberList);
//
//	
//		evenNumberList=numberList.stream().filter(a->a%2==0).collect(Collectors.toList());
//		System.out.println(evenNumberList);
//	}

}
