package com.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Employee {
	String ename;
	int Salary;
	int experience;

	Employee(String name, int Sal, int exp) {
		ename = name;
		Salary = Sal;
		experience = exp;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		//Ex 1
		Employee emp = new Employee("Abhishek", 50000, 5); // emp is reference Variable

		//Ex 2
		// emp object------.return name if sal>30 && exp>3;

		Predicate<Employee> pr = a -> (a.Salary > 370000 && a.experience > 3);
		System.out.println(pr.test(emp));

		
		
		// Ex 3
//		ArrayList<Employee> al = new ArrayList<>();
//		al.add(new Employee("Abhishek", 800000, 4));
//		al.add(new Employee("Tanmay", 500000, 4));
//		al.add(new Employee("Megha", 700000, 3));
//		al.add(new Employee("Rakesh", 600000, 2));
//		al.add(new Employee("prat", 330000, 1));
//		
//		for(Employee a:al) {
//			if(pr.test(a)) {
//				System.out.println(a.ename+" "+a.Salary);
//			}
//		}

		 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Choice");
		int a=s.nextInt();
		List<Employee>al=new ArrayList<>();
		System.out.println("Insert ename experience Salary here");
	
		for(int i=1;i<=a;i++) {
			System.out.println("Ename");
			String ename=s.next();
			System.out.println("EXPERIENCE");
			int experience=s.nextInt();
			System.out.println("M");
			int Salary=s.nextInt();
			
			al.add(new Employee(ename,experience,Salary));
		}
		Predicate<Employee>em=e->(e.Salary>5000 && e.experience>1);
		for(Employee emp1:al) {
			if(em.test(emp1)) {
				System.out.println("Employee Name: "+emp1.ename+"/nEmployee exxpe "+emp1.experience+"/n Employee oagar "+emp1.Salary);
			}
		}
	              			
	}
}
