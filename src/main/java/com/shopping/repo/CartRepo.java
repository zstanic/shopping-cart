package com.shopping.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shopping.model.Cart;

public interface CartRepo extends MongoRepository<Cart, String> {
	
	public Cart getByCustomerEcifId(String customerEcifId);

}
