package StoreFront;
import java.util.HashSet;
import java.util.Set;

import com.fdm.services.Cashier;

public class Demo {
	public static void main(String[] args) {
		Product p1 = new Product("Bread", 1.99, 1);
		Product p2 = new Product("Cheese", 2.99, 2);
		Product p3 = new Product("Milk", 3.99, 3);
		Set<Product> productList = new HashSet<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		StoreFront storeFront = new StoreFront(productList);
		Cashier cashier = new Cashier(storeFront);
		
		System.out.println(cashier.getProducts());
	}
}
