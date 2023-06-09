package StreamsMathods2;

public class Child1 extends Parent1{

	int a=30;
	int b=40;
		
	public static void main(String[] args) {
		
		Parent1 p = new Child1();
		System.out.println(p.a);
		System.out.println(p.b);
		
	}
}