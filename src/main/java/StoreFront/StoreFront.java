package StoreFront;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class StoreFront {
	private Map<Product, Integer> productList;
	
	public StoreFront(Map<Product, Integer> productList) {
		this.productList = productList;
	}
	
	public Map<Product, Integer> getAvailableProducts() {
		return productList;
	}
	
	public void setAvailableProducts(Map<Product, Integer> productLists) {
		this.productList = productList;
	}
	
	public void addProduct(Product p) {
		this.productList.put(null, null);
	}
	
	public void removeProduct(Product p) {
		this.productList.remove(p);
	}

	@Override
	public String toString() {
		return "StoreFront [productList=" + productList + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoreFront other = (StoreFront) obj;
		return Objects.equals(productList, other.productList);
	}
	
	
}
