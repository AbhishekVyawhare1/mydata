package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {

	String sname;
	int sid;
	char grade;

	Student(String sname, int sid, char grade) {
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
}

public class Demo3 {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student("Abhishek",1,'V'));
		stu.add(new Student("Tanmay",2,'V'));
		stu.add(new Student("Avneet",3,'K'));
		
		List<Student> stu1 = new ArrayList<Student>();
		stu.add(new Student("Abhishek1",11,'V'));
		stu.add(new Student("Tanmay1",21,'V'));
		stu.add(new Student("Avneet1",31,'K'));
		
		List<List<Student>>finalList=Arrays.asList(stu,stu1);
		
//		for(List<Student>s:finalList) {
//			for(Student name:s) {
//				System.out.println(name.sname+"      "+name.sid+"      "+name.grade);
//			}
//		}
		
		finalList.stream().flatMap(stulist->stulist.stream()).map(a->a.sname).forEach(a->System.out.println(a));
		
	}
}
