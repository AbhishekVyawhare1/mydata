package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	 int id;
	 String name;
	double Price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.Price = price;
	}

}

public class FilterDemo4 {

	public static void main(String[] args) {

//		List<Product> productList = new ArrayList<>();
//		
//		productList.add(new Product(1, "HP LAPTOP", 25000));
//		productList.add(new Product(2, "Dell LAPTOP", 30000));
//		productList.add(new Product(3, "Lenovo LAPTOP", 28000));
//		productList.add(new Product(4, "Apple LAPTOP", 90000));
//		productList.add(new Product(5, "MI LAPTOP", 25000));
//
//		productList.stream().filter(p->p.Price>25000).forEach(pr->System.out.println(pr.Price));
//		
		
		List<String>name=Arrays.asList("abhishek","vaihnavi","avneet");
		
		
		List<String>n=name.stream().map(a->a.substring(0,1).toUpperCase()+a.substring(1)).collect(Collectors.toList());
		System.out.println(n);
	}
	
}
