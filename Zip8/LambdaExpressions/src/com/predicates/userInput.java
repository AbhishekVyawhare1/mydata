package com.predicates;
import java.util.*;

class stu
{
	String name;
	int fee;
	int std;
	public stu(String name, int fee, int std) {
		super();
		this.name = name;
		this.fee = fee;
		this.std = std;
	}
	
	
}

public class userInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<stu> l= new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			String name= sc.next();
			int fee= sc.nextInt();
			int std= sc.nextInt();
			
			l.add(new stu(name,fee,std));
			
		}
		



	}

}
