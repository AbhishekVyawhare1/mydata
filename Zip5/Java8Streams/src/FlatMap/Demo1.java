package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

//		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//		List<Integer> list2 = list1.stream().map(lis -> lis + 10).collect(Collectors.toList());
//		System.out.println(list2);

		List<Integer> lst1 = Arrays.asList(1, 2);
		List<Integer> lst2 = Arrays.asList(3, 4);
		List<Integer> lst3 = Arrays.asList(5, 6);

		List<List<Integer>> finallist = Arrays.asList(lst1, lst2, lst3);

		List<Integer> Result = finallist.stream().flatMap(a -> a.stream().map(a1 -> a1 * 3))
				.collect(Collectors.toList());

		System.out.println(Result);
	}
	
	

	

}
																																																																																																																																						

