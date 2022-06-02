package StoreFront;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

import com.fdm.services.Cashier;

public class Demo {
	public static void main(String[] args) {
		Product b1 = new Product("Bread", 1.99, 1);
		Product b2 = new Product("Bread", 1.99, 1);
		Product b3 = new Product("Bread", 1.99, 1);
		Product b4 = new Product("Bread", 1.99, 1);
		Product c1 = new Product("Cheese", 2.99, 2);
		Product c2 = new Product("Cheese", 2.99, 2);
		Product c3 = new Product("Cheese", 2.99, 2);
		Product m1 = new Product("Milk", 3.99, 3);
		Product m2 = new Product("Milk", 3.99, 3);
		Product m3 = new Product("Milk", 3.99, 3);
		Product m4 = new Product("Milk", 3.99, 3);
		Product m5 = new Product("Milk", 3.99, 3);
		Set<Product> productList = new HashSet<>();
		productList.add(b1);
		productList.add(b2);
		productList.add(b3);
		productList.add(b4);
		productList.add(c1);
		productList.add(c2);
		productList.add(c3);
		productList.add(m1);
		productList.add(m2);
		productList.add(m3);
		productList.add(m4);
		productList.add(m5);
		
		Map<String, String> newMap;
		
		StoreFront storeFront = new StoreFront(productList);
		Cashier cashier = new Cashier(storeFront);
		
		List<String> groceryList = new ArrayList<>();
		groceryList.add("Milk");
		groceryList.add("Cheese");
		groceryList.add("Bread");
		
		Customer customer1 = new Customer("Dave", 100.00, groceryList);
		
		cashier.checkoutCustomer(customer1.getGroceryList());
		
		//final List<Runnable> customers = Arrays.asList(
		//		new RunnableCustomer("Dave", 100.00, groceryList, cashier),
		//		new RunnableCustomer("Suvash", 1000.00, groceryList, cashier),
		//		new RunnableCustomer("Alex", 20.00, groceryList, cashier));

		
		System.out.println(cashier.getProducts());
		System.out.println(productList);
	}
}
