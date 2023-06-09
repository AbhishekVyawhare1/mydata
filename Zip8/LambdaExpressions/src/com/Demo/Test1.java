package com.Demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	int std;

	public Student(String name, int marks, int std) {
		super();
		this.name = name;
		this.marks = marks;
		this.std = std;
	}

}

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Ente");
		Scanner s = new Scanner(System.in);
		Set<Student> stu1 = new HashSet<Student>();
		int count = s.nextInt();
//		stu1.add(new Student("Abhishek", 80, 8));
//		stu1.add(new Student("Mega", 38, 5));
//		stu1.add(new Student("Rakesh", 49, 6));
//		stu1.add(new Student("Praths", 39, 11));

		for (int i = 0; i < count; i++) {
			System.out.println("Enter Name");
			String name = s.next();
			System.out.println("Enter Marks");
			int marks = s.nextInt();
			System.out.println("Enter Std");
			int std = s.nextInt();
 
			stu1.add(new Student(name, marks, std));

		}
		Function<Student, Integer> fn = e -> {
			if (e.marks > 35) {
//				 int std2=e.std + 1;
//				 return std2;
				return e.std + 1;
			} else {
				return 0;
			}

		};

		Predicate<Integer> p = a -> a > 35;

		for (Student am : stu1) {
			int a = fn.apply(am);
			if (p.test(am.marks)) {
				System.out.println(am.name + " " + am.marks + " " + am.std + " new std is: " + a);

			}
		}

	}
}
