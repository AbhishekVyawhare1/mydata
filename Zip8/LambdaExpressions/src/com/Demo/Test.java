
package com.Demo;
interface Cab{
	public void bookCab();
}
public class Test {

	public static void main(String[] args) {
		Cab cab=()->System.out.println("can is booked at ");
		cab.bookCab();
	}
}

//  parent p=new child();  