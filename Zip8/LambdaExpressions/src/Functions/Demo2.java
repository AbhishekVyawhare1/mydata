package Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int Salary;

	Employee(String name, int sal) {
		this.ename = name;
		this.Salary = sal;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("ABhishek", 40000));
		empList.add(new Employee("Vaishnavi", 30000));
		empList.add(new Employee("Vyawhare", 20000));

		Function<Employee, Integer> fn = e -> {
			if (e.Salary >= 10000 && e.Salary <= 20000)
				return (e.Salary * 10 / 100);
			else if (e.Salary > 20000 && e.Salary <= 30000)
				return (e.Salary * 20 / 100);
			else if (e.Salary > 30000 && e.Salary <= 40000)
				return (e.Salary * 30 / 100);
			else
				return (e.Salary * 40 / 100);
		};

		Predicate<Integer> b = a -> a > 5000;
		for (Employee emp : empList) {

			int bonus = fn.apply(emp);
			if (b.test(bonus)) {

				System.out.println(emp.ename + " " + emp.Salary);
				System.out.println(bonus);
			}
		}
	}
	

}
