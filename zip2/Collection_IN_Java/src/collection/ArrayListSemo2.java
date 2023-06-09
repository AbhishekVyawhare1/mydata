package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSemo2 {

	
	public static void main(String[] args) {
		List al1=new ArrayList();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("1");
		al1.add("2");
		al1.add("3");
		
		System.out.println(al1);
		
		ArrayList al2=new ArrayList<>();
		
		//addAll()
		al2.addAll(al1);
		System.out.println(al2);
		
		
		//removeAll
		al2.removeAll(al1);
		System.out.println(al2);
		
		
		//sort-------Collections.sort()
		Collections.sort(al1);
		System.out.println(al1);
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		
		
		//Shuffling--------Collections.Shuffle
		Collections.shuffle(al1);
		System.out.println(al1);
	}
}
