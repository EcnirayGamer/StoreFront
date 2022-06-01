package StoreFront;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
	private String name;
	private double amount;
	private List<Product> products;

	public Customer(String name) {
		this.name = name;
		this.amount = amount;
		List<Product> products = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Product> getALLProducts() {
		return products;
	}
	
//	public List<Product> getProduct(Product product){
//		for(Product p : products) 
//		return p;
//	}
//	
	
	@Override
	public int hashCode() {
		return Objects.hash(amount, name, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(name, other.name) && Objects.equals(products, other.products);
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + ", products=" + products + "]";
	}
	
	
}
