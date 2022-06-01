package StoreFront;

import java.util.Objects;
import java.util.Set;

public class StoreFront {
	private Set<Product> productList;
	
	public StoreFront(Set<Product> productList) {
		this.productList = productList;
	}
	
	public Set<Product> getAvailableProducts() {
		return productList;
	}
	
	public void setProductList(Set<Product> productList) {
		this.productList = productList;
	}
	
	public void addProduct(Product p) {
		this.productList.add(p);
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
