package Functions;

import java.util.function.Function;

public class Demo3 {

	public static void main(String[] args) {
		Function<Integer,Integer> fn1=e->e*2;
		Function<Integer, Integer>fn2=e->e*e*e;
		
		System.out.println(fn1.andThen(fn2).apply(2));//4    64
		System.out.println(fn1.compose(fn2).apply(2));//8    16
	}
}
