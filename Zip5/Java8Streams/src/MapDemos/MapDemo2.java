package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MapDemo2 {

//	public static void main(String[] args) {
//		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "electric bike");
//
////		for(String name:vehicles) {
////			System.out.println(name.length());
////		}
//
////		vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
//		vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));
//	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENter number:");
		int a=s.nextInt();
		List<String> names=new ArrayList<>();
		List<String> namescount=new ArrayList<>();
		System.out.println("Enter names");
		for(int i=0;i<=a;i++) {
			names.add(s.next());
		}
		for(String na:names) {
			System.out.println(na.length());
		}
	}
}
