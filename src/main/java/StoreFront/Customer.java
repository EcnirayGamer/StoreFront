package StoreFront;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Customer {
	private String name;
	private double wallet;
	private List<String> groceryList;

	public Customer(String name, double wallet, List<String> groceryList) {
		this.name = name;
		this.wallet = wallet;
		this.groceryList = groceryList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	
	public List<String> getGroceryList() {
		return this.groceryList;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(wallet, name, groceryList);
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
		return Double.doubleToLongBits(wallet) == Double.doubleToLongBits(other.wallet)
				&& Objects.equals(name, other.name) && Objects.equals(groceryList, other.groceryList);
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + wallet + ", products=" + groceryList + "]";
	}
	
	
}
