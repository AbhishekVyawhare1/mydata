package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List al = new ArrayList<>();

		// Add new elements to ArrayList
		al.add(10);
		al.add(10.5);
		al.add("Abhishek");
		al.add(293893298383l);
		al.add(83928398328323.2323d);

//
//		System.out.println(al);
//
//		// size()
//		System.out.println("Number of Elements in ArrayList" + al.size());
//
//		// remove()
//		System.out.println(al.remove(1));
//		System.out.println(al);
//
//		// insert a new Element
//		// al.add(index,Object);
//		al.add(1, "Java");
//		System.out.println(al);
//
//		// get():- retrive Specific elements
//		System.out.println(al.get(1));
//
//		
//		
//		// Change element /replace element:- set()
//		al.set(0, "Python");
//		System.out.println(al);
//
//		
//		
//		// Search -contains()
//		System.out.println(al.contains("ABhi"));
//		System.out.println(al.contains("Abhishek"));
//		
//		//isEmpty()
//		System.out.println(al.isEmpty());
//		
//		
//		//Ways to Retrive the imfomation
//		
//		
//	//1. forLoop() 
//		System.out.println("Reading elements Using ForLoop");
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}

//	//2. foreach()	
//		System.out.println("Reading elements Using foreach");
//		for (Object a:al) {
//			System.out.println(a);
//		}
//	
		// 3. iterator()
//		System.out.println("Reading elements Using iterator");

//		Iterator a=al.iterator();
//		while(a.hasNext()) {
//			System.out.println(a.next());
//		}

	}
}
