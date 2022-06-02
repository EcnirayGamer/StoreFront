package StoreFront;
import java.util.*;

import com.fdm.services.Cashier;

public class Demo {
	public static void main(String[] args) {
		Product bread = new Product("Bread", 1.99, 1);
		Product cheese = new Product("Cheese", 2.99, 2);
		Product milk = new Product("Milk", 3.99, 3);

		Map<Product, Integer> productList = new HashMap<>();
		productList.put(bread, 4);
		productList.put(cheese, 3);
		productList.put(milk, 5);
		
		StoreFront storeFront = new StoreFront(productList);
		Cashier cashier = new Cashier(storeFront);
		
		List<String> groceryList = new ArrayList<>();
		groceryList.add("Milk");
		groceryList.add("Cheese");
		groceryList.add("Bread");
		
		Customer customer1 = new Customer("Dave", 100.00, groceryList);
		
		System.out.println(cashier.checkoutCustomer(customer1.getGroceryList()));
		
		//final List<Runnable> customers = Arrays.asList(
		//		new RunnableCustomer("Dave", 100.00, groceryList, cashier),
		//		new RunnableCustomer("Suvash", 1000.00, groceryList, cashier),
		//		new RunnableCustomer("Alex", 20.00, groceryList, cashier));

		

	}
}
