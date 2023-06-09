package StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//reduce()
//toArray()
public class Demo3 {

	/*
	 * public static void main(String[] args) { List<String> name =
	 * Arrays.asList("A", "B", "C", "D", "1", "2", "3", "4", "5"); //
	 * Optional<String> n = name.stream().reduce((value, Combinedvalue) -> { //
	 * return value + Combinedvalue; // }); // System.out.println(n.get());
	 * 
	 * Object arr[] = name.stream().toArray(); System.out.println(arr.length); for
	 * (Object a : arr) { System.out.println(a); } }
	 */
	
	public static void main(String[] args) {
		List<String>names=Arrays.asList("A","B","C","D","1","2","3","4","E");
		
		
		Optional<String>S=names.stream().sorted().reduce((value,CombinedValUe)->{
			return value+CombinedValUe;
		});
		System.out.println(S.get());
		
		Object arr[]=names.stream().sorted(Comparator.reverseOrder()).toArray();
	//	System.out.println(arr.length);
		for(Object a:arr) {
			System.out.println(a);
		}
	}
}
