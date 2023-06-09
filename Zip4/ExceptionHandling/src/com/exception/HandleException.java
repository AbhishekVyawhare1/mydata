package com.exception;

public class HandleException {

	
	public static void main(String[] args) {
		int a=100;
		try {
		System.out.println(a/0);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello Mot0");
	}
}
