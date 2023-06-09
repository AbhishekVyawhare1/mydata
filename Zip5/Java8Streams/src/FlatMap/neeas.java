package FlatMap;

import java.util.Scanner;

public class neeas {
	public static void main(String[] args) {

		String str = "He is boy";

		String s1 = Arrays.stream(str.split(" ")).map(name -> new StringBuilder(name + " ").reverse())
				.collect(Collectors.joining());
		System.out.println(s1);
//		
		
//		String strn = "He is boy";
//		String words[]=str.split("\\s")
//				StringBuilder S=new StringBuilder(str);
//		System.out.println(S.reverse());
//		
//		String str = "He is boy";
//	    String words[]=str.split(" ");  
//	    String reverseWord="";  
//	    for(String w:words){  
//	        StringBuilder sb=new StringBuilder(w);  
//	        sb.reverse();  
//	        reverseWord+=sb.toString()+" ";  
//	    } 

		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String name=s.nextLine();
		String[] sentence=name.split(" ");
		
		for(String sa:sentence) {
			StringBuilder sa1=new StringBuilder(sa).reverse();
			System.out.print(sa1+" ");
		}
		
	}
}
