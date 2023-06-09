package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<String> teamA=Arrays.asList("Scott","David","John");
		List<String> teamB=Arrays.asList("ABhishek","Gajanan","Vyawhare");
		List<String> teamC=Arrays.asList("Tanmay","Gajanan","Vyawhare");
		
		List<List<String>>finalList=new ArrayList<>();
		finalList.add(teamA);
		finalList.add(teamB);
		finalList.add(teamC);
		
		
	
		
//		for(List<String> s:finalList) {
//			for(String name:s) {
//				System.out.println(name);
//			}
//		}
		
		finalList.stream().flatMap(s->s.stream()).forEach(a->System.out.println(a));
		
	}
}
