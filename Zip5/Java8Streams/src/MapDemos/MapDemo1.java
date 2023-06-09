package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MapDemo1 {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter CHoice");
//		int a = s.nextInt();
//		System.out.println("Enter names");
//
//		List<String> name = new ArrayList<>();
//
//		for (int i = 0; i < a; i++) {
//			name.add(s.next());
//		}
//
//		List<String> nameUpperList = new ArrayList<>();
//
//		nameUpperList = name.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
//
//		System.out.println(nameUpperList);
//
//	}

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("Enter Number");
//		List<String> name = new ArrayList<>();
//		int Num = s.nextInt();
//
//		for (int i = 1; i <= Num; i++) {
//			name.add(s.next());
//		}
//		List<String> nameUpperList = new ArrayList<>();
//		for (String n : name) {
//			nameUpperList.add(n.toUpperCase());
//		}
//		System.out.println(nameUpperList);
//	}

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter No");
		int a=s.nextInt();
		List<String> names=new ArrayList<>();
		List<String> namesCapital=new ArrayList<>();
		System.out.println("names");
		for(int i=0;i<=a;i++) {
			names.add(s.next());
		}
		for(String n:names) {
			namesCapital.add(n.toUpperCase());
		}
		System.out.println(namesCapital);
	}
}
//for(String n:name) {
//nameUpperList.add(n.toUpperCase());
//}
//System.out.println(nameUpperList);