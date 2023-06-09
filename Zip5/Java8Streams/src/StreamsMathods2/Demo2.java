package StreamsMathods2;

import java.util.HashSet;
import java.util.Set;

//anyMatch()
//allMatch()
//noneMatch()
public class Demo2 {

	public static void main(String[] args) {

		Set<String> n = new HashSet();
		n.add("One Mango");
		n.add("One Banana");
		n.add("One Apple");
		n.add("One Grapes");
		n.add("pineapple One");
		n.add("PINeAPPLE");

		
		boolean a=n.stream().anyMatch((value1)->{
			return value1.startsWith("One");
		});
		
		
		System.out.println(a);
//		Set<String> n = new TreeSet();
//
//		n.add("One Mango");
//		n.add("One Banana");
//		n.add("One Apple");
//		n.add("One Grapes");
//		n.add("pineapple one");
//		n.add("PINeAPPLE");
//
//		boolean results = n.stream().anyMatch(value -> {
//			return value.startsWith("One Apple");
//		});
//		System.out.println(results);
	}
}
