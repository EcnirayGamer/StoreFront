package com.fdm.services;

import java.util.ArrayList;
import java.util.List;
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
	
	public Set<Product> getProducts() {
		return this.storeFront.getAvailableProducts();
	}
	
	public String checkoutCustomer(List<String> groceryList) {
		Set<Product> productList = this.getProducts();
		int size = productList.size();
		List<Product> basket = new ArrayList<>();	
		double total = 0;
		for (String p : groceryList) {
			System.out.println(p);
			for (int i = 0; i < size; i++) {
				
			}
		}
		System.out.println(basket);
		return ("Basket: " + basket + " - total: " + total);
	} 
	
}
