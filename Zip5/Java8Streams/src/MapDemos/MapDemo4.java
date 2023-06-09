package MapDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empid;
	String empname;
	long Salary;

	public Employee(int empid, String empname, long salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.Salary = salary;
	}

}

public class MapDemo4 {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee(100, "Abhishek", 2000000),
				new Employee(101, "Avneet", 34737), new Employee(102, "Shikar", 23434), new Employee(103, "Raju", 343),
				new Employee(104, "Raaghv", 22442), new Employee(105, "Shaakti", 2443));

//		List<Long> EMployeeSalList = employeeList.stream().filter(emp -> emp.Salary > 20000).map(emp -> emp.Salary)
//				.collect(Collectors.toList());
		
		employeeList.stream().filter(ep->ep.Salary>300000).map(ep->ep.Salary).forEach(System.out::println);
//		System.out.println(EMployeeSalList);

	}
}
