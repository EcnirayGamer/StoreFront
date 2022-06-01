package com.fdm.services;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import StoreFront.Product;
import StoreFront.StoreFront;

public class Cashier {
	private final StoreFront storeFront;
	private static final Lock lock = new ReentrantLock();
	
	public Cashier(StoreFront storeFront) {
		this.storeFront = storeFront;
	}
 
	public void insertProduct(Product product){
		 	storeFront.addProduct(product);
	}
}
