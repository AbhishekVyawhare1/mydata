package com.predicates;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		// Whenever we have Conditional Checks then only go for predicate

		// Ex 1
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(11));
		System.out.println(p.test(5));

		
		
		// Ex 2 Check the length of given String is greater than 4 or not
//		Predicate<String> PR = (a -> a.length() > 4);

		
		
//		System.out.println(PR.test("Abhishek"));
//		System.out.println(PR.test("ABHI"));

		// Ex 3 Print Array elements whose size is >4 array elements
		String names[] = { "Abhishek", "Scott", "Hello", "SID" };
		Predicate<String> PR = (a -> a.length() > 4);

		for (String name : names) 
		{
			if (PR.test(name)) 
			{
				System.out.println(name);
			}
			
		/*	if(name.length()>4) {
				System.out.println(name);
			}*/
		}


	
	}
}
