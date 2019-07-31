package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.model.Cart;
import com.shopping.repo.CartRepo;

@Service
public class CartService {

	@Autowired
	private CartRepo repo;
		
	public List<Cart> getAll(){
		return repo.findAll();
	}
	
	public Cart getByCustomerEcifId(String customerEcifId) {
		return repo.getByCustomerEcifId(customerEcifId);
	}
	
	public void saveCart(Cart crt) {
		repo.save(crt);
	}
	
	public void deleteCart(Cart crt) {
		repo.delete(crt);
	}
}
