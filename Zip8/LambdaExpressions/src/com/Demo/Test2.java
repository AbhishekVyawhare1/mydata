package com.Demo;

interface cat {
	public String bookcab(String source, String Destination);
}

//class abhi implements cat {
//
//	@Override
//	public String bookcab(String source, String Destination) {
//		// TODO Auto-generated method stub
//		System.out.println(C);
//		return "@# RS";
//	}
//
//}

public class Test2 {

	public static void main(String[] args) {
		cat c = (source, Destination)->{
			System.out.println("Old Is Booked"+source+" "+Destination);
			return ("Abhisheksource");
		};
		System.out.println(c.bookcab("Kharadi", "NTS"));
	}
}
