package com.predicates;

import java.util.function.Predicate;

//Joining predicates--------> and, or, negate
//p1------>checks Number id Even
//p2------>checks greater than 50

public class Demo3 {
//
//	public static void main(String[] args) {
//
//		int arr[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 52, 60 };
//         Predicate<Integer> p1=a->(a%2==0);
//         Predicate<Integer> p2=b->(b>50);
//         
//         
//         
////         for(int a:arr) {
////        	 if(p1.and(p2).test(a)){     //if(p1.test(a) && p2.test(a)) 
////        		 System.out.println(a);
////        	 }
////         }
//         
//         for(int a:arr) {
//        	if(p1.or(p2).test(a)){// if(p1.test(a) || p2.test(a)) 
//        		 System.out.println(a);
//        	 }
//         }
//	}
//}
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 0, 100 };

		Predicate<Integer> p1 = a -> a % 2 == 0;
		Predicate<Integer> p2 = b -> b > 70;

		for(int a:arr) {
			if(p1.or(p2).test(a)) {
				System.out.println(a);
			}
		}
	}
}
