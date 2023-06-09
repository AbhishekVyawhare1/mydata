package Consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	String Gender;

	Employee(String ename, int salary, String Gender) {
		this.ename = ename;
		this.salary = salary;
		this.Gender = Gender;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Abhishek", 40000, "Male"));
		emplist.add(new Employee("Avneet", 20000, "Male"));
		emplist.add(new Employee("Raghav", 30000, "Male"));
		emplist.add(new Employee("jenillia", 25000, "Male"));
		emplist.add(new Employee("Salman", 40050, "Male"));

		// Function
		Function<Employee, Integer> Fn = emp -> (emp.salary * 40) / 100;   //task1

		// Predicate
		Predicate<Integer> P = e -> e > 28000;       //task2

		//Consumer
		Consumer<Employee> c = emp -> {
			System.out.println(emp.ename);
			System.out.println(emp.Gender);
			System.out.println(emp.salary);

		};  //task3

		for (Employee g : emplist) {
			int bonus = Fn.apply(g);     //CAlculate Bonus Invoked Function

			if (P.test(bonus)) {          //Invoked Predicate
				c.accept(g);              //Invoked Consumer
				System.out.println("Employee Bonus for All"+bonus);
			}
		}

	}
}
