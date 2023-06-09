package com.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class Bank {
	String name;
	int Amount;

	public Bank(String name, int amount) {
		super();
		this.name = name;
		Amount = amount;
	}

}

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Entries");
		int co = s.nextInt();
		List<Bank> al = new ArrayList<>();
//		al.add(new Bank("Abhishek", 50));
//		al.add(new Bank("Megs", 40));
//		al.add(new Bank("Avneet", 30));
//		al.add(new Bank("Raks", 20));

		// we will Set a Limit for Account
		System.out.println("Limit");
        int limit=s.nextInt();
        
		for (int i = 0; i < co; i++) {
			System.out.println("Enter Name");
			String name = s.next();
			System.out.println("Enter Paise");
			int Amount = s.nextInt();
			al.add(new Bank(name, Amount));
		}

		
		
		Function<Bank, Integer> emp = e -> {
			if (e.Amount > limit) {
				return 0;
			} else
				return (e.Amount * 20) / 100;
		};

		Predicate<Integer> P = e -> e < limit;
		System.out.println("name is:  " + " amount is: " + " GST added is: ");

		for (Bank Ba : al) {
			
			if (P.test(Ba.Amount)) {
				System.out.println(Ba.name + "          " + Ba.Amount + "       " +  emp.apply(Ba));
			}
		}

	}
}
