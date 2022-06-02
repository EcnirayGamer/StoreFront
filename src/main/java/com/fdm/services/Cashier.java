package com.fdm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;

import StoreFront.Product;
import StoreFront.StoreFront;

public class Cashier {
	private final StoreFront storeFront;
	
	public Cashier(StoreFront storeFront) {
		this.storeFront = storeFront;
	}
 
	public void insertProduct(Product product){
		storeFront.addProduct(product);
	}
	
	public void desertProduct(Product product) {
		storeFront.removeProduct(product);
	}
	
	public Map<Product, Integer> getProducts() {
		return this.storeFront.getAvailableProducts();
	}
	
	public String checkoutCustomer(List<String> groceryList) {
		Map<Product, Integer> productList = this.getProducts();
		Set<Product> keys = productList.keySet();
		List<Product> basket = new ArrayList<>();	
		double total = 0;
		for (String p : groceryList) {
			for(Product key : keys){
				if(p.equals(key.getName())){
					if(productList.get(key) == 0){
						continue;
					} else{
						productList.put(key, productList.get(key) - 1);
						basket.add(key);
						total += key.getPrice();
					}

				}
			}
		}
		System.out.println(basket);
		return ("Basket: " + basket + " - total: " + total);
	} 
	
}
