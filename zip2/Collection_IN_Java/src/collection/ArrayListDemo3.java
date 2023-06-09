package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String arr[] = { "Abhishek", "Gajanan", "Vyawhare" };
		for (Object a : arr) {
			System.out.println(a);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
